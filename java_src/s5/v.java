package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class v extends b0.e.AbstractC0212e {

    /* renamed from: a  reason: collision with root package name */
    private final int f14333a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14334b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14335c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14336d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.AbstractC0212e.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f14337a;

        /* renamed from: b  reason: collision with root package name */
        private String f14338b;

        /* renamed from: c  reason: collision with root package name */
        private String f14339c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f14340d;

        @Override // s5.b0.e.AbstractC0212e.a
        public b0.e.AbstractC0212e a() {
            String str = "";
            if (this.f14337a == null) {
                str = " platform";
            }
            if (this.f14338b == null) {
                str = str + " version";
            }
            if (this.f14339c == null) {
                str = str + " buildVersion";
            }
            if (this.f14340d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new v(this.f14337a.intValue(), this.f14338b, this.f14339c, this.f14340d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.AbstractC0212e.a
        public b0.e.AbstractC0212e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f14339c = str;
            return this;
        }

        @Override // s5.b0.e.AbstractC0212e.a
        public b0.e.AbstractC0212e.a c(boolean z10) {
            this.f14340d = Boolean.valueOf(z10);
            return this;
        }

        @Override // s5.b0.e.AbstractC0212e.a
        public b0.e.AbstractC0212e.a d(int i10) {
            this.f14337a = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.AbstractC0212e.a
        public b0.e.AbstractC0212e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f14338b = str;
            return this;
        }
    }

    private v(int i10, String str, String str2, boolean z10) {
        this.f14333a = i10;
        this.f14334b = str;
        this.f14335c = str2;
        this.f14336d = z10;
    }

    @Override // s5.b0.e.AbstractC0212e
    public String b() {
        return this.f14335c;
    }

    @Override // s5.b0.e.AbstractC0212e
    public int c() {
        return this.f14333a;
    }

    @Override // s5.b0.e.AbstractC0212e
    public String d() {
        return this.f14334b;
    }

    @Override // s5.b0.e.AbstractC0212e
    public boolean e() {
        return this.f14336d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.AbstractC0212e) {
            b0.e.AbstractC0212e abstractC0212e = (b0.e.AbstractC0212e) obj;
            return this.f14333a == abstractC0212e.c() && this.f14334b.equals(abstractC0212e.d()) && this.f14335c.equals(abstractC0212e.b()) && this.f14336d == abstractC0212e.e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f14333a ^ 1000003) * 1000003) ^ this.f14334b.hashCode()) * 1000003) ^ this.f14335c.hashCode()) * 1000003) ^ (this.f14336d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f14333a + ", version=" + this.f14334b + ", buildVersion=" + this.f14335c + ", jailbroken=" + this.f14336d + "}";
    }
}
