package v1;

import java.util.ArrayDeque;
import v1.f;
import v1.g;
import v1.h;
/* loaded from: classes.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f15551a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f15552b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f15553c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f15554d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f15555e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f15556f;

    /* renamed from: g  reason: collision with root package name */
    private int f15557g;

    /* renamed from: h  reason: collision with root package name */
    private int f15558h;

    /* renamed from: i  reason: collision with root package name */
    private I f15559i;

    /* renamed from: j  reason: collision with root package name */
    private E f15560j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15561k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15562l;

    /* renamed from: m  reason: collision with root package name */
    private int f15563m;

    /* loaded from: classes.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(I[] iArr, O[] oArr) {
        this.f15555e = iArr;
        this.f15557g = iArr.length;
        for (int i10 = 0; i10 < this.f15557g; i10++) {
            this.f15555e[i10] = h();
        }
        this.f15556f = oArr;
        this.f15558h = oArr.length;
        for (int i11 = 0; i11 < this.f15558h; i11++) {
            this.f15556f[i11] = i();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f15551a = aVar;
        aVar.start();
    }

    private boolean g() {
        return !this.f15553c.isEmpty() && this.f15558h > 0;
    }

    private boolean l() {
        E j10;
        synchronized (this.f15552b) {
            while (!this.f15562l && !g()) {
                this.f15552b.wait();
            }
            if (this.f15562l) {
                return false;
            }
            I removeFirst = this.f15553c.removeFirst();
            O[] oArr = this.f15556f;
            int i10 = this.f15558h - 1;
            this.f15558h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f15561k;
            this.f15561k = false;
            if (removeFirst.t()) {
                o10.l(4);
            } else {
                if (removeFirst.s()) {
                    o10.l(Integer.MIN_VALUE);
                }
                if (removeFirst.u()) {
                    o10.l(134217728);
                }
                try {
                    j10 = k(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e10) {
                    j10 = j(e10);
                }
                if (j10 != null) {
                    synchronized (this.f15552b) {
                        this.f15560j = j10;
                    }
                    return false;
                }
            }
            synchronized (this.f15552b) {
                if (!this.f15561k) {
                    if (o10.s()) {
                        this.f15563m++;
                    } else {
                        o10.f15545p = this.f15563m;
                        this.f15563m = 0;
                        this.f15554d.addLast(o10);
                        r(removeFirst);
                    }
                }
                o10.x();
                r(removeFirst);
            }
            return true;
        }
    }

    private void o() {
        if (g()) {
            this.f15552b.notify();
        }
    }

    private void p() {
        E e10 = this.f15560j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void r(I i10) {
        i10.m();
        I[] iArr = this.f15555e;
        int i11 = this.f15557g;
        this.f15557g = i11 + 1;
        iArr[i11] = i10;
    }

    private void t(O o10) {
        o10.m();
        O[] oArr = this.f15556f;
        int i10 = this.f15558h;
        this.f15558h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (l());
    }

    @Override // v1.d
    public void a() {
        synchronized (this.f15552b) {
            this.f15562l = true;
            this.f15552b.notify();
        }
        try {
            this.f15551a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // v1.d
    public final void flush() {
        synchronized (this.f15552b) {
            this.f15561k = true;
            this.f15563m = 0;
            I i10 = this.f15559i;
            if (i10 != null) {
                r(i10);
                this.f15559i = null;
            }
            while (!this.f15553c.isEmpty()) {
                r(this.f15553c.removeFirst());
            }
            while (!this.f15554d.isEmpty()) {
                this.f15554d.removeFirst().x();
            }
        }
    }

    protected abstract I h();

    protected abstract O i();

    protected abstract E j(Throwable th);

    protected abstract E k(I i10, O o10, boolean z10);

    @Override // v1.d
    /* renamed from: m */
    public final I e() {
        I i10;
        synchronized (this.f15552b) {
            p();
            p3.a.f(this.f15559i == null);
            int i11 = this.f15557g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f15555e;
                int i12 = i11 - 1;
                this.f15557g = i12;
                i10 = iArr[i12];
            }
            this.f15559i = i10;
        }
        return i10;
    }

    @Override // v1.d
    /* renamed from: n */
    public final O d() {
        synchronized (this.f15552b) {
            p();
            if (this.f15554d.isEmpty()) {
                return null;
            }
            return this.f15554d.removeFirst();
        }
    }

    @Override // v1.d
    /* renamed from: q */
    public final void c(I i10) {
        synchronized (this.f15552b) {
            p();
            p3.a.a(i10 == this.f15559i);
            this.f15553c.addLast(i10);
            o();
            this.f15559i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(O o10) {
        synchronized (this.f15552b) {
            t(o10);
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(int i10) {
        p3.a.f(this.f15557g == this.f15555e.length);
        for (I i11 : this.f15555e) {
            i11.y(i10);
        }
    }
}
