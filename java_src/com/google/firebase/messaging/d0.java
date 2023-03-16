package com.google.firebase.messaging;

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
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final f5.e f5513a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f5514b;

    /* renamed from: c  reason: collision with root package name */
    private final v3.d f5515c;

    /* renamed from: d  reason: collision with root package name */
    private final i6.b<c7.i> f5516d;

    /* renamed from: e  reason: collision with root package name */
    private final i6.b<g6.j> f5517e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.e f5518f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(f5.e eVar, i0 i0Var, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2) {
        this(eVar, i0Var, new v3.d(eVar.l()), bVar, bVar2, eVar2);
    }

    d0(f5.e eVar, i0 i0Var, v3.d dVar, i6.b<c7.i> bVar, i6.b<g6.j> bVar2, j6.e eVar2) {
        this.f5513a = eVar;
        this.f5514b = i0Var;
        this.f5515c = dVar;
        this.f5516d = bVar;
        this.f5517e = bVar2;
        this.f5518f = eVar2;
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private t4.i<String> d(t4.i<Bundle> iVar) {
        return iVar.h(androidx.window.layout.u.f2506n, new t4.a() { // from class: com.google.firebase.messaging.c0
            @Override // t4.a
            public final Object a(t4.i iVar2) {
                String i10;
                i10 = d0.this.i(iVar2);
                return i10;
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f5513a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String g(Bundle bundle) {
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
            Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(t4.i iVar) {
        return g((Bundle) iVar.m(IOException.class));
    }

    private void j(String str, String str2, Bundle bundle) {
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f5513a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f5514b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f5514b.a());
        bundle.putString("app_ver_name", this.f5514b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b11 = ((com.google.firebase.installations.g) t4.l.a(this.f5518f.b(false))).b();
            if (TextUtils.isEmpty(b11)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) t4.l.a(this.f5518f.a()));
        bundle.putString("cliv", "fcm-23.1.1");
        g6.j jVar = this.f5517e.get();
        c7.i iVar = this.f5516d.get();
        if (jVar == null || iVar == null || (b10 = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.e()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private t4.i<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f5515c.a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return t4.l.d(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(k(i0.c(this.f5513a), "*", bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<String> f() {
        return d(k(i0.c(this.f5513a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4.i<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(k(str, "/topics/" + str2, bundle));
    }
}
