package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.x;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final h<?> f1894a;

    private f(h<?> hVar) {
        this.f1894a = hVar;
    }

    public static f b(h<?> hVar) {
        return new f((h) androidx.core.util.e.c(hVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        h<?> hVar = this.f1894a;
        hVar.f1900r.q(hVar, hVar, fragment);
    }

    public void c() {
        this.f1894a.f1900r.z();
    }

    public void d(Configuration configuration) {
        this.f1894a.f1900r.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1894a.f1900r.B(menuItem);
    }

    public void f() {
        this.f1894a.f1900r.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1894a.f1900r.D(menu, menuInflater);
    }

    public void h() {
        this.f1894a.f1900r.E();
    }

    public void i() {
        this.f1894a.f1900r.G();
    }

    public void j(boolean z10) {
        this.f1894a.f1900r.H(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1894a.f1900r.W(menuItem);
    }

    public void l(Menu menu) {
        this.f1894a.f1900r.X(menu);
    }

    public void m() {
        this.f1894a.f1900r.Z();
    }

    public void n(boolean z10) {
        this.f1894a.f1900r.a0(z10);
    }

    public boolean o(Menu menu) {
        return this.f1894a.f1900r.b0(menu);
    }

    public void p() {
        this.f1894a.f1900r.d0();
    }

    public void q() {
        this.f1894a.f1900r.e0();
    }

    public void r() {
        this.f1894a.f1900r.g0();
    }

    public boolean s() {
        return this.f1894a.f1900r.m0();
    }

    public Fragment t(String str) {
        return this.f1894a.f1900r.r0(str);
    }

    public i u() {
        return this.f1894a.f1900r;
    }

    public void v() {
        this.f1894a.f1900r.T0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1894a.f1900r.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        h<?> hVar = this.f1894a;
        if (!(hVar instanceof x)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        hVar.f1900r.d1(parcelable);
    }

    public Parcelable y() {
        return this.f1894a.f1900r.f1();
    }
}
