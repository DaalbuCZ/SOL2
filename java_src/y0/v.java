package y0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
/* loaded from: classes.dex */
public class v implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16724a;

    /* renamed from: b  reason: collision with root package name */
    private final z f16725b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f16726c;

    public v(Context context, z zVar, SharedPreferences sharedPreferences) {
        l3.a(context, "Context must be not null");
        this.f16726c = sharedPreferences;
        this.f16725b = zVar;
        this.f16724a = context;
    }

    private int c(int i10) {
        return i10 / 100;
    }

    private PackageInfo t() {
        return this.f16724a.getPackageManager().getPackageInfo(this.f16724a.getPackageName(), 0);
    }

    @Override // y0.s
    public String a() {
        try {
            return String.valueOf(t().versionName);
        } catch (Exception unused) {
            return "3.1.1";
        }
    }

    @Override // y0.s
    public String b(String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            if (h3.b()) {
                ContentResolver contentResolver = this.f16724a.getContentResolver();
                h3.c();
                string = Settings.Global.getString(contentResolver, "device_name");
            } else {
                string = Settings.System.getString(this.f16724a.getContentResolver(), "device_name");
            }
            return TextUtils.isEmpty(string) ? Build.MANUFACTURER : string;
        }
        return str;
    }

    @Override // y0.s
    public long c() {
        long blockSize;
        long availableBlocks;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return availableBlocks * blockSize;
    }

    @Override // y0.s
    public int d() {
        return this.f16724a.getResources().getConfiguration().orientation;
    }

    @Override // y0.s
    public String e() {
        String string = this.f16726c.getString("bg_device_id", null);
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = this.f16726c.edit();
            edit.putString("bg_device_id", uuid);
            edit.commit();
            return uuid;
        }
        return string;
    }

    @Override // y0.s
    public long f() {
        return this.f16725b.c();
    }

    @Override // y0.s
    public String g() {
        return "Android";
    }

    @Override // y0.s
    public String h() {
        try {
            return String.valueOf(t().versionCode);
        } catch (Exception unused) {
            return String.valueOf(20230306);
        }
    }

    @Override // y0.s
    public float i() {
        int c10;
        Intent registerReceiver = this.f16724a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                c10 = c(intExtra);
                return c10;
            }
        }
        c10 = c(50);
        return c10;
    }

    @Override // y0.s
    public String j() {
        return this.f16724a.getPackageName();
    }

    @Override // y0.s
    public String k() {
        String str;
        try {
            str = Settings.Secure.getString(this.f16724a.getContentResolver(), "android_id");
        } catch (Exception unused) {
            str = null;
        }
        return str != null ? str : "";
    }

    @Override // y0.s
    public String l() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            return "GMT+00:00";
        }
    }

    @Override // y0.s
    public String m() {
        return Locale.getDefault().getLanguage();
    }

    @Override // y0.s
    public long n() {
        return this.f16725b.b();
    }

    @Override // y0.s
    public long o() {
        return this.f16725b.a();
    }

    @Override // y0.s
    public boolean p() {
        return "true".equals(Settings.System.getString(this.f16724a.getContentResolver(), "firebase.test.lab"));
    }

    @Override // y0.s
    public long q() {
        long blockSize;
        long blockCount;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            blockCount = statFs.getBlockCountLong();
        } else {
            blockSize = statFs.getBlockSize();
            blockCount = statFs.getBlockCount();
        }
        return blockCount * blockSize;
    }

    @Override // y0.s
    public String r() {
        return Build.VERSION.RELEASE;
    }

    @Override // y0.s
    public String s() {
        return Build.MODEL;
    }
}
