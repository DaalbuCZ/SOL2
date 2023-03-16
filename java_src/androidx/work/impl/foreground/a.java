package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k0.e;
import k0.j;
import l0.i;
import o0.c;
import o0.d;
import s0.p;
/* loaded from: classes.dex */
public class a implements c, l0.b {

    /* renamed from: x  reason: collision with root package name */
    static final String f2650x = j.f("SystemFgDispatcher");

    /* renamed from: n  reason: collision with root package name */
    private Context f2651n;

    /* renamed from: o  reason: collision with root package name */
    private i f2652o;

    /* renamed from: p  reason: collision with root package name */
    private final u0.a f2653p;

    /* renamed from: q  reason: collision with root package name */
    final Object f2654q = new Object();

    /* renamed from: r  reason: collision with root package name */
    String f2655r;

    /* renamed from: s  reason: collision with root package name */
    final Map<String, e> f2656s;

    /* renamed from: t  reason: collision with root package name */
    final Map<String, p> f2657t;

    /* renamed from: u  reason: collision with root package name */
    final Set<p> f2658u;

    /* renamed from: v  reason: collision with root package name */
    final d f2659v;

    /* renamed from: w  reason: collision with root package name */
    private b f2660w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0051a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f2661n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f2662o;

        RunnableC0051a(WorkDatabase workDatabase, String str) {
            this.f2661n = workDatabase;
            this.f2662o = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p l10 = this.f2661n.B().l(this.f2662o);
            if (l10 == null || !l10.b()) {
                return;
            }
            synchronized (a.this.f2654q) {
                a.this.f2657t.put(this.f2662o, l10);
                a.this.f2658u.add(l10);
                a aVar = a.this;
                aVar.f2659v.d(aVar.f2658u);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void c(int i10);

        void d(int i10, int i11, Notification notification);

        void e(int i10, Notification notification);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f2651n = context;
        i k10 = i.k(context);
        this.f2652o = k10;
        u0.a p10 = k10.p();
        this.f2653p = p10;
        this.f2655r = null;
        this.f2656s = new LinkedHashMap();
        this.f2658u = new HashSet();
        this.f2657t = new HashMap();
        this.f2659v = new d(this.f2651n, p10, this);
        this.f2652o.m().d(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        j.c().d(f2650x, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f2652o.b(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(f2650x, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f2660w == null) {
            return;
        }
        this.f2656s.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f2655r)) {
            this.f2655r = stringExtra;
            this.f2660w.d(intExtra, intExtra2, notification);
            return;
        }
        this.f2660w.e(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, e> entry : this.f2656s.entrySet()) {
            i10 |= entry.getValue().a();
        }
        e eVar = this.f2656s.get(this.f2655r);
        if (eVar != null) {
            this.f2660w.d(eVar.c(), i10, eVar.b());
        }
    }

    private void i(Intent intent) {
        j.c().d(f2650x, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f2653p.b(new RunnableC0051a(this.f2652o.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // l0.b
    public void b(String str, boolean z10) {
        Map.Entry<String, e> next;
        synchronized (this.f2654q) {
            p remove = this.f2657t.remove(str);
            if (remove != null ? this.f2658u.remove(remove) : false) {
                this.f2659v.d(this.f2658u);
            }
        }
        e remove2 = this.f2656s.remove(str);
        if (str.equals(this.f2655r) && this.f2656s.size() > 0) {
            Iterator<Map.Entry<String, e>> it = this.f2656s.entrySet().iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            this.f2655r = next.getKey();
            if (this.f2660w != null) {
                e value = next.getValue();
                this.f2660w.d(value.c(), value.a(), value.b());
                this.f2660w.c(value.c());
            }
        }
        b bVar = this.f2660w;
        if (remove2 == null || bVar == null) {
            return;
        }
        j.c().a(f2650x, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.c(remove2.c());
    }

    @Override // o0.c
    public void d(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            j.c().a(f2650x, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f2652o.w(str);
        }
    }

    @Override // o0.c
    public void e(List<String> list) {
    }

    void j(Intent intent) {
        j.c().d(f2650x, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f2660w;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f2660w = null;
        synchronized (this.f2654q) {
            this.f2659v.e();
        }
        this.f2652o.m().i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                g(intent);
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                j(intent);
                return;
            } else {
                return;
            }
        }
        h(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.f2660w != null) {
            j.c().b(f2650x, "A callback already exists.", new Throwable[0]);
        } else {
            this.f2660w = bVar;
        }
    }
}
