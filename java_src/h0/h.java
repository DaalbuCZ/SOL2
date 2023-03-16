package h0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
/* loaded from: classes.dex */
public class h extends g0.d {

    /* renamed from: a  reason: collision with root package name */
    private WebMessagePort f7647a;

    /* renamed from: b  reason: collision with root package name */
    private WebMessagePortBoundaryInterface f7648b;

    public h(WebMessagePort webMessagePort) {
        this.f7647a = webMessagePort;
    }

    public static WebMessagePort[] b(g0.d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        int length = dVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = dVarArr[i10].a();
        }
        return webMessagePortArr;
    }

    public static g0.c c(WebMessage webMessage) {
        return b.d(webMessage);
    }

    private WebMessagePort d() {
        if (this.f7647a == null) {
            this.f7647a = k.c().c(Proxy.getInvocationHandler(this.f7648b));
        }
        return this.f7647a;
    }

    public static g0.d[] e(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        g0.d[] dVarArr = new g0.d[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            dVarArr[i10] = new h(webMessagePortArr[i10]);
        }
        return dVarArr;
    }

    @Override // g0.d
    public WebMessagePort a() {
        return d();
    }
}
