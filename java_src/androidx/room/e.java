package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public class e {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f2191m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    final String[] f2193b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f2194c;

    /* renamed from: d  reason: collision with root package name */
    final h f2195d;

    /* renamed from: g  reason: collision with root package name */
    volatile b0.f f2198g;

    /* renamed from: h  reason: collision with root package name */
    private b f2199h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.room.d f2200i;

    /* renamed from: k  reason: collision with root package name */
    private f f2202k;

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f2196e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f2197f = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j  reason: collision with root package name */
    final k.b<c, d> f2201j = new k.b<>();

    /* renamed from: l  reason: collision with root package name */
    Runnable f2203l = new a();

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f2192a = new HashMap<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p10 = e.this.f2195d.p(new b0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p10.getInt(0)));
                } catch (Throwable th) {
                    p10.close();
                    throw th;
                }
            }
            p10.close();
            if (!hashSet.isEmpty()) {
                e.this.f2198g.q();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock h10 = e.this.f2195d.h();
            Set<Integer> set = null;
            try {
                try {
                    h10.lock();
                } finally {
                    h10.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            }
            if (e.this.c()) {
                if (e.this.f2196e.compareAndSet(true, false)) {
                    if (e.this.f2195d.k()) {
                        return;
                    }
                    h hVar = e.this.f2195d;
                    if (hVar.f2242g) {
                        b0.b T = hVar.i().T();
                        T.e();
                        try {
                            set = a();
                            T.J();
                            T.d();
                        } catch (Throwable th) {
                            T.d();
                            throw th;
                        }
                    } else {
                        set = a();
                    }
                    if (set == null || set.isEmpty()) {
                        return;
                    }
                    synchronized (e.this.f2201j) {
                        Iterator<Map.Entry<c, d>> it = e.this.f2201j.iterator();
                        while (it.hasNext()) {
                            it.next().getValue().a(set);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f2205a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f2206b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f2207c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2208d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2209e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f2205a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f2206b = zArr;
            this.f2207c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f2208d && !this.f2209e) {
                    int length = this.f2205a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f2209e = true;
                            this.f2208d = false;
                            return this.f2207c;
                        }
                        boolean z10 = this.f2205a[i10] > 0;
                        boolean[] zArr = this.f2206b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f2207c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f2207c[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f2205a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f2208d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f2205a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f2208d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                this.f2209e = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f2210a;

        public c(String[] strArr) {
            this.f2210a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* loaded from: classes.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f2211a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f2212b;

        /* renamed from: c  reason: collision with root package name */
        final c f2213c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f2214d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set<String> set;
            this.f2213c = cVar;
            this.f2211a = iArr;
            this.f2212b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                set = Collections.unmodifiableSet(hashSet);
            } else {
                set = null;
            }
            this.f2214d = set;
        }

        void a(Set<Integer> set) {
            int length = this.f2211a.length;
            Set<String> set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f2211a[i10]))) {
                    if (length == 1) {
                        set2 = this.f2214d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f2212b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f2213c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f2212b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f2212b[0])) {
                        set = this.f2214d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f2212b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f2213c.b(set);
            }
        }
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2195d = hVar;
        this.f2199h = new b(strArr.length);
        this.f2194c = map2;
        this.f2200i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f2193b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f2192a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f2193b[i10] = str2.toLowerCase(locale);
            } else {
                this.f2193b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.f2192a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f2192a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2194c.containsKey(lowerCase)) {
                hashSet.addAll(this.f2194c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(b0.b bVar, int i10) {
        String[] strArr;
        bVar.m("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f2193b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2191m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.m(sb.toString());
        }
    }

    private void k(b0.b bVar, int i10) {
        String[] strArr;
        String str = this.f2193b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2191m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.m(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d s10;
        String[] h10 = h(cVar.f2210a);
        int[] iArr = new int[h10.length];
        int length = h10.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = this.f2192a.get(h10[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + h10[i10]);
            }
            iArr[i10] = num.intValue();
        }
        d dVar = new d(cVar, iArr, h10);
        synchronized (this.f2201j) {
            s10 = this.f2201j.s(cVar, dVar);
        }
        if (s10 == null && this.f2199h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (this.f2195d.o()) {
            if (!this.f2197f) {
                this.f2195d.i().T();
            }
            if (this.f2197f) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(b0.b bVar) {
        synchronized (this) {
            if (this.f2197f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.m("PRAGMA temp_store = MEMORY;");
            bVar.m("PRAGMA recursive_triggers='ON';");
            bVar.m("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f2198g = bVar.s("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f2197f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f2201j) {
            Iterator<Map.Entry<c, d>> it = this.f2201j.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f2196e.compareAndSet(false, true)) {
            this.f2195d.j().execute(this.f2203l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d v10;
        synchronized (this.f2201j) {
            v10 = this.f2201j.v(cVar);
        }
        if (v10 == null || !this.f2199h.c(v10.f2211a)) {
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Context context, String str) {
        this.f2202k = new f(context, str, this, this.f2195d.j());
    }

    void l() {
        if (this.f2195d.o()) {
            m(this.f2195d.i().T());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b0.b bVar) {
        if (bVar.A()) {
            return;
        }
        while (true) {
            try {
                Lock h10 = this.f2195d.h();
                h10.lock();
                try {
                    int[] a10 = this.f2199h.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    bVar.e();
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = a10[i10];
                        if (i11 == 1) {
                            j(bVar, i10);
                        } else if (i11 == 2) {
                            k(bVar, i10);
                        }
                    }
                    bVar.J();
                    bVar.d();
                    this.f2199h.d();
                } finally {
                    h10.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
