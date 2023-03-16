package i0;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.k;
import k9.l;
import q9.m;
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: s  reason: collision with root package name */
    public static final a f8223s = new a(null);

    /* renamed from: t  reason: collision with root package name */
    private static final h f8224t = new h(0, 0, 0, "");

    /* renamed from: u  reason: collision with root package name */
    private static final h f8225u = new h(0, 1, 0, "");

    /* renamed from: v  reason: collision with root package name */
    private static final h f8226v;

    /* renamed from: w  reason: collision with root package name */
    private static final h f8227w;

    /* renamed from: n  reason: collision with root package name */
    private final int f8228n;

    /* renamed from: o  reason: collision with root package name */
    private final int f8229o;

    /* renamed from: p  reason: collision with root package name */
    private final int f8230p;

    /* renamed from: q  reason: collision with root package name */
    private final String f8231q;

    /* renamed from: r  reason: collision with root package name */
    private final y8.g f8232r;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        public final h a() {
            return h.f8225u;
        }

        public final h b(String str) {
            boolean h10;
            if (str != null) {
                h10 = m.h(str);
                if (!h10) {
                    Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
                        if (valueOf == null) {
                            return null;
                        }
                        int intValue = valueOf.intValue();
                        String group2 = matcher.group(2);
                        Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
                        if (valueOf2 == null) {
                            return null;
                        }
                        int intValue2 = valueOf2.intValue();
                        String group3 = matcher.group(3);
                        Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
                        if (valueOf3 == null) {
                            return null;
                        }
                        int intValue3 = valueOf3.intValue();
                        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                        k.d(group4, "description");
                        return new h(intValue, intValue2, intValue3, group4, null);
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends l implements j9.a<BigInteger> {
        b() {
            super(0);
        }

        @Override // j9.a
        /* renamed from: a */
        public final BigInteger d() {
            return BigInteger.valueOf(h.this.j()).shiftLeft(32).or(BigInteger.valueOf(h.this.l())).shiftLeft(32).or(BigInteger.valueOf(h.this.m()));
        }
    }

    static {
        h hVar = new h(1, 0, 0, "");
        f8226v = hVar;
        f8227w = hVar;
    }

    private h(int i10, int i11, int i12, String str) {
        y8.g a10;
        this.f8228n = i10;
        this.f8229o = i11;
        this.f8230p = i12;
        this.f8231q = str;
        a10 = y8.i.a(new b());
        this.f8232r = a10;
    }

    public /* synthetic */ h(int i10, int i11, int i12, String str, k9.g gVar) {
        this(i10, i11, i12, str);
    }

    private final BigInteger h() {
        Object value = this.f8232r.getValue();
        k.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f8228n == hVar.f8228n && this.f8229o == hVar.f8229o && this.f8230p == hVar.f8230p;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(h hVar) {
        k.e(hVar, "other");
        return h().compareTo(hVar.h());
    }

    public int hashCode() {
        return ((((527 + this.f8228n) * 31) + this.f8229o) * 31) + this.f8230p;
    }

    public final int j() {
        return this.f8228n;
    }

    public final int l() {
        return this.f8229o;
    }

    public final int m() {
        return this.f8230p;
    }

    public String toString() {
        boolean h10;
        h10 = m.h(this.f8231q);
        String j10 = h10 ^ true ? k.j("-", this.f8231q) : "";
        return this.f8228n + '.' + this.f8229o + '.' + this.f8230p + j10;
    }
}
