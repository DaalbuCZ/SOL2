package c9;

import b9.g;
import d9.h;
import d9.j;
import j9.p;
import k9.k;
import k9.u;
import y8.n;
import y8.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static final class a extends j {

        /* renamed from: o  reason: collision with root package name */
        private int f3242o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p f3243p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Object f3244q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b9.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f3243p = pVar;
            this.f3244q = obj;
            k.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // d9.a
        protected Object r(Object obj) {
            int i10 = this.f3242o;
            if (i10 == 0) {
                this.f3242o = 1;
                n.b(obj);
                k.c(this.f3243p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) u.a(this.f3243p, 2)).k(this.f3244q, this);
            } else if (i10 == 1) {
                this.f3242o = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d9.d {

        /* renamed from: q  reason: collision with root package name */
        private int f3245q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ p f3246r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Object f3247s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b9.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f3246r = pVar;
            this.f3247s = obj;
            k.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // d9.a
        protected Object r(Object obj) {
            int i10 = this.f3245q;
            if (i10 == 0) {
                this.f3245q = 1;
                n.b(obj);
                k.c(this.f3246r, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) u.a(this.f3246r, 2)).k(this.f3247s, this);
            } else if (i10 == 1) {
                this.f3245q = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> b9.d<s> a(p<? super R, ? super b9.d<? super T>, ? extends Object> pVar, R r10, b9.d<? super T> dVar) {
        k.e(pVar, "<this>");
        k.e(dVar, "completion");
        b9.d<?> a10 = h.a(dVar);
        if (pVar instanceof d9.a) {
            return ((d9.a) pVar).o(r10, a10);
        }
        g b10 = a10.b();
        return b10 == b9.h.f2971n ? new a(a10, pVar, r10) : new b(a10, b10, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> b9.d<T> b(b9.d<? super T> dVar) {
        b9.d<T> dVar2;
        k.e(dVar, "<this>");
        d9.d dVar3 = dVar instanceof d9.d ? (d9.d) dVar : null;
        return (dVar3 == null || (dVar2 = (b9.d<T>) dVar3.u()) == null) ? dVar : dVar2;
    }
}
