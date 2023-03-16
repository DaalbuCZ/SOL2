package u4;

import android.os.Bundle;
/* loaded from: classes.dex */
class t extends v4.m {

    /* renamed from: a  reason: collision with root package name */
    final v4.s f15445a;

    /* renamed from: b  reason: collision with root package name */
    final t4.j f15446b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ w f15447c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(w wVar, v4.s sVar, t4.j jVar) {
        this.f15447c = wVar;
        this.f15445a = sVar;
        this.f15446b = jVar;
    }

    @Override // v4.n
    public void C(Bundle bundle) {
        this.f15447c.f15452a.r(this.f15446b);
        this.f15445a.d("onCompleteUpdate", new Object[0]);
    }

    @Override // v4.n
    public void k(Bundle bundle) {
        this.f15447c.f15452a.r(this.f15446b);
        this.f15445a.d("onRequestInfo", new Object[0]);
    }
}
