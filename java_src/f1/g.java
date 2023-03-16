package f1;

import f1.m;
import java.util.List;
/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f6938a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6939b;

    /* renamed from: c  reason: collision with root package name */
    private final k f6940c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f6941d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6942e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f6943f;

    /* renamed from: g  reason: collision with root package name */
    private final p f6944g;

    /* loaded from: classes.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f6945a;

        /* renamed from: b  reason: collision with root package name */
        private Long f6946b;

        /* renamed from: c  reason: collision with root package name */
        private k f6947c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f6948d;

        /* renamed from: e  reason: collision with root package name */
        private String f6949e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f6950f;

        /* renamed from: g  reason: collision with root package name */
        private p f6951g;

        @Override // f1.m.a
        public m a() {
            String str = "";
            if (this.f6945a == null) {
                str = " requestTimeMs";
            }
            if (this.f6946b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f6945a.longValue(), this.f6946b.longValue(), this.f6947c, this.f6948d, this.f6949e, this.f6950f, this.f6951g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.m.a
        public m.a b(k kVar) {
            this.f6947c = kVar;
            return this;
        }

        @Override // f1.m.a
        public m.a c(List<l> list) {
            this.f6950f = list;
            return this;
        }

        @Override // f1.m.a
        m.a d(Integer num) {
            this.f6948d = num;
            return this;
        }

        @Override // f1.m.a
        m.a e(String str) {
            this.f6949e = str;
            return this;
        }

        @Override // f1.m.a
        public m.a f(p pVar) {
            this.f6951g = pVar;
            return this;
        }

        @Override // f1.m.a
        public m.a g(long j10) {
            this.f6945a = Long.valueOf(j10);
            return this;
        }

        @Override // f1.m.a
        public m.a h(long j10) {
            this.f6946b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f6938a = j10;
        this.f6939b = j11;
        this.f6940c = kVar;
        this.f6941d = num;
        this.f6942e = str;
        this.f6943f = list;
        this.f6944g = pVar;
    }

    @Override // f1.m
    public k b() {
        return this.f6940c;
    }

    @Override // f1.m
    public List<l> c() {
        return this.f6943f;
    }

    @Override // f1.m
    public Integer d() {
        return this.f6941d;
    }

    @Override // f1.m
    public String e() {
        return this.f6942e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f6938a == mVar.g() && this.f6939b == mVar.h() && ((kVar = this.f6940c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f6941d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f6942e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f6943f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
                p pVar = this.f6944g;
                p f10 = mVar.f();
                if (pVar == null) {
                    if (f10 == null) {
                        return true;
                    }
                } else if (pVar.equals(f10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // f1.m
    public p f() {
        return this.f6944g;
    }

    @Override // f1.m
    public long g() {
        return this.f6938a;
    }

    @Override // f1.m
    public long h() {
        return this.f6939b;
    }

    public int hashCode() {
        long j10 = this.f6938a;
        long j11 = this.f6939b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f6940c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f6941d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f6942e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f6943f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f6944g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f6938a + ", requestUptimeMs=" + this.f6939b + ", clientInfo=" + this.f6940c + ", logSource=" + this.f6941d + ", logSourceName=" + this.f6942e + ", logEvents=" + this.f6943f + ", qosTier=" + this.f6944g + "}";
    }
}
