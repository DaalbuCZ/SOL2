package androidx.window.layout;

import android.app.Activity;
/* loaded from: classes.dex */
public final class s implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final a f2496d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final x f2497b;

    /* renamed from: c  reason: collision with root package name */
    private final p f2498c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }
    }

    @d9.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends d9.k implements j9.p<u9.c<? super v>, b9.d<? super y8.s>, Object> {

        /* renamed from: r  reason: collision with root package name */
        Object f2499r;

        /* renamed from: s  reason: collision with root package name */
        Object f2500s;

        /* renamed from: t  reason: collision with root package name */
        int f2501t;

        /* renamed from: u  reason: collision with root package name */
        private /* synthetic */ Object f2502u;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ Activity f2504w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, b9.d<? super b> dVar) {
            super(2, dVar);
            this.f2504w = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(t9.f fVar, v vVar) {
            k9.k.d(vVar, "info");
            fVar.a(vVar);
        }

        @Override // d9.a
        public final b9.d<y8.s> o(Object obj, b9.d<?> dVar) {
            b bVar = new b(this.f2504w, dVar);
            bVar.f2502u = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:17:0x0061, B:21:0x0073, B:23:0x007b), top: B:36:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:36:0x0061). Please submit an issue!!! */
        @Override // d9.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object r(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = c9.b.c()
                int r1 = r9.f2501t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.f2500s
                t9.g r1 = (t9.g) r1
                java.lang.Object r4 = r9.f2499r
                androidx.core.util.a r4 = (androidx.core.util.a) r4
                java.lang.Object r5 = r9.f2502u
                u9.c r5 = (u9.c) r5
                y8.n.b(r10)     // Catch: java.lang.Throwable -> La0
                r10 = r5
                goto L60
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.f2500s
                t9.g r1 = (t9.g) r1
                java.lang.Object r4 = r9.f2499r
                androidx.core.util.a r4 = (androidx.core.util.a) r4
                java.lang.Object r5 = r9.f2502u
                u9.c r5 = (u9.c) r5
                y8.n.b(r10)     // Catch: java.lang.Throwable -> La0
                r6 = r5
                r5 = r9
                goto L73
            L39:
                y8.n.b(r10)
                java.lang.Object r10 = r9.f2502u
                u9.c r10 = (u9.c) r10
                r1 = 10
                t9.e r4 = t9.e.DROP_OLDEST
                r5 = 4
                r6 = 0
                t9.f r1 = t9.h.b(r1, r4, r6, r5, r6)
                androidx.window.layout.t r4 = new androidx.window.layout.t
                r4.<init>()
                androidx.window.layout.s r5 = androidx.window.layout.s.this
                androidx.window.layout.p r5 = androidx.window.layout.s.b(r5)
                android.app.Activity r6 = r9.f2504w
                androidx.window.layout.u r7 = androidx.window.layout.u.f2506n
                r5.b(r6, r7, r4)
                t9.g r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
            L60:
                r5 = r9
            L61:
                r5.f2502u = r10     // Catch: java.lang.Throwable -> L9e
                r5.f2499r = r4     // Catch: java.lang.Throwable -> L9e
                r5.f2500s = r1     // Catch: java.lang.Throwable -> L9e
                r5.f2501t = r3     // Catch: java.lang.Throwable -> L9e
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L9e
                if (r6 != r0) goto L70
                return r0
            L70:
                r8 = r6
                r6 = r10
                r10 = r8
            L73:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L9e
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L9e
                if (r10 == 0) goto L92
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L9e
                androidx.window.layout.v r10 = (androidx.window.layout.v) r10     // Catch: java.lang.Throwable -> L9e
                r5.f2502u = r6     // Catch: java.lang.Throwable -> L9e
                r5.f2499r = r4     // Catch: java.lang.Throwable -> L9e
                r5.f2500s = r1     // Catch: java.lang.Throwable -> L9e
                r5.f2501t = r2     // Catch: java.lang.Throwable -> L9e
                java.lang.Object r10 = r6.a(r10, r5)     // Catch: java.lang.Throwable -> L9e
                if (r10 != r0) goto L90
                return r0
            L90:
                r10 = r6
                goto L61
            L92:
                androidx.window.layout.s r10 = androidx.window.layout.s.this
                androidx.window.layout.p r10 = androidx.window.layout.s.b(r10)
                r10.a(r4)
                y8.s r10 = y8.s.f17099a
                return r10
            L9e:
                r10 = move-exception
                goto La2
            La0:
                r10 = move-exception
                r5 = r9
            La2:
                androidx.window.layout.s r0 = androidx.window.layout.s.this
                androidx.window.layout.p r0 = androidx.window.layout.s.b(r0)
                r0.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.s.b.r(java.lang.Object):java.lang.Object");
        }

        @Override // j9.p
        /* renamed from: w */
        public final Object k(u9.c<? super v> cVar, b9.d<? super y8.s> dVar) {
            return ((b) o(cVar, dVar)).r(y8.s.f17099a);
        }
    }

    public s(x xVar, p pVar) {
        k9.k.e(xVar, "windowMetricsCalculator");
        k9.k.e(pVar, "windowBackend");
        this.f2497b = xVar;
        this.f2498c = pVar;
    }

    @Override // androidx.window.layout.q
    public u9.b<v> a(Activity activity) {
        k9.k.e(activity, "activity");
        return u9.d.a(new b(activity, null));
    }
}
