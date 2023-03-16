package q5;
/* loaded from: classes.dex */
public enum t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: n  reason: collision with root package name */
    private final int f12875n;

    t(int i10) {
        this.f12875n = i10;
    }

    public static t e(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int g() {
        return this.f12875n;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f12875n);
    }
}
