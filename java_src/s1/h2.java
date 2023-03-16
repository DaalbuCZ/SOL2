package s1;

import java.io.IOException;
/* loaded from: classes.dex */
public class h2 extends IOException {

    /* renamed from: n  reason: collision with root package name */
    public final boolean f13422n;

    /* renamed from: o  reason: collision with root package name */
    public final int f13423o;

    /* JADX INFO: Access modifiers changed from: protected */
    public h2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f13422n = z10;
        this.f13423o = i10;
    }

    public static h2 a(String str, Throwable th) {
        return new h2(str, th, true, 1);
    }

    public static h2 b(String str, Throwable th) {
        return new h2(str, th, true, 0);
    }

    public static h2 c(String str, Throwable th) {
        return new h2(str, th, true, 4);
    }

    public static h2 d(String str) {
        return new h2(str, null, false, 1);
    }
}
