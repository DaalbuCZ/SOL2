package u1;

import java.nio.ByteBuffer;
import p3.m0;
import u1.g;
/* loaded from: classes.dex */
final class c0 extends x {

    /* renamed from: i  reason: collision with root package name */
    private static final int f14899i = Float.floatToIntBits(Float.NaN);

    private static void n(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f14899i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // u1.g
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer m10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f15078b.f14945c;
        if (i11 == 536870912) {
            m10 = m((i10 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m10);
                position += 3;
            }
        } else if (i11 != 805306368) {
            throw new IllegalStateException();
        } else {
            m10 = m(i10);
            while (position < limit) {
                n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m10);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m10.flip();
    }

    @Override // u1.x
    public g.a i(g.a aVar) {
        int i10 = aVar.f14945c;
        if (m0.r0(i10)) {
            return i10 != 4 ? new g.a(aVar.f14943a, aVar.f14944b, 4) : g.a.f14942e;
        }
        throw new g.b(aVar);
    }
}
