package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f8631b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f8632a = new HashMap();

    b() {
    }

    public static b b() {
        if (f8631b == null) {
            f8631b = new b();
        }
        return f8631b;
    }

    public a a(String str) {
        return this.f8632a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f8632a.put(str, aVar);
        } else {
            this.f8632a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
