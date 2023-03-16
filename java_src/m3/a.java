package m3;

import d3.b;
import java.util.ArrayList;
import java.util.Collections;
import p3.a0;
import p3.m0;
/* loaded from: classes.dex */
public final class a extends d3.g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f11337o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f11337o = new a0();
    }

    private static d3.b C(a0 a0Var, int i10) {
        CharSequence charSequence = null;
        b.C0093b c0093b = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new d3.j("Incomplete vtt cue box header found.");
            }
            int m10 = a0Var.m();
            int m11 = a0Var.m();
            int i11 = m10 - 8;
            String E = m0.E(a0Var.d(), a0Var.e(), i11);
            a0Var.P(i11);
            i10 = (i10 - 8) - i11;
            if (m11 == 1937011815) {
                c0093b = f.o(E);
            } else if (m11 == 1885436268) {
                charSequence = f.q(null, E.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return c0093b != null ? c0093b.o(charSequence).a() : f.l(charSequence);
    }

    @Override // d3.g
    protected d3.h A(byte[] bArr, int i10, boolean z10) {
        this.f11337o.M(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f11337o.a() > 0) {
            if (this.f11337o.a() < 8) {
                throw new d3.j("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m10 = this.f11337o.m();
            if (this.f11337o.m() == 1987343459) {
                arrayList.add(C(this.f11337o, m10 - 8));
            } else {
                this.f11337o.P(m10 - 8);
            }
        }
        return new b(arrayList);
    }
}
