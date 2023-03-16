package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class i9 extends d5 {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f4636g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f4637h = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f4638c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f4639d;

    /* renamed from: e  reason: collision with root package name */
    private int f4640e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f4641f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9(j4 j4Var) {
        super(j4Var);
        this.f4641f = null;
        this.f4639d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean W(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean X(String str) {
        z3.o.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean Y(Context context) {
        ActivityInfo receiverInfo;
        z3.o.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean Z(Context context, boolean z10) {
        z3.o.i(context);
        return i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean a0(String str) {
        return !f4637h[0].equals(str);
    }

    static final boolean d0(Bundle bundle, int i10) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i10);
            return true;
        }
        return false;
    }

    static final boolean e0(String str) {
        z3.o.i(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int f0(String str) {
        if ("_ldl".equals(str)) {
            this.f4438a.z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f4438a.z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f4438a.z();
            return 100;
        } else {
            this.f4438a.z();
            return 36;
        }
    }

    private final Object g0(int i10, Object obj, boolean z10, boolean z11) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return r(obj.toString(), i10, z10);
            }
            if (z11 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle u02 = u0((Bundle) parcelable);
                        if (!u02.isEmpty()) {
                            arrayList.add(u02);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
    }

    private static boolean h0(String str, String[] strArr) {
        z3.o.i(strArr);
        for (String str2 : strArr) {
            if (p4.c0.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long q0(byte[] bArr) {
        z3.o.i(bArr);
        int length = bArr.length;
        int i10 = 0;
        z3.o.l(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest t() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList v(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", dVar.f4445n);
            bundle.putString("origin", dVar.f4446o);
            bundle.putLong("creation_timestamp", dVar.f4448q);
            bundle.putString("name", dVar.f4447p.f4488o);
            p4.p.b(bundle, z3.o.i(dVar.f4447p.k()));
            bundle.putBoolean("active", dVar.f4449r);
            String str = dVar.f4450s;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            v vVar = dVar.f4451t;
            if (vVar != null) {
                bundle.putString("timed_out_event_name", vVar.f5100n);
                t tVar = vVar.f5101o;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.v());
                }
            }
            bundle.putLong("trigger_timeout", dVar.f4452u);
            v vVar2 = dVar.f4453v;
            if (vVar2 != null) {
                bundle.putString("triggered_event_name", vVar2.f5100n);
                t tVar2 = vVar2.f5101o;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.v());
                }
            }
            bundle.putLong("triggered_timestamp", dVar.f4447p.f4489p);
            bundle.putLong("time_to_live", dVar.f4454w);
            v vVar3 = dVar.f4455x;
            if (vVar3 != null) {
                bundle.putString("expired_event_name", vVar3.f5100n);
                t tVar3 = vVar3.f5101o;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.v());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void y(o6 o6Var, Bundle bundle, boolean z10) {
        if (bundle != null && o6Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = o6Var.f4854a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = o6Var.f4855b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", o6Var.f4856c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && o6Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(g3 g3Var, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(g3Var.f4549d.keySet())) {
            if (X(str) && (i11 = i11 + 1) > i10) {
                this.f4438a.d().s().c("Event can't contain more than " + i10 + " params", this.f4438a.D().d(g3Var.f4546a), this.f4438a.D().b(g3Var.f4549d));
                d0(g3Var.f4549d, 5);
                g3Var.f4549d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(h9 h9Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        d0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        h9Var.a(str, "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f4438a.d().x().c("Not putting event parameter. Invalid value type. name, type", this.f4438a.D().e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void D(com.google.android.gms.internal.measurement.i1 i1Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void E(com.google.android.gms.internal.measurement.i1 i1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void F(com.google.android.gms.internal.measurement.i1 i1Var, Bundle bundle) {
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void G(com.google.android.gms.internal.measurement.i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void H(com.google.android.gms.internal.measurement.i1 i1Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning int value to wrapper", e10);
        }
    }

    public final void I(com.google.android.gms.internal.measurement.i1 i1Var, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning long value to wrapper", e10);
        }
    }

    public final void J(com.google.android.gms.internal.measurement.i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            i1Var.T(bundle);
        } catch (RemoteException e10) {
            this.f4438a.d().w().b("Error returning string value to wrapper", e10);
        }
    }

    final void K(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        String str4;
        int O;
        if (bundle == null) {
            return;
        }
        this.f4438a.z();
        int i11 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int m02 = !z10 ? m0(str5) : 0;
                if (m02 == 0) {
                    m02 = l0(str5);
                }
                i10 = m02;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                x(bundle, i10, str5, str5, i10 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (U(bundle.get(str5))) {
                    this.f4438a.d().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    O = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    O = O(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (O != 0 && !"_ev".equals(str4)) {
                    x(bundle, O, str4, str4, bundle.get(str4));
                } else if (X(str4) && !h0(str4, p4.r.f12413d) && (i11 = i11 + 1) > 0) {
                    this.f4438a.d().s().c("Item cannot contain custom parameters", this.f4438a.D().d(str2), this.f4438a.D().b(bundle));
                    d0(bundle, 23);
                }
                bundle.remove(str4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean L(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (e0(str)) {
                return true;
            }
            if (this.f4438a.q()) {
                this.f4438a.d().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", f3.z(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.f4438a.q()) {
                this.f4438a.d().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (e0(str2)) {
            return true;
        } else {
            this.f4438a.d().s().b("Invalid admob_app_id. Analytics disabled.", f3.z(str2));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str, int i10, String str2) {
        if (str2 == null) {
            this.f4438a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i10) {
            this.f4438a.d().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f4438a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        z3.o.i(str2);
        String[] strArr3 = f4636g;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f4438a.d().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !h0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !h0(str2, strArr2)) {
            this.f4438a.d().s().c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int O(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i9.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f4438a.d().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Q(String str, String str2) {
        if (str2 == null) {
            this.f4438a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f4438a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.f4438a.d().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f4438a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean R(String str, String str2) {
        if (str2 == null) {
            this.f4438a.d().s().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f4438a.d().s().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f4438a.d().s().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f4438a.d().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean S(String str) {
        h();
        if (f4.c.a(this.f4438a.c()).a(str) == 0) {
            return true;
        }
        this.f4438a.d().q().b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u10 = this.f4438a.z().u();
        this.f4438a.f();
        return u10.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean U(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean V(Context context, String str) {
        d3 r10;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e10 = f4.c.a(context).e(str, 64);
            if (e10 == null || (signatureArr = e10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            r10 = this.f4438a.d().r();
            str2 = "Package name not found";
            r10.b(str2, e);
            return true;
        } catch (CertificateException e12) {
            e = e12;
            r10 = this.f4438a.d().r();
            str2 = "Error obtaining certificate";
            r10.b(str2, e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            z3.o.i(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.d5
    protected final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f4438a.d().w().a("Utils falling back to Random for random id");
            }
        }
        this.f4639d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    protected final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int j0(String str, Object obj) {
        int f02;
        String str2;
        if ("_ldl".equals(str)) {
            f02 = f0(str);
            str2 = "user property referrer";
        } else {
            f02 = f0(str);
            str2 = "user property";
        }
        return P(str2, str, f02, obj) ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int k0(String str) {
        if (Q("event", str)) {
            if (N("event", p4.q.f12406a, p4.q.f12407b, str)) {
                this.f4438a.z();
                return !M("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    final int l0(String str) {
        if (Q("event param", str)) {
            if (N("event param", null, null, str)) {
                this.f4438a.z();
                return !M("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    final int m0(String str) {
        if (R("event param", str)) {
            if (N("event param", null, null, str)) {
                this.f4438a.z();
                return !M("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n0(String str) {
        if (Q("user property", str)) {
            if (N("user property", p4.s.f12414a, null, str)) {
                this.f4438a.z();
                return !M("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object o(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.f4438a.z();
            return g0(256, obj, true, true);
        }
        if (W(str)) {
            this.f4438a.z();
        } else {
            this.f4438a.z();
            i10 = 100;
        }
        return g0(i10, obj, false, true);
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int o0() {
        if (this.f4641f == null) {
            this.f4641f = Integer.valueOf(w3.f.f().a(this.f4438a.c()) / 1000);
        }
        return this.f4641f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object p(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int f02 = f0(str);
        return equals ? g0(f02, obj, true, false) : g0(f02, obj, false, false);
    }

    public final int p0(int i10) {
        return w3.f.f().h(this.f4438a.c(), w3.i.f16085a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String q() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String r(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i10) {
            if (z10) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
            }
            return null;
        }
        return str;
    }

    public final long r0() {
        long andIncrement;
        long j10;
        if (this.f4639d.get() != 0) {
            synchronized (this.f4639d) {
                this.f4639d.compareAndSet(-1L, 1L);
                andIncrement = this.f4639d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f4639d) {
            long nextLong = new Random(System.nanoTime() ^ this.f4438a.e().a()).nextLong();
            int i10 = this.f4640e + 1;
            this.f4640e = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    public final URL s(long j10, String str, String str2, long j11) {
        try {
            z3.o.e(str2);
            z3.o.e(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 74029L, Integer.valueOf(o0())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f4438a.z().v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            this.f4438a.d().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e10.getMessage());
            return null;
        }
    }

    public final long s0(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString("campaign_id", str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("source_platform", queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("creative_format", queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("marketing_tactic", queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                return bundle;
            } catch (UnsupportedOperationException e10) {
                this.f4438a.d().w().b("Install referrer url isn't a hierarchical URI", e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom u() {
        h();
        if (this.f4638c == null) {
            this.f4638c = new SecureRandom();
        }
        return this.f4638c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o10 = o(str, bundle.get(str));
                if (o10 == null) {
                    this.f4438a.d().x().b("Param value can't be null", this.f4438a.D().e(str));
                } else {
                    C(bundle2, str, o10);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i9.v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f4438a.d().w().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v w0(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (k0(str2) != 0) {
            this.f4438a.d().r().b("Invalid conditional property event name", this.f4438a.D().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle v02 = v0(str, str2, bundle2, d4.f.b("_o"), true);
        if (z10) {
            v02 = u0(v02);
        }
        z3.o.i(v02);
        return new v(str2, new t(v02), str3, j10);
    }

    final void x(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (d0(bundle, i10)) {
            this.f4438a.z();
            bundle.putString("_ev", r(str, 40, true));
            if (obj != null) {
                z3.o.i(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f4438a.N().C(bundle, str, bundle2.get(str));
            }
        }
    }
}
