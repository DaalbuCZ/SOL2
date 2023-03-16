package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.c;
import java.util.Arrays;
import java.util.List;
import y7.a;
/* loaded from: classes.dex */
class e implements io.flutter.embedding.android.c<Activity> {

    /* renamed from: a  reason: collision with root package name */
    private c f8480a;

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.engine.a f8481b;

    /* renamed from: c  reason: collision with root package name */
    k f8482c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.plugin.platform.c f8483d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f8484e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8485f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8486g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8488i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f8489j;

    /* renamed from: k  reason: collision with root package name */
    private final j8.b f8490k = new a();

    /* renamed from: h  reason: collision with root package name */
    private boolean f8487h = false;

    /* loaded from: classes.dex */
    class a implements j8.b {
        a() {
        }

        @Override // j8.b
        public void d() {
            e.this.f8480a.d();
            e.this.f8486g = false;
        }

        @Override // j8.b
        public void g() {
            e.this.f8480a.g();
            e.this.f8486g = true;
            e.this.f8487h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ k f8492n;

        b(k kVar) {
            this.f8492n = kVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (e.this.f8486g && e.this.f8484e != null) {
                this.f8492n.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f8484e = null;
            }
            return e.this.f8486g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c extends c.d {
        io.flutter.embedding.engine.a A(Context context);

        y B();

        void C(i iVar);

        void D(io.flutter.embedding.engine.a aVar);

        androidx.lifecycle.e a();

        Context b();

        void d();

        Activity e();

        void f();

        void g();

        String h();

        List<String> k();

        boolean l();

        boolean m();

        boolean n();

        String o();

        boolean p();

        String q();

        void r(io.flutter.embedding.engine.a aVar);

        String s();

        io.flutter.plugin.platform.c t(Activity activity, io.flutter.embedding.engine.a aVar);

        void u(h hVar);

        String v();

        boolean w();

        io.flutter.embedding.engine.e x();

        v y();

        x z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(c cVar) {
        this.f8480a = cVar;
    }

    private void e(k kVar) {
        if (this.f8480a.y() != v.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f8484e != null) {
            kVar.getViewTreeObserver().removeOnPreDrawListener(this.f8484e);
        }
        this.f8484e = new b(kVar);
        kVar.getViewTreeObserver().addOnPreDrawListener(this.f8484e);
    }

    private void h() {
        String str;
        if (this.f8480a.o() == null && !this.f8481b.h().n()) {
            String h10 = this.f8480a.h();
            if (h10 == null && (h10 = n(this.f8480a.e().getIntent())) == null) {
                h10 = "/";
            }
            String s10 = this.f8480a.s();
            if (("Executing Dart entrypoint: " + this.f8480a.q() + ", library uri: " + s10) == null) {
                str = "\"\"";
            } else {
                str = s10 + ", and sending initial route: " + h10;
            }
            x7.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f8481b.l().c(h10);
            String v10 = this.f8480a.v();
            if (v10 == null || v10.isEmpty()) {
                v10 = x7.a.e().c().i();
            }
            this.f8481b.h().k(s10 == null ? new a.c(v10, this.f8480a.q()) : new a.c(v10, s10, this.f8480a.q()), this.f8480a.k());
        }
    }

    private void i() {
        if (this.f8480a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String n(Intent intent) {
        Uri data;
        String path;
        if (!this.f8480a.w() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(Bundle bundle) {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        i();
        if (this.f8480a.p()) {
            bundle.putByteArray("framework", this.f8481b.q().h());
        }
        if (this.f8480a.l()) {
            Bundle bundle2 = new Bundle();
            this.f8481b.g().c(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        i();
        h();
        Integer num = this.f8489j;
        if (num != null) {
            this.f8482c.setVisibility(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        i();
        if (this.f8480a.n()) {
            this.f8481b.i().c();
        }
        this.f8489j = Integer.valueOf(this.f8482c.getVisibility());
        this.f8482c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(int i10) {
        i();
        io.flutter.embedding.engine.a aVar = this.f8481b;
        if (aVar != null) {
            if (this.f8487h && i10 >= 10) {
                aVar.h().o();
                this.f8481b.t().a();
            }
            this.f8481b.p().n(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        i();
        if (this.f8481b == null) {
            x7.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        x7.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
        this.f8481b.g().d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.f8480a = null;
        this.f8481b = null;
        this.f8482c = null;
        this.f8483d = null;
    }

    void G() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String o10 = this.f8480a.o();
        if (o10 != null) {
            io.flutter.embedding.engine.a a10 = io.flutter.embedding.engine.b.b().a(o10);
            this.f8481b = a10;
            this.f8485f = true;
            if (a10 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + o10 + "'");
        }
        c cVar = this.f8480a;
        io.flutter.embedding.engine.a A = cVar.A(cVar.b());
        this.f8481b = A;
        if (A != null) {
            this.f8485f = true;
            return;
        }
        x7.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f8481b = new io.flutter.embedding.engine.a(this.f8480a.b(), this.f8480a.x().b(), false, this.f8480a.p());
        this.f8485f = false;
    }

    void H() {
        io.flutter.plugin.platform.c cVar = this.f8483d;
        if (cVar != null) {
            cVar.A();
        }
    }

    @Override // io.flutter.embedding.android.c
    public void f() {
        if (!this.f8480a.m()) {
            this.f8480a.f();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f8480a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.c
    /* renamed from: j */
    public Activity g() {
        Activity e10 = this.f8480a.e();
        if (e10 != null) {
            return e10;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.flutter.embedding.engine.a k() {
        return this.f8481b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f8488i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f8485f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i10, int i11, Intent intent) {
        i();
        if (this.f8481b == null) {
            x7.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        x7.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
        this.f8481b.g().a(i10, i11, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Context context) {
        i();
        if (this.f8481b == null) {
            G();
        }
        if (this.f8480a.l()) {
            x7.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f8481b.g().e(this, this.f8480a.a());
        }
        c cVar = this.f8480a;
        this.f8483d = cVar.t(cVar.e(), this.f8481b);
        this.f8480a.D(this.f8481b);
        this.f8488i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        i();
        if (this.f8481b == null) {
            x7.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            return;
        }
        x7.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
        this.f8481b.l().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i10, boolean z10) {
        k kVar;
        x7.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        i();
        if (this.f8480a.y() == v.surface) {
            h hVar = new h(this.f8480a.b(), this.f8480a.B() == y.transparent);
            this.f8480a.u(hVar);
            kVar = new k(this.f8480a.b(), hVar);
        } else {
            i iVar = new i(this.f8480a.b());
            iVar.setOpaque(this.f8480a.B() == y.opaque);
            this.f8480a.C(iVar);
            kVar = new k(this.f8480a.b(), iVar);
        }
        this.f8482c = kVar;
        this.f8482c.l(this.f8490k);
        x7.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f8482c.n(this.f8481b);
        this.f8482c.setId(i10);
        x z11 = this.f8480a.z();
        if (z11 == null) {
            if (z10) {
                e(this.f8482c);
            }
            return this.f8482c;
        }
        x7.b.g("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f8480a.b());
        flutterSplashView.setId(w8.h.d(486947586));
        flutterSplashView.g(this.f8482c, z11);
        return flutterSplashView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        i();
        if (this.f8484e != null) {
            this.f8482c.getViewTreeObserver().removeOnPreDrawListener(this.f8484e);
            this.f8484e = null;
        }
        this.f8482c.s();
        this.f8482c.z(this.f8490k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        i();
        this.f8480a.r(this.f8481b);
        if (this.f8480a.l()) {
            x7.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f8480a.e().isChangingConfigurations()) {
                this.f8481b.g().f();
            } else {
                this.f8481b.g().h();
            }
        }
        io.flutter.plugin.platform.c cVar = this.f8483d;
        if (cVar != null) {
            cVar.o();
            this.f8483d = null;
        }
        if (this.f8480a.n()) {
            this.f8481b.i().a();
        }
        if (this.f8480a.m()) {
            this.f8481b.e();
            if (this.f8480a.o() != null) {
                io.flutter.embedding.engine.b.b().d(this.f8480a.o());
            }
            this.f8481b = null;
        }
        this.f8488i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Intent intent) {
        i();
        if (this.f8481b == null) {
            x7.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        x7.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
        this.f8481b.g().onNewIntent(intent);
        String n10 = n(intent);
        if (n10 == null || n10.isEmpty()) {
            return;
        }
        this.f8481b.l().b(n10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        i();
        if (this.f8480a.n()) {
            this.f8481b.i().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        i();
        if (this.f8481b != null) {
            H();
        } else {
            x7.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(int i10, String[] strArr, int[] iArr) {
        i();
        if (this.f8481b == null) {
            x7.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        x7.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f8481b.g().onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Bundle bundle) {
        Bundle bundle2;
        x7.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        i();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f8480a.p()) {
            this.f8481b.q().j(bArr);
        }
        if (this.f8480a.l()) {
            this.f8481b.g().b(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        x7.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        i();
        if (this.f8480a.n()) {
            this.f8481b.i().d();
        }
    }
}
