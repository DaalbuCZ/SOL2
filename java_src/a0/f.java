package a0;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f7a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f8b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f9c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f10d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f14d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16f;

        /* renamed from: g  reason: collision with root package name */
        private final int f17g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f11a = str;
            this.f12b = str2;
            this.f14d = z10;
            this.f15e = i10;
            this.f13c = a(str2);
            this.f16f = str3;
            this.f17g = i11;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f15e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f15e != aVar.f15e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (this.f11a.equals(aVar.f11a) && this.f14d == aVar.f14d) {
                if (this.f17g != 1 || aVar.f17g != 2 || (str3 = this.f16f) == null || str3.equals(aVar.f16f)) {
                    if (this.f17g != 2 || aVar.f17g != 1 || (str2 = aVar.f16f) == null || str2.equals(this.f16f)) {
                        int i10 = this.f17g;
                        return (i10 == 0 || i10 != aVar.f17g || ((str = this.f16f) == null ? aVar.f16f == null : str.equals(aVar.f16f))) && this.f13c == aVar.f13c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f11a.hashCode() * 31) + this.f13c) * 31) + (this.f14d ? 1231 : 1237)) * 31) + this.f15e;
        }

        public String toString() {
            return "Column{name='" + this.f11a + "', type='" + this.f12b + "', affinity='" + this.f13c + "', notNull=" + this.f14d + ", primaryKeyPosition=" + this.f15e + ", defaultValue='" + this.f16f + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f18a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19b;

        /* renamed from: c  reason: collision with root package name */
        public final String f20c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f21d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f22e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f18a = str;
            this.f19b = str2;
            this.f20c = str3;
            this.f21d = Collections.unmodifiableList(list);
            this.f22e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f18a.equals(bVar.f18a) && this.f19b.equals(bVar.f19b) && this.f20c.equals(bVar.f20c) && this.f21d.equals(bVar.f21d)) {
                return this.f22e.equals(bVar.f22e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f18a.hashCode() * 31) + this.f19b.hashCode()) * 31) + this.f20c.hashCode()) * 31) + this.f21d.hashCode()) * 31) + this.f22e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f18a + "', onDelete='" + this.f19b + "', onUpdate='" + this.f20c + "', columnNames=" + this.f21d + ", referenceColumnNames=" + this.f22e + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Comparable<c> {

        /* renamed from: n  reason: collision with root package name */
        final int f23n;

        /* renamed from: o  reason: collision with root package name */
        final int f24o;

        /* renamed from: p  reason: collision with root package name */
        final String f25p;

        /* renamed from: q  reason: collision with root package name */
        final String f26q;

        c(int i10, int i11, String str, String str2) {
            this.f23n = i10;
            this.f24o = i11;
            this.f25p = str;
            this.f26q = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(c cVar) {
            int i10 = this.f23n - cVar.f23n;
            return i10 == 0 ? this.f24o - cVar.f24o : i10;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f27a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f28b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f29c;

        public d(String str, boolean z10, List<String> list) {
            this.f27a = str;
            this.f28b = z10;
            this.f29c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f28b == dVar.f28b && this.f29c.equals(dVar.f29c)) {
                return this.f27a.startsWith("index_") ? dVar.f27a.startsWith("index_") : this.f27a.equals(dVar.f27a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f27a.startsWith("index_") ? -1184239155 : this.f27a.hashCode()) * 31) + (this.f28b ? 1 : 0)) * 31) + this.f29c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f27a + "', unique=" + this.f28b + ", columns=" + this.f29c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f7a = str;
        this.f8b = Collections.unmodifiableMap(map);
        this.f9c = Collections.unmodifiableSet(set);
        this.f10d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(b0.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(b0.b bVar, String str) {
        Cursor V = bVar.V("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (V.getColumnCount() > 0) {
                int columnIndex = V.getColumnIndex("name");
                int columnIndex2 = V.getColumnIndex("type");
                int columnIndex3 = V.getColumnIndex("notnull");
                int columnIndex4 = V.getColumnIndex("pk");
                int columnIndex5 = V.getColumnIndex("dflt_value");
                while (V.moveToNext()) {
                    String string = V.getString(columnIndex);
                    hashMap.put(string, new a(string, V.getString(columnIndex2), V.getInt(columnIndex3) != 0, V.getInt(columnIndex4), V.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            V.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(b0.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor V = bVar.V("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("id");
            int columnIndex2 = V.getColumnIndex("seq");
            int columnIndex3 = V.getColumnIndex("table");
            int columnIndex4 = V.getColumnIndex("on_delete");
            int columnIndex5 = V.getColumnIndex("on_update");
            List<c> c10 = c(V);
            int count = V.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                V.moveToPosition(i10);
                if (V.getInt(columnIndex2) == 0) {
                    int i11 = V.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : c10) {
                        if (cVar.f23n == i11) {
                            arrayList.add(cVar.f25p);
                            arrayList2.add(cVar.f26q);
                        }
                    }
                    hashSet.add(new b(V.getString(columnIndex3), V.getString(columnIndex4), V.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            V.close();
        }
    }

    private static d e(b0.b bVar, String str, boolean z10) {
        Cursor V = bVar.V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("seqno");
            int columnIndex2 = V.getColumnIndex("cid");
            int columnIndex3 = V.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (V.moveToNext()) {
                    if (V.getInt(columnIndex2) >= 0) {
                        int i10 = V.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i10), V.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z10, arrayList);
            }
            return null;
        } finally {
            V.close();
        }
    }

    private static Set<d> f(b0.b bVar, String str) {
        Cursor V = bVar.V("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = V.getColumnIndex("name");
            int columnIndex2 = V.getColumnIndex("origin");
            int columnIndex3 = V.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (V.moveToNext()) {
                    if ("c".equals(V.getString(columnIndex2))) {
                        String string = V.getString(columnIndex);
                        boolean z10 = true;
                        if (V.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d e10 = e(bVar, string, z10);
                        if (e10 == null) {
                            return null;
                        }
                        hashSet.add(e10);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            V.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f7a;
        if (str == null ? fVar.f7a == null : str.equals(fVar.f7a)) {
            Map<String, a> map = this.f8b;
            if (map == null ? fVar.f8b == null : map.equals(fVar.f8b)) {
                Set<b> set2 = this.f9c;
                if (set2 == null ? fVar.f9c == null : set2.equals(fVar.f9c)) {
                    Set<d> set3 = this.f10d;
                    if (set3 == null || (set = fVar.f10d) == null) {
                        return true;
                    }
                    return set3.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f8b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f9c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f7a + "', columns=" + this.f8b + ", foreignKeys=" + this.f9c + ", indices=" + this.f10d + '}';
    }
}
