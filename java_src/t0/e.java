package t0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f14435a;

    public e(WorkDatabase workDatabase) {
        this.f14435a = workDatabase;
    }

    public static void b(Context context, b0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.e();
            try {
                bVar.M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                bVar.M("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                bVar.J();
            } finally {
                bVar.d();
            }
        }
    }

    public boolean a() {
        Long a10 = this.f14435a.x().a("reschedule_needed");
        return a10 != null && a10.longValue() == 1;
    }

    public void c(boolean z10) {
        this.f14435a.x().b(new s0.d("reschedule_needed", z10));
    }
}
