package j$.util.stream;
/* renamed from: j$.util.stream.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0340n0 implements j$.util.function.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10105b;

    public /* synthetic */ C0340n0(Object obj, int i10) {
        this.f10104a = i10;
        this.f10105b = obj;
    }

    @Override // j$.util.function.r
    public final void e(long j10) {
        switch (this.f10104a) {
            case 0:
                ((InterfaceC0356q2) this.f10105b).e(j10);
                return;
            default:
                ((C0345o0) this.f10105b).f10093a.e(j10);
                return;
        }
    }
}
