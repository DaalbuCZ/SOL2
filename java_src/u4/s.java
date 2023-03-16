package u4;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends v4.t {

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ t4.j f15442o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ String f15443p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ w f15444q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, t4.j jVar, t4.j jVar2, String str) {
        super(jVar);
        this.f15444q = wVar;
        this.f15442o = jVar2;
        this.f15443p = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, v4.l] */
    @Override // v4.t
    protected final void a() {
        v4.s sVar;
        String str;
        Bundle i10;
        try {
            ?? e10 = this.f15444q.f15452a.e();
            str = this.f15444q.f15453b;
            i10 = w.i();
            e10.Y(str, i10, new u(this.f15444q, this.f15442o));
        } catch (RemoteException e11) {
            sVar = w.f15450e;
            sVar.c(e11, "completeUpdate(%s)", this.f15443p);
            this.f15442o.d(new RuntimeException(e11));
        }
    }
}
