package j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0289d extends AbstractC0299f {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f10004h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f10005i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0289d(D0 d02, j$.util.H h10) {
        super(d02, h10);
        this.f10004h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0289d(AbstractC0289d abstractC0289d, j$.util.H h10) {
        super(abstractC0289d, h10);
        this.f10004h = abstractC0289d.f10004h;
    }

    @Override // j$.util.stream.AbstractC0299f
    public Object b() {
        if (e()) {
            Object obj = this.f10004h.get();
            return obj == null ? k() : obj;
        }
        return super.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        r8 = r7.a();
     */
    @Override // j$.util.stream.AbstractC0299f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void compute() {
        /*
            r10 = this;
            j$.util.H r0 = r10.f10040b
            long r1 = r0.estimateSize()
            long r3 = r10.f10041c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto Lf
            goto L15
        Lf:
            long r3 = j$.util.stream.AbstractC0299f.h(r1)
            r10.f10041c = r3
        L15:
            r5 = 0
            java.util.concurrent.atomic.AtomicReference r6 = r10.f10004h
            r7 = r10
        L19:
            java.lang.Object r8 = r6.get()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f10005i
            if (r8 != 0) goto L34
            j$.util.stream.f r9 = r7.c()
        L27:
            j$.util.stream.d r9 = (j$.util.stream.AbstractC0289d) r9
            if (r8 != 0) goto L34
            if (r9 == 0) goto L34
            boolean r8 = r9.f10005i
            j$.util.stream.f r9 = r9.c()
            goto L27
        L34:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.k()
            goto L6f
        L3b:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L6b
            j$.util.H r1 = r0.trySplit()
            if (r1 != 0) goto L46
            goto L6b
        L46:
            j$.util.stream.f r2 = r7.f(r1)
            j$.util.stream.d r2 = (j$.util.stream.AbstractC0289d) r2
            r7.f10042d = r2
            j$.util.stream.f r8 = r7.f(r0)
            j$.util.stream.d r8 = (j$.util.stream.AbstractC0289d) r8
            r7.f10043e = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r5 == 0) goto L60
            r0 = r1
            r7 = r2
            r2 = r8
            goto L61
        L60:
            r7 = r8
        L61:
            r5 = r5 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L19
        L6b:
            java.lang.Object r8 = r7.a()
        L6f:
            r7.g(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC0289d.compute():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0299f
    public void g(Object obj) {
        if (!e()) {
            super.g(obj);
        } else if (obj != null) {
            this.f10004h.compareAndSet(null, obj);
        }
    }

    @Override // j$.util.stream.AbstractC0299f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return b();
    }

    protected void i() {
        this.f10005i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        AbstractC0289d abstractC0289d = this;
        for (AbstractC0289d abstractC0289d2 = (AbstractC0289d) c(); abstractC0289d2 != null; abstractC0289d2 = (AbstractC0289d) abstractC0289d2.c()) {
            if (abstractC0289d2.f10042d == abstractC0289d) {
                AbstractC0289d abstractC0289d3 = (AbstractC0289d) abstractC0289d2.f10043e;
                if (!abstractC0289d3.f10005i) {
                    abstractC0289d3.i();
                }
            }
            abstractC0289d = abstractC0289d2;
        }
    }

    protected abstract Object k();

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(Object obj) {
        if (obj != null) {
            this.f10004h.compareAndSet(null, obj);
        }
    }
}
