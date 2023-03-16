package io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class s2 implements k.q {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9239a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9240b;

    /* renamed from: c  reason: collision with root package name */
    private final r2 f9241c;

    /* loaded from: classes.dex */
    public static class a {
        public b a(r2 r2Var, WebViewClient webViewClient) {
            return new b(r2Var, webViewClient);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends WebChromeClient implements p2 {

        /* renamed from: n  reason: collision with root package name */
        private r2 f9242n;

        /* renamed from: o  reason: collision with root package name */
        private WebViewClient f9243o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends WebViewClient {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f9244a;

            a(WebView webView) {
                this.f9244a = webView;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (b.this.f9243o.shouldOverrideUrlLoading(this.f9244a, webResourceRequest)) {
                    return true;
                }
                this.f9244a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (b.this.f9243o.shouldOverrideUrlLoading(this.f9244a, str)) {
                    return true;
                }
                this.f9244a.loadUrl(str);
                return true;
            }
        }

        public b(r2 r2Var, WebViewClient webViewClient) {
            this.f9242n = r2Var;
            this.f9243o = webViewClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            r2 r2Var = this.f9242n;
            if (r2Var != null) {
                r2Var.h(this, u2.f9251a);
            }
            this.f9242n = null;
        }

        boolean g(WebView webView, Message message, WebView webView2) {
            a aVar = new a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void h(WebViewClient webViewClient) {
            this.f9243o = webViewClient;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            return g(webView, message, new WebView(webView.getContext()));
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            r2 r2Var = this.f9242n;
            if (r2Var != null) {
                r2Var.j(this, webView, Long.valueOf(i10), t2.f9249a);
            }
        }
    }

    public s2(i2 i2Var, a aVar, r2 r2Var) {
        this.f9239a = i2Var;
        this.f9240b = aVar;
        this.f9241c = r2Var;
    }

    @Override // io.flutter.plugins.webviewflutter.k.q
    public void b(Long l10, Long l11) {
        this.f9239a.b(this.f9240b.a(this.f9241c, (WebViewClient) this.f9239a.h(l11.longValue())), l10.longValue());
    }
}
