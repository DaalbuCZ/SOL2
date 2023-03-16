package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.C0259b;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0339n implements Consumer, j$.util.function.A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10102b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10103c;

    public /* synthetic */ C0339n(Object obj, Object obj2, int i10) {
        this.f10101a = i10;
        this.f10102b = obj;
        this.f10103c = obj2;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f10101a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f10102b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f10103c;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) this.f10102b).n(this.f10103c, obj);
                return;
            default:
                ((C0338m3) this.f10102b).n((Consumer) this.f10103c, obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f10101a) {
            case 0:
                return Objects.requireNonNull(consumer);
            case 5:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.function.A
    public Object get() {
        switch (this.f10101a) {
            case 1:
                return new C0385y0((A0) this.f10102b, (C0259b) this.f10103c);
            case 2:
                return new C0377w0((A0) this.f10102b, (C0259b) this.f10103c);
            case 3:
                return new C0381x0((A0) this.f10102b, (C0259b) this.f10103c);
            default:
                return new C0373v0((A0) this.f10102b, (Predicate) this.f10103c);
        }
    }
}
