package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
/* loaded from: classes.dex */
final class q2 extends View {

    /* renamed from: n  reason: collision with root package name */
    final Handler f9213n;

    /* renamed from: o  reason: collision with root package name */
    final IBinder f9214o;

    /* renamed from: p  reason: collision with root package name */
    final View f9215p;

    /* renamed from: q  reason: collision with root package name */
    final View f9216q;

    /* renamed from: r  reason: collision with root package name */
    final View f9217r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9218s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9219t;

    /* renamed from: u  reason: collision with root package name */
    private InputConnection f9220u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(View view, View view2, Handler handler) {
        super(view.getContext());
        this.f9218s = true;
        this.f9219t = false;
        this.f9213n = handler;
        this.f9215p = view;
        this.f9217r = view2;
        this.f9214o = view.getWindowToken();
        this.f9216q = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f9219t = z10;
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.f9213n;
    }

    @Override // android.view.View
    public View getRootView() {
        return this.f9216q;
    }

    @Override // android.view.View
    public IBinder getWindowToken() {
        return this.f9214o;
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return true;
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        this.f9218s = false;
        InputConnection onCreateInputConnection = this.f9219t ? this.f9220u : this.f9217r.onCreateInputConnection(editorInfo);
        this.f9218s = true;
        this.f9220u = onCreateInputConnection;
        return onCreateInputConnection;
    }
}
