package v3;

import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends k4.f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f15605a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, Looper looper) {
        super(looper);
        this.f15605a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d.d(this.f15605a, message);
    }
}
