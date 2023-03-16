package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: n  reason: collision with root package name */
    private final Activity f1896n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f1897o;

    /* renamed from: p  reason: collision with root package name */
    private final Handler f1898p;

    /* renamed from: q  reason: collision with root package name */
    private final int f1899q;

    /* renamed from: r  reason: collision with root package name */
    final j f1900r;

    h(Activity activity, Context context, Handler handler, int i10) {
        this.f1900r = new j();
        this.f1896n = activity;
        this.f1897o = (Context) androidx.core.util.e.c(context, "context == null");
        this.f1898p = (Handler) androidx.core.util.e.c(handler, "handler == null");
        this.f1899q = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f1896n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f1897o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler h() {
        return this.f1898p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f1897o);
    }

    public int o() {
        return this.f1899q;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f1897o.startActivity(intent);
    }

    public void s() {
    }
}
