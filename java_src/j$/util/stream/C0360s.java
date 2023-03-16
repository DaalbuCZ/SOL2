package j$.util.stream;

import j$.util.function.BiConsumer;
/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0360s implements j$.util.function.A, BiConsumer, j$.util.function.n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0360s f10128a = new C0360s();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C0360s f10129b = new C0360s();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ C0360s f10130c = new C0360s();

    @Override // j$.util.function.A
    public Object get() {
        int i10 = F.f9806t;
        return new double[4];
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i10 = F.f9806t;
        AbstractC0334m.b(dArr, dArr2[0]);
        AbstractC0334m.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        int i11 = AbstractC0320j0.f10061t;
        return new Integer[i10];
    }
}
