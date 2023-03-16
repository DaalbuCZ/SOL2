package z6;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final u6.a f17460d = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final String f17461a;

    /* renamed from: b  reason: collision with root package name */
    private final i6.b<e1.g> f17462b;

    /* renamed from: c  reason: collision with root package name */
    private e1.f<b7.i> f17463c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(i6.b<e1.g> bVar, String str) {
        this.f17461a = str;
        this.f17462b = bVar;
    }

    private boolean a() {
        if (this.f17463c == null) {
            e1.g gVar = this.f17462b.get();
            if (gVar != null) {
                this.f17463c = gVar.a(this.f17461a, b7.i.class, e1.b.b("proto"), a.f17459a);
            } else {
                f17460d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f17463c != null;
    }

    public void b(b7.i iVar) {
        if (a()) {
            this.f17463c.b(e1.c.d(iVar));
        } else {
            f17460d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
