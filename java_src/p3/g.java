package p3;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final d f12271a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12272b;

    public g() {
        this(d.f12253a);
    }

    public g(d dVar) {
        this.f12271a = dVar;
    }

    public synchronized void a() {
        while (!this.f12272b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f12272b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f12272b;
        this.f12272b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f12272b;
    }

    public synchronized boolean e() {
        if (this.f12272b) {
            return false;
        }
        this.f12272b = true;
        notifyAll();
        return true;
    }
}
