package j$.util.stream;

import j$.util.function.BiConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class K implements j$.util.function.A, BiConsumer, j$.util.function.n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ K f9839a = new K();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ K f9840b = new K();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ K f9841c = new K();

    @Override // j$.util.function.A
    public Object get() {
        return new P();
    }

    @Override // j$.util.function.BiConsumer
    public void n(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i10 = AbstractC0361s0.f10131t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override // j$.util.function.n
    public Object u(int i10) {
        int i11 = C0371u2.f10151w;
        return new Integer[i10];
    }
}
