package r9;
/* loaded from: classes.dex */
public enum l0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13139a;

        static {
            int[] iArr = new int[l0.values().length];
            iArr[l0.DEFAULT.ordinal()] = 1;
            iArr[l0.ATOMIC.ordinal()] = 2;
            iArr[l0.UNDISPATCHED.ordinal()] = 3;
            iArr[l0.LAZY.ordinal()] = 4;
            f13139a = iArr;
        }
    }

    public final <R, T> void g(j9.p<? super R, ? super b9.d<? super T>, ? extends Object> pVar, R r10, b9.d<? super T> dVar) {
        int i10 = a.f13139a[ordinal()];
        if (i10 == 1) {
            w9.a.d(pVar, r10, dVar, null, 4, null);
        } else if (i10 == 2) {
            b9.f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            w9.b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new y8.k();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
