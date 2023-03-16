package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class z9 extends ca {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ z9(y9 y9Var) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ca
    public final void a(Object obj, long j10) {
        ((o9) bc.k(obj, j10)).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ca
    public final void b(Object obj, Object obj2, long j10) {
        o9 o9Var = (o9) bc.k(obj, j10);
        o9 o9Var2 = (o9) bc.k(obj2, j10);
        int size = o9Var.size();
        int size2 = o9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!o9Var.c()) {
                o9Var = o9Var.j(size2 + size);
            }
            o9Var.addAll(o9Var2);
        }
        if (size > 0) {
            o9Var2 = o9Var;
        }
        bc.x(obj, j10, o9Var2);
    }
}
