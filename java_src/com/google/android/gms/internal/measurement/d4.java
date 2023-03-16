package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d4 extends f9 implements pa {
    private d4() {
        super(e4.J());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ d4(x3 x3Var) {
        super(e4.J());
    }

    public final d4 A(int i10, b4 b4Var) {
        t();
        e4.R((e4) this.f3849o, i10, (c4) b4Var.q());
        return this;
    }

    public final String C() {
        return ((e4) this.f3849o).M();
    }

    public final List D() {
        return Collections.unmodifiableList(((e4) this.f3849o).N());
    }

    public final List E() {
        return Collections.unmodifiableList(((e4) this.f3849o).O());
    }

    public final int w() {
        return ((e4) this.f3849o).F();
    }

    public final c4 x(int i10) {
        return ((e4) this.f3849o).H(i10);
    }

    public final d4 z() {
        t();
        e4.S((e4) this.f3849o);
        return this;
    }
}
