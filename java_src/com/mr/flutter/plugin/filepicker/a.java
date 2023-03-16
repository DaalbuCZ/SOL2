package com.mr.flutter.plugin.filepicker;

import android.net.Uri;
import java.util.HashMap;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final String f6261a;

    /* renamed from: b  reason: collision with root package name */
    final String f6262b;

    /* renamed from: c  reason: collision with root package name */
    final Uri f6263c;

    /* renamed from: d  reason: collision with root package name */
    final long f6264d;

    /* renamed from: e  reason: collision with root package name */
    final byte[] f6265e;

    /* renamed from: com.mr.flutter.plugin.filepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0088a {

        /* renamed from: a  reason: collision with root package name */
        private String f6266a;

        /* renamed from: b  reason: collision with root package name */
        private String f6267b;

        /* renamed from: c  reason: collision with root package name */
        private Uri f6268c;

        /* renamed from: d  reason: collision with root package name */
        private long f6269d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f6270e;

        public a a() {
            return new a(this.f6266a, this.f6267b, this.f6268c, this.f6269d, this.f6270e);
        }

        public C0088a b(byte[] bArr) {
            this.f6270e = bArr;
            return this;
        }

        public C0088a c(String str) {
            this.f6267b = str;
            return this;
        }

        public C0088a d(String str) {
            this.f6266a = str;
            return this;
        }

        public C0088a e(long j10) {
            this.f6269d = j10;
            return this;
        }

        public C0088a f(Uri uri) {
            this.f6268c = uri;
            return this;
        }
    }

    public a(String str, String str2, Uri uri, long j10, byte[] bArr) {
        this.f6261a = str;
        this.f6262b = str2;
        this.f6264d = j10;
        this.f6265e = bArr;
        this.f6263c = uri;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("path", this.f6261a);
        hashMap.put("name", this.f6262b);
        hashMap.put("size", Long.valueOf(this.f6264d));
        hashMap.put("bytes", this.f6265e);
        hashMap.put("identifier", this.f6263c.toString());
        return hashMap;
    }
}
