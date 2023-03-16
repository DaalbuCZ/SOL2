package b1;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b {
    public static Map<String, Object> a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(i10));
        hashMap.put("message", str);
        return hashMap;
    }
}
