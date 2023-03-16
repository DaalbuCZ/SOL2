package s1;
/* loaded from: classes.dex */
public final class k1 extends RuntimeException {

    /* renamed from: n  reason: collision with root package name */
    public final int f13525n;

    public k1(int i10) {
        super(a(i10));
        this.f13525n = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
