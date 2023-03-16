package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.InterfaceC0260c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class F1 extends AbstractC0277a2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9807b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f9808c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f9809d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Object f9810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F1(int i10, Object obj, Object obj2, Object obj3, int i11) {
        super(i10);
        this.f9807b = i11;
        this.f9808c = obj;
        this.f9810e = obj2;
        this.f9809d = obj3;
    }

    @Override // j$.util.stream.AbstractC0277a2
    public Y1 b() {
        switch (this.f9807b) {
            case 0:
                return new G1((j$.util.function.A) this.f9809d, (j$.util.function.w) this.f9810e, (InterfaceC0260c) this.f9808c);
            case 1:
                return new L1((j$.util.function.A) this.f9809d, (j$.util.function.u) this.f9810e, (InterfaceC0260c) this.f9808c);
            case 2:
                return new M1(this.f9809d, (BiFunction) this.f9810e, (InterfaceC0260c) this.f9808c);
            case 3:
                return new Q1((j$.util.function.A) this.f9809d, (BiConsumer) this.f9810e, (BiConsumer) this.f9808c);
            default:
                return new U1((j$.util.function.A) this.f9809d, (j$.util.function.v) this.f9810e, (InterfaceC0260c) this.f9808c);
        }
    }
}
