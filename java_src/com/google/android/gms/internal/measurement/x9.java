package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class x9 extends ca {

    /* renamed from: c  reason: collision with root package name */
    private static final Class f4291c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ x9(w9 w9Var) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.ca
    public final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) bc.k(obj, j10);
        if (list instanceof v9) {
            unmodifiableList = ((v9) list).e();
        } else if (f4291c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof va) && (list instanceof o9)) {
                o9 o9Var = (o9) list;
                if (o9Var.c()) {
                    o9Var.b();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        bc.x(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.measurement.ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.bc.k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.bc.k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.v9
            if (r2 == 0) goto L20
            com.google.android.gms.internal.measurement.u9 r1 = new com.google.android.gms.internal.measurement.u9
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.va
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.o9
            if (r2 == 0) goto L30
            com.google.android.gms.internal.measurement.o9 r1 = (com.google.android.gms.internal.measurement.o9) r1
            com.google.android.gms.internal.measurement.o9 r0 = r1.j(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.google.android.gms.internal.measurement.bc.x(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class r2 = com.google.android.gms.internal.measurement.x9.f4291c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            com.google.android.gms.internal.measurement.bc.x(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.wb
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.measurement.u9 r2 = new com.google.android.gms.internal.measurement.u9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.measurement.wb r1 = (com.google.android.gms.internal.measurement.wb) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.va
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.o9
            if (r2 == 0) goto L8a
            r2 = r1
            com.google.android.gms.internal.measurement.o9 r2 = (com.google.android.gms.internal.measurement.o9) r2
            boolean r3 = r2.c()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.o9 r1 = r2.j(r1)
            goto L35
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            com.google.android.gms.internal.measurement.bc.x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x9.b(java.lang.Object, java.lang.Object, long):void");
    }
}
