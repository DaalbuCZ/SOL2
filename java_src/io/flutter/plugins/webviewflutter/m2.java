package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
/* loaded from: classes.dex */
public class m2 implements p2 {

    /* renamed from: n  reason: collision with root package name */
    private final Handler f9185n;

    /* renamed from: o  reason: collision with root package name */
    final String f9186o;

    /* renamed from: p  reason: collision with root package name */
    private n2 f9187p;

    public m2(n2 n2Var, String str, Handler handler) {
        this.f9187p = n2Var;
        this.f9186o = str;
        this.f9185n = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Void r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        n2 n2Var = this.f9187p;
        if (n2Var != null) {
            n2Var.j(this, str, j2.f9133a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Void r02) {
    }

    @Override // io.flutter.plugins.webviewflutter.p2
    public void a() {
        n2 n2Var = this.f9187p;
        if (n2Var != null) {
            n2Var.h(this, k2.f9174a);
        }
        this.f9187p = null;
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        Runnable runnable = new Runnable() { // from class: io.flutter.plugins.webviewflutter.l2
            @Override // java.lang.Runnable
            public final void run() {
                m2.this.f(str);
            }
        };
        if (this.f9185n.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f9185n.post(runnable);
        }
    }
}
