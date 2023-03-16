package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class d extends k.d {

    /* renamed from: b  reason: collision with root package name */
    private final i2 f9084b;

    public d(l8.c cVar, i2 i2Var) {
        super(cVar);
        this.f9084b = i2Var;
    }

    private long i(DownloadListener downloadListener) {
        Long g10 = this.f9084b.g(downloadListener);
        if (g10 != null) {
            return g10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for DownloadListener.");
    }

    public void h(DownloadListener downloadListener, k.d.a<Void> aVar) {
        if (this.f9084b.f(downloadListener)) {
            c(Long.valueOf(i(downloadListener)), aVar);
        } else {
            aVar.a(null);
        }
    }

    public void j(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j10, k.d.a<Void> aVar) {
        g(Long.valueOf(i(downloadListener)), str, str2, str3, str4, Long.valueOf(j10), aVar);
    }
}
