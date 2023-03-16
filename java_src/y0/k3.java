package y0;
/* loaded from: classes.dex */
public class k3 {

    /* renamed from: d  reason: collision with root package name */
    public static final k3 f16553d = new b().d(false).b(false).a(0).c();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16554a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16555b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16556c;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f16557a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16558b;

        /* renamed from: c  reason: collision with root package name */
        private int f16559c;

        public b() {
        }

        public b(k3 k3Var) {
            k3Var = k3Var == null ? k3.f16553d : k3Var;
            this.f16557a = k3Var.c();
            this.f16559c = k3Var.a();
            this.f16558b = k3Var.b();
        }

        public b a(int i10) {
            this.f16559c = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f16557a = z10;
            return this;
        }

        public k3 c() {
            return new k3(this.f16557a, this.f16558b, this.f16559c);
        }

        public b d(boolean z10) {
            this.f16558b = z10;
            return this;
        }
    }

    private k3(boolean z10, boolean z11, int i10) {
        this.f16554a = z10;
        this.f16555b = z11;
        this.f16556c = i10;
    }

    public int a() {
        return this.f16556c;
    }

    public boolean b() {
        return this.f16555b;
    }

    public boolean c() {
        return this.f16554a;
    }
}
