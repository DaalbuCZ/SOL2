package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends u {

    /* renamed from: i  reason: collision with root package name */
    private static final v.a f1951i = new a();

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1955f;

    /* renamed from: c  reason: collision with root package name */
    private final HashSet<Fragment> f1952c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, l> f1953d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, w> f1954e = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private boolean f1956g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1957h = false;

    /* loaded from: classes.dex */
    static class a implements v.a {
        a() {
        }

        @Override // androidx.lifecycle.v.a
        public <T extends u> T a(Class<T> cls) {
            return new l(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(boolean z10) {
        this.f1955f = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l g(w wVar) {
        return (l) new v(wVar, f1951i).a(l.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.u
    public void c() {
        if (j.U) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1956g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Fragment fragment) {
        return this.f1952c.add(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (j.U) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        l lVar = this.f1953d.get(fragment.f1827r);
        if (lVar != null) {
            lVar.c();
            this.f1953d.remove(fragment.f1827r);
        }
        w wVar = this.f1954e.get(fragment.f1827r);
        if (wVar != null) {
            wVar.a();
            this.f1954e.remove(fragment.f1827r);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1952c.equals(lVar.f1952c) && this.f1953d.equals(lVar.f1953d) && this.f1954e.equals(lVar.f1954e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l f(Fragment fragment) {
        l lVar = this.f1953d.get(fragment.f1827r);
        if (lVar == null) {
            l lVar2 = new l(this.f1955f);
            this.f1953d.put(fragment.f1827r, lVar2);
            return lVar2;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> h() {
        return this.f1952c;
    }

    public int hashCode() {
        return (((this.f1952c.hashCode() * 31) + this.f1953d.hashCode()) * 31) + this.f1954e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w i(Fragment fragment) {
        w wVar = this.f1954e.get(fragment.f1827r);
        if (wVar == null) {
            w wVar2 = new w();
            this.f1954e.put(fragment.f1827r, wVar2);
            return wVar2;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f1956g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(Fragment fragment) {
        return this.f1952c.remove(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(Fragment fragment) {
        if (this.f1952c.contains(fragment)) {
            return this.f1955f ? this.f1956g : !this.f1957h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1952c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1953d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1954e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
