package u4;

import android.os.Bundle;
/* loaded from: classes.dex */
final class v extends t {

    /* renamed from: d  reason: collision with root package name */
    private final String f15448d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w f15449e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t4.j jVar, String str) {
        super(wVar, new v4.s("OnRequestInstallCallback"), jVar);
        this.f15449e = wVar;
        this.f15448d = str;
    }

    @Override // u4.t, v4.n
    public final void k(Bundle bundle) {
        int i10;
        int i11;
        super.k(bundle);
        i10 = bundle.getInt("error.code", -2);
        if (i10 == 0) {
            this.f15446b.e(w.f(this.f15449e, bundle, this.f15448d));
            return;
        }
        t4.j jVar = this.f15446b;
        i11 = bundle.getInt("error.code", -2);
        jVar.d(new x4.a(i11));
    }
}
