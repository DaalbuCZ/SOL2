package androidx.lifecycle;

import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements g {

    /* renamed from: n  reason: collision with root package name */
    private final d[] f2061n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(d[] dVarArr) {
        this.f2061n = dVarArr;
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        n nVar = new n();
        for (d dVar : this.f2061n) {
            dVar.a(iVar, bVar, false, nVar);
        }
        for (d dVar2 : this.f2061n) {
            dVar2.a(iVar, bVar, true, nVar);
        }
    }
}
