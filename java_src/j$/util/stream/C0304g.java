package j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
/* renamed from: j$.util.stream.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0304g implements BaseStream {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InterfaceC0309h f10054a;

    private /* synthetic */ C0304g(InterfaceC0309h interfaceC0309h) {
        this.f10054a = interfaceC0309h;
    }

    public static /* synthetic */ BaseStream A(InterfaceC0309h interfaceC0309h) {
        if (interfaceC0309h == null) {
            return null;
        }
        return new C0304g(interfaceC0309h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.f10054a.close();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return this.f10054a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Iterator iterator() {
        return this.f10054a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream onClose(Runnable runnable) {
        return A(this.f10054a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream parallel() {
        return A(this.f10054a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream sequential() {
        return A(this.f10054a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Spliterator spliterator() {
        return j$.util.G.a(this.f10054a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream unordered() {
        return A(this.f10054a.unordered());
    }
}
