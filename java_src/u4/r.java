package u4;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends v4.t {

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ String f15439o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ t4.j f15440p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ w f15441q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, t4.j jVar, String str, t4.j jVar2) {
        super(jVar);
        this.f15441q = wVar;
        this.f15439o = str;
        this.f15440p = jVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, v4.l] */
    @Override // v4.t
    protected final void a() {
        v4.s sVar;
        String str;
        try {
            ?? e10 = this.f15441q.f15452a.e();
            w wVar = this.f15441q;
            str = wVar.f15453b;
            e10.R(str, w.b(wVar, this.f15439o), new v(this.f15441q, this.f15440p, this.f15439o));
        } catch (RemoteException e11) {
            sVar = w.f15450e;
            sVar.c(e11, "requestUpdateInfo(%s)", this.f15439o);
            this.f15440p.d(new RuntimeException(e11));
        }
    }
}
