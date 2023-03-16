package z8;

import java.util.List;
/* loaded from: classes.dex */
public final class h extends r {
    public static /* bridge */ /* synthetic */ int e(List list) {
        return j.e(list);
    }

    public static /* bridge */ /* synthetic */ void h() {
        j.h();
    }

    public static /* bridge */ /* synthetic */ int i(Iterable iterable, int i10) {
        return k.i(iterable, i10);
    }

    public static /* bridge */ /* synthetic */ Appendable l(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, j9.l lVar, int i11, Object obj) {
        Appendable k10;
        k10 = r.k(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i10, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return k10;
    }

    public static /* bridge */ /* synthetic */ Comparable o(Iterable iterable) {
        return r.o(iterable);
    }
}
