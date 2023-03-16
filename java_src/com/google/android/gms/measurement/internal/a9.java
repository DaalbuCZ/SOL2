package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ce;
import com.google.android.gms.internal.measurement.je;
import com.google.android.gms.internal.measurement.xc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class a9 implements e5 {
    private static volatile a9 F;
    private final Map A;
    private final Map B;
    private o6 C;
    private String D;

    /* renamed from: a  reason: collision with root package name */
    private final d4 f4383a;

    /* renamed from: b  reason: collision with root package name */
    private final k3 f4384b;

    /* renamed from: c  reason: collision with root package name */
    private l f4385c;

    /* renamed from: d  reason: collision with root package name */
    private m3 f4386d;

    /* renamed from: e  reason: collision with root package name */
    private o8 f4387e;

    /* renamed from: f  reason: collision with root package name */
    private b f4388f;

    /* renamed from: g  reason: collision with root package name */
    private final c9 f4389g;

    /* renamed from: h  reason: collision with root package name */
    private n6 f4390h;

    /* renamed from: i  reason: collision with root package name */
    private x7 f4391i;

    /* renamed from: j  reason: collision with root package name */
    private final r8 f4392j;

    /* renamed from: k  reason: collision with root package name */
    private v3 f4393k;

    /* renamed from: l  reason: collision with root package name */
    private final j4 f4394l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4396n;

    /* renamed from: o  reason: collision with root package name */
    long f4397o;

    /* renamed from: p  reason: collision with root package name */
    private List f4398p;

    /* renamed from: q  reason: collision with root package name */
    private int f4399q;

    /* renamed from: r  reason: collision with root package name */
    private int f4400r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f4401s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4402t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4403u;

    /* renamed from: v  reason: collision with root package name */
    private FileLock f4404v;

    /* renamed from: w  reason: collision with root package name */
    private FileChannel f4405w;

    /* renamed from: x  reason: collision with root package name */
    private List f4406x;

    /* renamed from: y  reason: collision with root package name */
    private List f4407y;

    /* renamed from: z  reason: collision with root package name */
    private long f4408z;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4395m = false;
    private final h9 E = new x8(this);

    a9(b9 b9Var, j4 j4Var) {
        z3.o.i(b9Var);
        this.f4394l = j4.H(b9Var.f4426a, null, null);
        this.f4408z = -1L;
        this.f4392j = new r8(this);
        c9 c9Var = new c9(this);
        c9Var.j();
        this.f4389g = c9Var;
        k3 k3Var = new k3(this);
        k3Var.j();
        this.f4384b = k3Var;
        d4 d4Var = new d4(this);
        d4Var.j();
        this.f4383a = d4Var;
        this.A = new HashMap();
        this.B = new HashMap();
        b().z(new s8(this, b9Var));
    }

    static final void G(com.google.android.gms.internal.measurement.r4 r4Var, int i10, String str) {
        List N = r4Var.N();
        for (int i11 = 0; i11 < N.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.w4) N.get(i11)).K())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.v4 I = com.google.android.gms.internal.measurement.w4.I();
        I.H("_err");
        I.G(Long.valueOf(i10).longValue());
        com.google.android.gms.internal.measurement.v4 I2 = com.google.android.gms.internal.measurement.w4.I();
        I2.H("_ev");
        I2.I(str);
        r4Var.D((com.google.android.gms.internal.measurement.w4) I.q());
        r4Var.D((com.google.android.gms.internal.measurement.w4) I2.q());
    }

    static final void H(com.google.android.gms.internal.measurement.r4 r4Var, String str) {
        List N = r4Var.N();
        for (int i10 = 0; i10 < N.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.w4) N.get(i10)).K())) {
                r4Var.F(i10);
                return;
            }
        }
    }

    private final n9 I(String str) {
        d3 q10;
        String str2;
        String str3;
        String str4 = str;
        l lVar = this.f4385c;
        R(lVar);
        m5 R = lVar.R(str4);
        if (R == null || TextUtils.isEmpty(R.g0())) {
            q10 = d().q();
            str2 = "No app data available; dropping";
            str3 = str4;
        } else {
            Boolean J = J(R);
            if (J == null || J.booleanValue()) {
                String i02 = R.i0();
                String g02 = R.g0();
                long L = R.L();
                String f02 = R.f0();
                long W = R.W();
                long T = R.T();
                boolean J2 = R.J();
                String h02 = R.h0();
                R.A();
                return new n9(str, i02, g02, L, f02, W, T, (String) null, J2, false, h02, 0L, 0L, 0, R.I(), false, R.b0(), R.a0(), R.U(), R.c(), (String) null, V(str).h(), "", (String) null);
            }
            q10 = d().r();
            str2 = "App version does not match; dropping. appId";
            str3 = f3.z(str);
        }
        q10.b(str2, str3);
        return null;
    }

    private final Boolean J(m5 m5Var) {
        try {
            if (m5Var.L() != -2147483648L) {
                if (m5Var.L() == f4.c.a(this.f4394l.c()).e(m5Var.d0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = f4.c.a(this.f4394l.c()).e(m5Var.d0(), 0).versionName;
                String g02 = m5Var.g0();
                if (g02 != null && g02.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void K() {
        b().h();
        if (this.f4401s || this.f4402t || this.f4403u) {
            d().v().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f4401s), Boolean.valueOf(this.f4402t), Boolean.valueOf(this.f4403u));
            return;
        }
        d().v().a("Stopping uploading service(s)");
        List<Runnable> list = this.f4398p;
        if (list == null) {
            return;
        }
        for (Runnable runnable : list) {
            runnable.run();
        }
        ((List) z3.o.i(this.f4398p)).clear();
    }

    private final void L(com.google.android.gms.internal.measurement.c5 c5Var, long j10, boolean z10) {
        String str = true != z10 ? "_lte" : "_se";
        l lVar = this.f4385c;
        R(lVar);
        f9 X = lVar.X(c5Var.o0(), str);
        f9 f9Var = (X == null || X.f4542e == null) ? new f9(c5Var.o0(), "auto", str, e().a(), Long.valueOf(j10)) : new f9(c5Var.o0(), "auto", str, e().a(), Long.valueOf(((Long) X.f4542e).longValue() + j10));
        com.google.android.gms.internal.measurement.l5 H = com.google.android.gms.internal.measurement.m5.H();
        H.D(str);
        H.E(e().a());
        H.C(((Long) f9Var.f4542e).longValue());
        com.google.android.gms.internal.measurement.m5 m5Var = (com.google.android.gms.internal.measurement.m5) H.q();
        int w10 = c9.w(c5Var, str);
        if (w10 >= 0) {
            c5Var.l0(w10, m5Var);
        } else {
            c5Var.E0(m5Var);
        }
        if (j10 > 0) {
            l lVar2 = this.f4385c;
            R(lVar2);
            lVar2.x(f9Var);
            d().v().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", f9Var.f4542e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void M() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a9.M():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:372:0x0b76, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.h.i() + r8)) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a7 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046b A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c5 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x081f A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0868 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0888 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0909 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0932 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0b66 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0bed A[Catch: all -> 0x0d0d, TRY_LEAVE, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0c09 A[Catch: SQLiteException -> 0x0c21, all -> 0x0d0d, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0c21, blocks: (B:379:0x0bfa, B:381:0x0c09), top: B:418:0x0bfa, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0ca1 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean N(java.lang.String r42, long r43) {
        /*
            Method dump skipped, instructions count: 3352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a9.N(java.lang.String, long):boolean");
    }

    private final boolean O() {
        b().h();
        g();
        l lVar = this.f4385c;
        R(lVar);
        if (lVar.r()) {
            return true;
        }
        l lVar2 = this.f4385c;
        R(lVar2);
        return !TextUtils.isEmpty(lVar2.Z());
    }

    private final boolean P(com.google.android.gms.internal.measurement.r4 r4Var, com.google.android.gms.internal.measurement.r4 r4Var2) {
        z3.o.a("_e".equals(r4Var.M()));
        R(this.f4389g);
        com.google.android.gms.internal.measurement.w4 n10 = c9.n((com.google.android.gms.internal.measurement.s4) r4Var.q(), "_sc");
        String L = n10 == null ? null : n10.L();
        R(this.f4389g);
        com.google.android.gms.internal.measurement.w4 n11 = c9.n((com.google.android.gms.internal.measurement.s4) r4Var2.q(), "_pc");
        String L2 = n11 != null ? n11.L() : null;
        if (L2 == null || !L2.equals(L)) {
            return false;
        }
        z3.o.a("_e".equals(r4Var.M()));
        R(this.f4389g);
        com.google.android.gms.internal.measurement.w4 n12 = c9.n((com.google.android.gms.internal.measurement.s4) r4Var.q(), "_et");
        if (n12 == null || !n12.Z() || n12.H() <= 0) {
            return true;
        }
        long H = n12.H();
        R(this.f4389g);
        com.google.android.gms.internal.measurement.w4 n13 = c9.n((com.google.android.gms.internal.measurement.s4) r4Var2.q(), "_et");
        if (n13 != null && n13.H() > 0) {
            H += n13.H();
        }
        R(this.f4389g);
        c9.P(r4Var2, "_et", Long.valueOf(H));
        R(this.f4389g);
        c9.P(r4Var, "_fr", 1L);
        return true;
    }

    private static final boolean Q(n9 n9Var) {
        return (TextUtils.isEmpty(n9Var.f4818o) && TextUtils.isEmpty(n9Var.D)) ? false : true;
    }

    private static final q8 R(q8 q8Var) {
        if (q8Var != null) {
            if (q8Var.k()) {
                return q8Var;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(q8Var.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static a9 f0(Context context) {
        z3.o.i(context);
        z3.o.i(context.getApplicationContext());
        if (F == null) {
            synchronized (a9.class) {
                if (F == null) {
                    F = new a9((b9) z3.o.i(new b9(context)), null);
                }
            }
        }
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void k0(a9 a9Var, b9 b9Var) {
        a9Var.b().h();
        a9Var.f4393k = new v3(a9Var);
        l lVar = new l(a9Var);
        lVar.j();
        a9Var.f4385c = lVar;
        a9Var.U().z((g) z3.o.i(a9Var.f4383a));
        x7 x7Var = new x7(a9Var);
        x7Var.j();
        a9Var.f4391i = x7Var;
        b bVar = new b(a9Var);
        bVar.j();
        a9Var.f4388f = bVar;
        n6 n6Var = new n6(a9Var);
        n6Var.j();
        a9Var.f4390h = n6Var;
        o8 o8Var = new o8(a9Var);
        o8Var.j();
        a9Var.f4387e = o8Var;
        a9Var.f4386d = new m3(a9Var);
        if (a9Var.f4399q != a9Var.f4400r) {
            a9Var.d().r().c("Not all upload components initialized", Integer.valueOf(a9Var.f4399q), Integer.valueOf(a9Var.f4400r));
        }
        a9Var.f4395m = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(String str, p4.b bVar) {
        b().h();
        g();
        this.A.put(str, bVar);
        l lVar = this.f4385c;
        R(lVar);
        z3.o.i(str);
        z3.o.i(bVar);
        lVar.h();
        lVar.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", bVar.h());
        try {
            if (lVar.P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                lVar.f4438a.d().r().b("Failed to insert/update consent setting (got -1). appId", f3.z(str));
            }
        } catch (SQLiteException e10) {
            lVar.f4438a.d().r().c("Error storing consent setting. appId, error", f3.z(str), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(d9 d9Var, n9 n9Var) {
        long j10;
        b().h();
        g();
        if (Q(n9Var)) {
            if (!n9Var.f4824u) {
                S(n9Var);
                return;
            }
            int n02 = h0().n0(d9Var.f4488o);
            int i10 = 0;
            if (n02 != 0) {
                i9 h02 = h0();
                String str = d9Var.f4488o;
                U();
                String r10 = h02.r(str, 24, true);
                String str2 = d9Var.f4488o;
                h0().B(this.E, n9Var.f4817n, n02, "_ev", r10, str2 != null ? str2.length() : 0);
                return;
            }
            int j02 = h0().j0(d9Var.f4488o, d9Var.k());
            if (j02 != 0) {
                i9 h03 = h0();
                String str3 = d9Var.f4488o;
                U();
                String r11 = h03.r(str3, 24, true);
                Object k10 = d9Var.k();
                if (k10 != null && ((k10 instanceof String) || (k10 instanceof CharSequence))) {
                    i10 = k10.toString().length();
                }
                h0().B(this.E, n9Var.f4817n, j02, "_ev", r11, i10);
                return;
            }
            Object p10 = h0().p(d9Var.f4488o, d9Var.k());
            if (p10 == null) {
                return;
            }
            if ("_sid".equals(d9Var.f4488o)) {
                long j11 = d9Var.f4489p;
                String str4 = d9Var.f4492s;
                String str5 = (String) z3.o.i(n9Var.f4817n);
                l lVar = this.f4385c;
                R(lVar);
                f9 X = lVar.X(str5, "_sno");
                if (X != null) {
                    Object obj = X.f4542e;
                    if (obj instanceof Long) {
                        j10 = ((Long) obj).longValue();
                        B(new d9("_sno", j11, Long.valueOf(j10 + 1), str4), n9Var);
                    }
                }
                if (X != null) {
                    d().w().b("Retrieved last session number from database does not contain a valid (long) value", X.f4542e);
                }
                l lVar2 = this.f4385c;
                R(lVar2);
                r V = lVar2.V(str5, "_s");
                if (V != null) {
                    j10 = V.f4938c;
                    d().v().b("Backfill the session number. Last used session number", Long.valueOf(j10));
                } else {
                    j10 = 0;
                }
                B(new d9("_sno", j11, Long.valueOf(j10 + 1), str4), n9Var);
            }
            f9 f9Var = new f9((String) z3.o.i(n9Var.f4817n), (String) z3.o.i(d9Var.f4492s), d9Var.f4488o, d9Var.f4489p, p10);
            d().v().c("Setting user property", this.f4394l.D().f(f9Var.f4540c), p10);
            l lVar3 = this.f4385c;
            R(lVar3);
            lVar3.e0();
            try {
                if ("_id".equals(f9Var.f4540c)) {
                    l lVar4 = this.f4385c;
                    R(lVar4);
                    f9 X2 = lVar4.X(n9Var.f4817n, "_id");
                    if (X2 != null && !f9Var.f4542e.equals(X2.f4542e)) {
                        l lVar5 = this.f4385c;
                        R(lVar5);
                        lVar5.m(n9Var.f4817n, "_lair");
                    }
                }
                S(n9Var);
                l lVar6 = this.f4385c;
                R(lVar6);
                boolean x10 = lVar6.x(f9Var);
                l lVar7 = this.f4385c;
                R(lVar7);
                lVar7.o();
                if (!x10) {
                    d().r().c("Too many unique user properties are set. Ignoring user property", this.f4394l.D().f(f9Var.f4540c), f9Var.f4542e);
                    h0().B(this.E, n9Var.f4817n, 9, null, null, 0);
                }
            } finally {
                l lVar8 = this.f4385c;
                R(lVar8);
                lVar8.f0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e3, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e8, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e9, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0550, code lost:
        if (r11 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x056e: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:239:0x056e */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a A[Catch: all -> 0x0575, TryCatch #16 {all -> 0x0575, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033d, B:168:0x034f, B:172:0x0389, B:174:0x038e, B:176:0x0396, B:177:0x0399, B:179:0x039e, B:180:0x03a1, B:182:0x03ad, B:183:0x03c3, B:186:0x03cf, B:188:0x03e0, B:190:0x03f2, B:192:0x0414, B:194:0x0452, B:196:0x0464, B:198:0x0479, B:202:0x0489, B:203:0x048d, B:197:0x0472, B:205:0x04d1, B:193:0x0449, B:115:0x0255, B:127:0x0281, B:209:0x04e8, B:210:0x04eb, B:211:0x04ec, B:216:0x052d, B:232:0x0554, B:234:0x055a, B:236:0x0565, B:220:0x0536, B:241:0x0571, B:242:0x0574, B:201:0x0485), top: B:264:0x00da, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x055a A[Catch: all -> 0x0575, TryCatch #16 {all -> 0x0575, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033d, B:168:0x034f, B:172:0x0389, B:174:0x038e, B:176:0x0396, B:177:0x0399, B:179:0x039e, B:180:0x03a1, B:182:0x03ad, B:183:0x03c3, B:186:0x03cf, B:188:0x03e0, B:190:0x03f2, B:192:0x0414, B:194:0x0452, B:196:0x0464, B:198:0x0479, B:202:0x0489, B:203:0x048d, B:197:0x0472, B:205:0x04d1, B:193:0x0449, B:115:0x0255, B:127:0x0281, B:209:0x04e8, B:210:0x04eb, B:211:0x04ec, B:216:0x052d, B:232:0x0554, B:234:0x055a, B:236:0x0565, B:220:0x0536, B:241:0x0571, B:242:0x0574, B:201:0x0485), top: B:264:0x00da, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0255 A[ADDED_TO_REGION, EDGE_INSN: B:290:0x0255->B:115:0x0255 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[Catch: all -> 0x0578, TryCatch #17 {all -> 0x0578, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:38:0x00f7, B:51:0x0118, B:55:0x011f, B:56:0x0122, B:57:0x0123, B:61:0x014b, B:65:0x0153, B:70:0x0187, B:201:0x0485), top: B:265:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a9.C():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:286|(2:288|(1:290)(7:291|292|(1:294)|46|(0)(0)|49|(0)(0)))|295|296|297|298|299|300|301|302|303|304|292|(0)|46|(0)(0)|49|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0745, code lost:
        if (r14.isEmpty() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0939, code lost:
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0277, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0279, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x027a, code lost:
        r33 = "metadata_fingerprint";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x027e, code lost:
        r33 = "metadata_fingerprint";
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0284, code lost:
        r11.f4438a.d().r().c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.f3.z(r10), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036b A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ff A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x053e A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05b7 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0604 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0611 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x061e A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0656 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0667 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06a8 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x06ea A[Catch: all -> 0x0a72, TRY_LEAVE, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x074a A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0790 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07d8 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07f1 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x087d A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x089d A[Catch: all -> 0x0a72, TRY_LEAVE, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x092f A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x09db A[Catch: SQLiteException -> 0x09f6, all -> 0x0a72, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x09f6, blocks: (B:273:0x09cb, B:275:0x09db), top: B:305:0x09cb, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x093b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016b A[Catch: all -> 0x0a72, TRY_ENTER, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e6 A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02be A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030b A[Catch: all -> 0x0a72, TryCatch #1 {all -> 0x0a72, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x0640, B:184:0x0648, B:185:0x064d, B:187:0x0656, B:188:0x065a, B:190:0x0667, B:191:0x066c, B:193:0x0693, B:195:0x069b, B:196:0x06a0, B:198:0x06a8, B:199:0x06ab, B:201:0x06c3, B:204:0x06cb, B:205:0x06e4, B:207:0x06ea, B:209:0x06fe, B:211:0x070a, B:213:0x0717, B:217:0x0731, B:218:0x0741, B:222:0x074a, B:223:0x074d, B:225:0x076b, B:227:0x076f, B:229:0x0781, B:231:0x0785, B:233:0x0790, B:234:0x0799, B:236:0x07d8, B:238:0x07e1, B:239:0x07e4, B:241:0x07f1, B:243:0x0811, B:244:0x081e, B:245:0x0854, B:247:0x085c, B:249:0x0866, B:250:0x0873, B:252:0x087d, B:253:0x088a, B:254:0x0897, B:256:0x089d, B:258:0x08cd, B:259:0x0913, B:260:0x091d, B:261:0x0929, B:263:0x092f, B:272:0x097d, B:273:0x09cb, B:275:0x09db, B:289:0x0a3f, B:278:0x09f3, B:280:0x09f7, B:266:0x093b, B:268:0x0967, B:284:0x0a10, B:285:0x0a27, B:288:0x0a2a, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:299:0x0124, inners: #3, #5, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void D(com.google.android.gms.measurement.internal.v r35, com.google.android.gms.measurement.internal.n9 r36) {
        /*
            Method dump skipped, instructions count: 2689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a9.D(com.google.android.gms.measurement.internal.v, com.google.android.gms.measurement.internal.n9):void");
    }

    final boolean E() {
        d3 w10;
        String str;
        b().h();
        FileLock fileLock = this.f4404v;
        if (fileLock != null && fileLock.isValid()) {
            d().v().a("Storage concurrent access okay");
            return true;
        }
        this.f4385c.f4438a.z();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f4394l.c().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f4405w = channel;
            FileLock tryLock = channel.tryLock();
            this.f4404v = tryLock;
            if (tryLock != null) {
                d().v().a("Storage concurrent access okay");
                return true;
            }
            d().r().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            e = e10;
            w10 = d().r();
            str = "Failed to acquire storage lock";
            w10.b(str, e);
            return false;
        } catch (IOException e11) {
            e = e11;
            w10 = d().r();
            str = "Failed to access storage lock file";
            w10.b(str, e);
            return false;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            w10 = d().w();
            str = "Storage lock already acquired";
            w10.b(str, e);
            return false;
        }
    }

    final long F() {
        long a10 = e().a();
        x7 x7Var = this.f4391i;
        x7Var.i();
        x7Var.h();
        long a11 = x7Var.f5189i.a();
        if (a11 == 0) {
            a11 = x7Var.f4438a.N().u().nextInt(86400000) + 1;
            x7Var.f5189i.b(a11);
        }
        return ((((a10 + a11) / 1000) / 60) / 60) / 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m5 S(n9 n9Var) {
        b().h();
        g();
        z3.o.i(n9Var);
        z3.o.e(n9Var.f4817n);
        if (!n9Var.J.isEmpty()) {
            this.B.put(n9Var.f4817n, new z8(this, n9Var.J));
        }
        l lVar = this.f4385c;
        R(lVar);
        m5 R = lVar.R(n9Var.f4817n);
        p4.b c10 = V(n9Var.f4817n).c(p4.b.b(n9Var.I));
        p4.a aVar = p4.a.AD_STORAGE;
        String o10 = c10.i(aVar) ? this.f4391i.o(n9Var.f4817n, n9Var.B) : "";
        if (R == null) {
            R = new m5(this.f4394l, n9Var.f4817n);
            if (c10.i(p4.a.ANALYTICS_STORAGE)) {
                R.h(i0(c10));
            }
            if (c10.i(aVar)) {
                R.F(o10);
            }
        } else if (c10.i(aVar) && o10 != null && !o10.equals(R.a())) {
            R.F(o10);
            if (n9Var.B && !"00000000-0000-0000-0000-000000000000".equals(this.f4391i.n(n9Var.f4817n, c10).first)) {
                R.h(i0(c10));
                l lVar2 = this.f4385c;
                R(lVar2);
                if (lVar2.X(n9Var.f4817n, "_id") != null) {
                    l lVar3 = this.f4385c;
                    R(lVar3);
                    if (lVar3.X(n9Var.f4817n, "_lair") == null) {
                        f9 f9Var = new f9(n9Var.f4817n, "auto", "_lair", e().a(), 1L);
                        l lVar4 = this.f4385c;
                        R(lVar4);
                        lVar4.x(f9Var);
                    }
                }
            }
        } else if (TextUtils.isEmpty(R.e0()) && c10.i(p4.a.ANALYTICS_STORAGE)) {
            R.h(i0(c10));
        }
        R.w(n9Var.f4818o);
        R.f(n9Var.D);
        if (!TextUtils.isEmpty(n9Var.f4827x)) {
            R.v(n9Var.f4827x);
        }
        long j10 = n9Var.f4821r;
        if (j10 != 0) {
            R.x(j10);
        }
        if (!TextUtils.isEmpty(n9Var.f4819p)) {
            R.j(n9Var.f4819p);
        }
        R.k(n9Var.f4826w);
        String str = n9Var.f4820q;
        if (str != null) {
            R.i(str);
        }
        R.s(n9Var.f4822s);
        R.D(n9Var.f4824u);
        if (!TextUtils.isEmpty(n9Var.f4823t)) {
            R.y(n9Var.f4823t);
        }
        R.g(n9Var.B);
        R.E(n9Var.E);
        R.t(n9Var.F);
        je.c();
        if (U().B(null, u2.f5064n0) && U().B(n9Var.f4817n, u2.f5068p0)) {
            R.H(n9Var.K);
        }
        xc.c();
        if (U().B(null, u2.f5060l0)) {
            R.G(n9Var.G);
        } else {
            xc.c();
            if (U().B(null, u2.f5058k0)) {
                R.G(null);
            }
        }
        if (R.K()) {
            l lVar5 = this.f4385c;
            R(lVar5);
            lVar5.p(R);
        }
        return R;
    }

    public final b T() {
        b bVar = this.f4388f;
        R(bVar);
        return bVar;
    }

    public final h U() {
        return ((j4) z3.o.i(this.f4394l)).z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p4.b V(String str) {
        String str2;
        p4.b bVar = p4.b.f12399b;
        b().h();
        g();
        p4.b bVar2 = (p4.b) this.A.get(str);
        if (bVar2 == null) {
            l lVar = this.f4385c;
            R(lVar);
            z3.o.i(str);
            lVar.h();
            lVar.i();
            Cursor cursor = null;
            try {
                try {
                    cursor = lVar.P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    p4.b b10 = p4.b.b(str2);
                    A(str, b10);
                    return b10;
                } catch (SQLiteException e10) {
                    lVar.f4438a.d().r().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
                    throw e10;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return bVar2;
    }

    public final l W() {
        l lVar = this.f4385c;
        R(lVar);
        return lVar;
    }

    public final a3 X() {
        return this.f4394l.D();
    }

    public final k3 Y() {
        k3 k3Var = this.f4384b;
        R(k3Var);
        return k3Var;
    }

    public final m3 Z() {
        m3 m3Var = this.f4386d;
        if (m3Var != null) {
            return m3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        d3 r10;
        Integer valueOf;
        Integer valueOf2;
        String str;
        b().h();
        g();
        if (this.f4396n) {
            return;
        }
        this.f4396n = true;
        if (E()) {
            FileChannel fileChannel = this.f4405w;
            b().h();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                d().r().a("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i10 = allocate.getInt();
                    } else if (read != -1) {
                        d().w().b("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e10) {
                    d().r().b("Failed to read from channel", e10);
                }
            }
            int p10 = this.f4394l.B().p();
            b().h();
            if (i10 > p10) {
                r10 = d().r();
                valueOf = Integer.valueOf(i10);
                valueOf2 = Integer.valueOf(p10);
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (i10 >= p10) {
                return;
            } else {
                FileChannel fileChannel2 = this.f4405w;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    d().r().a("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(p10);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            d().r().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        r10 = d().v();
                        valueOf = Integer.valueOf(i10);
                        valueOf2 = Integer.valueOf(p10);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e11) {
                        d().r().b("Failed to write to channel", e11);
                    }
                }
                r10 = d().r();
                valueOf = Integer.valueOf(i10);
                valueOf2 = Integer.valueOf(p10);
                str = "Storage version upgrade failed. Previous, current version";
            }
            r10.c(str, valueOf, valueOf2);
        }
    }

    public final d4 a0() {
        d4 d4Var = this.f4383a;
        R(d4Var);
        return d4Var;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    public final h4 b() {
        return ((j4) z3.o.i(this.f4394l)).b();
    }

    @Override // com.google.android.gms.measurement.internal.e5
    public final Context c() {
        return this.f4394l.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j4 c0() {
        return this.f4394l;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    public final f3 d() {
        return ((j4) z3.o.i(this.f4394l)).d();
    }

    public final n6 d0() {
        n6 n6Var = this.f4390h;
        R(n6Var);
        return n6Var;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    public final d4.e e() {
        return ((j4) z3.o.i(this.f4394l)).e();
    }

    public final x7 e0() {
        return this.f4391i;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    public final c f() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        if (!this.f4395m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final c9 g0() {
        c9 c9Var = this.f4389g;
        R(c9Var);
        return c9Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(String str, com.google.android.gms.internal.measurement.c5 c5Var) {
        int w10;
        int indexOf;
        d4 d4Var = this.f4383a;
        R(d4Var);
        Set y10 = d4Var.y(str);
        if (y10 != null) {
            c5Var.A0(y10);
        }
        d4 d4Var2 = this.f4383a;
        R(d4Var2);
        if (d4Var2.J(str)) {
            c5Var.H0();
        }
        d4 d4Var3 = this.f4383a;
        R(d4Var3);
        if (d4Var3.M(str)) {
            if (U().B(str, u2.f5074s0)) {
                String q02 = c5Var.q0();
                if (!TextUtils.isEmpty(q02) && (indexOf = q02.indexOf(".")) != -1) {
                    c5Var.W(q02.substring(0, indexOf));
                }
            } else {
                c5Var.M0();
            }
        }
        d4 d4Var4 = this.f4383a;
        R(d4Var4);
        if (d4Var4.N(str) && (w10 = c9.w(c5Var, "_id")) != -1) {
            c5Var.x(w10);
        }
        d4 d4Var5 = this.f4383a;
        R(d4Var5);
        if (d4Var5.L(str)) {
            c5Var.I0();
        }
        d4 d4Var6 = this.f4383a;
        R(d4Var6);
        if (d4Var6.I(str)) {
            c5Var.F0();
            z8 z8Var = (z8) this.B.get(str);
            if (z8Var == null || z8Var.f5231b + U().r(str, u2.T) < e().b()) {
                z8Var = new z8(this);
                this.B.put(str, z8Var);
            }
            c5Var.P(z8Var.f5230a);
        }
        d4 d4Var7 = this.f4383a;
        R(d4Var7);
        if (d4Var7.K(str)) {
            c5Var.Q0();
        }
    }

    public final i9 h0() {
        return ((j4) z3.o.i(this.f4394l)).N();
    }

    final void i(m5 m5Var) {
        m.a aVar;
        m.a aVar2;
        b().h();
        if (TextUtils.isEmpty(m5Var.i0()) && TextUtils.isEmpty(m5Var.b0())) {
            n((String) z3.o.i(m5Var.d0()), 204, null, null, null);
            return;
        }
        r8 r8Var = this.f4392j;
        Uri.Builder builder = new Uri.Builder();
        String i02 = m5Var.i0();
        if (TextUtils.isEmpty(i02)) {
            i02 = m5Var.b0();
        }
        m.a aVar3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) u2.f5047f.a(null)).encodedAuthority((String) u2.f5049g.a(null)).path("config/app/".concat(String.valueOf(i02))).appendQueryParameter("platform", "android");
        r8Var.f4438a.z().q();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) z3.o.i(m5Var.d0());
            URL url = new URL(uri);
            d().v().b("Fetching remote configuration", str);
            d4 d4Var = this.f4383a;
            R(d4Var);
            com.google.android.gms.internal.measurement.e4 t10 = d4Var.t(str);
            d4 d4Var2 = this.f4383a;
            R(d4Var2);
            String v10 = d4Var2.v(str);
            if (t10 != null) {
                if (TextUtils.isEmpty(v10)) {
                    aVar2 = null;
                } else {
                    aVar2 = new m.a();
                    aVar2.put("If-Modified-Since", v10);
                }
                ce.c();
                if (U().B(null, u2.f5070q0)) {
                    d4 d4Var3 = this.f4383a;
                    R(d4Var3);
                    String u10 = d4Var3.u(str);
                    if (!TextUtils.isEmpty(u10)) {
                        if (aVar2 == null) {
                            aVar2 = new m.a();
                        }
                        aVar3 = aVar2;
                        aVar3.put("If-None-Match", u10);
                    }
                }
                aVar = aVar2;
                this.f4401s = true;
                k3 k3Var = this.f4384b;
                R(k3Var);
                u8 u8Var = new u8(this);
                k3Var.h();
                k3Var.i();
                z3.o.i(url);
                z3.o.i(u8Var);
                k3Var.f4438a.b().y(new j3(k3Var, str, url, null, aVar, u8Var));
            }
            aVar = aVar3;
            this.f4401s = true;
            k3 k3Var2 = this.f4384b;
            R(k3Var2);
            u8 u8Var2 = new u8(this);
            k3Var2.h();
            k3Var2.i();
            z3.o.i(url);
            z3.o.i(u8Var2);
            k3Var2.f4438a.b().y(new j3(k3Var2, str, url, null, aVar, u8Var2));
        } catch (MalformedURLException unused) {
            d().r().c("Failed to parse config URL. Not fetching. appId", f3.z(m5Var.d0()), uri);
        }
    }

    final String i0(p4.b bVar) {
        if (bVar.i(p4.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            h0().u().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(v vVar, n9 n9Var) {
        v vVar2;
        List<d> b02;
        List<d> b03;
        List<d> b04;
        d3 r10;
        String str;
        Object z10;
        String f10;
        Object obj;
        String str2;
        z3.o.i(n9Var);
        z3.o.e(n9Var.f4817n);
        b().h();
        g();
        String str3 = n9Var.f4817n;
        long j10 = vVar.f5103q;
        g3 b10 = g3.b(vVar);
        b().h();
        o6 o6Var = null;
        if (this.C != null && (str2 = this.D) != null && str2.equals(str3)) {
            o6Var = this.C;
        }
        i9.y(o6Var, b10.f4549d, false);
        v a10 = b10.a();
        R(this.f4389g);
        if (c9.m(a10, n9Var)) {
            if (!n9Var.f4824u) {
                S(n9Var);
                return;
            }
            List list = n9Var.G;
            if (list == null) {
                vVar2 = a10;
            } else if (!list.contains(a10.f5100n)) {
                d().q().d("Dropping non-safelisted event. appId, event name, origin", str3, a10.f5100n, a10.f5102p);
                return;
            } else {
                Bundle v10 = a10.f5101o.v();
                v10.putLong("ga_safelisted", 1L);
                vVar2 = new v(a10.f5100n, new t(v10), a10.f5102p, a10.f5103q);
            }
            l lVar = this.f4385c;
            R(lVar);
            lVar.e0();
            try {
                l lVar2 = this.f4385c;
                R(lVar2);
                z3.o.e(str3);
                lVar2.h();
                lVar2.i();
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 < 0) {
                    lVar2.f4438a.d().w().c("Invalid time querying timed out conditional properties", f3.z(str3), Long.valueOf(j10));
                    b02 = Collections.emptyList();
                } else {
                    b02 = lVar2.b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j10)});
                }
                for (d dVar : b02) {
                    if (dVar != null) {
                        d().v().d("User property timed out", dVar.f4445n, this.f4394l.D().f(dVar.f4447p.f4488o), dVar.f4447p.k());
                        v vVar3 = dVar.f4451t;
                        if (vVar3 != null) {
                            D(new v(vVar3, j10), n9Var);
                        }
                        l lVar3 = this.f4385c;
                        R(lVar3);
                        lVar3.J(str3, dVar.f4447p.f4488o);
                    }
                }
                l lVar4 = this.f4385c;
                R(lVar4);
                z3.o.e(str3);
                lVar4.h();
                lVar4.i();
                if (i10 < 0) {
                    lVar4.f4438a.d().w().c("Invalid time querying expired conditional properties", f3.z(str3), Long.valueOf(j10));
                    b03 = Collections.emptyList();
                } else {
                    b03 = lVar4.b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j10)});
                }
                ArrayList<v> arrayList = new ArrayList(b03.size());
                for (d dVar2 : b03) {
                    if (dVar2 != null) {
                        d().v().d("User property expired", dVar2.f4445n, this.f4394l.D().f(dVar2.f4447p.f4488o), dVar2.f4447p.k());
                        l lVar5 = this.f4385c;
                        R(lVar5);
                        lVar5.m(str3, dVar2.f4447p.f4488o);
                        v vVar4 = dVar2.f4455x;
                        if (vVar4 != null) {
                            arrayList.add(vVar4);
                        }
                        l lVar6 = this.f4385c;
                        R(lVar6);
                        lVar6.J(str3, dVar2.f4447p.f4488o);
                    }
                }
                for (v vVar5 : arrayList) {
                    D(new v(vVar5, j10), n9Var);
                }
                l lVar7 = this.f4385c;
                R(lVar7);
                String str4 = vVar2.f5100n;
                z3.o.e(str3);
                z3.o.e(str4);
                lVar7.h();
                lVar7.i();
                if (i10 < 0) {
                    lVar7.f4438a.d().w().d("Invalid time querying triggered conditional properties", f3.z(str3), lVar7.f4438a.D().d(str4), Long.valueOf(j10));
                    b04 = Collections.emptyList();
                } else {
                    b04 = lVar7.b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j10)});
                }
                ArrayList<v> arrayList2 = new ArrayList(b04.size());
                for (d dVar3 : b04) {
                    if (dVar3 != null) {
                        d9 d9Var = dVar3.f4447p;
                        f9 f9Var = new f9((String) z3.o.i(dVar3.f4445n), dVar3.f4446o, d9Var.f4488o, j10, z3.o.i(d9Var.k()));
                        l lVar8 = this.f4385c;
                        R(lVar8);
                        if (lVar8.x(f9Var)) {
                            r10 = d().v();
                            str = "User property triggered";
                            z10 = dVar3.f4445n;
                            f10 = this.f4394l.D().f(f9Var.f4540c);
                            obj = f9Var.f4542e;
                        } else {
                            r10 = d().r();
                            str = "Too many active user properties, ignoring";
                            z10 = f3.z(dVar3.f4445n);
                            f10 = this.f4394l.D().f(f9Var.f4540c);
                            obj = f9Var.f4542e;
                        }
                        r10.d(str, z10, f10, obj);
                        v vVar6 = dVar3.f4453v;
                        if (vVar6 != null) {
                            arrayList2.add(vVar6);
                        }
                        dVar3.f4447p = new d9(f9Var);
                        dVar3.f4449r = true;
                        l lVar9 = this.f4385c;
                        R(lVar9);
                        lVar9.w(dVar3);
                    }
                }
                D(vVar2, n9Var);
                for (v vVar7 : arrayList2) {
                    D(new v(vVar7, j10), n9Var);
                }
                l lVar10 = this.f4385c;
                R(lVar10);
                lVar10.o();
            } finally {
                l lVar11 = this.f4385c;
                R(lVar11);
                lVar11.f0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String j0(n9 n9Var) {
        try {
            return (String) b().s(new v8(this, n9Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            d().r().c("Failed to get app instance id. appId", f3.z(n9Var.f4817n), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(v vVar, String str) {
        l lVar = this.f4385c;
        R(lVar);
        m5 R = lVar.R(str);
        if (R == null || TextUtils.isEmpty(R.g0())) {
            d().q().b("No app data available; dropping event", str);
            return;
        }
        Boolean J = J(R);
        if (J == null) {
            if (!"_ui".equals(vVar.f5100n)) {
                d().w().b("Could not find package. appId", f3.z(str));
            }
        } else if (!J.booleanValue()) {
            d().r().b("App version does not match; dropping event. appId", f3.z(str));
            return;
        }
        String i02 = R.i0();
        String g02 = R.g0();
        long L = R.L();
        String f02 = R.f0();
        long W = R.W();
        long T = R.T();
        boolean J2 = R.J();
        String h02 = R.h0();
        R.A();
        l(vVar, new n9(str, i02, g02, L, f02, W, T, (String) null, J2, false, h02, 0L, 0L, 0, R.I(), false, R.b0(), R.a0(), R.U(), R.c(), (String) null, V(str).h(), "", (String) null));
    }

    final void l(v vVar, n9 n9Var) {
        z3.o.e(n9Var.f4817n);
        g3 b10 = g3.b(vVar);
        i9 h02 = h0();
        Bundle bundle = b10.f4549d;
        l lVar = this.f4385c;
        R(lVar);
        h02.z(bundle, lVar.Q(n9Var.f4817n));
        h0().A(b10, U().n(n9Var.f4817n));
        v a10 = b10.a();
        if ("_cmp".equals(a10.f5100n) && "referrer API v2".equals(a10.f5101o.E("_cis"))) {
            String E = a10.f5101o.E("gclid");
            if (!TextUtils.isEmpty(E)) {
                B(new d9("_lgclid", a10.f5103q, E, "auto"), n9Var);
            }
        }
        j(a10, n9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l0(Runnable runnable) {
        b().h();
        if (this.f4398p == null) {
            this.f4398p = new ArrayList();
        }
        this.f4398p.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.f4400r++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x018b, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0173, B:6:0x002c, B:16:0x0049, B:62:0x016b, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x018b, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0173, B:6:0x002c, B:16:0x0049, B:62:0x016b, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x018b, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0173, B:6:0x002c, B:16:0x0049, B:62:0x016b, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x018b, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0173, B:6:0x002c, B:16:0x0049, B:62:0x016b, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x018b, blocks: (B:4:0x0010, B:5:0x0012, B:63:0x0173, B:6:0x002c, B:16:0x0049, B:62:0x016b, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:53:0x0123, B:55:0x0138, B:57:0x0157, B:59:0x0162, B:61:0x0168, B:56:0x0146, B:50:0x0110, B:52:0x011b), top: B:72:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a9.n(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(boolean z10) {
        M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int i10, Throwable th, byte[] bArr, String str) {
        l lVar;
        long longValue;
        b().h();
        g();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f4402t = false;
                K();
            }
        }
        List<Long> list = (List) z3.o.i(this.f4406x);
        this.f4406x = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            d().v().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            this.f4391i.f5188h.b(e().a());
            if (i10 != 503 || i10 == 429) {
                this.f4391i.f5186f.b(e().a());
            }
            l lVar2 = this.f4385c;
            R(lVar2);
            lVar2.g0(list);
            M();
        }
        if (th == null) {
            try {
                this.f4391i.f5187g.b(e().a());
                this.f4391i.f5188h.b(0L);
                M();
                d().v().c("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                l lVar3 = this.f4385c;
                R(lVar3);
                lVar3.e0();
            } catch (SQLiteException e10) {
                d().r().b("Database error while trying to delete uploaded bundles", e10);
                this.f4397o = e().b();
                d().v().b("Disable upload, time", Long.valueOf(this.f4397o));
            }
            try {
                for (Long l10 : list) {
                    try {
                        lVar = this.f4385c;
                        R(lVar);
                        longValue = l10.longValue();
                        lVar.h();
                        lVar.i();
                    } catch (SQLiteException e11) {
                        List list2 = this.f4407y;
                        if (list2 == null || !list2.contains(l10)) {
                            throw e11;
                        }
                    }
                    try {
                        if (lVar.P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e12) {
                        lVar.f4438a.d().r().b("Failed to delete a bundle in a queue table", e12);
                        throw e12;
                        break;
                    }
                }
                l lVar4 = this.f4385c;
                R(lVar4);
                lVar4.o();
                l lVar5 = this.f4385c;
                R(lVar5);
                lVar5.f0();
                this.f4407y = null;
                k3 k3Var = this.f4384b;
                R(k3Var);
                if (k3Var.m() && O()) {
                    C();
                } else {
                    this.f4408z = -1L;
                    M();
                }
                this.f4397o = 0L;
            } catch (Throwable th2) {
                l lVar6 = this.f4385c;
                R(lVar6);
                lVar6.f0();
                throw th2;
            }
        }
        d().v().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
        this.f4391i.f5188h.b(e().a());
        if (i10 != 503) {
        }
        this.f4391i.f5186f.b(e().a());
        l lVar22 = this.f4385c;
        R(lVar22);
        lVar22.g0(list);
        M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:94|95|(2:97|(11:99|(3:101|(2:103|(1:105))(1:130)|129)(1:131)|106|(1:108)(1:128)|109|110|111|112|113|114|(4:116|(1:118)|119|(1:121))))|132|110|111|112|113|114|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04ae, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04b0, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04b1, code lost:
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04b3, code lost:
        d().r().c("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.f3.z(r3), r0);
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e0 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040c A[Catch: all -> 0x056f, TRY_LEAVE, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c7 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04e3 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0543 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0421 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0206 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0260 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026f A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027f A[Catch: all -> 0x056f, TRY_LEAVE, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.google.android.gms.measurement.internal.n9 r25) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.a9.q(com.google.android.gms.measurement.internal.n9):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        this.f4399q++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(d dVar) {
        n9 I = I((String) z3.o.i(dVar.f4445n));
        if (I != null) {
            t(dVar, I);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(d dVar, n9 n9Var) {
        z3.o.i(dVar);
        z3.o.e(dVar.f4445n);
        z3.o.i(dVar.f4447p);
        z3.o.e(dVar.f4447p.f4488o);
        b().h();
        g();
        if (Q(n9Var)) {
            if (!n9Var.f4824u) {
                S(n9Var);
                return;
            }
            l lVar = this.f4385c;
            R(lVar);
            lVar.e0();
            try {
                S(n9Var);
                String str = (String) z3.o.i(dVar.f4445n);
                l lVar2 = this.f4385c;
                R(lVar2);
                d S = lVar2.S(str, dVar.f4447p.f4488o);
                if (S != null) {
                    d().q().c("Removing conditional user property", dVar.f4445n, this.f4394l.D().f(dVar.f4447p.f4488o));
                    l lVar3 = this.f4385c;
                    R(lVar3);
                    lVar3.J(str, dVar.f4447p.f4488o);
                    if (S.f4449r) {
                        l lVar4 = this.f4385c;
                        R(lVar4);
                        lVar4.m(str, dVar.f4447p.f4488o);
                    }
                    v vVar = dVar.f4455x;
                    if (vVar != null) {
                        t tVar = vVar.f5101o;
                        D((v) z3.o.i(h0().w0(str, ((v) z3.o.i(dVar.f4455x)).f5100n, tVar != null ? tVar.v() : null, S.f4446o, dVar.f4455x.f5103q, true, true)), n9Var);
                    }
                } else {
                    d().w().c("Conditional user property doesn't exist", f3.z(dVar.f4445n), this.f4394l.D().f(dVar.f4447p.f4488o));
                }
                l lVar5 = this.f4385c;
                R(lVar5);
                lVar5.o();
            } finally {
                l lVar6 = this.f4385c;
                R(lVar6);
                lVar6.f0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(d9 d9Var, n9 n9Var) {
        b().h();
        g();
        if (Q(n9Var)) {
            if (!n9Var.f4824u) {
                S(n9Var);
            } else if ("_npa".equals(d9Var.f4488o) && n9Var.E != null) {
                d().q().a("Falling back to manifest metadata value for ad personalization");
                B(new d9("_npa", e().a(), Long.valueOf(true != n9Var.E.booleanValue() ? 0L : 1L), "auto"), n9Var);
            } else {
                d().q().b("Removing user property", this.f4394l.D().f(d9Var.f4488o));
                l lVar = this.f4385c;
                R(lVar);
                lVar.e0();
                try {
                    S(n9Var);
                    if ("_id".equals(d9Var.f4488o)) {
                        l lVar2 = this.f4385c;
                        R(lVar2);
                        lVar2.m((String) z3.o.i(n9Var.f4817n), "_lair");
                    }
                    l lVar3 = this.f4385c;
                    R(lVar3);
                    lVar3.m((String) z3.o.i(n9Var.f4817n), d9Var.f4488o);
                    l lVar4 = this.f4385c;
                    R(lVar4);
                    lVar4.o();
                    d().q().b("User property removed", this.f4394l.D().f(d9Var.f4488o));
                } finally {
                    l lVar5 = this.f4385c;
                    R(lVar5);
                    lVar5.f0();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(n9 n9Var) {
        if (this.f4406x != null) {
            ArrayList arrayList = new ArrayList();
            this.f4407y = arrayList;
            arrayList.addAll(this.f4406x);
        }
        l lVar = this.f4385c;
        R(lVar);
        String str = (String) z3.o.i(n9Var.f4817n);
        z3.o.e(str);
        lVar.h();
        lVar.i();
        try {
            SQLiteDatabase P = lVar.P();
            String[] strArr = {str};
            int delete = P.delete("apps", "app_id=?", strArr) + P.delete("events", "app_id=?", strArr) + P.delete("user_attributes", "app_id=?", strArr) + P.delete("conditional_properties", "app_id=?", strArr) + P.delete("raw_events", "app_id=?", strArr) + P.delete("raw_events_metadata", "app_id=?", strArr) + P.delete("queue", "app_id=?", strArr) + P.delete("audience_filter_values", "app_id=?", strArr) + P.delete("main_event_params", "app_id=?", strArr) + P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                lVar.f4438a.d().v().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            lVar.f4438a.d().r().c("Error resetting analytics data. appId, error", f3.z(str), e10);
        }
        if (n9Var.f4824u) {
            q(n9Var);
        }
    }

    public final void w(String str, o6 o6Var) {
        b().h();
        String str2 = this.D;
        if (str2 == null || str2.equals(str) || o6Var != null) {
            this.D = str;
            this.C = o6Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        b().h();
        l lVar = this.f4385c;
        R(lVar);
        lVar.h0();
        if (this.f4391i.f5187g.a() == 0) {
            this.f4391i.f5187g.b(e().a());
        }
        M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(d dVar) {
        n9 I = I((String) z3.o.i(dVar.f4445n));
        if (I != null) {
            z(dVar, I);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(d dVar, n9 n9Var) {
        d3 r10;
        String str;
        Object z10;
        String f10;
        Object k10;
        d3 r11;
        String str2;
        Object z11;
        String f11;
        Object obj;
        z3.o.i(dVar);
        z3.o.e(dVar.f4445n);
        z3.o.i(dVar.f4446o);
        z3.o.i(dVar.f4447p);
        z3.o.e(dVar.f4447p.f4488o);
        b().h();
        g();
        if (Q(n9Var)) {
            if (!n9Var.f4824u) {
                S(n9Var);
                return;
            }
            d dVar2 = new d(dVar);
            boolean z12 = false;
            dVar2.f4449r = false;
            l lVar = this.f4385c;
            R(lVar);
            lVar.e0();
            try {
                l lVar2 = this.f4385c;
                R(lVar2);
                d S = lVar2.S((String) z3.o.i(dVar2.f4445n), dVar2.f4447p.f4488o);
                if (S != null && !S.f4446o.equals(dVar2.f4446o)) {
                    d().w().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f4394l.D().f(dVar2.f4447p.f4488o), dVar2.f4446o, S.f4446o);
                }
                if (S != null && S.f4449r) {
                    dVar2.f4446o = S.f4446o;
                    dVar2.f4448q = S.f4448q;
                    dVar2.f4452u = S.f4452u;
                    dVar2.f4450s = S.f4450s;
                    dVar2.f4453v = S.f4453v;
                    dVar2.f4449r = true;
                    d9 d9Var = dVar2.f4447p;
                    dVar2.f4447p = new d9(d9Var.f4488o, S.f4447p.f4489p, d9Var.k(), S.f4447p.f4492s);
                } else if (TextUtils.isEmpty(dVar2.f4450s)) {
                    d9 d9Var2 = dVar2.f4447p;
                    dVar2.f4447p = new d9(d9Var2.f4488o, dVar2.f4448q, d9Var2.k(), dVar2.f4447p.f4492s);
                    dVar2.f4449r = true;
                    z12 = true;
                }
                if (dVar2.f4449r) {
                    d9 d9Var3 = dVar2.f4447p;
                    f9 f9Var = new f9((String) z3.o.i(dVar2.f4445n), dVar2.f4446o, d9Var3.f4488o, d9Var3.f4489p, z3.o.i(d9Var3.k()));
                    l lVar3 = this.f4385c;
                    R(lVar3);
                    if (lVar3.x(f9Var)) {
                        r11 = d().q();
                        str2 = "User property updated immediately";
                        z11 = dVar2.f4445n;
                        f11 = this.f4394l.D().f(f9Var.f4540c);
                        obj = f9Var.f4542e;
                    } else {
                        r11 = d().r();
                        str2 = "(2)Too many active user properties, ignoring";
                        z11 = f3.z(dVar2.f4445n);
                        f11 = this.f4394l.D().f(f9Var.f4540c);
                        obj = f9Var.f4542e;
                    }
                    r11.d(str2, z11, f11, obj);
                    if (z12 && dVar2.f4453v != null) {
                        D(new v(dVar2.f4453v, dVar2.f4448q), n9Var);
                    }
                }
                l lVar4 = this.f4385c;
                R(lVar4);
                if (lVar4.w(dVar2)) {
                    r10 = d().q();
                    str = "Conditional property added";
                    z10 = dVar2.f4445n;
                    f10 = this.f4394l.D().f(dVar2.f4447p.f4488o);
                    k10 = dVar2.f4447p.k();
                } else {
                    r10 = d().r();
                    str = "Too many conditional properties, ignoring";
                    z10 = f3.z(dVar2.f4445n);
                    f10 = this.f4394l.D().f(dVar2.f4447p.f4488o);
                    k10 = dVar2.f4447p.k();
                }
                r10.d(str, z10, f10, k10);
                l lVar5 = this.f4385c;
                R(lVar5);
                lVar5.o();
            } finally {
                l lVar6 = this.f4385c;
                R(lVar6);
                lVar6.f0();
            }
        }
    }
}
