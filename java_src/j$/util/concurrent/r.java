package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: e  reason: collision with root package name */
    r f9702e;

    /* renamed from: f  reason: collision with root package name */
    r f9703f;

    /* renamed from: g  reason: collision with root package name */
    r f9704g;

    /* renamed from: h  reason: collision with root package name */
    r f9705h;

    /* renamed from: i  reason: collision with root package name */
    boolean f9706i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i10, Object obj, Object obj2, l lVar, r rVar) {
        super(i10, obj, obj2, lVar);
        this.f9702e = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public l a(int i10, Object obj) {
        return b(i10, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(int i10, Object obj, Class cls) {
        int d10;
        if (obj != null) {
            r rVar = this;
            do {
                r rVar2 = rVar.f9703f;
                r rVar3 = rVar.f9704g;
                int i11 = rVar.f9681a;
                if (i11 <= i10) {
                    if (i11 >= i10) {
                        Object obj2 = rVar.f9682b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return rVar;
                        }
                        if (rVar2 != null) {
                            if (rVar3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                    r b10 = rVar3.b(i10, obj, cls);
                                    if (b10 != null) {
                                        return b10;
                                    }
                                } else if (d10 >= 0) {
                                    rVar2 = rVar3;
                                }
                            }
                        }
                    }
                    rVar = rVar3;
                    continue;
                }
                rVar = rVar2;
                continue;
            } while (rVar != null);
            return null;
        }
        return null;
    }
}
