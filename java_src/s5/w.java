package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class w extends b0.e.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f14341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f14342a;

        @Override // s5.b0.e.f.a
        public b0.e.f a() {
            String str = "";
            if (this.f14342a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new w(this.f14342a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.f.a
        public b0.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f14342a = str;
            return this;
        }
    }

    private w(String str) {
        this.f14341a = str;
    }

    @Override // s5.b0.e.f
    public String b() {
        return this.f14341a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.f) {
            return this.f14341a.equals(((b0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14341a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f14341a + "}";
    }
}
