package o3;

import java.util.Arrays;
import o3.b;
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12055a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12056b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f12057c;

    /* renamed from: d  reason: collision with root package name */
    private int f12058d;

    /* renamed from: e  reason: collision with root package name */
    private int f12059e;

    /* renamed from: f  reason: collision with root package name */
    private int f12060f;

    /* renamed from: g  reason: collision with root package name */
    private a[] f12061g;

    public q(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public q(boolean z10, int i10, int i11) {
        p3.a.a(i10 > 0);
        p3.a.a(i11 >= 0);
        this.f12055a = z10;
        this.f12056b = i10;
        this.f12060f = i11;
        this.f12061g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f12057c = null;
            return;
        }
        this.f12057c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12061g[i12] = new a(this.f12057c, i12 * i10);
        }
    }

    @Override // o3.b
    public synchronized void a(b.a aVar) {
        while (aVar != null) {
            a[] aVarArr = this.f12061g;
            int i10 = this.f12060f;
            this.f12060f = i10 + 1;
            aVarArr[i10] = aVar.a();
            this.f12059e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    @Override // o3.b
    public synchronized void b() {
        int i10 = 0;
        int max = Math.max(0, p3.m0.l(this.f12058d, this.f12056b) - this.f12059e);
        int i11 = this.f12060f;
        if (max >= i11) {
            return;
        }
        if (this.f12057c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a aVar = (a) p3.a.e(this.f12061g[i10]);
                if (aVar.f11926a == this.f12057c) {
                    i10++;
                } else {
                    a aVar2 = (a) p3.a.e(this.f12061g[i12]);
                    if (aVar2.f11926a != this.f12057c) {
                        i12--;
                    } else {
                        a[] aVarArr = this.f12061g;
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            max = Math.max(max, i10);
            if (max >= this.f12060f) {
                return;
            }
        }
        Arrays.fill(this.f12061g, max, this.f12060f, (Object) null);
        this.f12060f = max;
    }

    @Override // o3.b
    public synchronized void c(a aVar) {
        a[] aVarArr = this.f12061g;
        int i10 = this.f12060f;
        this.f12060f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f12059e--;
        notifyAll();
    }

    @Override // o3.b
    public synchronized a d() {
        a aVar;
        this.f12059e++;
        int i10 = this.f12060f;
        if (i10 > 0) {
            a[] aVarArr = this.f12061g;
            int i11 = i10 - 1;
            this.f12060f = i11;
            aVar = (a) p3.a.e(aVarArr[i11]);
            this.f12061g[this.f12060f] = null;
        } else {
            aVar = new a(new byte[this.f12056b], 0);
            int i12 = this.f12059e;
            a[] aVarArr2 = this.f12061g;
            if (i12 > aVarArr2.length) {
                this.f12061g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
            }
        }
        return aVar;
    }

    @Override // o3.b
    public int e() {
        return this.f12056b;
    }

    public synchronized int f() {
        return this.f12059e * this.f12056b;
    }

    public synchronized void g() {
        if (this.f12055a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f12058d;
        this.f12058d = i10;
        if (z10) {
            b();
        }
    }
}
