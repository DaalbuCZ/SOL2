package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ u f9564a = new u();

    private /* synthetic */ u() {
    }

    @Override // j$.time.temporal.w
    public final Object a(TemporalAccessor temporalAccessor) {
        int i10 = n.f9558a;
        a aVar = a.EPOCH_DAY;
        if (temporalAccessor.h(aVar)) {
            return j$.time.h.z(temporalAccessor.k(aVar));
        }
        return null;
    }
}
