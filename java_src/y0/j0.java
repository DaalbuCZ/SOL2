package y0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* loaded from: classes.dex */
public class j0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16540a;

    public j0(Context context) {
        l3.a(context, "Context must be not null");
        this.f16540a = context;
    }

    @Override // y0.e0
    public boolean a() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f16540a.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }
}
