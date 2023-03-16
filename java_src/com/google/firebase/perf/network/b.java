package com.google.firebase.perf.network;

import a7.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import v6.h;
/* loaded from: classes.dex */
public final class b extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    private final c f5751a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpsURLConnection f5752b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(HttpsURLConnection httpsURLConnection, l lVar, h hVar) {
        super(httpsURLConnection.getURL());
        this.f5752b = httpsURLConnection;
        this.f5751a = new c(httpsURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f5751a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f5751a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f5751a.c();
    }

    public boolean equals(Object obj) {
        return this.f5751a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f5751a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f5752b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f5751a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f5751a.f();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f5751a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f5751a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f5751a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f5751a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f5751a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f5751a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f5751a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f5751a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f5751a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f5751a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f5751a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f5751a.r(i10);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f5751a.s(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f5751a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f5751a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f5751a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f5751a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f5751a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f5752b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f5751a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f5751a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f5751a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f5751a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f5752b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f5752b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f5751a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f5752b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f5751a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f5751a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f5751a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f5751a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f5751a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f5751a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f5751a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f5752b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f5752b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f5751a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f5751a.L();
    }

    public int hashCode() {
        return this.f5751a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f5751a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f5751a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f5751a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f5751a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f5751a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f5751a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f5751a.S(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f5751a.T(j10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f5752b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f5751a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f5751a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f5751a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f5751a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f5751a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f5752b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f5751a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f5751a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f5751a.b0();
    }
}
