package x2;

import android.os.SystemClock;
import android.util.Pair;
import b5.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p3.m0;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f16305a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Long> f16306b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, y2.b> f16307c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f16308d;

    public b() {
        this(new Random());
    }

    b(Random random) {
        this.f16307c = new HashMap();
        this.f16308d = random;
        this.f16305a = new HashMap();
        this.f16306b = new HashMap();
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) m0.j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<y2.b> c(List<y2.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f16305a);
        h(elapsedRealtime, this.f16306b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            y2.b bVar = list.get(i10);
            if (!this.f16305a.containsKey(bVar.f16862b) && !this.f16306b.containsKey(Integer.valueOf(bVar.f16863c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(y2.b bVar, y2.b bVar2) {
        int compare = Integer.compare(bVar.f16863c, bVar2.f16863c);
        return compare != 0 ? compare : bVar.f16862b.compareTo(bVar2.f16862b);
    }

    public static int f(List<y2.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f16863c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private y2.b k(List<y2.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f16864d;
        }
        int nextInt = this.f16308d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            y2.b bVar = list.get(i13);
            i12 += bVar.f16864d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (y2.b) t.c(list);
    }

    public void e(y2.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f16862b, elapsedRealtime, this.f16305a);
        int i10 = bVar.f16863c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f16306b);
        }
    }

    public int g(List<y2.b> list) {
        HashSet hashSet = new HashSet();
        List<y2.b> c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(c10.get(i10).f16863c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f16305a.clear();
        this.f16306b.clear();
        this.f16307c.clear();
    }

    public y2.b j(List<y2.b> list) {
        Object obj;
        List<y2.b> c10 = c(list);
        if (c10.size() >= 2) {
            Collections.sort(c10, a.f16304n);
            ArrayList arrayList = new ArrayList();
            int i10 = c10.get(0).f16863c;
            int i11 = 0;
            while (true) {
                if (i11 >= c10.size()) {
                    break;
                }
                y2.b bVar = c10.get(i11);
                if (i10 == bVar.f16863c) {
                    arrayList.add(new Pair(bVar.f16862b, Integer.valueOf(bVar.f16864d)));
                    i11++;
                } else if (arrayList.size() == 1) {
                    obj = c10.get(0);
                }
            }
            y2.b bVar2 = this.f16307c.get(arrayList);
            if (bVar2 == null) {
                y2.b k10 = k(c10.subList(0, arrayList.size()));
                this.f16307c.put(arrayList, k10);
                return k10;
            }
            return bVar2;
        }
        obj = t.b(c10, null);
        return (y2.b) obj;
    }
}
