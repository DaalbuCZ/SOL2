package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.e;
import io.flutter.plugins.webviewflutter.k;
import io.flutter.plugins.webviewflutter.s2;
import io.flutter.plugins.webviewflutter.y2;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class q3 implements k.c0 {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9221a;

    /* renamed from: b  reason: collision with root package name */
    private final d f9222b;

    /* renamed from: c  reason: collision with root package name */
    private final View f9223c;

    /* renamed from: d  reason: collision with root package name */
    private Context f9224d;

    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes.dex */
    public static class a extends g2 implements io.flutter.plugin.platform.f, p2 {

        /* renamed from: q  reason: collision with root package name */
        private final b<y2.a> f9225q;

        /* renamed from: r  reason: collision with root package name */
        private final b<e.b> f9226r;

        /* renamed from: s  reason: collision with root package name */
        private final b<s2.b> f9227s;

        /* renamed from: t  reason: collision with root package name */
        private final Map<String, b<m2>> f9228t;

        public a(Context context, View view) {
            super(context, view);
            this.f9225q = new b<>();
            this.f9226r = new b<>();
            this.f9227s = new b<>();
            this.f9228t = new HashMap();
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            this.f9225q.b();
            this.f9226r.b();
            this.f9227s.b();
            for (b<m2> bVar : this.f9228t.values()) {
                bVar.b();
            }
            this.f9228t.clear();
        }

        @Override // android.webkit.WebView
        @SuppressLint({"JavascriptInterface"})
        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof m2) {
                b<m2> bVar = this.f9228t.get(str);
                if (bVar != null && bVar.a() != obj) {
                    bVar.b();
                }
                this.f9228t.put(str, new b<>((m2) obj));
            }
        }

        @Override // io.flutter.plugins.webviewflutter.g2, android.view.View
        public /* bridge */ /* synthetic */ boolean checkInputConnectionProxy(View view) {
            return super.checkInputConnectionProxy(view);
        }

        @Override // io.flutter.plugins.webviewflutter.g2, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ void clearFocus() {
            super.clearFocus();
        }

        @Override // io.flutter.plugins.webviewflutter.g2, io.flutter.plugin.platform.f
        public void e() {
            super.e();
            destroy();
        }

        @Override // io.flutter.plugin.platform.f
        public void f() {
            k();
        }

        @Override // io.flutter.plugin.platform.f
        public void g(View view) {
            setContainerView(view);
        }

        @Override // io.flutter.plugin.platform.f
        public View getView() {
            return this;
        }

        @Override // io.flutter.plugin.platform.f
        public void h() {
            setContainerView(null);
        }

        @Override // io.flutter.plugin.platform.f
        public void i() {
            d();
        }

        @Override // android.webkit.WebView
        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.f9228t.get(str).b();
            this.f9228t.remove(str);
        }

        @Override // android.webkit.WebView
        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.f9226r.c((e.b) downloadListener);
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.f9227s.c((s2.b) webChromeClient);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f9225q.c((y2.a) webViewClient);
            s2.b a10 = this.f9227s.a();
            if (a10 != null) {
                a10.h(webViewClient);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b<T extends p2> {

        /* renamed from: a  reason: collision with root package name */
        private T f9229a;

        b() {
        }

        b(T t10) {
            this.f9229a = t10;
        }

        T a() {
            return this.f9229a;
        }

        void b() {
            T t10 = this.f9229a;
            if (t10 != null) {
                t10.a();
            }
            this.f9229a = null;
        }

        void c(T t10) {
            b();
            this.f9229a = t10;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends WebView implements io.flutter.plugin.platform.f, p2 {

        /* renamed from: n  reason: collision with root package name */
        private final b<y2.a> f9230n;

        /* renamed from: o  reason: collision with root package name */
        private final b<e.b> f9231o;

        /* renamed from: p  reason: collision with root package name */
        private final b<s2.b> f9232p;

        /* renamed from: q  reason: collision with root package name */
        private final Map<String, b<m2>> f9233q;

        public c(Context context) {
            super(context);
            this.f9230n = new b<>();
            this.f9231o = new b<>();
            this.f9232p = new b<>();
            this.f9233q = new HashMap();
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            this.f9230n.b();
            this.f9231o.b();
            this.f9232p.b();
            for (b<m2> bVar : this.f9233q.values()) {
                bVar.b();
            }
            this.f9233q.clear();
        }

        @Override // android.webkit.WebView
        @SuppressLint({"JavascriptInterface"})
        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof m2) {
                b<m2> bVar = this.f9233q.get(str);
                if (bVar != null && bVar.a() != obj) {
                    bVar.b();
                }
                this.f9233q.put(str, new b<>((m2) obj));
            }
        }

        @Override // io.flutter.plugin.platform.f
        public void e() {
            destroy();
        }

        @Override // io.flutter.plugin.platform.f
        public /* synthetic */ void f() {
            io.flutter.plugin.platform.e.d(this);
        }

        @Override // io.flutter.plugin.platform.f
        public /* synthetic */ void g(View view) {
            io.flutter.plugin.platform.e.a(this, view);
        }

        @Override // io.flutter.plugin.platform.f
        public View getView() {
            return this;
        }

        @Override // io.flutter.plugin.platform.f
        public /* synthetic */ void h() {
            io.flutter.plugin.platform.e.b(this);
        }

        @Override // io.flutter.plugin.platform.f
        public /* synthetic */ void i() {
            io.flutter.plugin.platform.e.c(this);
        }

        @Override // android.webkit.WebView
        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.f9233q.get(str).b();
            this.f9233q.remove(str);
        }

        @Override // android.webkit.WebView
        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.f9231o.c((e.b) downloadListener);
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.f9232p.c((s2.b) webChromeClient);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f9230n.c((y2.a) webViewClient);
            s2.b a10 = this.f9232p.a();
            if (a10 != null) {
                a10.h(webViewClient);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public a a(Context context, View view) {
            return new a(context, view);
        }

        public c b(Context context) {
            return new c(context);
        }

        public void c(boolean z10) {
            WebView.setWebContentsDebuggingEnabled(z10);
        }
    }

    public q3(i2 i2Var, d dVar, Context context, View view) {
        this.f9221a = i2Var;
        this.f9222b = dVar;
        this.f9224d = context;
        this.f9223c = view;
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void A(Long l10, Long l11) {
        ((WebView) this.f9221a.h(l10.longValue())).setWebViewClient((WebViewClient) this.f9221a.h(l11.longValue()));
    }

    public void B(Context context) {
        this.f9224d = context;
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void a(Long l10) {
        WebView webView = (WebView) this.f9221a.h(l10.longValue());
        if (webView != null) {
            ((p2) webView).a();
            this.f9221a.k(l10.longValue());
        }
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void b(Long l10, Boolean bool) {
        io.flutter.plugins.webviewflutter.c cVar = new io.flutter.plugins.webviewflutter.c();
        DisplayManager displayManager = (DisplayManager) this.f9224d.getSystemService("display");
        cVar.b(displayManager);
        Object b10 = bool.booleanValue() ? this.f9222b.b(this.f9224d) : this.f9222b.a(this.f9224d, this.f9223c);
        cVar.a(displayManager);
        this.f9221a.b(b10, l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Long c(Long l10) {
        return Long.valueOf(((WebView) this.f9221a.h(l10.longValue())).getScrollX());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public String d(Long l10) {
        return ((WebView) this.f9221a.h(l10.longValue())).getTitle();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void e(Long l10, String str, String str2, String str3) {
        ((WebView) this.f9221a.h(l10.longValue())).loadData(str, str2, str3);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void f(Long l10) {
        ((WebView) this.f9221a.h(l10.longValue())).reload();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void g(Long l10, Long l11) {
        m2 m2Var = (m2) this.f9221a.h(l11.longValue());
        ((WebView) this.f9221a.h(l10.longValue())).addJavascriptInterface(m2Var, m2Var.f9186o);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Boolean h(Long l10) {
        return Boolean.valueOf(((WebView) this.f9221a.h(l10.longValue())).canGoForward());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void i(Long l10, String str, String str2, String str3, String str4, String str5) {
        ((WebView) this.f9221a.h(l10.longValue())).loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void j(Long l10) {
        ((WebView) this.f9221a.h(l10.longValue())).goBack();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void k(Long l10, Long l11) {
        ((WebView) this.f9221a.h(l10.longValue())).setBackgroundColor(l11.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void l(Long l10, Long l11) {
        ((WebView) this.f9221a.h(l10.longValue())).setDownloadListener((DownloadListener) this.f9221a.h(l11.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void m(Boolean bool) {
        this.f9222b.c(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void n(Long l10, Long l11) {
        ((WebView) this.f9221a.h(l10.longValue())).setWebChromeClient((WebChromeClient) this.f9221a.h(l11.longValue()));
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void o(Long l10) {
        ((WebView) this.f9221a.h(l10.longValue())).goForward();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void p(Long l10, String str, Map<String, String> map) {
        ((WebView) this.f9221a.h(l10.longValue())).loadUrl(str, map);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Boolean q(Long l10) {
        return Boolean.valueOf(((WebView) this.f9221a.h(l10.longValue())).canGoBack());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void r(Long l10, Boolean bool) {
        ((WebView) this.f9221a.h(l10.longValue())).clearCache(bool.booleanValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public String s(Long l10) {
        return ((WebView) this.f9221a.h(l10.longValue())).getUrl();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void t(Long l10, String str, byte[] bArr) {
        ((WebView) this.f9221a.h(l10.longValue())).postUrl(str, bArr);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void u(Long l10, String str, final k.n<String> nVar) {
        Objects.requireNonNull(nVar);
        ((WebView) this.f9221a.h(l10.longValue())).evaluateJavascript(str, new ValueCallback() { // from class: io.flutter.plugins.webviewflutter.p3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                k.n.this.a((String) obj);
            }
        });
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void v(Long l10, Long l11, Long l12) {
        ((WebView) this.f9221a.h(l10.longValue())).scrollTo(l11.intValue(), l12.intValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void w(Long l10, Long l11) {
        ((WebView) this.f9221a.h(l10.longValue())).removeJavascriptInterface(((m2) this.f9221a.h(l11.longValue())).f9186o);
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public Long x(Long l10) {
        return Long.valueOf(((WebView) this.f9221a.h(l10.longValue())).getScrollY());
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public k.e0 y(Long l10) {
        WebView webView = (WebView) this.f9221a.h(l10.longValue());
        Objects.requireNonNull(webView);
        return new k.e0.a().b(Long.valueOf(webView.getScrollX())).c(Long.valueOf(webView.getScrollY())).a();
    }

    @Override // io.flutter.plugins.webviewflutter.k.c0
    public void z(Long l10, Long l11, Long l12) {
        ((WebView) this.f9221a.h(l10.longValue())).scrollBy(l11.intValue(), l12.intValue());
    }
}
