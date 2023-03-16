package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.k;
import java.util.HashMap;
/* loaded from: classes.dex */
public class x2 extends k.y {

    /* renamed from: b  reason: collision with root package name */
    private final i2 f9265b;

    public x2(l8.c cVar, i2 i2Var) {
        super(cVar);
        this.f9265b = i2Var;
    }

    private long A(WebViewClient webViewClient) {
        Long g10 = this.f9265b.g(webViewClient);
        if (g10 != null) {
            return g10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebViewClient.");
    }

    static k.s w(WebResourceError webResourceError) {
        return new k.s.a().c(Long.valueOf(webResourceError.getErrorCode())).b(webResourceError.getDescription().toString()).a();
    }

    @SuppressLint({"RequiresFeature"})
    static k.s x(g0.e eVar) {
        return new k.s.a().c(Long.valueOf(eVar.b())).b(eVar.a().toString()).a();
    }

    static k.t y(WebResourceRequest webResourceRequest) {
        k.t.a f10 = new k.t.a().g(webResourceRequest.getUrl().toString()).c(Boolean.valueOf(webResourceRequest.isForMainFrame())).b(Boolean.valueOf(webResourceRequest.hasGesture())).e(webResourceRequest.getMethod()).f(webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders() : new HashMap<>());
        if (Build.VERSION.SDK_INT >= 24) {
            f10.d(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        return f10.a();
    }

    public void B(WebViewClient webViewClient, WebView webView, String str, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        q(Long.valueOf(A(webViewClient)), g10, str, aVar);
    }

    public void C(WebViewClient webViewClient, WebView webView, String str, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        r(Long.valueOf(A(webViewClient)), g10, str, aVar);
    }

    public void D(WebViewClient webViewClient, WebView webView, Long l10, String str, String str2, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        s(Long.valueOf(A(webViewClient)), g10, l10, str, str2, aVar);
    }

    public void E(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        t(Long.valueOf(A(webViewClient)), g10, y(webResourceRequest), w(webResourceError), aVar);
    }

    public void F(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, g0.e eVar, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        t(Long.valueOf(A(webViewClient)), g10, y(webResourceRequest), x(eVar), aVar);
    }

    public void G(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        u(Long.valueOf(A(webViewClient)), g10, y(webResourceRequest), aVar);
    }

    public void H(WebViewClient webViewClient, WebView webView, String str, k.y.a<Void> aVar) {
        Long g10 = this.f9265b.g(webView);
        if (g10 == null) {
            throw new IllegalStateException("Could not find identifier for WebView.");
        }
        v(Long.valueOf(A(webViewClient)), g10, str, aVar);
    }

    public void z(WebViewClient webViewClient, k.y.a<Void> aVar) {
        if (this.f9265b.f(webViewClient)) {
            h(Long.valueOf(A(webViewClient)), aVar);
        } else {
            aVar.a(null);
        }
    }
}
