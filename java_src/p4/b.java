package p4;

import android.os.Bundle;
import java.util.EnumMap;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f12399b = new b(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f12400a;

    public b(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f12400a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) bool2);
    }

    public b(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f12400a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static b a(Bundle bundle) {
        a[] values;
        if (bundle == null) {
            return f12399b;
        }
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : a.values()) {
            enumMap.put((EnumMap) aVar, (a) n(bundle.getString(aVar.f12398n)));
        }
        return new b(enumMap);
    }

    public static b b(String str) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                a[] aVarArr = a.f12396q;
                int length = aVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                a aVar = aVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char charAt = str.charAt(i11);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) aVar, (a) bool);
                }
                i10++;
            }
        }
        return new b(enumMap);
    }

    public static String g(Bundle bundle) {
        a[] values;
        String string;
        for (a aVar : a.values()) {
            if (bundle.containsKey(aVar.f12398n) && (string = bundle.getString(aVar.f12398n)) != null && n(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean j(int i10, int i11) {
        return i10 <= i11;
    }

    static final int m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final b c(b bVar) {
        a[] values;
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : a.values()) {
            Boolean bool = (Boolean) this.f12400a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f12400a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new b(enumMap);
    }

    public final b d(b bVar) {
        a[] values;
        EnumMap enumMap = new EnumMap(a.class);
        for (a aVar : a.values()) {
            Boolean bool = (Boolean) this.f12400a.get(aVar);
            if (bool == null) {
                bool = (Boolean) bVar.f12400a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new b(enumMap);
    }

    public final Boolean e() {
        return (Boolean) this.f12400a.get(a.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        a[] values;
        if (obj instanceof b) {
            b bVar = (b) obj;
            for (a aVar : a.values()) {
                if (m((Boolean) this.f12400a.get(aVar)) != m((Boolean) bVar.f12400a.get(aVar))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final Boolean f() {
        return (Boolean) this.f12400a.get(a.ANALYTICS_STORAGE);
    }

    public final String h() {
        StringBuilder sb = new StringBuilder("G1");
        a[] aVarArr = a.f12396q;
        int length = aVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f12400a.get(aVarArr[i10]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i10 = 17;
        for (Boolean bool : this.f12400a.values()) {
            i10 = (i10 * 31) + m(bool);
        }
        return i10;
    }

    public final boolean i(a aVar) {
        Boolean bool = (Boolean) this.f12400a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean k(b bVar) {
        return l(bVar, (a[]) this.f12400a.keySet().toArray(new a[0]));
    }

    public final boolean l(b bVar, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = (Boolean) this.f12400a.get(aVar);
            Boolean bool2 = (Boolean) bVar.f12400a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        a[] values = a.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            a aVar = values[i10];
            if (i10 != 0) {
                sb.append(", ");
            }
            sb.append(aVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f12400a.get(aVar);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
