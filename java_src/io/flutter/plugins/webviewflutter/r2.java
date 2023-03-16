package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class r2 extends k.o {

    /* renamed from: b  reason: collision with root package name */
    private final i2 f9235b;

    public r2(l8.c cVar, i2 i2Var) {
        super(cVar);
        this.f9235b = i2Var;
    }

    private long i(WebChromeClient webChromeClient) {
        Long g10 = this.f9235b.g(webChromeClient);
        if (g10 != null) {
            return g10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    public void h(WebChromeClient webChromeClient, k.o.a<Void> aVar) {
        if (this.f9235b.f(webChromeClient)) {
            c(Long.valueOf(i(webChromeClient)), aVar);
        } else {
            aVar.a(null);
        }
    }

    public void j(WebChromeClient webChromeClient, WebView webView, Long l10, k.o.a<Void> aVar) {
        Long g10 = this.f9235b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        super.g(Long.valueOf(i(webChromeClient)), g10, l10, aVar);
    }
}
