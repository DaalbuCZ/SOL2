package androidx.activity;

import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f403a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayDeque<b> f404b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    private class LifecycleOnBackPressedCancellable implements g, androidx.activity.a {

        /* renamed from: n  reason: collision with root package name */
        private final e f405n;

        /* renamed from: o  reason: collision with root package name */
        private final b f406o;

        /* renamed from: p  reason: collision with root package name */
        private androidx.activity.a f407p;

        LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f405n = eVar;
            this.f406o = bVar;
            eVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f405n.c(this);
            this.f406o.e(this);
            androidx.activity.a aVar = this.f407p;
            if (aVar != null) {
                aVar.cancel();
                this.f407p = null;
            }
        }

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.b bVar) {
            if (bVar == e.b.ON_START) {
                this.f407p = OnBackPressedDispatcher.this.b(this.f406o);
            } else if (bVar != e.b.ON_STOP) {
                if (bVar == e.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f407p;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: n  reason: collision with root package name */
        private final b f409n;

        a(b bVar) {
            this.f409n = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f404b.remove(this.f409n);
            this.f409n.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f403a = runnable;
    }

    public void a(i iVar, b bVar) {
        e a10 = iVar.a();
        if (a10.b() == e.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(a10, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f404b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f404b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f403a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
