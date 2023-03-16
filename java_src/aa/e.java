package aa;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
final class e {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    static d f312a;

    /* renamed from: b  reason: collision with root package name */
    static long f313b;

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(d dVar) {
        if (dVar.f310f != null || dVar.f311g != null) {
            throw new IllegalArgumentException();
        }
        if (dVar.f308d) {
            return;
        }
        synchronized (e.class) {
            long j10 = f313b;
            if (j10 + 8192 > 65536) {
                return;
            }
            f313b = j10 + 8192;
            dVar.f310f = f312a;
            dVar.f307c = 0;
            dVar.f306b = 0;
            f312a = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b() {
        synchronized (e.class) {
            d dVar = f312a;
            if (dVar != null) {
                f312a = dVar.f310f;
                dVar.f310f = null;
                f313b -= 8192;
                return dVar;
            }
            return new d();
        }
    }
}
