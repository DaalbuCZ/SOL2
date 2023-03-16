package w3;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
abstract class x extends v {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference f16108c = new WeakReference(null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f16109b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(byte[] bArr) {
        super(bArr);
        this.f16109b = f16108c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // w3.v
    public final byte[] m0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f16109b.get();
            if (bArr == null) {
                bArr = n0();
                this.f16109b = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] n0();
}
