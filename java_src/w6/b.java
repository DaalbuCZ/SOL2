package w6;

import b7.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private final g f16145a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar) {
        this.f16145a = gVar;
    }

    @Override // w6.e
    public boolean c() {
        return this.f16145a.f0() && (this.f16145a.b0() > 0 || this.f16145a.a0() > 0 || (this.f16145a.e0() && this.f16145a.d0().W()));
    }
}
