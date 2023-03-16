package j0;

import android.app.Activity;
import androidx.window.layout.q;
import androidx.window.layout.v;
import b9.d;
import d9.f;
import d9.k;
import j9.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import r9.h;
import r9.i1;
import r9.j0;
import r9.k0;
import r9.p1;
import u9.b;
import u9.c;
import y8.n;
import y8.s;
/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: b  reason: collision with root package name */
    private final q f10207b;

    /* renamed from: c  reason: collision with root package name */
    private final ReentrantLock f10208c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<androidx.core.util.a<?>, p1> f10209d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0141a extends k implements p<j0, d<? super s>, Object> {

        /* renamed from: r  reason: collision with root package name */
        int f10210r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ b<T> f10211s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ androidx.core.util.a<T> f10212t;

        /* renamed from: j0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0142a implements c<T> {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f10213n;

            public C0142a(androidx.core.util.a aVar) {
                this.f10213n = aVar;
            }

            @Override // u9.c
            public Object a(T t10, d<? super s> dVar) {
                this.f10213n.accept(t10);
                return s.f17099a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0141a(b<? extends T> bVar, androidx.core.util.a<T> aVar, d<? super C0141a> dVar) {
            super(2, dVar);
            this.f10211s = bVar;
            this.f10212t = aVar;
        }

        @Override // d9.a
        public final d<s> o(Object obj, d<?> dVar) {
            return new C0141a(this.f10211s, this.f10212t, dVar);
        }

        @Override // d9.a
        public final Object r(Object obj) {
            Object c10;
            c10 = c9.d.c();
            int i10 = this.f10210r;
            if (i10 == 0) {
                n.b(obj);
                b<T> bVar = this.f10211s;
                C0142a c0142a = new C0142a(this.f10212t);
                this.f10210r = 1;
                if (bVar.a(c0142a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                n.b(obj);
            }
            return s.f17099a;
        }

        @Override // j9.p
        /* renamed from: v */
        public final Object k(j0 j0Var, d<? super s> dVar) {
            return ((C0141a) o(j0Var, dVar)).r(s.f17099a);
        }
    }

    public a(q qVar) {
        k9.k.e(qVar, "tracker");
        this.f10207b = qVar;
        this.f10208c = new ReentrantLock();
        this.f10209d = new LinkedHashMap();
    }

    private final <T> void b(Executor executor, androidx.core.util.a<T> aVar, b<? extends T> bVar) {
        p1 b10;
        ReentrantLock reentrantLock = this.f10208c;
        reentrantLock.lock();
        try {
            if (this.f10209d.get(aVar) == null) {
                j0 a10 = k0.a(i1.a(executor));
                Map<androidx.core.util.a<?>, p1> map = this.f10209d;
                b10 = h.b(a10, null, null, new C0141a(bVar, aVar, null), 3, null);
                map.put(aVar, b10);
            }
            s sVar = s.f17099a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void d(androidx.core.util.a<?> aVar) {
        ReentrantLock reentrantLock = this.f10208c;
        reentrantLock.lock();
        try {
            p1 p1Var = this.f10209d.get(aVar);
            if (p1Var != null) {
                p1.a.a(p1Var, null, 1, null);
            }
            this.f10209d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.q
    public b<v> a(Activity activity) {
        k9.k.e(activity, "activity");
        return this.f10207b.a(activity);
    }

    public final void c(Activity activity, Executor executor, androidx.core.util.a<v> aVar) {
        k9.k.e(activity, "activity");
        k9.k.e(executor, "executor");
        k9.k.e(aVar, "consumer");
        b(executor, aVar, this.f10207b.a(activity));
    }

    public final void e(androidx.core.util.a<v> aVar) {
        k9.k.e(aVar, "consumer");
        d(aVar);
    }
}
