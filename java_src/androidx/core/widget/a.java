package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.u;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int E = ViewConfiguration.getTapTimeout();
    boolean A;
    boolean B;
    private boolean C;
    private boolean D;

    /* renamed from: p  reason: collision with root package name */
    final View f1707p;

    /* renamed from: q  reason: collision with root package name */
    private Runnable f1708q;

    /* renamed from: t  reason: collision with root package name */
    private int f1711t;

    /* renamed from: u  reason: collision with root package name */
    private int f1712u;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1716y;

    /* renamed from: z  reason: collision with root package name */
    boolean f1717z;

    /* renamed from: n  reason: collision with root package name */
    final C0035a f1705n = new C0035a();

    /* renamed from: o  reason: collision with root package name */
    private final Interpolator f1706o = new AccelerateInterpolator();

    /* renamed from: r  reason: collision with root package name */
    private float[] f1709r = {0.0f, 0.0f};

    /* renamed from: s  reason: collision with root package name */
    private float[] f1710s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: v  reason: collision with root package name */
    private float[] f1713v = {0.0f, 0.0f};

    /* renamed from: w  reason: collision with root package name */
    private float[] f1714w = {0.0f, 0.0f};

    /* renamed from: x  reason: collision with root package name */
    private float[] f1715x = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035a {

        /* renamed from: a  reason: collision with root package name */
        private int f1718a;

        /* renamed from: b  reason: collision with root package name */
        private int f1719b;

        /* renamed from: c  reason: collision with root package name */
        private float f1720c;

        /* renamed from: d  reason: collision with root package name */
        private float f1721d;

        /* renamed from: j  reason: collision with root package name */
        private float f1727j;

        /* renamed from: k  reason: collision with root package name */
        private int f1728k;

        /* renamed from: e  reason: collision with root package name */
        private long f1722e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f1726i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f1723f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f1724g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f1725h = 0;

        C0035a() {
        }

        private float e(long j10) {
            long j11 = this.f1722e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f1726i;
            if (j12 < 0 || j10 < j12) {
                return a.e(((float) (j10 - j11)) / this.f1718a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f1727j;
            return (1.0f - f10) + (f10 * a.e(((float) (j10 - j12)) / this.f1728k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f1723f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g10 = g(e(currentAnimationTimeMillis));
            this.f1723f = currentAnimationTimeMillis;
            float f10 = ((float) (currentAnimationTimeMillis - this.f1723f)) * g10;
            this.f1724g = (int) (this.f1720c * f10);
            this.f1725h = (int) (f10 * this.f1721d);
        }

        public int b() {
            return this.f1724g;
        }

        public int c() {
            return this.f1725h;
        }

        public int d() {
            float f10 = this.f1720c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f1721d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f1726i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1726i + ((long) this.f1728k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1728k = a.f((int) (currentAnimationTimeMillis - this.f1722e), 0, this.f1719b);
            this.f1727j = e(currentAnimationTimeMillis);
            this.f1726i = currentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f1719b = i10;
        }

        public void k(int i10) {
            this.f1718a = i10;
        }

        public void l(float f10, float f11) {
            this.f1720c = f10;
            this.f1721d = f11;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1722e = currentAnimationTimeMillis;
            this.f1726i = -1L;
            this.f1723f = currentAnimationTimeMillis;
            this.f1727j = 0.5f;
            this.f1724g = 0;
            this.f1725h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.B) {
                if (aVar.f1717z) {
                    aVar.f1717z = false;
                    aVar.f1705n.m();
                }
                C0035a c0035a = a.this.f1705n;
                if (c0035a.h() || !a.this.u()) {
                    a.this.B = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.A) {
                    aVar2.A = false;
                    aVar2.c();
                }
                c0035a.a();
                a.this.j(c0035a.b(), c0035a.c());
                u.C(a.this.f1707p, this);
            }
        }
    }

    public a(View view) {
        this.f1707p = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(E);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float h10 = h(this.f1709r[i10], f11, this.f1710s[i10], f10);
        int i11 = (h10 > 0.0f ? 1 : (h10 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            return 0.0f;
        }
        float f13 = this.f1713v[i10];
        float f14 = this.f1714w[i10];
        float f15 = this.f1715x[i10];
        float f16 = f13 * f12;
        return i11 > 0 ? e(h10 * f16, f14, f15) : -e((-h10) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f1711t;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.B && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float e10 = e(f10 * f11, 0.0f, f12);
        float g10 = g(f11 - f13, e10) - g(f13, e10);
        if (g10 < 0.0f) {
            interpolation = -this.f1706o.getInterpolation(-g10);
        } else if (g10 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f1706o.getInterpolation(g10);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f1717z) {
            this.B = false;
        } else {
            this.f1705n.i();
        }
    }

    private void v() {
        int i10;
        if (this.f1708q == null) {
            this.f1708q = new b();
        }
        this.B = true;
        this.f1717z = true;
        if (this.f1716y || (i10 = this.f1712u) <= 0) {
            this.f1708q.run();
        } else {
            u.D(this.f1707p, this.f1708q, i10);
        }
        this.f1716y = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1707p.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f1712u = i10;
        return this;
    }

    public a l(int i10) {
        this.f1711t = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.C && !z10) {
            i();
        }
        this.C = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f1710s;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f1715x;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.C
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.A = r2
            r5.f1716y = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1707p
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1707p
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1705n
            r7.l(r0, r6)
            boolean r6 = r5.B
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.D
            if (r6 == 0) goto L61
            boolean r6 = r5.B
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f1714w;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f1705n.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f1705n.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f1709r;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f1713v;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0035a c0035a = this.f1705n;
        int f10 = c0035a.f();
        int d10 = c0035a.d();
        return (f10 != 0 && b(f10)) || (d10 != 0 && a(d10));
    }
}
