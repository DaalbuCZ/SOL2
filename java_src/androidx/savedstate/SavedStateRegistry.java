package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.Map;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b  reason: collision with root package name */
    private Bundle f2293b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2294c;

    /* renamed from: a  reason: collision with root package name */
    private k.b<String, b> f2292a = new k.b<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f2295d = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f2294c) {
            Bundle bundle = this.f2293b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f2293b.remove(str);
                if (this.f2293b.isEmpty()) {
                    this.f2293b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e eVar, Bundle bundle) {
        if (this.f2294c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f2293b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        eVar.a(new g() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.g
            public void d(i iVar, e.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z10;
                if (bVar == e.b.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z10 = true;
                } else if (bVar != e.b.ON_STOP) {
                    return;
                } else {
                    savedStateRegistry = SavedStateRegistry.this;
                    z10 = false;
                }
                savedStateRegistry.f2295d = z10;
            }
        });
        this.f2294c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2293b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        k.b<String, b>.d h10 = this.f2292a.h();
        while (h10.hasNext()) {
            Map.Entry next = h10.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
