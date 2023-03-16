package androidx.core.app;

import a.a;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d  reason: collision with root package name */
    private static String f1272d;

    /* renamed from: g  reason: collision with root package name */
    private static d f1275g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1276a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f1277b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1271c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f1273e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1274f = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f1278a;

        /* renamed from: b  reason: collision with root package name */
        final int f1279b;

        /* renamed from: c  reason: collision with root package name */
        final String f1280c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f1281d;

        a(String str) {
            this.f1278a = str;
            this.f1279b = 0;
            this.f1280c = null;
            this.f1281d = true;
        }

        a(String str, int i10, String str2) {
            this.f1278a = str;
            this.f1279b = i10;
            this.f1280c = str2;
            this.f1281d = false;
        }

        @Override // androidx.core.app.n.e
        public void a(a.a aVar) {
            if (this.f1281d) {
                aVar.M(this.f1278a);
            } else {
                aVar.u(this.f1278a, this.f1279b, this.f1280c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f1278a + ", id:" + this.f1279b + ", tag:" + this.f1280c + ", all:" + this.f1281d + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final String f1282a;

        /* renamed from: b  reason: collision with root package name */
        final int f1283b;

        /* renamed from: c  reason: collision with root package name */
        final String f1284c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f1285d;

        b(String str, int i10, String str2, Notification notification) {
            this.f1282a = str;
            this.f1283b = i10;
            this.f1284c = str2;
            this.f1285d = notification;
        }

        @Override // androidx.core.app.n.e
        public void a(a.a aVar) {
            aVar.b0(this.f1282a, this.f1283b, this.f1284c, this.f1285d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f1282a + ", id:" + this.f1283b + ", tag:" + this.f1284c + "]";
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f1286a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f1287b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f1286a = componentName;
            this.f1287b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: n  reason: collision with root package name */
        private final Context f1288n;

        /* renamed from: o  reason: collision with root package name */
        private final HandlerThread f1289o;

        /* renamed from: p  reason: collision with root package name */
        private final Handler f1290p;

        /* renamed from: q  reason: collision with root package name */
        private final Map<ComponentName, a> f1291q = new HashMap();

        /* renamed from: r  reason: collision with root package name */
        private Set<String> f1292r = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f1293a;

            /* renamed from: c  reason: collision with root package name */
            a.a f1295c;

            /* renamed from: b  reason: collision with root package name */
            boolean f1294b = false;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<e> f1296d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f1297e = 0;

            a(ComponentName componentName) {
                this.f1293a = componentName;
            }
        }

        d(Context context) {
            this.f1288n = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1289o = handlerThread;
            handlerThread.start();
            this.f1290p = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f1294b) {
                return true;
            }
            boolean bindService = this.f1288n.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1293a), this, 33);
            aVar.f1294b = bindService;
            if (bindService) {
                aVar.f1297e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1293a);
                this.f1288n.unbindService(this);
            }
            return aVar.f1294b;
        }

        private void b(a aVar) {
            if (aVar.f1294b) {
                this.f1288n.unbindService(this);
                aVar.f1294b = false;
            }
            aVar.f1295c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f1291q.values()) {
                aVar.f1296d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f1291q.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f1291q.get(componentName);
            if (aVar != null) {
                aVar.f1295c = a.AbstractBinderC0000a.a(iBinder);
                aVar.f1297e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f1291q.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1293a + ", " + aVar.f1296d.size() + " queued tasks");
            }
            if (aVar.f1296d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f1295c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e peek = aVar.f1296d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f1295c);
                    aVar.f1296d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f1293a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1293a, e10);
                }
            }
            if (aVar.f1296d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f1290p.hasMessages(3, aVar.f1293a)) {
                return;
            }
            int i10 = aVar.f1297e + 1;
            aVar.f1297e = i10;
            if (i10 <= 6) {
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f1290p.sendMessageDelayed(this.f1290p.obtainMessage(3, aVar.f1293a), i11);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1296d.size() + " tasks to " + aVar.f1293a + " after " + aVar.f1297e + " retries");
            aVar.f1296d.clear();
        }

        private void j() {
            Set<String> g10 = n.g(this.f1288n);
            if (g10.equals(this.f1292r)) {
                return;
            }
            this.f1292r = g10;
            List<ResolveInfo> queryIntentServices = this.f1288n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (g10.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f1291q.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f1291q.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f1291q.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f1290p.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((e) message.obj);
                return true;
            } else if (i10 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f1286a, cVar.f1287b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1290p.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1290p.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        void a(a.a aVar);
    }

    private n(Context context) {
        this.f1276a = context;
        this.f1277b = (NotificationManager) context.getSystemService("notification");
    }

    public static n f(Context context) {
        return new n(context);
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1271c) {
            if (string != null) {
                if (!string.equals(f1272d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f1273e = hashSet;
                    f1272d = string;
                }
            }
            set = f1273e;
        }
        return set;
    }

    private void k(e eVar) {
        synchronized (f1274f) {
            if (f1275g == null) {
                f1275g = new d(this.f1276a.getApplicationContext());
            }
            f1275g.h(eVar);
        }
    }

    private static boolean l(Notification notification) {
        Bundle a10 = k.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return this.f1277b.areNotificationsEnabled();
        }
        if (i10 >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f1276a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f1276a.getApplicationInfo();
            String packageName = this.f1276a.getApplicationContext().getPackageName();
            int i11 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        }
        return true;
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f1277b.cancel(str, i10);
        if (Build.VERSION.SDK_INT <= 19) {
            k(new a(this.f1276a.getPackageName(), i10, str));
        }
    }

    public void d() {
        this.f1277b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            k(new a(this.f1276a.getPackageName()));
        }
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1277b.createNotificationChannel(notificationChannel);
        }
    }

    public List<NotificationChannel> h() {
        return Build.VERSION.SDK_INT >= 26 ? this.f1277b.getNotificationChannels() : Collections.emptyList();
    }

    public void i(int i10, Notification notification) {
        j(null, i10, notification);
    }

    public void j(String str, int i10, Notification notification) {
        if (!l(notification)) {
            this.f1277b.notify(str, i10, notification);
            return;
        }
        k(new b(this.f1276a.getPackageName(), i10, str, notification));
        this.f1277b.cancel(str, i10);
    }
}
