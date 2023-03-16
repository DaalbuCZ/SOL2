package v4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    protected final s f15672a;

    /* renamed from: b  reason: collision with root package name */
    private final IntentFilter f15673b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15674c;

    /* renamed from: d  reason: collision with root package name */
    protected final Set f15675d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private q f15676e = null;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f15677f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(s sVar, IntentFilter intentFilter, Context context) {
        this.f15672a = sVar;
        this.f15673b = intentFilter;
        this.f15674c = f0.a(context);
    }

    private final void d() {
        q qVar;
        if (!this.f15675d.isEmpty() && this.f15676e == null) {
            q qVar2 = new q(this, null);
            this.f15676e = qVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f15674c.registerReceiver(qVar2, this.f15673b, 2);
            }
            this.f15674c.registerReceiver(this.f15676e, this.f15673b);
        }
        if (!this.f15675d.isEmpty() || (qVar = this.f15676e) == null) {
            return;
        }
        this.f15674c.unregisterReceiver(qVar);
        this.f15676e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(z4.a aVar) {
        this.f15672a.d("registerListener", new Object[0]);
        d.a(aVar, "Registered Play Core listener should not be null.");
        this.f15675d.add(aVar);
        d();
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.f15675d).iterator();
        while (it.hasNext()) {
            ((z4.a) it.next()).a(obj);
        }
    }
}
