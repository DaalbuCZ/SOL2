package z3;

import android.content.Intent;
/* loaded from: classes.dex */
final class c0 extends d0 {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Intent f17332n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ y3.e f17333o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(Intent intent, y3.e eVar, int i10) {
        this.f17332n = intent;
        this.f17333o = eVar;
    }

    @Override // z3.d0
    public final void a() {
        Intent intent = this.f17332n;
        if (intent != null) {
            this.f17333o.startActivityForResult(intent, 2);
        }
    }
}
