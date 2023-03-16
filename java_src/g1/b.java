package g1;

import g1.i;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f7391a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f7392b;

    /* renamed from: c  reason: collision with root package name */
    private final h f7393c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7394d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7395e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f7396f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0111b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f7397a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f7398b;

        /* renamed from: c  reason: collision with root package name */
        private h f7399c;

        /* renamed from: d  reason: collision with root package name */
        private Long f7400d;

        /* renamed from: e  reason: collision with root package name */
        private Long f7401e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f7402f;

        @Override // g1.i.a
        public i d() {
            String str = "";
            if (this.f7397a == null) {
                str = " transportName";
            }
            if (this.f7399c == null) {
                str = str + " encodedPayload";
            }
            if (this.f7400d == null) {
                str = str + " eventMillis";
            }
            if (this.f7401e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f7402f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f7397a, this.f7398b, this.f7399c, this.f7400d.longValue(), this.f7401e.longValue(), this.f7402f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // g1.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f7402f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // g1.i.a
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f7402f = map;
            return this;
        }

        @Override // g1.i.a
        public i.a g(Integer num) {
            this.f7398b = num;
            return this;
        }

        @Override // g1.i.a
        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f7399c = hVar;
            return this;
        }

        @Override // g1.i.a
        public i.a i(long j10) {
            this.f7400d = Long.valueOf(j10);
            return this;
        }

        @Override // g1.i.a
        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f7397a = str;
            return this;
        }

        @Override // g1.i.a
        public i.a k(long j10) {
            this.f7401e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f7391a = str;
        this.f7392b = num;
        this.f7393c = hVar;
        this.f7394d = j10;
        this.f7395e = j11;
        this.f7396f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g1.i
    public Map<String, String> c() {
        return this.f7396f;
    }

    @Override // g1.i
    public Integer d() {
        return this.f7392b;
    }

    @Override // g1.i
    public h e() {
        return this.f7393c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f7391a.equals(iVar.j()) && ((num = this.f7392b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f7393c.equals(iVar.e()) && this.f7394d == iVar.f() && this.f7395e == iVar.k() && this.f7396f.equals(iVar.c());
        }
        return false;
    }

    @Override // g1.i
    public long f() {
        return this.f7394d;
    }

    public int hashCode() {
        int hashCode = (this.f7391a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7392b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f7394d;
        long j11 = this.f7395e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f7393c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f7396f.hashCode();
    }

    @Override // g1.i
    public String j() {
        return this.f7391a;
    }

    @Override // g1.i
    public long k() {
        return this.f7395e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f7391a + ", code=" + this.f7392b + ", encodedPayload=" + this.f7393c + ", eventMillis=" + this.f7394d + ", uptimeMillis=" + this.f7395e + ", autoMetadata=" + this.f7396f + "}";
    }
}
