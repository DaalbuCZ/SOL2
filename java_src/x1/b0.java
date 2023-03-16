package x1;
/* loaded from: classes.dex */
public interface b0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f16189a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f16190b;

        public a(c0 c0Var) {
            this(c0Var, c0Var);
        }

        public a(c0 c0Var, c0 c0Var2) {
            this.f16189a = (c0) p3.a.e(c0Var);
            this.f16190b = (c0) p3.a.e(c0Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16189a.equals(aVar.f16189a) && this.f16190b.equals(aVar.f16190b);
        }

        public int hashCode() {
            return (this.f16189a.hashCode() * 31) + this.f16190b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f16189a);
            if (this.f16189a.equals(this.f16190b)) {
                str = "";
            } else {
                str = ", " + this.f16190b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f16191a;

        /* renamed from: b  reason: collision with root package name */
        private final a f16192b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f16191a = j10;
            this.f16192b = new a(j11 == 0 ? c0.f16193c : new c0(0L, j11));
        }

        @Override // x1.b0
        public boolean f() {
            return false;
        }

        @Override // x1.b0
        public a g(long j10) {
            return this.f16192b;
        }

        @Override // x1.b0
        public long h() {
            return this.f16191a;
        }
    }

    boolean f();

    a g(long j10);

    long h();
}
