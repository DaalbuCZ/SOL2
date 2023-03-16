package j$.util;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public interface z extends F {
    @Override // j$.util.H
    boolean a(Consumer consumer);

    @Override // j$.util.H
    void forEachRemaining(Consumer consumer);

    boolean k(j$.util.function.h hVar);

    void l(j$.util.function.h hVar);

    @Override // j$.util.F, j$.util.H
    z trySplit();
}
