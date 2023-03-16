package v1;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: n  reason: collision with root package name */
    private int f15510n;

    public final void l(int i10) {
        this.f15510n = i10 | this.f15510n;
    }

    public void m() {
        this.f15510n = 0;
    }

    public final void p(int i10) {
        this.f15510n = (~i10) & this.f15510n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean q(int i10) {
        return (this.f15510n & i10) == i10;
    }

    public final boolean r() {
        return q(268435456);
    }

    public final boolean s() {
        return q(Integer.MIN_VALUE);
    }

    public final boolean t() {
        return q(4);
    }

    public final boolean u() {
        return q(134217728);
    }

    public final boolean v() {
        return q(1);
    }

    public final void w(int i10) {
        this.f15510n = i10;
    }
}
