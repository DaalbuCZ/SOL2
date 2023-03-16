package s8;

import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l8.r;
/* loaded from: classes.dex */
public class h {

    /* loaded from: classes.dex */
    public interface a {
        String a();

        String b();

        List<String> c();

        String d();

        List<String> e(c cVar);

        String f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final b f14396d = new b();

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        root(0),
        music(1),
        podcasts(2),
        ringtones(3),
        alarms(4),
        notifications(5),
        pictures(6),
        movies(7),
        downloads(8),
        dcim(9),
        documents(10);
        

        /* renamed from: n  reason: collision with root package name */
        private int f14409n;

        c(int i10) {
            this.f14409n = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
