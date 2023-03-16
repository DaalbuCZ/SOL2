package d9;

import k9.s;
/* loaded from: classes.dex */
public abstract class k extends d implements k9.h<Object> {

    /* renamed from: q  reason: collision with root package name */
    private final int f6622q;

    public k(int i10, b9.d<Object> dVar) {
        super(dVar);
        this.f6622q = i10;
    }

    @Override // k9.h
    public int f() {
        return this.f6622q;
    }

    @Override // d9.a
    public String toString() {
        if (p() == null) {
            String e10 = s.e(this);
            k9.k.d(e10, "renderLambdaToString(this)");
            return e10;
        }
        return super.toString();
    }
}
