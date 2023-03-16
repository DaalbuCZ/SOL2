package com.google.android.gms.internal.measurement;

import android.net.Uri;
/* loaded from: classes.dex */
public final class r6 {

    /* renamed from: a  reason: collision with root package name */
    private static final m.a f4115a = new m.a();

    public static synchronized Uri a(String str) {
        synchronized (r6.class) {
            m.a aVar = f4115a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                aVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
