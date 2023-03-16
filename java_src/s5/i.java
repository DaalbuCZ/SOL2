package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class i extends b0.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14216a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14217b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14218c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.a.b f14219d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14220e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14221f;

    /* renamed from: g  reason: collision with root package name */
    private final String f14222g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.a.AbstractC0199a {

        /* renamed from: a  reason: collision with root package name */
        private String f14223a;

        /* renamed from: b  reason: collision with root package name */
        private String f14224b;

        /* renamed from: c  reason: collision with root package name */
        private String f14225c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.a.b f14226d;

        /* renamed from: e  reason: collision with root package name */
        private String f14227e;

        /* renamed from: f  reason: collision with root package name */
        private String f14228f;

        /* renamed from: g  reason: collision with root package name */
        private String f14229g;

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a a() {
            String str = "";
            if (this.f14223a == null) {
                str = " identifier";
            }
            if (this.f14224b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f14223a, this.f14224b, this.f14225c, this.f14226d, this.f14227e, this.f14228f, this.f14229g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a.AbstractC0199a b(String str) {
            this.f14228f = str;
            return this;
        }

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a.AbstractC0199a c(String str) {
            this.f14229g = str;
            return this;
        }

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a.AbstractC0199a d(String str) {
            this.f14225c = str;
            return this;
        }

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a.AbstractC0199a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f14223a = str;
            return this;
        }

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a.AbstractC0199a f(String str) {
            this.f14227e = str;
            return this;
        }

        @Override // s5.b0.e.a.AbstractC0199a
        public b0.e.a.AbstractC0199a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f14224b = str;
            return this;
        }
    }

    private i(String str, String str2, String str3, b0.e.a.b bVar, String str4, String str5, String str6) {
        this.f14216a = str;
        this.f14217b = str2;
        this.f14218c = str3;
        this.f14219d = bVar;
        this.f14220e = str4;
        this.f14221f = str5;
        this.f14222g = str6;
    }

    @Override // s5.b0.e.a
    public String b() {
        return this.f14221f;
    }

    @Override // s5.b0.e.a
    public String c() {
        return this.f14222g;
    }

    @Override // s5.b0.e.a
    public String d() {
        return this.f14218c;
    }

    @Override // s5.b0.e.a
    public String e() {
        return this.f14216a;
    }

    public boolean equals(Object obj) {
        String str;
        b0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.a) {
            b0.e.a aVar = (b0.e.a) obj;
            if (this.f14216a.equals(aVar.e()) && this.f14217b.equals(aVar.h()) && ((str = this.f14218c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f14219d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f14220e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f14221f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
                String str4 = this.f14222g;
                String c10 = aVar.c();
                if (str4 == null) {
                    if (c10 == null) {
                        return true;
                    }
                } else if (str4.equals(c10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // s5.b0.e.a
    public String f() {
        return this.f14220e;
    }

    @Override // s5.b0.e.a
    public b0.e.a.b g() {
        return this.f14219d;
    }

    @Override // s5.b0.e.a
    public String h() {
        return this.f14217b;
    }

    public int hashCode() {
        int hashCode = (((this.f14216a.hashCode() ^ 1000003) * 1000003) ^ this.f14217b.hashCode()) * 1000003;
        String str = this.f14218c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        b0.e.a.b bVar = this.f14219d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f14220e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14221f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f14222g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f14216a + ", version=" + this.f14217b + ", displayVersion=" + this.f14218c + ", organization=" + this.f14219d + ", installationUuid=" + this.f14220e + ", developmentPlatform=" + this.f14221f + ", developmentPlatformVersion=" + this.f14222g + "}";
    }
}
