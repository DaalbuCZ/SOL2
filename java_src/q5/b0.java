package q5;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f12727a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f12728b = new AtomicInteger();

    public int a() {
        return this.f12728b.get();
    }

    public int b() {
        return this.f12727a.get();
    }

    public void c() {
        this.f12728b.getAndIncrement();
    }

    public void d() {
        this.f12727a.getAndIncrement();
    }

    public void e() {
        this.f12728b.set(0);
    }
}
