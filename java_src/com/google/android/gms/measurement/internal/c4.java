package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ed;
import java.util.Map;
/* loaded from: classes.dex */
final class c4 implements ed {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f4436a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d4 f4437b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(d4 d4Var, String str) {
        this.f4437b = d4Var;
        this.f4436a = str;
    }

    @Override // com.google.android.gms.internal.measurement.ed
    public final String a(String str) {
        Map map;
        map = this.f4437b.f4463d;
        Map map2 = (Map) map.get(this.f4436a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
