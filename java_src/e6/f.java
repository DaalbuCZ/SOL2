package e6;

import e6.d;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
final class f implements b6.e {

    /* renamed from: f  reason: collision with root package name */
    private static final Charset f6780f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    private static final b6.c f6781g = b6.c.a("key").b(e6.a.b().c(1).a()).a();

    /* renamed from: h  reason: collision with root package name */
    private static final b6.c f6782h = b6.c.a("value").b(e6.a.b().c(2).a()).a();

    /* renamed from: i  reason: collision with root package name */
    private static final b6.d<Map.Entry<Object, Object>> f6783i = e.f6779a;

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f6784a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, b6.d<?>> f6785b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, b6.f<?>> f6786c;

    /* renamed from: d  reason: collision with root package name */
    private final b6.d<Object> f6787d;

    /* renamed from: e  reason: collision with root package name */
    private final i f6788e = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6789a;

        static {
            int[] iArr = new int[d.a.values().length];
            f6789a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6789a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6789a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(OutputStream outputStream, Map<Class<?>, b6.d<?>> map, Map<Class<?>, b6.f<?>> map2, b6.d<Object> dVar) {
        this.f6784a = outputStream;
        this.f6785b = map;
        this.f6786c = map2;
        this.f6787d = dVar;
    }

    private static ByteBuffer o(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long p(b6.d<T> dVar, T t10) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f6784a;
            this.f6784a = bVar;
            dVar.a(t10, this);
            this.f6784a = outputStream;
            long a10 = bVar.a();
            bVar.close();
            return a10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private <T> f q(b6.d<T> dVar, b6.c cVar, T t10, boolean z10) {
        long p10 = p(dVar, t10);
        if (z10 && p10 == 0) {
            return this;
        }
        w((u(cVar) << 3) | 2);
        x(p10);
        dVar.a(t10, this);
        return this;
    }

    private <T> f r(b6.f<T> fVar, b6.c cVar, T t10, boolean z10) {
        this.f6788e.b(cVar, z10);
        fVar.a(t10, this.f6788e);
        return this;
    }

    private static d t(b6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new b6.b("Field has no @Protobuf config");
    }

    private static int u(b6.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new b6.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Map.Entry entry, b6.e eVar) {
        eVar.f(f6781g, entry.getKey());
        eVar.f(f6782h, entry.getValue());
    }

    private void w(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f6784a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f6784a.write(i10 & 127);
    }

    private void x(long j10) {
        while (((-128) & j10) != 0) {
            this.f6784a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f6784a.write(((int) j10) & 127);
    }

    b6.e e(b6.c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        w((u(cVar) << 3) | 1);
        this.f6784a.write(o(8).putDouble(d10).array());
        return this;
    }

    @Override // b6.e
    public b6.e f(b6.c cVar, Object obj) {
        return h(cVar, obj, true);
    }

    b6.e g(b6.c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        w((u(cVar) << 3) | 5);
        this.f6784a.write(o(4).putFloat(f10).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6.e h(b6.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            w((u(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6780f);
            w(bytes.length);
            this.f6784a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                q(f6783i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return e(cVar, ((Double) obj).doubleValue(), z10);
        } else {
            if (obj instanceof Float) {
                return g(cVar, ((Float) obj).floatValue(), z10);
            }
            if (obj instanceof Number) {
                return l(cVar, ((Number) obj).longValue(), z10);
            }
            if (obj instanceof Boolean) {
                return n(cVar, ((Boolean) obj).booleanValue(), z10);
            }
            if (!(obj instanceof byte[])) {
                b6.d<?> dVar = this.f6785b.get(obj.getClass());
                if (dVar != null) {
                    return q(dVar, cVar, obj, z10);
                }
                b6.f<?> fVar = this.f6786c.get(obj.getClass());
                return fVar != null ? r(fVar, cVar, obj, z10) : obj instanceof c ? c(cVar, ((c) obj).d()) : obj instanceof Enum ? c(cVar, ((Enum) obj).ordinal()) : q(this.f6787d, cVar, obj, z10);
            }
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            w((u(cVar) << 3) | 2);
            w(bArr.length);
            this.f6784a.write(bArr);
            return this;
        }
    }

    @Override // b6.e
    /* renamed from: i */
    public f c(b6.c cVar, int i10) {
        return j(cVar, i10, true);
    }

    f j(b6.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        d t10 = t(cVar);
        int i11 = a.f6789a[t10.intEncoding().ordinal()];
        if (i11 == 1) {
            w(t10.tag() << 3);
            w(i10);
        } else if (i11 == 2) {
            w(t10.tag() << 3);
            w((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            w((t10.tag() << 3) | 5);
            this.f6784a.write(o(4).putInt(i10).array());
        }
        return this;
    }

    @Override // b6.e
    /* renamed from: k */
    public f b(b6.c cVar, long j10) {
        return l(cVar, j10, true);
    }

    f l(b6.c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        d t10 = t(cVar);
        int i10 = a.f6789a[t10.intEncoding().ordinal()];
        if (i10 == 1) {
            w(t10.tag() << 3);
            x(j10);
        } else if (i10 == 2) {
            w(t10.tag() << 3);
            x((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            w((t10.tag() << 3) | 1);
            this.f6784a.write(o(8).putLong(j10).array());
        }
        return this;
    }

    @Override // b6.e
    /* renamed from: m */
    public f a(b6.c cVar, boolean z10) {
        return n(cVar, z10, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f n(b6.c cVar, boolean z10, boolean z11) {
        return j(cVar, z10 ? 1 : 0, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f s(Object obj) {
        if (obj == null) {
            return this;
        }
        b6.d<?> dVar = this.f6785b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new b6.b("No encoder for " + obj.getClass());
    }
}
