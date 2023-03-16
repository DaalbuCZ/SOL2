package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class ja {
    public static final int a(int i10, Object obj, Object obj2) {
        ia iaVar = (ia) obj;
        ha haVar = (ha) obj2;
        if (iaVar.isEmpty()) {
            return 0;
        }
        Iterator it = iaVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object b(Object obj, Object obj2) {
        ia iaVar = (ia) obj;
        ia iaVar2 = (ia) obj2;
        if (!iaVar2.isEmpty()) {
            if (!iaVar.h()) {
                iaVar = iaVar.d();
            }
            iaVar.g(iaVar2);
        }
        return iaVar;
    }
}
