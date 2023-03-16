package q7;

import android.app.Activity;
import k9.k;
import q7.a;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Activity f12906a;

    private final boolean a() {
        Activity activity = this.f12906a;
        k.b(activity);
        return (activity.getWindow().getAttributes().flags & 128) != 0;
    }

    public final a.C0186a b() {
        if (this.f12906a != null) {
            a.C0186a c0186a = new a.C0186a();
            c0186a.b(Boolean.valueOf(a()));
            return c0186a;
        }
        throw new e();
    }

    public final void c(Activity activity) {
        this.f12906a = activity;
    }

    public final void d(a.b bVar) {
        k.e(bVar, "message");
        Activity activity = this.f12906a;
        if (activity == null) {
            throw new e();
        }
        k.b(activity);
        boolean a10 = a();
        Boolean b10 = bVar.b();
        k.b(b10);
        if (b10.booleanValue()) {
            if (a10) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (a10) {
            activity.getWindow().clearFlags(128);
        }
    }
}
