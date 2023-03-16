package p3;

import java.util.Collections;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f12250a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f12251b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f12252c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f12250a) {
            this.f12251b.add(Integer.valueOf(i10));
            this.f12252c = Math.max(this.f12252c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f12250a) {
            this.f12251b.remove(Integer.valueOf(i10));
            this.f12252c = this.f12251b.isEmpty() ? Integer.MIN_VALUE : ((Integer) m0.j(this.f12251b.peek())).intValue();
            this.f12250a.notifyAll();
        }
    }
}
