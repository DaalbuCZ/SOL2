package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class sa implements za {

    /* renamed from: a  reason: collision with root package name */
    private final oa f4165a;

    /* renamed from: b  reason: collision with root package name */
    private final rb f4166b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4167c;

    /* renamed from: d  reason: collision with root package name */
    private final v8 f4168d;

    private sa(rb rbVar, v8 v8Var, oa oaVar) {
        this.f4166b = rbVar;
        this.f4167c = v8Var.c(oaVar);
        this.f4168d = v8Var;
        this.f4165a = oaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static sa j(rb rbVar, v8 v8Var, oa oaVar) {
        return new sa(rbVar, v8Var, oaVar);
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void a(Object obj) {
        this.f4166b.g(obj);
        this.f4168d.b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final int b(Object obj) {
        rb rbVar = this.f4166b;
        int b10 = rbVar.b(rbVar.d(obj));
        if (this.f4167c) {
            this.f4168d.a(obj);
            throw null;
        }
        return b10;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void c(Object obj, Object obj2) {
        bb.f(this.f4166b, obj, obj2);
        if (this.f4167c) {
            bb.e(this.f4168d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void d(Object obj, kc kcVar) {
        this.f4168d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final Object e() {
        oa oaVar = this.f4165a;
        return oaVar instanceof i9 ? ((i9) oaVar).l() : oaVar.h().k();
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final void f(Object obj, byte[] bArr, int i10, int i11, t7 t7Var) {
        i9 i9Var = (i9) obj;
        if (i9Var.zzc == sb.c()) {
            i9Var.zzc = sb.f();
        }
        g9 g9Var = (g9) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final boolean g(Object obj, Object obj2) {
        if (this.f4166b.d(obj).equals(this.f4166b.d(obj2))) {
            if (this.f4167c) {
                this.f4168d.a(obj);
                this.f4168d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final boolean h(Object obj) {
        this.f4168d.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final int i(Object obj) {
        int hashCode = this.f4166b.d(obj).hashCode();
        if (this.f4167c) {
            this.f4168d.a(obj);
            throw null;
        }
        return hashCode;
    }
}
