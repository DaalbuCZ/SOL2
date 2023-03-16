package vn.hunghd.flutterdownloader;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.k;
import androidx.core.app.n;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import ca.c;
import ca.f;
import ca.i;
import ca.j;
import io.flutter.view.FlutterCallbackInformation;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import k9.g;
import l8.k;
import org.json.JSONException;
import org.json.JSONObject;
import q9.m;
import vn.hunghd.flutterdownloader.DownloadWorker;
import y7.a;
import y8.s;
/* loaded from: classes.dex */
public final class DownloadWorker extends Worker implements k.c {
    private static io.flutter.embedding.engine.a S;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private long L;
    private int M;
    private boolean N;

    /* renamed from: t  reason: collision with root package name */
    private final Pattern f15806t;

    /* renamed from: u  reason: collision with root package name */
    private final Pattern f15807u;

    /* renamed from: v  reason: collision with root package name */
    private final Pattern f15808v;

    /* renamed from: w  reason: collision with root package name */
    private k f15809w;

    /* renamed from: x  reason: collision with root package name */
    private ca.k f15810x;

    /* renamed from: y  reason: collision with root package name */
    private j f15811y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f15812z;
    public static final a O = new a(null);
    private static final String P = DownloadWorker.class.getSimpleName();
    private static final AtomicBoolean Q = new AtomicBoolean(false);
    private static final ArrayDeque<List<Object>> R = new ArrayDeque<>();
    private static final HostnameVerifier T = f.f3275a;

    /* loaded from: classes.dex */
    public static final class a {

        @SuppressLint({"CustomX509TrustManager"})
        /* renamed from: vn.hunghd.flutterdownloader.DownloadWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0227a implements X509TrustManager {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f15813a;

            C0227a(String str) {
                this.f15813a = str;
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                k9.k.e(x509CertificateArr, "chain");
                k9.k.e(str, "authType");
                Log.i(this.f15813a, "checkClientTrusted");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                k9.k.e(x509CertificateArr, "chain");
                k9.k.e(str, "authType");
                Log.i(this.f15813a, "checkServerTrusted");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b() {
            TrustManager[] trustManagerArr = {new C0227a("trustAllHosts")};
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                k9.k.d(sSLContext, "getInstance(\"TLS\")");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15814a;

        static {
            int[] iArr = new int[ca.a.values().length];
            iArr[ca.a.RUNNING.ordinal()] = 1;
            iArr[ca.a.CANCELED.ordinal()] = 2;
            iArr[ca.a.FAILED.ordinal()] = 3;
            iArr[ca.a.PAUSED.ordinal()] = 4;
            iArr[ca.a.COMPLETE.ordinal()] = 5;
            f15814a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(final Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k9.k.e(context, "context");
        k9.k.e(workerParameters, "params");
        this.f15806t = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");
        this.f15807u = Pattern.compile("(?i)\\bfilename\\*=([^']+)'([^']*)'\"?([^\"]+)\"?");
        this.f15808v = Pattern.compile("(?i)\\bfilename=\"?([^\"]+)\"?");
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: ca.d
            @Override // java.lang.Runnable
            public final void run() {
                DownloadWorker.v(DownloadWorker.this, context);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:75|(1:77)(1:261)|78|(17:(7:81|(5:86|(1:88)|(2:93|(26:95|96|97|98|99|(1:101)(1:248)|102|103|104|(1:106)(2:237|(2:242|243)(1:241))|107|108|(2:109|(0)(5:113|(1:115)(1:127)|116|(2:125|126)(2:121|122)|123))|129|(1:131)(1:188)|132|(2:134|(9:136|137|(2:139|(1:141)(1:185))(1:186)|142|(4:144|(1:150)|151|(2:153|(2:170|(6:172|(1:174)(1:182)|175|176|(1:178)(1:181)|179)(1:183))(5:(3:157|158|159)|163|164|165|166)))|184|176|(0)(0)|179))|187|137|(0)(0)|142|(0)|184|176|(0)(0)|179))|258|(0))|259|(0)|(3:90|93|(0))|258|(0))|107|108|(3:109|(2:111|128)(1:189)|123)|129|(0)(0)|132|(0)|187|137|(0)(0)|142|(0)|184|176|(0)(0)|179)|260|99|(0)(0)|102|103|104|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a9, code lost:
        r1 = r0;
        r7 = r11;
        r18 = r12;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03b1, code lost:
        r13 = r0;
        r18 = r11;
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab A[Catch: all -> 0x0399, IOException -> 0x03a1, TryCatch #19 {IOException -> 0x03a1, all -> 0x0399, blocks: (B:98:0x0223, B:99:0x022e, B:101:0x023b, B:103:0x0241, B:107:0x0258, B:109:0x025c, B:113:0x0265, B:106:0x0255, B:116:0x02a4, B:120:0x02ba, B:122:0x02c0, B:124:0x02c9, B:126:0x02ce, B:128:0x02d4, B:130:0x02dd, B:133:0x02e5, B:135:0x02f4, B:137:0x02fa, B:139:0x0300, B:141:0x0306, B:142:0x030d, B:159:0x0332, B:161:0x0346, B:165:0x0358, B:168:0x036d, B:172:0x0392, B:166:0x0363, B:131:0x02e0, B:132:0x02e3, B:119:0x02ab), top: B:294:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c0 A[Catch: all -> 0x0399, IOException -> 0x03a1, TryCatch #19 {IOException -> 0x03a1, all -> 0x0399, blocks: (B:98:0x0223, B:99:0x022e, B:101:0x023b, B:103:0x0241, B:107:0x0258, B:109:0x025c, B:113:0x0265, B:106:0x0255, B:116:0x02a4, B:120:0x02ba, B:122:0x02c0, B:124:0x02c9, B:126:0x02ce, B:128:0x02d4, B:130:0x02dd, B:133:0x02e5, B:135:0x02f4, B:137:0x02fa, B:139:0x0300, B:141:0x0306, B:142:0x030d, B:159:0x0332, B:161:0x0346, B:165:0x0358, B:168:0x036d, B:172:0x0392, B:166:0x0363, B:131:0x02e0, B:132:0x02e3, B:119:0x02ab), top: B:294:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d4 A[Catch: all -> 0x0399, IOException -> 0x03a1, TryCatch #19 {IOException -> 0x03a1, all -> 0x0399, blocks: (B:98:0x0223, B:99:0x022e, B:101:0x023b, B:103:0x0241, B:107:0x0258, B:109:0x025c, B:113:0x0265, B:106:0x0255, B:116:0x02a4, B:120:0x02ba, B:122:0x02c0, B:124:0x02c9, B:126:0x02ce, B:128:0x02d4, B:130:0x02dd, B:133:0x02e5, B:135:0x02f4, B:137:0x02fa, B:139:0x0300, B:141:0x0306, B:142:0x030d, B:159:0x0332, B:161:0x0346, B:165:0x0358, B:168:0x036d, B:172:0x0392, B:166:0x0363, B:131:0x02e0, B:132:0x02e3, B:119:0x02ab), top: B:294:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e3 A[Catch: all -> 0x0399, IOException -> 0x03a1, TryCatch #19 {IOException -> 0x03a1, all -> 0x0399, blocks: (B:98:0x0223, B:99:0x022e, B:101:0x023b, B:103:0x0241, B:107:0x0258, B:109:0x025c, B:113:0x0265, B:106:0x0255, B:116:0x02a4, B:120:0x02ba, B:122:0x02c0, B:124:0x02c9, B:126:0x02ce, B:128:0x02d4, B:130:0x02dd, B:133:0x02e5, B:135:0x02f4, B:137:0x02fa, B:139:0x0300, B:141:0x0306, B:142:0x030d, B:159:0x0332, B:161:0x0346, B:165:0x0358, B:168:0x036d, B:172:0x0392, B:166:0x0363, B:131:0x02e0, B:132:0x02e3, B:119:0x02ab), top: B:294:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f4 A[Catch: all -> 0x0399, IOException -> 0x03a1, TryCatch #19 {IOException -> 0x03a1, all -> 0x0399, blocks: (B:98:0x0223, B:99:0x022e, B:101:0x023b, B:103:0x0241, B:107:0x0258, B:109:0x025c, B:113:0x0265, B:106:0x0255, B:116:0x02a4, B:120:0x02ba, B:122:0x02c0, B:124:0x02c9, B:126:0x02ce, B:128:0x02d4, B:130:0x02dd, B:133:0x02e5, B:135:0x02f4, B:137:0x02fa, B:139:0x0300, B:141:0x0306, B:142:0x030d, B:159:0x0332, B:161:0x0346, B:165:0x0358, B:168:0x036d, B:172:0x0392, B:166:0x0363, B:131:0x02e0, B:132:0x02e3, B:119:0x02ab), top: B:294:0x0223 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0509 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c A[Catch: all -> 0x0479, IOException -> 0x047d, TryCatch #16 {all -> 0x0479, blocks: (B:34:0x00c2, B:36:0x00e3, B:37:0x00e7, B:41:0x00f5, B:42:0x00f8, B:182:0x03b7, B:184:0x03d1, B:186:0x03da, B:189:0x03e2, B:193:0x03fe, B:197:0x041c, B:196:0x0411, B:187:0x03dd, B:188:0x03e0, B:48:0x0107, B:50:0x010d, B:52:0x011c, B:54:0x0126, B:57:0x014f, B:59:0x0160, B:65:0x016c, B:67:0x0173, B:73:0x017f, B:74:0x0198, B:83:0x01ac, B:87:0x01ca, B:86:0x01ba, B:80:0x01a6, B:53:0x0121, B:211:0x043f), top: B:287:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f A[Catch: all -> 0x0479, IOException -> 0x047d, TRY_LEAVE, TryCatch #16 {all -> 0x0479, blocks: (B:34:0x00c2, B:36:0x00e3, B:37:0x00e7, B:41:0x00f5, B:42:0x00f8, B:182:0x03b7, B:184:0x03d1, B:186:0x03da, B:189:0x03e2, B:193:0x03fe, B:197:0x041c, B:196:0x0411, B:187:0x03dd, B:188:0x03e0, B:48:0x0107, B:50:0x010d, B:52:0x011c, B:54:0x0126, B:57:0x014f, B:59:0x0160, B:65:0x016c, B:67:0x0173, B:73:0x017f, B:74:0x0198, B:83:0x01ac, B:87:0x01ca, B:86:0x01ba, B:80:0x01a6, B:53:0x0121, B:211:0x043f), top: B:287:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba A[Catch: all -> 0x0479, IOException -> 0x047d, TryCatch #16 {all -> 0x0479, blocks: (B:34:0x00c2, B:36:0x00e3, B:37:0x00e7, B:41:0x00f5, B:42:0x00f8, B:182:0x03b7, B:184:0x03d1, B:186:0x03da, B:189:0x03e2, B:193:0x03fe, B:197:0x041c, B:196:0x0411, B:187:0x03dd, B:188:0x03e0, B:48:0x0107, B:50:0x010d, B:52:0x011c, B:54:0x0126, B:57:0x014f, B:59:0x0160, B:65:0x016c, B:67:0x0173, B:73:0x017f, B:74:0x0198, B:83:0x01ac, B:87:0x01ca, B:86:0x01ba, B:80:0x01a6, B:53:0x0121, B:211:0x043f), top: B:287:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2 A[Catch: all -> 0x03a8, IOException -> 0x03b0, TRY_ENTER, TryCatch #20 {IOException -> 0x03b0, all -> 0x03a8, blocks: (B:90:0x01d2, B:91:0x01ee, B:93:0x01f2, B:95:0x01f6, B:96:0x020e), top: B:292:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ee A[Catch: all -> 0x03a8, IOException -> 0x03b0, TryCatch #20 {IOException -> 0x03b0, all -> 0x03a8, blocks: (B:90:0x01d2, B:91:0x01ee, B:93:0x01f2, B:95:0x01f6, B:96:0x020e), top: B:292:0x01d0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, int r34) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.A(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void");
    }

    private final String B(String str) {
        String group;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f15806t.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        int length = group.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = k9.k.f(group.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String obj = group.subSequence(i10, length + 1).toString();
        if (obj == null) {
            return null;
        }
        Locale locale = Locale.US;
        k9.k.d(locale, "US");
        String upperCase = obj.toUpperCase(locale);
        k9.k.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r9 = q9.n.L(r9, new java.lang.String[]{";"}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String C(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L63
        L5:
            java.lang.String r1 = ";"
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            java.util.List r9 = q9.d.L(r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L17
            goto L63
        L17:
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r9 = r9.toArray(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            k9.k.c(r9, r2)
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r9 != 0) goto L28
            goto L63
        L28:
            r9 = r9[r1]
            if (r9 != 0) goto L2d
            goto L63
        L2d:
            int r0 = r9.length()
            r2 = 1
            int r0 = r0 - r2
            r3 = r1
            r4 = r3
        L35:
            if (r3 > r0) goto L5a
            if (r4 != 0) goto L3b
            r5 = r3
            goto L3c
        L3b:
            r5 = r0
        L3c:
            char r5 = r9.charAt(r5)
            r6 = 32
            int r5 = k9.k.f(r5, r6)
            if (r5 > 0) goto L4a
            r5 = r2
            goto L4b
        L4a:
            r5 = r1
        L4b:
            if (r4 != 0) goto L54
            if (r5 != 0) goto L51
            r4 = r2
            goto L35
        L51:
            int r3 = r3 + 1
            goto L35
        L54:
            if (r5 != 0) goto L57
            goto L5a
        L57:
            int r0 = r0 + (-1)
            goto L35
        L5a:
            int r0 = r0 + r2
            java.lang.CharSequence r9 = r9.subSequence(r3, r0)
            java.lang.String r0 = r9.toString()
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.hunghd.flutterdownloader.DownloadWorker.C(java.lang.String):java.lang.String");
    }

    private final String D(String str, String str2) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f15808v.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        Matcher matcher2 = this.f15807u.matcher(str);
        if (matcher2.find()) {
            group = matcher2.group(3);
            String group2 = matcher2.group(1);
            if (group2 == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                k9.k.d(locale, "US");
                String upperCase = group2.toUpperCase(locale);
                k9.k.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                str2 = upperCase;
            }
        }
        if (group == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        return URLDecoder.decode(group, str2);
    }

    private final String E(Uri uri) {
        try {
            Cursor query = a().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query == null) {
                h9.a.a(query, null);
                return null;
            }
            String string = !query.moveToFirst() ? null : query.getString(query.getColumnIndexOrThrow("_data"));
            h9.a.a(query, null);
            return string;
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            J("Get a path for a MediaStore failed");
            return null;
        }
    }

    private final int F() {
        try {
            ApplicationInfo applicationInfo = a().getPackageManager().getApplicationInfo(a().getPackageName(), 128);
            k9.k.d(applicationInfo, "applicationContext.packa…ATA\n                    )");
            return applicationInfo.metaData.getInt("vn.hunghd.flutterdownloader.NOTIFICATION_ICON", applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private final boolean G(String str) {
        boolean k10;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        k9.k.d(externalStorageDirectory, "getExternalStorageDirectory()");
        if (str != null) {
            String path = externalStorageDirectory.getPath();
            k9.k.d(path, "externalStorageDir.path");
            k10 = m.k(str, path, false, 2, null);
            return k10;
        }
        return false;
    }

    private final boolean H(String str) {
        boolean k10;
        boolean k11;
        String C = C(str);
        if (C != null) {
            k10 = m.k(C, "image/", false, 2, null);
            if (!k10) {
                k11 = m.k(C, "video", false, 2, null);
                if (!k11) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private final void I(String str) {
        if (this.B) {
            Log.d(P, str);
        }
    }

    private final void J(String str) {
        if (this.B) {
            Log.e(P, str);
        }
    }

    private final void K(ca.a aVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(g().k("callback_handle", 0L)));
        String uuid = f().toString();
        k9.k.d(uuid, "id.toString()");
        arrayList.add(uuid);
        arrayList.add(Integer.valueOf(aVar.ordinal()));
        arrayList.add(Integer.valueOf(i10));
        AtomicBoolean atomicBoolean = Q;
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                new Handler(a().getMainLooper()).post(new Runnable() { // from class: ca.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        DownloadWorker.L(DownloadWorker.this, arrayList);
                    }
                });
            } else {
                R.add(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(DownloadWorker downloadWorker, List list) {
        k9.k.e(downloadWorker, "this$0");
        k9.k.e(list, "$args");
        k kVar = downloadWorker.f15809w;
        if (kVar == null) {
            return;
        }
        kVar.c("", list);
    }

    private final void M(HttpURLConnection httpURLConnection, String str) {
        if (str.length() > 0) {
            I(k9.k.j("Headers = ", str));
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                k9.k.d(keys, "json.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    httpURLConnection.setRequestProperty(next, jSONObject.getString(next));
                }
                httpURLConnection.setDoInput(true);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    private final void N(Context context) {
        if (this.f15812z && Build.VERSION.SDK_INT >= 26) {
            Resources resources = a().getResources();
            String string = resources.getString(i.flutter_downloader_notification_channel_name);
            k9.k.d(string, "res.getString(R.string.f…otification_channel_name)");
            String string2 = resources.getString(i.flutter_downloader_notification_channel_description);
            k9.k.d(string2, "res.getString(R.string.f…tion_channel_description)");
            NotificationChannel notificationChannel = new NotificationChannel("FLUTTER_DOWNLOADER_NOTIFICATION", string, 2);
            notificationChannel.setDescription(string2);
            notificationChannel.setSound(null, null);
            n f10 = n.f(context);
            k9.k.d(f10, "from(context)");
            f10.e(notificationChannel);
        }
    }

    private final long O(HttpURLConnection httpURLConnection, String str, String str2) {
        long length = new File(str2 + ((Object) File.separator) + ((Object) str)).length();
        I("Resume download: Range: bytes=" + length + '-');
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Range", "bytes=" + length + '-');
        httpURLConnection.setDoInput(true);
        return length;
    }

    private final void P(Context context) {
        y7.a h10;
        synchronized (Q) {
            if (S == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("vn.hunghd.downloader.pref", 0);
                k9.k.d(sharedPreferences, "context.getSharedPrefere…PRIVATE\n                )");
                long j10 = sharedPreferences.getLong("callback_dispatcher_handle_key", 0L);
                S = new io.flutter.embedding.engine.a(a(), null, false);
                FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j10);
                if (lookupCallbackInformation == null) {
                    I("Fatal: failed to find callback");
                    return;
                }
                String i10 = x7.a.e().c().i();
                k9.k.d(i10, "instance().flutterLoader().findAppBundlePath()");
                AssetManager assets = a().getAssets();
                io.flutter.embedding.engine.a aVar = S;
                if (aVar != null && (h10 = aVar.h()) != null) {
                    h10.j(new a.b(assets, i10, lookupCallbackInformation));
                }
            }
            s sVar = s.f17099a;
            io.flutter.embedding.engine.a aVar2 = S;
            k9.k.b(aVar2);
            k kVar = new k(aVar2.h(), "vn.hunghd/downloader_background");
            this.f15809w = kVar;
            kVar.e(this);
        }
    }

    private final void Q(Context context, String str, ca.a aVar, int i10, PendingIntent pendingIntent, boolean z10) {
        k.e F;
        int i11;
        String str2;
        K(aVar, i10);
        if (this.f15812z) {
            k.e H = new k.e(context, "FLUTTER_DOWNLOADER_NOTIFICATION").t(str).r(pendingIntent).G(true).m(true).H(-1);
            k9.k.d(H, "Builder(context, CHANNEL…ationCompat.PRIORITY_LOW)");
            int i12 = b.f15814a[aVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    str2 = this.H;
                } else if (i12 == 3) {
                    str2 = this.I;
                } else if (i12 != 4) {
                    if (i12 != 5) {
                        H.I(0, 0, false);
                        F = H.F(false);
                        i11 = F();
                        F.L(i11);
                    }
                    str2 = this.K;
                } else {
                    str2 = this.J;
                }
                H.s(str2).I(0, 0, false);
                H.F(false).L(17301634);
            } else if (i10 <= 0) {
                H.s(this.F).I(0, 0, false);
                F = H.F(false);
                i11 = F();
                F.L(i11);
            } else {
                if (i10 < 100) {
                    H.s(this.G).I(100, i10, false);
                    F = H.F(true);
                    i11 = 17301633;
                    F.L(i11);
                }
                str2 = this.K;
                H.s(str2).I(0, 0, false);
                H.F(false).L(17301634);
            }
            if (System.currentTimeMillis() - this.L < 1000) {
                if (!z10) {
                    I("Update too frequently!!!!, this should be dropped");
                    return;
                }
                I("Update too frequently!!!!, but it is the final update, we should sleep a second to ensure the update call can be processed");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
            I("Update notification: {notificationId: " + this.E + ", title: " + ((Object) str) + ", status: " + aVar + ", progress: " + i10 + '}');
            n.f(context).i(this.E, H.c());
            this.L = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(String str, SSLSession sSLSession) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DownloadWorker downloadWorker, Context context) {
        k9.k.e(downloadWorker, "this$0");
        k9.k.e(context, "$context");
        downloadWorker.P(context);
    }

    private final void w(String str, String str2, String str3) {
        boolean k10;
        boolean k11;
        if (str3 != null && str2 != null && str != null) {
            k10 = m.k(str3, "image/", false, 2, null);
            if (!k10) {
                k11 = m.k(str3, "video", false, 2, null);
                if (k11) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    contentValues.put("_display_name", str);
                    contentValues.put("description", "");
                    contentValues.put("mime_type", str3);
                    contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("_data", str2);
                    I("insert " + contentValues + " to MediaStore");
                    a().getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                    return;
                }
                return;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("title", str);
            contentValues2.put("_display_name", str);
            contentValues2.put("description", "");
            contentValues2.put("mime_type", str3);
            contentValues2.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues2.put("_data", str2);
            I("insert " + contentValues2 + " to MediaStore");
            a().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues2);
        }
    }

    private final void x() {
        int B;
        j jVar = this.f15811y;
        k9.k.b(jVar);
        String uuid = f().toString();
        k9.k.d(uuid, "id.toString()");
        c d10 = jVar.d(uuid);
        if (d10 == null || d10.l() == ca.a.COMPLETE || d10.h()) {
            return;
        }
        String b10 = d10.b();
        if (b10 == null) {
            String o10 = d10.o();
            B = q9.n.B(d10.o(), "/", 0, false, 6, null);
            b10 = o10.substring(B + 1, d10.o().length());
            k9.k.d(b10, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        File file = new File(d10.j() + ((Object) File.separator) + ((Object) b10));
        if (file.exists()) {
            file.delete();
        }
    }

    private final File y(String str, String str2) {
        File file = new File(str2, str);
        try {
            if (file.createNewFile()) {
                return file;
            }
            J("It looks like you are trying to save file in public storage but not setting 'saveInPublicStorage' to 'true'");
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            J("Create a file using java.io API failed ");
            return null;
        }
    }

    private final Uri z(String str, String str2) {
        Uri uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        k9.k.d(uri, "EXTERNAL_CONTENT_URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        try {
            return a().getContentResolver().insert(uri, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
            J("Create a file using MediaStore API failed.");
            return null;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void l() {
        c d10;
        Context a10 = a();
        k9.k.d(a10, "applicationContext");
        ca.k a11 = ca.k.f3288n.a(a10);
        this.f15810x = a11;
        k9.k.b(a11);
        this.f15811y = new j(a11);
        String l10 = g().l("url");
        String l11 = g().l("file_name");
        j jVar = this.f15811y;
        if (jVar == null) {
            d10 = null;
        } else {
            String uuid = f().toString();
            k9.k.d(uuid, "id.toString()");
            d10 = jVar.d(uuid);
        }
        if (d10 == null || d10.l() != ca.a.ENQUEUED) {
            return;
        }
        if (l11 == null) {
            l11 = l10;
        }
        ca.a aVar = ca.a.CANCELED;
        Q(a10, l11, aVar, -1, null, true);
        j jVar2 = this.f15811y;
        if (jVar2 == null) {
            return;
        }
        String uuid2 = f().toString();
        k9.k.d(uuid2, "id.toString()");
        jVar2.g(uuid2, aVar, this.D);
    }

    @Override // l8.k.c
    public void onMethodCall(l8.j jVar, k.d dVar) {
        k9.k.e(jVar, "call");
        k9.k.e(dVar, "result");
        if (!jVar.f11211a.equals("didInitializeDispatcher")) {
            dVar.c();
            return;
        }
        synchronized (Q) {
            while (true) {
                ArrayDeque<List<Object>> arrayDeque = R;
                if (arrayDeque.isEmpty()) {
                    Q.set(true);
                    dVar.a(null);
                    s sVar = s.f17099a;
                } else {
                    l8.k kVar = this.f15809w;
                    if (kVar != null) {
                        kVar.c("", arrayDeque.remove());
                    }
                }
            }
        }
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a q() {
        c d10;
        boolean z10;
        ca.a l10;
        ca.k a10 = ca.k.f3288n.a(a());
        this.f15810x = a10;
        k9.k.b(a10);
        this.f15811y = new j(a10);
        String l11 = g().l("url");
        if (l11 != null) {
            String l12 = g().l("file_name");
            String l13 = g().l("saved_file");
            if (l13 != null) {
                String l14 = g().l("headers");
                if (l14 != null) {
                    boolean h10 = g().h("is_resume", false);
                    int i10 = g().i("timeout", 15000);
                    this.B = g().h("debug", false);
                    this.M = g().i("step", 10);
                    this.C = g().h("ignoreSsl", false);
                    Resources resources = a().getResources();
                    this.F = resources.getString(i.flutter_downloader_notification_started);
                    this.G = resources.getString(i.flutter_downloader_notification_in_progress);
                    this.H = resources.getString(i.flutter_downloader_notification_canceled);
                    this.I = resources.getString(i.flutter_downloader_notification_failed);
                    this.J = resources.getString(i.flutter_downloader_notification_paused);
                    this.K = resources.getString(i.flutter_downloader_notification_complete);
                    j jVar = this.f15811y;
                    if (jVar == null) {
                        d10 = null;
                    } else {
                        String uuid = f().toString();
                        k9.k.d(uuid, "id.toString()");
                        d10 = jVar.d(uuid);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("DownloadWorker{url=");
                    sb.append(l11);
                    sb.append(",filename=");
                    sb.append((Object) l12);
                    sb.append(",savedDir=");
                    sb.append(l13);
                    sb.append(",header=");
                    sb.append(l14);
                    sb.append(",isResume=");
                    sb.append(h10);
                    sb.append(",status=");
                    Object obj = "GONE";
                    if (d10 != null && (l10 = d10.l()) != null) {
                        obj = l10;
                    }
                    sb.append(obj);
                    I(sb.toString());
                    if (d10 == null || d10.l() == ca.a.CANCELED) {
                        ListenableWorker.a c10 = ListenableWorker.a.c();
                        k9.k.d(c10, "success()");
                        return c10;
                    }
                    this.f15812z = g().h("show_notification", false);
                    this.A = g().h("open_file_from_notification", false);
                    this.N = g().h("save_in_public_storage", false);
                    this.E = d10.f();
                    Context a11 = a();
                    k9.k.d(a11, "applicationContext");
                    N(a11);
                    Context a12 = a();
                    k9.k.d(a12, "applicationContext");
                    String str = l12 == null ? l11 : l12;
                    ca.a aVar = ca.a.RUNNING;
                    Q(a12, str, aVar, d10.g(), null, false);
                    j jVar2 = this.f15811y;
                    if (jVar2 != null) {
                        String uuid2 = f().toString();
                        k9.k.d(uuid2, "id.toString()");
                        jVar2.g(uuid2, aVar, d10.g());
                    }
                    if (new File(l13 + ((Object) File.separator) + ((Object) l12)).exists()) {
                        I("exists file for " + ((Object) l12) + "automatic resuming...");
                        z10 = true;
                    } else {
                        z10 = h10;
                    }
                    try {
                        Context a13 = a();
                        k9.k.d(a13, "applicationContext");
                        A(a13, l11, l13, l12, l14, z10, i10);
                        x();
                        this.f15810x = null;
                        this.f15811y = null;
                        ListenableWorker.a c11 = ListenableWorker.a.c();
                        k9.k.d(c11, "{\n            downloadFi…esult.success()\n        }");
                        return c11;
                    } catch (Exception e10) {
                        Context a14 = a();
                        k9.k.d(a14, "applicationContext");
                        String str2 = l12 == null ? l11 : l12;
                        ca.a aVar2 = ca.a.FAILED;
                        Q(a14, str2, aVar2, -1, null, true);
                        j jVar3 = this.f15811y;
                        if (jVar3 != null) {
                            String uuid3 = f().toString();
                            k9.k.d(uuid3, "id.toString()");
                            jVar3.g(uuid3, aVar2, this.D);
                        }
                        e10.printStackTrace();
                        this.f15810x = null;
                        this.f15811y = null;
                        ListenableWorker.a a15 = ListenableWorker.a.a();
                        k9.k.d(a15, "{\n            updateNoti…esult.failure()\n        }");
                        return a15;
                    }
                }
                throw new IllegalArgumentException("Argument 'headers' should not be null");
            }
            throw new IllegalArgumentException("Argument 'saved_file' should not be null");
        }
        throw new IllegalArgumentException("Argument 'url' should not be null");
    }
}
