package e6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, b6.d<?>> f6791a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, b6.f<?>> f6792b;

    /* renamed from: c  reason: collision with root package name */
    private final b6.d<Object> f6793c;

    /* loaded from: classes.dex */
    public static final class a implements c6.b<a> {

        /* renamed from: d  reason: collision with root package name */
        private static final b6.d<Object> f6794d = g.f6790a;

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, b6.d<?>> f6795a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<Class<?>, b6.f<?>> f6796b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private b6.d<Object> f6797c = f6794d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, b6.e eVar) {
            throw new b6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f6795a), new HashMap(this.f6796b), this.f6797c);
        }

        public a d(c6.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // c6.b
        /* renamed from: f */
        public <U> a a(Class<U> cls, b6.d<? super U> dVar) {
            this.f6795a.put(cls, dVar);
            this.f6796b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, b6.d<?>> map, Map<Class<?>, b6.f<?>> map2, b6.d<Object> dVar) {
        this.f6791a = map;
        this.f6792b = map2;
        this.f6793c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f6791a, this.f6792b, this.f6793c).s(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
