package v3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public class d {

    /* renamed from: h  reason: collision with root package name */
    private static int f15592h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f15593i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f15594j = e0.f15604n;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f15595k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b  reason: collision with root package name */
    private final Context f15597b;

    /* renamed from: c  reason: collision with root package name */
    private final y f15598c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f15599d;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f15601f;

    /* renamed from: g  reason: collision with root package name */
    private i f15602g;
    @GuardedBy("responseCallbacks")

    /* renamed from: a  reason: collision with root package name */
    private final m.g<String, t4.j<Bundle>> f15596a = new m.g<>();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f15600e = new Messenger(new f(this, Looper.getMainLooper()));

    public d(Context context) {
        this.f15597b = context;
        this.f15598c = new y(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15599d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ t4.i b(Bundle bundle) {
        return j(bundle) ? t4.l.e(null) : t4.l.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(d dVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        dVar.f15602g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f15601f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f15595k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        dVar.i(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (dVar.f15596a) {
                        for (int i10 = 0; i10 < dVar.f15596a.size(); i10++) {
                            dVar.i(dVar.f15596a.i(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                dVar.i(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final t4.i<Bundle> f(Bundle bundle) {
        final String g10 = g();
        final t4.j<Bundle> jVar = new t4.j<>();
        synchronized (this.f15596a) {
            this.f15596a.put(g10, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f15598c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        h(this.f15597b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g10).length() + 5);
        sb.append("|ID|");
        sb.append(g10);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f15600e);
        if (this.f15601f != null || this.f15602g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f15601f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f15602g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f15599d.schedule(new Runnable() { // from class: v3.d0
                @Override // java.lang.Runnable
                public final void run() {
                    if (t4.j.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            jVar.a().b(f15594j, new t4.d() { // from class: v3.b0
                @Override // t4.d
                public final void a(t4.i iVar) {
                    d.this.e(g10, schedule, iVar);
                }
            });
            return jVar.a();
        }
        if (this.f15598c.b() == 2) {
            this.f15597b.sendBroadcast(intent);
        } else {
            this.f15597b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f15599d.schedule(new Runnable() { // from class: v3.d0
            @Override // java.lang.Runnable
            public final void run() {
                if (t4.j.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        jVar.a().b(f15594j, new t4.d() { // from class: v3.b0
            @Override // t4.d
            public final void a(t4.i iVar) {
                d.this.e(g10, schedule2, iVar);
            }
        });
        return jVar.a();
    }

    private static synchronized String g() {
        String num;
        synchronized (d.class) {
            int i10 = f15592h;
            f15592h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (d.class) {
            if (f15593i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f15593i = k4.a.a(context, 0, intent2, k4.a.f10605a);
            }
            intent.putExtra("app", f15593i);
        }
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.f15596a) {
            t4.j<Bundle> remove = this.f15596a.remove(str);
            if (remove != null) {
                remove.c(bundle);
                return;
            }
            String valueOf = String.valueOf(str);
            Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public t4.i<Bundle> a(final Bundle bundle) {
        return this.f15598c.a() < 12000000 ? this.f15598c.b() != 0 ? f(bundle).j(f15594j, new t4.a() { // from class: v3.z
            @Override // t4.a
            public final Object a(t4.i iVar) {
                return d.this.c(bundle, iVar);
            }
        }) : t4.l.d(new IOException("MISSING_INSTANCEID_SERVICE")) : x.b(this.f15597b).d(1, bundle).h(f15594j, a0.f15585a);
    }

    public final /* synthetic */ t4.i c(Bundle bundle, t4.i iVar) {
        return (iVar.p() && j((Bundle) iVar.l())) ? f(bundle).q(f15594j, c0.f15591a) : iVar;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, t4.i iVar) {
        synchronized (this.f15596a) {
            this.f15596a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
