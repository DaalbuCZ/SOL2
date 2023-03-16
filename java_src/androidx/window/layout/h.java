package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: a  reason: collision with root package name */
    private final WindowLayoutComponent f2440a;

    /* renamed from: b  reason: collision with root package name */
    private final ReentrantLock f2441b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Activity, a> f2442c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<androidx.core.util.a<v>, Activity> f2443d;

    @SuppressLint({"NewApi"})
    /* loaded from: classes.dex */
    private static final class a implements Consumer<WindowLayoutInfo> {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f2444a;

        /* renamed from: b  reason: collision with root package name */
        private final ReentrantLock f2445b;

        /* renamed from: c  reason: collision with root package name */
        private v f2446c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<androidx.core.util.a<v>> f2447d;

        public a(Activity activity) {
            k9.k.e(activity, "activity");
            this.f2444a = activity;
            this.f2445b = new ReentrantLock();
            this.f2447d = new LinkedHashSet();
        }

        @Override // j$.util.function.Consumer
        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k9.k.e(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f2445b;
            reentrantLock.lock();
            try {
                this.f2446c = i.f2448a.b(this.f2444a, windowLayoutInfo);
                Iterator<T> it = this.f2447d.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.a) it.next()).accept(this.f2446c);
                }
                y8.s sVar = y8.s.f17099a;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer<WindowLayoutInfo> andThen(Consumer<? super WindowLayoutInfo> consumer) {
            return Objects.requireNonNull(consumer);
        }

        public final void b(androidx.core.util.a<v> aVar) {
            k9.k.e(aVar, "listener");
            ReentrantLock reentrantLock = this.f2445b;
            reentrantLock.lock();
            try {
                v vVar = this.f2446c;
                if (vVar != null) {
                    aVar.accept(vVar);
                }
                this.f2447d.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean c() {
            return this.f2447d.isEmpty();
        }

        public final void d(androidx.core.util.a<v> aVar) {
            k9.k.e(aVar, "listener");
            ReentrantLock reentrantLock = this.f2445b;
            reentrantLock.lock();
            try {
                this.f2447d.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public h(WindowLayoutComponent windowLayoutComponent) {
        k9.k.e(windowLayoutComponent, "component");
        this.f2440a = windowLayoutComponent;
        this.f2441b = new ReentrantLock();
        this.f2442c = new LinkedHashMap();
        this.f2443d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.p
    public void a(androidx.core.util.a<v> aVar) {
        k9.k.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f2441b;
        reentrantLock.lock();
        try {
            Activity activity = this.f2443d.get(aVar);
            if (activity == null) {
                return;
            }
            a aVar2 = this.f2442c.get(activity);
            if (aVar2 == null) {
                return;
            }
            aVar2.d(aVar);
            if (aVar2.c()) {
                this.f2440a.removeWindowLayoutInfoListener(aVar2);
            }
            y8.s sVar = y8.s.f17099a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.p
    public void b(Activity activity, Executor executor, androidx.core.util.a<v> aVar) {
        y8.s sVar;
        k9.k.e(activity, "activity");
        k9.k.e(executor, "executor");
        k9.k.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f2441b;
        reentrantLock.lock();
        try {
            a aVar2 = this.f2442c.get(activity);
            if (aVar2 == null) {
                sVar = null;
            } else {
                aVar2.b(aVar);
                this.f2443d.put(aVar, activity);
                sVar = y8.s.f17099a;
            }
            if (sVar == null) {
                a aVar3 = new a(activity);
                this.f2442c.put(activity, aVar3);
                this.f2443d.put(aVar, activity);
                aVar3.b(aVar);
                this.f2440a.addWindowLayoutInfoListener(activity, aVar3);
            }
            y8.s sVar2 = y8.s.f17099a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
