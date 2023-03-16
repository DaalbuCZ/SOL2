package m5;

import android.os.Bundle;
import i5.a;
import java.util.Locale;
/* loaded from: classes.dex */
class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private o5.b f11405a;

    /* renamed from: b  reason: collision with root package name */
    private o5.b f11406b;

    private static void b(o5.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.i(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f11405a : this.f11406b, str, bundle);
    }

    @Override // i5.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        n5.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(o5.b bVar) {
        this.f11406b = bVar;
    }

    public void e(o5.b bVar) {
        this.f11405a = bVar;
    }
}
