package j$.util.stream;

import j$.util.function.Predicate;
/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0373v0 extends AbstractC0389z0 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ A0 f10156c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f10157d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0373v0(A0 a02, Predicate predicate) {
        super(a02);
        this.f10156c = a02;
        this.f10157d = predicate;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        boolean z10;
        boolean z11;
        if (this.f10189a) {
            return;
        }
        boolean test = this.f10157d.test(obj);
        z10 = this.f10156c.f9762a;
        if (test == z10) {
            this.f10189a = true;
            z11 = this.f10156c.f9763b;
            this.f10190b = z11;
        }
    }
}
