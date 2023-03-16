package j$.time.temporal;

import j$.time.ZoneOffset;
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ s f9562a = new s();

    private /* synthetic */ s() {
    }

    @Override // j$.time.temporal.w
    public final Object a(TemporalAccessor temporalAccessor) {
        int i10 = n.f9558a;
        a aVar = a.OFFSET_SECONDS;
        if (temporalAccessor.h(aVar)) {
            return ZoneOffset.v(temporalAccessor.g(aVar));
        }
        return null;
    }
}
