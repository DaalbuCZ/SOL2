package p4;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.j4;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final j f12402a;

    public k(j jVar) {
        z3.o.i(jVar);
        this.f12402a = jVar;
    }

    public final void a(Context context, Intent intent) {
        j4 H = j4.H(context, null, null);
        f3 d10 = H.d();
        if (intent == null) {
            d10.w().a("Receiver called with null intent");
            return;
        }
        H.f();
        String action = intent.getAction();
        d10.v().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                d10.w().a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        d10.v().a("Starting wakeful intent.");
        this.f12402a.a(context, className);
    }
}
