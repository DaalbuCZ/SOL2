package kotlinx.coroutines.internal;

import r9.r0;
import r9.z1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends z1 implements r0 {

    /* renamed from: p  reason: collision with root package name */
    private final Throwable f10976p;

    /* renamed from: q  reason: collision with root package name */
    private final String f10977q;

    public x(Throwable th, String str) {
        this.f10976p = th;
        this.f10977q = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Void b0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f10976p
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f10977q
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f10976p
            r1.<init>(r0, r2)
            throw r1
        L36:
            kotlinx.coroutines.internal.w.d()
            y8.d r0 = new y8.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.x.b0():java.lang.Void");
    }

    @Override // r9.d0
    public boolean W(b9.g gVar) {
        b0();
        throw new y8.d();
    }

    @Override // r9.z1
    public z1 Y() {
        return this;
    }

    @Override // r9.d0
    /* renamed from: a0 */
    public Void b(b9.g gVar, Runnable runnable) {
        b0();
        throw new y8.d();
    }

    @Override // r9.z1, r9.d0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f10976p != null) {
            str = ", cause=" + this.f10976p;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
