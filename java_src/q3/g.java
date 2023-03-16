package q3;

import android.view.Surface;
/* loaded from: classes.dex */
public class g extends j2.m {

    /* renamed from: p  reason: collision with root package name */
    public final int f12593p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f12594q;

    public g(Throwable th, j2.n nVar, Surface surface) {
        super(th, nVar);
        this.f12593p = System.identityHashCode(surface);
        this.f12594q = surface == null || surface.isValid();
    }
}
