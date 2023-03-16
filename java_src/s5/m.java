package s5;

import java.util.Objects;
import s5.b0;
/* loaded from: classes.dex */
final class m extends b0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final b0.e.d.a.b f14259a;

    /* renamed from: b  reason: collision with root package name */
    private final c0<b0.c> f14260b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<b0.c> f14261c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f14262d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14263e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b0.e.d.a.AbstractC0200a {

        /* renamed from: a  reason: collision with root package name */
        private b0.e.d.a.b f14264a;

        /* renamed from: b  reason: collision with root package name */
        private c0<b0.c> f14265b;

        /* renamed from: c  reason: collision with root package name */
        private c0<b0.c> f14266c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f14267d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f14268e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b0.e.d.a aVar) {
            this.f14264a = aVar.d();
            this.f14265b = aVar.c();
            this.f14266c = aVar.e();
            this.f14267d = aVar.b();
            this.f14268e = Integer.valueOf(aVar.f());
        }

        @Override // s5.b0.e.d.a.AbstractC0200a
        public b0.e.d.a a() {
            String str = "";
            if (this.f14264a == null) {
                str = " execution";
            }
            if (this.f14268e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f14264a, this.f14265b, this.f14266c, this.f14267d, this.f14268e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s5.b0.e.d.a.AbstractC0200a
        public b0.e.d.a.AbstractC0200a b(Boolean bool) {
            this.f14267d = bool;
            return this;
        }

        @Override // s5.b0.e.d.a.AbstractC0200a
        public b0.e.d.a.AbstractC0200a c(c0<b0.c> c0Var) {
            this.f14265b = c0Var;
            return this;
        }

        @Override // s5.b0.e.d.a.AbstractC0200a
        public b0.e.d.a.AbstractC0200a d(b0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f14264a = bVar;
            return this;
        }

        @Override // s5.b0.e.d.a.AbstractC0200a
        public b0.e.d.a.AbstractC0200a e(c0<b0.c> c0Var) {
            this.f14266c = c0Var;
            return this;
        }

        @Override // s5.b0.e.d.a.AbstractC0200a
        public b0.e.d.a.AbstractC0200a f(int i10) {
            this.f14268e = Integer.valueOf(i10);
            return this;
        }
    }

    private m(b0.e.d.a.b bVar, c0<b0.c> c0Var, c0<b0.c> c0Var2, Boolean bool, int i10) {
        this.f14259a = bVar;
        this.f14260b = c0Var;
        this.f14261c = c0Var2;
        this.f14262d = bool;
        this.f14263e = i10;
    }

    @Override // s5.b0.e.d.a
    public Boolean b() {
        return this.f14262d;
    }

    @Override // s5.b0.e.d.a
    public c0<b0.c> c() {
        return this.f14260b;
    }

    @Override // s5.b0.e.d.a
    public b0.e.d.a.b d() {
        return this.f14259a;
    }

    @Override // s5.b0.e.d.a
    public c0<b0.c> e() {
        return this.f14261c;
    }

    public boolean equals(Object obj) {
        c0<b0.c> c0Var;
        c0<b0.c> c0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.a) {
            b0.e.d.a aVar = (b0.e.d.a) obj;
            return this.f14259a.equals(aVar.d()) && ((c0Var = this.f14260b) != null ? c0Var.equals(aVar.c()) : aVar.c() == null) && ((c0Var2 = this.f14261c) != null ? c0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f14262d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f14263e == aVar.f();
        }
        return false;
    }

    @Override // s5.b0.e.d.a
    public int f() {
        return this.f14263e;
    }

    @Override // s5.b0.e.d.a
    public b0.e.d.a.AbstractC0200a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.f14259a.hashCode() ^ 1000003) * 1000003;
        c0<b0.c> c0Var = this.f14260b;
        int hashCode2 = (hashCode ^ (c0Var == null ? 0 : c0Var.hashCode())) * 1000003;
        c0<b0.c> c0Var2 = this.f14261c;
        int hashCode3 = (hashCode2 ^ (c0Var2 == null ? 0 : c0Var2.hashCode())) * 1000003;
        Boolean bool = this.f14262d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f14263e;
    }

    public String toString() {
        return "Application{execution=" + this.f14259a + ", customAttributes=" + this.f14260b + ", internalKeys=" + this.f14261c + ", background=" + this.f14262d + ", uiOrientation=" + this.f14263e + "}";
    }
}
