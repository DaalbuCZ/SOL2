package d2;

import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s1.h2;
import x1.m;
/* loaded from: classes.dex */
final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f6427a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<b> f6428b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final g f6429c = new g();

    /* renamed from: d  reason: collision with root package name */
    private d2.b f6430d;

    /* renamed from: e  reason: collision with root package name */
    private int f6431e;

    /* renamed from: f  reason: collision with root package name */
    private int f6432f;

    /* renamed from: g  reason: collision with root package name */
    private long f6433g;

    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f6434a;

        /* renamed from: b  reason: collision with root package name */
        private final long f6435b;

        private b(int i10, long j10) {
            this.f6434a = i10;
            this.f6435b = j10;
        }
    }

    @RequiresNonNull({"processor"})
    private long a(m mVar) {
        mVar.g();
        while (true) {
            mVar.o(this.f6427a, 0, 4);
            int c10 = g.c(this.f6427a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f6427a, c10, false);
                if (this.f6430d.d(a10)) {
                    mVar.h(c10);
                    return a10;
                }
            }
            mVar.h(1);
        }
    }

    private double e(m mVar, int i10) {
        long f10 = f(mVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) f10) : Double.longBitsToDouble(f10);
    }

    private long f(m mVar, int i10) {
        mVar.readFully(this.f6427a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f6427a[i11] & 255);
        }
        return j10;
    }

    private static String g(m mVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        mVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // d2.c
    public boolean b(m mVar) {
        p3.a.h(this.f6430d);
        while (true) {
            b peek = this.f6428b.peek();
            if (peek != null && mVar.q() >= peek.f6435b) {
                this.f6430d.a(this.f6428b.pop().f6434a);
                return true;
            }
            if (this.f6431e == 0) {
                long d10 = this.f6429c.d(mVar, true, false, 4);
                if (d10 == -2) {
                    d10 = a(mVar);
                }
                if (d10 == -1) {
                    return false;
                }
                this.f6432f = (int) d10;
                this.f6431e = 1;
            }
            if (this.f6431e == 1) {
                this.f6433g = this.f6429c.d(mVar, false, true, 8);
                this.f6431e = 2;
            }
            int b10 = this.f6430d.b(this.f6432f);
            if (b10 != 0) {
                if (b10 == 1) {
                    long q10 = mVar.q();
                    this.f6428b.push(new b(this.f6432f, this.f6433g + q10));
                    this.f6430d.g(this.f6432f, q10, this.f6433g);
                    this.f6431e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f6433g;
                    if (j10 <= 8) {
                        this.f6430d.h(this.f6432f, f(mVar, (int) j10));
                        this.f6431e = 0;
                        return true;
                    }
                    throw h2.a("Invalid integer size: " + this.f6433g, null);
                } else if (b10 == 3) {
                    long j11 = this.f6433g;
                    if (j11 <= 2147483647L) {
                        this.f6430d.f(this.f6432f, g(mVar, (int) j11));
                        this.f6431e = 0;
                        return true;
                    }
                    throw h2.a("String element size: " + this.f6433g, null);
                } else if (b10 == 4) {
                    this.f6430d.e(this.f6432f, (int) this.f6433g, mVar);
                    this.f6431e = 0;
                    return true;
                } else if (b10 != 5) {
                    throw h2.a("Invalid element type " + b10, null);
                } else {
                    long j12 = this.f6433g;
                    if (j12 == 4 || j12 == 8) {
                        this.f6430d.c(this.f6432f, e(mVar, (int) j12));
                        this.f6431e = 0;
                        return true;
                    }
                    throw h2.a("Invalid float size: " + this.f6433g, null);
                }
            }
            mVar.h((int) this.f6433g);
            this.f6431e = 0;
        }
    }

    @Override // d2.c
    public void c() {
        this.f6431e = 0;
        this.f6428b.clear();
        this.f6429c.e();
    }

    @Override // d2.c
    public void d(d2.b bVar) {
        this.f6430d = bVar;
    }
}
