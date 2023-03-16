package f1;

import f1.l;
import java.util.Arrays;
/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f6924a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f6925b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6926c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f6927d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6928e;

    /* renamed from: f  reason: collision with root package name */
    private final long f6929f;

    /* renamed from: g  reason: collision with root package name */
    private final o f6930g;

    /* loaded from: classes.dex */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f6931a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f6932b;

        /* renamed from: c  reason: collision with root package name */
        private Long f6933c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f6934d;

        /* renamed from: e  reason: collision with root package name */
        private String f6935e;

        /* renamed from: f  reason: collision with root package name */
        private Long f6936f;

        /* renamed from: g  reason: collision with root package name */
        private o f6937g;

        @Override // f1.l.a
        public l a() {
            String str = "";
            if (this.f6931a == null) {
                str = " eventTimeMs";
            }
            if (this.f6933c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f6936f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f6931a.longValue(), this.f6932b, this.f6933c.longValue(), this.f6934d, this.f6935e, this.f6936f.longValue(), this.f6937g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.l.a
        public l.a b(Integer num) {
            this.f6932b = num;
            return this;
        }

        @Override // f1.l.a
        public l.a c(long j10) {
            this.f6931a = Long.valueOf(j10);
            return this;
        }

        @Override // f1.l.a
        public l.a d(long j10) {
            this.f6933c = Long.valueOf(j10);
            return this;
        }

        @Override // f1.l.a
        public l.a e(o oVar) {
            this.f6937g = oVar;
            return this;
        }

        @Override // f1.l.a
        l.a f(byte[] bArr) {
            this.f6934d = bArr;
            return this;
        }

        @Override // f1.l.a
        l.a g(String str) {
            this.f6935e = str;
            return this;
        }

        @Override // f1.l.a
        public l.a h(long j10) {
            this.f6936f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f6924a = j10;
        this.f6925b = num;
        this.f6926c = j11;
        this.f6927d = bArr;
        this.f6928e = str;
        this.f6929f = j12;
        this.f6930g = oVar;
    }

    @Override // f1.l
    public Integer b() {
        return this.f6925b;
    }

    @Override // f1.l
    public long c() {
        return this.f6924a;
    }

    @Override // f1.l
    public long d() {
        return this.f6926c;
    }

    @Override // f1.l
    public o e() {
        return this.f6930g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f6924a == lVar.c() && ((num = this.f6925b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f6926c == lVar.d()) {
                if (Arrays.equals(this.f6927d, lVar instanceof f ? ((f) lVar).f6927d : lVar.f()) && ((str = this.f6928e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f6929f == lVar.h()) {
                    o oVar = this.f6930g;
                    o e10 = lVar.e();
                    if (oVar == null) {
                        if (e10 == null) {
                            return true;
                        }
                    } else if (oVar.equals(e10)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // f1.l
    public byte[] f() {
        return this.f6927d;
    }

    @Override // f1.l
    public String g() {
        return this.f6928e;
    }

    @Override // f1.l
    public long h() {
        return this.f6929f;
    }

    public int hashCode() {
        long j10 = this.f6924a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6925b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f6926c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6927d)) * 1000003;
        String str = this.f6928e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f6929f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f6930g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f6924a + ", eventCode=" + this.f6925b + ", eventUptimeMs=" + this.f6926c + ", sourceExtension=" + Arrays.toString(this.f6927d) + ", sourceExtensionJsonProto3=" + this.f6928e + ", timezoneOffsetSeconds=" + this.f6929f + ", networkConnectionInfo=" + this.f6930g + "}";
    }
}
