package b0;
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: n  reason: collision with root package name */
    private final String f2717n;

    /* renamed from: o  reason: collision with root package name */
    private final Object[] f2718o;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f2717n = str;
        this.f2718o = objArr;
    }

    private static void c(d dVar, int i10, Object obj) {
        long j10;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            dVar.u(i10);
        } else if (obj instanceof byte[]) {
            dVar.P(i10, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = ((Float) obj).floatValue();
            } else if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        dVar.n(i10, (String) obj);
                        return;
                    } else if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    } else {
                        j10 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j10 = byteValue;
                }
                dVar.H(i10, j10);
                return;
            } else {
                doubleValue = ((Double) obj).doubleValue();
            }
            dVar.v(i10, doubleValue);
        }
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            c(dVar, i10, obj);
        }
    }

    @Override // b0.e
    public String a() {
        return this.f2717n;
    }

    @Override // b0.e
    public void b(d dVar) {
        d(dVar, this.f2718o);
    }
}
