package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    l[] f9689a;

    /* renamed from: b  reason: collision with root package name */
    l f9690b = null;

    /* renamed from: c  reason: collision with root package name */
    o f9691c;

    /* renamed from: d  reason: collision with root package name */
    o f9692d;

    /* renamed from: e  reason: collision with root package name */
    int f9693e;

    /* renamed from: f  reason: collision with root package name */
    int f9694f;

    /* renamed from: g  reason: collision with root package name */
    int f9695g;

    /* renamed from: h  reason: collision with root package name */
    final int f9696h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i10, int i11, int i12) {
        this.f9689a = lVarArr;
        this.f9696h = i10;
        this.f9693e = i11;
        this.f9694f = i11;
        this.f9695g = i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l b() {
        l[] lVarArr;
        int length;
        int i10;
        o oVar;
        l lVar = this.f9690b;
        if (lVar != null) {
            lVar = lVar.f9684d;
        }
        while (lVar == null) {
            if (this.f9694f >= this.f9695g || (lVarArr = this.f9689a) == null || (length = lVarArr.length) <= (i10 = this.f9693e) || i10 < 0) {
                this.f9690b = null;
                return null;
            }
            l n10 = ConcurrentHashMap.n(lVarArr, i10);
            if (n10 == null || n10.f9681a >= 0) {
                lVar = n10;
            } else if (n10 instanceof g) {
                this.f9689a = ((g) n10).f9674e;
                o oVar2 = this.f9692d;
                if (oVar2 != null) {
                    this.f9692d = oVar2.f9688d;
                } else {
                    oVar2 = new o();
                }
                oVar2.f9687c = lVarArr;
                oVar2.f9685a = length;
                oVar2.f9686b = i10;
                oVar2.f9688d = this.f9691c;
                this.f9691c = oVar2;
                lVar = null;
            } else {
                lVar = n10 instanceof q ? ((q) n10).f9700f : null;
            }
            if (this.f9691c != null) {
                while (true) {
                    oVar = this.f9691c;
                    if (oVar == null) {
                        break;
                    }
                    int i11 = this.f9693e;
                    int i12 = oVar.f9685a;
                    int i13 = i11 + i12;
                    this.f9693e = i13;
                    if (i13 < length) {
                        break;
                    }
                    this.f9693e = oVar.f9686b;
                    this.f9689a = oVar.f9687c;
                    oVar.f9687c = null;
                    o oVar3 = oVar.f9688d;
                    oVar.f9688d = this.f9692d;
                    this.f9691c = oVar3;
                    this.f9692d = oVar;
                    length = i12;
                }
                if (oVar == null) {
                    int i14 = this.f9693e + this.f9696h;
                    this.f9693e = i14;
                    if (i14 >= length) {
                        int i15 = this.f9694f + 1;
                        this.f9694f = i15;
                        this.f9693e = i15;
                    }
                }
            } else {
                int i16 = i10 + this.f9696h;
                this.f9693e = i16;
                if (i16 >= length) {
                    int i17 = this.f9694f + 1;
                    this.f9694f = i17;
                    this.f9693e = i17;
                }
            }
        }
        this.f9690b = lVar;
        return lVar;
    }
}
