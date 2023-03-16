package v3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* renamed from: p  reason: collision with root package name */
    s f15623p;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ x f15626s;
    @GuardedBy("this")

    /* renamed from: n  reason: collision with root package name */
    int f15621n = 0;

    /* renamed from: o  reason: collision with root package name */
    final Messenger f15622o = new Messenger(new k4.f(Looper.getMainLooper(), new Handler.Callback() { // from class: v3.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            r rVar = r.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i10);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (rVar) {
                u<?> uVar = rVar.f15625r.get(i10);
                if (uVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i10);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                rVar.f15625r.remove(i10);
                rVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    uVar.c(new v(4, "Not supported by GmsCore", null));
                    return true;
                }
                uVar.a(data);
                return true;
            }
        }
    }));
    @GuardedBy("this")

    /* renamed from: q  reason: collision with root package name */
    final Queue<u<?>> f15624q = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: r  reason: collision with root package name */
    final SparseArray<u<?>> f15625r = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ r(x xVar, q qVar) {
        this.f15626s = xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f15621n;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f15621n = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f15621n = 4;
        c4.a.b().c(x.a(this.f15626s), this);
        v vVar = new v(i10, str, th);
        for (u<?> uVar : this.f15624q) {
            uVar.c(vVar);
        }
        this.f15624q.clear();
        for (int i12 = 0; i12 < this.f15625r.size(); i12++) {
            this.f15625r.valueAt(i12).c(vVar);
        }
        this.f15625r.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        x.e(this.f15626s).execute(new Runnable() { // from class: v3.m
            @Override // java.lang.Runnable
            public final void run() {
                final u<?> poll;
                final r rVar = r.this;
                while (true) {
                    synchronized (rVar) {
                        if (rVar.f15621n != 2) {
                            return;
                        }
                        if (rVar.f15624q.isEmpty()) {
                            rVar.f();
                            return;
                        }
                        poll = rVar.f15624q.poll();
                        rVar.f15625r.put(poll.f15629a, poll);
                        x.e(rVar.f15626s).schedule(new Runnable() { // from class: v3.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                r.this.e(poll.f15629a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context a10 = x.a(rVar.f15626s);
                    Messenger messenger = rVar.f15622o;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f15631c;
                    obtain.arg1 = poll.f15629a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.b());
                    bundle.putString("pkg", a10.getPackageName());
                    bundle.putBundle("data", poll.f15632d);
                    obtain.setData(bundle);
                    try {
                        rVar.f15623p.a(obtain);
                    } catch (RemoteException e10) {
                        rVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f15621n == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        u<?> uVar = this.f15625r.get(i10);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i10);
            Log.w("MessengerIpcClient", sb.toString());
            this.f15625r.remove(i10);
            uVar.c(new v(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.f15621n == 2 && this.f15624q.isEmpty() && this.f15625r.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f15621n = 3;
            c4.a.b().c(x.a(this.f15626s), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(u<?> uVar) {
        int i10 = this.f15621n;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f15624q.add(uVar);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                this.f15624q.add(uVar);
                c();
                return true;
            }
        }
        this.f15624q.add(uVar);
        z3.o.l(this.f15621n == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f15621n = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (c4.a.b().a(x.a(this.f15626s), intent, this, 1)) {
                x.e(this.f15626s).schedule(new Runnable() { // from class: v3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        x.e(this.f15626s).execute(new Runnable() { // from class: v3.o
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = r.this;
                IBinder iBinder2 = iBinder;
                synchronized (rVar) {
                    try {
                        if (iBinder2 == null) {
                            rVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            rVar.f15623p = new s(iBinder2);
                            rVar.f15621n = 2;
                            rVar.c();
                        } catch (RemoteException e10) {
                            rVar.a(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        x.e(this.f15626s).execute(new Runnable() { // from class: v3.l
            @Override // java.lang.Runnable
            public final void run() {
                r.this.a(2, "Service disconnected");
            }
        });
    }
}
