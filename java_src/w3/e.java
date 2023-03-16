package w3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.k;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: c  reason: collision with root package name */
    private String f16075c;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f16073e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final e f16074f = new e();

    /* renamed from: d  reason: collision with root package name */
    public static final int f16072d = f.f16080a;

    public static e m() {
        return f16074f;
    }

    @Override // w3.f
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // w3.f
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // w3.f
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // w3.f
    public int g(Context context) {
        return super.g(context);
    }

    @Override // w3.f
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // w3.f
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog k(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i10, z3.d0.b(activity, b(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent l(Context context, b bVar) {
        return bVar.x() ? bVar.v() : c(context, bVar.k(), 0);
    }

    public boolean n(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k10 = k(activity, i10, i11, onCancelListener);
        if (k10 == null) {
            return false;
        }
        s(activity, k10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i10) {
        t(context, i10, null, d(context, i10, 0, "n"));
    }

    final Dialog p(Context context, int i10, z3.d0 d0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(z3.a0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = z3.a0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, d0Var);
        }
        String g10 = z3.a0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(z3.a0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final y3.q r(Context context, y3.p pVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        y3.q qVar = new y3.q(pVar);
        context.registerReceiver(qVar, intentFilter);
        qVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return qVar;
        }
        pVar.a();
        qVar.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                l.u1(dialog, onCancelListener).t1(((androidx.fragment.app.d) activity).p(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    final void t(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            u(context);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String f10 = z3.a0.f(context, i10);
            String e10 = z3.a0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) z3.o.i(context.getSystemService("notification"));
            k.e N = new k.e(context).D(true).m(true).t(f10).N(new k.c().x(e10));
            if (d4.i.c(context)) {
                z3.o.l(d4.l.e());
                N.L(context.getApplicationInfo().icon).H(2);
                if (d4.i.d(context)) {
                    N.a(u3.a.common_full_open_on_phone, resources.getString(u3.b.common_open_on_phone), pendingIntent);
                } else {
                    N.r(pendingIntent);
                }
            } else {
                N.L(17301642).P(resources.getString(u3.b.common_google_play_services_notification_ticker)).U(System.currentTimeMillis()).r(pendingIntent).s(e10);
            }
            if (d4.l.h()) {
                z3.o.l(d4.l.h());
                synchronized (f16073e) {
                    str2 = this.f16075c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b10 = z3.a0.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", b10, 4);
                    } else if (!b10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b10);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                N.o(str2);
            }
            Notification c10 = N.c();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                i.f16086b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, c10);
        }
    }

    final void u(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, y3.e eVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p10 = p(activity, i10, z3.d0.c(eVar, b(activity, i10, "d"), 2), onCancelListener);
        if (p10 == null) {
            return false;
        }
        s(activity, p10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, b bVar, int i10) {
        PendingIntent l10;
        if (f4.a.a(context) || (l10 = l(context, bVar)) == null) {
            return false;
        }
        t(context, bVar.k(), null, j4.e.a(context, 0, GoogleApiActivity.a(context, l10, i10, true), j4.e.f10390a | 134217728));
        return true;
    }
}
