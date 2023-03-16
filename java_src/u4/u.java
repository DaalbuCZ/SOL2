package u4;

import android.os.Bundle;
/* loaded from: classes.dex */
final class u extends t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w wVar, t4.j jVar) {
        super(wVar, new v4.s("OnCompleteUpdateCallback"), jVar);
    }

    @Override // u4.t, v4.n
    public final void C(Bundle bundle) {
        int i10;
        int i11;
        super.C(bundle);
        i10 = bundle.getInt("error.code", -2);
        if (i10 == 0) {
            this.f15446b.e(null);
            return;
        }
        t4.j jVar = this.f15446b;
        i11 = bundle.getInt("error.code", -2);
        jVar.d(new x4.a(i11));
    }
}
