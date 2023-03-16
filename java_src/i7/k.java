package i7;

import f7.s;
import f7.w;
import f7.x;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class k implements x {

    /* renamed from: n  reason: collision with root package name */
    private final h7.c f8380n;

    /* renamed from: o  reason: collision with root package name */
    private final f7.d f8381o;

    /* renamed from: p  reason: collision with root package name */
    private final h7.d f8382p;

    /* renamed from: q  reason: collision with root package name */
    private final e f8383q;

    /* renamed from: r  reason: collision with root package name */
    private final k7.b f8384r = k7.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f8385d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f8386e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f8387f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f7.e f8388g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m7.a f8389h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f8390i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, boolean z11, Field field, boolean z12, w wVar, f7.e eVar, m7.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f8385d = field;
            this.f8386e = z12;
            this.f8387f = wVar;
            this.f8388g = eVar;
            this.f8389h = aVar;
            this.f8390i = z13;
        }

        @Override // i7.k.c
        void a(n7.a aVar, Object obj) {
            Object c10 = this.f8387f.c(aVar);
            if (c10 == null && this.f8390i) {
                return;
            }
            this.f8385d.set(obj, c10);
        }

        @Override // i7.k.c
        void b(n7.c cVar, Object obj) {
            (this.f8386e ? this.f8387f : new m(this.f8388g, this.f8387f, this.f8389h.e())).e(cVar, this.f8385d.get(obj));
        }

        @Override // i7.k.c
        public boolean c(Object obj) {
            return this.f8395b && this.f8385d.get(obj) != obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends w<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h7.i<T> f8392a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f8393b;

        b(h7.i<T> iVar, Map<String, c> map) {
            this.f8392a = iVar;
            this.f8393b = map;
        }

        @Override // f7.w
        public T c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            T a10 = this.f8392a.a();
            try {
                aVar.b();
                while (aVar.r()) {
                    c cVar = this.f8393b.get(aVar.O());
                    if (cVar != null && cVar.f8396c) {
                        cVar.a(aVar, a10);
                    }
                    aVar.j0();
                }
                aVar.o();
                return a10;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new s(e11);
            }
        }

        @Override // f7.w
        public void e(n7.c cVar, T t10) {
            if (t10 == null) {
                cVar.D();
                return;
            }
            cVar.f();
            try {
                for (c cVar2 : this.f8393b.values()) {
                    if (cVar2.c(t10)) {
                        cVar.y(cVar2.f8394a);
                        cVar2.b(cVar, t10);
                    }
                }
                cVar.o();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f8394a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f8395b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f8396c;

        protected c(String str, boolean z10, boolean z11) {
            this.f8394a = str;
            this.f8395b = z10;
            this.f8396c = z11;
        }

        abstract void a(n7.a aVar, Object obj);

        abstract void b(n7.c cVar, Object obj);

        abstract boolean c(Object obj);
    }

    public k(h7.c cVar, f7.d dVar, h7.d dVar2, e eVar) {
        this.f8380n = cVar;
        this.f8381o = dVar;
        this.f8382p = dVar2;
        this.f8383q = eVar;
    }

    private c a(f7.e eVar, Field field, String str, m7.a<?> aVar, boolean z10, boolean z11) {
        boolean a10 = h7.k.a(aVar.c());
        g7.b bVar = (g7.b) field.getAnnotation(g7.b.class);
        w<?> a11 = bVar != null ? this.f8383q.a(this.f8380n, eVar, aVar, bVar) : null;
        boolean z12 = a11 != null;
        if (a11 == null) {
            a11 = eVar.k(aVar);
        }
        return new a(str, z10, z11, field, z12, a11, eVar, aVar, a10);
    }

    static boolean c(Field field, boolean z10, h7.d dVar) {
        return (dVar.d(field.getType(), z10) || dVar.h(field, z10)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    private Map<String, c> d(f7.e eVar, m7.a<?> aVar, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e10 = aVar.e();
        m7.a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean b10 = b(field, true);
                boolean b11 = b(field, z10);
                if (b10 || b11) {
                    this.f8384r.b(field);
                    Type p10 = h7.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> e11 = e(field);
                    int size = e11.size();
                    c cVar2 = null;
                    int i11 = z10;
                    while (i11 < size) {
                        String str = e11.get(i11);
                        boolean z11 = i11 != 0 ? z10 : b10;
                        int i12 = i11;
                        c cVar3 = cVar2;
                        int i13 = size;
                        List<String> list = e11;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, a(eVar, field, str, m7.a.b(p10), z11, b11)) : cVar3;
                        b10 = z11;
                        e11 = list;
                        size = i13;
                        field = field2;
                        z10 = false;
                        i11 = i12 + 1;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(e10 + " declares multiple JSON fields named " + cVar.f8394a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = m7.a.b(h7.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> e(Field field) {
        g7.c cVar = (g7.c) field.getAnnotation(g7.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f8381o.e(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z10) {
        return c(field, z10, this.f8382p);
    }

    @Override // f7.x
    public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        if (Object.class.isAssignableFrom(c10)) {
            return new b(this.f8380n.a(aVar), d(eVar, aVar, c10));
        }
        return null;
    }
}
