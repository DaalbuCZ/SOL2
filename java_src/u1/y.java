package u1;

import java.nio.ByteBuffer;
import u1.g;
/* loaded from: classes.dex */
final class y extends x {

    /* renamed from: i  reason: collision with root package name */
    private int[] f15085i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f15086j;

    @Override // u1.g
    public void f(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) p3.a.e(this.f15086j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m10 = m(((limit - position) / this.f15078b.f14946d) * this.f15079c.f14946d);
        while (position < limit) {
            for (int i10 : iArr) {
                m10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f15078b.f14946d;
        }
        byteBuffer.position(limit);
        m10.flip();
    }

    @Override // u1.x
    public g.a i(g.a aVar) {
        int[] iArr = this.f15085i;
        if (iArr == null) {
            return g.a.f14942e;
        }
        if (aVar.f14945c == 2) {
            boolean z10 = aVar.f14944b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 >= aVar.f14944b) {
                    throw new g.b(aVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
            return z10 ? new g.a(aVar.f14943a, iArr.length, 2) : g.a.f14942e;
        }
        throw new g.b(aVar);
    }

    @Override // u1.x
    protected void j() {
        this.f15086j = this.f15085i;
    }

    @Override // u1.x
    protected void l() {
        this.f15086j = null;
        this.f15085i = null;
    }

    public void n(int[] iArr) {
        this.f15085i = iArr;
    }
}
