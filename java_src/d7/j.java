package d7;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final long f6605a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6606b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f6607a = 60;

        /* renamed from: b  reason: collision with root package name */
        private long f6608b = com.google.firebase.remoteconfig.internal.j.f5861j;

        public j c() {
            return new j(this);
        }

        public b d(long j10) {
            if (j10 >= 0) {
                this.f6607a = j10;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f6608b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private j(b bVar) {
        this.f6605a = bVar.f6607a;
        this.f6606b = bVar.f6608b;
    }
}
