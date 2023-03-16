package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ze;
import java.util.List;
/* loaded from: classes.dex */
final class b4 implements ze {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d4 f4417a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b4(d4 d4Var) {
        this.f4417a = d4Var;
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        d3 q10;
        int i11 = i10 - 1;
        if (i11 == 0) {
            q10 = this.f4417a.f4438a.d().q();
        } else if (i11 == 1) {
            f3 d10 = this.f4417a.f4438a.d();
            q10 = z10 ? d10.t() : !z11 ? d10.s() : d10.r();
        } else if (i11 == 3) {
            q10 = this.f4417a.f4438a.d().v();
        } else if (i11 != 4) {
            q10 = this.f4417a.f4438a.d().u();
        } else {
            f3 d11 = this.f4417a.f4438a.d();
            q10 = z10 ? d11.y() : !z11 ? d11.x() : d11.w();
        }
        int size = list.size();
        if (size == 1) {
            q10.b(str, list.get(0));
        } else if (size == 2) {
            q10.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            q10.a(str);
        } else {
            q10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
