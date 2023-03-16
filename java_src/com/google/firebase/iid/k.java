package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import g6.j;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final f5.e f5358a;

    /* renamed from: b  reason: collision with root package name */
    private final n f5359b;

    /* renamed from: c  reason: collision with root package name */
    private final v3.d f5360c;

    /* renamed from: d  reason: collision with root package name */
    private final i6.b<c7.i> f5361d;

    /* renamed from: e  reason: collision with root package name */
    private final i6.b<g6.j> f5362e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.e f5363f;

    public k(f5.e eVar, n nVar, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2) {
        this(eVar, nVar, new v3.d(eVar.l()), bVar, bVar2, eVar2);
    }

    k(f5.e eVar, n nVar, v3.d dVar, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2) {
        this.f5358a = eVar;
        this.f5359b = nVar;
        this.f5360c = dVar;
        this.f5361d = bVar;
        this.f5362e = bVar2;
        this.f5363f = eVar2;
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private t4.i<String> c(t4.i<Bundle> iVar) {
        return iVar.h(b.a(), new t4.a(this) { // from class: com.google.firebase.iid.j

            /* renamed from: a  reason: collision with root package name */
            private final k f5357a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f5357a = this;
            }

            @Override // t4.a
            public Object a(t4.i iVar2) {
                return this.f5357a.h(iVar2);
            }
        });
    }

    private String d() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f5358a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(valueOf.length() + 21);
            sb.append("Unexpected response: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private Bundle i(String str, String str2, String str3, Bundle bundle) {
        j.a b10;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f5358a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f5359b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f5359b.a());
        bundle.putString("app_ver_name", this.f5359b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b11 = ((com.google.firebase.installations.g) t4.l.a(this.f5363f.b(false))).b();
            if (TextUtils.isEmpty(b11)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        g6.j jVar = this.f5362e.get();
        c7.i iVar = this.f5361d.get();
        if (jVar != null && iVar != null && (b10 = jVar.b("fire-iid")) != j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.e()));
            bundle.putString("Firebase-Client", iVar.a());
        }
        return bundle;
    }

    private t4.i<Bundle> j(String str, String str2, String str3, Bundle bundle) {
        i(str, str2, str3, bundle);
        return this.f5360c.a(bundle);
    }

    public t4.i<?> b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return c(j(str, str2, str3, bundle));
    }

    public t4.i<String> e(String str, String str2, String str3) {
        return c(j(str, str2, str3, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String h(t4.i iVar) {
        return f((Bundle) iVar.m(IOException.class));
    }
}
