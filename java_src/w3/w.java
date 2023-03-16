package w3;

import java.util.Arrays;
/* loaded from: classes.dex */
final class w extends v {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f16107b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f16107b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // w3.v
    public final byte[] m0() {
        return this.f16107b;
    }
}
