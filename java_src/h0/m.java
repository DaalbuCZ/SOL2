package h0;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* loaded from: classes.dex */
public class m implements l {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f7679a;

    public m(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f7679a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // h0.l
    public String[] a() {
        return this.f7679a.getSupportedFeatures();
    }

    @Override // h0.l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) ba.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f7679a.getWebkitToCompatConverter());
    }
}
