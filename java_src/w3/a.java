package w3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: n  reason: collision with root package name */
    boolean f16050n = false;

    /* renamed from: o  reason: collision with root package name */
    private final BlockingQueue f16051o = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) {
        z3.o.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f16050n) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f16050n = true;
        IBinder iBinder = (IBinder) this.f16051o.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16051o.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
