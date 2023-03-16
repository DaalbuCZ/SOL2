package v7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import c8.a;
import java.security.MessageDigest;
import java.util.HashMap;
import k9.g;
import l8.j;
import l8.k;
/* loaded from: classes.dex */
public final class a implements k.c, c8.a {

    /* renamed from: p  reason: collision with root package name */
    public static final C0225a f15730p = new C0225a(null);

    /* renamed from: n  reason: collision with root package name */
    private Context f15731n;

    /* renamed from: o  reason: collision with root package name */
    private k f15732o;

    /* renamed from: v7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0225a {
        private C0225a() {
        }

        public /* synthetic */ C0225a(g gVar) {
            this();
        }
    }

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = bArr[i10] & 255;
            int i13 = i10 * 2;
            cArr2[i13] = cArr[i12 >>> 4];
            cArr2[i13 + 1] = cArr[i12 & 15];
            i10 = i11;
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
        if ((r5.length == 0) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String b(android.content.pm.PackageManager r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> La1
            r2 = 28
            if (r1 < r2) goto L5c
            android.content.Context r1 = r4.f15731n     // Catch: java.lang.Throwable -> La1
            k9.k.b(r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> La1
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> La1
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch: java.lang.Throwable -> La1
            if (r5 != 0) goto L1b
            return r0
        L1b:
            boolean r1 = r5.hasMultipleSigners()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L3e
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.apkContentsSigners"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r5 = z8.b.i(r5)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch: java.lang.Throwable -> La1
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.apkContentsS…ers.first().toByteArray()"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r4.d(r5)     // Catch: java.lang.Throwable -> La1
            goto L5a
        L3e:
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.signingCertificateHistory"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r5 = z8.b.i(r5)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch: java.lang.Throwable -> La1
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signingInfo.signingCerti…ory.first().toByteArray()"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r4.d(r5)     // Catch: java.lang.Throwable -> La1
        L5a:
            r0 = r5
            goto La1
        L5c:
            android.content.Context r1 = r4.f15731n     // Catch: java.lang.Throwable -> La1
            k9.k.b(r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> La1
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature[] r5 = r5.signatures     // Catch: java.lang.Throwable -> La1
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L79
            int r3 = r5.length     // Catch: java.lang.Throwable -> La1
            if (r3 != 0) goto L76
            r3 = r2
            goto L77
        L76:
            r3 = r1
        L77:
            if (r3 == 0) goto L7a
        L79:
            r1 = r2
        L7a:
            if (r1 != 0) goto La1
            java.lang.String r1 = "packageInfo.signatures"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r1 = z8.b.i(r5)     // Catch: java.lang.Throwable -> La1
            if (r1 != 0) goto L88
            goto La1
        L88:
            java.lang.String r1 = "signatures"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r5 = z8.b.i(r5)     // Catch: java.lang.Throwable -> La1
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch: java.lang.Throwable -> La1
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "signatures.first().toByteArray()"
            k9.k.d(r5, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r4.d(r5)     // Catch: java.lang.Throwable -> La1
            goto L5a
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.a.b(android.content.pm.PackageManager):java.lang.String");
    }

    private final long c(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    private final String d(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        k9.k.d(digest, "hashText");
        return a(digest);
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        this.f15731n = bVar.a();
        k kVar = new k(bVar.b(), "dev.fluttercommunity.plus/package_info");
        this.f15732o = kVar;
        k9.k.b(kVar);
        kVar.e(this);
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k9.k.e(bVar, "binding");
        this.f15731n = null;
        k kVar = this.f15732o;
        k9.k.b(kVar);
        kVar.e(null);
        this.f15732o = null;
    }

    @Override // l8.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        k9.k.e(jVar, "call");
        k9.k.e(dVar, "result");
        try {
            if (!k9.k.a(jVar.f11211a, "getAll")) {
                dVar.c();
                return;
            }
            Context context = this.f15731n;
            k9.k.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f15731n;
            k9.k.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            k9.k.d(packageManager, "packageManager");
            String b10 = b(packageManager);
            Context context3 = this.f15731n;
            k9.k.b(context3);
            String installerPackageName = packageManager.getInstallerPackageName(context3.getPackageName());
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context4 = this.f15731n;
            k9.k.b(context4);
            hashMap.put("packageName", context4.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            k9.k.d(packageInfo, "info");
            hashMap.put("buildNumber", String.valueOf(c(packageInfo)));
            if (b10 != null) {
                hashMap.put("buildSignature", b10);
            }
            if (installerPackageName != null) {
                hashMap.put("installerStore", installerPackageName);
            }
            dVar.a(hashMap);
        } catch (PackageManager.NameNotFoundException e10) {
            dVar.b("Name not found", e10.getMessage(), null);
        }
    }
}
