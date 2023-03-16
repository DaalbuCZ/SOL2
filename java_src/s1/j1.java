package s1;

import java.util.HashSet;
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f13506a = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    private static String f13507b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (j1.class) {
            if (f13506a.add(str)) {
                f13507b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (j1.class) {
            str = f13507b;
        }
        return str;
    }
}
