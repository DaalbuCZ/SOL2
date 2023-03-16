package v0;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class n implements l8.m, l8.p {

    /* renamed from: n  reason: collision with root package name */
    private b f15506n;

    /* renamed from: o  reason: collision with root package name */
    private Activity f15507o;

    /* renamed from: p  reason: collision with root package name */
    private Map<Integer, Integer> f15508p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15509q = false;

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface a {
        void a(int i10);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    interface c {
        void a(boolean z10);
    }

    private int b(Context context) {
        List<String> b10 = o.b(context, 21);
        if (b10 == null || b10.isEmpty()) {
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        }
        return 1;
    }

    private int c(Context context) {
        return Build.VERSION.SDK_INT < 33 ? androidx.core.app.n.f(context).a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    private int e(int i10, Context context) {
        if (i10 == 17) {
            return c(context);
        }
        if (i10 == 21) {
            return b(context);
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return b(context);
        }
        List<String> b10 = o.b(context, i10);
        if (b10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        } else if (b10.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b10 + i10);
            if (i10 != 16 || Build.VERSION.SDK_INT >= 23) {
                if (i10 != 22 || Build.VERSION.SDK_INT >= 30) {
                    return Build.VERSION.SDK_INT < 23 ? 1 : 0;
                }
                return 2;
            }
            return 2;
        } else {
            Object[] objArr = context.getApplicationInfo().targetSdkVersion >= 23 ? 1 : null;
            for (String str : b10) {
                if (objArr != null) {
                    if (i10 == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (Build.VERSION.SDK_INT >= 23) {
                            return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                        }
                        return 2;
                    } else if (i10 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            return 2;
                        }
                        return Environment.isExternalStorageManager() ? 1 : 0;
                    } else if (i10 == 23 && Build.VERSION.SDK_INT >= 23) {
                        return Settings.canDrawOverlays(context) ? 1 : 0;
                    } else {
                        if (i10 == 24 && Build.VERSION.SDK_INT >= 26) {
                            return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                        }
                        if (i10 == 27 && Build.VERSION.SDK_INT >= 23) {
                            return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                        }
                        if (androidx.core.content.a.a(context, str) != 0) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        }
    }

    private void f(String str, int i10) {
        String packageName = this.f15507o.getPackageName();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setData(Uri.parse("package:" + packageName));
        this.f15507o.startActivityForResult(intent, i10);
    }

    private void g(String str, int i10) {
        this.f15507o.startActivityForResult(new Intent(str), i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l8.m
    public boolean a(int i10, int i11, Intent intent) {
        int i12;
        if (i10 == 209 || i10 == 210 || i10 == 211 || i10 == 212 || i10 == 213) {
            boolean z10 = i11 == -1;
            int i13 = 23;
            if (i10 == 209) {
                i13 = 16;
                i12 = z10;
            } else if (i10 == 210) {
                if (Build.VERSION.SDK_INT < 30) {
                    return false;
                }
                i13 = 22;
                i12 = Environment.isExternalStorageManager();
            } else if (i10 == 211) {
                if (Build.VERSION.SDK_INT < 23) {
                    return false;
                }
                i12 = Settings.canDrawOverlays(this.f15507o);
            } else if (i10 == 212) {
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                i13 = 24;
                i12 = this.f15507o.getPackageManager().canRequestPackageInstalls();
            } else if (i10 != 213 || Build.VERSION.SDK_INT < 23) {
                return false;
            } else {
                i13 = 27;
                i12 = ((NotificationManager) this.f15507o.getSystemService("notification")).isNotificationPolicyAccessGranted();
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(i13), Integer.valueOf(i12));
            this.f15506n.a(hashMap);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10, Context context, a aVar) {
        aVar.a(e(i10, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(List<Integer> list, Activity activity, b bVar, v0.b bVar2) {
        int i10;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2;
        int i11;
        int i12;
        String str;
        String str2;
        if (this.f15509q) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else if (activity != null) {
            this.f15506n = bVar;
            this.f15507o = activity;
            this.f15508p = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = list.iterator();
            while (true) {
                int i13 = 1;
                if (!it.hasNext()) {
                    break;
                }
                Integer next = it.next();
                if (e(next.intValue(), activity) != 1) {
                    List<String> b10 = o.b(activity, next.intValue());
                    if (b10 != null && !b10.isEmpty()) {
                        int i14 = Build.VERSION.SDK_INT;
                        if (i14 >= 23 && next.intValue() == 16) {
                            i12 = 209;
                            str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                        } else if (i14 >= 30 && next.intValue() == 22) {
                            i12 = 210;
                            str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                        } else if (i14 >= 23 && next.intValue() == 23) {
                            i12 = 211;
                            str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                        } else if (i14 >= 26 && next.intValue() == 24) {
                            i12 = 212;
                            str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                        } else if (i14 < 23 || next.intValue() != 27) {
                            arrayList.addAll(b10);
                        } else {
                            g("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        }
                        f(str, i12);
                    } else if (!this.f15508p.containsKey(next)) {
                        i13 = 2;
                        if (next.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                            map2 = this.f15508p;
                            i11 = 0;
                        } else {
                            map2 = this.f15508p;
                            i11 = 2;
                        }
                        map2.put(next, i11);
                        if (next.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            map = this.f15508p;
                            i10 = 0;
                        }
                        map = this.f15508p;
                        i10 = Integer.valueOf(i13);
                    }
                } else if (!this.f15508p.containsKey(next)) {
                    map = this.f15508p;
                    i10 = Integer.valueOf(i13);
                }
                map.put(next, i10);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (arrayList.size() > 0) {
                this.f15509q = true;
                androidx.core.app.b.s(activity, strArr, 24);
                return;
            }
            this.f15509q = false;
            if (this.f15508p.size() > 0) {
                bVar.a(this.f15508p);
                return;
            }
            return;
        } else {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        }
        bVar2.a("PermissionHandler.PermissionManager", str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, Activity activity, c cVar, v0.b bVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b10 = o.b(activity, i10);
        if (b10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.a(false);
        } else if (!b10.isEmpty()) {
            cVar.a(androidx.core.app.b.t(activity, b10.get(0)));
        } else {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
            cVar.a(false);
        }
    }

    @Override // l8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Map<Integer, Integer> map;
        int valueOf;
        int g10;
        Map<Integer, Integer> map2;
        int valueOf2;
        if (i10 != 24) {
            this.f15509q = false;
            return false;
        } else if (this.f15508p == null) {
            return false;
        } else {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                int f10 = o.f(str);
                if (f10 != 20) {
                    int i12 = iArr[i11];
                    if (f10 == 7) {
                        if (!this.f15508p.containsKey(7)) {
                            this.f15508p.put(7, Integer.valueOf(o.g(this.f15507o, str, i12)));
                        }
                        if (!this.f15508p.containsKey(14)) {
                            map = this.f15508p;
                            valueOf = 14;
                            map.put(valueOf, Integer.valueOf(o.g(this.f15507o, str, i12)));
                        }
                        o.h(this.f15507o, f10);
                    } else if (f10 == 4) {
                        g10 = o.g(this.f15507o, str, i12);
                        if (!this.f15508p.containsKey(4)) {
                            map2 = this.f15508p;
                            valueOf2 = 4;
                            map2.put(valueOf2, Integer.valueOf(g10));
                        }
                        o.h(this.f15507o, f10);
                    } else if (f10 == 3) {
                        g10 = o.g(this.f15507o, str, i12);
                        if (Build.VERSION.SDK_INT < 29 && !this.f15508p.containsKey(4)) {
                            this.f15508p.put(4, Integer.valueOf(g10));
                        }
                        if (!this.f15508p.containsKey(5)) {
                            this.f15508p.put(5, Integer.valueOf(g10));
                        }
                        map2 = this.f15508p;
                        valueOf2 = Integer.valueOf(f10);
                        map2.put(valueOf2, Integer.valueOf(g10));
                        o.h(this.f15507o, f10);
                    } else {
                        if (!this.f15508p.containsKey(Integer.valueOf(f10))) {
                            map = this.f15508p;
                            valueOf = Integer.valueOf(f10);
                            map.put(valueOf, Integer.valueOf(o.g(this.f15507o, str, i12)));
                        }
                        o.h(this.f15507o, f10);
                    }
                }
            }
            this.f15506n.a(this.f15508p);
            this.f15509q = false;
            return true;
        }
    }
}
