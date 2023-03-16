package j$.util.stream;

import j$.util.function.InterfaceC0260c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class J1 extends AbstractC0277a2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9837b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f9838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J1(int i10, Object obj, int i11) {
        super(i10);
        this.f9837b = i11;
        this.f9838c = obj;
    }

    @Override // j$.util.stream.AbstractC0277a2
    public Y1 b() {
        switch (this.f9837b) {
            case 0:
                return new K1((j$.util.function.f) this.f9838c);
            case 1:
                return new N1((InterfaceC0260c) this.f9838c);
            case 2:
                return new T1((j$.util.function.k) this.f9838c);
            default:
                return new X1((j$.util.function.p) this.f9838c);
        }
    }
}
