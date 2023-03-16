package ca;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import vn.hunghd.flutterdownloader.DownloadWorker;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f3275a = new f();

    private /* synthetic */ f() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean u10;
        u10 = DownloadWorker.u(str, sSLSession);
        return u10;
    }
}
