package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    private static u f8597c;

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f8598a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Long> f8599b = new PriorityQueue<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicLong f8600b = new AtomicLong(0);

        /* renamed from: a  reason: collision with root package name */
        private final long f8601a;

        private a(long j10) {
            this.f8601a = j10;
        }

        public static a b() {
            return c(f8600b.incrementAndGet());
        }

        public static a c(long j10) {
            return new a(j10);
        }

        public long d() {
            return this.f8601a;
        }
    }

    private u() {
    }

    public static u a() {
        if (f8597c == null) {
            f8597c = new u();
        }
        return f8597c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f8599b.isEmpty() && this.f8599b.peek().longValue() < aVar.f8601a) {
            this.f8598a.remove(this.f8599b.poll().longValue());
        }
        if (!this.f8599b.isEmpty() && this.f8599b.peek().longValue() == aVar.f8601a) {
            this.f8599b.poll();
        }
        MotionEvent motionEvent = this.f8598a.get(aVar.f8601a);
        this.f8598a.remove(aVar.f8601a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b10 = a.b();
        this.f8598a.put(b10.f8601a, MotionEvent.obtain(motionEvent));
        this.f8599b.add(Long.valueOf(b10.f8601a));
        return b10;
    }
}
