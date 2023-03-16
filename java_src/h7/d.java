package h7;

import f7.w;
import f7.x;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d implements x, Cloneable {

    /* renamed from: t  reason: collision with root package name */
    public static final d f8116t = new d();

    /* renamed from: q  reason: collision with root package name */
    private boolean f8120q;

    /* renamed from: n  reason: collision with root package name */
    private double f8117n = -1.0d;

    /* renamed from: o  reason: collision with root package name */
    private int f8118o = 136;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8119p = true;

    /* renamed from: r  reason: collision with root package name */
    private List<f7.a> f8121r = Collections.emptyList();

    /* renamed from: s  reason: collision with root package name */
    private List<f7.a> f8122s = Collections.emptyList();

    /* loaded from: classes.dex */
    class a extends w<T> {

        /* renamed from: a  reason: collision with root package name */
        private w<T> f8123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f8124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f8125c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f7.e f8126d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m7.a f8127e;

        a(boolean z10, boolean z11, f7.e eVar, m7.a aVar) {
            this.f8124b = z10;
            this.f8125c = z11;
            this.f8126d = eVar;
            this.f8127e = aVar;
        }

        private w<T> f() {
            w<T> wVar = this.f8123a;
            if (wVar != 0) {
                return wVar;
            }
            w<T> l10 = this.f8126d.l(d.this, this.f8127e);
            this.f8123a = l10;
            return l10;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // f7.w
        public T c(n7.a aVar) {
            if (this.f8124b) {
                aVar.j0();
                return null;
            }
            return f().c(aVar);
        }

        @Override // f7.w
        public void e(n7.c cVar, T t10) {
            if (this.f8125c) {
                cVar.D();
            } else {
                f().e(cVar, t10);
            }
        }
    }

    private boolean e(Class<?> cls) {
        if (this.f8117n == -1.0d || q((g7.d) cls.getAnnotation(g7.d.class), (g7.e) cls.getAnnotation(g7.e.class))) {
            return (!this.f8119p && l(cls)) || i(cls);
        }
        return true;
    }

    private boolean g(Class<?> cls, boolean z10) {
        for (f7.a aVar : z10 ? this.f8121r : this.f8122s) {
            if (aVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || m(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean l(Class<?> cls) {
        return cls.isMemberClass() && !m(cls);
    }

    private boolean m(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean n(g7.d dVar) {
        return dVar == null || dVar.value() <= this.f8117n;
    }

    private boolean p(g7.e eVar) {
        return eVar == null || eVar.value() > this.f8117n;
    }

    private boolean q(g7.d dVar, g7.e eVar) {
        return n(dVar) && p(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // f7.x
    public <T> w<T> create(f7.e eVar, m7.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        boolean e10 = e(c10);
        boolean z10 = e10 || g(c10, true);
        boolean z11 = e10 || g(c10, false);
        if (z10 || z11) {
            return new a(z11, z10, eVar, aVar);
        }
        return null;
    }

    public boolean d(Class<?> cls, boolean z10) {
        return e(cls) || g(cls, z10);
    }

    public boolean h(Field field, boolean z10) {
        g7.a aVar;
        if ((this.f8118o & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f8117n == -1.0d || q((g7.d) field.getAnnotation(g7.d.class), (g7.e) field.getAnnotation(g7.e.class))) && !field.isSynthetic()) {
            if (!this.f8120q || ((aVar = (g7.a) field.getAnnotation(g7.a.class)) != null && (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
                if ((this.f8119p || !l(field.getType())) && !i(field.getType())) {
                    List<f7.a> list = z10 ? this.f8121r : this.f8122s;
                    if (list.isEmpty()) {
                        return false;
                    }
                    f7.b bVar = new f7.b(field);
                    for (f7.a aVar2 : list) {
                        if (aVar2.b(bVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
