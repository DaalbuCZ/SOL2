package r5;

import java.io.File;
/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final b f13023c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final v5.f f13024a;

    /* renamed from: b  reason: collision with root package name */
    private r5.a f13025b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements r5.a {
        private b() {
        }

        @Override // r5.a
        public void a() {
        }

        @Override // r5.a
        public String b() {
            return null;
        }

        @Override // r5.a
        public byte[] c() {
            return null;
        }

        @Override // r5.a
        public void d() {
        }

        @Override // r5.a
        public void e(long j10, String str) {
        }
    }

    public c(v5.f fVar) {
        this.f13024a = fVar;
        this.f13025b = f13023c;
    }

    public c(v5.f fVar, String str) {
        this(fVar);
        e(str);
    }

    private File d(String str) {
        return this.f13024a.o(str, "userlog");
    }

    public void a() {
        this.f13025b.d();
    }

    public byte[] b() {
        return this.f13025b.c();
    }

    public String c() {
        return this.f13025b.b();
    }

    public final void e(String str) {
        this.f13025b.a();
        this.f13025b = f13023c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f13025b = new f(file, i10);
    }

    public void g(long j10, String str) {
        this.f13025b.e(j10, str);
    }
}
