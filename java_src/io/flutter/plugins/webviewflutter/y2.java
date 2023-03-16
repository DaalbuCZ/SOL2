package io.flutter.plugins.webviewflutter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class y2 implements k.a0 {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9268a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9269b;

    /* renamed from: c  reason: collision with root package name */
    private final x2 f9270c;

    /* loaded from: classes.dex */
    public interface a extends p2 {
    }

    /* loaded from: classes.dex */
    public static class b extends WebViewClientCompat implements a {

        /* renamed from: o  reason: collision with root package name */
        private x2 f9271o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f9272p;

        public b(x2 x2Var, boolean z10) {
            this.f9272p = z10;
            this.f9271o = x2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void l(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void p(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void q(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.z(this, e3.f9095a);
            }
            this.f9271o = null;
        }

        @Override // androidx.webkit.WebViewClientCompat
        @SuppressLint({"RequiresFeature"})
        public void b(WebView webView, WebResourceRequest webResourceRequest, g0.e eVar) {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.F(this, webView, webResourceRequest, eVar, d3.f9087a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.B(this, webView, str, z2.f9278a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.C(this, webView, str, b3.f9076a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.D(this, webView, Long.valueOf(i10), str, str2, c3.f9083a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.G(this, webView, webResourceRequest, a3.f9072a);
            }
            return this.f9272p;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            x2 x2Var = this.f9271o;
            if (x2Var != null) {
                x2Var.H(this, webView, str, f3.f9101a);
            }
            return this.f9272p;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public WebViewClient a(x2 x2Var, boolean z10) {
            return Build.VERSION.SDK_INT >= 24 ? new d(x2Var, z10) : new b(x2Var, z10);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends WebViewClient implements a {

        /* renamed from: n  reason: collision with root package name */
        private x2 f9273n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f9274o;

        public d(x2 x2Var, boolean z10) {
            this.f9274o = z10;
            this.f9273n = x2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void i(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void j(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void k(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void l(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void m(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.z(this, m3.f9188a);
            }
            this.f9273n = null;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.B(this, webView, str, h3.f9116a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.C(this, webView, str, g3.f9110a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.D(this, webView, Long.valueOf(i10), str, str2, k3.f9175a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.E(this, webView, webResourceRequest, webResourceError, j3.f9134a);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.G(this, webView, webResourceRequest, i3.f9129a);
            }
            return this.f9274o;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            x2 x2Var = this.f9273n;
            if (x2Var != null) {
                x2Var.H(this, webView, str, l3.f9181a);
            }
            return this.f9274o;
        }
    }

    public y2(i2 i2Var, c cVar, x2 x2Var) {
        this.f9268a = i2Var;
        this.f9269b = cVar;
        this.f9270c = x2Var;
    }

    @Override // io.flutter.plugins.webviewflutter.k.a0
    public void b(Long l10, Boolean bool) {
        this.f9268a.b(this.f9269b.a(this.f9270c, bool.booleanValue()), l10.longValue());
    }
}
