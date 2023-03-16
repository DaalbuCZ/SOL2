package w7;

import c8.a;
import l8.j;
import l8.k;
/* loaded from: classes.dex */
public class a implements c8.a {

    /* renamed from: n  reason: collision with root package name */
    private k f16151n;

    /* renamed from: w7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0231a implements k.c {
        C0231a() {
        }

        @Override // l8.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            try {
                System.loadLibrary("sqlcipher");
                dVar.a(null);
            } catch (Throwable th) {
                dVar.b(th.toString(), null, null);
            }
        }
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "sqlcipher_flutter_libs");
        this.f16151n = kVar;
        kVar.e(new C0231a());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f16151n;
        if (kVar != null) {
            kVar.e(null);
            this.f16151n = null;
        }
    }
}
