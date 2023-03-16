package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class r implements Iterable<Intent> {

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<Intent> f1324n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    private final Context f1325o;

    /* loaded from: classes.dex */
    public interface a {
        Intent e();
    }

    private r(Context context) {
        this.f1325o = context;
    }

    public static r k(Context context) {
        return new r(context);
    }

    public r d(Intent intent) {
        this.f1324n.add(intent);
        return this;
    }

    public r g(Activity activity) {
        Intent e10 = activity instanceof a ? ((a) activity).e() : null;
        if (e10 == null) {
            e10 = i.a(activity);
        }
        if (e10 != null) {
            ComponentName component = e10.getComponent();
            if (component == null) {
                component = e10.resolveActivity(this.f1325o.getPackageManager());
            }
            h(component);
            d(e10);
        }
        return this;
    }

    public r h(ComponentName componentName) {
        int size = this.f1324n.size();
        try {
            Context context = this.f1325o;
            while (true) {
                Intent b10 = i.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.f1324n.add(size, b10);
                context = this.f1325o;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1324n.iterator();
    }

    public void l() {
        s(null);
    }

    public void s(Bundle bundle) {
        if (this.f1324n.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1324n.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.l(this.f1325o, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1325o.startActivity(intent);
    }
}
