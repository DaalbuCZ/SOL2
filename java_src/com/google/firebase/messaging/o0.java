package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.d;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0 extends a4.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: n  reason: collision with root package name */
    Bundle f5577n;

    /* renamed from: o  reason: collision with root package name */
    private Map<String, String> f5578o;

    /* renamed from: p  reason: collision with root package name */
    private c f5579p;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f5580a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f5581b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f5580a = bundle;
            this.f5581b = new m.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public o0 a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f5581b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f5580a);
            this.f5580a.remove("from");
            return new o0(bundle);
        }

        public b b(String str) {
            this.f5580a.putString("collapse_key", str);
            return this;
        }

        public b c(Map<String, String> map) {
            this.f5581b.clear();
            this.f5581b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.f5580a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f5580a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f5580a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f5582a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5583b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f5584c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5585d;

        /* renamed from: e  reason: collision with root package name */
        private final String f5586e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f5587f;

        /* renamed from: g  reason: collision with root package name */
        private final String f5588g;

        /* renamed from: h  reason: collision with root package name */
        private final String f5589h;

        /* renamed from: i  reason: collision with root package name */
        private final String f5590i;

        /* renamed from: j  reason: collision with root package name */
        private final String f5591j;

        /* renamed from: k  reason: collision with root package name */
        private final String f5592k;

        /* renamed from: l  reason: collision with root package name */
        private final String f5593l;

        /* renamed from: m  reason: collision with root package name */
        private final String f5594m;

        /* renamed from: n  reason: collision with root package name */
        private final Uri f5595n;

        /* renamed from: o  reason: collision with root package name */
        private final String f5596o;

        /* renamed from: p  reason: collision with root package name */
        private final Integer f5597p;

        /* renamed from: q  reason: collision with root package name */
        private final Integer f5598q;

        /* renamed from: r  reason: collision with root package name */
        private final Integer f5599r;

        /* renamed from: s  reason: collision with root package name */
        private final int[] f5600s;

        /* renamed from: t  reason: collision with root package name */
        private final Long f5601t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f5602u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f5603v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f5604w;

        /* renamed from: x  reason: collision with root package name */
        private final boolean f5605x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f5606y;

        /* renamed from: z  reason: collision with root package name */
        private final long[] f5607z;

        private c(j0 j0Var) {
            this.f5582a = j0Var.p("gcm.n.title");
            this.f5583b = j0Var.h("gcm.n.title");
            this.f5584c = j(j0Var, "gcm.n.title");
            this.f5585d = j0Var.p("gcm.n.body");
            this.f5586e = j0Var.h("gcm.n.body");
            this.f5587f = j(j0Var, "gcm.n.body");
            this.f5588g = j0Var.p("gcm.n.icon");
            this.f5590i = j0Var.o();
            this.f5591j = j0Var.p("gcm.n.tag");
            this.f5592k = j0Var.p("gcm.n.color");
            this.f5593l = j0Var.p("gcm.n.click_action");
            this.f5594m = j0Var.p("gcm.n.android_channel_id");
            this.f5595n = j0Var.f();
            this.f5589h = j0Var.p("gcm.n.image");
            this.f5596o = j0Var.p("gcm.n.ticker");
            this.f5597p = j0Var.b("gcm.n.notification_priority");
            this.f5598q = j0Var.b("gcm.n.visibility");
            this.f5599r = j0Var.b("gcm.n.notification_count");
            this.f5602u = j0Var.a("gcm.n.sticky");
            this.f5603v = j0Var.a("gcm.n.local_only");
            this.f5604w = j0Var.a("gcm.n.default_sound");
            this.f5605x = j0Var.a("gcm.n.default_vibrate_timings");
            this.f5606y = j0Var.a("gcm.n.default_light_settings");
            this.f5601t = j0Var.j("gcm.n.event_time");
            this.f5600s = j0Var.e();
            this.f5607z = j0Var.q();
        }

        private static String[] j(j0 j0Var, String str) {
            Object[] g10 = j0Var.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f5585d;
        }

        public String[] b() {
            return this.f5587f;
        }

        public String c() {
            return this.f5586e;
        }

        public String d() {
            return this.f5594m;
        }

        public String e() {
            return this.f5593l;
        }

        public String f() {
            return this.f5592k;
        }

        public String g() {
            return this.f5588g;
        }

        public Uri h() {
            String str = this.f5589h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f5595n;
        }

        public Integer k() {
            return this.f5599r;
        }

        public Integer l() {
            return this.f5597p;
        }

        public String m() {
            return this.f5590i;
        }

        public String n() {
            return this.f5591j;
        }

        public String o() {
            return this.f5596o;
        }

        public String p() {
            return this.f5582a;
        }

        public String[] q() {
            return this.f5584c;
        }

        public String r() {
            return this.f5583b;
        }

        public Integer s() {
            return this.f5598q;
        }
    }

    public o0(Bundle bundle) {
        this.f5577n = bundle;
    }

    private int C(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String D() {
        return this.f5577n.getString("message_type");
    }

    public c E() {
        if (this.f5579p == null && j0.t(this.f5577n)) {
            this.f5579p = new c(new j0(this.f5577n));
        }
        return this.f5579p;
    }

    public int F() {
        String string = this.f5577n.getString("google.original_priority");
        if (string == null) {
            string = this.f5577n.getString("google.priority");
        }
        return C(string);
    }

    public long G() {
        Object obj = this.f5577n.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
                return 0L;
            }
        }
        return 0L;
    }

    public String H() {
        return this.f5577n.getString("google.to");
    }

    public int I() {
        Object obj = this.f5577n.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Intent intent) {
        intent.putExtras(this.f5577n);
    }

    public String k() {
        return this.f5577n.getString("collapse_key");
    }

    public Map<String, String> s() {
        if (this.f5578o == null) {
            this.f5578o = d.a.a(this.f5577n);
        }
        return this.f5578o;
    }

    public String v() {
        return this.f5577n.getString("from");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p0.c(this, parcel, i10);
    }

    public String x() {
        String string = this.f5577n.getString("google.message_id");
        return string == null ? this.f5577n.getString("message_id") : string;
    }
}
