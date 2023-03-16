package o3;

import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class g implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11952a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<p0> f11953b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f11954c;

    /* renamed from: d  reason: collision with root package name */
    private p f11955d;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(boolean z10) {
        this.f11952a = z10;
    }

    @Override // o3.l
    public /* synthetic */ Map f() {
        return k.a(this);
    }

    @Override // o3.l
    public final void i(p0 p0Var) {
        p3.a.e(p0Var);
        if (this.f11953b.contains(p0Var)) {
            return;
        }
        this.f11953b.add(p0Var);
        this.f11954c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(int i10) {
        p pVar = (p) p3.m0.j(this.f11955d);
        for (int i11 = 0; i11 < this.f11954c; i11++) {
            this.f11953b.get(i11).e(this, pVar, this.f11952a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        p pVar = (p) p3.m0.j(this.f11955d);
        for (int i10 = 0; i10 < this.f11954c; i10++) {
            this.f11953b.get(i10).c(this, pVar, this.f11952a);
        }
        this.f11955d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(p pVar) {
        for (int i10 = 0; i10 < this.f11954c; i10++) {
            this.f11953b.get(i10).b(this, pVar, this.f11952a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(p pVar) {
        this.f11955d = pVar;
        for (int i10 = 0; i10 < this.f11954c; i10++) {
            this.f11953b.get(i10).h(this, pVar, this.f11952a);
        }
    }
}
