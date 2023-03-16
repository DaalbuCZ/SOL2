package o3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f11940a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f11941b;

    public synchronized void a(Map<String, String> map) {
        this.f11941b = null;
        this.f11940a.clear();
        this.f11940a.putAll(map);
    }

    public synchronized Map<String, String> b() {
        if (this.f11941b == null) {
            this.f11941b = Collections.unmodifiableMap(new HashMap(this.f11940a));
        }
        return this.f11941b;
    }
}
