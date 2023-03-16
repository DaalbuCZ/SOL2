package o3;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import o3.h0;
import o3.p;
/* loaded from: classes.dex */
public final class j0<T> implements h0.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f11996a;

    /* renamed from: b  reason: collision with root package name */
    public final p f11997b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11998c;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f11999d;

    /* renamed from: e  reason: collision with root package name */
    private final a<? extends T> f12000e;

    /* renamed from: f  reason: collision with root package name */
    private volatile T f12001f;

    /* loaded from: classes.dex */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public j0(l lVar, Uri uri, int i10, a<? extends T> aVar) {
        this(lVar, new p.b().i(uri).b(1).a(), i10, aVar);
    }

    public j0(l lVar, p pVar, int i10, a<? extends T> aVar) {
        this.f11999d = new o0(lVar);
        this.f11997b = pVar;
        this.f11998c = i10;
        this.f12000e = aVar;
        this.f11996a = u2.n.a();
    }

    public long a() {
        return this.f11999d.r();
    }

    @Override // o3.h0.e
    public final void b() {
        this.f11999d.u();
        n nVar = new n(this.f11999d, this.f11997b);
        try {
            nVar.b();
            this.f12001f = this.f12000e.a((Uri) p3.a.e(this.f11999d.k()), nVar);
        } finally {
            p3.m0.n(nVar);
        }
    }

    @Override // o3.h0.e
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f11999d.t();
    }

    public final T e() {
        return this.f12001f;
    }

    public Uri f() {
        return this.f11999d.s();
    }
}
