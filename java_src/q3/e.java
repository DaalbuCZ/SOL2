package q3;

import java.util.Arrays;
/* loaded from: classes.dex */
final class e {

    /* renamed from: c  reason: collision with root package name */
    private boolean f12575c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12576d;

    /* renamed from: f  reason: collision with root package name */
    private int f12578f;

    /* renamed from: a  reason: collision with root package name */
    private a f12573a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f12574b = new a();

    /* renamed from: e  reason: collision with root package name */
    private long f12577e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12579a;

        /* renamed from: b  reason: collision with root package name */
        private long f12580b;

        /* renamed from: c  reason: collision with root package name */
        private long f12581c;

        /* renamed from: d  reason: collision with root package name */
        private long f12582d;

        /* renamed from: e  reason: collision with root package name */
        private long f12583e;

        /* renamed from: f  reason: collision with root package name */
        private long f12584f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f12585g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f12586h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f12583e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f12584f / j10;
        }

        public long b() {
            return this.f12584f;
        }

        public boolean d() {
            long j10 = this.f12582d;
            if (j10 == 0) {
                return false;
            }
            return this.f12585g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f12582d > 15 && this.f12586h == 0;
        }

        public void f(long j10) {
            int i10;
            long j11 = this.f12582d;
            if (j11 == 0) {
                this.f12579a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f12579a;
                this.f12580b = j12;
                this.f12584f = j12;
                this.f12583e = 1L;
            } else {
                long j13 = j10 - this.f12581c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f12580b) <= 1000000) {
                    this.f12583e++;
                    this.f12584f += j13;
                    boolean[] zArr = this.f12585g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        i10 = this.f12586h - 1;
                        this.f12586h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f12585g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        i10 = this.f12586h + 1;
                        this.f12586h = i10;
                    }
                }
            }
            this.f12582d++;
            this.f12581c = j10;
        }

        public void g() {
            this.f12582d = 0L;
            this.f12583e = 0L;
            this.f12584f = 0L;
            this.f12586h = 0;
            Arrays.fill(this.f12585g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f12573a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f12573a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f12578f;
    }

    public long d() {
        if (e()) {
            return this.f12573a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f12573a.e();
    }

    public void f(long j10) {
        this.f12573a.f(j10);
        if (this.f12573a.e() && !this.f12576d) {
            this.f12575c = false;
        } else if (this.f12577e != -9223372036854775807L) {
            if (!this.f12575c || this.f12574b.d()) {
                this.f12574b.g();
                this.f12574b.f(this.f12577e);
            }
            this.f12575c = true;
            this.f12574b.f(j10);
        }
        if (this.f12575c && this.f12574b.e()) {
            a aVar = this.f12573a;
            this.f12573a = this.f12574b;
            this.f12574b = aVar;
            this.f12575c = false;
            this.f12576d = false;
        }
        this.f12577e = j10;
        this.f12578f = this.f12573a.e() ? 0 : this.f12578f + 1;
    }

    public void g() {
        this.f12573a.g();
        this.f12574b.g();
        this.f12575c = false;
        this.f12577e = -9223372036854775807L;
        this.f12578f = 0;
    }
}
