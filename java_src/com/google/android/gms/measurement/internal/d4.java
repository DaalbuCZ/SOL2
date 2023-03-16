package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.cf;
import com.google.android.gms.internal.measurement.dc;
import com.google.android.gms.internal.measurement.ze;
import com.google.android.gms.measurement.internal.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class d4 extends q8 implements g {

    /* renamed from: d  reason: collision with root package name */
    private final Map f4463d;

    /* renamed from: e  reason: collision with root package name */
    final Map f4464e;

    /* renamed from: f  reason: collision with root package name */
    final Map f4465f;

    /* renamed from: g  reason: collision with root package name */
    final Map f4466g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f4467h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f4468i;

    /* renamed from: j  reason: collision with root package name */
    final m.e f4469j;

    /* renamed from: k  reason: collision with root package name */
    final ze f4470k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f4471l;

    /* renamed from: m  reason: collision with root package name */
    private final Map f4472m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f4473n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d4(a9 a9Var) {
        super(a9Var);
        this.f4463d = new m.a();
        this.f4464e = new m.a();
        this.f4465f = new m.a();
        this.f4466g = new m.a();
        this.f4467h = new m.a();
        this.f4471l = new m.a();
        this.f4472m = new m.a();
        this.f4473n = new m.a();
        this.f4468i = new m.a();
        this.f4469j = new a4(this, 20);
        this.f4470k = new b4(this);
    }

    private final com.google.android.gms.internal.measurement.e4 m(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.e4.K();
        }
        try {
            com.google.android.gms.internal.measurement.e4 e4Var = (com.google.android.gms.internal.measurement.e4) ((com.google.android.gms.internal.measurement.d4) c9.C(com.google.android.gms.internal.measurement.e4.I(), bArr)).q();
            this.f4438a.d().v().c("Parsed config. version, gmp_app_id", e4Var.V() ? Long.valueOf(e4Var.G()) : null, e4Var.U() ? e4Var.L() : null);
            return e4Var;
        } catch (com.google.android.gms.internal.measurement.r9 | RuntimeException e10) {
            this.f4438a.d().w().c("Unable to merge remote config. appId", f3.z(str), e10);
            return com.google.android.gms.internal.measurement.e4.K();
        }
    }

    private final void n(String str, com.google.android.gms.internal.measurement.d4 d4Var) {
        HashSet hashSet = new HashSet();
        m.a aVar = new m.a();
        m.a aVar2 = new m.a();
        m.a aVar3 = new m.a();
        for (com.google.android.gms.internal.measurement.a4 a4Var : d4Var.E()) {
            hashSet.add(a4Var.F());
        }
        for (int i10 = 0; i10 < d4Var.w(); i10++) {
            com.google.android.gms.internal.measurement.b4 b4Var = (com.google.android.gms.internal.measurement.b4) d4Var.x(i10).A();
            if (b4Var.z().isEmpty()) {
                this.f4438a.d().w().a("EventConfig contained null event name");
            } else {
                String z10 = b4Var.z();
                String b10 = p4.q.b(b4Var.z());
                if (!TextUtils.isEmpty(b10)) {
                    b4Var.x(b10);
                    d4Var.A(i10, b4Var);
                }
                if (b4Var.D() && b4Var.A()) {
                    aVar.put(z10, Boolean.TRUE);
                }
                if (b4Var.E() && b4Var.C()) {
                    aVar2.put(b4Var.z(), Boolean.TRUE);
                }
                if (b4Var.F()) {
                    if (b4Var.w() < 2 || b4Var.w() > 65535) {
                        this.f4438a.d().w().c("Invalid sampling rate. Event name, sample rate", b4Var.z(), Integer.valueOf(b4Var.w()));
                    } else {
                        aVar3.put(b4Var.z(), Integer.valueOf(b4Var.w()));
                    }
                }
            }
        }
        this.f4464e.put(str, hashSet);
        this.f4465f.put(str, aVar);
        this.f4466g.put(str, aVar2);
        this.f4468i.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0122: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x0122 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d4.o(java.lang.String):void");
    }

    private final void p(final String str, com.google.android.gms.internal.measurement.e4 e4Var) {
        if (e4Var.E() == 0) {
            this.f4469j.e(str);
            return;
        }
        this.f4438a.d().v().b("EES programs found", Integer.valueOf(e4Var.E()));
        com.google.android.gms.internal.measurement.t5 t5Var = (com.google.android.gms.internal.measurement.t5) e4Var.P().get(0);
        try {
            com.google.android.gms.internal.measurement.c1 c1Var = new com.google.android.gms.internal.measurement.c1();
            c1Var.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.y3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new dc("internal.remoteConfig", new c4(d4.this, str));
                }
            });
            c1Var.d("internal.appMetadata", new Callable() { // from class: p4.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final d4 d4Var = d4.this;
                    final String str2 = str;
                    return new cf("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.x3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            d4 d4Var2 = d4.this;
                            String str3 = str2;
                            m5 R = d4Var2.f4898b.W().R(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            d4Var2.f4438a.z().q();
                            hashMap.put("gmp_version", 74029L);
                            if (R != null) {
                                String g02 = R.g0();
                                if (g02 != null) {
                                    hashMap.put("app_version", g02);
                                }
                                hashMap.put("app_version_int", Long.valueOf(R.L()));
                                hashMap.put("dynamite_version", Long.valueOf(R.U()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c1Var.d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.z3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new bf(d4.this.f4470k);
                }
            });
            c1Var.c(t5Var);
            this.f4469j.d(str, c1Var);
            this.f4438a.d().v().c("EES program loaded for appId, activities", str, Integer.valueOf(t5Var.E().E()));
            for (com.google.android.gms.internal.measurement.r5 r5Var : t5Var.E().H()) {
                this.f4438a.d().v().b("EES program activity", r5Var.F());
            }
        } catch (com.google.android.gms.internal.measurement.c2 unused) {
            this.f4438a.d().r().b("Failed to load EES program. appId", str);
        }
    }

    private static final Map q(com.google.android.gms.internal.measurement.e4 e4Var) {
        m.a aVar = new m.a();
        if (e4Var != null) {
            for (com.google.android.gms.internal.measurement.i4 i4Var : e4Var.Q()) {
                aVar.put(i4Var.F(), i4Var.G());
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.c1 s(d4 d4Var, String str) {
        d4Var.i();
        z3.o.e(str);
        if (d4Var.C(str)) {
            if (!d4Var.f4467h.containsKey(str) || d4Var.f4467h.get(str) == null) {
                d4Var.o(str);
            } else {
                d4Var.p(str, (com.google.android.gms.internal.measurement.e4) d4Var.f4467h.get(str));
            }
            return (com.google.android.gms.internal.measurement.c1) d4Var.f4469j.h().get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str) {
        h();
        this.f4467h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean B(String str) {
        h();
        com.google.android.gms.internal.measurement.e4 t10 = t(str);
        if (t10 == null) {
            return false;
        }
        return t10.T();
    }

    public final boolean C(String str) {
        com.google.android.gms.internal.measurement.e4 e4Var;
        return (TextUtils.isEmpty(str) || (e4Var = (com.google.android.gms.internal.measurement.e4) this.f4467h.get(str)) == null || e4Var.E() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean D(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean E(String str, String str2) {
        Boolean bool;
        h();
        o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f4466g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F(String str, String str2) {
        Boolean bool;
        h();
        o(str);
        if (D(str) && i9.W(str2)) {
            return true;
        }
        if (G(str) && i9.X(str2)) {
            return true;
        }
        Map map = (Map) this.f4465f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        i();
        h();
        z3.o.e(str);
        com.google.android.gms.internal.measurement.d4 d4Var = (com.google.android.gms.internal.measurement.d4) m(str, bArr).A();
        n(str, d4Var);
        p(str, (com.google.android.gms.internal.measurement.e4) d4Var.q());
        this.f4467h.put(str, (com.google.android.gms.internal.measurement.e4) d4Var.q());
        this.f4471l.put(str, d4Var.C());
        this.f4472m.put(str, str2);
        this.f4473n.put(str, str3);
        this.f4463d.put(str, q((com.google.android.gms.internal.measurement.e4) d4Var.q()));
        this.f4898b.W().n(str, new ArrayList(d4Var.D()));
        try {
            d4Var.z();
            bArr = ((com.google.android.gms.internal.measurement.e4) d4Var.q()).i();
        } catch (RuntimeException e10) {
            this.f4438a.d().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", f3.z(str), e10);
        }
        l W = this.f4898b.W();
        z3.o.e(str);
        W.h();
        W.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (W.f4438a.z().B(null, u2.f5070q0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (W.P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                W.f4438a.d().r().b("Failed to update remote config (got 0). appId", f3.z(str));
            }
        } catch (SQLiteException e11) {
            W.f4438a.d().r().c("Error storing remote config. appId", f3.z(str), e11);
        }
        this.f4467h.put(str, (com.google.android.gms.internal.measurement.e4) d4Var.q());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean I(String str) {
        h();
        o(str);
        return this.f4464e.get(str) != null && ((Set) this.f4464e.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean J(String str) {
        h();
        o(str);
        return this.f4464e.get(str) != null && (((Set) this.f4464e.get(str)).contains("device_model") || ((Set) this.f4464e.get(str)).contains("device_info"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(String str) {
        h();
        o(str);
        return this.f4464e.get(str) != null && ((Set) this.f4464e.get(str)).contains("enhanced_user_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(String str) {
        h();
        o(str);
        return this.f4464e.get(str) != null && ((Set) this.f4464e.get(str)).contains("google_signals");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str) {
        h();
        o(str);
        return this.f4464e.get(str) != null && (((Set) this.f4464e.get(str)).contains("os_version") || ((Set) this.f4464e.get(str)).contains("device_info"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str) {
        h();
        o(str);
        return this.f4464e.get(str) != null && ((Set) this.f4464e.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.g
    public final String a(String str, String str2) {
        h();
        o(str);
        Map map = (Map) this.f4463d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.q8
    protected final boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int r(String str, String str2) {
        Integer num;
        h();
        o(str);
        Map map = (Map) this.f4468i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.e4 t(String str) {
        i();
        h();
        z3.o.e(str);
        o(str);
        return (com.google.android.gms.internal.measurement.e4) this.f4467h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String u(String str) {
        h();
        return (String) this.f4473n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String v(String str) {
        h();
        return (String) this.f4472m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String w(String str) {
        h();
        o(str);
        return (String) this.f4471l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set y(String str) {
        h();
        o(str);
        return (Set) this.f4464e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(String str) {
        h();
        this.f4472m.put(str, null);
    }
}
