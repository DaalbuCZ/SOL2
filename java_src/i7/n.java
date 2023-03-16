package i7;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes.dex */
public final class n {
    public static final f7.w<BigInteger> A;
    public static final f7.x B;
    public static final f7.w<StringBuilder> C;
    public static final f7.x D;
    public static final f7.w<StringBuffer> E;
    public static final f7.x F;
    public static final f7.w<URL> G;
    public static final f7.x H;
    public static final f7.w<URI> I;
    public static final f7.x J;
    public static final f7.w<InetAddress> K;
    public static final f7.x L;
    public static final f7.w<UUID> M;
    public static final f7.x N;
    public static final f7.w<Currency> O;
    public static final f7.x P;
    public static final f7.w<Calendar> Q;
    public static final f7.x R;
    public static final f7.w<Locale> S;
    public static final f7.x T;
    public static final f7.w<f7.k> U;
    public static final f7.x V;
    public static final f7.x W;

    /* renamed from: a  reason: collision with root package name */
    public static final f7.w<Class> f8408a;

    /* renamed from: b  reason: collision with root package name */
    public static final f7.x f8409b;

    /* renamed from: c  reason: collision with root package name */
    public static final f7.w<BitSet> f8410c;

    /* renamed from: d  reason: collision with root package name */
    public static final f7.x f8411d;

    /* renamed from: e  reason: collision with root package name */
    public static final f7.w<Boolean> f8412e;

    /* renamed from: f  reason: collision with root package name */
    public static final f7.w<Boolean> f8413f;

    /* renamed from: g  reason: collision with root package name */
    public static final f7.x f8414g;

    /* renamed from: h  reason: collision with root package name */
    public static final f7.w<Number> f8415h;

    /* renamed from: i  reason: collision with root package name */
    public static final f7.x f8416i;

    /* renamed from: j  reason: collision with root package name */
    public static final f7.w<Number> f8417j;

    /* renamed from: k  reason: collision with root package name */
    public static final f7.x f8418k;

    /* renamed from: l  reason: collision with root package name */
    public static final f7.w<Number> f8419l;

    /* renamed from: m  reason: collision with root package name */
    public static final f7.x f8420m;

    /* renamed from: n  reason: collision with root package name */
    public static final f7.w<AtomicInteger> f8421n;

    /* renamed from: o  reason: collision with root package name */
    public static final f7.x f8422o;

    /* renamed from: p  reason: collision with root package name */
    public static final f7.w<AtomicBoolean> f8423p;

    /* renamed from: q  reason: collision with root package name */
    public static final f7.x f8424q;

    /* renamed from: r  reason: collision with root package name */
    public static final f7.w<AtomicIntegerArray> f8425r;

    /* renamed from: s  reason: collision with root package name */
    public static final f7.x f8426s;

    /* renamed from: t  reason: collision with root package name */
    public static final f7.w<Number> f8427t;

    /* renamed from: u  reason: collision with root package name */
    public static final f7.w<Number> f8428u;

    /* renamed from: v  reason: collision with root package name */
    public static final f7.w<Number> f8429v;

    /* renamed from: w  reason: collision with root package name */
    public static final f7.w<Character> f8430w;

    /* renamed from: x  reason: collision with root package name */
    public static final f7.x f8431x;

    /* renamed from: y  reason: collision with root package name */
    public static final f7.w<String> f8432y;

    /* renamed from: z  reason: collision with root package name */
    public static final f7.w<BigDecimal> f8433z;

    /* loaded from: classes.dex */
    class a extends f7.w<AtomicIntegerArray> {
        a() {
        }

        @Override // f7.w
        /* renamed from: f */
        public AtomicIntegerArray c(n7.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.r()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.G()));
                } catch (NumberFormatException e10) {
                    throw new f7.s(e10);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.c();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.Z(atomicIntegerArray.get(i10));
            }
            cVar.k();
        }
    }

    /* loaded from: classes.dex */
    class a0 extends f7.w<Boolean> {
        a0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Boolean c(n7.a aVar) {
            n7.b Z = aVar.Z();
            if (Z != n7.b.NULL) {
                return Z == n7.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.X())) : Boolean.valueOf(aVar.D());
            }
            aVar.S();
            return null;
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Boolean bool) {
            cVar.a0(bool);
        }
    }

    /* loaded from: classes.dex */
    class b extends f7.w<Number> {
        b() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return Long.valueOf(aVar.N());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            cVar.b0(number);
        }
    }

    /* loaded from: classes.dex */
    class b0 extends f7.w<Boolean> {
        b0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Boolean c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return Boolean.valueOf(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Boolean bool) {
            cVar.c0(bool == null ? "null" : bool.toString());
        }
    }

    /* loaded from: classes.dex */
    class c extends f7.w<Number> {
        c() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return Float.valueOf((float) aVar.E());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            cVar.b0(number);
        }
    }

    /* loaded from: classes.dex */
    class c0 extends f7.w<Number> {
        c0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.G());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            cVar.b0(number);
        }
    }

    /* loaded from: classes.dex */
    class d extends f7.w<Number> {
        d() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return Double.valueOf(aVar.E());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            cVar.b0(number);
        }
    }

    /* loaded from: classes.dex */
    class d0 extends f7.w<Number> {
        d0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.G());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            cVar.b0(number);
        }
    }

    /* loaded from: classes.dex */
    class e extends f7.w<Character> {
        e() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Character c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            String X = aVar.X();
            if (X.length() == 1) {
                return Character.valueOf(X.charAt(0));
            }
            throw new f7.s("Expecting character, got: " + X);
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Character ch) {
            cVar.c0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* loaded from: classes.dex */
    class e0 extends f7.w<Number> {
        e0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Number c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return Integer.valueOf(aVar.G());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Number number) {
            cVar.b0(number);
        }
    }

    /* loaded from: classes.dex */
    class f extends f7.w<String> {
        f() {
        }

        @Override // f7.w
        /* renamed from: f */
        public String c(n7.a aVar) {
            n7.b Z = aVar.Z();
            if (Z != n7.b.NULL) {
                return Z == n7.b.BOOLEAN ? Boolean.toString(aVar.D()) : aVar.X();
            }
            aVar.S();
            return null;
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, String str) {
            cVar.c0(str);
        }
    }

    /* loaded from: classes.dex */
    class f0 extends f7.w<AtomicInteger> {
        f0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public AtomicInteger c(n7.a aVar) {
            try {
                return new AtomicInteger(aVar.G());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, AtomicInteger atomicInteger) {
            cVar.Z(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    class g extends f7.w<BigDecimal> {
        g() {
        }

        @Override // f7.w
        /* renamed from: f */
        public BigDecimal c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return new BigDecimal(aVar.X());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, BigDecimal bigDecimal) {
            cVar.b0(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    class g0 extends f7.w<AtomicBoolean> {
        g0() {
        }

        @Override // f7.w
        /* renamed from: f */
        public AtomicBoolean c(n7.a aVar) {
            return new AtomicBoolean(aVar.D());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, AtomicBoolean atomicBoolean) {
            cVar.d0(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    class h extends f7.w<BigInteger> {
        h() {
        }

        @Override // f7.w
        /* renamed from: f */
        public BigInteger c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return new BigInteger(aVar.X());
            } catch (NumberFormatException e10) {
                throw new f7.s(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, BigInteger bigInteger) {
            cVar.b0(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    private static final class h0<T extends Enum<T>> extends f7.w<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f8434a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f8435b = new HashMap();

        /* loaded from: classes.dex */
        class a implements PrivilegedAction<Void> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Field f8436a;

            a(Field field) {
                this.f8436a = field;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Void run() {
                this.f8436a.setAccessible(true);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h0(Class<T> cls) {
            Field[] declaredFields;
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum r42 = (Enum) field.get(null);
                        String name = r42.name();
                        g7.c cVar = (g7.c) field.getAnnotation(g7.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String str : cVar.alternate()) {
                                this.f8434a.put(str, r42);
                            }
                        }
                        this.f8434a.put(name, r42);
                        this.f8435b.put(r42, name);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // f7.w
        /* renamed from: f */
        public T c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return this.f8434a.get(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, T t10) {
            cVar.c0(t10 == null ? null : this.f8435b.get(t10));
        }
    }

    /* loaded from: classes.dex */
    class i extends f7.w<StringBuilder> {
        i() {
        }

        @Override // f7.w
        /* renamed from: f */
        public StringBuilder c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return new StringBuilder(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, StringBuilder sb) {
            cVar.c0(sb == null ? null : sb.toString());
        }
    }

    /* loaded from: classes.dex */
    class j extends f7.w<StringBuffer> {
        j() {
        }

        @Override // f7.w
        /* renamed from: f */
        public StringBuffer c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return new StringBuffer(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, StringBuffer stringBuffer) {
            cVar.c0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes.dex */
    class k extends f7.w<Class> {
        k() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Class c(n7.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes.dex */
    class l extends f7.w<URL> {
        l() {
        }

        @Override // f7.w
        /* renamed from: f */
        public URL c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            String X = aVar.X();
            if ("null".equals(X)) {
                return null;
            }
            return new URL(X);
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, URL url) {
            cVar.c0(url == null ? null : url.toExternalForm());
        }
    }

    /* loaded from: classes.dex */
    class m extends f7.w<URI> {
        m() {
        }

        @Override // f7.w
        /* renamed from: f */
        public URI c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                String X = aVar.X();
                if ("null".equals(X)) {
                    return null;
                }
                return new URI(X);
            } catch (URISyntaxException e10) {
                throw new f7.l(e10);
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, URI uri) {
            cVar.c0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: i7.n$n  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0128n extends f7.w<InetAddress> {
        C0128n() {
        }

        @Override // f7.w
        /* renamed from: f */
        public InetAddress c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return InetAddress.getByName(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, InetAddress inetAddress) {
            cVar.c0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes.dex */
    class o extends f7.w<UUID> {
        o() {
        }

        @Override // f7.w
        /* renamed from: f */
        public UUID c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return UUID.fromString(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, UUID uuid) {
            cVar.c0(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes.dex */
    class p extends f7.w<Currency> {
        p() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Currency c(n7.a aVar) {
            return Currency.getInstance(aVar.X());
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Currency currency) {
            cVar.c0(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    class q extends f7.w<Calendar> {
        q() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Calendar c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            aVar.b();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.Z() != n7.b.END_OBJECT) {
                String O = aVar.O();
                int G = aVar.G();
                if ("year".equals(O)) {
                    i10 = G;
                } else if ("month".equals(O)) {
                    i11 = G;
                } else if ("dayOfMonth".equals(O)) {
                    i12 = G;
                } else if ("hourOfDay".equals(O)) {
                    i13 = G;
                } else if ("minute".equals(O)) {
                    i14 = G;
                } else if ("second".equals(O)) {
                    i15 = G;
                }
            }
            aVar.o();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.D();
                return;
            }
            cVar.f();
            cVar.y("year");
            cVar.Z(calendar.get(1));
            cVar.y("month");
            cVar.Z(calendar.get(2));
            cVar.y("dayOfMonth");
            cVar.Z(calendar.get(5));
            cVar.y("hourOfDay");
            cVar.Z(calendar.get(11));
            cVar.y("minute");
            cVar.Z(calendar.get(12));
            cVar.y("second");
            cVar.Z(calendar.get(13));
            cVar.o();
        }
    }

    /* loaded from: classes.dex */
    class r extends f7.w<Locale> {
        r() {
        }

        @Override // f7.w
        /* renamed from: f */
        public Locale c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.X(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, Locale locale) {
            cVar.c0(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes.dex */
    class s extends f7.w<f7.k> {
        s() {
        }

        @Override // f7.w
        /* renamed from: f */
        public f7.k c(n7.a aVar) {
            if (aVar instanceof i7.f) {
                return ((i7.f) aVar).m0();
            }
            switch (z.f8450a[aVar.Z().ordinal()]) {
                case 1:
                    return new f7.p(new h7.g(aVar.X()));
                case 2:
                    return new f7.p(Boolean.valueOf(aVar.D()));
                case 3:
                    return new f7.p(aVar.X());
                case 4:
                    aVar.S();
                    return f7.m.f7331a;
                case 5:
                    f7.h hVar = new f7.h();
                    aVar.a();
                    while (aVar.r()) {
                        hVar.C(c(aVar));
                    }
                    aVar.k();
                    return hVar;
                case 6:
                    f7.n nVar = new f7.n();
                    aVar.b();
                    while (aVar.r()) {
                        nVar.C(aVar.O(), c(aVar));
                    }
                    aVar.o();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, f7.k kVar) {
            if (kVar == null || kVar.s()) {
                cVar.D();
            } else if (kVar.x()) {
                f7.p h10 = kVar.h();
                if (h10.J()) {
                    cVar.b0(h10.G());
                } else if (h10.H()) {
                    cVar.d0(h10.C());
                } else {
                    cVar.c0(h10.k());
                }
            } else if (kVar.l()) {
                cVar.c();
                Iterator<f7.k> it = kVar.d().iterator();
                while (it.hasNext()) {
                    e(cVar, it.next());
                }
                cVar.k();
            } else if (!kVar.v()) {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            } else {
                cVar.f();
                for (Map.Entry<String, f7.k> entry : kVar.g().D()) {
                    cVar.y(entry.getKey());
                    e(cVar, entry.getValue());
                }
                cVar.o();
            }
        }
    }

    /* loaded from: classes.dex */
    class t implements f7.x {
        t() {
        }

        @Override // f7.x
        public <T> f7.w<T> create(f7.e eVar, m7.a<T> aVar) {
            Class c10 = aVar.c();
            if (!Enum.class.isAssignableFrom(c10) || c10 == Enum.class) {
                return null;
            }
            if (!c10.isEnum()) {
                c10 = (Class<? super Object>) c10.getSuperclass();
            }
            return new h0(c10);
        }
    }

    /* loaded from: classes.dex */
    class u extends f7.w<BitSet> {
        u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
            if (r8.G() != 0) goto L15;
         */
        @Override // f7.w
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet c(n7.a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                n7.b r1 = r8.Z()
                r2 = 0
                r3 = r2
            Le:
                n7.b r4 = n7.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = i7.n.z.f8450a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.X()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                f7.s r8 = new f7.s
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                f7.s r8 = new f7.s
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.D()
                goto L69
            L63:
                int r1 = r8.G()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                n7.b r1 = r8.Z()
                goto Le
            L75:
                r8.k()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.n.u.c(n7.a):java.util.BitSet");
        }

        @Override // f7.w
        /* renamed from: g */
        public void e(n7.c cVar, BitSet bitSet) {
            cVar.c();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.Z(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class v implements f7.x {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Class f8438n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ f7.w f8439o;

        v(Class cls, f7.w wVar) {
            this.f8438n = cls;
            this.f8439o = wVar;
        }

        @Override // f7.x
        public <T> f7.w<T> create(f7.e eVar, m7.a<T> aVar) {
            if (aVar.c() == this.f8438n) {
                return this.f8439o;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8438n.getName() + ",adapter=" + this.f8439o + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class w implements f7.x {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Class f8440n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Class f8441o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f7.w f8442p;

        w(Class cls, Class cls2, f7.w wVar) {
            this.f8440n = cls;
            this.f8441o = cls2;
            this.f8442p = wVar;
        }

        @Override // f7.x
        public <T> f7.w<T> create(f7.e eVar, m7.a<T> aVar) {
            Class<? super T> c10 = aVar.c();
            if (c10 == this.f8440n || c10 == this.f8441o) {
                return this.f8442p;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8441o.getName() + "+" + this.f8440n.getName() + ",adapter=" + this.f8442p + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class x implements f7.x {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Class f8443n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Class f8444o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f7.w f8445p;

        x(Class cls, Class cls2, f7.w wVar) {
            this.f8443n = cls;
            this.f8444o = cls2;
            this.f8445p = wVar;
        }

        @Override // f7.x
        public <T> f7.w<T> create(f7.e eVar, m7.a<T> aVar) {
            Class<? super T> c10 = aVar.c();
            if (c10 == this.f8443n || c10 == this.f8444o) {
                return this.f8445p;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8443n.getName() + "+" + this.f8444o.getName() + ",adapter=" + this.f8445p + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class y implements f7.x {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Class f8446n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ f7.w f8447o;

        /* loaded from: classes.dex */
        class a extends f7.w<T1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f8448a;

            a(Class cls) {
                this.f8448a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // f7.w
            public T1 c(n7.a aVar) {
                ?? c10 = y.this.f8447o.c(aVar);
                if (c10 == 0 || this.f8448a.isInstance(c10)) {
                    return c10;
                }
                throw new f7.s("Expected a " + this.f8448a.getName() + " but was " + c10.getClass().getName());
            }

            @Override // f7.w
            public void e(n7.c cVar, T1 t12) {
                y.this.f8447o.e(cVar, t12);
            }
        }

        y(Class cls, f7.w wVar) {
            this.f8446n = cls;
            this.f8447o = wVar;
        }

        @Override // f7.x
        public <T2> f7.w<T2> create(f7.e eVar, m7.a<T2> aVar) {
            Class<? super T2> c10 = aVar.c();
            if (this.f8446n.isAssignableFrom(c10)) {
                return new a(c10);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f8446n.getName() + ",adapter=" + this.f8447o + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class z {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8450a;

        static {
            int[] iArr = new int[n7.b.values().length];
            f8450a = iArr;
            try {
                iArr[n7.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8450a[n7.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8450a[n7.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8450a[n7.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8450a[n7.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8450a[n7.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8450a[n7.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8450a[n7.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8450a[n7.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8450a[n7.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        f7.w<Class> b10 = new k().b();
        f8408a = b10;
        f8409b = a(Class.class, b10);
        f7.w<BitSet> b11 = new u().b();
        f8410c = b11;
        f8411d = a(BitSet.class, b11);
        a0 a0Var = new a0();
        f8412e = a0Var;
        f8413f = new b0();
        f8414g = b(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f8415h = c0Var;
        f8416i = b(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f8417j = d0Var;
        f8418k = b(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        f8419l = e0Var;
        f8420m = b(Integer.TYPE, Integer.class, e0Var);
        f7.w<AtomicInteger> b12 = new f0().b();
        f8421n = b12;
        f8422o = a(AtomicInteger.class, b12);
        f7.w<AtomicBoolean> b13 = new g0().b();
        f8423p = b13;
        f8424q = a(AtomicBoolean.class, b13);
        f7.w<AtomicIntegerArray> b14 = new a().b();
        f8425r = b14;
        f8426s = a(AtomicIntegerArray.class, b14);
        f8427t = new b();
        f8428u = new c();
        f8429v = new d();
        e eVar = new e();
        f8430w = eVar;
        f8431x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f8432y = fVar;
        f8433z = new g();
        A = new h();
        B = a(String.class, fVar);
        i iVar = new i();
        C = iVar;
        D = a(StringBuilder.class, iVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuffer.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(URL.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URI.class, mVar);
        C0128n c0128n = new C0128n();
        K = c0128n;
        L = d(InetAddress.class, c0128n);
        o oVar = new o();
        M = oVar;
        N = a(UUID.class, oVar);
        f7.w<Currency> b15 = new p().b();
        O = b15;
        P = a(Currency.class, b15);
        q qVar = new q();
        Q = qVar;
        R = c(Calendar.class, GregorianCalendar.class, qVar);
        r rVar = new r();
        S = rVar;
        T = a(Locale.class, rVar);
        s sVar = new s();
        U = sVar;
        V = d(f7.k.class, sVar);
        W = new t();
    }

    public static <TT> f7.x a(Class<TT> cls, f7.w<TT> wVar) {
        return new v(cls, wVar);
    }

    public static <TT> f7.x b(Class<TT> cls, Class<TT> cls2, f7.w<? super TT> wVar) {
        return new w(cls, cls2, wVar);
    }

    public static <TT> f7.x c(Class<TT> cls, Class<? extends TT> cls2, f7.w<? super TT> wVar) {
        return new x(cls, cls2, wVar);
    }

    public static <T1> f7.x d(Class<T1> cls, f7.w<T1> wVar) {
        return new y(cls, wVar);
    }
}
