package f7;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: n  reason: collision with root package name */
    public static final t f7334n;

    /* renamed from: o  reason: collision with root package name */
    public static final t f7335o;

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ t[] f7336p;

    /* loaded from: classes.dex */
    enum a extends t {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f7334n = aVar;
        t tVar = new t("STRING", 1) { // from class: f7.t.b
        };
        f7335o = tVar;
        f7336p = new t[]{aVar, tVar};
    }

    private t(String str, int i10) {
    }

    /* synthetic */ t(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f7336p.clone();
    }
}
