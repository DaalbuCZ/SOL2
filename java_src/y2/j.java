package y2;

import android.net.Uri;
import b5.q;
import java.util.Collections;
import java.util.List;
import s1.m1;
import y2.k;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f16914a;

    /* renamed from: b  reason: collision with root package name */
    public final m1 f16915b;

    /* renamed from: c  reason: collision with root package name */
    public final q<y2.b> f16916c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16917d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e> f16918e;

    /* renamed from: f  reason: collision with root package name */
    public final List<e> f16919f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f16920g;

    /* renamed from: h  reason: collision with root package name */
    private final i f16921h;

    /* loaded from: classes.dex */
    public static class b extends j implements x2.f {

        /* renamed from: i  reason: collision with root package name */
        final k.a f16922i;

        public b(long j10, m1 m1Var, List<y2.b> list, k.a aVar, List<e> list2, List<e> list3, List<e> list4) {
            super(j10, m1Var, list, aVar, list2, list3, list4);
            this.f16922i = aVar;
        }

        @Override // x2.f
        public long a(long j10, long j11) {
            return this.f16922i.i(j10, j11);
        }

        @Override // x2.f
        public long b(long j10, long j11) {
            return this.f16922i.h(j10, j11);
        }

        @Override // x2.f
        public long c(long j10, long j11) {
            return this.f16922i.d(j10, j11);
        }

        @Override // x2.f
        public long d(long j10) {
            return this.f16922i.j(j10);
        }

        @Override // x2.f
        public long e(long j10, long j11) {
            return this.f16922i.f(j10, j11);
        }

        @Override // x2.f
        public i f(long j10) {
            return this.f16922i.k(this, j10);
        }

        @Override // x2.f
        public boolean g() {
            return this.f16922i.l();
        }

        @Override // x2.f
        public long h() {
            return this.f16922i.e();
        }

        @Override // x2.f
        public long i(long j10) {
            return this.f16922i.g(j10);
        }

        @Override // x2.f
        public long j(long j10, long j11) {
            return this.f16922i.c(j10, j11);
        }

        @Override // y2.j
        public String k() {
            return null;
        }

        @Override // y2.j
        public x2.f l() {
            return this;
        }

        @Override // y2.j
        public i m() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends j {

        /* renamed from: i  reason: collision with root package name */
        public final Uri f16923i;

        /* renamed from: j  reason: collision with root package name */
        public final long f16924j;

        /* renamed from: k  reason: collision with root package name */
        private final String f16925k;

        /* renamed from: l  reason: collision with root package name */
        private final i f16926l;

        /* renamed from: m  reason: collision with root package name */
        private final m f16927m;

        public c(long j10, m1 m1Var, List<y2.b> list, k.e eVar, List<e> list2, List<e> list3, List<e> list4, String str, long j11) {
            super(j10, m1Var, list, eVar, list2, list3, list4);
            this.f16923i = Uri.parse(list.get(0).f16861a);
            i c10 = eVar.c();
            this.f16926l = c10;
            this.f16925k = str;
            this.f16924j = j11;
            this.f16927m = c10 != null ? null : new m(new i(null, 0L, j11));
        }

        @Override // y2.j
        public String k() {
            return this.f16925k;
        }

        @Override // y2.j
        public x2.f l() {
            return this.f16927m;
        }

        @Override // y2.j
        public i m() {
            return this.f16926l;
        }
    }

    private j(long j10, m1 m1Var, List<y2.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4) {
        p3.a.a(!list.isEmpty());
        this.f16914a = j10;
        this.f16915b = m1Var;
        this.f16916c = q.F(list);
        this.f16918e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f16919f = list3;
        this.f16920g = list4;
        this.f16921h = kVar.a(this);
        this.f16917d = kVar.b();
    }

    public static j o(long j10, m1 m1Var, List<y2.b> list, k kVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j10, m1Var, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, m1Var, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String k();

    public abstract x2.f l();

    public abstract i m();

    public i n() {
        return this.f16921h;
    }
}
