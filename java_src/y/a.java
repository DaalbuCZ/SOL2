package y;

import androidx.room.h;
import b0.f;
/* loaded from: classes.dex */
public abstract class a<T> extends d {
    public a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, T t10);

    public final void h(T t10) {
        f a10 = a();
        try {
            g(a10, t10);
            a10.U();
        } finally {
            f(a10);
        }
    }
}
