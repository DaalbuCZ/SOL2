package com.google.protobuf;

import com.google.protobuf.u1;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements g1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f5995a;

    /* renamed from: b  reason: collision with root package name */
    private int f5996b;

    /* renamed from: c  reason: collision with root package name */
    private int f5997c;

    /* renamed from: d  reason: collision with root package name */
    private int f5998d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5999a;

        static {
            int[] iArr = new int[u1.b.values().length];
            f5999a = iArr;
            try {
                iArr[u1.b.f6126w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5999a[u1.b.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5999a[u1.b.f6119p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5999a[u1.b.C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5999a[u1.b.f6125v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5999a[u1.b.f6124u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5999a[u1.b.f6120q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5999a[u1.b.f6123t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5999a[u1.b.f6121r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5999a[u1.b.f6129z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5999a[u1.b.D.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5999a[u1.b.E.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5999a[u1.b.F.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5999a[u1.b.G.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5999a[u1.b.f6127x.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5999a[u1.b.B.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5999a[u1.b.f6122s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f5995a = iVar2;
        iVar2.f5981d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f5981d;
        return jVar != null ? jVar : new j(iVar);
    }

    private Object R(u1.b bVar, Class<?> cls, p pVar) {
        switch (a.f5999a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(r());
            case 2:
                return B();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(b());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(E());
            case 9:
                return Long.valueOf(L());
            case 10:
                return m(cls, pVar);
            case 11:
                return Integer.valueOf(G());
            case 12:
                return Long.valueOf(v());
            case 13:
                return Integer.valueOf(h());
            case 14:
                return Long.valueOf(k());
            case 15:
                return M();
            case 16:
                return Integer.valueOf(D());
            case 17:
                return Long.valueOf(d());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(h1<T> h1Var, p pVar) {
        int i10 = this.f5997c;
        this.f5997c = u1.c(u1.a(this.f5996b), 4);
        try {
            T h10 = h1Var.h();
            h1Var.e(h10, this, pVar);
            h1Var.c(h10);
            if (this.f5996b == this.f5997c) {
                return h10;
            }
            throw c0.h();
        } finally {
            this.f5997c = i10;
        }
    }

    private <T> T T(h1<T> h1Var, p pVar) {
        i iVar;
        int A = this.f5995a.A();
        i iVar2 = this.f5995a;
        if (iVar2.f5978a < iVar2.f5979b) {
            int j10 = iVar2.j(A);
            T h10 = h1Var.h();
            this.f5995a.f5978a++;
            h1Var.e(h10, this, pVar);
            h1Var.c(h10);
            this.f5995a.a(0);
            iVar.f5978a--;
            this.f5995a.i(j10);
            return h10;
        }
        throw c0.i();
    }

    private void V(int i10) {
        if (this.f5995a.d() != i10) {
            throw c0.k();
        }
    }

    private void W(int i10) {
        if (u1.b(this.f5996b) != i10) {
            throw c0.e();
        }
    }

    private void X(int i10) {
        if ((i10 & 3) != 0) {
            throw c0.h();
        }
    }

    private void Y(int i10) {
        if ((i10 & 7) != 0) {
            throw c0.h();
        }
    }

    @Override // com.google.protobuf.g1
    public <T> T A(h1<T> h1Var, p pVar) {
        W(3);
        return (T) S(h1Var, pVar);
    }

    @Override // com.google.protobuf.g1
    public h B() {
        W(2);
        return this.f5995a.l();
    }

    @Override // com.google.protobuf.g1
    public void C(List<Float> list) {
        int z10;
        int z11;
        if (!(list instanceof w)) {
            int b10 = u1.b(this.f5996b);
            if (b10 == 2) {
                int A = this.f5995a.A();
                X(A);
                int d10 = this.f5995a.d() + A;
                do {
                    list.add(Float.valueOf(this.f5995a.q()));
                } while (this.f5995a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                do {
                    list.add(Float.valueOf(this.f5995a.q()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            }
        }
        w wVar = (w) list;
        int b11 = u1.b(this.f5996b);
        if (b11 == 2) {
            int A2 = this.f5995a.A();
            X(A2);
            int d11 = this.f5995a.d() + A2;
            do {
                wVar.k(this.f5995a.q());
            } while (this.f5995a.d() < d11);
        } else if (b11 != 5) {
            throw c0.e();
        } else {
            do {
                wVar.k(this.f5995a.q());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
        }
    }

    @Override // com.google.protobuf.g1
    public int D() {
        W(0);
        return this.f5995a.A();
    }

    @Override // com.google.protobuf.g1
    public int E() {
        W(0);
        return this.f5995a.r();
    }

    @Override // com.google.protobuf.g1
    public boolean F() {
        int i10;
        if (this.f5995a.e() || (i10 = this.f5996b) == this.f5997c) {
            return false;
        }
        return this.f5995a.C(i10);
    }

    @Override // com.google.protobuf.g1
    public int G() {
        W(5);
        return this.f5995a.t();
    }

    @Override // com.google.protobuf.g1
    public void H(List<h> list) {
        int z10;
        if (u1.b(this.f5996b) != 2) {
            throw c0.e();
        }
        do {
            list.add(B());
            if (this.f5995a.e()) {
                return;
            }
            z10 = this.f5995a.z();
        } while (z10 == this.f5996b);
        this.f5998d = z10;
    }

    @Override // com.google.protobuf.g1
    public void I(List<Double> list) {
        int z10;
        int z11;
        if (!(list instanceof m)) {
            int b10 = u1.b(this.f5996b);
            if (b10 == 1) {
                do {
                    list.add(Double.valueOf(this.f5995a.m()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                int A = this.f5995a.A();
                Y(A);
                int d10 = this.f5995a.d() + A;
                do {
                    list.add(Double.valueOf(this.f5995a.m()));
                } while (this.f5995a.d() < d10);
                return;
            }
        }
        m mVar = (m) list;
        int b11 = u1.b(this.f5996b);
        if (b11 == 1) {
            do {
                mVar.k(this.f5995a.m());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
        } else if (b11 != 2) {
            throw c0.e();
        } else {
            int A2 = this.f5995a.A();
            Y(A2);
            int d11 = this.f5995a.d() + A2;
            do {
                mVar.k(this.f5995a.m());
            } while (this.f5995a.d() < d11);
        }
    }

    @Override // com.google.protobuf.g1
    public void J(List<Long> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    j0Var.l(this.f5995a.s());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    j0Var.l(this.f5995a.s());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f5995a.s()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Long.valueOf(this.f5995a.s()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    @Override // com.google.protobuf.g1
    public void K(List<Long> list) {
        int z10;
        int z11;
        if (!(list instanceof j0)) {
            int b10 = u1.b(this.f5996b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f5995a.u()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                int A = this.f5995a.A();
                Y(A);
                int d10 = this.f5995a.d() + A;
                do {
                    list.add(Long.valueOf(this.f5995a.u()));
                } while (this.f5995a.d() < d10);
                return;
            }
        }
        j0 j0Var = (j0) list;
        int b11 = u1.b(this.f5996b);
        if (b11 == 1) {
            do {
                j0Var.l(this.f5995a.u());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
        } else if (b11 != 2) {
            throw c0.e();
        } else {
            int A2 = this.f5995a.A();
            Y(A2);
            int d11 = this.f5995a.d() + A2;
            do {
                j0Var.l(this.f5995a.u());
            } while (this.f5995a.d() < d11);
        }
    }

    @Override // com.google.protobuf.g1
    public long L() {
        W(0);
        return this.f5995a.s();
    }

    @Override // com.google.protobuf.g1
    public String M() {
        W(2);
        return this.f5995a.y();
    }

    @Override // com.google.protobuf.g1
    public void N(List<Long> list) {
        int z10;
        int z11;
        if (!(list instanceof j0)) {
            int b10 = u1.b(this.f5996b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f5995a.p()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                int A = this.f5995a.A();
                Y(A);
                int d10 = this.f5995a.d() + A;
                do {
                    list.add(Long.valueOf(this.f5995a.p()));
                } while (this.f5995a.d() < d10);
                return;
            }
        }
        j0 j0Var = (j0) list;
        int b11 = u1.b(this.f5996b);
        if (b11 == 1) {
            do {
                j0Var.l(this.f5995a.p());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
        } else if (b11 != 2) {
            throw c0.e();
        } else {
            int A2 = this.f5995a.A();
            Y(A2);
            int d11 = this.f5995a.d() + A2;
            do {
                j0Var.l(this.f5995a.p());
            } while (this.f5995a.d() < d11);
        }
    }

    @Override // com.google.protobuf.g1
    public void O(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    zVar.r(this.f5995a.r());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    zVar.r(this.f5995a.r());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5995a.r()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Integer.valueOf(this.f5995a.r()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    @Override // com.google.protobuf.g1
    public void P(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    zVar.r(this.f5995a.n());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    zVar.r(this.f5995a.n());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5995a.n()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Integer.valueOf(this.f5995a.n()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    public void U(List<String> list, boolean z10) {
        int z11;
        int z12;
        if (u1.b(this.f5996b) != 2) {
            throw c0.e();
        }
        if (!(list instanceof h0) || z10) {
            do {
                list.add(z10 ? M() : o());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
            return;
        }
        h0 h0Var = (h0) list;
        do {
            h0Var.q(B());
            if (this.f5995a.e()) {
                return;
            }
            z12 = this.f5995a.z();
        } while (z12 == this.f5996b);
        this.f5998d = z12;
    }

    @Override // com.google.protobuf.g1
    public void a(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    zVar.r(this.f5995a.v());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    zVar.r(this.f5995a.v());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5995a.v()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Integer.valueOf(this.f5995a.v()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    @Override // com.google.protobuf.g1
    public int b() {
        W(0);
        return this.f5995a.n();
    }

    @Override // com.google.protobuf.g1
    public int c() {
        return this.f5996b;
    }

    @Override // com.google.protobuf.g1
    public long d() {
        W(0);
        return this.f5995a.B();
    }

    @Override // com.google.protobuf.g1
    public void e(List<Integer> list) {
        int z10;
        int z11;
        if (!(list instanceof z)) {
            int b10 = u1.b(this.f5996b);
            if (b10 == 2) {
                int A = this.f5995a.A();
                X(A);
                int d10 = this.f5995a.d() + A;
                do {
                    list.add(Integer.valueOf(this.f5995a.o()));
                } while (this.f5995a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f5995a.o()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            }
        }
        z zVar = (z) list;
        int b11 = u1.b(this.f5996b);
        if (b11 == 2) {
            int A2 = this.f5995a.A();
            X(A2);
            int d11 = this.f5995a.d() + A2;
            do {
                zVar.r(this.f5995a.o());
            } while (this.f5995a.d() < d11);
        } else if (b11 != 5) {
            throw c0.e();
        } else {
            do {
                zVar.r(this.f5995a.o());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
        }
    }

    @Override // com.google.protobuf.g1
    public long f() {
        W(1);
        return this.f5995a.p();
    }

    @Override // com.google.protobuf.g1
    public void g(List<Integer> list) {
        int z10;
        int z11;
        if (!(list instanceof z)) {
            int b10 = u1.b(this.f5996b);
            if (b10 == 2) {
                int A = this.f5995a.A();
                X(A);
                int d10 = this.f5995a.d() + A;
                do {
                    list.add(Integer.valueOf(this.f5995a.t()));
                } while (this.f5995a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f5995a.t()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            }
        }
        z zVar = (z) list;
        int b11 = u1.b(this.f5996b);
        if (b11 == 2) {
            int A2 = this.f5995a.A();
            X(A2);
            int d11 = this.f5995a.d() + A2;
            do {
                zVar.r(this.f5995a.t());
            } while (this.f5995a.d() < d11);
        } else if (b11 != 5) {
            throw c0.e();
        } else {
            do {
                zVar.r(this.f5995a.t());
                if (this.f5995a.e()) {
                    return;
                }
                z11 = this.f5995a.z();
            } while (z11 == this.f5996b);
            this.f5998d = z11;
        }
    }

    @Override // com.google.protobuf.g1
    public int h() {
        W(0);
        return this.f5995a.v();
    }

    @Override // com.google.protobuf.g1
    public void i(List<Long> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    j0Var.l(this.f5995a.w());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    j0Var.l(this.f5995a.w());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f5995a.w()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Long.valueOf(this.f5995a.w()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.g1
    public <T> void j(List<T> list, h1<T> h1Var, p pVar) {
        int z10;
        if (u1.b(this.f5996b) != 3) {
            throw c0.e();
        }
        int i10 = this.f5996b;
        do {
            list.add(S(h1Var, pVar));
            if (this.f5995a.e() || this.f5998d != 0) {
                return;
            }
            z10 = this.f5995a.z();
        } while (z10 == i10);
        this.f5998d = z10;
    }

    @Override // com.google.protobuf.g1
    public long k() {
        W(0);
        return this.f5995a.w();
    }

    @Override // com.google.protobuf.g1
    public void l(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    zVar.r(this.f5995a.A());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    zVar.r(this.f5995a.A());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5995a.A()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Integer.valueOf(this.f5995a.A()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    @Override // com.google.protobuf.g1
    public <T> T m(Class<T> cls, p pVar) {
        W(2);
        return (T) T(d1.a().d(cls), pVar);
    }

    @Override // com.google.protobuf.g1
    public void n(List<Boolean> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof f) {
            f fVar = (f) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    fVar.l(this.f5995a.k());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    fVar.l(this.f5995a.k());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5995a.k()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Boolean.valueOf(this.f5995a.k()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    @Override // com.google.protobuf.g1
    public String o() {
        W(2);
        return this.f5995a.x();
    }

    @Override // com.google.protobuf.g1
    public int p() {
        W(5);
        return this.f5995a.o();
    }

    @Override // com.google.protobuf.g1
    public <T> T q(Class<T> cls, p pVar) {
        W(3);
        return (T) S(d1.a().d(cls), pVar);
    }

    @Override // com.google.protobuf.g1
    public boolean r() {
        W(0);
        return this.f5995a.k();
    }

    @Override // com.google.protobuf.g1
    public double readDouble() {
        W(1);
        return this.f5995a.m();
    }

    @Override // com.google.protobuf.g1
    public float readFloat() {
        W(5);
        return this.f5995a.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.g1
    public <T> void s(List<T> list, h1<T> h1Var, p pVar) {
        int z10;
        if (u1.b(this.f5996b) != 2) {
            throw c0.e();
        }
        int i10 = this.f5996b;
        do {
            list.add(T(h1Var, pVar));
            if (this.f5995a.e() || this.f5998d != 0) {
                return;
            }
            z10 = this.f5995a.z();
        } while (z10 == i10);
        this.f5998d = z10;
    }

    @Override // com.google.protobuf.g1
    public int t() {
        int i10 = this.f5998d;
        if (i10 != 0) {
            this.f5996b = i10;
            this.f5998d = 0;
        } else {
            this.f5996b = this.f5995a.z();
        }
        int i11 = this.f5996b;
        if (i11 == 0 || i11 == this.f5997c) {
            return Integer.MAX_VALUE;
        }
        return u1.a(i11);
    }

    @Override // com.google.protobuf.g1
    public void u(List<String> list) {
        U(list, false);
    }

    @Override // com.google.protobuf.g1
    public long v() {
        W(1);
        return this.f5995a.u();
    }

    @Override // com.google.protobuf.g1
    public <T> T w(h1<T> h1Var, p pVar) {
        W(2);
        return (T) T(h1Var, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void x(java.util.Map<K, V> r8, com.google.protobuf.l0.a<K, V> r9, com.google.protobuf.p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            com.google.protobuf.i r1 = r7.f5995a
            int r1 = r1.A()
            com.google.protobuf.i r2 = r7.f5995a
            int r1 = r2.j(r1)
            K r2 = r9.f6045b
            V r3 = r9.f6047d
        L14:
            int r4 = r7.t()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.i r5 = r7.f5995a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.F()     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.c0 r4 = new com.google.protobuf.c0     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.u1$b r4 = r9.f6046c     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f6047d     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.u1$b r4 = r9.f6044a     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: com.google.protobuf.c0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.F()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.i r8 = r7.f5995a
            r8.i(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.i r9 = r7.f5995a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.x(java.util.Map, com.google.protobuf.l0$a, com.google.protobuf.p):void");
    }

    @Override // com.google.protobuf.g1
    public void y(List<Long> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f5996b);
            if (b10 == 0) {
                do {
                    j0Var.l(this.f5995a.B());
                    if (this.f5995a.e()) {
                        return;
                    }
                    z11 = this.f5995a.z();
                } while (z11 == this.f5996b);
                this.f5998d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    j0Var.l(this.f5995a.B());
                } while (this.f5995a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f5996b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f5995a.B()));
                    if (this.f5995a.e()) {
                        return;
                    }
                    z10 = this.f5995a.z();
                } while (z10 == this.f5996b);
                this.f5998d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f5995a.d() + this.f5995a.A();
                do {
                    list.add(Long.valueOf(this.f5995a.B()));
                } while (this.f5995a.d() < d10);
            }
        }
        V(d10);
    }

    @Override // com.google.protobuf.g1
    public void z(List<String> list) {
        U(list, true);
    }
}
