package h2;

import android.util.SparseArray;
import h2.i0;
import java.util.ArrayList;
import java.util.List;
import s1.m1;
/* loaded from: classes.dex */
public final class j implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f7861a;

    /* renamed from: b  reason: collision with root package name */
    private final List<m1> f7862b;

    public j(int i10) {
        this(i10, b5.q.J());
    }

    public j(int i10, List<m1> list) {
        this.f7861a = i10;
        this.f7862b = list;
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<m1> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f7862b;
        }
        p3.a0 a0Var = new p3.a0(bVar.f7855d);
        List<m1> list = this.f7862b;
        while (a0Var.a() > 0) {
            int C = a0Var.C();
            int e10 = a0Var.e() + a0Var.C();
            if (C == 134) {
                list = new ArrayList<>();
                int C2 = a0Var.C() & 31;
                for (int i11 = 0; i11 < C2; i11++) {
                    String z10 = a0Var.z(3);
                    int C3 = a0Var.C();
                    boolean z11 = (C3 & 128) != 0;
                    if (z11) {
                        i10 = C3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte C4 = (byte) a0Var.C();
                    a0Var.P(1);
                    List<byte[]> list2 = null;
                    if (z11) {
                        list2 = p3.e.b((C4 & 64) != 0);
                    }
                    list.add(new m1.b().e0(str).V(z10).F(i10).T(list2).E());
                }
            }
            a0Var.O(e10);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f7861a) != 0;
    }

    @Override // h2.i0.c
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    @Override // h2.i0.c
    public i0 b(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f7853b));
            }
            if (i10 != 21) {
                if (i10 == 27) {
                    if (f(4)) {
                        return null;
                    }
                    return new w(new p(c(bVar), f(1), f(8)));
                } else if (i10 != 36) {
                    if (i10 != 89) {
                        if (i10 != 138) {
                            if (i10 != 172) {
                                if (i10 != 257) {
                                    if (i10 == 134) {
                                        if (f(16)) {
                                            return null;
                                        }
                                        return new c0(new v("application/x-scte35"));
                                    }
                                    if (i10 != 135) {
                                        switch (i10) {
                                            case 15:
                                                if (f(2)) {
                                                    return null;
                                                }
                                                return new w(new i(false, bVar.f7853b));
                                            case 16:
                                                return new w(new o(d(bVar)));
                                            case 17:
                                                if (f(2)) {
                                                    return null;
                                                }
                                                return new w(new s(bVar.f7853b));
                                            default:
                                                switch (i10) {
                                                    case 128:
                                                        break;
                                                    case 129:
                                                        break;
                                                    case 130:
                                                        if (!f(64)) {
                                                            return null;
                                                        }
                                                        break;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return new w(new c(bVar.f7853b));
                                }
                                return new c0(new v("application/vnd.dvb.ait"));
                            }
                            return new w(new f(bVar.f7853b));
                        }
                        return new w(new k(bVar.f7853b));
                    }
                    return new w(new l(bVar.f7854c));
                } else {
                    return new w(new q(c(bVar)));
                }
            }
            return new w(new r());
        }
        return new w(new n(d(bVar)));
    }
}
