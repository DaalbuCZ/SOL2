package androidx.work.impl;

import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static z.a f2574a = new C0050a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static z.a f2575b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static z.a f2576c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static z.a f2577d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static z.a f2578e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static z.a f2579f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static z.a f2580g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0050a extends z.a {
        C0050a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.m("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.m("DROP TABLE IF EXISTS alarmInfo");
            bVar.m("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    class b extends z.a {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.m("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends z.a {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.m("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    class d extends z.a {
        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    class e extends z.a {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    class f extends z.a {
        f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    class g extends z.a {
        g(int i10, int i11) {
            super(i10, i11);
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends z.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f2581c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f2581c = context;
        }

        @Override // z.a
        public void a(b0.b bVar) {
            if (this.f17124b >= 10) {
                bVar.M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f2581c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends z.a {

        /* renamed from: c  reason: collision with root package name */
        final Context f2582c;

        public i(Context context) {
            super(9, 10);
            this.f2582c = context;
        }

        @Override // z.a
        public void a(b0.b bVar) {
            bVar.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            t0.e.b(this.f2582c, bVar);
            t0.c.a(this.f2582c, bVar);
        }
    }
}
