package n5;

import i6.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import s5.d0;
/* loaded from: classes.dex */
public final class d implements n5.a {

    /* renamed from: c  reason: collision with root package name */
    private static final g f11751c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final i6.a<n5.a> f11752a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<n5.a> f11753b = new AtomicReference<>(null);

    /* loaded from: classes.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // n5.g
        public File a() {
            return null;
        }

        @Override // n5.g
        public File b() {
            return null;
        }

        @Override // n5.g
        public File c() {
            return null;
        }

        @Override // n5.g
        public File d() {
            return null;
        }

        @Override // n5.g
        public File e() {
            return null;
        }

        @Override // n5.g
        public File f() {
            return null;
        }
    }

    public d(i6.a<n5.a> aVar) {
        this.f11752a = aVar;
        aVar.a(new a.InterfaceC0126a() { // from class: n5.c
            @Override // i6.a.InterfaceC0126a
            public final void a(i6.b bVar) {
                d.this.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(i6.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f11753b.set((n5.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j10, d0 d0Var, i6.b bVar) {
        ((n5.a) bVar.get()).d(str, str2, j10, d0Var);
    }

    @Override // n5.a
    public g a(String str) {
        n5.a aVar = this.f11753b.get();
        return aVar == null ? f11751c : aVar.a(str);
    }

    @Override // n5.a
    public boolean b() {
        n5.a aVar = this.f11753b.get();
        return aVar != null && aVar.b();
    }

    @Override // n5.a
    public boolean c(String str) {
        n5.a aVar = this.f11753b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // n5.a
    public void d(final String str, final String str2, final long j10, final d0 d0Var) {
        f f10 = f.f();
        f10.i("Deferring native open session: " + str);
        this.f11752a.a(new a.InterfaceC0126a() { // from class: n5.b
            @Override // i6.a.InterfaceC0126a
            public final void a(i6.b bVar) {
                d.h(str, str2, j10, d0Var, bVar);
            }
        });
    }
}
