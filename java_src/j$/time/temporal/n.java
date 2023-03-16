package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.util.function.BiConsumer;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a */
    public static final /* synthetic */ int f9558a = 0;

    public static void a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.n(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static int b(TemporalAccessor temporalAccessor, o oVar) {
        z i10 = temporalAccessor.i(oVar);
        if (!i10.g()) {
            throw new y("Invalid field " + oVar + " for get() method, use getLong() instead");
        }
        long k10 = temporalAccessor.k(oVar);
        if (i10.h(k10)) {
            return (int) k10;
        }
        throw new j$.time.d("Invalid value for " + oVar + " (valid values " + i10 + "): " + k10);
    }

    public static Object c(TemporalAccessor temporalAccessor, w wVar) {
        if (wVar == p.f9559a || wVar == q.f9560a || wVar == r.f9561a) {
            return null;
        }
        return wVar.a(temporalAccessor);
    }

    public static z d(TemporalAccessor temporalAccessor, o oVar) {
        if (!(oVar instanceof a)) {
            Objects.requireNonNull(oVar, "field");
            return oVar.k(temporalAccessor);
        } else if (temporalAccessor.h(oVar)) {
            return oVar.c();
        } else {
            throw new y("Unsupported field: " + oVar);
        }
    }

    public static /* synthetic */ boolean e(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static l f(DayOfWeek dayOfWeek) {
        return new m(dayOfWeek.o());
    }
}
