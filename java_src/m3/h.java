package m3;

import android.text.TextUtils;
import java.util.ArrayList;
import p3.a0;
import s1.h2;
/* loaded from: classes.dex */
public final class h extends d3.g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f11388o;

    /* renamed from: p  reason: collision with root package name */
    private final c f11389p;

    public h() {
        super("WebvttDecoder");
        this.f11388o = new a0();
        this.f11389p = new c();
    }

    private static int C(a0 a0Var) {
        int i10 = 0;
        int i11 = -1;
        while (i11 == -1) {
            i10 = a0Var.e();
            String o10 = a0Var.o();
            i11 = o10 == null ? 0 : "STYLE".equals(o10) ? 2 : o10.startsWith("NOTE") ? 1 : 3;
        }
        a0Var.O(i10);
        return i11;
    }

    private static void D(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.o()));
    }

    @Override // d3.g
    protected d3.h A(byte[] bArr, int i10, boolean z10) {
        e n10;
        this.f11388o.M(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f11388o);
            do {
            } while (!TextUtils.isEmpty(this.f11388o.o()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int C = C(this.f11388o);
                if (C == 0) {
                    return new k(arrayList2);
                }
                if (C == 1) {
                    D(this.f11388o);
                } else if (C == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new d3.j("A style block was found after the first cue.");
                    }
                    this.f11388o.o();
                    arrayList.addAll(this.f11389p.d(this.f11388o));
                } else if (C == 3 && (n10 = f.n(this.f11388o, arrayList)) != null) {
                    arrayList2.add(n10);
                }
            }
        } catch (h2 e10) {
            throw new d3.j(e10);
        }
    }
}
