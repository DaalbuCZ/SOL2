package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a0 extends x {
    /* JADX INFO: Access modifiers changed from: protected */
    public a0() {
        this.f4282a.add(n0.APPLY);
        this.f4282a.add(n0.BLOCK);
        this.f4282a.add(n0.BREAK);
        this.f4282a.add(n0.CASE);
        this.f4282a.add(n0.DEFAULT);
        this.f4282a.add(n0.CONTINUE);
        this.f4282a.add(n0.DEFINE_FUNCTION);
        this.f4282a.add(n0.FN);
        this.f4282a.add(n0.IF);
        this.f4282a.add(n0.QUOTE);
        this.f4282a.add(n0.RETURN);
        this.f4282a.add(n0.SWITCH);
        this.f4282a.add(n0.TERNARY);
    }

    private static q c(z4 z4Var, List list) {
        a6.i(n0.FN.name(), 2, list);
        q b10 = z4Var.b((q) list.get(0));
        q b11 = z4Var.b((q) list.get(1));
        if (b11 instanceof f) {
            List H = ((f) b11).H();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new p(b10.g(), H, arrayList, z4Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b11.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // com.google.android.gms.internal.measurement.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.q a(java.lang.String r8, com.google.android.gms.internal.measurement.z4 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.a0.a(java.lang.String, com.google.android.gms.internal.measurement.z4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
