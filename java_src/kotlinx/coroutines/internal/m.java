package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class m<E> {
    public static <E> Object a(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, int i10, k9.g gVar) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, E e10) {
        if (!r9.n0.a() || (!(e10 instanceof List))) {
            if (obj == null) {
                return a(e10);
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e10);
                return a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e10);
            return a(arrayList);
        }
        throw new AssertionError();
    }
}
