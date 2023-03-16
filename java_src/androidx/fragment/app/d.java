package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.b;
import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class d extends ComponentActivity implements b.d, b.f {
    boolean A;
    boolean B;
    int C;
    m.h<String> D;

    /* renamed from: w  reason: collision with root package name */
    boolean f1889w;

    /* renamed from: x  reason: collision with root package name */
    boolean f1890x;

    /* renamed from: z  reason: collision with root package name */
    boolean f1892z;

    /* renamed from: u  reason: collision with root package name */
    final f f1887u = f.b(new a());

    /* renamed from: v  reason: collision with root package name */
    final androidx.lifecycle.j f1888v = new androidx.lifecycle.j(this);

    /* renamed from: y  reason: collision with root package name */
    boolean f1891y = true;

    /* loaded from: classes.dex */
    class a extends h<d> implements x, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.e a() {
            return d.this.f1888v;
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public View c(int i10) {
            return d.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.x
        public w g() {
            return d.this.g();
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher i() {
            return d.this.i();
        }

        @Override // androidx.fragment.app.h
        public void k(Fragment fragment) {
            d.this.s(fragment);
        }

        @Override // androidx.fragment.app.h
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean p() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean q(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public void r(Fragment fragment, Intent intent, int i10, Bundle bundle) {
            d.this.v(fragment, intent, i10, bundle);
        }

        @Override // androidx.fragment.app.h
        public void s() {
            d.this.w();
        }

        @Override // androidx.fragment.app.h
        /* renamed from: t */
        public d m() {
            return d.this;
        }
    }

    private int m(Fragment fragment) {
        if (this.D.q() < 65534) {
            while (this.D.l(this.C) >= 0) {
                this.C = (this.C + 1) % 65534;
            }
            int i10 = this.C;
            this.D.n(i10, fragment.f1827r);
            this.C = (this.C + 1) % 65534;
            return i10;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    static void n(int i10) {
        if ((i10 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void q() {
        do {
        } while (r(p(), e.c.CREATED));
    }

    private static boolean r(i iVar, e.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : iVar.e()) {
            if (fragment != null) {
                if (fragment.a().b().e(e.c.STARTED)) {
                    fragment.f1818f0.o(cVar);
                    z10 = true;
                }
                if (fragment.x() != null) {
                    z10 |= r(fragment.q(), cVar);
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.app.b.f
    public final void b(int i10) {
        if (this.f1892z || i10 == -1) {
            return;
        }
        n(i10);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1889w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1890x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1891y);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1887u.u().b(str, fileDescriptor, printWriter, strArr);
    }

    final View o(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1887u.w(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f1887u.v();
        int i12 = i10 >> 16;
        if (i12 == 0) {
            b.e p10 = androidx.core.app.b.p();
            if (p10 == null || !p10.a(this, i10, i11, intent)) {
                super.onActivityResult(i10, i11, intent);
                return;
            }
            return;
        }
        int i13 = i12 - 1;
        String h10 = this.D.h(i13);
        this.D.p(i13);
        if (h10 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment t10 = this.f1887u.t(h10);
        if (t10 != null) {
            t10.W(i10 & 65535, i11, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + h10);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1887u.v();
        this.f1887u.d(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1887u.a(null);
        if (bundle != null) {
            this.f1887u.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.C = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.D = new m.h<>(intArray.length);
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        this.D.n(intArray[i10], stringArray[i10]);
                    }
                }
            }
        }
        if (this.D == null) {
            this.D = new m.h<>();
            this.C = 0;
        }
        super.onCreate(bundle);
        this.f1888v.h(e.b.ON_CREATE);
        this.f1887u.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.f1887u.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View o10 = o(view, str, context, attributeSet);
        return o10 == null ? super.onCreateView(view, str, context, attributeSet) : o10;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View o10 = o(null, str, context, attributeSet);
        return o10 == null ? super.onCreateView(str, context, attributeSet) : o10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1887u.h();
        this.f1888v.h(e.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1887u.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            if (i10 != 6) {
                return false;
            }
            return this.f1887u.e(menuItem);
        }
        return this.f1887u.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        this.f1887u.j(z10);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1887u.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.f1887u.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f1890x = false;
        this.f1887u.m();
        this.f1888v.h(e.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        this.f1887u.n(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? t(view, menu) | this.f1887u.o(menu) : super.onPreparePanel(i10, view, menu);
    }

    @Override // android.app.Activity, androidx.core.app.b.d
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f1887u.v();
        int i11 = (i10 >> 16) & 65535;
        if (i11 != 0) {
            int i12 = i11 - 1;
            String h10 = this.D.h(i12);
            this.D.p(i12);
            if (h10 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t10 = this.f1887u.t(h10);
            if (t10 != null) {
                t10.v0(i10 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + h10);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f1890x = true;
        this.f1887u.v();
        this.f1887u.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q();
        this.f1888v.h(e.b.ON_STOP);
        Parcelable y10 = this.f1887u.y();
        if (y10 != null) {
            bundle.putParcelable("android:support:fragments", y10);
        }
        if (this.D.q() > 0) {
            bundle.putInt("android:support:next_request_index", this.C);
            int[] iArr = new int[this.D.q()];
            String[] strArr = new String[this.D.q()];
            for (int i10 = 0; i10 < this.D.q(); i10++) {
                iArr[i10] = this.D.m(i10);
                strArr[i10] = this.D.s(i10);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f1891y = false;
        if (!this.f1889w) {
            this.f1889w = true;
            this.f1887u.c();
        }
        this.f1887u.v();
        this.f1887u.s();
        this.f1888v.h(e.b.ON_START);
        this.f1887u.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1887u.v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f1891y = true;
        q();
        this.f1887u.r();
        this.f1888v.h(e.b.ON_STOP);
    }

    public i p() {
        return this.f1887u.u();
    }

    public void s(Fragment fragment) {
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        if (!this.B && i10 != -1) {
            n(i10);
        }
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (!this.B && i10 != -1) {
            n(i10);
        }
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        if (!this.A && i10 != -1) {
            n(i10);
        }
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (!this.A && i10 != -1) {
            n(i10);
        }
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Deprecated
    protected boolean t(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void u() {
        this.f1888v.h(e.b.ON_RESUME);
        this.f1887u.p();
    }

    public void v(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        this.B = true;
        try {
            if (i10 == -1) {
                androidx.core.app.b.u(this, intent, -1, bundle);
                return;
            }
            n(i10);
            androidx.core.app.b.u(this, intent, ((m(fragment) + 1) << 16) + (i10 & 65535), bundle);
        } finally {
            this.B = false;
        }
    }

    @Deprecated
    public void w() {
        invalidateOptionsMenu();
    }
}
