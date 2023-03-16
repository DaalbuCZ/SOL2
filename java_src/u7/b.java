package u7;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import l8.j;
import l8.k;
/* loaded from: classes.dex */
public final class b implements k.c {

    /* renamed from: n  reason: collision with root package name */
    private final PackageManager f15470n;

    /* renamed from: o  reason: collision with root package name */
    private final WindowManager f15471o;

    public b(PackageManager packageManager, WindowManager windowManager) {
        k9.k.e(packageManager, "packageManager");
        k9.k.e(windowManager, "windowManager");
        this.f15470n = packageManager;
        this.f15471o = windowManager;
    }

    private final List<String> a() {
        int i10;
        FeatureInfo[] systemAvailableFeatures = this.f15470n.getSystemAvailableFeatures();
        k9.k.d(systemAvailableFeatures, "packageManager.systemAvailableFeatures");
        ArrayList<FeatureInfo> arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (!(featureInfo.name == null)) {
                arrayList.add(featureInfo);
            }
        }
        i10 = z8.k.i(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(i10);
        for (FeatureInfo featureInfo2 : arrayList) {
            arrayList2.add(featureInfo2.name);
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean b() {
        /*
            r7 = this;
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            k9.k.d(r0, r1)
            java.lang.String r1 = "generic"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r0 = q9.d.k(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L1f
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r5 = "DEVICE"
            k9.k.d(r0, r5)
            boolean r0 = q9.d.k(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Ld4
        L1f:
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r5 = "FINGERPRINT"
            k9.k.d(r0, r5)
            boolean r1 = q9.d.k(r0, r1, r2, r3, r4)
            if (r1 != 0) goto Ld4
            k9.k.d(r0, r5)
            java.lang.String r1 = "unknown"
            boolean r0 = q9.d.k(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            k9.k.d(r0, r1)
            java.lang.String r5 = "goldfish"
            boolean r5 = q9.d.n(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r1 = "ranchu"
            boolean r0 = q9.d.n(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            k9.k.d(r0, r1)
            java.lang.String r5 = "google_sdk"
            boolean r6 = q9.d.n(r0, r5, r2, r3, r4)
            if (r6 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r6 = "Emulator"
            boolean r6 = q9.d.n(r0, r6, r2, r3, r4)
            if (r6 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = q9.d.n(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            k9.k.d(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = q9.d.n(r0, r1, r2, r3, r4)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = android.os.Build.PRODUCT
            java.lang.String r1 = "PRODUCT"
            k9.k.d(r0, r1)
            java.lang.String r6 = "sdk_google"
            boolean r6 = q9.d.n(r0, r6, r2, r3, r4)
            if (r6 != 0) goto Ld4
            k9.k.d(r0, r1)
            boolean r5 = q9.d.n(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r5 = "sdk"
            boolean r5 = q9.d.n(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r5 = "sdk_x86"
            boolean r5 = q9.d.n(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r5 = "vbox86p"
            boolean r5 = q9.d.n(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r5 = "emulator"
            boolean r5 = q9.d.n(r0, r5, r2, r3, r4)
            if (r5 != 0) goto Ld4
            k9.k.d(r0, r1)
            java.lang.String r1 = "simulator"
            boolean r0 = q9.d.n(r0, r1, r2, r3, r4)
            if (r0 == 0) goto Ld5
        Ld4:
            r2 = 1
        Ld5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.b.b():boolean");
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        List d10;
        List d11;
        List d12;
        String str;
        String str2;
        List f10;
        List f11;
        k9.k.e(jVar, "call");
        k9.k.e(dVar, "result");
        if (!jVar.f11211a.equals("getDeviceInfo")) {
            dVar.c();
            return;
        }
        HashMap hashMap = new HashMap();
        String str3 = Build.BOARD;
        k9.k.d(str3, "BOARD");
        hashMap.put("board", str3);
        String str4 = Build.BOOTLOADER;
        k9.k.d(str4, "BOOTLOADER");
        hashMap.put("bootloader", str4);
        String str5 = Build.BRAND;
        k9.k.d(str5, "BRAND");
        hashMap.put("brand", str5);
        String str6 = Build.DEVICE;
        k9.k.d(str6, "DEVICE");
        hashMap.put("device", str6);
        String str7 = Build.DISPLAY;
        k9.k.d(str7, "DISPLAY");
        hashMap.put("display", str7);
        String str8 = Build.FINGERPRINT;
        k9.k.d(str8, "FINGERPRINT");
        hashMap.put("fingerprint", str8);
        String str9 = Build.HARDWARE;
        k9.k.d(str9, "HARDWARE");
        hashMap.put("hardware", str9);
        String str10 = Build.HOST;
        k9.k.d(str10, "HOST");
        hashMap.put("host", str10);
        String str11 = Build.ID;
        k9.k.d(str11, "ID");
        hashMap.put("id", str11);
        String str12 = Build.MANUFACTURER;
        k9.k.d(str12, "MANUFACTURER");
        hashMap.put("manufacturer", str12);
        String str13 = Build.MODEL;
        k9.k.d(str13, "MODEL");
        hashMap.put("model", str13);
        String str14 = Build.PRODUCT;
        k9.k.d(str14, "PRODUCT");
        hashMap.put("product", str14);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
            k9.k.d(strArr, "SUPPORTED_32_BIT_ABIS");
            f10 = z8.j.f(Arrays.copyOf(strArr, strArr.length));
            hashMap.put("supported32BitAbis", f10);
            String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
            k9.k.d(strArr2, "SUPPORTED_64_BIT_ABIS");
            f11 = z8.j.f(Arrays.copyOf(strArr2, strArr2.length));
            hashMap.put("supported64BitAbis", f11);
            String[] strArr3 = Build.SUPPORTED_ABIS;
            k9.k.d(strArr3, "SUPPORTED_ABIS");
            d12 = z8.j.f(Arrays.copyOf(strArr3, strArr3.length));
        } else {
            d10 = z8.j.d();
            hashMap.put("supported32BitAbis", d10);
            d11 = z8.j.d();
            hashMap.put("supported64BitAbis", d11);
            d12 = z8.j.d();
        }
        hashMap.put("supportedAbis", d12);
        String str15 = Build.TAGS;
        k9.k.d(str15, "TAGS");
        hashMap.put("tags", str15);
        String str16 = Build.TYPE;
        k9.k.d(str16, "TYPE");
        hashMap.put("type", str16);
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!b()));
        hashMap.put("systemFeatures", a());
        HashMap hashMap2 = new HashMap();
        if (i10 >= 23) {
            String str17 = Build.VERSION.BASE_OS;
            k9.k.d(str17, "BASE_OS");
            hashMap2.put("baseOS", str17);
            hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
            String str18 = Build.VERSION.SECURITY_PATCH;
            k9.k.d(str18, "SECURITY_PATCH");
            hashMap2.put("securityPatch", str18);
        }
        String str19 = Build.VERSION.CODENAME;
        k9.k.d(str19, "CODENAME");
        hashMap2.put("codename", str19);
        String str20 = Build.VERSION.INCREMENTAL;
        k9.k.d(str20, "INCREMENTAL");
        hashMap2.put("incremental", str20);
        String str21 = Build.VERSION.RELEASE;
        k9.k.d(str21, "RELEASE");
        hashMap2.put("release", str21);
        hashMap2.put("sdkInt", Integer.valueOf(i10));
        hashMap.put("version", hashMap2);
        Display defaultDisplay = this.f15471o.getDefaultDisplay();
        k9.k.d(defaultDisplay, "windowManager.defaultDisplay");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (i10 >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("widthPx", Double.valueOf(displayMetrics.widthPixels));
        hashMap3.put("heightPx", Double.valueOf(displayMetrics.heightPixels));
        hashMap3.put("xDpi", Float.valueOf(displayMetrics.xdpi));
        hashMap3.put("yDpi", Float.valueOf(displayMetrics.ydpi));
        hashMap.put("displayMetrics", hashMap3);
        if (i10 >= 26) {
            try {
                str = Build.getSerial();
            } catch (SecurityException unused) {
                str = "unknown";
            }
            str2 = "try {\n                  …UNKNOWN\n                }";
        } else {
            str = Build.SERIAL;
            str2 = "SERIAL";
        }
        k9.k.d(str, str2);
        hashMap.put("serialNumber", str);
        dVar.a(hashMap);
    }
}
