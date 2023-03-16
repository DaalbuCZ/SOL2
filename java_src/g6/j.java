package g6;
/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: n  reason: collision with root package name */
        private final int f7569n;

        a(int i10) {
            this.f7569n = i10;
        }

        public int e() {
            return this.f7569n;
        }
    }

    a b(String str);
}
