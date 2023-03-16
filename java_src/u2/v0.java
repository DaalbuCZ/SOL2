package u2;

import android.os.Bundle;
import java.util.ArrayList;
import s1.h;
/* loaded from: classes.dex */
public final class v0 implements s1.h {

    /* renamed from: q  reason: collision with root package name */
    public static final v0 f15373q = new v0(new t0[0]);

    /* renamed from: r  reason: collision with root package name */
    public static final h.a<v0> f15374r = u0.f15368a;

    /* renamed from: n  reason: collision with root package name */
    public final int f15375n;

    /* renamed from: o  reason: collision with root package name */
    private final b5.q<t0> f15376o;

    /* renamed from: p  reason: collision with root package name */
    private int f15377p;

    public v0(t0... t0VarArr) {
        this.f15376o = b5.q.G(t0VarArr);
        this.f15375n = t0VarArr.length;
        f();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v0 e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(d(0));
        return parcelableArrayList == null ? new v0(new t0[0]) : new v0((t0[]) p3.c.b(t0.f15362s, parcelableArrayList).toArray(new t0[0]));
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f15376o.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f15376o.size(); i12++) {
                if (this.f15376o.get(i10).equals(this.f15376o.get(i12))) {
                    p3.r.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public t0 b(int i10) {
        return this.f15376o.get(i10);
    }

    public int c(t0 t0Var) {
        int indexOf = this.f15376o.indexOf(t0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f15375n == v0Var.f15375n && this.f15376o.equals(v0Var.f15376o);
    }

    public int hashCode() {
        if (this.f15377p == 0) {
            this.f15377p = this.f15376o.hashCode();
        }
        return this.f15377p;
    }
}
