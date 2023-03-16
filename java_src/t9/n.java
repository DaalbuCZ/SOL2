package t9;

import kotlinx.coroutines.internal.e0;
/* loaded from: classes.dex */
public class n<E> extends a<E> {
    public n(j9.l<? super E, y8.s> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.c
    public Object i(E e10) {
        q<?> k10;
        do {
            Object i10 = super.i(e10);
            e0 e0Var = b.f14827b;
            if (i10 == e0Var) {
                return e0Var;
            }
            if (i10 != b.f14828c) {
                if (i10 instanceof j) {
                    return i10;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + i10).toString());
            }
            k10 = k(e10);
            if (k10 == null) {
                return e0Var;
            }
        } while (!(k10 instanceof j));
        return k10;
    }

    @Override // t9.a
    protected final boolean r() {
        return true;
    }

    @Override // t9.a
    protected final boolean s() {
        return true;
    }
}
