package a3;

import android.net.Uri;
import java.io.IOException;
import o3.g0;
import u2.b0;
/* loaded from: classes.dex */
public interface l {

    /* loaded from: classes.dex */
    public interface a {
        l a(z2.g gVar, g0 g0Var, k kVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void e();

        boolean i(Uri uri, g0.c cVar, boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class c extends IOException {

        /* renamed from: n  reason: collision with root package name */
        public final Uri f185n;

        public c(Uri uri) {
            this.f185n = uri;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {

        /* renamed from: n  reason: collision with root package name */
        public final Uri f186n;

        public d(Uri uri) {
            this.f186n = uri;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void m(g gVar);
    }

    boolean a();

    h b();

    boolean c(Uri uri, long j10);

    void d(b bVar);

    boolean e(Uri uri);

    void f();

    void g(Uri uri, b0.a aVar, e eVar);

    void h(Uri uri);

    void i(Uri uri);

    g k(Uri uri, boolean z10);

    void l(b bVar);

    long m();

    void stop();
}
