package y3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class g0 extends Fragment implements e {

    /* renamed from: o0  reason: collision with root package name */
    private static final WeakHashMap f16991o0 = new WeakHashMap();

    /* renamed from: l0  reason: collision with root package name */
    private final Map f16992l0 = DesugarCollections.synchronizedMap(new m.a());

    /* renamed from: m0  reason: collision with root package name */
    private int f16993m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    private Bundle f16994n0;

    public static g0 r1(androidx.fragment.app.d dVar) {
        g0 g0Var;
        WeakHashMap weakHashMap = f16991o0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(dVar);
        if (weakReference == null || (g0Var = (g0) weakReference.get()) == null) {
            try {
                g0 g0Var2 = (g0) dVar.p().c("SupportLifecycleFragmentImpl");
                if (g0Var2 == null || g0Var2.S()) {
                    g0Var2 = new g0();
                    dVar.p().a().b(g0Var2, "SupportLifecycleFragmentImpl").e();
                }
                weakHashMap.put(dVar, new WeakReference(g0Var2));
                return g0Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
            }
        }
        return g0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void W(int i10, int i11, Intent intent) {
        super.W(i10, i11, intent);
        for (LifecycleCallback lifecycleCallback : this.f16992l0.values()) {
            lifecycleCallback.e(i10, i11, intent);
        }
    }

    @Override // y3.e
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f16992l0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f16992l0.put(str, lifecycleCallback);
        if (this.f16993m0 > 0) {
            new l4.e(Looper.getMainLooper()).post(new f0(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        this.f16993m0 = 1;
        this.f16994n0 = bundle;
        for (Map.Entry entry : this.f16992l0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // y3.e
    public final <T extends LifecycleCallback> T c(String str, Class<T> cls) {
        return cls.cast(this.f16992l0.get(str));
    }

    @Override // y3.e
    public final /* synthetic */ Activity d() {
        return l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.f(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f16992l0.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        this.f16993m0 = 5;
        for (LifecycleCallback lifecycleCallback : this.f16992l0.values()) {
            lifecycleCallback.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void w0() {
        super.w0();
        this.f16993m0 = 3;
        for (LifecycleCallback lifecycleCallback : this.f16992l0.values()) {
            lifecycleCallback.h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f16992l0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void y0() {
        super.y0();
        this.f16993m0 = 2;
        for (LifecycleCallback lifecycleCallback : this.f16992l0.values()) {
            lifecycleCallback.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void z0() {
        super.z0();
        this.f16993m0 = 4;
        for (LifecycleCallback lifecycleCallback : this.f16992l0.values()) {
            lifecycleCallback.k();
        }
    }
}
