package h0;

import android.webkit.WebResourceError;
import h0.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
/* loaded from: classes.dex */
public class i extends g0.e {

    /* renamed from: a  reason: collision with root package name */
    private WebResourceError f7649a;

    /* renamed from: b  reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f7650b;

    public i(WebResourceError webResourceError) {
        this.f7649a = webResourceError;
    }

    public i(InvocationHandler invocationHandler) {
        this.f7650b = (WebResourceErrorBoundaryInterface) ba.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f7650b == null) {
            this.f7650b = (WebResourceErrorBoundaryInterface) ba.a.a(WebResourceErrorBoundaryInterface.class, k.c().e(this.f7649a));
        }
        return this.f7650b;
    }

    private WebResourceError d() {
        if (this.f7649a == null) {
            this.f7649a = k.c().d(Proxy.getInvocationHandler(this.f7650b));
        }
        return this.f7649a;
    }

    @Override // g0.e
    public CharSequence a() {
        a.b bVar = j.f7672v;
        if (bVar.c()) {
            return b.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw j.a();
    }

    @Override // g0.e
    public int b() {
        a.b bVar = j.f7673w;
        if (bVar.c()) {
            return b.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw j.a();
    }
}
