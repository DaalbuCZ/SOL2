package s0;
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13222a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<m> f13223b;

    /* renamed from: c  reason: collision with root package name */
    private final y.d f13224c;

    /* renamed from: d  reason: collision with root package name */
    private final y.d f13225d;

    /* loaded from: classes.dex */
    class a extends y.a<m> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, m mVar) {
            String str = mVar.f13220a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            byte[] n10 = androidx.work.b.n(mVar.f13221b);
            if (n10 == null) {
                fVar.u(2);
            } else {
                fVar.P(2, n10);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends y.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    class c extends y.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f13222a = hVar;
        this.f13223b = new a(hVar);
        this.f13224c = new b(hVar);
        this.f13225d = new c(hVar);
    }

    @Override // s0.n
    public void a(String str) {
        this.f13222a.b();
        b0.f a10 = this.f13224c.a();
        if (str == null) {
            a10.u(1);
        } else {
            a10.n(1, str);
        }
        this.f13222a.c();
        try {
            a10.q();
            this.f13222a.r();
        } finally {
            this.f13222a.g();
            this.f13224c.f(a10);
        }
    }

    @Override // s0.n
    public void b() {
        this.f13222a.b();
        b0.f a10 = this.f13225d.a();
        this.f13222a.c();
        try {
            a10.q();
            this.f13222a.r();
        } finally {
            this.f13222a.g();
            this.f13225d.f(a10);
        }
    }
}
