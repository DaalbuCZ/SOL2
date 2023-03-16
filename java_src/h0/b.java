package h0;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import g0.d;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    class a extends WebMessagePort.WebMessageCallback {
        a(d.a aVar) {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new h(webMessagePort);
            h.c(webMessage);
            throw null;
        }
    }

    /* renamed from: h0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0117b extends WebMessagePort.WebMessageCallback {
        C0117b(d.a aVar) {
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            new h(webMessagePort);
            h.c(webMessage);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    class c extends WebView.VisualStateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0.f f7643a;

        c(g0.f fVar) {
            this.f7643a = fVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            this.f7643a.onComplete(j10);
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(g0.c cVar) {
        return new WebMessage(cVar.a(), h.b(cVar.b()));
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static g0.c d(WebMessage webMessage) {
        return new g0.c(webMessage.getData(), h.e(webMessage.getPorts()));
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, g0.f fVar) {
        webView.postVisualStateCallback(j10, new c(fVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, d.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, d.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C0117b(aVar), handler);
    }
}
