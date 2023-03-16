package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a  reason: collision with root package name */
    final String f4330a;

    /* renamed from: b  reason: collision with root package name */
    final Uri f4331b;

    /* renamed from: c  reason: collision with root package name */
    final String f4332c;

    /* renamed from: d  reason: collision with root package name */
    final String f4333d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f4334e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f4335f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f4336g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4337h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    final h7 f4338i;

    public z6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private z6(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable h7 h7Var) {
        this.f4330a = null;
        this.f4331b = uri;
        this.f4332c = "";
        this.f4333d = "";
        this.f4334e = z10;
        this.f4335f = false;
        this.f4336g = z12;
        this.f4337h = false;
        this.f4338i = null;
    }

    public final z6 a() {
        return new z6(null, this.f4331b, this.f4332c, this.f4333d, this.f4334e, false, true, false, null);
    }

    public final z6 b() {
        if (this.f4332c.isEmpty()) {
            return new z6(null, this.f4331b, this.f4332c, this.f4333d, true, false, this.f4336g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final d7 c(String str, double d10) {
        return new x6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final d7 d(String str, long j10) {
        return new v6(this, str, Long.valueOf(j10), true);
    }

    public final d7 e(String str, String str2) {
        return new y6(this, str, str2, true);
    }

    public final d7 f(String str, boolean z10) {
        return new w6(this, str, Boolean.valueOf(z10), true);
    }
}
