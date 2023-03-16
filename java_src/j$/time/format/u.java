package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
/* loaded from: classes2.dex */
class u implements TemporalAccessor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.b f9494a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f9495b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.f f9496c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f9497d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, j$.time.chrono.f fVar, ZoneId zoneId) {
        this.f9494a = bVar;
        this.f9495b = temporalAccessor;
        this.f9496c = fVar;
        this.f9497d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ int g(j$.time.temporal.o oVar) {
        return j$.time.temporal.n.b(this, oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(j$.time.temporal.o oVar) {
        return (this.f9494a == null || !oVar.l()) ? this.f9495b.h(oVar) : ((j$.time.h) this.f9494a).h(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public j$.time.temporal.z i(j$.time.temporal.o oVar) {
        return (this.f9494a == null || !oVar.l()) ? this.f9495b.i(oVar) : ((j$.time.h) this.f9494a).i(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long k(j$.time.temporal.o oVar) {
        return (this.f9494a == null || !oVar.l()) ? this.f9495b.k(oVar) : ((j$.time.h) this.f9494a).k(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object m(j$.time.temporal.w wVar) {
        int i10 = j$.time.temporal.n.f9558a;
        return wVar == j$.time.temporal.q.f9560a ? this.f9496c : wVar == j$.time.temporal.p.f9559a ? this.f9497d : wVar == j$.time.temporal.r.f9561a ? this.f9495b.m(wVar) : wVar.a(this);
    }
}
