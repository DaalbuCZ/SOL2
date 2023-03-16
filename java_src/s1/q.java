package s1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import s1.h;
/* loaded from: classes.dex */
public final class q extends l2 {

    /* renamed from: x  reason: collision with root package name */
    public static final h.a<q> f13678x = p.f13654a;

    /* renamed from: q  reason: collision with root package name */
    public final int f13679q;

    /* renamed from: r  reason: collision with root package name */
    public final String f13680r;

    /* renamed from: s  reason: collision with root package name */
    public final int f13681s;

    /* renamed from: t  reason: collision with root package name */
    public final m1 f13682t;

    /* renamed from: u  reason: collision with root package name */
    public final int f13683u;

    /* renamed from: v  reason: collision with root package name */
    public final u2.s f13684v;

    /* renamed from: w  reason: collision with root package name */
    final boolean f13685w;

    private q(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    private q(int i10, Throwable th, String str, int i11, String str2, int i12, m1 m1Var, int i13, boolean z10) {
        this(k(i10, str, str2, i12, m1Var, i13), th, i11, i10, str2, i12, m1Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    private q(Bundle bundle) {
        super(bundle);
        this.f13679q = bundle.getInt(l2.d(1001), 2);
        this.f13680r = bundle.getString(l2.d(1002));
        this.f13681s = bundle.getInt(l2.d(1003), -1);
        Bundle bundle2 = bundle.getBundle(l2.d(1004));
        this.f13682t = bundle2 == null ? null : m1.U.a(bundle2);
        this.f13683u = bundle.getInt(l2.d(1005), 4);
        this.f13685w = bundle.getBoolean(l2.d(1006), false);
        this.f13684v = null;
    }

    private q(String str, Throwable th, int i10, int i11, String str2, int i12, m1 m1Var, int i13, u2.s sVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        p3.a.a(!z10 || i11 == 1);
        p3.a.a((th != null || i11 == 3) ? true : z11);
        this.f13679q = i11;
        this.f13680r = str2;
        this.f13681s = i12;
        this.f13682t = m1Var;
        this.f13683u = i13;
        this.f13684v = sVar;
        this.f13685w = z10;
    }

    public static /* synthetic */ q e(Bundle bundle) {
        return new q(bundle);
    }

    public static q g(Throwable th, String str, int i10, m1 m1Var, int i11, boolean z10, int i12) {
        return new q(1, th, null, i12, str, i10, m1Var, m1Var == null ? 4 : i11, z10);
    }

    public static q h(IOException iOException, int i10) {
        return new q(0, iOException, i10);
    }

    @Deprecated
    public static q i(RuntimeException runtimeException) {
        return j(runtimeException, 1000);
    }

    public static q j(RuntimeException runtimeException, int i10) {
        return new q(2, runtimeException, i10);
    }

    private static String k(int i10, String str, String str2, int i11, m1 m1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + m1Var + ", format_supported=" + p3.m0.W(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q f(u2.s sVar) {
        return new q((String) p3.m0.j(getMessage()), getCause(), this.f13537n, this.f13679q, this.f13680r, this.f13681s, this.f13682t, this.f13683u, sVar, this.f13538o, this.f13685w);
    }
}
