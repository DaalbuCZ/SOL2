package d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
/* loaded from: classes.dex */
class j {

    /* renamed from: d  reason: collision with root package name */
    private static j f6383d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6384a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f6385b;

    /* renamed from: c  reason: collision with root package name */
    private final a f6386c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f6387a;

        /* renamed from: b  reason: collision with root package name */
        long f6388b;

        /* renamed from: c  reason: collision with root package name */
        long f6389c;

        /* renamed from: d  reason: collision with root package name */
        long f6390d;

        /* renamed from: e  reason: collision with root package name */
        long f6391e;

        /* renamed from: f  reason: collision with root package name */
        long f6392f;

        a() {
        }
    }

    j(Context context, LocationManager locationManager) {
        this.f6384a = context;
        this.f6385b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a(Context context) {
        if (f6383d == null) {
            Context applicationContext = context.getApplicationContext();
            f6383d = new j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f6383d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location c10 = androidx.core.content.c.b(this.f6384a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = androidx.core.content.c.b(this.f6384a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    private Location c(String str) {
        try {
            if (this.f6385b.isProviderEnabled(str)) {
                return this.f6385b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f6386c.f6392f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f6386c;
        long currentTimeMillis = System.currentTimeMillis();
        i b10 = i.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f6380a;
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f6382c == 1;
        long j12 = b10.f6381b;
        long j13 = b10.f6380a;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j14 = b10.f6381b;
        if (j12 == -1 || j13 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j13 ? 0 + j14 : currentTimeMillis > j12 ? 0 + j13 : 0 + j12) + 60000;
        }
        aVar.f6387a = z10;
        aVar.f6388b = j11;
        aVar.f6389c = j12;
        aVar.f6390d = j13;
        aVar.f6391e = j14;
        aVar.f6392f = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f6386c;
        if (e()) {
            return aVar.f6387a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f6387a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
