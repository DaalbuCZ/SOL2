package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0299f extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    static final int f10038g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a  reason: collision with root package name */
    protected final D0 f10039a;

    /* renamed from: b  reason: collision with root package name */
    protected j$.util.H f10040b;

    /* renamed from: c  reason: collision with root package name */
    protected long f10041c;

    /* renamed from: d  reason: collision with root package name */
    protected AbstractC0299f f10042d;

    /* renamed from: e  reason: collision with root package name */
    protected AbstractC0299f f10043e;

    /* renamed from: f  reason: collision with root package name */
    private Object f10044f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0299f(D0 d02, j$.util.H h10) {
        super(null);
        this.f10039a = d02;
        this.f10040b = h10;
        this.f10041c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0299f(AbstractC0299f abstractC0299f, j$.util.H h10) {
        super(abstractC0299f);
        this.f10040b = h10;
        this.f10039a = abstractC0299f.f10039a;
        this.f10041c = abstractC0299f.f10041c;
    }

    public static long h(long j10) {
        long j11 = j10 / f10038g;
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b() {
        return this.f10044f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0299f c() {
        return (AbstractC0299f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.H trySplit;
        j$.util.H h10 = this.f10040b;
        long estimateSize = h10.estimateSize();
        long j10 = this.f10041c;
        if (j10 == 0) {
            j10 = h(estimateSize);
            this.f10041c = j10;
        }
        boolean z10 = false;
        AbstractC0299f abstractC0299f = this;
        while (estimateSize > j10 && (trySplit = h10.trySplit()) != null) {
            AbstractC0299f f10 = abstractC0299f.f(trySplit);
            abstractC0299f.f10042d = f10;
            AbstractC0299f f11 = abstractC0299f.f(h10);
            abstractC0299f.f10043e = f11;
            abstractC0299f.setPendingCount(1);
            if (z10) {
                h10 = trySplit;
                abstractC0299f = f10;
                f10 = f11;
            } else {
                abstractC0299f = f11;
            }
            z10 = !z10;
            f10.fork();
            estimateSize = h10.estimateSize();
        }
        abstractC0299f.g(abstractC0299f.a());
        abstractC0299f.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d() {
        return this.f10042d == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean e() {
        return c() == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0299f f(j$.util.H h10);

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Object obj) {
        this.f10044f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f10044f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f10040b = null;
        this.f10043e = null;
        this.f10042d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
