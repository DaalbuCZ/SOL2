package j1;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f10223b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final e f10224a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f10225a = null;

        a() {
        }

        public b a() {
            return new b(this.f10225a);
        }

        public a b(e eVar) {
            this.f10225a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f10224a = eVar;
    }

    public static a b() {
        return new a();
    }

    @e6.d(tag = 1)
    public e a() {
        return this.f10224a;
    }
}
