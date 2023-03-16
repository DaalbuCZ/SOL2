package u1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p3.m0;
/* loaded from: classes.dex */
final class v {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f15050a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f15051b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f15052c;

    /* renamed from: d  reason: collision with root package name */
    private int f15053d;

    /* renamed from: e  reason: collision with root package name */
    private int f15054e;

    /* renamed from: f  reason: collision with root package name */
    private u f15055f;

    /* renamed from: g  reason: collision with root package name */
    private int f15056g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15057h;

    /* renamed from: i  reason: collision with root package name */
    private long f15058i;

    /* renamed from: j  reason: collision with root package name */
    private float f15059j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15060k;

    /* renamed from: l  reason: collision with root package name */
    private long f15061l;

    /* renamed from: m  reason: collision with root package name */
    private long f15062m;

    /* renamed from: n  reason: collision with root package name */
    private Method f15063n;

    /* renamed from: o  reason: collision with root package name */
    private long f15064o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15065p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15066q;

    /* renamed from: r  reason: collision with root package name */
    private long f15067r;

    /* renamed from: s  reason: collision with root package name */
    private long f15068s;

    /* renamed from: t  reason: collision with root package name */
    private long f15069t;

    /* renamed from: u  reason: collision with root package name */
    private long f15070u;

    /* renamed from: v  reason: collision with root package name */
    private int f15071v;

    /* renamed from: w  reason: collision with root package name */
    private int f15072w;

    /* renamed from: x  reason: collision with root package name */
    private long f15073x;

    /* renamed from: y  reason: collision with root package name */
    private long f15074y;

    /* renamed from: z  reason: collision with root package name */
    private long f15075z;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);

        void b(int i10, long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10);
    }

    public v(a aVar) {
        this.f15050a = (a) p3.a.e(aVar);
        if (m0.f12306a >= 18) {
            try {
                this.f15063n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f15051b = new long[10];
    }

    private boolean a() {
        return this.f15057h && ((AudioTrack) p3.a.e(this.f15052c)).getPlayState() == 2 && e() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / this.f15056g;
    }

    private long e() {
        AudioTrack audioTrack = (AudioTrack) p3.a.e(this.f15052c);
        if (this.f15073x != -9223372036854775807L) {
            return Math.min(this.A, this.f15075z + ((((SystemClock.elapsedRealtime() * 1000) - this.f15073x) * this.f15056g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f15057h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f15070u = this.f15068s;
            }
            playbackHeadPosition += this.f15070u;
        }
        if (m0.f12306a <= 29) {
            if (playbackHeadPosition == 0 && this.f15068s > 0 && playState == 3) {
                if (this.f15074y == -9223372036854775807L) {
                    this.f15074y = SystemClock.elapsedRealtime();
                }
                return this.f15068s;
            }
            this.f15074y = -9223372036854775807L;
        }
        if (this.f15068s > playbackHeadPosition) {
            this.f15069t++;
        }
        this.f15068s = playbackHeadPosition;
        return playbackHeadPosition + (this.f15069t << 32);
    }

    private long f() {
        return b(e());
    }

    private void l(long j10, long j11) {
        u uVar = (u) p3.a.e(this.f15055f);
        if (uVar.e(j10)) {
            long c10 = uVar.c();
            long b10 = uVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f15050a.d(b10, c10, j10, j11);
            } else if (Math.abs(b(b10) - j11) <= 5000000) {
                uVar.a();
                return;
            } else {
                this.f15050a.c(b10, c10, j10, j11);
            }
            uVar.f();
        }
    }

    private void m() {
        long f10 = f();
        if (f10 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f15062m >= 30000) {
            long[] jArr = this.f15051b;
            int i10 = this.f15071v;
            jArr[i10] = f10 - nanoTime;
            this.f15071v = (i10 + 1) % 10;
            int i11 = this.f15072w;
            if (i11 < 10) {
                this.f15072w = i11 + 1;
            }
            this.f15062m = nanoTime;
            this.f15061l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f15072w;
                if (i12 >= i13) {
                    break;
                }
                this.f15061l += this.f15051b[i12] / i13;
                i12++;
            }
        }
        if (this.f15057h) {
            return;
        }
        l(nanoTime, f10);
        n(nanoTime);
    }

    private void n(long j10) {
        Method method;
        if (!this.f15066q || (method = this.f15063n) == null || j10 - this.f15067r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) m0.j((Integer) method.invoke(p3.a.e(this.f15052c), new Object[0]))).intValue() * 1000) - this.f15058i;
            this.f15064o = intValue;
            long max = Math.max(intValue, 0L);
            this.f15064o = max;
            if (max > 5000000) {
                this.f15050a.e(max);
                this.f15064o = 0L;
            }
        } catch (Exception unused) {
            this.f15063n = null;
        }
        this.f15067r = j10;
    }

    private static boolean o(int i10) {
        return m0.f12306a < 23 && (i10 == 5 || i10 == 6);
    }

    private void r() {
        this.f15061l = 0L;
        this.f15072w = 0;
        this.f15071v = 0;
        this.f15062m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f15060k = false;
    }

    public int c(long j10) {
        return this.f15054e - ((int) (j10 - (e() * this.f15053d)));
    }

    public long d(boolean z10) {
        long f10;
        if (((AudioTrack) p3.a.e(this.f15052c)).getPlayState() == 3) {
            m();
        }
        long nanoTime = System.nanoTime() / 1000;
        u uVar = (u) p3.a.e(this.f15055f);
        boolean d10 = uVar.d();
        if (d10) {
            f10 = b(uVar.b()) + m0.Z(nanoTime - uVar.c(), this.f15059j);
        } else {
            f10 = this.f15072w == 0 ? f() : this.f15061l + nanoTime;
            if (!z10) {
                f10 = Math.max(0L, f10 - this.f15064o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j10 = nanoTime - this.F;
        if (j10 < 1000000) {
            long j11 = (j10 * 1000) / 1000000;
            f10 = ((f10 * j11) + ((1000 - j11) * (this.E + m0.Z(j10, this.f15059j)))) / 1000;
        }
        if (!this.f15060k) {
            long j12 = this.B;
            if (f10 > j12) {
                this.f15060k = true;
                this.f15050a.a(System.currentTimeMillis() - m0.X0(m0.e0(m0.X0(f10 - j12), this.f15059j)));
            }
        }
        this.C = nanoTime;
        this.B = f10;
        this.D = d10;
        return f10;
    }

    public void g(long j10) {
        this.f15075z = e();
        this.f15073x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean h(long j10) {
        return j10 > e() || a();
    }

    public boolean i() {
        return ((AudioTrack) p3.a.e(this.f15052c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f15074y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f15074y >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) p3.a.e(this.f15052c)).getPlayState();
        if (this.f15057h) {
            if (playState == 2) {
                this.f15065p = false;
                return false;
            } else if (playState == 1 && e() == 0) {
                return false;
            }
        }
        boolean z10 = this.f15065p;
        boolean h10 = h(j10);
        this.f15065p = h10;
        if (z10 && !h10 && playState != 1) {
            this.f15050a.b(this.f15054e, m0.X0(this.f15058i));
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f15073x == -9223372036854775807L) {
            ((u) p3.a.e(this.f15055f)).g();
            return true;
        }
        return false;
    }

    public void q() {
        r();
        this.f15052c = null;
        this.f15055f = null;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f15052c = audioTrack;
        this.f15053d = i11;
        this.f15054e = i12;
        this.f15055f = new u(audioTrack);
        this.f15056g = audioTrack.getSampleRate();
        this.f15057h = z10 && o(i10);
        boolean s02 = m0.s0(i10);
        this.f15066q = s02;
        this.f15058i = s02 ? b(i12 / i11) : -9223372036854775807L;
        this.f15068s = 0L;
        this.f15069t = 0L;
        this.f15070u = 0L;
        this.f15065p = false;
        this.f15073x = -9223372036854775807L;
        this.f15074y = -9223372036854775807L;
        this.f15067r = 0L;
        this.f15064o = 0L;
        this.f15059j = 1.0f;
    }

    public void t(float f10) {
        this.f15059j = f10;
        u uVar = this.f15055f;
        if (uVar != null) {
            uVar.g();
        }
    }

    public void u() {
        ((u) p3.a.e(this.f15055f)).g();
    }
}
