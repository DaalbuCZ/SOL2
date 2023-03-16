package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ v f9565a = new v();

    private /* synthetic */ v() {
    }

    @Override // j$.time.temporal.w
    public final Object a(TemporalAccessor temporalAccessor) {
        int i10 = n.f9558a;
        a aVar = a.NANO_OF_DAY;
        if (temporalAccessor.h(aVar)) {
            return j$.time.l.y(temporalAccessor.k(aVar));
        }
        return null;
    }
}
