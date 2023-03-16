package kotlinx.coroutines.scheduling;

import r9.o0;
/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f11020p;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f11020p = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f11020p.run();
        } finally {
            this.f11018o.a();
        }
    }

    public String toString() {
        return "Task[" + o0.a(this.f11020p) + '@' + o0.b(this.f11020p) + ", " + this.f11017n + ", " + this.f11018o + ']';
    }
}
