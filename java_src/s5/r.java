package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class r extends b0.e.d.a.b.AbstractC0207e {

    /* renamed from: a  reason: collision with root package name */
    private final String f14303a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14304b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> f14305c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0207e.AbstractC0208a {

        /* renamed from: a  reason: collision with root package name */
        private String f14306a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f14307b;

        /* renamed from: c  reason: collision with root package name */
        private c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> f14308c;

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0208a
        public b0.e.d.a.b.AbstractC0207e a() {
            String str = "";
            if (this.f14306a == null) {
                str = " name";
            }
            if (this.f14307b == null) {
                str = str + " importance";
            }
            if (this.f14308c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new r(this.f14306a, this.f14307b.intValue(), this.f14308c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0208a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0208a b(c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> c0Var) {
            Objects.requireNonNull(c0Var, "Null frames");
            this.f14308c = c0Var;
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0208a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0208a c(int i10) {
            this.f14307b = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.d.a.b.AbstractC0207e.AbstractC0208a
        public b0.e.d.a.b.AbstractC0207e.AbstractC0208a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f14306a = str;
            return this;
        }
    }

    private r(String str, int i10, c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> c0Var) {
        this.f14303a = str;
        this.f14304b = i10;
        this.f14305c = c0Var;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e
    public c0<b0.e.d.a.b.AbstractC0207e.AbstractC0209b> b() {
        return this.f14305c;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e
    public int c() {
        return this.f14304b;
    }

    @Override // s5.b0.e.d.a.b.AbstractC0207e
    public String d() {
        return this.f14303a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a.b.AbstractC0207e) {
            b0.e.d.a.b.AbstractC0207e abstractC0207e = (b0.e.d.a.b.AbstractC0207e) obj;
            return this.f14303a.equals(abstractC0207e.d()) && this.f14304b == abstractC0207e.c() && this.f14305c.equals(abstractC0207e.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f14303a.hashCode() ^ 1000003) * 1000003) ^ this.f14304b) * 1000003) ^ this.f14305c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f14303a + ", importance=" + this.f14304b + ", frames=" + this.f14305c + "}";
    }
}
