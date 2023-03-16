package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9501a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f9502b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f9501a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i10 = C0250b.f9450c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C0250b.f9449b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((B) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C0250b.f9449b;
        Collections.sort(arrayList, comparator);
        this.f9502b = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(long j10, B b10) {
        Map map = (Map) this.f9501a.get(b10);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator b(B b10) {
        List list = (List) this.f9502b.get(b10);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
