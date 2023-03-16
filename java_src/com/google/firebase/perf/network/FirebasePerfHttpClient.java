package com.google.firebase.perf.network;

import a7.l;
import androidx.annotation.Keep;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import v6.h;
import x6.e;
import z6.k;
/* loaded from: classes.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long a10 = e.a(httpRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new x6.c(responseHandler, lVar, c10));
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long a10 = e.a(httpRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new x6.c(responseHandler, lVar, c10), httpContext);
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long a10 = e.a(httpUriRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new x6.c(responseHandler, lVar, c10));
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long a10 = e.a(httpUriRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new x6.c(responseHandler, lVar, c10), httpContext);
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long a10 = e.a(httpRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.x(lVar.c());
            c10.p(execute.getStatusLine().getStatusCode());
            Long a11 = e.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = e.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).o(httpRequest.getRequestLine().getMethod());
            Long a10 = e.a(httpRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.x(lVar.c());
            c10.p(execute.getStatusLine().getStatusCode());
            Long a11 = e.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = e.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long a10 = e.a(httpUriRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.x(lVar.c());
            c10.p(execute.getStatusLine().getStatusCode());
            Long a11 = e.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = e.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) {
        h c10 = h.c(kVar);
        try {
            c10.z(httpUriRequest.getURI().toString()).o(httpUriRequest.getMethod());
            Long a10 = e.a(httpUriRequest);
            if (a10 != null) {
                c10.s(a10.longValue());
            }
            lVar.i();
            c10.t(lVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.x(lVar.c());
            c10.p(execute.getStatusLine().getStatusCode());
            Long a11 = e.a(execute);
            if (a11 != null) {
                c10.v(a11.longValue());
            }
            String b10 = e.b(execute);
            if (b10 != null) {
                c10.u(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            c10.x(lVar.c());
            e.d(c10);
            throw e10;
        }
    }
}
