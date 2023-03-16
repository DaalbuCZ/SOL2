package a1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.b;
import c8.a;
import d8.c;
import java.io.File;
import java.io.IOException;
import l8.j;
import l8.k;
import l8.m;
import l8.p;
/* loaded from: classes.dex */
public class a implements k.c, c8.a, d8.a, p, m {

    /* renamed from: n  reason: collision with root package name */
    private a.b f30n;

    /* renamed from: o  reason: collision with root package name */
    private Context f31o;

    /* renamed from: p  reason: collision with root package name */
    private Activity f32p;

    /* renamed from: q  reason: collision with root package name */
    private k f33q;

    /* renamed from: r  reason: collision with root package name */
    private k.d f34r;

    /* renamed from: s  reason: collision with root package name */
    private String f35s;

    /* renamed from: t  reason: collision with root package name */
    private String f36t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f37u = false;

    private boolean b() {
        return Build.VERSION.SDK_INT >= 26 ? this.f32p.getPackageManager().canRequestPackageInstalls() : d("android.permission.REQUEST_INSTALL_PACKAGES");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x03b7, code lost:
        if (r9.equals("c") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String c(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.a.c(java.lang.String):java.lang.String");
    }

    private boolean d(String str) {
        return androidx.core.content.a.a(this.f32p, str) == 0;
    }

    private boolean e() {
        int i10;
        String str;
        if (this.f35s == null) {
            i10 = -4;
            str = "the file path cannot be null";
        } else if (new File(this.f35s).exists()) {
            return true;
        } else {
            i10 = -2;
            str = "the " + this.f35s + " file does not exists";
        }
        i(i10, str);
        return false;
    }

    private boolean f() {
        String[] strArr = {"/DCIM/", "/Pictures/", "/Movies/", "/Alarms/", "/Audiobooks/", "/Music/", "/Notifications/", "/Podcasts/", "/Ringtones/", "/Download/"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (this.f35s.contains(strArr[i10])) {
                return true;
            }
        }
        return false;
    }

    private void g() {
        if (b()) {
            j();
        } else if (Build.VERSION.SDK_INT >= 26) {
            k();
        } else {
            b.s(this.f32p, new String[]{"android.permission.REQUEST_INSTALL_PACKAGES"}, 33432);
        }
    }

    private boolean h() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            return true ^ new File(this.f35s).getCanonicalPath().startsWith(new File(this.f31o.getApplicationInfo().dataDir).getCanonicalPath());
        } catch (IOException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    private void i(int i10, String str) {
        if (this.f34r == null || this.f37u) {
            return;
        }
        this.f34r.a(b1.a.a(b1.b.a(i10, str)));
        this.f37u = true;
    }

    private void j() {
        Uri fromFile;
        String str;
        if (e()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags("application/vnd.android.package-archive".equals(this.f36t) ? 268435456 : 536870912);
            intent.addCategory("android.intent.category.DEFAULT");
            if (Build.VERSION.SDK_INT >= 24) {
                intent.addFlags(1);
                String packageName = this.f31o.getPackageName();
                Context context = this.f31o;
                fromFile = androidx.core.content.b.f(context, packageName + ".fileProvider.com.crazecoder.openfile", new File(this.f35s));
            } else {
                fromFile = Uri.fromFile(new File(this.f35s));
            }
            intent.setDataAndType(fromFile, this.f36t);
            int i10 = 0;
            try {
                this.f32p.startActivity(intent);
                str = "done";
            } catch (ActivityNotFoundException unused) {
                i10 = -1;
                str = "No APP found to open this file。";
            } catch (Exception unused2) {
                i10 = -4;
                str = "File opened incorrectly。";
            }
            i(i10, str);
        }
    }

    private void k() {
        if (this.f32p == null) {
            return;
        }
        this.f32p.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + this.f32p.getPackageName())), 18);
    }

    @Override // l8.m
    public boolean a(int i10, int i11, Intent intent) {
        if (i10 == 18) {
            if (b()) {
                j();
                return false;
            }
            i(-3, "Permission denied: android.permission.REQUEST_INSTALL_PACKAGES");
            return false;
        }
        return false;
    }

    @Override // d8.a
    public void onAttachedToActivity(c cVar) {
        this.f33q = new k(this.f30n.b(), "open_file");
        this.f31o = this.f30n.a();
        this.f32p = cVar.e();
        this.f33q.e(this);
        cVar.c(this);
        cVar.b(this);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        this.f30n = bVar;
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f33q;
        if (kVar == null) {
            return;
        }
        kVar.e(null);
        this.f33q = null;
        this.f30n = null;
    }

    @Override // l8.k.c
    @SuppressLint({"NewApi"})
    public void onMethodCall(j jVar, k.d dVar) {
        this.f37u = false;
        if (!jVar.f11211a.equals("open_file")) {
            dVar.c();
            this.f37u = true;
            return;
        }
        this.f34r = dVar;
        this.f35s = (String) jVar.a("file_path");
        this.f36t = (!jVar.c("type") || jVar.a("type") == null) ? c(this.f35s) : (String) jVar.a("type");
        if (h()) {
            if (Build.VERSION.SDK_INT >= 30) {
                if (!e()) {
                    return;
                }
                if (!f() && !Environment.isExternalStorageManager()) {
                    i(-3, "Permission denied: android.Manifest.permission.MANAGE_EXTERNAL_STORAGE");
                    return;
                }
            }
            if (!d("android.permission.READ_EXTERNAL_STORAGE")) {
                b.s(this.f32p, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 33432);
                return;
            } else if ("application/vnd.android.package-archive".equals(this.f36t)) {
                g();
                return;
            }
        }
        j();
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }

    @Override // l8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 33432) {
            return false;
        }
        if (d("android.permission.READ_EXTERNAL_STORAGE") && "application/vnd.android.package-archive".equals(this.f36t)) {
            g();
            return false;
        }
        for (String str : strArr) {
            if (!d(str)) {
                i(-3, "Permission denied: " + str);
                return false;
            }
        }
        j();
        return true;
    }
}
