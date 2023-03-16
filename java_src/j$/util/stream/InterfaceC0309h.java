package j$.util.stream;

import java.util.Iterator;
/* renamed from: j$.util.stream.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0309h extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC0309h onClose(Runnable runnable);

    InterfaceC0309h parallel();

    InterfaceC0309h sequential();

    j$.util.H spliterator();

    InterfaceC0309h unordered();
}
