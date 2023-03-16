package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class tb extends rb {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* synthetic */ int a(Object obj) {
        return ((sb) obj).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* synthetic */ int b(Object obj) {
        return ((sb) obj).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        i9 i9Var = (i9) obj;
        sb sbVar = i9Var.zzc;
        if (sbVar == sb.c()) {
            sb f10 = sb.f();
            i9Var.zzc = f10;
            return f10;
        }
        return sbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* synthetic */ Object d(Object obj) {
        return ((i9) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (sb.c().equals(obj2)) {
            return obj;
        }
        sb sbVar = (sb) obj2;
        if (sb.c().equals(obj)) {
            return sb.e((sb) obj, sbVar);
        }
        ((sb) obj).d(sbVar);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((sb) obj).j(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final void g(Object obj) {
        ((i9) obj).zzc.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((i9) obj).zzc = (sb) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.rb
    public final /* synthetic */ void i(Object obj, kc kcVar) {
        ((sb) obj).k(kcVar);
    }
}
