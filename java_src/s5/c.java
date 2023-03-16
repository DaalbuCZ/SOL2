package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class c extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f14157a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14158b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14159c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14160d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14161e;

    /* renamed from: f  reason: collision with root package name */
    private final long f14162f;

    /* renamed from: g  reason: collision with root package name */
    private final long f14163g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14164h;

    /* renamed from: i  reason: collision with root package name */
    private final c0<b0.a.AbstractC0197a> f14165i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.a.b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f14166a;

        /* renamed from: b  reason: collision with root package name */
        private String f14167b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f14168c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f14169d;

        /* renamed from: e  reason: collision with root package name */
        private Long f14170e;

        /* renamed from: f  reason: collision with root package name */
        private Long f14171f;

        /* renamed from: g  reason: collision with root package name */
        private Long f14172g;

        /* renamed from: h  reason: collision with root package name */
        private String f14173h;

        /* renamed from: i  reason: collision with root package name */
        private c0<b0.a.AbstractC0197a> f14174i;

        @Override // s5.b0.a.b
        public b0.a a() {
            String str = "";
            if (this.f14166a == null) {
                str = " pid";
            }
            if (this.f14167b == null) {
                str = str + " processName";
            }
            if (this.f14168c == null) {
                str = str + " reasonCode";
            }
            if (this.f14169d == null) {
                str = str + " importance";
            }
            if (this.f14170e == null) {
                str = str + " pss";
            }
            if (this.f14171f == null) {
                str = str + " rss";
            }
            if (this.f14172g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f14166a.intValue(), this.f14167b, this.f14168c.intValue(), this.f14169d.intValue(), this.f14170e.longValue(), this.f14171f.longValue(), this.f14172g.longValue(), this.f14173h, this.f14174i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.a.b
        public b0.a.b b(c0<b0.a.AbstractC0197a> c0Var) {
            this.f14174i = c0Var;
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b c(int i10) {
            this.f14169d = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b d(int i10) {
            this.f14166a = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b e(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f14167b = str;
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b f(long j10) {
            this.f14170e = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b g(int i10) {
            this.f14168c = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b h(long j10) {
            this.f14171f = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b i(long j10) {
            this.f14172g = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.a.b
        public b0.a.b j(String str) {
            this.f14173h = str;
            return this;
        }
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, c0<b0.a.AbstractC0197a> c0Var) {
        this.f14157a = i10;
        this.f14158b = str;
        this.f14159c = i11;
        this.f14160d = i12;
        this.f14161e = j10;
        this.f14162f = j11;
        this.f14163g = j12;
        this.f14164h = str2;
        this.f14165i = c0Var;
    }

    @Override // s5.b0.a
    public c0<b0.a.AbstractC0197a> b() {
        return this.f14165i;
    }

    @Override // s5.b0.a
    public int c() {
        return this.f14160d;
    }

    @Override // s5.b0.a
    public int d() {
        return this.f14157a;
    }

    @Override // s5.b0.a
    public String e() {
        return this.f14158b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.a) {
            b0.a aVar = (b0.a) obj;
            if (this.f14157a == aVar.d() && this.f14158b.equals(aVar.e()) && this.f14159c == aVar.g() && this.f14160d == aVar.c() && this.f14161e == aVar.f() && this.f14162f == aVar.h() && this.f14163g == aVar.i() && ((str = this.f14164h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
                c0<b0.a.AbstractC0197a> c0Var = this.f14165i;
                c0<b0.a.AbstractC0197a> b10 = aVar.b();
                if (c0Var == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (c0Var.equals(b10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // s5.b0.a
    public long f() {
        return this.f14161e;
    }

    @Override // s5.b0.a
    public int g() {
        return this.f14159c;
    }

    @Override // s5.b0.a
    public long h() {
        return this.f14162f;
    }

    public int hashCode() {
        long j10 = this.f14161e;
        long j11 = this.f14162f;
        long j12 = this.f14163g;
        int hashCode = (((((((((((((this.f14157a ^ 1000003) * 1000003) ^ this.f14158b.hashCode()) * 1000003) ^ this.f14159c) * 1000003) ^ this.f14160d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f14164h;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        c0<b0.a.AbstractC0197a> c0Var = this.f14165i;
        return hashCode2 ^ (c0Var != null ? c0Var.hashCode() : 0);
    }

    @Override // s5.b0.a
    public long i() {
        return this.f14163g;
    }

    @Override // s5.b0.a
    public String j() {
        return this.f14164h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f14157a + ", processName=" + this.f14158b + ", reasonCode=" + this.f14159c + ", importance=" + this.f14160d + ", pss=" + this.f14161e + ", rss=" + this.f14162f + ", timestamp=" + this.f14163g + ", traceFile=" + this.f14164h + ", buildIdMappingForArch=" + this.f14165i + "}";
    }
}
