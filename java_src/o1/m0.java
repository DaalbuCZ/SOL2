package o1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import g1.i;
import j1.a;
import j1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p1.b;
/* loaded from: classes.dex */
public class m0 implements o1.d, p1.b, o1.c {

    /* renamed from: s  reason: collision with root package name */
    private static final e1.b f11860s = e1.b.b("proto");

    /* renamed from: n  reason: collision with root package name */
    private final t0 f11861n;

    /* renamed from: o  reason: collision with root package name */
    private final q1.a f11862o;

    /* renamed from: p  reason: collision with root package name */
    private final q1.a f11863p;

    /* renamed from: q  reason: collision with root package name */
    private final e f11864q;

    /* renamed from: r  reason: collision with root package name */
    private final x8.a<String> f11865r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f11866a;

        /* renamed from: b  reason: collision with root package name */
        final String f11867b;

        private c(String str, String str2) {
            this.f11866a = str;
            this.f11867b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(q1.a aVar, q1.a aVar2, e eVar, t0 t0Var, x8.a<String> aVar3) {
        this.f11861n = t0Var;
        this.f11862o = aVar;
        this.f11863p = aVar2;
        this.f11864q = eVar;
        this.f11865r = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j1.f A0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (j1.f) a1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: o1.l
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                j1.f z02;
                z02 = m0.z0(j10, (Cursor) obj);
                return z02;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long B0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean C0(g1.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long p02 = p0(sQLiteDatabase, pVar);
        return p02 == null ? Boolean.FALSE : (Boolean) a1(k0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{p02.toString()}), y.f11912a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List D0(SQLiteDatabase sQLiteDatabase) {
        return (List) a1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.f11894a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List E0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(g1.p.a().b(cursor.getString(1)).d(r1.a.b(cursor.getInt(2))).c(U0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List F0(g1.p pVar, SQLiteDatabase sQLiteDatabase) {
        e1.d[] values;
        List<k> S0 = S0(sQLiteDatabase, pVar, this.f11864q.d());
        for (e1.d dVar : e1.d.values()) {
            if (dVar != pVar.d()) {
                int d10 = this.f11864q.d() - S0.size();
                if (d10 <= 0) {
                    break;
                }
                S0.addAll(S0(sQLiteDatabase, pVar.f(dVar), d10));
            }
        }
        return s0(S0, T0(sQLiteDatabase, S0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ j1.a G0(Map map, a.C0143a c0143a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b g02 = g0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(j1.c.c().c(g02).b(j10).a());
        }
        V0(c0143a, map);
        c0143a.e(o0());
        c0143a.d(l0());
        c0143a.c(this.f11865r.get());
        return c0143a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ j1.a H0(String str, final Map map, final a.C0143a c0143a, SQLiteDatabase sQLiteDatabase) {
        return (j1.a) a1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: o1.r
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                j1.a G0;
                G0 = m0.this.G0(map, c0143a, (Cursor) obj);
                return G0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object I0(List list, g1.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = g1.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            k10.h(z10 ? new g1.h(Y0(cursor.getString(4)), cursor.getBlob(5)) : new g1.h(Y0(cursor.getString(4)), W0(j10)));
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, pVar, k10.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object J0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long K0(g1.i iVar, g1.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (r0()) {
            f(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long i02 = i0(sQLiteDatabase, pVar);
        int e10 = this.f11864q.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(i02));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] L0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object M0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            f(i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object N0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        a1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: o1.i0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object M0;
                M0 = m0.this.M0((Cursor) obj);
                return M0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean O0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object P0(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) a1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())}), x.f11911a)).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.d()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Q0(long j10, g1.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(r1.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(r1.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object R0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f11862o.a()).execute();
        return null;
    }

    private List<k> S0(SQLiteDatabase sQLiteDatabase, final g1.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long p02 = p0(sQLiteDatabase, pVar);
        if (p02 == null) {
            return arrayList;
        }
        a1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{p02.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: o1.q
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object I0;
                I0 = m0.this.I0(arrayList, pVar, (Cursor) obj);
                return I0;
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> T0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        a1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: o1.g0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object J0;
                J0 = m0.J0(hashMap, (Cursor) obj);
                return J0;
            }
        });
        return hashMap;
    }

    private static byte[] U0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void V0(a.C0143a c0143a, Map<String, List<j1.c>> map) {
        for (Map.Entry<String, List<j1.c>> entry : map.entrySet()) {
            c0143a.a(j1.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] W0(long j10) {
        return (byte[]) a1(k0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), s.f11892a);
    }

    private <T> T X0(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f11863p.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f11863p.a() >= this.f11864q.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static e1.b Y0(String str) {
        return str == null ? f11860s : e1.b.b(str);
    }

    private static String Z0(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T a1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b g0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.d()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.d()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.d()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.d()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.d()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.d()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.d()) {
            return bVar7;
        }
        k1.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void h0(final SQLiteDatabase sQLiteDatabase) {
        X0(new d() { // from class: o1.c0
            @Override // o1.m0.d
            public final Object a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, b0.f11835a);
    }

    private long i0(SQLiteDatabase sQLiteDatabase, g1.p pVar) {
        Long p02 = p0(sQLiteDatabase, pVar);
        if (p02 != null) {
            return p02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(r1.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private j1.b l0() {
        return j1.b.b().b(j1.e.c().b(j0()).c(e.f11838a.f()).a()).a();
    }

    private long m0() {
        return k0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long n0() {
        return k0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private j1.f o0() {
        final long a10 = this.f11862o.a();
        return (j1.f) q0(new b() { // from class: o1.w
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                j1.f A0;
                A0 = m0.A0(a10, (SQLiteDatabase) obj);
                return A0;
            }
        });
    }

    private Long p0(SQLiteDatabase sQLiteDatabase, g1.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(r1.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) a1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), v.f11909a);
    }

    private boolean r0() {
        return m0() * n0() >= this.f11864q.f();
    }

    private List<k> s0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f11866a, cVar.f11867b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object t0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            f(i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer u0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        a1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: o1.h0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object t02;
                t02 = m0.this.t0((Cursor) obj);
                return t02;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object w0(Throwable th) {
        throw new p1.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase x0(Throwable th) {
        throw new p1.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long y0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j1.f z0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return j1.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    @Override // o1.d
    public Iterable<g1.p> C() {
        return (Iterable) q0(z.f11913a);
    }

    @Override // o1.d
    public Iterable<k> F(final g1.p pVar) {
        return (Iterable) q0(new b() { // from class: o1.m
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                List F0;
                F0 = m0.this.F0(pVar, (SQLiteDatabase) obj);
                return F0;
            }
        });
    }

    @Override // o1.d
    public boolean I(final g1.p pVar) {
        return ((Boolean) q0(new b() { // from class: o1.n
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Boolean C0;
                C0 = m0.this.C0(pVar, (SQLiteDatabase) obj);
                return C0;
            }
        })).booleanValue();
    }

    @Override // o1.d
    public void K(final g1.p pVar, final long j10) {
        q0(new b() { // from class: o1.e0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object Q0;
                Q0 = m0.Q0(j10, pVar, (SQLiteDatabase) obj);
                return Q0;
            }
        });
    }

    @Override // o1.d
    public void Q(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Z0(iterable);
            q0(new b() { // from class: o1.o
                @Override // o1.m0.b
                public final Object apply(Object obj) {
                    Object N0;
                    N0 = m0.this.N0(str, r3, (SQLiteDatabase) obj);
                    return N0;
                }
            });
        }
    }

    @Override // o1.c
    public j1.a a() {
        final a.C0143a e10 = j1.a.e();
        final HashMap hashMap = new HashMap();
        return (j1.a) q0(new b() { // from class: o1.p
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                j1.a H0;
                H0 = m0.this.H0(r2, hashMap, e10, (SQLiteDatabase) obj);
                return H0;
            }
        });
    }

    @Override // o1.c
    public void b() {
        q0(new b() { // from class: o1.j0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object R0;
                R0 = m0.this.R0((SQLiteDatabase) obj);
                return R0;
            }
        });
    }

    @Override // p1.b
    public <T> T c(b.a<T> aVar) {
        SQLiteDatabase k02 = k0();
        h0(k02);
        try {
            T b10 = aVar.b();
            k02.setTransactionSuccessful();
            return b10;
        } finally {
            k02.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11861n.close();
    }

    @Override // o1.c
    public void f(final long j10, final c.b bVar, final String str) {
        q0(new b() { // from class: o1.f0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Object P0;
                P0 = m0.P0(str, bVar, j10, (SQLiteDatabase) obj);
                return P0;
            }
        });
    }

    @Override // o1.d
    public int g() {
        final long a10 = this.f11862o.a() - this.f11864q.c();
        return ((Integer) q0(new b() { // from class: o1.k0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Integer u02;
                u02 = m0.this.u0(a10, (SQLiteDatabase) obj);
                return u02;
            }
        })).intValue();
    }

    @Override // o1.d
    public void h(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            k0().compileStatement("DELETE FROM events WHERE _id in " + Z0(iterable)).execute();
        }
    }

    long j0() {
        return m0() * n0();
    }

    SQLiteDatabase k0() {
        final t0 t0Var = this.f11861n;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) X0(new d() { // from class: o1.d0
            @Override // o1.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, a0.f11831a);
    }

    @Override // o1.d
    public k l(final g1.p pVar, final g1.i iVar) {
        k1.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long longValue = ((Long) q0(new b() { // from class: o1.l0
            @Override // o1.m0.b
            public final Object apply(Object obj) {
                Long K0;
                K0 = m0.this.K0(iVar, pVar, (SQLiteDatabase) obj);
                return K0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, pVar, iVar);
    }

    <T> T q0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase k02 = k0();
        k02.beginTransaction();
        try {
            T apply = bVar.apply(k02);
            k02.setTransactionSuccessful();
            return apply;
        } finally {
            k02.endTransaction();
        }
    }

    @Override // o1.d
    public long x(g1.p pVar) {
        return ((Long) a1(k0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(r1.a.a(pVar.d()))}), u.f11905a)).longValue();
    }
}
