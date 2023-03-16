package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class b extends androidx.core.content.a {

    /* renamed from: d  reason: collision with root package name */
    private static e f1153d;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String[] f1154n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Activity f1155o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f1156p;

        a(String[] strArr, Activity activity, int i10) {
            this.f1154n = strArr;
            this.f1155o = activity;
            this.f1156p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f1154n.length];
            PackageManager packageManager = this.f1155o.getPackageManager();
            String packageName = this.f1155o.getPackageName();
            int length = this.f1154n.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f1154n[i10], packageName);
            }
            ((d) this.f1155o).onRequestPermissionsResult(this.f1156p, this.f1154n, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0015b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(Activity activity, int i10, int i11, Intent intent);

        boolean b(Activity activity, String[] strArr, int i10);
    }

    /* loaded from: classes.dex */
    public interface f {
        void b(int i10);
    }

    public static void o(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0015b.a(activity);
        } else {
            activity.finish();
        }
    }

    public static e p() {
        return f1153d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Activity activity) {
        if (activity.isFinishing() || androidx.core.app.c.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void r(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.q(activity);
                }
            });
        }
    }

    public static void s(Activity activity, String[] strArr, int i10) {
        e eVar = f1153d;
        if (eVar == null || !eVar.b(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!androidx.core.os.a.d() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof f) {
                    ((f) activity).b(i10);
                }
                c.b(activity, strArr, i10);
            } else if (activity instanceof d) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    public static boolean t(Activity activity, String str) {
        if ((androidx.core.os.a.d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) && Build.VERSION.SDK_INT >= 23) {
            return c.c(activity, str);
        }
        return false;
    }

    public static void u(Activity activity, Intent intent, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0015b.b(activity, intent, i10, bundle);
        } else {
            activity.startActivityForResult(intent, i10);
        }
    }
}
