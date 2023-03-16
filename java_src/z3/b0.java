package z3;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
final class b0 extends d0 {

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Intent f17311n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ Activity f17312o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ int f17313p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(Intent intent, Activity activity, int i10) {
        this.f17311n = intent;
        this.f17312o = activity;
        this.f17313p = i10;
    }

    @Override // z3.d0
    public final void a() {
        Intent intent = this.f17311n;
        if (intent != null) {
            this.f17312o.startActivityForResult(intent, this.f17313p);
        }
    }
}
