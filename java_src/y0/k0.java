package y0;
/* loaded from: classes.dex */
public enum k0 {
    VERBOSE("V"),
    DEBUG("D"),
    INFO("I"),
    WARNING("W"),
    ERROR("E"),
    ASSERT("A"),
    WTF("F");
    

    /* renamed from: n  reason: collision with root package name */
    private final String f16551n;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16552a;

        static {
            int[] iArr = new int[k0.values().length];
            f16552a = iArr;
            try {
                iArr[k0.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16552a[k0.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16552a[k0.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16552a[k0.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16552a[k0.WTF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16552a[k0.DEBUG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16552a[k0.ASSERT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    k0(String str) {
        this.f16551n = str;
    }

    public static k0 e(char c10) {
        return c10 != 'A' ? c10 != 'I' ? c10 != 'E' ? c10 != 'F' ? c10 != 'V' ? c10 != 'W' ? DEBUG : WARNING : VERBOSE : WTF : ERROR : INFO : ASSERT;
    }

    public b g() {
        int i10 = a.f16552a[ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? b.Debug : b.Fatal : b.Error : b.Warning : b.Info : b.Trace;
    }
}
