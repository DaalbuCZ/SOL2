package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.e0;
import com.google.protobuf.s0;
import com.google.protobuf.u.b;
import com.google.protobuf.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final u f6109d = new u(true);

    /* renamed from: a  reason: collision with root package name */
    private final k1<T, Object> f6110a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6111b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6112c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6113a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f6114b;

        static {
            int[] iArr = new int[u1.b.values().length];
            f6114b = iArr;
            try {
                iArr[u1.b.f6119p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6114b[u1.b.f6120q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6114b[u1.b.f6121r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6114b[u1.b.f6122s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6114b[u1.b.f6123t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6114b[u1.b.f6124u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6114b[u1.b.f6125v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6114b[u1.b.f6126w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6114b[u1.b.f6128y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6114b[u1.b.f6129z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6114b[u1.b.f6127x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6114b[u1.b.A.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6114b[u1.b.B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6114b[u1.b.D.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6114b[u1.b.E.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6114b[u1.b.F.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6114b[u1.b.G.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6114b[u1.b.C.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[u1.c.values().length];
            f6113a = iArr2;
            try {
                iArr2[u1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6113a[u1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6113a[u1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6113a[u1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6113a[u1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6113a[u1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f6113a[u1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6113a[u1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6113a[u1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int d();

        boolean f();

        u1.b i();

        s0.a k(s0.a aVar, s0 s0Var);

        u1.c n();

        boolean o();
    }

    private u() {
        this.f6110a = k1.q(16);
    }

    private u(k1<T, Object> k1Var) {
        this.f6110a = k1Var;
        t();
    }

    private u(boolean z10) {
        this(k1.q(0));
        t();
    }

    static void A(k kVar, u1.b bVar, Object obj) {
        switch (a.f6114b[bVar.ordinal()]) {
            case 1:
                kVar.o0(((Double) obj).doubleValue());
                return;
            case 2:
                kVar.w0(((Float) obj).floatValue());
                return;
            case 3:
                kVar.E0(((Long) obj).longValue());
                return;
            case 4:
                kVar.X0(((Long) obj).longValue());
                return;
            case 5:
                kVar.C0(((Integer) obj).intValue());
                return;
            case 6:
                kVar.u0(((Long) obj).longValue());
                return;
            case 7:
                kVar.s0(((Integer) obj).intValue());
                return;
            case 8:
                kVar.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                kVar.z0((s0) obj);
                return;
            case 10:
                kVar.G0((s0) obj);
                return;
            case 11:
                if (!(obj instanceof h)) {
                    kVar.S0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof h)) {
                    kVar.j0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                kVar.V0(((Integer) obj).intValue());
                return;
            case 14:
                kVar.K0(((Integer) obj).intValue());
                return;
            case 15:
                kVar.M0(((Long) obj).longValue());
                return;
            case 16:
                kVar.O0(((Integer) obj).intValue());
                return;
            case 17:
                kVar.Q0(((Long) obj).longValue());
                return;
            case 18:
                kVar.q0(obj instanceof a0.c ? ((a0.c) obj).d() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        kVar.m0((h) obj);
    }

    private static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(u1.b bVar, int i10, Object obj) {
        int U = k.U(i10);
        if (bVar == u1.b.f6128y) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(u1.b bVar, Object obj) {
        switch (a.f6114b[bVar.ordinal()]) {
            case 1:
                return k.j(((Double) obj).doubleValue());
            case 2:
                return k.r(((Float) obj).floatValue());
            case 3:
                return k.y(((Long) obj).longValue());
            case 4:
                return k.Y(((Long) obj).longValue());
            case 5:
                return k.w(((Integer) obj).intValue());
            case 6:
                return k.p(((Long) obj).longValue());
            case 7:
                return k.n(((Integer) obj).intValue());
            case 8:
                return k.e(((Boolean) obj).booleanValue());
            case 9:
                return k.t((s0) obj);
            case 10:
                return obj instanceof e0 ? k.B((e0) obj) : k.G((s0) obj);
            case 11:
                return obj instanceof h ? k.h((h) obj) : k.T((String) obj);
            case 12:
                return obj instanceof h ? k.h((h) obj) : k.f((byte[]) obj);
            case 13:
                return k.W(((Integer) obj).intValue());
            case 14:
                return k.L(((Integer) obj).intValue());
            case 15:
                return k.N(((Long) obj).longValue());
            case 16:
                return k.P(((Integer) obj).intValue());
            case 17:
                return k.R(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? k.l(((a0.c) obj).d()) : k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        u1.b i10 = bVar.i();
        int d10 = bVar.d();
        if (bVar.f()) {
            int i11 = 0;
            List<Object> list = (List) obj;
            if (bVar.o()) {
                for (Object obj2 : list) {
                    i11 += e(i10, obj2);
                }
                return k.U(d10) + i11 + k.J(i11);
            }
            for (Object obj3 : list) {
                i11 += d(i10, d10, obj3);
            }
            return i11;
        }
        return d(i10, d10, obj);
    }

    public static <T extends b<T>> u<T> h() {
        return f6109d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.n() != u1.c.MESSAGE || key.f() || key.o()) {
            return f(key, value);
        }
        boolean z10 = value instanceof e0;
        int d10 = entry.getKey().d();
        return z10 ? k.z(d10, (e0) value) : k.D(d10, (s0) value);
    }

    static int m(u1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.g();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.n() == u1.c.MESSAGE) {
            boolean f10 = key.f();
            Object value = entry.getValue();
            if (f10) {
                for (s0 s0Var : (List) value) {
                    if (!s0Var.u()) {
                        return false;
                    }
                }
            } else if (!(value instanceof s0)) {
                if (value instanceof e0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            } else if (!((s0) value).u()) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(u1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f6113a[bVar.e().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof s0) || (obj instanceof e0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        k1<T, Object> k1Var;
        Object c10;
        Object i10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof e0) {
            value = ((e0) value).f();
        }
        if (key.f()) {
            Object i11 = i(key);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) i11).add(c(obj));
            }
            this.f6110a.put(key, i11);
            return;
        }
        if (key.n() != u1.c.MESSAGE || (i10 = i(key)) == null) {
            k1Var = this.f6110a;
            c10 = c(value);
        } else {
            c10 = key.k(((s0) i10).g(), (s0) value).a();
            k1Var = this.f6110a;
        }
        k1Var.put(key, c10);
    }

    public static <T extends b<T>> u<T> w() {
        return new u<>();
    }

    private void y(T t10, Object obj) {
        if (!r(t10.i(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.d()), t10.i().e(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z(k kVar, u1.b bVar, int i10, Object obj) {
        if (bVar == u1.b.f6128y) {
            kVar.x0(i10, (s0) obj);
            return;
        }
        kVar.T0(i10, m(bVar, false));
        A(kVar, bVar, obj);
    }

    public void a(T t10, Object obj) {
        List list;
        if (!t10.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t10, obj);
        Object i10 = i(t10);
        if (i10 == null) {
            list = new ArrayList();
            this.f6110a.put(t10, list);
        } else {
            list = (List) i10;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public u<T> clone() {
        u<T> w10 = w();
        for (int i10 = 0; i10 < this.f6110a.k(); i10++) {
            Map.Entry<T, Object> j10 = this.f6110a.j(i10);
            w10.x(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f6110a.m()) {
            w10.x(entry.getKey(), entry.getValue());
        }
        w10.f6112c = this.f6112c;
        return w10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f6110a.equals(((u) obj).f6110a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.f6112c ? new e0.c(this.f6110a.h().iterator()) : this.f6110a.h().iterator();
    }

    public int hashCode() {
        return this.f6110a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f6110a.get(t10);
        return obj instanceof e0 ? ((e0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6110a.k(); i11++) {
            i10 += k(this.f6110a.j(i11));
        }
        for (Map.Entry<T, Object> entry : this.f6110a.m()) {
            i10 += k(entry);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6110a.k(); i11++) {
            Map.Entry<T, Object> j10 = this.f6110a.j(i11);
            i10 += f(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f6110a.m()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f6110a.isEmpty();
    }

    public boolean o() {
        return this.f6111b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f6110a.k(); i10++) {
            if (!q(this.f6110a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f6110a.m()) {
            if (!q(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f6112c ? new e0.c(this.f6110a.entrySet().iterator()) : this.f6110a.entrySet().iterator();
    }

    public void t() {
        if (this.f6111b) {
            return;
        }
        this.f6110a.p();
        this.f6111b = true;
    }

    public void u(u<T> uVar) {
        for (int i10 = 0; i10 < uVar.f6110a.k(); i10++) {
            v(uVar.f6110a.j(i10));
        }
        for (Map.Entry<T, Object> entry : uVar.f6110a.m()) {
            v(entry);
        }
    }

    public void x(T t10, Object obj) {
        if (!t10.f()) {
            y(t10, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object obj2 : arrayList) {
                y(t10, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof e0) {
            this.f6112c = true;
        }
        this.f6110a.put(t10, obj);
    }
}
