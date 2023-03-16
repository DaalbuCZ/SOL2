package w1;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import w1.w;
/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public static class a extends IOException {

        /* renamed from: n  reason: collision with root package name */
        public final int f15946n;

        public a(Throwable th, int i10) {
            super(th);
            this.f15946n = i10;
        }
    }

    boolean a();

    Map<String, String> b();

    void c(w.a aVar);

    UUID d();

    void e(w.a aVar);

    int f();

    boolean g(String str);

    a h();

    v1.b i();
}
