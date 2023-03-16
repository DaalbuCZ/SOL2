package f7;

import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class u implements v {

    /* renamed from: n  reason: collision with root package name */
    public static final u f7337n;

    /* renamed from: o  reason: collision with root package name */
    public static final u f7338o;

    /* renamed from: p  reason: collision with root package name */
    public static final u f7339p;

    /* renamed from: q  reason: collision with root package name */
    public static final u f7340q;

    /* renamed from: r  reason: collision with root package name */
    private static final /* synthetic */ u[] f7341r;

    /* loaded from: classes.dex */
    enum a extends u {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // f7.v
        /* renamed from: g */
        public Double e(n7.a aVar) {
            return Double.valueOf(aVar.E());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f7337n = aVar;
        u uVar = new u("LAZILY_PARSED_NUMBER", 1) { // from class: f7.u.b
            @Override // f7.v
            public Number e(n7.a aVar2) {
                return new h7.g(aVar2.X());
            }
        };
        f7338o = uVar;
        u uVar2 = new u("LONG_OR_DOUBLE", 2) { // from class: f7.u.c
            @Override // f7.v
            public Number e(n7.a aVar2) {
                String X = aVar2.X();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(X));
                    } catch (NumberFormatException e10) {
                        throw new o("Cannot parse " + X + "; at path " + aVar2.z(), e10);
                    }
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(X);
                    if ((valueOf.isInfinite() || valueOf.isNaN()) && !aVar2.t()) {
                        throw new n7.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.z());
                    }
                    return valueOf;
                }
            }
        };
        f7339p = uVar2;
        u uVar3 = new u("BIG_DECIMAL", 3) { // from class: f7.u.d
            @Override // f7.v
            /* renamed from: g */
            public BigDecimal e(n7.a aVar2) {
                String X = aVar2.X();
                try {
                    return new BigDecimal(X);
                } catch (NumberFormatException e10) {
                    throw new o("Cannot parse " + X + "; at path " + aVar2.z(), e10);
                }
            }
        };
        f7340q = uVar3;
        f7341r = new u[]{aVar, uVar, uVar2, uVar3};
    }

    private u(String str, int i10) {
    }

    /* synthetic */ u(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f7341r.clone();
    }
}
