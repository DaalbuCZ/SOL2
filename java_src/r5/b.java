package r5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f13020a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f13021b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13022c;

    public b(int i10, int i11) {
        this.f13021b = i10;
        this.f13022c = i11;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f13022c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i10 ? trim.substring(0, i10) : trim;
        }
        return str;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f13020a));
    }

    public synchronized boolean d(String str, String str2) {
        String b10 = b(str);
        if (this.f13020a.size() >= this.f13021b && !this.f13020a.containsKey(b10)) {
            n5.f f10 = n5.f.f();
            f10.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f13021b);
            return false;
        }
        String c10 = c(str2, this.f13022c);
        if (q5.h.B(this.f13020a.get(b10), c10)) {
            return false;
        }
        Map<String, String> map = this.f13020a;
        if (str2 == null) {
            c10 = "";
        }
        map.put(b10, c10);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b10 = b(entry.getKey());
            if (this.f13020a.size() >= this.f13021b && !this.f13020a.containsKey(b10)) {
                i10++;
            }
            String value = entry.getValue();
            this.f13020a.put(b10, value == null ? "" : c(value, this.f13022c));
        }
        if (i10 > 0) {
            n5.f f10 = n5.f.f();
            f10.k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f13021b);
        }
    }
}
