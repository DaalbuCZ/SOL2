package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import k5.e;
import k5.f0;
import k5.h;
import k5.r;
import k9.k;
import r9.d0;
import r9.i1;
import z8.j;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* loaded from: classes.dex */
    public static final class a<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f5430a = new a<>();

        @Override // k5.h
        /* renamed from: b */
        public final d0 a(e eVar) {
            Object h10 = eVar.h(f0.a(j5.a.class, Executor.class));
            k.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return i1.a((Executor) h10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f5431a = new b<>();

        @Override // k5.h
        /* renamed from: b */
        public final d0 a(e eVar) {
            Object h10 = eVar.h(f0.a(j5.c.class, Executor.class));
            k.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return i1.a((Executor) h10);
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final c<T> f5432a = new c<>();

        @Override // k5.h
        /* renamed from: b */
        public final d0 a(e eVar) {
            Object h10 = eVar.h(f0.a(j5.b.class, Executor.class));
            k.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return i1.a((Executor) h10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final d<T> f5433a = new d<>();

        @Override // k5.h
        /* renamed from: b */
        public final d0 a(e eVar) {
            Object h10 = eVar.h(f0.a(j5.d.class, Executor.class));
            k.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return i1.a((Executor) h10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k5.c<?>> getComponents() {
        List<k5.c<?>> f10;
        k5.c d10 = k5.c.e(f0.a(j5.a.class, d0.class)).b(r.k(f0.a(j5.a.class, Executor.class))).f(a.f5430a).d();
        k.d(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        k5.c d11 = k5.c.e(f0.a(j5.c.class, d0.class)).b(r.k(f0.a(j5.c.class, Executor.class))).f(b.f5431a).d();
        k.d(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        k5.c d12 = k5.c.e(f0.a(j5.b.class, d0.class)).b(r.k(f0.a(j5.b.class, Executor.class))).f(c.f5432a).d();
        k.d(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        k5.c d13 = k5.c.e(f0.a(j5.d.class, d0.class)).b(r.k(f0.a(j5.d.class, Executor.class))).f(d.f5433a).d();
        k.d(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f10 = j.f(c7.h.b("fire-core-ktx", "20.3.0"), d10, d11, d12, d13);
        return f10;
    }
}
