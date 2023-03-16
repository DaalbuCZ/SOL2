package j$.time.temporal;

import j$.time.ZoneId;
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ t f9563a = new t();

    private /* synthetic */ t() {
    }

    @Override // j$.time.temporal.w
    public final Object a(TemporalAccessor temporalAccessor) {
        int i10 = n.f9558a;
        ZoneId zoneId = (ZoneId) temporalAccessor.m(p.f9559a);
        return zoneId != null ? zoneId : (ZoneId) temporalAccessor.m(s.f9562a);
    }
}
