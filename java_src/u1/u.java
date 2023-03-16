package u1;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p3.m0;
/* loaded from: classes.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final a f15039a;

    /* renamed from: b  reason: collision with root package name */
    private int f15040b;

    /* renamed from: c  reason: collision with root package name */
    private long f15041c;

    /* renamed from: d  reason: collision with root package name */
    private long f15042d;

    /* renamed from: e  reason: collision with root package name */
    private long f15043e;

    /* renamed from: f  reason: collision with root package name */
    private long f15044f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f15045a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f15046b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f15047c;

        /* renamed from: d  reason: collision with root package name */
        private long f15048d;

        /* renamed from: e  reason: collision with root package name */
        private long f15049e;

        public a(AudioTrack audioTrack) {
            this.f15045a = audioTrack;
        }

        public long a() {
            return this.f15049e;
        }

        public long b() {
            return this.f15046b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f15045a.getTimestamp(this.f15046b);
            if (timestamp) {
                long j10 = this.f15046b.framePosition;
                if (this.f15048d > j10) {
                    this.f15047c++;
                }
                this.f15048d = j10;
                this.f15049e = j10 + (this.f15047c << 32);
            }
            return timestamp;
        }
    }

    public u(AudioTrack audioTrack) {
        if (m0.f12306a >= 19) {
            this.f15039a = new a(audioTrack);
            g();
            return;
        }
        this.f15039a = null;
        h(3);
    }

    private void h(int i10) {
        this.f15040b = i10;
        long j10 = 10000;
        if (i10 == 0) {
            this.f15043e = 0L;
            this.f15044f = -1L;
            this.f15041c = System.nanoTime() / 1000;
        } else if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                j10 = 10000000;
            } else if (i10 != 4) {
                throw new IllegalStateException();
            } else {
                j10 = 500000;
            }
        }
        this.f15042d = j10;
    }

    public void a() {
        if (this.f15040b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f15039a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f15039a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f15040b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if (r0 == false) goto L19;
     */
    @android.annotation.TargetApi(19)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(long r7) {
        /*
            r6 = this;
            u1.u$a r0 = r6.f15039a
            r1 = 0
            if (r0 == 0) goto L71
            long r2 = r6.f15043e
            long r2 = r7 - r2
            long r4 = r6.f15042d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L10
            goto L71
        L10:
            r6.f15043e = r7
            boolean r0 = r0.c()
            int r2 = r6.f15040b
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            r7 = 2
            if (r2 == r4) goto L33
            if (r2 == r7) goto L30
            if (r2 == r3) goto L2d
            r7 = 4
            if (r2 != r7) goto L27
            goto L70
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L2d:
            if (r0 == 0) goto L70
            goto L45
        L30:
            if (r0 != 0) goto L70
            goto L45
        L33:
            if (r0 == 0) goto L45
            u1.u$a r8 = r6.f15039a
            long r1 = r8.a()
            long r3 = r6.f15044f
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L70
            r6.h(r7)
            goto L70
        L45:
            r6.g()
            goto L70
        L49:
            if (r0 == 0) goto L63
            u1.u$a r7 = r6.f15039a
            long r7 = r7.b()
            long r2 = r6.f15041c
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L71
            u1.u$a r7 = r6.f15039a
            long r7 = r7.a()
            r6.f15044f = r7
            r6.h(r4)
            goto L70
        L63:
            long r1 = r6.f15041c
            long r7 = r7 - r1
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 <= 0) goto L70
            r6.h(r3)
        L70:
            r1 = r0
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.u.e(long):boolean");
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f15039a != null) {
            h(0);
        }
    }
}
