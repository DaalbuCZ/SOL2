package z2;

import android.util.SparseArray;
import p3.i0;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<i0> f17299a = new SparseArray<>();

    public i0 a(int i10) {
        i0 i0Var = this.f17299a.get(i10);
        if (i0Var == null) {
            i0 i0Var2 = new i0(9223372036854775806L);
            this.f17299a.put(i10, i0Var2);
            return i0Var2;
        }
        return i0Var;
    }

    public void b() {
        this.f17299a.clear();
    }
}
