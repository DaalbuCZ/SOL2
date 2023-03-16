package androidx.fragment.app;

import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r implements androidx.lifecycle.i {

    /* renamed from: n  reason: collision with root package name */
    private androidx.lifecycle.j f2060n = null;

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        c();
        return this.f2060n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.b bVar) {
        this.f2060n.h(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f2060n == null) {
            this.f2060n = new androidx.lifecycle.j(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f2060n != null;
    }
}
