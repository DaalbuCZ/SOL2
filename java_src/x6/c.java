package x6;

import a7.l;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import v6.h;
/* loaded from: classes.dex */
public class c<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseHandler<? extends T> f16386a;

    /* renamed from: b  reason: collision with root package name */
    private final l f16387b;

    /* renamed from: c  reason: collision with root package name */
    private final h f16388c;

    public c(ResponseHandler<? extends T> responseHandler, l lVar, h hVar) {
        this.f16386a = responseHandler;
        this.f16387b = lVar;
        this.f16388c = hVar;
    }

    public T handleResponse(HttpResponse httpResponse) {
        this.f16388c.x(this.f16387b.c());
        this.f16388c.p(httpResponse.getStatusLine().getStatusCode());
        Long a10 = e.a(httpResponse);
        if (a10 != null) {
            this.f16388c.v(a10.longValue());
        }
        String b10 = e.b(httpResponse);
        if (b10 != null) {
            this.f16388c.u(b10);
        }
        this.f16388c.b();
        return (T) this.f16386a.handleResponse(httpResponse);
    }
}
