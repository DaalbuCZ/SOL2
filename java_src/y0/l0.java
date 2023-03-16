package y0;
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private g0 f16561a;

    /* renamed from: b  reason: collision with root package name */
    private String f16562b;

    /* renamed from: c  reason: collision with root package name */
    private String f16563c;

    public l0(g0 g0Var, String str, String str2) {
        b(g0Var, str, str2);
        this.f16561a = g0Var;
        this.f16562b = str;
        this.f16563c = str2;
    }

    private void b(g0 g0Var, String str, String str2) {
        l3.a(g0Var, "Application must be not null");
        l3.a(str, "Version name must be not null");
        l3.a(str2, "Version code must be not null");
    }

    public static l0 d(g0 g0Var, String str, String str2) {
        return new l0(g0Var, str, str2);
    }

    public g0 a() {
        return this.f16561a;
    }

    public String c() {
        return this.f16563c;
    }

    public String e() {
        return this.f16562b;
    }
}
