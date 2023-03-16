package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9557a;

    public /* synthetic */ m(int i10) {
        this.f9557a = i10;
    }

    @Override // j$.time.temporal.l
    public final k a(k kVar) {
        int i10 = this.f9557a;
        int g10 = kVar.g(a.DAY_OF_WEEK);
        if (g10 == i10) {
            return kVar;
        }
        int i11 = g10 - i10;
        return kVar.l(i11 >= 0 ? 7 - i11 : -i11, b.DAYS);
    }
}
