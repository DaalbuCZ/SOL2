package e3;

import d3.i;
import d3.l;
import d3.m;
import e3.e;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p3.m0;
import v1.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f6758a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<m> f6759b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<b> f6760c;

    /* renamed from: d  reason: collision with root package name */
    private b f6761d;

    /* renamed from: e  reason: collision with root package name */
    private long f6762e;

    /* renamed from: f  reason: collision with root package name */
    private long f6763f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends l implements Comparable<b> {

        /* renamed from: w  reason: collision with root package name */
        private long f6764w;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: E */
        public int compareTo(b bVar) {
            if (t() != bVar.t()) {
                return t() ? 1 : -1;
            }
            long j10 = this.f15538r - bVar.f15538r;
            if (j10 == 0) {
                j10 = this.f6764w - bVar.f6764w;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends m {

        /* renamed from: s  reason: collision with root package name */
        private h.a<c> f6765s;

        public c(h.a<c> aVar) {
            this.f6765s = aVar;
        }

        @Override // v1.h
        public final void x() {
            this.f6765s.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f6758a.add(new b());
        }
        this.f6759b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f6759b.add(new c(new h.a() { // from class: e3.d
                @Override // v1.h.a
                public final void a(h hVar) {
                    e.this.o((e.c) hVar);
                }
            }));
        }
        this.f6760c = new PriorityQueue<>();
    }

    private void n(b bVar) {
        bVar.m();
        this.f6758a.add(bVar);
    }

    @Override // v1.d
    public void a() {
    }

    @Override // d3.i
    public void b(long j10) {
        this.f6762e = j10;
    }

    protected abstract d3.h f();

    @Override // v1.d
    public void flush() {
        this.f6763f = 0L;
        this.f6762e = 0L;
        while (!this.f6760c.isEmpty()) {
            n((b) m0.j(this.f6760c.poll()));
        }
        b bVar = this.f6761d;
        if (bVar != null) {
            n(bVar);
            this.f6761d = null;
        }
    }

    protected abstract void g(l lVar);

    @Override // v1.d
    /* renamed from: h */
    public l e() {
        p3.a.f(this.f6761d == null);
        if (this.f6758a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f6758a.pollFirst();
        this.f6761d = pollFirst;
        return pollFirst;
    }

    @Override // v1.d
    /* renamed from: i */
    public m d() {
        m mVar;
        if (this.f6759b.isEmpty()) {
            return null;
        }
        while (!this.f6760c.isEmpty() && ((b) m0.j(this.f6760c.peek())).f15538r <= this.f6762e) {
            b bVar = (b) m0.j(this.f6760c.poll());
            if (bVar.t()) {
                mVar = (m) m0.j(this.f6759b.pollFirst());
                mVar.l(4);
            } else {
                g(bVar);
                if (l()) {
                    d3.h f10 = f();
                    mVar = (m) m0.j(this.f6759b.pollFirst());
                    mVar.y(bVar.f15538r, f10, Long.MAX_VALUE);
                } else {
                    n(bVar);
                }
            }
            n(bVar);
            return mVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m j() {
        return this.f6759b.pollFirst();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long k() {
        return this.f6762e;
    }

    protected abstract boolean l();

    @Override // v1.d
    /* renamed from: m */
    public void c(l lVar) {
        p3.a.a(lVar == this.f6761d);
        b bVar = (b) lVar;
        if (bVar.s()) {
            n(bVar);
        } else {
            long j10 = this.f6763f;
            this.f6763f = 1 + j10;
            bVar.f6764w = j10;
            this.f6760c.add(bVar);
        }
        this.f6761d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(m mVar) {
        mVar.m();
        this.f6759b.add(mVar);
    }
}
