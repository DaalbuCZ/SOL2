package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y3.e0;
import y3.g0;
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: n  reason: collision with root package name */
    protected final y3.e f3560n;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(y3.e eVar) {
        this.f3560n = eVar;
    }

    public static y3.e c(Activity activity) {
        return d(new y3.d(activity));
    }

    protected static y3.e d(y3.d dVar) {
        if (dVar.d()) {
            return g0.r1(dVar.b());
        }
        if (dVar.c()) {
            return e0.f(dVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static y3.e getChimeraLifecycleFragmentImpl(y3.d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity d10 = this.f3560n.d();
        z3.o.i(d10);
        return d10;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
