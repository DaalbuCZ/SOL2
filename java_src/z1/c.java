package z1;

import p3.a0;
/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f17150a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17151b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17152c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17153d;

    private c(int i10, int i11, int i12, int i13) {
        this.f17150a = i10;
        this.f17151b = i11;
        this.f17152c = i12;
        this.f17153d = i13;
    }

    public static c b(a0 a0Var) {
        int p10 = a0Var.p();
        a0Var.P(8);
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        a0Var.P(4);
        int p13 = a0Var.p();
        a0Var.P(12);
        return new c(p10, p11, p12, p13);
    }

    public boolean a() {
        return (this.f17151b & 16) == 16;
    }

    @Override // z1.a
    public int getType() {
        return 1751742049;
    }
}
