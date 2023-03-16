package q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import k0.j;
/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f12515h = j.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f12516g;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, u0.a aVar) {
        super(context, aVar);
        this.f12516g = new a();
    }

    @Override // q0.d
    public void e() {
        j.c().a(f12515h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f12520b.registerReceiver(this.f12516g, g());
    }

    @Override // q0.d
    public void f() {
        j.c().a(f12515h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f12520b.unregisterReceiver(this.f12516g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
