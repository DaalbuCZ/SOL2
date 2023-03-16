package com.google.firebase.perf.network;

import a7.l;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import v6.h;
import x6.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private static final u6.a f5753f = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f5754a;

    /* renamed from: b  reason: collision with root package name */
    private final h f5755b;

    /* renamed from: c  reason: collision with root package name */
    private long f5756c = -1;

    /* renamed from: d  reason: collision with root package name */
    private long f5757d = -1;

    /* renamed from: e  reason: collision with root package name */
    private final l f5758e;

    public c(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        this.f5754a = httpURLConnection;
        this.f5755b = hVar;
        this.f5758e = lVar;
        hVar.z(httpURLConnection.getURL().toString());
    }

    private void a0() {
        h hVar;
        String str;
        if (this.f5756c == -1) {
            this.f5758e.i();
            long e10 = this.f5758e.e();
            this.f5756c = e10;
            this.f5755b.t(e10);
        }
        String F = F();
        if (F != null) {
            this.f5755b.o(F);
            return;
        }
        if (o()) {
            hVar = this.f5755b;
            str = "POST";
        } else {
            hVar = this.f5755b;
            str = "GET";
        }
        hVar.o(str);
    }

    public boolean A() {
        return this.f5754a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f5754a.getLastModified();
    }

    public OutputStream C() {
        try {
            OutputStream outputStream = this.f5754a.getOutputStream();
            return outputStream != null ? new x6.b(outputStream, this.f5755b, this.f5758e) : outputStream;
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }

    public Permission D() {
        try {
            return this.f5754a.getPermission();
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }

    public int E() {
        return this.f5754a.getReadTimeout();
    }

    public String F() {
        return this.f5754a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f5754a.getRequestProperties();
    }

    public String H(String str) {
        return this.f5754a.getRequestProperty(str);
    }

    public int I() {
        a0();
        if (this.f5757d == -1) {
            long c10 = this.f5758e.c();
            this.f5757d = c10;
            this.f5755b.y(c10);
        }
        try {
            int responseCode = this.f5754a.getResponseCode();
            this.f5755b.p(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }

    public String J() {
        a0();
        if (this.f5757d == -1) {
            long c10 = this.f5758e.c();
            this.f5757d = c10;
            this.f5755b.y(c10);
        }
        try {
            String responseMessage = this.f5754a.getResponseMessage();
            this.f5755b.p(this.f5754a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }

    public URL K() {
        return this.f5754a.getURL();
    }

    public boolean L() {
        return this.f5754a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f5754a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f5754a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f5754a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f5754a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f5754a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f5754a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f5754a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f5754a.setFixedLengthStreamingMode(j10);
        }
    }

    public void U(long j10) {
        this.f5754a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f5754a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f5754a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f5754a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f5755b.A(str2);
        }
        this.f5754a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f5754a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f5754a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f5756c == -1) {
            this.f5758e.i();
            long e10 = this.f5758e.e();
            this.f5756c = e10;
            this.f5755b.t(e10);
        }
        try {
            this.f5754a.connect();
        } catch (IOException e11) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f5754a.usingProxy();
    }

    public void c() {
        this.f5755b.x(this.f5758e.c());
        this.f5755b.b();
        this.f5754a.disconnect();
    }

    public boolean d() {
        return this.f5754a.getAllowUserInteraction();
    }

    public int e() {
        return this.f5754a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f5754a.equals(obj);
    }

    public Object f() {
        a0();
        this.f5755b.p(this.f5754a.getResponseCode());
        try {
            Object content = this.f5754a.getContent();
            if (content instanceof InputStream) {
                this.f5755b.u(this.f5754a.getContentType());
                return new x6.a((InputStream) content, this.f5755b, this.f5758e);
            }
            this.f5755b.u(this.f5754a.getContentType());
            this.f5755b.v(this.f5754a.getContentLength());
            this.f5755b.x(this.f5758e.c());
            this.f5755b.b();
            return content;
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) {
        a0();
        this.f5755b.p(this.f5754a.getResponseCode());
        try {
            Object content = this.f5754a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f5755b.u(this.f5754a.getContentType());
                return new x6.a((InputStream) content, this.f5755b, this.f5758e);
            }
            this.f5755b.u(this.f5754a.getContentType());
            this.f5755b.v(this.f5754a.getContentLength());
            this.f5755b.x(this.f5758e.c());
            this.f5755b.b();
            return content;
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f5754a.getContentEncoding();
    }

    public int hashCode() {
        return this.f5754a.hashCode();
    }

    public int i() {
        a0();
        return this.f5754a.getContentLength();
    }

    public long j() {
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f5754a.getContentLengthLong();
        }
        return 0L;
    }

    public String k() {
        a0();
        return this.f5754a.getContentType();
    }

    public long l() {
        a0();
        return this.f5754a.getDate();
    }

    public boolean m() {
        return this.f5754a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f5754a.getDoInput();
    }

    public boolean o() {
        return this.f5754a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f5755b.p(this.f5754a.getResponseCode());
        } catch (IOException unused) {
            f5753f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f5754a.getErrorStream();
        return errorStream != null ? new x6.a(errorStream, this.f5755b, this.f5758e) : errorStream;
    }

    public long q() {
        a0();
        return this.f5754a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f5754a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f5754a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f5754a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f5754a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f5754a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f5754a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f5754a.getHeaderFieldLong(str, j10);
        }
        return 0L;
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f5754a.getHeaderFields();
    }

    public long y() {
        return this.f5754a.getIfModifiedSince();
    }

    public InputStream z() {
        a0();
        this.f5755b.p(this.f5754a.getResponseCode());
        this.f5755b.u(this.f5754a.getContentType());
        try {
            InputStream inputStream = this.f5754a.getInputStream();
            return inputStream != null ? new x6.a(inputStream, this.f5755b, this.f5758e) : inputStream;
        } catch (IOException e10) {
            this.f5755b.x(this.f5758e.c());
            e.d(this.f5755b);
            throw e10;
        }
    }
}
