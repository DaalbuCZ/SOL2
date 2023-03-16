package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class fa implements ma {

    /* renamed from: a  reason: collision with root package name */
    private final ma[] f3850a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(ma... maVarArr) {
        this.f3850a = maVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final la a(Class cls) {
        ma[] maVarArr = this.f3850a;
        for (int i10 = 0; i10 < 2; i10++) {
            ma maVar = maVarArr[i10];
            if (maVar.b(cls)) {
                return maVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final boolean b(Class cls) {
        ma[] maVarArr = this.f3850a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (maVarArr[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
