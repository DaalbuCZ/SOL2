package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends l {

    /* renamed from: e  reason: collision with root package name */
    final l[] f9674e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null, null);
        this.f9674e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
        if ((r0 instanceof j$.util.concurrent.g) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        r0 = ((j$.util.concurrent.g) r0).f9674e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.util.concurrent.l a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.l[] r0 = r4.f9674e
        L2:
            r1 = 0
            if (r0 == 0) goto L37
            int r2 = r0.length
            if (r2 == 0) goto L37
            int r2 = r2 + (-1)
            r2 = r2 & r5
            j$.util.concurrent.l r0 = j$.util.concurrent.ConcurrentHashMap.n(r0, r2)
            if (r0 != 0) goto L12
            goto L37
        L12:
            int r2 = r0.f9681a
            if (r2 != r5) goto L23
            java.lang.Object r3 = r0.f9682b
            if (r3 == r6) goto L22
            if (r3 == 0) goto L23
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L23
        L22:
            return r0
        L23:
            if (r2 >= 0) goto L33
            boolean r1 = r0 instanceof j$.util.concurrent.g
            if (r1 == 0) goto L2e
            j$.util.concurrent.g r0 = (j$.util.concurrent.g) r0
            j$.util.concurrent.l[] r0 = r0.f9674e
            goto L2
        L2e:
            j$.util.concurrent.l r5 = r0.a(r5, r6)
            return r5
        L33:
            j$.util.concurrent.l r0 = r0.f9684d
            if (r0 != 0) goto L12
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.g.a(int, java.lang.Object):j$.util.concurrent.l");
    }
}
