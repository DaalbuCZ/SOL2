package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0390z1 extends A1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f10191h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0390z1(j$.util.H h10, D0 d02, Object[] objArr) {
        super(h10, d02, objArr.length);
        this.f10191h = objArr;
    }

    C0390z1(C0390z1 c0390z1, j$.util.H h10, long j10, long j11) {
        super(c0390z1, h10, j10, j11, c0390z1.f10191h.length);
        this.f10191h = c0390z1.f10191h;
    }

    @Override // j$.util.stream.A1
    A1 a(j$.util.H h10, long j10, long j11) {
        return new C0390z1(this, h10, j10, j11);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        int i10 = this.f9769f;
        if (i10 >= this.f9770g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f9769f));
        }
        Object[] objArr = this.f10191h;
        this.f9769f = i10 + 1;
        objArr[i10] = obj;
    }
}
