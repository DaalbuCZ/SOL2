package z3;

import android.app.PendingIntent;
import android.os.Bundle;
/* loaded from: classes.dex */
abstract class m0 extends w0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f17418d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f17419e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f17420f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f17420f = cVar;
        this.f17418d = i10;
        this.f17419e = bundle;
    }

    @Override // z3.w0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        w3.b bVar;
        if (this.f17418d != 0) {
            this.f17420f.i0(1, null);
            Bundle bundle = this.f17419e;
            bVar = new w3.b(this.f17418d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else if (g()) {
            return;
        } else {
            this.f17420f.i0(1, null);
            bVar = new w3.b(8, null);
        }
        f(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0
    public final void b() {
    }

    protected abstract void f(w3.b bVar);

    protected abstract boolean g();
}
