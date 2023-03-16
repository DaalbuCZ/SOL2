package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements g {

    /* renamed from: n  reason: collision with root package name */
    private final Object f2083n;

    /* renamed from: o  reason: collision with root package name */
    private final a.C0039a f2084o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2083n = obj;
        this.f2084o = a.f2086c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, e.b bVar) {
        this.f2084o.a(iVar, bVar, this.f2083n);
    }
}
