package kotlinx.coroutines.internal;

import b9.g;
import java.util.Objects;
import r9.f2;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f10926a = new e0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final j9.p<Object, g.b, Object> f10927b = a.f10930o;

    /* renamed from: c  reason: collision with root package name */
    private static final j9.p<f2<?>, g.b, f2<?>> f10928c = b.f10931o;

    /* renamed from: d  reason: collision with root package name */
    private static final j9.p<l0, g.b, l0> f10929d = c.f10932o;

    /* loaded from: classes.dex */
    static final class a extends k9.l implements j9.p<Object, g.b, Object> {

        /* renamed from: o  reason: collision with root package name */
        public static final a f10930o = new a();

        a() {
            super(2);
        }

        @Override // j9.p
        /* renamed from: a */
        public final Object k(Object obj, g.b bVar) {
            if (bVar instanceof f2) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends k9.l implements j9.p<f2<?>, g.b, f2<?>> {

        /* renamed from: o  reason: collision with root package name */
        public static final b f10931o = new b();

        b() {
            super(2);
        }

        @Override // j9.p
        /* renamed from: a */
        public final f2<?> k(f2<?> f2Var, g.b bVar) {
            if (f2Var != null) {
                return f2Var;
            }
            if (bVar instanceof f2) {
                return (f2) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends k9.l implements j9.p<l0, g.b, l0> {

        /* renamed from: o  reason: collision with root package name */
        public static final c f10932o = new c();

        c() {
            super(2);
        }

        @Override // j9.p
        /* renamed from: a */
        public final l0 k(l0 l0Var, g.b bVar) {
            if (bVar instanceof f2) {
                f2<?> f2Var = (f2) bVar;
                l0Var.a(f2Var, f2Var.o(l0Var.f10943a));
            }
            return l0Var;
        }
    }

    public static final void a(b9.g gVar, Object obj) {
        if (obj == f10926a) {
            return;
        }
        if (obj instanceof l0) {
            ((l0) obj).b(gVar);
            return;
        }
        Object S = gVar.S(null, f10928c);
        Objects.requireNonNull(S, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((f2) S).r(gVar, obj);
    }

    public static final Object b(b9.g gVar) {
        Object S = gVar.S(0, f10927b);
        k9.k.b(S);
        return S;
    }

    public static final Object c(b9.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f10926a : obj instanceof Integer ? gVar.S(new l0(gVar, ((Number) obj).intValue()), f10929d) : ((f2) obj).o(gVar);
    }
}
