package r2;

import java.nio.ByteBuffer;
import k2.a;
import k2.h;
import p3.a0;
import p3.i0;
import p3.z;
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f12963a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final z f12964b = new z();

    /* renamed from: c  reason: collision with root package name */
    private i0 f12965c;

    @Override // k2.h
    protected k2.a b(k2.e eVar, ByteBuffer byteBuffer) {
        i0 i0Var = this.f12965c;
        if (i0Var == null || eVar.f10532v != i0Var.e()) {
            i0 i0Var2 = new i0(eVar.f15538r);
            this.f12965c = i0Var2;
            i0Var2.a(eVar.f15538r - eVar.f10532v);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f12963a.M(array, limit);
        this.f12964b.o(array, limit);
        this.f12964b.r(39);
        long h10 = (this.f12964b.h(1) << 32) | this.f12964b.h(32);
        this.f12964b.r(20);
        int h11 = this.f12964b.h(12);
        int h12 = this.f12964b.h(8);
        a.b bVar = null;
        this.f12963a.P(14);
        if (h12 == 0) {
            bVar = new e();
        } else if (h12 == 255) {
            bVar = a.a(this.f12963a, h11, h10);
        } else if (h12 == 4) {
            bVar = f.a(this.f12963a);
        } else if (h12 == 5) {
            bVar = d.a(this.f12963a, h10, this.f12965c);
        } else if (h12 == 6) {
            bVar = g.a(this.f12963a, h10, this.f12965c);
        }
        return bVar == null ? new k2.a(new a.b[0]) : new k2.a(bVar);
    }
}
