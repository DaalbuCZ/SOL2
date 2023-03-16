package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class e extends b0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f14182a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14183b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f14184a;

        /* renamed from: b  reason: collision with root package name */
        private String f14185b;

        @Override // s5.b0.c.a
        public b0.c a() {
            String str = "";
            if (this.f14184a == null) {
                str = " key";
            }
            if (this.f14185b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new e(this.f14184a, this.f14185b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.c.a
        public b0.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f14184a = str;
            return this;
        }

        @Override // s5.b0.c.a
        public b0.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f14185b = str;
            return this;
        }
    }

    private e(String str, String str2) {
        this.f14182a = str;
        this.f14183b = str2;
    }

    @Override // s5.b0.c
    public String b() {
        return this.f14182a;
    }

    @Override // s5.b0.c
    public String c() {
        return this.f14183b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.c) {
            b0.c cVar = (b0.c) obj;
            return this.f14182a.equals(cVar.b()) && this.f14183b.equals(cVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14182a.hashCode() ^ 1000003) * 1000003) ^ this.f14183b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f14182a + ", value=" + this.f14183b + "}";
    }
}
