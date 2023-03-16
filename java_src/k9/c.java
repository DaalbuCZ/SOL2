package k9;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class c implements o9.a, Serializable {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f10878t = a.f10885n;

    /* renamed from: n  reason: collision with root package name */
    private transient o9.a f10879n;

    /* renamed from: o  reason: collision with root package name */
    protected final Object f10880o;

    /* renamed from: p  reason: collision with root package name */
    private final Class f10881p;

    /* renamed from: q  reason: collision with root package name */
    private final String f10882q;

    /* renamed from: r  reason: collision with root package name */
    private final String f10883r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f10884s;

    /* loaded from: classes.dex */
    private static class a implements Serializable {

        /* renamed from: n  reason: collision with root package name */
        private static final a f10885n = new a();

        private a() {
        }
    }

    public c() {
        this(f10878t);
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f10880o = obj;
        this.f10881p = cls;
        this.f10882q = str;
        this.f10883r = str2;
        this.f10884s = z10;
    }

    public o9.a a() {
        o9.a aVar = this.f10879n;
        if (aVar == null) {
            o9.a b10 = b();
            this.f10879n = b10;
            return b10;
        }
        return aVar;
    }

    protected abstract o9.a b();

    public Object e() {
        return this.f10880o;
    }

    public String g() {
        return this.f10882q;
    }

    public o9.c h() {
        Class cls = this.f10881p;
        if (cls == null) {
            return null;
        }
        return this.f10884s ? s.c(cls) : s.b(cls);
    }

    public String i() {
        return this.f10883r;
    }
}
