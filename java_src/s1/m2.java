package s1;

import java.util.List;
import u2.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: s  reason: collision with root package name */
    private static final u.b f13615s = new u.b(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final l3 f13616a;

    /* renamed from: b  reason: collision with root package name */
    public final u.b f13617b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13618c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13619d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13620e;

    /* renamed from: f  reason: collision with root package name */
    public final q f13621f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13622g;

    /* renamed from: h  reason: collision with root package name */
    public final u2.v0 f13623h;

    /* renamed from: i  reason: collision with root package name */
    public final n3.d0 f13624i;

    /* renamed from: j  reason: collision with root package name */
    public final List<k2.a> f13625j;

    /* renamed from: k  reason: collision with root package name */
    public final u.b f13626k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f13627l;

    /* renamed from: m  reason: collision with root package name */
    public final int f13628m;

    /* renamed from: n  reason: collision with root package name */
    public final o2 f13629n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f13630o;

    /* renamed from: p  reason: collision with root package name */
    public volatile long f13631p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f13632q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f13633r;

    public m2(l3 l3Var, u.b bVar, long j10, long j11, int i10, q qVar, boolean z10, u2.v0 v0Var, n3.d0 d0Var, List<k2.a> list, u.b bVar2, boolean z11, int i11, o2 o2Var, long j12, long j13, long j14, boolean z12) {
        this.f13616a = l3Var;
        this.f13617b = bVar;
        this.f13618c = j10;
        this.f13619d = j11;
        this.f13620e = i10;
        this.f13621f = qVar;
        this.f13622g = z10;
        this.f13623h = v0Var;
        this.f13624i = d0Var;
        this.f13625j = list;
        this.f13626k = bVar2;
        this.f13627l = z11;
        this.f13628m = i11;
        this.f13629n = o2Var;
        this.f13631p = j12;
        this.f13632q = j13;
        this.f13633r = j14;
        this.f13630o = z12;
    }

    public static m2 j(n3.d0 d0Var) {
        l3 l3Var = l3.f13539n;
        u.b bVar = f13615s;
        return new m2(l3Var, bVar, -9223372036854775807L, 0L, 1, null, false, u2.v0.f15373q, d0Var, b5.q.J(), bVar, false, 0, o2.f13648q, 0L, 0L, 0L, false);
    }

    public static u.b k() {
        return f13615s;
    }

    public m2 a(boolean z10) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, this.f13621f, z10, this.f13623h, this.f13624i, this.f13625j, this.f13626k, this.f13627l, this.f13628m, this.f13629n, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }

    public m2 b(u.b bVar) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, this.f13621f, this.f13622g, this.f13623h, this.f13624i, this.f13625j, bVar, this.f13627l, this.f13628m, this.f13629n, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }

    public m2 c(u.b bVar, long j10, long j11, long j12, long j13, u2.v0 v0Var, n3.d0 d0Var, List<k2.a> list) {
        return new m2(this.f13616a, bVar, j11, j12, this.f13620e, this.f13621f, this.f13622g, v0Var, d0Var, list, this.f13626k, this.f13627l, this.f13628m, this.f13629n, this.f13631p, j13, j10, this.f13630o);
    }

    public m2 d(boolean z10, int i10) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, this.f13621f, this.f13622g, this.f13623h, this.f13624i, this.f13625j, this.f13626k, z10, i10, this.f13629n, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }

    public m2 e(q qVar) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, qVar, this.f13622g, this.f13623h, this.f13624i, this.f13625j, this.f13626k, this.f13627l, this.f13628m, this.f13629n, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }

    public m2 f(o2 o2Var) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, this.f13621f, this.f13622g, this.f13623h, this.f13624i, this.f13625j, this.f13626k, this.f13627l, this.f13628m, o2Var, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }

    public m2 g(int i10) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, i10, this.f13621f, this.f13622g, this.f13623h, this.f13624i, this.f13625j, this.f13626k, this.f13627l, this.f13628m, this.f13629n, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }

    public m2 h(boolean z10) {
        return new m2(this.f13616a, this.f13617b, this.f13618c, this.f13619d, this.f13620e, this.f13621f, this.f13622g, this.f13623h, this.f13624i, this.f13625j, this.f13626k, this.f13627l, this.f13628m, this.f13629n, this.f13631p, this.f13632q, this.f13633r, z10);
    }

    public m2 i(l3 l3Var) {
        return new m2(l3Var, this.f13617b, this.f13618c, this.f13619d, this.f13620e, this.f13621f, this.f13622g, this.f13623h, this.f13624i, this.f13625j, this.f13626k, this.f13627l, this.f13628m, this.f13629n, this.f13631p, this.f13632q, this.f13633r, this.f13630o);
    }
}
