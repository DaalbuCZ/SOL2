package u4;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
/* loaded from: classes.dex */
final class k implements w4.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f15427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar, Activity activity) {
        this.f15427a = activity;
    }

    @Override // w4.a
    public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        this.f15427a.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
