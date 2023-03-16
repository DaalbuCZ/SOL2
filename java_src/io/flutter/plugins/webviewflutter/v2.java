package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class v2 implements k.u {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9255a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9256b;

    /* loaded from: classes.dex */
    public static class a {
        public WebSettings a(WebView webView) {
            return webView.getSettings();
        }
    }

    public v2(i2 i2Var, a aVar) {
        this.f9255a = i2Var;
        this.f9256b = aVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void a(Long l10) {
        this.f9255a.k(l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void b(Long l10, Long l11) {
        this.f9255a.b(this.f9256b.a((WebView) this.f9255a.h(l11.longValue())), l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void c(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setJavaScriptEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void d(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setDomStorageEnabled(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void e(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setDisplayZoomControls(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void f(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void g(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setSupportMultipleWindows(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void h(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setAllowFileAccess(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void i(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setSupportZoom(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void j(Long l10, String str) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setUserAgentString(str);
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void k(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setLoadWithOverviewMode(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void l(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setUseWideViewPort(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void m(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.u
    public void n(Long l10, Boolean bool) {
        ((WebSettings) this.f9255a.h(l10.longValue())).setBuiltInZoomControls(bool.booleanValue());
    }
}
