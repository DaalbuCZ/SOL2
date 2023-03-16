package j$.util;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public interface D extends F {
    @Override // j$.util.H
    boolean a(Consumer consumer);

    void f(j$.util.function.r rVar);

    @Override // j$.util.H
    void forEachRemaining(Consumer consumer);

    boolean g(j$.util.function.r rVar);

    @Override // j$.util.F, j$.util.H
    D trySplit();
}
