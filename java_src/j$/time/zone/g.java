package j$.time.zone;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f9587a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap f9588b;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f9587a = copyOnWriteArrayList;
        f9588b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static Set a() {
        return new HashSet(f9588b.keySet());
    }

    public static c b(String str, boolean z10) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentMap concurrentMap = f9588b;
        g gVar = (g) concurrentMap.get(str);
        if (gVar == null) {
            if (concurrentMap.isEmpty()) {
                throw new d("No time-zone data files registered");
            }
            throw new d("Unknown time-zone ID: " + str);
        }
        return gVar.c(str, z10);
    }

    public static void e(g gVar) {
        Objects.requireNonNull(gVar, "provider");
        for (String str : gVar.d()) {
            Objects.requireNonNull(str, "zoneId");
            if (((g) f9588b.putIfAbsent(str, gVar)) != null) {
                throw new d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + gVar);
            }
        }
        f9587a.add(gVar);
    }

    protected abstract c c(String str, boolean z10);

    protected abstract Set d();
}
