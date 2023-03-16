package j$.util.stream;

import j$.util.function.BiConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class I implements j$.util.function.A, BiConsumer, j$.util.function.n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ I f9825a = new I();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ I f9826b = new I();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ I f9827c = new I();

    @Override // j$.util.function.A
    public Object get() {
        return new N();
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i10 = AbstractC0320j0.f10061t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        int i11 = AbstractC0317i2.f10058t;
        return new Object[i10];
    }
}
