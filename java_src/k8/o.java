package k8;

import java.util.HashMap;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final l8.a<Object> f10828a;

    public o(y7.a aVar) {
        this.f10828a = new l8.a<>(aVar, "flutter/system", l8.f.f11209a);
    }

    public void a() {
        x7.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f10828a.c(hashMap);
    }
}
