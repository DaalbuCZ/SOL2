package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0260c;
/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0368u implements InterfaceC0260c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10149a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f10150b;

    public /* synthetic */ C0368u(BiConsumer biConsumer, int i10) {
        this.f10149a = i10;
        this.f10150b = biConsumer;
    }

    @Override // j$.util.function.BiFunction
    public final Object s(Object obj, Object obj2) {
        switch (this.f10149a) {
            case 0:
                this.f10150b.n(obj, obj2);
                return obj;
            case 1:
                BiConsumer biConsumer = this.f10150b;
                int i10 = AbstractC0320j0.f10061t;
                biConsumer.n(obj, obj2);
                return obj;
            default:
                BiConsumer biConsumer2 = this.f10150b;
                int i11 = AbstractC0361s0.f10131t;
                biConsumer2.n(obj, obj2);
                return obj;
        }
    }
}
