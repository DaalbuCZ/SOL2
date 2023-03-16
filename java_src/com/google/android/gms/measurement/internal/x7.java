package com.google.android.gms.measurement.internal;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import s3.a;
/* loaded from: classes.dex */
public final class x7 extends q8 {

    /* renamed from: d  reason: collision with root package name */
    private final Map f5184d;

    /* renamed from: e  reason: collision with root package name */
    public final p3 f5185e;

    /* renamed from: f  reason: collision with root package name */
    public final p3 f5186f;

    /* renamed from: g  reason: collision with root package name */
    public final p3 f5187g;

    /* renamed from: h  reason: collision with root package name */
    public final p3 f5188h;

    /* renamed from: i  reason: collision with root package name */
    public final p3 f5189i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7(a9 a9Var) {
        super(a9Var);
        this.f5184d = new HashMap();
        s3 F = this.f4438a.F();
        F.getClass();
        this.f5185e = new p3(F, "last_delete_stale", 0L);
        s3 F2 = this.f4438a.F();
        F2.getClass();
        this.f5186f = new p3(F2, "backoff", 0L);
        s3 F3 = this.f4438a.F();
        F3.getClass();
        this.f5187g = new p3(F3, "last_upload", 0L);
        s3 F4 = this.f4438a.F();
        F4.getClass();
        this.f5188h = new p3(F4, "last_upload_attempt", 0L);
        s3 F5 = this.f4438a.F();
        F5.getClass();
        this.f5189i = new p3(F5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.q8
    protected final boolean l() {
        return false;
    }

    @Deprecated
    final Pair m(String str) {
        w7 w7Var;
        a.C0194a a10;
        h();
        long b10 = this.f4438a.e().b();
        w7 w7Var2 = (w7) this.f5184d.get(str);
        if (w7Var2 == null || b10 >= w7Var2.f5165c) {
            s3.a.b(true);
            long r10 = b10 + this.f4438a.z().r(str, u2.f5041c);
            try {
                a10 = s3.a.a(this.f4438a.c());
            } catch (Exception e10) {
                this.f4438a.d().q().b("Unable to get advertising id", e10);
                w7Var = new w7("", false, r10);
            }
            if (a10 == null) {
                return new Pair("", Boolean.FALSE);
            }
            String a11 = a10.a();
            w7Var = a11 != null ? new w7(a11, a10.b(), r10) : new w7("", a10.b(), r10);
            this.f5184d.put(str, w7Var);
            s3.a.b(false);
            return new Pair(w7Var.f5163a, Boolean.valueOf(w7Var.f5164b));
        }
        return new Pair(w7Var2.f5163a, Boolean.valueOf(w7Var2.f5164b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair n(String str, p4.b bVar) {
        return bVar.i(p4.a.AD_STORAGE) ? m(str) : new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String o(String str, boolean z10) {
        h();
        String str2 = z10 ? (String) m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest t10 = i9.t();
        if (t10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, t10.digest(str2.getBytes())));
    }
}
