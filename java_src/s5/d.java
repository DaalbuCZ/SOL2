package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class d extends b0.a.AbstractC0197a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14176a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14177b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14178c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.a.AbstractC0197a.AbstractC0198a {

        /* renamed from: a  reason: collision with root package name */
        private String f14179a;

        /* renamed from: b  reason: collision with root package name */
        private String f14180b;

        /* renamed from: c  reason: collision with root package name */
        private String f14181c;

        @Override // s5.b0.a.AbstractC0197a.AbstractC0198a
        public b0.a.AbstractC0197a a() {
            String str = "";
            if (this.f14179a == null) {
                str = " arch";
            }
            if (this.f14180b == null) {
                str = str + " libraryName";
            }
            if (this.f14181c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new d(this.f14179a, this.f14180b, this.f14181c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.a.AbstractC0197a.AbstractC0198a
        public b0.a.AbstractC0197a.AbstractC0198a b(String str) {
            Objects.requireNonNull(str, "Null arch");
            this.f14179a = str;
            return this;
        }

        @Override // s5.b0.a.AbstractC0197a.AbstractC0198a
        public b0.a.AbstractC0197a.AbstractC0198a c(String str) {
            Objects.requireNonNull(str, "Null buildId");
            this.f14181c = str;
            return this;
        }

        @Override // s5.b0.a.AbstractC0197a.AbstractC0198a
        public b0.a.AbstractC0197a.AbstractC0198a d(String str) {
            Objects.requireNonNull(str, "Null libraryName");
            this.f14180b = str;
            return this;
        }
    }

    private d(String str, String str2, String str3) {
        this.f14176a = str;
        this.f14177b = str2;
        this.f14178c = str3;
    }

    @Override // s5.b0.a.AbstractC0197a
    public String b() {
        return this.f14176a;
    }

    @Override // s5.b0.a.AbstractC0197a
    public String c() {
        return this.f14178c;
    }

    @Override // s5.b0.a.AbstractC0197a
    public String d() {
        return this.f14177b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.a.AbstractC0197a) {
            b0.a.AbstractC0197a abstractC0197a = (b0.a.AbstractC0197a) obj;
            return this.f14176a.equals(abstractC0197a.b()) && this.f14177b.equals(abstractC0197a.d()) && this.f14178c.equals(abstractC0197a.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f14176a.hashCode() ^ 1000003) * 1000003) ^ this.f14177b.hashCode()) * 1000003) ^ this.f14178c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f14176a + ", libraryName=" + this.f14177b + ", buildId=" + this.f14178c + "}";
    }
}
