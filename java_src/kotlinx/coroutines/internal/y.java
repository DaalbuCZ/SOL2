package kotlinx.coroutines.internal;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    static final class a extends k9.l implements j9.l<Throwable, y8.s> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ j9.l<E, y8.s> f10978o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ E f10979p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ b9.g f10980q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(j9.l<? super E, y8.s> lVar, E e10, b9.g gVar) {
            super(1);
            this.f10978o = lVar;
            this.f10979p = e10;
            this.f10980q = gVar;
        }

        public final void a(Throwable th) {
            y.b(this.f10978o, this.f10979p, this.f10980q);
        }

        @Override // j9.l
        public /* bridge */ /* synthetic */ y8.s c(Throwable th) {
            a(th);
            return y8.s.f17099a;
        }
    }

    public static final <E> j9.l<Throwable, y8.s> a(j9.l<? super E, y8.s> lVar, E e10, b9.g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(j9.l<? super E, y8.s> lVar, E e10, b9.g gVar) {
        m0 c10 = c(lVar, e10, null);
        if (c10 != null) {
            r9.g0.a(gVar, c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> m0 c(j9.l<? super E, y8.s> lVar, E e10, m0 m0Var) {
        try {
            lVar.c(e10);
        } catch (Throwable th) {
            if (m0Var == null || m0Var.getCause() == th) {
                return new m0("Exception in undelivered element handler for " + e10, th);
            }
            y8.b.a(m0Var, th);
        }
        return m0Var;
    }

    public static /* synthetic */ m0 d(j9.l lVar, Object obj, m0 m0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            m0Var = null;
        }
        return c(lVar, obj, m0Var);
    }
}
