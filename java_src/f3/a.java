package f3;

import d3.g;
import d3.h;
import java.util.List;
import p3.a0;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final b f7170o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        a0 a0Var = new a0(list.get(0));
        this.f7170o = new b(a0Var.I(), a0Var.I());
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f7170o.r();
        }
        return new c(this.f7170o.b(bArr, i10));
    }
}
