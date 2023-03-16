package v3;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes.dex */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f15627a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15628b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f15627a = new Messenger(iBinder);
            this.f15628b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f15628b = new i(iBinder);
            this.f15627a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f15627a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        i iVar = this.f15628b;
        if (iVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        iVar.b(message);
    }
}
