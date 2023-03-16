package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class u {

    /* renamed from: a  reason: collision with root package name */
    final SharedPreferences f5381a;

    /* renamed from: b  reason: collision with root package name */
    final Context f5382b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Long> f5383c = new m.a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final long f5384d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        final String f5385a;

        /* renamed from: b  reason: collision with root package name */
        final String f5386b;

        /* renamed from: c  reason: collision with root package name */
        final long f5387c;

        private a(String str, String str2, long j10) {
            this.f5385a = str;
            this.f5386b = str2;
            this.f5387c = j10;
        }

        static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static String b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f5385a;
        }

        static a d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    String valueOf = String.valueOf(e10);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(valueOf);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(String str) {
            return System.currentTimeMillis() > this.f5387c + f5384d || !str.equals(this.f5386b);
        }
    }

    public u(Context context) {
        this.f5382b = context;
        this.f5381a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    private void a(String str) {
        File file = new File(androidx.core.content.a.j(this.f5382b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || h()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            d();
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    private String c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private long f(String str) {
        String string = this.f5381a.getString(b(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    private long k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f5381a.contains(b(str, "cre"))) {
            return f(str);
        }
        SharedPreferences.Editor edit = this.f5381a.edit();
        edit.putString(b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    public synchronized void d() {
        this.f5383c.clear();
        this.f5381a.edit().clear().commit();
    }

    public synchronized void e(String str, String str2, String str3) {
        String c10 = c(str, str2, str3);
        SharedPreferences.Editor edit = this.f5381a.edit();
        edit.remove(c10);
        edit.commit();
    }

    public synchronized a g(String str, String str2, String str3) {
        return a.d(this.f5381a.getString(c(str, str2, str3), null));
    }

    public synchronized boolean h() {
        return this.f5381a.getAll().isEmpty();
    }

    public synchronized void i(String str, String str2, String str3, String str4, String str5) {
        String a10 = a.a(str4, str5, System.currentTimeMillis());
        if (a10 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f5381a.edit();
        edit.putString(c(str, str2, str3), a10);
        edit.commit();
    }

    public synchronized long j(String str) {
        long k10;
        k10 = k(str);
        this.f5383c.put(str, Long.valueOf(k10));
        return k10;
    }
}
