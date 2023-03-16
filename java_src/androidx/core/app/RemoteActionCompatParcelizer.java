package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1146a = (IconCompat) aVar.v(remoteActionCompat.f1146a, 1);
        remoteActionCompat.f1147b = aVar.l(remoteActionCompat.f1147b, 2);
        remoteActionCompat.f1148c = aVar.l(remoteActionCompat.f1148c, 3);
        remoteActionCompat.f1149d = (PendingIntent) aVar.r(remoteActionCompat.f1149d, 4);
        remoteActionCompat.f1150e = aVar.h(remoteActionCompat.f1150e, 5);
        remoteActionCompat.f1151f = aVar.h(remoteActionCompat.f1151f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1146a, 1);
        aVar.D(remoteActionCompat.f1147b, 2);
        aVar.D(remoteActionCompat.f1148c, 3);
        aVar.H(remoteActionCompat.f1149d, 4);
        aVar.z(remoteActionCompat.f1150e, 5);
        aVar.z(remoteActionCompat.f1151f, 6);
    }
}
