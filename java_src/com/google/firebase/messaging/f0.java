package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class f0 implements Closeable {

    /* renamed from: n  reason: collision with root package name */
    private final URL f5531n;

    /* renamed from: o  reason: collision with root package name */
    private volatile Future<?> f5532o;

    /* renamed from: p  reason: collision with root package name */
    private t4.i<Bitmap> f5533p;

    private f0(URL url) {
        this.f5531n = url;
    }

    private byte[] c() {
        URLConnection openConnection = this.f5531n.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d10 = b.d(b.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d10.length + " bytes from " + this.f5531n);
                }
                if (d10.length <= 1048576) {
                    return d10;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static f0 f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new f0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(t4.j jVar) {
        try {
            jVar.c(b());
        } catch (Exception e10) {
            jVar.b(e10);
        }
    }

    public Bitmap b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f5531n);
        }
        byte[] c10 = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c10, 0, c10.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f5531n);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f5531n);
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5532o.cancel(true);
    }

    public t4.i<Bitmap> j() {
        return (t4.i) z3.o.i(this.f5533p);
    }

    public void o(ExecutorService executorService) {
        final t4.j jVar = new t4.j();
        this.f5532o = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.e0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.k(jVar);
            }
        });
        this.f5533p = jVar.a();
    }
}
