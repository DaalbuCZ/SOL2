package h0;

import android.webkit.SafeBrowsingResponse;
import h0.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
/* loaded from: classes.dex */
public class g extends g0.a {

    /* renamed from: a  reason: collision with root package name */
    private SafeBrowsingResponse f7645a;

    /* renamed from: b  reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f7646b;

    public g(SafeBrowsingResponse safeBrowsingResponse) {
        this.f7645a = safeBrowsingResponse;
    }

    public g(InvocationHandler invocationHandler) {
        this.f7646b = (SafeBrowsingResponseBoundaryInterface) ba.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f7646b == null) {
            this.f7646b = (SafeBrowsingResponseBoundaryInterface) ba.a.a(SafeBrowsingResponseBoundaryInterface.class, k.c().b(this.f7645a));
        }
        return this.f7646b;
    }

    private SafeBrowsingResponse c() {
        if (this.f7645a == null) {
            this.f7645a = k.c().a(Proxy.getInvocationHandler(this.f7646b));
        }
        return this.f7645a;
    }

    @Override // g0.a
    public void a(boolean z10) {
        a.f fVar = j.f7676z;
        if (fVar.c()) {
            c.e(c(), z10);
        } else if (!fVar.d()) {
            throw j.a();
        } else {
            b().showInterstitial(z10);
        }
    }
}
