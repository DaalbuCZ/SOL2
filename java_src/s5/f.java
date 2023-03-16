package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class f extends b0.d {

    /* renamed from: a  reason: collision with root package name */
    private final c0<b0.d.b> f14186a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14187b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.d.a {

        /* renamed from: a  reason: collision with root package name */
        private c0<b0.d.b> f14188a;

        /* renamed from: b  reason: collision with root package name */
        private String f14189b;

        @Override // s5.b0.d.a
        public b0.d a() {
            String str = "";
            if (this.f14188a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new f(this.f14188a, this.f14189b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.d.a
        public b0.d.a b(c0<b0.d.b> c0Var) {
            Objects.requireNonNull(c0Var, "Null files");
            this.f14188a = c0Var;
            return this;
        }

        @Override // s5.b0.d.a
        public b0.d.a c(String str) {
            this.f14189b = str;
            return this;
        }
    }

    private f(c0<b0.d.b> c0Var, String str) {
        this.f14186a = c0Var;
        this.f14187b = str;
    }

    @Override // s5.b0.d
    public c0<b0.d.b> b() {
        return this.f14186a;
    }

    @Override // s5.b0.d
    public String c() {
        return this.f14187b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.d) {
            b0.d dVar = (b0.d) obj;
            if (this.f14186a.equals(dVar.b())) {
                String str = this.f14187b;
                String c10 = dVar.c();
                if (str == null) {
                    if (c10 == null) {
                        return true;
                    }
                } else if (str.equals(c10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f14186a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14187b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f14186a + ", orgId=" + this.f14187b + "}";
    }
}
