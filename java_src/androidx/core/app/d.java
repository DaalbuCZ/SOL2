package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    public static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.a(alarmManager, i10, j10, pendingIntent);
        } else {
            alarmManager.set(i10, j10, pendingIntent);
        }
    }

    public static void b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.b(alarmManager, i10, j10, pendingIntent);
        } else {
            a(alarmManager, i10, j10, pendingIntent);
        }
    }
}
