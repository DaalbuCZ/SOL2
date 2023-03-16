package n3;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import s1.h;
import u2.t0;
/* loaded from: classes.dex */
public final class y implements s1.h {

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<y> f11742p = x.f11741a;

    /* renamed from: n  reason: collision with root package name */
    public final t0 f11743n;

    /* renamed from: o  reason: collision with root package name */
    public final b5.q<Integer> f11744o;

    public y(t0 t0Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= t0Var.f15363n)) {
            throw new IndexOutOfBoundsException();
        }
        this.f11743n = t0Var;
        this.f11744o = b5.q.F(list);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y d(Bundle bundle) {
        return new y(t0.f15362s.a((Bundle) p3.a.e(bundle.getBundle(c(0)))), d5.d.c((int[]) p3.a.e(bundle.getIntArray(c(1)))));
    }

    public int b() {
        return this.f11743n.f15365p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f11743n.equals(yVar.f11743n) && this.f11744o.equals(yVar.f11744o);
    }

    public int hashCode() {
        return this.f11743n.hashCode() + (this.f11744o.hashCode() * 31);
    }
}
