package d3;

import b5.q;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final c f6540a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final l f6541b = new l();

    /* renamed from: c  reason: collision with root package name */
    private final Deque<m> f6542c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f6543d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6544e;

    /* loaded from: classes.dex */
    class a extends m {
        a() {
        }

        @Override // v1.h
        public void x() {
            f.this.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: n  reason: collision with root package name */
        private final long f6546n;

        /* renamed from: o  reason: collision with root package name */
        private final q<d3.b> f6547o;

        public b(long j10, q<d3.b> qVar) {
            this.f6546n = j10;
            this.f6547o = qVar;
        }

        @Override // d3.h
        public int e(long j10) {
            return this.f6546n > j10 ? 0 : -1;
        }

        @Override // d3.h
        public long g(int i10) {
            p3.a.a(i10 == 0);
            return this.f6546n;
        }

        @Override // d3.h
        public List<d3.b> h(long j10) {
            return j10 >= this.f6546n ? this.f6547o : q.J();
        }

        @Override // d3.h
        public int j() {
            return 1;
        }
    }

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f6542c.addFirst(new a());
        }
        this.f6543d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(m mVar) {
        p3.a.f(this.f6542c.size() < 2);
        p3.a.a(!this.f6542c.contains(mVar));
        mVar.m();
        this.f6542c.addFirst(mVar);
    }

    @Override // v1.d
    public void a() {
        this.f6544e = true;
    }

    @Override // d3.i
    public void b(long j10) {
    }

    @Override // v1.d
    public void flush() {
        p3.a.f(!this.f6544e);
        this.f6541b.m();
        this.f6543d = 0;
    }

    @Override // v1.d
    /* renamed from: g */
    public l e() {
        p3.a.f(!this.f6544e);
        if (this.f6543d != 0) {
            return null;
        }
        this.f6543d = 1;
        return this.f6541b;
    }

    @Override // v1.d
    /* renamed from: h */
    public m d() {
        p3.a.f(!this.f6544e);
        if (this.f6543d != 2 || this.f6542c.isEmpty()) {
            return null;
        }
        m removeFirst = this.f6542c.removeFirst();
        if (this.f6541b.t()) {
            removeFirst.l(4);
        } else {
            l lVar = this.f6541b;
            removeFirst.y(this.f6541b.f15538r, new b(lVar.f15538r, this.f6540a.a(((ByteBuffer) p3.a.e(lVar.f15536p)).array())), 0L);
        }
        this.f6541b.m();
        this.f6543d = 0;
        return removeFirst;
    }

    @Override // v1.d
    /* renamed from: i */
    public void c(l lVar) {
        p3.a.f(!this.f6544e);
        p3.a.f(this.f6543d == 1);
        p3.a.a(this.f6541b == lVar);
        this.f6543d = 2;
    }
}
