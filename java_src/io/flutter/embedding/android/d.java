package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.e;
import io.flutter.embedding.android.e;
import java.util.List;
/* loaded from: classes.dex */
public class d extends Activity implements e.c, androidx.lifecycle.i {

    /* renamed from: q  reason: collision with root package name */
    public static final int f8475q = w8.h.d(61938);

    /* renamed from: n  reason: collision with root package name */
    protected e f8476n;

    /* renamed from: o  reason: collision with root package name */
    private androidx.lifecycle.j f8477o;

    /* renamed from: p  reason: collision with root package name */
    private final OnBackInvokedCallback f8478p;

    /* loaded from: classes.dex */
    class a implements OnBackInvokedCallback {
        a() {
        }

        public void onBackInvoked() {
            d.this.onBackPressed();
        }
    }

    public d() {
        this.f8478p = Build.VERSION.SDK_INT >= 33 ? new a() : null;
        this.f8477o = new androidx.lifecycle.j(this);
    }

    private void E() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void F() {
        if (H() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View G() {
        return this.f8476n.r(null, null, null, f8475q, y() == v.surface);
    }

    private Drawable K() {
        try {
            Bundle J = J();
            int i10 = J != null ? J.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i10 != 0) {
                return androidx.core.content.res.h.d(getResources(), i10, getTheme());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Resources.NotFoundException e10) {
            x7.b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e10;
        }
    }

    private boolean L() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean O(String str) {
        StringBuilder sb;
        String str2;
        e eVar = this.f8476n;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else if (eVar.l()) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        x7.b.g("FlutterActivity", sb.toString());
        return false;
    }

    private void P() {
        try {
            Bundle J = J();
            if (J != null) {
                int i10 = J.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i10 != -1) {
                    setTheme(i10);
                }
            } else {
                x7.b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            x7.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.a A(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public y B() {
        return H() == f.opaque ? y.opaque : y.transparent;
    }

    @Override // io.flutter.embedding.android.e.c
    public void C(i iVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public void D(io.flutter.embedding.engine.a aVar) {
        if (this.f8476n.m()) {
            return;
        }
        i8.a.a(aVar);
    }

    protected f H() {
        return getIntent().hasExtra("background_mode") ? f.valueOf(getIntent().getStringExtra("background_mode")) : f.opaque;
    }

    protected io.flutter.embedding.engine.a I() {
        return this.f8476n.k();
    }

    protected Bundle J() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void M() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f8478p);
        }
    }

    public void N() {
        Q();
        e eVar = this.f8476n;
        if (eVar != null) {
            eVar.F();
            this.f8476n = null;
        }
    }

    public void Q() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f8478p);
        }
    }

    @Override // io.flutter.embedding.android.e.c, androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f8477o;
    }

    @Override // io.flutter.embedding.android.e.c
    public Context b() {
        return this;
    }

    @Override // io.flutter.plugin.platform.c.d
    public boolean c() {
        return false;
    }

    @Override // io.flutter.embedding.android.e.c
    public void d() {
    }

    @Override // io.flutter.embedding.android.e.c
    public Activity e() {
        return this;
    }

    @Override // io.flutter.embedding.android.e.c
    public void f() {
        x7.b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + I() + " evicted by another attaching activity");
        e eVar = this.f8476n;
        if (eVar != null) {
            eVar.s();
            this.f8476n.t();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void g() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public String h() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle J = J();
            if (J != null) {
                return J.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public List<String> k() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean l() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean m() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (o() != null || this.f8476n.m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean n() {
        return true;
    }

    @Override // io.flutter.embedding.android.e.c
    public String o() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (O("onActivityResult")) {
            this.f8476n.o(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (O("onBackPressed")) {
            this.f8476n.q();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        P();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f8476n = eVar;
        eVar.p(this);
        this.f8476n.y(bundle);
        this.f8477o.h(e.b.ON_CREATE);
        M();
        F();
        setContentView(G());
        E();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (O("onDestroy")) {
            this.f8476n.s();
            this.f8476n.t();
        }
        N();
        this.f8477o.h(e.b.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (O("onNewIntent")) {
            this.f8476n.u(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (O("onPause")) {
            this.f8476n.v();
        }
        this.f8477o.h(e.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (O("onPostResume")) {
            this.f8476n.w();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (O("onRequestPermissionsResult")) {
            this.f8476n.x(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f8477o.h(e.b.ON_RESUME);
        if (O("onResume")) {
            this.f8476n.z();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (O("onSaveInstanceState")) {
            this.f8476n.A(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f8477o.h(e.b.ON_START);
        if (O("onStart")) {
            this.f8476n.B();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (O("onStop")) {
            this.f8476n.C();
        }
        this.f8477o.h(e.b.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (O("onTrimMemory")) {
            this.f8476n.D(i10);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (O("onUserLeaveHint")) {
            this.f8476n.E();
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean p() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : o() == null;
    }

    @Override // io.flutter.embedding.android.e.c
    public String q() {
        try {
            Bundle J = J();
            String string = J != null ? J.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public void r(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String s() {
        try {
            Bundle J = J();
            if (J != null) {
                return J.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.plugin.platform.c t(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.c(e(), aVar.m(), this);
    }

    @Override // io.flutter.embedding.android.e.c
    public void u(h hVar) {
    }

    @Override // io.flutter.embedding.android.e.c
    public String v() {
        String dataString;
        if (L() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.e.c
    public boolean w() {
        try {
            Bundle J = J();
            if (J != null) {
                return J.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.e.c
    public io.flutter.embedding.engine.e x() {
        return io.flutter.embedding.engine.e.a(getIntent());
    }

    @Override // io.flutter.embedding.android.e.c
    public v y() {
        return H() == f.opaque ? v.surface : v.texture;
    }

    @Override // io.flutter.embedding.android.e.c
    public x z() {
        Drawable K = K();
        if (K != null) {
            return new b(K);
        }
        return null;
    }
}
