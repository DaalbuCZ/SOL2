package u4;

import u4.d;
/* loaded from: classes.dex */
final class a0 extends d.a {

    /* renamed from: a  reason: collision with root package name */
    private int f15412a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15413b;

    /* renamed from: c  reason: collision with root package name */
    private byte f15414c;

    @Override // u4.d.a
    public final d a() {
        if (this.f15414c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.f15414c & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((this.f15414c & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new c0(this.f15412a, this.f15413b, null);
    }

    @Override // u4.d.a
    public final d.a b(boolean z10) {
        this.f15413b = z10;
        this.f15414c = (byte) (this.f15414c | 2);
        return this;
    }

    public final d.a c(int i10) {
        this.f15412a = i10;
        this.f15414c = (byte) (this.f15414c | 1);
        return this;
    }
}
