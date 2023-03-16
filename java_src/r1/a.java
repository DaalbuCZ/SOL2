package r1;

import android.util.SparseArray;
import e1.d;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f12958a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f12959b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f12959b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f12959b.put(d.VERY_LOW, 1);
        f12959b.put(d.HIGHEST, 2);
        for (d dVar : f12959b.keySet()) {
            f12958a.append(f12959b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f12959b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f12958a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
