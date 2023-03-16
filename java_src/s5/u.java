package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class u extends b0.e.d.AbstractC0211d {

    /* renamed from: a  reason: collision with root package name */
    private final String f14331a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.AbstractC0211d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f14332a;

        @Override // s5.b0.e.d.AbstractC0211d.a
        public b0.e.d.AbstractC0211d a() {
            String str = "";
            if (this.f14332a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new u(this.f14332a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.AbstractC0211d.a
        public b0.e.d.AbstractC0211d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f14332a = str;
            return this;
        }
    }

    private u(String str) {
        this.f14331a = str;
    }

    @Override // s5.b0.e.d.AbstractC0211d
    public String b() {
        return this.f14331a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.AbstractC0211d) {
            return this.f14331a.equals(((b0.e.d.AbstractC0211d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14331a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f14331a + "}";
    }
}
