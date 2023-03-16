package y0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y0.o3;
/* loaded from: classes.dex */
public class o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n  reason: collision with root package name */
    public final q1 f16616n;

    /* renamed from: o  reason: collision with root package name */
    private final y1 f16617o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f16618p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f16619q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, List<e1>> f16620r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private final o3 f16621s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o3.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f16622a;

        /* renamed from: y0.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0241a implements Runnable {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ List f16624n;

            RunnableC0241a(List list) {
                this.f16624n = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f16624n != null) {
                    ArrayList arrayList = new ArrayList();
                    for (View view : this.f16624n) {
                        o oVar = o.this;
                        e1 a10 = j1.a(view, oVar.f16616n, oVar.f16618p, o.this.f16619q);
                        if (a10 != null) {
                            a10.b(view);
                            arrayList.add(a10);
                        }
                    }
                    Map map = o.this.f16620r;
                    a aVar = a.this;
                    map.put(o.this.e(aVar.f16622a), arrayList);
                }
            }
        }

        a(Activity activity) {
            this.f16622a = activity;
        }

        @Override // y0.o3.a
        public void a(List<View> list) {
            o.this.f16617o.a(new RunnableC0241a(list));
        }
    }

    public o(q1 q1Var, y1 y1Var, boolean z10, boolean z11, List<Object> list) {
        this.f16616n = q1Var;
        this.f16617o = y1Var;
        this.f16618p = z10;
        this.f16619q = z11;
        this.f16621s = new o3(list == null ? Collections.emptyList() : list);
    }

    private void b(Activity activity) {
        View childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
        if (childAt instanceof ViewGroup) {
            this.f16621s.b((ViewGroup) childAt, new a(activity));
        }
    }

    private void c(String str) {
        List<e1> list = this.f16620r.get(str);
        if (list != null) {
            for (e1 e1Var : list) {
                e1Var.a();
            }
            list.clear();
        }
        this.f16620r.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(Activity activity) {
        return activity.getClass().getCanonicalName() + "@" + System.identityHashCode(activity);
    }

    private void f(String str) {
        if (this.f16618p) {
            i0.a("UI", str);
        }
    }

    private String h(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private void j(String str) {
        l(str);
        f(str);
    }

    private void l(String str) {
        if (this.f16619q) {
            this.f16616n.l("UI", str);
        }
    }

    private boolean m(Activity activity) {
        return this.f16620r.containsKey(e(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        String h10 = h(activity);
        j("Activity created: " + h10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        String h10 = h(activity);
        j("Activity destroyed: " + h10);
        c(e(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String h10 = h(activity);
        j("Activity paused: " + h10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        String h10 = h(activity);
        j("Activity resumed: " + h10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        String h10 = h(activity);
        j("Activity save instance state: " + h10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        String h10 = h(activity);
        j("Activity started: " + h10);
        if (m(activity)) {
            return;
        }
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        String h10 = h(activity);
        j("Activity stopped: " + h10);
    }
}
