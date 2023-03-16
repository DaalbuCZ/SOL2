package d6;

import android.util.Base64;
import android.util.JsonWriter;
import b6.f;
import b6.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
final class e implements b6.e, g {

    /* renamed from: a  reason: collision with root package name */
    private e f6590a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6591b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f6592c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, b6.d<?>> f6593d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, f<?>> f6594e;

    /* renamed from: f  reason: collision with root package name */
    private final b6.d<Object> f6595f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f6596g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, b6.d<?>> map, Map<Class<?>, f<?>> map2, b6.d<Object> dVar, boolean z10) {
        this.f6592c = new JsonWriter(writer);
        this.f6593d = map;
        this.f6594e = map2;
        this.f6595f = dVar;
        this.f6596g = z10;
    }

    private boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e t(String str, Object obj) {
        v();
        this.f6592c.name(str);
        if (obj == null) {
            this.f6592c.nullValue();
            return this;
        }
        return i(obj, false);
    }

    private e u(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        v();
        this.f6592c.name(str);
        return i(obj, false);
    }

    private void v() {
        if (!this.f6591b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f6590a;
        if (eVar != null) {
            eVar.v();
            this.f6590a.f6591b = false;
            this.f6590a = null;
            this.f6592c.endObject();
        }
    }

    @Override // b6.e
    public b6.e a(b6.c cVar, boolean z10) {
        return n(cVar.b(), z10);
    }

    @Override // b6.e
    public b6.e b(b6.c cVar, long j10) {
        return l(cVar.b(), j10);
    }

    @Override // b6.e
    public b6.e c(b6.c cVar, int i10) {
        return k(cVar.b(), i10);
    }

    @Override // b6.e
    public b6.e f(b6.c cVar, Object obj) {
        return m(cVar.b(), obj);
    }

    public e g(int i10) {
        v();
        this.f6592c.value(i10);
        return this;
    }

    public e h(long j10) {
        v();
        this.f6592c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e i(Object obj, boolean z10) {
        int[] iArr;
        int i10 = 0;
        if (z10 && q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new b6.b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f6592c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f6592c.value((Number) obj);
            return this;
        } else if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f6592c.beginArray();
                for (Object obj2 : (Collection) obj) {
                    i(obj2, false);
                }
                this.f6592c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f6592c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new b6.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f6592c.endObject();
                return this;
            } else {
                b6.d<?> dVar = this.f6593d.get(obj.getClass());
                if (dVar != null) {
                    return s(dVar, obj, z10);
                }
                f<?> fVar = this.f6594e.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    d(((Enum) obj).name());
                    return this;
                } else {
                    return s(this.f6595f, obj, z10);
                }
            }
        } else if (obj instanceof byte[]) {
            return p((byte[]) obj);
        } else {
            this.f6592c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    this.f6592c.value(iArr[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    h(jArr[i10]);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    this.f6592c.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    this.f6592c.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    i(number, false);
                }
            } else {
                for (Object obj3 : (Object[]) obj) {
                    i(obj3, false);
                }
            }
            this.f6592c.endArray();
            return this;
        }
    }

    @Override // b6.g
    /* renamed from: j */
    public e d(String str) {
        v();
        this.f6592c.value(str);
        return this;
    }

    public e k(String str, int i10) {
        v();
        this.f6592c.name(str);
        return g(i10);
    }

    public e l(String str, long j10) {
        v();
        this.f6592c.name(str);
        return h(j10);
    }

    public e m(String str, Object obj) {
        return this.f6596g ? u(str, obj) : t(str, obj);
    }

    public e n(String str, boolean z10) {
        v();
        this.f6592c.name(str);
        return e(z10);
    }

    @Override // b6.g
    /* renamed from: o */
    public e e(boolean z10) {
        v();
        this.f6592c.value(z10);
        return this;
    }

    public e p(byte[] bArr) {
        v();
        if (bArr == null) {
            this.f6592c.nullValue();
        } else {
            this.f6592c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        v();
        this.f6592c.flush();
    }

    e s(b6.d<Object> dVar, Object obj, boolean z10) {
        if (!z10) {
            this.f6592c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f6592c.endObject();
        }
        return this;
    }
}
