package io.flutter.plugins.urllauncher;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: r  reason: collision with root package name */
    public static String f9056r = "close action";

    /* renamed from: s  reason: collision with root package name */
    private static String f9057s = "url";

    /* renamed from: t  reason: collision with root package name */
    private static String f9058t = "enableJavaScript";

    /* renamed from: u  reason: collision with root package name */
    private static String f9059u = "enableDomStorage";

    /* renamed from: p  reason: collision with root package name */
    private WebView f9062p;

    /* renamed from: n  reason: collision with root package name */
    private final BroadcastReceiver f9060n = new a();

    /* renamed from: o  reason: collision with root package name */
    private final WebViewClient f9061o = new b();

    /* renamed from: q  reason: collision with root package name */
    private IntentFilter f9063q = new IntentFilter(f9056r);

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f9056r.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                return false;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21) {
                webView.loadUrl(str);
                return false;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: classes.dex */
    private class c extends WebChromeClient {

        /* loaded from: classes.dex */
        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f9062p.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f9062p.loadUrl(str);
                return true;
            }
        }

        private c() {
        }

        /* synthetic */ c(WebViewActivity webViewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f9062p.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent b(Context context, String str, boolean z10, boolean z11, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(f9057s, str).putExtra(f9058t, z10).putExtra(f9059u, z11).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> c(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f9062p = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f9057s);
        boolean booleanExtra = intent.getBooleanExtra(f9058t, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f9059u, false);
        this.f9062p.loadUrl(stringExtra, c(intent.getBundleExtra("com.android.browser.headers")));
        this.f9062p.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f9062p.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f9062p.setWebViewClient(this.f9061o);
        this.f9062p.getSettings().setSupportMultipleWindows(true);
        this.f9062p.setWebChromeClient(new c(this, null));
        registerReceiver(this.f9060n, this.f9063q);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f9060n);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f9062p.canGoBack()) {
            this.f9062p.goBack();
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }
}
