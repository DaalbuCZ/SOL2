package y3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class e0 extends Fragment implements e {

    /* renamed from: q  reason: collision with root package name */
    private static final WeakHashMap f16970q = new WeakHashMap();

    /* renamed from: n  reason: collision with root package name */
    private final Map f16971n = DesugarCollections.synchronizedMap(new m.a());

    /* renamed from: o  reason: collision with root package name */
    private int f16972o = 0;

    /* renamed from: p  reason: collision with root package name */
    private Bundle f16973p;

    public static e0 f(Activity activity) {
        e0 e0Var;
        WeakHashMap weakHashMap = f16970q;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
            try {
                e0 e0Var2 = (e0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (e0Var2 == null || e0Var2.isRemoving()) {
                    e0Var2 = new e0();
                    activity.getFragmentManager().beginTransaction().add(e0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(e0Var2));
                return e0Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        return e0Var;
    }

    @Override // y3.e
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f16971n.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f16971n.put(str, lifecycleCallback);
        if (this.f16972o > 0) {
            new l4.e(Looper.getMainLooper()).post(new d0(this, lifecycleCallback, str));
        }
    }

    @Override // y3.e
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f16971n.get(str));
    }

    @Override // y3.e
    public final Activity d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f16971n.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f16971n.values()) {
            lifecycleCallback.e(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16972o = 1;
        this.f16973p = bundle;
        for (Map.Entry entry : this.f16971n.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f16972o = 5;
        for (LifecycleCallback lifecycleCallback : this.f16971n.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f16972o = 3;
        for (LifecycleCallback lifecycleCallback : this.f16971n.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f16971n.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f16972o = 2;
        for (LifecycleCallback lifecycleCallback : this.f16971n.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f16972o = 4;
        for (LifecycleCallback lifecycleCallback : this.f16971n.values()) {
            lifecycleCallback.k();
        }
    }
}
