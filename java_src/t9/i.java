package t9;
/* loaded from: classes.dex */
public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f14849a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private static final c f14850b = new c();

    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f14851a;

        public a(Throwable th) {
            this.f14851a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && k9.k.a(this.f14851a, ((a) obj).f14851a);
        }

        public int hashCode() {
            Throwable th = this.f14851a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // t9.i.c
        public String toString() {
            return "Closed(" + this.f14851a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(k9.g gVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return i.b(new a(th));
        }

        public final <E> Object b() {
            return i.b(i.f14850b);
        }

        public final <E> Object c(E e10) {
            return i.b(e10);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static <T> Object b(Object obj) {
        return obj;
    }
}
