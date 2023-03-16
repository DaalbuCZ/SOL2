package y;

import androidx.room.h;
import b0.f;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f16416a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final h f16417b;

    /* renamed from: c  reason: collision with root package name */
    private volatile f f16418c;

    public d(h hVar) {
        this.f16417b = hVar;
    }

    private f c() {
        return this.f16417b.d(d());
    }

    private f e(boolean z10) {
        if (z10) {
            if (this.f16418c == null) {
                this.f16418c = c();
            }
            return this.f16418c;
        }
        return c();
    }

    public f a() {
        b();
        return e(this.f16416a.compareAndSet(false, true));
    }

    protected void b() {
        this.f16417b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f16418c) {
            this.f16416a.set(false);
        }
    }
}
