package androidx.work;

import androidx.work.b;
import java.util.HashMap;
import java.util.List;
import k0.h;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // k0.h
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b bVar : list) {
            hashMap.putAll(bVar.j());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
