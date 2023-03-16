package j$.util.stream;

import j$.util.AbstractC0251a;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* renamed from: j$.util.stream.m3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0338m3 implements j$.util.H, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f10097d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final j$.util.H f10098a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f10099b;

    /* renamed from: c  reason: collision with root package name */
    private Object f10100c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0338m3(j$.util.H h10) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f10098a = h10;
        this.f10099b = concurrentHashMap;
    }

    private C0338m3(j$.util.H h10, ConcurrentHashMap concurrentHashMap) {
        this.f10098a = h10;
        this.f10099b = concurrentHashMap;
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        while (this.f10098a.a(this)) {
            ConcurrentHashMap concurrentHashMap = this.f10099b;
            Object obj = this.f10100c;
            if (obj == null) {
                obj = f10097d;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f10100c);
                this.f10100c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        this.f10100c = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.H
    public int characteristics() {
        return (this.f10098a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.H
    public long estimateSize() {
        return this.f10098a.estimateSize();
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        this.f10098a.forEachRemaining(new C0339n(this, consumer, 6));
    }

    @Override // j$.util.H
    public Comparator getComparator() {
        return this.f10098a.getComparator();
    }

    @Override // j$.util.H
    public /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0251a.h(this);
    }

    @Override // j$.util.H
    public /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0251a.j(this, i10);
    }

    public void n(Consumer consumer, Object obj) {
        if (this.f10099b.putIfAbsent(obj != null ? obj : f10097d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.H
    public j$.util.H trySplit() {
        j$.util.H trySplit = this.f10098a.trySplit();
        if (trySplit != null) {
            return new C0338m3(trySplit, this.f10099b);
        }
        return null;
    }
}
