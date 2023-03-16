package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class j8 extends l8 {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3923b;

    /* renamed from: c  reason: collision with root package name */
    private int f3924c;

    /* renamed from: d  reason: collision with root package name */
    private int f3925d;

    /* renamed from: e  reason: collision with root package name */
    private int f3926e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ j8(byte[] bArr, int i10, int i11, boolean z10, i8 i8Var) {
        super(null);
        this.f3926e = Integer.MAX_VALUE;
        this.f3923b = bArr;
        this.f3924c = 0;
    }

    public final int c(int i10) {
        int i11 = this.f3926e;
        this.f3926e = 0;
        int i12 = this.f3924c + this.f3925d;
        this.f3924c = i12;
        if (i12 > 0) {
            this.f3925d = i12;
            this.f3924c = i12 - i12;
        } else {
            this.f3925d = 0;
        }
        return i11;
    }
}
