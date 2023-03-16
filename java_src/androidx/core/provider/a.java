package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f1461a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1462b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0026a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g.c f1463n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Typeface f1464o;

        RunnableC0026a(g.c cVar, Typeface typeface) {
            this.f1463n = cVar;
            this.f1464o = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1463n.b(this.f1464o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g.c f1466n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f1467o;

        b(g.c cVar, int i10) {
            this.f1466n = cVar;
            this.f1467o = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1466n.a(this.f1467o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(g.c cVar, Handler handler) {
        this.f1461a = cVar;
        this.f1462b = handler;
    }

    private void a(int i10) {
        this.f1462b.post(new b(this.f1461a, i10));
    }

    private void c(Typeface typeface) {
        this.f1462b.post(new RunnableC0026a(this.f1461a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f1491a);
        } else {
            a(eVar.f1492b);
        }
    }
}
