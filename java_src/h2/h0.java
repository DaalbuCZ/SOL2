package h2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import h2.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p3.m0;
import s1.h2;
import x1.b0;
/* loaded from: classes.dex */
public final class h0 implements x1.l {

    /* renamed from: t  reason: collision with root package name */
    public static final x1.r f7800t = g0.f7786b;

    /* renamed from: a  reason: collision with root package name */
    private final int f7801a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7802b;

    /* renamed from: c  reason: collision with root package name */
    private final List<p3.i0> f7803c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.a0 f7804d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseIntArray f7805e;

    /* renamed from: f  reason: collision with root package name */
    private final i0.c f7806f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<i0> f7807g;

    /* renamed from: h  reason: collision with root package name */
    private final SparseBooleanArray f7808h;

    /* renamed from: i  reason: collision with root package name */
    private final SparseBooleanArray f7809i;

    /* renamed from: j  reason: collision with root package name */
    private final f0 f7810j;

    /* renamed from: k  reason: collision with root package name */
    private e0 f7811k;

    /* renamed from: l  reason: collision with root package name */
    private x1.n f7812l;

    /* renamed from: m  reason: collision with root package name */
    private int f7813m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7814n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7815o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7816p;

    /* renamed from: q  reason: collision with root package name */
    private i0 f7817q;

    /* renamed from: r  reason: collision with root package name */
    private int f7818r;

    /* renamed from: s  reason: collision with root package name */
    private int f7819s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final p3.z f7820a = new p3.z(new byte[4]);

        public a() {
        }

        @Override // h2.b0
        public void a(p3.a0 a0Var) {
            if (a0Var.C() == 0 && (a0Var.C() & 128) != 0) {
                a0Var.P(6);
                int a10 = a0Var.a() / 4;
                for (int i10 = 0; i10 < a10; i10++) {
                    a0Var.i(this.f7820a, 4);
                    int h10 = this.f7820a.h(16);
                    this.f7820a.r(3);
                    if (h10 == 0) {
                        this.f7820a.r(13);
                    } else {
                        int h11 = this.f7820a.h(13);
                        if (h0.this.f7807g.get(h11) == null) {
                            h0.this.f7807g.put(h11, new c0(new b(h11)));
                            h0.l(h0.this);
                        }
                    }
                }
                if (h0.this.f7801a != 2) {
                    h0.this.f7807g.remove(0);
                }
            }
        }

        @Override // h2.b0
        public void c(p3.i0 i0Var, x1.n nVar, i0.d dVar) {
        }
    }

    /* loaded from: classes.dex */
    private class b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final p3.z f7822a = new p3.z(new byte[5]);

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<i0> f7823b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        private final SparseIntArray f7824c = new SparseIntArray();

        /* renamed from: d  reason: collision with root package name */
        private final int f7825d;

        public b(int i10) {
            this.f7825d = i10;
        }

        private i0.b b(p3.a0 a0Var, int i10) {
            int e10 = a0Var.e();
            int i11 = i10 + e10;
            String str = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (a0Var.e() < i11) {
                int C = a0Var.C();
                int e11 = a0Var.e() + a0Var.C();
                if (e11 > i11) {
                    break;
                }
                if (C == 5) {
                    long E = a0Var.E();
                    if (E != 1094921523) {
                        if (E != 1161904947) {
                            if (E != 1094921524) {
                                if (E == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (C != 106) {
                        if (C != 122) {
                            if (C == 127) {
                                if (a0Var.C() != 21) {
                                }
                                i12 = 172;
                            } else if (C == 123) {
                                i12 = 138;
                            } else if (C == 10) {
                                str = a0Var.z(3).trim();
                            } else if (C == 89) {
                                arrayList = new ArrayList();
                                while (a0Var.e() < e11) {
                                    String trim = a0Var.z(3).trim();
                                    int C2 = a0Var.C();
                                    byte[] bArr = new byte[4];
                                    a0Var.j(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, C2, bArr));
                                }
                                i12 = 89;
                            } else if (C == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                a0Var.P(e11 - a0Var.e());
            }
            a0Var.O(i11);
            return new i0.b(i12, str, arrayList, Arrays.copyOfRange(a0Var.d(), e10, i11));
        }

        @Override // h2.b0
        public void a(p3.a0 a0Var) {
            p3.i0 i0Var;
            if (a0Var.C() != 2) {
                return;
            }
            if (h0.this.f7801a == 1 || h0.this.f7801a == 2 || h0.this.f7813m == 1) {
                i0Var = (p3.i0) h0.this.f7803c.get(0);
            } else {
                i0Var = new p3.i0(((p3.i0) h0.this.f7803c.get(0)).c());
                h0.this.f7803c.add(i0Var);
            }
            if ((a0Var.C() & 128) == 0) {
                return;
            }
            a0Var.P(1);
            int I = a0Var.I();
            int i10 = 3;
            a0Var.P(3);
            a0Var.i(this.f7822a, 2);
            this.f7822a.r(3);
            int i11 = 13;
            h0.this.f7819s = this.f7822a.h(13);
            a0Var.i(this.f7822a, 2);
            int i12 = 4;
            this.f7822a.r(4);
            a0Var.P(this.f7822a.h(12));
            if (h0.this.f7801a == 2 && h0.this.f7817q == null) {
                i0.b bVar = new i0.b(21, null, null, m0.f12311f);
                h0 h0Var = h0.this;
                h0Var.f7817q = h0Var.f7806f.b(21, bVar);
                if (h0.this.f7817q != null) {
                    h0.this.f7817q.c(i0Var, h0.this.f7812l, new i0.d(I, 21, 8192));
                }
            }
            this.f7823b.clear();
            this.f7824c.clear();
            int a10 = a0Var.a();
            while (a10 > 0) {
                a0Var.i(this.f7822a, 5);
                int h10 = this.f7822a.h(8);
                this.f7822a.r(i10);
                int h11 = this.f7822a.h(i11);
                this.f7822a.r(i12);
                int h12 = this.f7822a.h(12);
                i0.b b10 = b(a0Var, h12);
                if (h10 == 6 || h10 == 5) {
                    h10 = b10.f7852a;
                }
                a10 -= h12 + 5;
                int i13 = h0.this.f7801a == 2 ? h10 : h11;
                if (!h0.this.f7808h.get(i13)) {
                    i0 b11 = (h0.this.f7801a == 2 && h10 == 21) ? h0.this.f7817q : h0.this.f7806f.b(h10, b10);
                    if (h0.this.f7801a != 2 || h11 < this.f7824c.get(i13, 8192)) {
                        this.f7824c.put(i13, h11);
                        this.f7823b.put(i13, b11);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f7824c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f7824c.keyAt(i14);
                int valueAt = this.f7824c.valueAt(i14);
                h0.this.f7808h.put(keyAt, true);
                h0.this.f7809i.put(valueAt, true);
                i0 valueAt2 = this.f7823b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != h0.this.f7817q) {
                        valueAt2.c(i0Var, h0.this.f7812l, new i0.d(I, keyAt, 8192));
                    }
                    h0.this.f7807g.put(valueAt, valueAt2);
                }
            }
            if (h0.this.f7801a != 2) {
                h0.this.f7807g.remove(this.f7825d);
                h0 h0Var2 = h0.this;
                h0Var2.f7813m = h0Var2.f7801a == 1 ? 0 : h0.this.f7813m - 1;
                if (h0.this.f7813m != 0) {
                    return;
                }
                h0.this.f7812l.i();
            } else if (h0.this.f7814n) {
                return;
            } else {
                h0.this.f7812l.i();
                h0.this.f7813m = 0;
            }
            h0.this.f7814n = true;
        }

        @Override // h2.b0
        public void c(p3.i0 i0Var, x1.n nVar, i0.d dVar) {
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i10) {
        this(1, i10, 112800);
    }

    public h0(int i10, int i11, int i12) {
        this(i10, new p3.i0(0L), new j(i11), i12);
    }

    public h0(int i10, p3.i0 i0Var, i0.c cVar) {
        this(i10, i0Var, cVar, 112800);
    }

    public h0(int i10, p3.i0 i0Var, i0.c cVar, int i11) {
        this.f7806f = (i0.c) p3.a.e(cVar);
        this.f7802b = i11;
        this.f7801a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f7803c = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f7803c = arrayList;
            arrayList.add(i0Var);
        }
        this.f7804d = new p3.a0(new byte[9400], 0);
        this.f7808h = new SparseBooleanArray();
        this.f7809i = new SparseBooleanArray();
        this.f7807g = new SparseArray<>();
        this.f7805e = new SparseIntArray();
        this.f7810j = new f0(i11);
        this.f7812l = x1.n.f16274m;
        this.f7819s = -1;
        z();
    }

    private boolean A(int i10) {
        return this.f7801a == 2 || this.f7814n || !this.f7809i.get(i10, false);
    }

    static /* synthetic */ int l(h0 h0Var) {
        int i10 = h0Var.f7813m;
        h0Var.f7813m = i10 + 1;
        return i10;
    }

    private boolean v(x1.m mVar) {
        byte[] d10 = this.f7804d.d();
        if (9400 - this.f7804d.e() < 188) {
            int a10 = this.f7804d.a();
            if (a10 > 0) {
                System.arraycopy(d10, this.f7804d.e(), d10, 0, a10);
            }
            this.f7804d.M(d10, a10);
        }
        while (this.f7804d.a() < 188) {
            int f10 = this.f7804d.f();
            int b10 = mVar.b(d10, f10, 9400 - f10);
            if (b10 == -1) {
                return false;
            }
            this.f7804d.N(f10 + b10);
        }
        return true;
    }

    private int w() {
        int e10 = this.f7804d.e();
        int f10 = this.f7804d.f();
        int a10 = j0.a(this.f7804d.d(), e10, f10);
        this.f7804d.O(a10);
        int i10 = a10 + 188;
        if (i10 > f10) {
            int i11 = this.f7818r + (a10 - e10);
            this.f7818r = i11;
            if (this.f7801a == 2 && i11 > 376) {
                throw h2.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f7818r = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x1.l[] x() {
        return new x1.l[]{new h0()};
    }

    private void y(long j10) {
        x1.n nVar;
        x1.b0 bVar;
        if (this.f7815o) {
            return;
        }
        this.f7815o = true;
        if (this.f7810j.b() != -9223372036854775807L) {
            e0 e0Var = new e0(this.f7810j.c(), this.f7810j.b(), j10, this.f7819s, this.f7802b);
            this.f7811k = e0Var;
            nVar = this.f7812l;
            bVar = e0Var.b();
        } else {
            nVar = this.f7812l;
            bVar = new b0.b(this.f7810j.b());
        }
        nVar.t(bVar);
    }

    private void z() {
        this.f7808h.clear();
        this.f7807g.clear();
        SparseArray<i0> a10 = this.f7806f.a();
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7807g.put(a10.keyAt(i10), a10.valueAt(i10));
        }
        this.f7807g.put(0, new c0(new a()));
        this.f7817q = null;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        e0 e0Var;
        p3.a.f(this.f7801a != 2);
        int size = this.f7803c.size();
        for (int i10 = 0; i10 < size; i10++) {
            p3.i0 i0Var = this.f7803c.get(i10);
            boolean z10 = i0Var.e() == -9223372036854775807L;
            if (!z10) {
                long c10 = i0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                i0Var.g(j11);
            }
        }
        if (j11 != 0 && (e0Var = this.f7811k) != null) {
            e0Var.h(j11);
        }
        this.f7804d.K(0);
        this.f7805e.clear();
        for (int i11 = 0; i11 < this.f7807g.size(); i11++) {
            this.f7807g.valueAt(i11).b();
        }
        this.f7818r = 0;
    }

    @Override // x1.l
    public void c(x1.n nVar) {
        this.f7812l = nVar;
    }

    @Override // x1.l
    public int i(x1.m mVar, x1.a0 a0Var) {
        long a10 = mVar.a();
        if (this.f7814n) {
            if (((a10 == -1 || this.f7801a == 2) ? false : true) && !this.f7810j.d()) {
                return this.f7810j.e(mVar, a0Var, this.f7819s);
            }
            y(a10);
            if (this.f7816p) {
                this.f7816p = false;
                b(0L, 0L);
                if (mVar.q() != 0) {
                    a0Var.f16188a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f7811k;
            if (e0Var != null && e0Var.d()) {
                return this.f7811k.c(mVar, a0Var);
            }
        }
        if (v(mVar)) {
            int w10 = w();
            int f10 = this.f7804d.f();
            if (w10 > f10) {
                return 0;
            }
            int m10 = this.f7804d.m();
            if ((8388608 & m10) == 0) {
                int i10 = ((4194304 & m10) != 0 ? 1 : 0) | 0;
                int i11 = (2096896 & m10) >> 8;
                boolean z10 = (m10 & 32) != 0;
                i0 i0Var = (m10 & 16) != 0 ? this.f7807g.get(i11) : null;
                if (i0Var != null) {
                    if (this.f7801a != 2) {
                        int i12 = m10 & 15;
                        int i13 = this.f7805e.get(i11, i12 - 1);
                        this.f7805e.put(i11, i12);
                        if (i13 != i12) {
                            if (i12 != ((i13 + 1) & 15)) {
                                i0Var.b();
                            }
                        }
                    }
                    if (z10) {
                        int C = this.f7804d.C();
                        i10 |= (this.f7804d.C() & 64) != 0 ? 2 : 0;
                        this.f7804d.P(C - 1);
                    }
                    boolean z11 = this.f7814n;
                    if (A(i11)) {
                        this.f7804d.N(w10);
                        i0Var.a(this.f7804d, i10);
                        this.f7804d.N(f10);
                    }
                    if (this.f7801a != 2 && !z11 && this.f7814n && a10 != -1) {
                        this.f7816p = true;
                    }
                }
            }
            this.f7804d.O(w10);
            return 0;
        }
        return -1;
    }

    @Override // x1.l
    public boolean j(x1.m mVar) {
        boolean z10;
        byte[] d10 = this.f7804d.d();
        mVar.o(d10, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                } else if (d10[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                mVar.h(i10);
                return true;
            }
        }
        return false;
    }
}
