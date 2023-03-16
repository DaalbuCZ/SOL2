package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;
/* loaded from: classes.dex */
class g2 extends WebView {

    /* renamed from: n  reason: collision with root package name */
    private View f9105n;

    /* renamed from: o  reason: collision with root package name */
    private q2 f9106o;

    /* renamed from: p  reason: collision with root package name */
    private View f9107p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f9108n;

        a(View view) {
            this.f9108n = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g2.this.f9107p == null) {
                Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
                return;
            }
            this.f9108n.onWindowFocusChanged(true);
            ((InputMethodManager) g2.this.getContext().getSystemService("input_method")).isActive(g2.this.f9107p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g2(Context context, View view) {
        super(context);
        this.f9107p = view;
    }

    private boolean c() {
        StackTraceElement[] stackTrace;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTraceElement.getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }

    private void j() {
        if (this.f9106o == null) {
            return;
        }
        View view = this.f9107p;
        if (view == null) {
            Log.e("InputAwareWebView", "Can't reset the input connection to the container view because there is none.");
        } else {
            setInputConnectionTarget(view);
        }
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.f9105n;
        this.f9105n = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.f9107p;
        if (view3 == null) {
            Log.e("InputAwareWebView", "Can't create a proxy view because there's no container view. Text input may not work.");
        } else {
            q2 q2Var = new q2(view3, view, view.getHandler());
            this.f9106o = q2Var;
            setInputConnectionTarget(q2Var);
        }
        return super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.clearFocus();
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        q2 q2Var = this.f9106o;
        if (q2Var == null) {
            return;
        }
        q2Var.a(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        q2 q2Var = this.f9106o;
        if (q2Var == null) {
            return;
        }
        q2Var.a(false);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28 || !c() || z10) {
            super.onFocusChanged(z10, i10, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContainerView(View view) {
        this.f9107p = view;
        if (this.f9106o == null) {
            return;
        }
        Log.w("InputAwareWebView", "The containerView has changed while the proxyAdapterView exists.");
        if (view != null) {
            setInputConnectionTarget(this.f9106o);
        }
    }

    void setInputConnectionTarget(View view) {
        if (this.f9107p == null) {
            Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
            return;
        }
        view.requestFocus();
        this.f9107p.post(new a(view));
    }
}
