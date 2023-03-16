package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class y0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f5652d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f5653a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5654b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5655c;

    private y0(String str, String str2) {
        this.f5653a = d(str2, str);
        this.f5654b = str;
        this.f5655c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new y0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f5652d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static y0 f(String str) {
        return new y0("S", str);
    }

    public static y0 g(String str) {
        return new y0("U", str);
    }

    public String b() {
        return this.f5654b;
    }

    public String c() {
        return this.f5653a;
    }

    public String e() {
        return this.f5655c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            return this.f5653a.equals(y0Var.f5653a) && this.f5654b.equals(y0Var.f5654b);
        }
        return false;
    }

    public int hashCode() {
        return z3.n.b(this.f5654b, this.f5653a);
    }
}
