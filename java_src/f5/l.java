package f5;

import android.content.Context;
import android.text.TextUtils;
import d4.n;
import z3.o;
import z3.r;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f7259a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7260b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7261c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7262d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7263e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7264f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7265g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f7266a;

        /* renamed from: b  reason: collision with root package name */
        private String f7267b;

        /* renamed from: c  reason: collision with root package name */
        private String f7268c;

        /* renamed from: d  reason: collision with root package name */
        private String f7269d;

        /* renamed from: e  reason: collision with root package name */
        private String f7270e;

        /* renamed from: f  reason: collision with root package name */
        private String f7271f;

        /* renamed from: g  reason: collision with root package name */
        private String f7272g;

        public l a() {
            return new l(this.f7267b, this.f7266a, this.f7268c, this.f7269d, this.f7270e, this.f7271f, this.f7272g);
        }

        public b b(String str) {
            this.f7266a = o.f(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f7267b = o.f(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f7268c = str;
            return this;
        }

        public b e(String str) {
            this.f7269d = str;
            return this;
        }

        public b f(String str) {
            this.f7270e = str;
            return this;
        }

        public b g(String str) {
            this.f7272g = str;
            return this;
        }

        public b h(String str) {
            this.f7271f = str;
            return this;
        }
    }

    private l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.m(!n.a(str), "ApplicationId must be set.");
        this.f7260b = str;
        this.f7259a = str2;
        this.f7261c = str3;
        this.f7262d = str4;
        this.f7263e = str5;
        this.f7264f = str6;
        this.f7265g = str7;
    }

    public static l a(Context context) {
        r rVar = new r(context);
        String a10 = rVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new l(a10, rVar.a("google_api_key"), rVar.a("firebase_database_url"), rVar.a("ga_trackingId"), rVar.a("gcm_defaultSenderId"), rVar.a("google_storage_bucket"), rVar.a("project_id"));
    }

    public String b() {
        return this.f7259a;
    }

    public String c() {
        return this.f7260b;
    }

    public String d() {
        return this.f7261c;
    }

    public String e() {
        return this.f7262d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            return z3.n.a(this.f7260b, lVar.f7260b) && z3.n.a(this.f7259a, lVar.f7259a) && z3.n.a(this.f7261c, lVar.f7261c) && z3.n.a(this.f7262d, lVar.f7262d) && z3.n.a(this.f7263e, lVar.f7263e) && z3.n.a(this.f7264f, lVar.f7264f) && z3.n.a(this.f7265g, lVar.f7265g);
        }
        return false;
    }

    public String f() {
        return this.f7263e;
    }

    public String g() {
        return this.f7265g;
    }

    public String h() {
        return this.f7264f;
    }

    public int hashCode() {
        return z3.n.b(this.f7260b, this.f7259a, this.f7261c, this.f7262d, this.f7263e, this.f7264f, this.f7265g);
    }

    public String toString() {
        return z3.n.c(this).a("applicationId", this.f7260b).a("apiKey", this.f7259a).a("databaseUrl", this.f7261c).a("gcmSenderId", this.f7263e).a("storageBucket", this.f7264f).a("projectId", this.f7265g).toString();
    }
}
