package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Deque;
/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0358r1 extends AbstractC0362s1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0358r1(P0 p02) {
        super(p02);
    }

    @Override // j$.util.H
    public boolean a(Consumer consumer) {
        P0 b10;
        if (d()) {
            boolean a10 = this.f10135d.a(consumer);
            if (!a10) {
                if (this.f10134c == null && (b10 = b(this.f10136e)) != null) {
                    j$.util.H spliterator = b10.spliterator();
                    this.f10135d = spliterator;
                    return spliterator.a(consumer);
                }
                this.f10132a = null;
            }
            return a10;
        }
        return false;
    }

    @Override // j$.util.H
    public void forEachRemaining(Consumer consumer) {
        if (this.f10132a == null) {
            return;
        }
        if (this.f10135d != null) {
            do {
            } while (a(consumer));
            return;
        }
        j$.util.H h10 = this.f10134c;
        if (h10 != null) {
            h10.forEachRemaining(consumer);
            return;
        }
        Deque c10 = c();
        while (true) {
            P0 b10 = b(c10);
            if (b10 == null) {
                this.f10132a = null;
                return;
            }
            b10.a(consumer);
        }
    }
}
