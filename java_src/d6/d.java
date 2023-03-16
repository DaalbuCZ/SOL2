package d6;

import b6.f;
import b6.g;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public final class d implements c6.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final b6.d<Object> f6580e = d6.a.f6577a;

    /* renamed from: f  reason: collision with root package name */
    private static final f<String> f6581f = c.f6579a;

    /* renamed from: g  reason: collision with root package name */
    private static final f<Boolean> f6582g = d6.b.f6578a;

    /* renamed from: h  reason: collision with root package name */
    private static final b f6583h = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, b6.d<?>> f6584a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f6585b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private b6.d<Object> f6586c = f6580e;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6587d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b6.a {
        a() {
        }

        @Override // b6.a
        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // b6.a
        public void b(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f6584a, d.this.f6585b, d.this.f6586c, d.this.f6587d);
            eVar.i(obj, false);
            eVar.r();
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        private static final DateFormat f6589a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f6589a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // b6.f
        /* renamed from: b */
        public void a(Date date, g gVar) {
            gVar.d(f6589a.format(date));
        }
    }

    public d() {
        p(String.class, f6581f);
        p(Boolean.class, f6582g);
        p(Date.class, f6583h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, b6.e eVar) {
        throw new b6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.e(bool.booleanValue());
    }

    public b6.a i() {
        return new a();
    }

    public d j(c6.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f6587d = z10;
        return this;
    }

    @Override // c6.b
    /* renamed from: o */
    public <T> d a(Class<T> cls, b6.d<? super T> dVar) {
        this.f6584a.put(cls, dVar);
        this.f6585b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f6585b.put(cls, fVar);
        this.f6584a.remove(cls);
        return this;
    }
}
