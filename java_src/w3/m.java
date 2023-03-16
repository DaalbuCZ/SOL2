package w3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class m extends j4.f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f16102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f16102b = eVar;
        this.f16101a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i10);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int g10 = this.f16102b.g(this.f16101a);
        if (this.f16102b.j(g10)) {
            this.f16102b.o(this.f16101a, g10);
        }
    }
}
