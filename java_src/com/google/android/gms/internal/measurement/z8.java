package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class z8 {

    /* renamed from: d  reason: collision with root package name */
    private static final z8 f4339d = new z8(true);

    /* renamed from: a  reason: collision with root package name */
    final nb f4340a = new db(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f4341b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4342c;

    private z8() {
    }

    private z8(boolean z10) {
        b();
        b();
    }

    public static z8 a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.measurement.y8 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.ic r0 = r4.b()
            com.google.android.gms.internal.measurement.p9.e(r5)
            com.google.android.gms.internal.measurement.ic r1 = com.google.android.gms.internal.measurement.ic.f3903o
            com.google.android.gms.internal.measurement.jc r1 = com.google.android.gms.internal.measurement.jc.INT
            com.google.android.gms.internal.measurement.jc r0 = r0.e()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.oa
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.h8
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.measurement.ic r4 = r4.b()
            com.google.android.gms.internal.measurement.jc r4 = r4.e()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z8.d(com.google.android.gms.internal.measurement.y8, java.lang.Object):void");
    }

    public final void b() {
        if (this.f4341b) {
            return;
        }
        for (int i10 = 0; i10 < this.f4340a.b(); i10++) {
            Map.Entry g10 = this.f4340a.g(i10);
            if (g10.getValue() instanceof i9) {
                ((i9) g10.getValue()).t();
            }
        }
        this.f4340a.a();
        this.f4341b = true;
    }

    public final void c(y8 y8Var, Object obj) {
        if (!y8Var.c()) {
            d(y8Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(y8Var, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f4340a.put(y8Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        z8 z8Var = new z8();
        for (int i10 = 0; i10 < this.f4340a.b(); i10++) {
            Map.Entry g10 = this.f4340a.g(i10);
            z8Var.c((y8) g10.getKey(), g10.getValue());
        }
        for (Map.Entry entry : this.f4340a.c()) {
            z8Var.c((y8) entry.getKey(), entry.getValue());
        }
        z8Var.f4342c = this.f4342c;
        return z8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z8) {
            return this.f4340a.equals(((z8) obj).f4340a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4340a.hashCode();
    }
}
