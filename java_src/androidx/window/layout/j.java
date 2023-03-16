package androidx.window.layout;
/* loaded from: classes.dex */
public interface j extends e {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0047a f2449b = new C0047a(null);

        /* renamed from: c  reason: collision with root package name */
        public static final a f2450c = new a("NONE");

        /* renamed from: d  reason: collision with root package name */
        public static final a f2451d = new a("FULL");

        /* renamed from: a  reason: collision with root package name */
        private final String f2452a;

        /* renamed from: androidx.window.layout.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0047a {
            private C0047a() {
            }

            public /* synthetic */ C0047a(k9.g gVar) {
                this();
            }
        }

        private a(String str) {
            this.f2452a = str;
        }

        public String toString() {
            return this.f2452a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f2453b = new a(null);

        /* renamed from: c  reason: collision with root package name */
        public static final b f2454c = new b("FLAT");

        /* renamed from: d  reason: collision with root package name */
        public static final b f2455d = new b("HALF_OPENED");

        /* renamed from: a  reason: collision with root package name */
        private final String f2456a;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(k9.g gVar) {
                this();
            }
        }

        private b(String str) {
            this.f2456a = str;
        }

        public String toString() {
            return this.f2456a;
        }
    }

    b f();

    a g();
}
