package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class ya implements la {

    /* renamed from: a  reason: collision with root package name */
    private final oa f4308a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4309b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f4310c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4311d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ya(oa oaVar, String str, Object[] objArr) {
        this.f4308a = oaVar;
        this.f4309b = str;
        this.f4310c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f4311d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f4311d = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final oa a() {
        return this.f4308a;
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final boolean b() {
        return (this.f4311d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final int c() {
        return (this.f4311d & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.f4309b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f4310c;
    }
}
