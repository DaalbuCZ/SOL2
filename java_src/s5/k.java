package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class k extends b0.e.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f14231a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14232b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14233c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14234d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14235e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f14236f;

    /* renamed from: g  reason: collision with root package name */
    private final int f14237g;

    /* renamed from: h  reason: collision with root package name */
    private final String f14238h;

    /* renamed from: i  reason: collision with root package name */
    private final String f14239i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f14240a;

        /* renamed from: b  reason: collision with root package name */
        private String f14241b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f14242c;

        /* renamed from: d  reason: collision with root package name */
        private Long f14243d;

        /* renamed from: e  reason: collision with root package name */
        private Long f14244e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f14245f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f14246g;

        /* renamed from: h  reason: collision with root package name */
        private String f14247h;

        /* renamed from: i  reason: collision with root package name */
        private String f14248i;

        @Override // s5.b0.e.c.a
        public b0.e.c a() {
            String str = "";
            if (this.f14240a == null) {
                str = " arch";
            }
            if (this.f14241b == null) {
                str = str + " model";
            }
            if (this.f14242c == null) {
                str = str + " cores";
            }
            if (this.f14243d == null) {
                str = str + " ram";
            }
            if (this.f14244e == null) {
                str = str + " diskSpace";
            }
            if (this.f14245f == null) {
                str = str + " simulator";
            }
            if (this.f14246g == null) {
                str = str + " state";
            }
            if (this.f14247h == null) {
                str = str + " manufacturer";
            }
            if (this.f14248i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f14240a.intValue(), this.f14241b, this.f14242c.intValue(), this.f14243d.longValue(), this.f14244e.longValue(), this.f14245f.booleanValue(), this.f14246g.intValue(), this.f14247h, this.f14248i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a b(int i10) {
            this.f14240a = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a c(int i10) {
            this.f14242c = Integer.valueOf(i10);
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a d(long j10) {
            this.f14244e = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f14247h = str;
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f14241b = str;
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f14248i = str;
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a h(long j10) {
            this.f14243d = Long.valueOf(j10);
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a i(boolean z10) {
            this.f14245f = Boolean.valueOf(z10);
            return this;
        }

        @Override // s5.b0.e.c.a
        public b0.e.c.a j(int i10) {
            this.f14246g = Integer.valueOf(i10);
            return this;
        }
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f14231a = i10;
        this.f14232b = str;
        this.f14233c = i11;
        this.f14234d = j10;
        this.f14235e = j11;
        this.f14236f = z10;
        this.f14237g = i12;
        this.f14238h = str2;
        this.f14239i = str3;
    }

    @Override // s5.b0.e.c
    public int b() {
        return this.f14231a;
    }

    @Override // s5.b0.e.c
    public int c() {
        return this.f14233c;
    }

    @Override // s5.b0.e.c
    public long d() {
        return this.f14235e;
    }

    @Override // s5.b0.e.c
    public String e() {
        return this.f14238h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.c) {
            b0.e.c cVar = (b0.e.c) obj;
            return this.f14231a == cVar.b() && this.f14232b.equals(cVar.f()) && this.f14233c == cVar.c() && this.f14234d == cVar.h() && this.f14235e == cVar.d() && this.f14236f == cVar.j() && this.f14237g == cVar.i() && this.f14238h.equals(cVar.e()) && this.f14239i.equals(cVar.g());
        }
        return false;
    }

    @Override // s5.b0.e.c
    public String f() {
        return this.f14232b;
    }

    @Override // s5.b0.e.c
    public String g() {
        return this.f14239i;
    }

    @Override // s5.b0.e.c
    public long h() {
        return this.f14234d;
    }

    public int hashCode() {
        long j10 = this.f14234d;
        long j11 = this.f14235e;
        return ((((((((((((((((this.f14231a ^ 1000003) * 1000003) ^ this.f14232b.hashCode()) * 1000003) ^ this.f14233c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14236f ? 1231 : 1237)) * 1000003) ^ this.f14237g) * 1000003) ^ this.f14238h.hashCode()) * 1000003) ^ this.f14239i.hashCode();
    }

    @Override // s5.b0.e.c
    public int i() {
        return this.f14237g;
    }

    @Override // s5.b0.e.c
    public boolean j() {
        return this.f14236f;
    }

    public String toString() {
        return "Device{arch=" + this.f14231a + ", model=" + this.f14232b + ", cores=" + this.f14233c + ", ram=" + this.f14234d + ", diskSpace=" + this.f14235e + ", simulator=" + this.f14236f + ", state=" + this.f14237g + ", manufacturer=" + this.f14238h + ", modelClass=" + this.f14239i + "}";
    }
}
