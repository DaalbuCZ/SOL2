package f7;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: x  reason: collision with root package name */
    private static final m7.a<?> f7283x = m7.a.a(Object.class);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<m7.a<?>, f<?>>> f7284a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<m7.a<?>, w<?>> f7285b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final h7.c f7286c;

    /* renamed from: d  reason: collision with root package name */
    private final i7.e f7287d;

    /* renamed from: e  reason: collision with root package name */
    final List<x> f7288e;

    /* renamed from: f  reason: collision with root package name */
    final h7.d f7289f;

    /* renamed from: g  reason: collision with root package name */
    final f7.d f7290g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Type, g<?>> f7291h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f7292i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f7293j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f7294k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f7295l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f7296m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f7297n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f7298o;

    /* renamed from: p  reason: collision with root package name */
    final String f7299p;

    /* renamed from: q  reason: collision with root package name */
    final int f7300q;

    /* renamed from: r  reason: collision with root package name */
    final int f7301r;

    /* renamed from: s  reason: collision with root package name */
    final t f7302s;

    /* renamed from: t  reason: collision with root package name */
    final List<x> f7303t;

    /* renamed from: u  reason: collision with root package name */
    final List<x> f7304u;

    /* renamed from: v  reason: collision with root package name */
    final v f7305v;

    /* renamed from: w  reason: collision with root package name */
    final v f7306w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w<Number> {
        a() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Double c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return Double.valueOf(aVar.E());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            if (number == null) {
                cVar.D();
                return;
            }
            e.d(number.doubleValue());
            cVar.b0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends w<Number> {
        b() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Float c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return Float.valueOf((float) aVar.E());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            if (number == null) {
                cVar.D();
                return;
            }
            e.d(number.floatValue());
            cVar.b0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends w<Number> {
        c() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return Long.valueOf(aVar.N());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            if (number == null) {
                cVar.D();
            } else {
                cVar.c0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends w<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f7309a;

        d(w wVar) {
            this.f7309a = wVar;
        }

        @Override // f7.w
        /* renamed from: f */
        public AtomicLong c(n7.a aVar) {
            return new AtomicLong(((Number) this.f7309a.c(aVar)).longValue());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, AtomicLong atomicLong) {
            this.f7309a.e(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f7.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0108e extends w<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f7310a;

        C0108e(w wVar) {
            this.f7310a = wVar;
        }

        @Override // f7.w
        /* renamed from: f */
        public AtomicLongArray c(n7.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.r()) {
                arrayList.add(Long.valueOf(((Number) this.f7310a.c(aVar)).longValue()));
            }
            aVar.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, AtomicLongArray atomicLongArray) {
            cVar.c();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f7310a.e(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f<T> extends w<T> {

        /* renamed from: a  reason: collision with root package name */
        private w<T> f7311a;

        f() {
        }

        @Override // f7.w
        public T c(n7.a aVar) {
            w<T> wVar = this.f7311a;
            if (wVar != null) {
                return wVar.c(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // f7.w
        public void e(n7.c cVar, T t10) {
            w<T> wVar = this.f7311a;
            if (wVar == null) {
                throw new IllegalStateException();
            }
            wVar.e(cVar, t10);
        }

        public void f(w<T> wVar) {
            if (this.f7311a != null) {
                throw new AssertionError();
            }
            this.f7311a = wVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(h7.d dVar, f7.d dVar2, Map<Type, g<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, t tVar, String str, int i10, int i11, List<x> list, List<x> list2, List<x> list3, v vVar, v vVar2) {
        this.f7289f = dVar;
        this.f7290g = dVar2;
        this.f7291h = map;
        h7.c cVar = new h7.c(map);
        this.f7286c = cVar;
        this.f7292i = z10;
        this.f7293j = z11;
        this.f7294k = z12;
        this.f7295l = z13;
        this.f7296m = z14;
        this.f7297n = z15;
        this.f7298o = z16;
        this.f7302s = tVar;
        this.f7299p = str;
        this.f7300q = i10;
        this.f7301r = i11;
        this.f7303t = list;
        this.f7304u = list2;
        this.f7305v = vVar;
        this.f7306w = vVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(i7.n.V);
        arrayList.add(i7.j.f(vVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(i7.n.B);
        arrayList.add(i7.n.f8420m);
        arrayList.add(i7.n.f8414g);
        arrayList.add(i7.n.f8416i);
        arrayList.add(i7.n.f8418k);
        w<Number> m10 = m(tVar);
        arrayList.add(i7.n.b(Long.TYPE, Long.class, m10));
        arrayList.add(i7.n.b(Double.TYPE, Double.class, e(z16)));
        arrayList.add(i7.n.b(Float.TYPE, Float.class, f(z16)));
        arrayList.add(i7.i.f(vVar2));
        arrayList.add(i7.n.f8422o);
        arrayList.add(i7.n.f8424q);
        arrayList.add(i7.n.a(AtomicLong.class, b(m10)));
        arrayList.add(i7.n.a(AtomicLongArray.class, c(m10)));
        arrayList.add(i7.n.f8426s);
        arrayList.add(i7.n.f8431x);
        arrayList.add(i7.n.D);
        arrayList.add(i7.n.F);
        arrayList.add(i7.n.a(BigDecimal.class, i7.n.f8433z));
        arrayList.add(i7.n.a(BigInteger.class, i7.n.A));
        arrayList.add(i7.n.H);
        arrayList.add(i7.n.J);
        arrayList.add(i7.n.N);
        arrayList.add(i7.n.P);
        arrayList.add(i7.n.T);
        arrayList.add(i7.n.L);
        arrayList.add(i7.n.f8411d);
        arrayList.add(i7.c.f8356b);
        arrayList.add(i7.n.R);
        if (l7.d.f11181a) {
            arrayList.add(l7.d.f11185e);
            arrayList.add(l7.d.f11184d);
            arrayList.add(l7.d.f11186f);
        }
        arrayList.add(i7.a.f8350c);
        arrayList.add(i7.n.f8409b);
        arrayList.add(new i7.b(cVar));
        arrayList.add(new i7.h(cVar, z11));
        i7.e eVar = new i7.e(cVar);
        this.f7287d = eVar;
        arrayList.add(eVar);
        arrayList.add(i7.n.W);
        arrayList.add(new i7.k(cVar, dVar2, dVar, eVar));
        this.f7288e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, n7.a aVar) {
        if (obj != null) {
            try {
                if (aVar.Z() == n7.b.END_DOCUMENT) {
                    return;
                }
                throw new l("JSON document was not fully consumed.");
            } catch (n7.d e10) {
                throw new s(e10);
            } catch (IOException e11) {
                throw new l(e11);
            }
        }
    }

    private static w<AtomicLong> b(w<Number> wVar) {
        return new d(wVar).b();
    }

    private static w<AtomicLongArray> c(w<Number> wVar) {
        return new C0108e(wVar).b();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private w<Number> e(boolean z10) {
        return z10 ? i7.n.f8429v : new a();
    }

    private w<Number> f(boolean z10) {
        return z10 ? i7.n.f8428u : new b();
    }

    private static w<Number> m(t tVar) {
        return tVar == t.f7334n ? i7.n.f8427t : new c();
    }

    public <T> T g(Reader reader, Type type) {
        n7.a n10 = n(reader);
        T t10 = (T) i(n10, type);
        a(t10, n10);
        return t10;
    }

    public <T> T h(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) g(new StringReader(str), type);
    }

    public <T> T i(n7.a aVar, Type type) {
        boolean t10 = aVar.t();
        boolean z10 = true;
        aVar.e0(true);
        try {
            try {
                try {
                    aVar.Z();
                    z10 = false;
                    T c10 = k(m7.a.b(type)).c(aVar);
                    aVar.e0(t10);
                    return c10;
                } catch (AssertionError e10) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e10.getMessage());
                    assertionError.initCause(e10);
                    throw assertionError;
                } catch (IllegalStateException e11) {
                    throw new s(e11);
                }
            } catch (EOFException e12) {
                if (z10) {
                    aVar.e0(t10);
                    return null;
                }
                throw new s(e12);
            } catch (IOException e13) {
                throw new s(e13);
            }
        } catch (Throwable th) {
            aVar.e0(t10);
            throw th;
        }
    }

    public <T> w<T> j(Class<T> cls) {
        return k(m7.a.a(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> w<T> k(m7.a<T> aVar) {
        w<T> wVar = (w<T>) this.f7285b.get(aVar == null ? f7283x : aVar);
        if (wVar != null) {
            return wVar;
        }
        Map<m7.a<?>, f<?>> map = this.f7284a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f7284a.set(map);
            z10 = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (x xVar : this.f7288e) {
                w wVar2 = (w<T>) xVar.create(this, aVar);
                if (wVar2 != null) {
                    fVar2.f(wVar2);
                    this.f7285b.put(aVar, wVar2);
                    return wVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z10) {
                this.f7284a.remove();
            }
        }
    }

    public <T> w<T> l(x xVar, m7.a<T> aVar) {
        if (!this.f7288e.contains(xVar)) {
            xVar = this.f7287d;
        }
        boolean z10 = false;
        for (x xVar2 : this.f7288e) {
            if (z10) {
                w<T> create = xVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (xVar2 == xVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public n7.a n(Reader reader) {
        n7.a aVar = new n7.a(reader);
        aVar.e0(this.f7297n);
        return aVar;
    }

    public n7.c o(Writer writer) {
        if (this.f7294k) {
            writer.write(")]}'\n");
        }
        n7.c cVar = new n7.c(writer);
        if (this.f7296m) {
            cVar.S("  ");
        }
        cVar.X(this.f7292i);
        return cVar;
    }

    public String p(k kVar) {
        StringWriter stringWriter = new StringWriter();
        s(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String q(Object obj) {
        return obj == null ? p(m.f7331a) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        u(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void s(k kVar, Appendable appendable) {
        try {
            t(kVar, o(h7.l.c(appendable)));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    public void t(k kVar, n7.c cVar) {
        boolean t10 = cVar.t();
        cVar.W(true);
        boolean r10 = cVar.r();
        cVar.R(this.f7295l);
        boolean p10 = cVar.p();
        cVar.X(this.f7292i);
        try {
            try {
                h7.l.b(kVar, cVar);
            } catch (IOException e10) {
                throw new l(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.W(t10);
            cVar.R(r10);
            cVar.X(p10);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f7292i + ",factories:" + this.f7288e + ",instanceCreators:" + this.f7286c + "}";
    }

    public void u(Object obj, Type type, Appendable appendable) {
        try {
            v(obj, type, o(h7.l.c(appendable)));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    public void v(Object obj, Type type, n7.c cVar) {
        w k10 = k(m7.a.b(type));
        boolean t10 = cVar.t();
        cVar.W(true);
        boolean r10 = cVar.r();
        cVar.R(this.f7295l);
        boolean p10 = cVar.p();
        cVar.X(this.f7292i);
        try {
            try {
                k10.e(cVar, obj);
            } catch (IOException e10) {
                throw new l(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            cVar.W(t10);
            cVar.R(r10);
            cVar.X(p10);
        }
    }
}
