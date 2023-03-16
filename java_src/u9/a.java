package u9;

import y8.s;
/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @d9.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0223a extends d9.d {

        /* renamed from: q  reason: collision with root package name */
        Object f15482q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f15483r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ a<T> f15484s;

        /* renamed from: t  reason: collision with root package name */
        int f15485t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0223a(a<T> aVar, b9.d<? super C0223a> dVar) {
            super(dVar);
            this.f15484s = aVar;
        }

        @Override // d9.a
        public final Object r(Object obj) {
            this.f15483r = obj;
            this.f15485t |= Integer.MIN_VALUE;
            return this.f15484s.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // u9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(u9.c<? super T> r6, b9.d<? super y8.s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u9.a.C0223a
            if (r0 == 0) goto L13
            r0 = r7
            u9.a$a r0 = (u9.a.C0223a) r0
            int r1 = r0.f15485t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15485t = r1
            goto L18
        L13:
            u9.a$a r0 = new u9.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15483r
            java.lang.Object r1 = c9.b.c()
            int r2 = r0.f15485t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f15482q
            v9.c r6 = (v9.c) r6
            y8.n.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            y8.n.b(r7)
            v9.c r7 = new v9.c
            b9.g r2 = r0.b()
            r7.<init>(r6, r2)
            r0.f15482q = r7     // Catch: java.lang.Throwable -> L55
            r0.f15485t = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.t()
            y8.s r6 = y8.s.f17099a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.t()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.a(u9.c, b9.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, b9.d<? super s> dVar);
}
