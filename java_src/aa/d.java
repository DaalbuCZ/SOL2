package aa;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f305a;

    /* renamed from: b  reason: collision with root package name */
    int f306b;

    /* renamed from: c  reason: collision with root package name */
    int f307c;

    /* renamed from: d  reason: collision with root package name */
    boolean f308d;

    /* renamed from: e  reason: collision with root package name */
    boolean f309e;

    /* renamed from: f  reason: collision with root package name */
    d f310f;

    /* renamed from: g  reason: collision with root package name */
    d f311g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this.f305a = new byte[8192];
        this.f309e = true;
        this.f308d = false;
    }

    d(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f305a = bArr;
        this.f306b = i10;
        this.f307c = i11;
        this.f308d = z10;
        this.f309e = z11;
    }

    @Nullable
    public final d a() {
        d dVar = this.f310f;
        d dVar2 = dVar != this ? dVar : null;
        d dVar3 = this.f311g;
        dVar3.f310f = dVar;
        this.f310f.f311g = dVar3;
        this.f310f = null;
        this.f311g = null;
        return dVar2;
    }

    public final d b(d dVar) {
        dVar.f311g = this;
        dVar.f310f = this.f310f;
        this.f310f.f311g = dVar;
        this.f310f = dVar;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d c() {
        this.f308d = true;
        return new d(this.f305a, this.f306b, this.f307c, true, false);
    }
}
