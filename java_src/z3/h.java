package z3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static int f17385a = 4225;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f17386b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static j1 f17387c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f17388d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f17389e = false;

    public static int a() {
        return f17385a;
    }

    public static h b(Context context) {
        synchronized (f17386b) {
            if (f17387c == null) {
                f17387c = new j1(context.getApplicationContext(), f17389e ? c().getLooper() : context.getMainLooper());
            }
        }
        return f17387c;
    }

    public static HandlerThread c() {
        synchronized (f17386b) {
            HandlerThread handlerThread = f17388d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f17388d = handlerThread2;
            handlerThread2.start();
            return f17388d;
        }
    }

    protected abstract void d(f1 f1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new f1(str, str2, i10, z10), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(f1 f1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
