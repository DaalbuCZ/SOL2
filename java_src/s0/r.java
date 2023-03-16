package s0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import s0.p;
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.h f13251a;

    /* renamed from: b  reason: collision with root package name */
    private final y.a<p> f13252b;

    /* renamed from: c  reason: collision with root package name */
    private final y.d f13253c;

    /* renamed from: d  reason: collision with root package name */
    private final y.d f13254d;

    /* renamed from: e  reason: collision with root package name */
    private final y.d f13255e;

    /* renamed from: f  reason: collision with root package name */
    private final y.d f13256f;

    /* renamed from: g  reason: collision with root package name */
    private final y.d f13257g;

    /* renamed from: h  reason: collision with root package name */
    private final y.d f13258h;

    /* renamed from: i  reason: collision with root package name */
    private final y.d f13259i;

    /* renamed from: j  reason: collision with root package name */
    private final y.d f13260j;

    /* loaded from: classes.dex */
    class a extends y.a<p> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // y.a
        /* renamed from: i */
        public void g(b0.f fVar, p pVar) {
            String str = pVar.f13231a;
            if (str == null) {
                fVar.u(1);
            } else {
                fVar.n(1, str);
            }
            fVar.H(2, v.j(pVar.f13232b));
            String str2 = pVar.f13233c;
            if (str2 == null) {
                fVar.u(3);
            } else {
                fVar.n(3, str2);
            }
            String str3 = pVar.f13234d;
            if (str3 == null) {
                fVar.u(4);
            } else {
                fVar.n(4, str3);
            }
            byte[] n10 = androidx.work.b.n(pVar.f13235e);
            if (n10 == null) {
                fVar.u(5);
            } else {
                fVar.P(5, n10);
            }
            byte[] n11 = androidx.work.b.n(pVar.f13236f);
            if (n11 == null) {
                fVar.u(6);
            } else {
                fVar.P(6, n11);
            }
            fVar.H(7, pVar.f13237g);
            fVar.H(8, pVar.f13238h);
            fVar.H(9, pVar.f13239i);
            fVar.H(10, pVar.f13241k);
            fVar.H(11, v.a(pVar.f13242l));
            fVar.H(12, pVar.f13243m);
            fVar.H(13, pVar.f13244n);
            fVar.H(14, pVar.f13245o);
            fVar.H(15, pVar.f13246p);
            fVar.H(16, pVar.f13247q ? 1L : 0L);
            fVar.H(17, v.i(pVar.f13248r));
            k0.b bVar = pVar.f13240j;
            if (bVar != null) {
                fVar.H(18, v.h(bVar.b()));
                fVar.H(19, bVar.g() ? 1L : 0L);
                fVar.H(20, bVar.h() ? 1L : 0L);
                fVar.H(21, bVar.f() ? 1L : 0L);
                fVar.H(22, bVar.i() ? 1L : 0L);
                fVar.H(23, bVar.c());
                fVar.H(24, bVar.d());
                byte[] c10 = v.c(bVar.a());
                if (c10 != null) {
                    fVar.P(25, c10);
                    return;
                }
            } else {
                fVar.u(18);
                fVar.u(19);
                fVar.u(20);
                fVar.u(21);
                fVar.u(22);
                fVar.u(23);
                fVar.u(24);
            }
            fVar.u(25);
        }
    }

    /* loaded from: classes.dex */
    class b extends y.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class c extends y.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class d extends y.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class e extends y.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class f extends y.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class g extends y.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class h extends y.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    class i extends y.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // y.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f13251a = hVar;
        this.f13252b = new a(hVar);
        this.f13253c = new b(hVar);
        this.f13254d = new c(hVar);
        this.f13255e = new d(hVar);
        this.f13256f = new e(hVar);
        this.f13257g = new f(hVar);
        this.f13258h = new g(hVar);
        this.f13259i = new h(hVar);
        this.f13260j = new i(hVar);
    }

    @Override // s0.q
    public void a(String str) {
        this.f13251a.b();
        b0.f a10 = this.f13253c.a();
        if (str == null) {
            a10.u(1);
        } else {
            a10.n(1, str);
        }
        this.f13251a.c();
        try {
            a10.q();
            this.f13251a.r();
        } finally {
            this.f13251a.g();
            this.f13253c.f(a10);
        }
    }

    @Override // s0.q
    public void b(p pVar) {
        this.f13251a.b();
        this.f13251a.c();
        try {
            this.f13252b.h(pVar);
            this.f13251a.r();
        } finally {
            this.f13251a.g();
        }
    }

    @Override // s0.q
    public int c(k0.s sVar, String... strArr) {
        this.f13251a.b();
        StringBuilder b10 = a0.e.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        a0.e.a(b10, strArr.length);
        b10.append(")");
        b0.f d10 = this.f13251a.d(b10.toString());
        d10.H(1, v.j(sVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                d10.u(i10);
            } else {
                d10.n(i10, str);
            }
            i10++;
        }
        this.f13251a.c();
        try {
            int q10 = d10.q();
            this.f13251a.r();
            return q10;
        } finally {
            this.f13251a.g();
        }
    }

    @Override // s0.q
    public List<p> d() {
        y.c cVar;
        y.c c10 = y.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "required_network_type");
            int b12 = a0.b.b(b10, "requires_charging");
            int b13 = a0.b.b(b10, "requires_device_idle");
            int b14 = a0.b.b(b10, "requires_battery_not_low");
            int b15 = a0.b.b(b10, "requires_storage_not_low");
            int b16 = a0.b.b(b10, "trigger_content_update_delay");
            int b17 = a0.b.b(b10, "trigger_max_content_delay");
            int b18 = a0.b.b(b10, "content_uri_triggers");
            int b19 = a0.b.b(b10, "id");
            int b20 = a0.b.b(b10, "state");
            int b21 = a0.b.b(b10, "worker_class_name");
            int b22 = a0.b.b(b10, "input_merger_class_name");
            int b23 = a0.b.b(b10, "input");
            int b24 = a0.b.b(b10, "output");
            cVar = c10;
            try {
                int b25 = a0.b.b(b10, "initial_delay");
                int b26 = a0.b.b(b10, "interval_duration");
                int b27 = a0.b.b(b10, "flex_duration");
                int b28 = a0.b.b(b10, "run_attempt_count");
                int b29 = a0.b.b(b10, "backoff_policy");
                int b30 = a0.b.b(b10, "backoff_delay_duration");
                int b31 = a0.b.b(b10, "period_start_time");
                int b32 = a0.b.b(b10, "minimum_retention_duration");
                int b33 = a0.b.b(b10, "schedule_requested_at");
                int b34 = a0.b.b(b10, "run_in_foreground");
                int b35 = a0.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    k0.b bVar = new k0.b();
                    int i13 = b11;
                    bVar.k(v.e(b10.getInt(b11)));
                    bVar.m(b10.getInt(b12) != 0);
                    bVar.n(b10.getInt(b13) != 0);
                    bVar.l(b10.getInt(b14) != 0);
                    bVar.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    bVar.p(b10.getLong(b16));
                    bVar.q(b10.getLong(b17));
                    bVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f13232b = v.g(b10.getInt(b20));
                    pVar.f13234d = b10.getString(b22);
                    pVar.f13235e = androidx.work.b.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f13236f = androidx.work.b.g(b10.getBlob(i16));
                    i10 = i16;
                    int i17 = b25;
                    pVar.f13237g = b10.getLong(i17);
                    int i18 = b23;
                    int i19 = b26;
                    pVar.f13238h = b10.getLong(i19);
                    int i20 = b14;
                    int i21 = b27;
                    pVar.f13239i = b10.getLong(i21);
                    int i22 = b28;
                    pVar.f13241k = b10.getInt(i22);
                    int i23 = b29;
                    pVar.f13242l = v.d(b10.getInt(i23));
                    b27 = i21;
                    int i24 = b30;
                    pVar.f13243m = b10.getLong(i24);
                    int i25 = b31;
                    pVar.f13244n = b10.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    pVar.f13245o = b10.getLong(i26);
                    int i27 = b33;
                    pVar.f13246p = b10.getLong(i27);
                    int i28 = b34;
                    pVar.f13247q = b10.getInt(i28) != 0;
                    int i29 = b35;
                    pVar.f13248r = v.f(b10.getInt(i29));
                    pVar.f13240j = bVar;
                    arrayList.add(pVar);
                    b35 = i29;
                    b12 = i14;
                    b23 = i18;
                    b25 = i17;
                    b26 = i19;
                    b28 = i22;
                    b33 = i27;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i28;
                    b32 = i26;
                    b13 = i15;
                    b30 = i24;
                    b14 = i20;
                    b29 = i23;
                }
                b10.close();
                cVar.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = c10;
        }
    }

    @Override // s0.q
    public boolean e() {
        boolean z10 = false;
        y.c c10 = y.c.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.q
    public int f(String str, long j10) {
        this.f13251a.b();
        b0.f a10 = this.f13258h.a();
        a10.H(1, j10);
        if (str == null) {
            a10.u(2);
        } else {
            a10.n(2, str);
        }
        this.f13251a.c();
        try {
            int q10 = a10.q();
            this.f13251a.r();
            return q10;
        } finally {
            this.f13251a.g();
            this.f13258h.f(a10);
        }
    }

    @Override // s0.q
    public List<String> g(String str) {
        y.c c10 = y.c.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.q
    public List<p.b> h(String str) {
        y.c c10 = y.c.c("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "id");
            int b12 = a0.b.b(b10, "state");
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f13249a = b10.getString(b11);
                bVar.f13250b = v.g(b10.getInt(b12));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.q
    public List<p> i(long j10) {
        y.c cVar;
        y.c c10 = y.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c10.H(1, j10);
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "required_network_type");
            int b12 = a0.b.b(b10, "requires_charging");
            int b13 = a0.b.b(b10, "requires_device_idle");
            int b14 = a0.b.b(b10, "requires_battery_not_low");
            int b15 = a0.b.b(b10, "requires_storage_not_low");
            int b16 = a0.b.b(b10, "trigger_content_update_delay");
            int b17 = a0.b.b(b10, "trigger_max_content_delay");
            int b18 = a0.b.b(b10, "content_uri_triggers");
            int b19 = a0.b.b(b10, "id");
            int b20 = a0.b.b(b10, "state");
            int b21 = a0.b.b(b10, "worker_class_name");
            int b22 = a0.b.b(b10, "input_merger_class_name");
            int b23 = a0.b.b(b10, "input");
            int b24 = a0.b.b(b10, "output");
            cVar = c10;
            try {
                int b25 = a0.b.b(b10, "initial_delay");
                int b26 = a0.b.b(b10, "interval_duration");
                int b27 = a0.b.b(b10, "flex_duration");
                int b28 = a0.b.b(b10, "run_attempt_count");
                int b29 = a0.b.b(b10, "backoff_policy");
                int b30 = a0.b.b(b10, "backoff_delay_duration");
                int b31 = a0.b.b(b10, "period_start_time");
                int b32 = a0.b.b(b10, "minimum_retention_duration");
                int b33 = a0.b.b(b10, "schedule_requested_at");
                int b34 = a0.b.b(b10, "run_in_foreground");
                int b35 = a0.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    k0.b bVar = new k0.b();
                    int i13 = b11;
                    bVar.k(v.e(b10.getInt(b11)));
                    bVar.m(b10.getInt(b12) != 0);
                    bVar.n(b10.getInt(b13) != 0);
                    bVar.l(b10.getInt(b14) != 0);
                    bVar.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    bVar.p(b10.getLong(b16));
                    bVar.q(b10.getLong(b17));
                    bVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f13232b = v.g(b10.getInt(b20));
                    pVar.f13234d = b10.getString(b22);
                    pVar.f13235e = androidx.work.b.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f13236f = androidx.work.b.g(b10.getBlob(i16));
                    int i17 = b25;
                    i10 = i16;
                    pVar.f13237g = b10.getLong(i17);
                    int i18 = b22;
                    int i19 = b26;
                    pVar.f13238h = b10.getLong(i19);
                    int i20 = b14;
                    int i21 = b27;
                    pVar.f13239i = b10.getLong(i21);
                    int i22 = b28;
                    pVar.f13241k = b10.getInt(i22);
                    int i23 = b29;
                    pVar.f13242l = v.d(b10.getInt(i23));
                    b27 = i21;
                    int i24 = b30;
                    pVar.f13243m = b10.getLong(i24);
                    int i25 = b31;
                    pVar.f13244n = b10.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    pVar.f13245o = b10.getLong(i26);
                    int i27 = b33;
                    pVar.f13246p = b10.getLong(i27);
                    int i28 = b34;
                    pVar.f13247q = b10.getInt(i28) != 0;
                    int i29 = b35;
                    pVar.f13248r = v.f(b10.getInt(i29));
                    pVar.f13240j = bVar;
                    arrayList.add(pVar);
                    b12 = i14;
                    b35 = i29;
                    b22 = i18;
                    b25 = i17;
                    b26 = i19;
                    b28 = i22;
                    b33 = i27;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i28;
                    b32 = i26;
                    b13 = i15;
                    b30 = i24;
                    b14 = i20;
                    b29 = i23;
                }
                b10.close();
                cVar.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = c10;
        }
    }

    @Override // s0.q
    public k0.s j(String str) {
        y.c c10 = y.c.c("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            return b10.moveToFirst() ? v.g(b10.getInt(0)) : null;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.q
    public List<p> k(int i10) {
        y.c cVar;
        y.c c10 = y.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c10.H(1, i10);
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "required_network_type");
            int b12 = a0.b.b(b10, "requires_charging");
            int b13 = a0.b.b(b10, "requires_device_idle");
            int b14 = a0.b.b(b10, "requires_battery_not_low");
            int b15 = a0.b.b(b10, "requires_storage_not_low");
            int b16 = a0.b.b(b10, "trigger_content_update_delay");
            int b17 = a0.b.b(b10, "trigger_max_content_delay");
            int b18 = a0.b.b(b10, "content_uri_triggers");
            int b19 = a0.b.b(b10, "id");
            int b20 = a0.b.b(b10, "state");
            int b21 = a0.b.b(b10, "worker_class_name");
            int b22 = a0.b.b(b10, "input_merger_class_name");
            int b23 = a0.b.b(b10, "input");
            int b24 = a0.b.b(b10, "output");
            cVar = c10;
            try {
                int b25 = a0.b.b(b10, "initial_delay");
                int b26 = a0.b.b(b10, "interval_duration");
                int b27 = a0.b.b(b10, "flex_duration");
                int b28 = a0.b.b(b10, "run_attempt_count");
                int b29 = a0.b.b(b10, "backoff_policy");
                int b30 = a0.b.b(b10, "backoff_delay_duration");
                int b31 = a0.b.b(b10, "period_start_time");
                int b32 = a0.b.b(b10, "minimum_retention_duration");
                int b33 = a0.b.b(b10, "schedule_requested_at");
                int b34 = a0.b.b(b10, "run_in_foreground");
                int b35 = a0.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    k0.b bVar = new k0.b();
                    int i14 = b11;
                    bVar.k(v.e(b10.getInt(b11)));
                    bVar.m(b10.getInt(b12) != 0);
                    bVar.n(b10.getInt(b13) != 0);
                    bVar.l(b10.getInt(b14) != 0);
                    bVar.o(b10.getInt(b15) != 0);
                    int i15 = b12;
                    int i16 = b13;
                    bVar.p(b10.getLong(b16));
                    bVar.q(b10.getLong(b17));
                    bVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f13232b = v.g(b10.getInt(b20));
                    pVar.f13234d = b10.getString(b22);
                    pVar.f13235e = androidx.work.b.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f13236f = androidx.work.b.g(b10.getBlob(i17));
                    i11 = i17;
                    int i18 = b25;
                    pVar.f13237g = b10.getLong(i18);
                    int i19 = b22;
                    int i20 = b26;
                    pVar.f13238h = b10.getLong(i20);
                    int i21 = b14;
                    int i22 = b27;
                    pVar.f13239i = b10.getLong(i22);
                    int i23 = b28;
                    pVar.f13241k = b10.getInt(i23);
                    int i24 = b29;
                    pVar.f13242l = v.d(b10.getInt(i24));
                    b27 = i22;
                    int i25 = b30;
                    pVar.f13243m = b10.getLong(i25);
                    int i26 = b31;
                    pVar.f13244n = b10.getLong(i26);
                    b31 = i26;
                    int i27 = b32;
                    pVar.f13245o = b10.getLong(i27);
                    int i28 = b33;
                    pVar.f13246p = b10.getLong(i28);
                    int i29 = b34;
                    pVar.f13247q = b10.getInt(i29) != 0;
                    int i30 = b35;
                    pVar.f13248r = v.f(b10.getInt(i30));
                    pVar.f13240j = bVar;
                    arrayList.add(pVar);
                    b35 = i30;
                    b12 = i15;
                    b22 = i19;
                    b25 = i18;
                    b26 = i20;
                    b28 = i23;
                    b33 = i28;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i29;
                    b32 = i27;
                    b13 = i16;
                    b30 = i25;
                    b14 = i21;
                    b29 = i24;
                }
                b10.close();
                cVar.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = c10;
        }
    }

    @Override // s0.q
    public p l(String str) {
        y.c cVar;
        p pVar;
        y.c c10 = y.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "required_network_type");
            int b12 = a0.b.b(b10, "requires_charging");
            int b13 = a0.b.b(b10, "requires_device_idle");
            int b14 = a0.b.b(b10, "requires_battery_not_low");
            int b15 = a0.b.b(b10, "requires_storage_not_low");
            int b16 = a0.b.b(b10, "trigger_content_update_delay");
            int b17 = a0.b.b(b10, "trigger_max_content_delay");
            int b18 = a0.b.b(b10, "content_uri_triggers");
            int b19 = a0.b.b(b10, "id");
            int b20 = a0.b.b(b10, "state");
            int b21 = a0.b.b(b10, "worker_class_name");
            int b22 = a0.b.b(b10, "input_merger_class_name");
            int b23 = a0.b.b(b10, "input");
            int b24 = a0.b.b(b10, "output");
            cVar = c10;
            try {
                int b25 = a0.b.b(b10, "initial_delay");
                int b26 = a0.b.b(b10, "interval_duration");
                int b27 = a0.b.b(b10, "flex_duration");
                int b28 = a0.b.b(b10, "run_attempt_count");
                int b29 = a0.b.b(b10, "backoff_policy");
                int b30 = a0.b.b(b10, "backoff_delay_duration");
                int b31 = a0.b.b(b10, "period_start_time");
                int b32 = a0.b.b(b10, "minimum_retention_duration");
                int b33 = a0.b.b(b10, "schedule_requested_at");
                int b34 = a0.b.b(b10, "run_in_foreground");
                int b35 = a0.b.b(b10, "out_of_quota_policy");
                if (b10.moveToFirst()) {
                    String string = b10.getString(b19);
                    String string2 = b10.getString(b21);
                    k0.b bVar = new k0.b();
                    bVar.k(v.e(b10.getInt(b11)));
                    bVar.m(b10.getInt(b12) != 0);
                    bVar.n(b10.getInt(b13) != 0);
                    bVar.l(b10.getInt(b14) != 0);
                    bVar.o(b10.getInt(b15) != 0);
                    bVar.p(b10.getLong(b16));
                    bVar.q(b10.getLong(b17));
                    bVar.j(v.b(b10.getBlob(b18)));
                    p pVar2 = new p(string, string2);
                    pVar2.f13232b = v.g(b10.getInt(b20));
                    pVar2.f13234d = b10.getString(b22);
                    pVar2.f13235e = androidx.work.b.g(b10.getBlob(b23));
                    pVar2.f13236f = androidx.work.b.g(b10.getBlob(b24));
                    pVar2.f13237g = b10.getLong(b25);
                    pVar2.f13238h = b10.getLong(b26);
                    pVar2.f13239i = b10.getLong(b27);
                    pVar2.f13241k = b10.getInt(b28);
                    pVar2.f13242l = v.d(b10.getInt(b29));
                    pVar2.f13243m = b10.getLong(b30);
                    pVar2.f13244n = b10.getLong(b31);
                    pVar2.f13245o = b10.getLong(b32);
                    pVar2.f13246p = b10.getLong(b33);
                    pVar2.f13247q = b10.getInt(b34) != 0;
                    pVar2.f13248r = v.f(b10.getInt(b35));
                    pVar2.f13240j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b10.close();
                cVar.k();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = c10;
        }
    }

    @Override // s0.q
    public int m(String str) {
        this.f13251a.b();
        b0.f a10 = this.f13257g.a();
        if (str == null) {
            a10.u(1);
        } else {
            a10.n(1, str);
        }
        this.f13251a.c();
        try {
            int q10 = a10.q();
            this.f13251a.r();
            return q10;
        } finally {
            this.f13251a.g();
            this.f13257g.f(a10);
        }
    }

    @Override // s0.q
    public List<String> n(String str) {
        y.c c10 = y.c.c("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.q
    public List<androidx.work.b> o(String str) {
        y.c c10 = y.c.c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c10.u(1);
        } else {
            c10.n(1, str);
        }
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.b.g(b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            c10.k();
        }
    }

    @Override // s0.q
    public int p(String str) {
        this.f13251a.b();
        b0.f a10 = this.f13256f.a();
        if (str == null) {
            a10.u(1);
        } else {
            a10.n(1, str);
        }
        this.f13251a.c();
        try {
            int q10 = a10.q();
            this.f13251a.r();
            return q10;
        } finally {
            this.f13251a.g();
            this.f13256f.f(a10);
        }
    }

    @Override // s0.q
    public void q(String str, long j10) {
        this.f13251a.b();
        b0.f a10 = this.f13255e.a();
        a10.H(1, j10);
        if (str == null) {
            a10.u(2);
        } else {
            a10.n(2, str);
        }
        this.f13251a.c();
        try {
            a10.q();
            this.f13251a.r();
        } finally {
            this.f13251a.g();
            this.f13255e.f(a10);
        }
    }

    @Override // s0.q
    public List<p> r() {
        y.c cVar;
        y.c c10 = y.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "required_network_type");
            int b12 = a0.b.b(b10, "requires_charging");
            int b13 = a0.b.b(b10, "requires_device_idle");
            int b14 = a0.b.b(b10, "requires_battery_not_low");
            int b15 = a0.b.b(b10, "requires_storage_not_low");
            int b16 = a0.b.b(b10, "trigger_content_update_delay");
            int b17 = a0.b.b(b10, "trigger_max_content_delay");
            int b18 = a0.b.b(b10, "content_uri_triggers");
            int b19 = a0.b.b(b10, "id");
            int b20 = a0.b.b(b10, "state");
            int b21 = a0.b.b(b10, "worker_class_name");
            int b22 = a0.b.b(b10, "input_merger_class_name");
            int b23 = a0.b.b(b10, "input");
            int b24 = a0.b.b(b10, "output");
            cVar = c10;
            try {
                int b25 = a0.b.b(b10, "initial_delay");
                int b26 = a0.b.b(b10, "interval_duration");
                int b27 = a0.b.b(b10, "flex_duration");
                int b28 = a0.b.b(b10, "run_attempt_count");
                int b29 = a0.b.b(b10, "backoff_policy");
                int b30 = a0.b.b(b10, "backoff_delay_duration");
                int b31 = a0.b.b(b10, "period_start_time");
                int b32 = a0.b.b(b10, "minimum_retention_duration");
                int b33 = a0.b.b(b10, "schedule_requested_at");
                int b34 = a0.b.b(b10, "run_in_foreground");
                int b35 = a0.b.b(b10, "out_of_quota_policy");
                int i10 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i11 = b19;
                    String string2 = b10.getString(b21);
                    int i12 = b21;
                    k0.b bVar = new k0.b();
                    int i13 = b11;
                    bVar.k(v.e(b10.getInt(b11)));
                    bVar.m(b10.getInt(b12) != 0);
                    bVar.n(b10.getInt(b13) != 0);
                    bVar.l(b10.getInt(b14) != 0);
                    bVar.o(b10.getInt(b15) != 0);
                    int i14 = b12;
                    int i15 = b13;
                    bVar.p(b10.getLong(b16));
                    bVar.q(b10.getLong(b17));
                    bVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f13232b = v.g(b10.getInt(b20));
                    pVar.f13234d = b10.getString(b22);
                    pVar.f13235e = androidx.work.b.g(b10.getBlob(b23));
                    int i16 = i10;
                    pVar.f13236f = androidx.work.b.g(b10.getBlob(i16));
                    i10 = i16;
                    int i17 = b25;
                    pVar.f13237g = b10.getLong(i17);
                    int i18 = b23;
                    int i19 = b26;
                    pVar.f13238h = b10.getLong(i19);
                    int i20 = b14;
                    int i21 = b27;
                    pVar.f13239i = b10.getLong(i21);
                    int i22 = b28;
                    pVar.f13241k = b10.getInt(i22);
                    int i23 = b29;
                    pVar.f13242l = v.d(b10.getInt(i23));
                    b27 = i21;
                    int i24 = b30;
                    pVar.f13243m = b10.getLong(i24);
                    int i25 = b31;
                    pVar.f13244n = b10.getLong(i25);
                    b31 = i25;
                    int i26 = b32;
                    pVar.f13245o = b10.getLong(i26);
                    int i27 = b33;
                    pVar.f13246p = b10.getLong(i27);
                    int i28 = b34;
                    pVar.f13247q = b10.getInt(i28) != 0;
                    int i29 = b35;
                    pVar.f13248r = v.f(b10.getInt(i29));
                    pVar.f13240j = bVar;
                    arrayList.add(pVar);
                    b35 = i29;
                    b12 = i14;
                    b23 = i18;
                    b25 = i17;
                    b26 = i19;
                    b28 = i22;
                    b33 = i27;
                    b19 = i11;
                    b21 = i12;
                    b11 = i13;
                    b34 = i28;
                    b32 = i26;
                    b13 = i15;
                    b30 = i24;
                    b14 = i20;
                    b29 = i23;
                }
                b10.close();
                cVar.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = c10;
        }
    }

    @Override // s0.q
    public List<p> s(int i10) {
        y.c cVar;
        y.c c10 = y.c.c("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c10.H(1, i10);
        this.f13251a.b();
        Cursor b10 = a0.c.b(this.f13251a, c10, false, null);
        try {
            int b11 = a0.b.b(b10, "required_network_type");
            int b12 = a0.b.b(b10, "requires_charging");
            int b13 = a0.b.b(b10, "requires_device_idle");
            int b14 = a0.b.b(b10, "requires_battery_not_low");
            int b15 = a0.b.b(b10, "requires_storage_not_low");
            int b16 = a0.b.b(b10, "trigger_content_update_delay");
            int b17 = a0.b.b(b10, "trigger_max_content_delay");
            int b18 = a0.b.b(b10, "content_uri_triggers");
            int b19 = a0.b.b(b10, "id");
            int b20 = a0.b.b(b10, "state");
            int b21 = a0.b.b(b10, "worker_class_name");
            int b22 = a0.b.b(b10, "input_merger_class_name");
            int b23 = a0.b.b(b10, "input");
            int b24 = a0.b.b(b10, "output");
            cVar = c10;
            try {
                int b25 = a0.b.b(b10, "initial_delay");
                int b26 = a0.b.b(b10, "interval_duration");
                int b27 = a0.b.b(b10, "flex_duration");
                int b28 = a0.b.b(b10, "run_attempt_count");
                int b29 = a0.b.b(b10, "backoff_policy");
                int b30 = a0.b.b(b10, "backoff_delay_duration");
                int b31 = a0.b.b(b10, "period_start_time");
                int b32 = a0.b.b(b10, "minimum_retention_duration");
                int b33 = a0.b.b(b10, "schedule_requested_at");
                int b34 = a0.b.b(b10, "run_in_foreground");
                int b35 = a0.b.b(b10, "out_of_quota_policy");
                int i11 = b24;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.getString(b19);
                    int i12 = b19;
                    String string2 = b10.getString(b21);
                    int i13 = b21;
                    k0.b bVar = new k0.b();
                    int i14 = b11;
                    bVar.k(v.e(b10.getInt(b11)));
                    bVar.m(b10.getInt(b12) != 0);
                    bVar.n(b10.getInt(b13) != 0);
                    bVar.l(b10.getInt(b14) != 0);
                    bVar.o(b10.getInt(b15) != 0);
                    int i15 = b12;
                    int i16 = b13;
                    bVar.p(b10.getLong(b16));
                    bVar.q(b10.getLong(b17));
                    bVar.j(v.b(b10.getBlob(b18)));
                    p pVar = new p(string, string2);
                    pVar.f13232b = v.g(b10.getInt(b20));
                    pVar.f13234d = b10.getString(b22);
                    pVar.f13235e = androidx.work.b.g(b10.getBlob(b23));
                    int i17 = i11;
                    pVar.f13236f = androidx.work.b.g(b10.getBlob(i17));
                    i11 = i17;
                    int i18 = b25;
                    pVar.f13237g = b10.getLong(i18);
                    int i19 = b22;
                    int i20 = b26;
                    pVar.f13238h = b10.getLong(i20);
                    int i21 = b14;
                    int i22 = b27;
                    pVar.f13239i = b10.getLong(i22);
                    int i23 = b28;
                    pVar.f13241k = b10.getInt(i23);
                    int i24 = b29;
                    pVar.f13242l = v.d(b10.getInt(i24));
                    b27 = i22;
                    int i25 = b30;
                    pVar.f13243m = b10.getLong(i25);
                    int i26 = b31;
                    pVar.f13244n = b10.getLong(i26);
                    b31 = i26;
                    int i27 = b32;
                    pVar.f13245o = b10.getLong(i27);
                    int i28 = b33;
                    pVar.f13246p = b10.getLong(i28);
                    int i29 = b34;
                    pVar.f13247q = b10.getInt(i29) != 0;
                    int i30 = b35;
                    pVar.f13248r = v.f(b10.getInt(i30));
                    pVar.f13240j = bVar;
                    arrayList.add(pVar);
                    b35 = i30;
                    b12 = i15;
                    b22 = i19;
                    b25 = i18;
                    b26 = i20;
                    b28 = i23;
                    b33 = i28;
                    b19 = i12;
                    b21 = i13;
                    b11 = i14;
                    b34 = i29;
                    b32 = i27;
                    b13 = i16;
                    b30 = i25;
                    b14 = i21;
                    b29 = i24;
                }
                b10.close();
                cVar.k();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b10.close();
                cVar.k();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = c10;
        }
    }

    @Override // s0.q
    public void t(String str, androidx.work.b bVar) {
        this.f13251a.b();
        b0.f a10 = this.f13254d.a();
        byte[] n10 = androidx.work.b.n(bVar);
        if (n10 == null) {
            a10.u(1);
        } else {
            a10.P(1, n10);
        }
        if (str == null) {
            a10.u(2);
        } else {
            a10.n(2, str);
        }
        this.f13251a.c();
        try {
            a10.q();
            this.f13251a.r();
        } finally {
            this.f13251a.g();
            this.f13254d.f(a10);
        }
    }

    @Override // s0.q
    public int u() {
        this.f13251a.b();
        b0.f a10 = this.f13259i.a();
        this.f13251a.c();
        try {
            int q10 = a10.q();
            this.f13251a.r();
            return q10;
        } finally {
            this.f13251a.g();
            this.f13259i.f(a10);
        }
    }
}
