package e0;

import android.os.Trace;
/* loaded from: classes.dex */
final class b {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
