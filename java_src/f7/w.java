package f7;

import java.io.IOException;
/* loaded from: classes.dex */
public abstract class w<T> {

    /* loaded from: classes.dex */
    class a extends w<T> {
        a() {
        }

        @Override // f7.w
        public T c(n7.a aVar) {
            if (aVar.Z() == n7.b.NULL) {
                aVar.S();
                return null;
            }
            return (T) w.this.c(aVar);
        }

        @Override // f7.w
        public void e(n7.c cVar, T t10) {
            if (t10 == null) {
                cVar.D();
            } else {
                w.this.e(cVar, t10);
            }
        }
    }

    public final T a(k kVar) {
        try {
            return c(new i7.f(kVar));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    public final w<T> b() {
        return new a();
    }

    public abstract T c(n7.a aVar);

    public final k d(T t10) {
        try {
            i7.g gVar = new i7.g();
            e(gVar, t10);
            return gVar.f0();
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    public abstract void e(n7.c cVar, T t10);
}
