package d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: n  reason: collision with root package name */
    private static int f6286n = -100;

    /* renamed from: o  reason: collision with root package name */
    private static final m.b<WeakReference<d>> f6287o = new m.b<>();

    /* renamed from: p  reason: collision with root package name */
    private static final Object f6288p = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(d dVar) {
        synchronized (f6288p) {
            y(dVar);
            f6287o.add(new WeakReference<>(dVar));
        }
    }

    public static d g(Activity activity, c cVar) {
        return new e(activity, cVar);
    }

    public static d h(Dialog dialog, c cVar) {
        return new e(dialog, cVar);
    }

    public static int j() {
        return f6286n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(d dVar) {
        synchronized (f6288p) {
            y(dVar);
        }
    }

    private static void y(d dVar) {
        synchronized (f6288p) {
            Iterator<WeakReference<d>> it = f6287o.iterator();
            while (it.hasNext()) {
                d dVar2 = it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i10);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public void D(int i10) {
    }

    public abstract void E(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i10);

    public int k() {
        return -100;
    }

    public abstract MenuInflater l();

    public abstract a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i10);
}