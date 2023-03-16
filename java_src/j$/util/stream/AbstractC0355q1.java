package j$.util.stream;

import java.util.Deque;
/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0355q1 extends AbstractC0362s1 implements j$.util.F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0355q1(O0 o02) {
        super(o02);
    }

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public void m(Object obj) {
        if (this.f10132a == null) {
            return;
        }
        if (this.f10135d != null) {
            do {
            } while (k(obj));
            return;
        }
        j$.util.H h10 = this.f10134c;
        if (h10 != null) {
            ((j$.util.F) h10).forEachRemaining(obj);
            return;
        }
        Deque c10 = c();
        while (true) {
            O0 o02 = (O0) b(c10);
            if (o02 == null) {
                this.f10132a = null;
                return;
            }
            o02.l(obj);
        }
    }

    @Override // j$.util.F
    /* renamed from: tryAdvance */
    public boolean k(Object obj) {
        O0 o02;
        if (d()) {
            boolean tryAdvance = ((j$.util.F) this.f10135d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.f10134c == null && (o02 = (O0) b(this.f10136e)) != null) {
                    j$.util.F spliterator = o02.spliterator();
                    this.f10135d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f10132a = null;
            }
            return tryAdvance;
        }
        return false;
    }
}
