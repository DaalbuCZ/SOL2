package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
/* renamed from: j$.time.format.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0249a implements j$.time.temporal.w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0249a f9448a = new C0249a();

    private /* synthetic */ C0249a() {
    }

    @Override // j$.time.temporal.w
    public final Object a(TemporalAccessor temporalAccessor) {
        int i10 = r.f9484f;
        int i11 = j$.time.temporal.n.f9558a;
        ZoneId zoneId = (ZoneId) temporalAccessor.m(j$.time.temporal.p.f9559a);
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
