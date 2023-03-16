package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f5630a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5631b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5632c;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f5634e;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f5633d = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f5635f = false;

    private v0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f5630a = sharedPreferences;
        this.f5631b = str;
        this.f5632c = str2;
        this.f5634e = executor;
    }

    private boolean c(boolean z10) {
        if (z10 && !this.f5635f) {
            j();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        v0 v0Var = new v0(sharedPreferences, str, str2, executor);
        v0Var.e();
        return v0Var;
    }

    private void e() {
        synchronized (this.f5633d) {
            this.f5633d.clear();
            String string = this.f5630a.getString(this.f5631b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f5632c)) {
                String[] split = string.split(this.f5632c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f5633d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this.f5633d) {
            this.f5630a.edit().putString(this.f5631b, h()).commit();
        }
    }

    private void j() {
        this.f5634e.execute(new Runnable() { // from class: com.google.firebase.messaging.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.i();
            }
        });
    }

    public boolean b(String str) {
        boolean c10;
        if (TextUtils.isEmpty(str) || str.contains(this.f5632c)) {
            return false;
        }
        synchronized (this.f5633d) {
            c10 = c(this.f5633d.add(str));
        }
        return c10;
    }

    public String f() {
        String peek;
        synchronized (this.f5633d) {
            peek = this.f5633d.peek();
        }
        return peek;
    }

    public boolean g(Object obj) {
        boolean c10;
        synchronized (this.f5633d) {
            c10 = c(this.f5633d.remove(obj));
        }
        return c10;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f5633d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f5632c);
        }
        return sb.toString();
    }
}
