package j$.util;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public interface B extends F {
    @Override // j$.util.H
    boolean a(Consumer consumer);

    @Override // j$.util.H
    void forEachRemaining(Consumer consumer);

    boolean i(j$.util.function.m mVar);

    void m(j$.util.function.m mVar);

    @Override // j$.util.F, j$.util.H
    B trySplit();
}
