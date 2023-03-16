package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: o  reason: collision with root package name */
    static final g f1901o = new g();

    /* renamed from: n  reason: collision with root package name */
    private g f1902n = null;

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void b(i iVar, Fragment fragment, Context context) {
        }

        public void c(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void d(i iVar, Fragment fragment) {
        }

        public void e(i iVar, Fragment fragment) {
        }

        public void f(i iVar, Fragment fragment) {
        }

        public void g(i iVar, Fragment fragment, Context context) {
        }

        public void h(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void i(i iVar, Fragment fragment) {
        }

        public void j(i iVar, Fragment fragment, Bundle bundle) {
        }

        public void k(i iVar, Fragment fragment) {
        }

        public void l(i iVar, Fragment fragment) {
        }

        public void m(i iVar, Fragment fragment, View view, Bundle bundle) {
        }

        public void n(i iVar, Fragment fragment) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Fragment c(String str);

    public g d() {
        if (this.f1902n == null) {
            this.f1902n = f1901o;
        }
        return this.f1902n;
    }

    public abstract List<Fragment> e();

    public abstract void f(int i10, int i11);

    public abstract boolean g();

    public abstract void h(a aVar, boolean z10);

    public void i(g gVar) {
        this.f1902n = gVar;
    }

    public abstract void j(a aVar);
}
