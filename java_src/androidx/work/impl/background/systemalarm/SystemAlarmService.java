package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.l;
import androidx.work.impl.background.systemalarm.e;
import k0.j;
/* loaded from: classes.dex */
public class SystemAlarmService extends l implements e.c {

    /* renamed from: q  reason: collision with root package name */
    private static final String f2590q = j.f("SystemAlarmService");

    /* renamed from: o  reason: collision with root package name */
    private e f2591o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2592p;

    private void f() {
        e eVar = new e(this);
        this.f2591o = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f2592p = true;
        j.c().a(f2590q, "All commands completed in dispatcher", new Throwable[0]);
        t0.j.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f2592p = false;
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f2592p = true;
        this.f2591o.j();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2592p) {
            j.c().d(f2590q, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2591o.j();
            f();
            this.f2592p = false;
        }
        if (intent != null) {
            this.f2591o.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
