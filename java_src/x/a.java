package x;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.app.k;
import androidx.media.b;
import androidx.media.c;
/* loaded from: classes.dex */
public class a extends k.i {

    /* renamed from: e  reason: collision with root package name */
    int[] f16155e = null;

    /* renamed from: f  reason: collision with root package name */
    MediaSessionCompat.Token f16156f;

    /* renamed from: g  reason: collision with root package name */
    boolean f16157g;

    /* renamed from: h  reason: collision with root package name */
    PendingIntent f16158h;

    private RemoteViews A(k.a aVar) {
        boolean z10 = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f1254a.f1216a.getPackageName(), c.notification_media_action);
        int i10 = androidx.media.a.action0;
        remoteViews.setImageViewResource(i10, aVar.e());
        if (!z10) {
            remoteViews.setOnClickPendingIntent(i10, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i10, aVar.j());
        }
        return remoteViews;
    }

    int B(int i10) {
        return i10 <= 3 ? c.notification_template_big_media_narrow : c.notification_template_big_media;
    }

    int C() {
        return c.notification_template_media;
    }

    @Override // androidx.core.app.k.i
    public void b(j jVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            jVar.a().setStyle(x(new Notification.MediaStyle()));
        } else if (this.f16157g) {
            jVar.a().setOngoing(true);
        }
    }

    @Override // androidx.core.app.k.i
    public RemoteViews s(j jVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return y();
    }

    @Override // androidx.core.app.k.i
    public RemoteViews t(j jVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return z();
    }

    Notification.MediaStyle x(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f16155e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f16156f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.b());
        }
        return mediaStyle;
    }

    RemoteViews y() {
        int min = Math.min(this.f1254a.f1217b.size(), 5);
        RemoteViews c10 = c(false, B(min), false);
        c10.removeAllViews(androidx.media.a.media_actions);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                c10.addView(androidx.media.a.media_actions, A(this.f1254a.f1217b.get(i10)));
            }
        }
        if (this.f16157g) {
            int i11 = androidx.media.a.cancel_action;
            c10.setViewVisibility(i11, 0);
            c10.setInt(i11, "setAlpha", this.f1254a.f1216a.getResources().getInteger(b.cancel_button_image_alpha));
            c10.setOnClickPendingIntent(i11, this.f16158h);
        } else {
            c10.setViewVisibility(androidx.media.a.cancel_action, 8);
        }
        return c10;
    }

    RemoteViews z() {
        RemoteViews c10 = c(false, C(), true);
        int size = this.f1254a.f1217b.size();
        int[] iArr = this.f16155e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c10.removeAllViews(androidx.media.a.media_actions);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                if (i10 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i10), Integer.valueOf(size - 1)));
                }
                c10.addView(androidx.media.a.media_actions, A(this.f1254a.f1217b.get(this.f16155e[i10])));
            }
        }
        if (this.f16157g) {
            c10.setViewVisibility(androidx.media.a.end_padder, 8);
            int i11 = androidx.media.a.cancel_action;
            c10.setViewVisibility(i11, 0);
            c10.setOnClickPendingIntent(i11, this.f16158h);
            c10.setInt(i11, "setAlpha", this.f1254a.f1216a.getResources().getInteger(b.cancel_button_image_alpha));
        } else {
            c10.setViewVisibility(androidx.media.a.end_padder, 0);
            c10.setViewVisibility(androidx.media.a.cancel_action, 8);
        }
        return c10;
    }
}
