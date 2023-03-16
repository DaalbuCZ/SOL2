package com.google.android.gms.common.api.internal;

import x3.a;
import x3.a.b;
/* loaded from: classes.dex */
public abstract class c<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final w3.d[] f3585a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3586b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3587c;

    /* loaded from: classes.dex */
    public static class a<A extends a.b, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        private y3.j<A, t4.j<ResultT>> f3588a;

        /* renamed from: c  reason: collision with root package name */
        private w3.d[] f3590c;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3589b = true;

        /* renamed from: d  reason: collision with root package name */
        private int f3591d = 0;

        /* synthetic */ a(y3.a0 a0Var) {
        }

        public c<A, ResultT> a() {
            z3.o.b(this.f3588a != null, "execute parameter required");
            return new s(this, this.f3590c, this.f3589b, this.f3591d);
        }

        public a<A, ResultT> b(y3.j<A, t4.j<ResultT>> jVar) {
            this.f3588a = jVar;
            return this;
        }

        public a<A, ResultT> c(boolean z10) {
            this.f3589b = z10;
            return this;
        }

        public a<A, ResultT> d(w3.d... dVarArr) {
            this.f3590c = dVarArr;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(w3.d[] dVarArr, boolean z10, int i10) {
        this.f3585a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f3586b = z11;
        this.f3587c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(A a10, t4.j<ResultT> jVar);

    public boolean c() {
        return this.f3586b;
    }

    public final int d() {
        return this.f3587c;
    }

    public final w3.d[] e() {
        return this.f3585a;
    }
}
