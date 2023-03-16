package o3;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import o3.l;
/* loaded from: classes.dex */
public class u extends g {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12113e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12114f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12115g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12116h;

    /* renamed from: i  reason: collision with root package name */
    private final d0 f12117i;

    /* renamed from: j  reason: collision with root package name */
    private final d0 f12118j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f12119k;

    /* renamed from: l  reason: collision with root package name */
    private a5.k<String> f12120l;

    /* renamed from: m  reason: collision with root package name */
    private p f12121m;

    /* renamed from: n  reason: collision with root package name */
    private HttpURLConnection f12122n;

    /* renamed from: o  reason: collision with root package name */
    private InputStream f12123o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12124p;

    /* renamed from: q  reason: collision with root package name */
    private int f12125q;

    /* renamed from: r  reason: collision with root package name */
    private long f12126r;

    /* renamed from: s  reason: collision with root package name */
    private long f12127s;

    /* loaded from: classes.dex */
    public static final class b implements l.a {

        /* renamed from: b  reason: collision with root package name */
        private p0 f12129b;

        /* renamed from: c  reason: collision with root package name */
        private a5.k<String> f12130c;

        /* renamed from: d  reason: collision with root package name */
        private String f12131d;

        /* renamed from: g  reason: collision with root package name */
        private boolean f12134g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f12135h;

        /* renamed from: a  reason: collision with root package name */
        private final d0 f12128a = new d0();

        /* renamed from: e  reason: collision with root package name */
        private int f12132e = 8000;

        /* renamed from: f  reason: collision with root package name */
        private int f12133f = 8000;

        @Override // o3.l.a
        /* renamed from: b */
        public u a() {
            u uVar = new u(this.f12131d, this.f12132e, this.f12133f, this.f12134g, this.f12128a, this.f12130c, this.f12135h);
            p0 p0Var = this.f12129b;
            if (p0Var != null) {
                uVar.i(p0Var);
            }
            return uVar;
        }

        public b c(boolean z10) {
            this.f12134g = z10;
            return this;
        }

        public final b d(Map<String, String> map) {
            this.f12128a.a(map);
            return this;
        }

        public b e(String str) {
            this.f12131d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends b5.l<String, List<String>> {

        /* renamed from: n  reason: collision with root package name */
        private final Map<String, List<String>> f12136n;

        public c(Map<String, List<String>> map) {
            this.f12136n = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean i(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j(String str) {
            return str != null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // b5.m
        /* renamed from: b */
        public Map<String, List<String>> a() {
            return this.f12136n;
        }

        @Override // b5.l, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.c(obj);
        }

        @Override // b5.l, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return b5.p0.b(super.entrySet(), w.f12138n);
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.d(obj);
        }

        @Override // b5.l, java.util.Map
        /* renamed from: h */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.e();
        }

        @Override // b5.l, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // b5.l, java.util.Map
        public Set<String> keySet() {
            return b5.p0.b(super.keySet(), v.f12137n);
        }

        @Override // b5.l, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private u(String str, int i10, int i11, boolean z10, d0 d0Var, a5.k<String> kVar, boolean z11) {
        super(true);
        this.f12116h = str;
        this.f12114f = i10;
        this.f12115g = i11;
        this.f12113e = z10;
        this.f12117i = d0Var;
        this.f12120l = kVar;
        this.f12118j = new d0();
        this.f12119k = z11;
    }

    private static void A(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = p3.m0.f12306a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) p3.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    private int C(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f12126r;
        if (j10 != -1) {
            long j11 = j10 - this.f12127s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) p3.m0.j(this.f12123o)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f12127s += read;
        r(read);
        return read;
    }

    private void D(long j10, p pVar) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) p3.m0.j(this.f12123o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new a0(new InterruptedIOException(), pVar, 2000, 1);
            }
            if (read == -1) {
                throw new a0(pVar, 2008, 1);
            }
            j10 -= read;
            r(read);
        }
    }

    private void v() {
        HttpURLConnection httpURLConnection = this.f12122n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                p3.r.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f12122n = null;
        }
    }

    private URL w(URL url, String str, p pVar) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new a0("Unsupported protocol redirect: " + protocol, pVar, 2001, 1);
                } else if (this.f12113e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new a0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", pVar, 2001, 1);
                }
            } catch (MalformedURLException e10) {
                throw new a0(e10, pVar, 2001, 1);
            }
        }
        throw new a0("Null location redirect", pVar, 2001, 1);
    }

    private static boolean x(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection y(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        HttpURLConnection B = B(url);
        B.setConnectTimeout(this.f12114f);
        B.setReadTimeout(this.f12115g);
        HashMap hashMap = new HashMap();
        d0 d0Var = this.f12117i;
        if (d0Var != null) {
            hashMap.putAll(d0Var.b());
        }
        hashMap.putAll(this.f12118j.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            B.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a10 = e0.a(j10, j11);
        if (a10 != null) {
            B.setRequestProperty("Range", a10);
        }
        String str = this.f12116h;
        if (str != null) {
            B.setRequestProperty("User-Agent", str);
        }
        B.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        B.setInstanceFollowRedirects(z11);
        B.setDoOutput(bArr != null);
        B.setRequestMethod(p.c(i10));
        if (bArr != null) {
            B.setFixedLengthStreamingMode(bArr.length);
            B.connect();
            OutputStream outputStream = B.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            B.connect();
        }
        return B;
    }

    private HttpURLConnection z(p pVar) {
        HttpURLConnection y10;
        URL url = new URL(pVar.f12034a.toString());
        int i10 = pVar.f12036c;
        byte[] bArr = pVar.f12037d;
        long j10 = pVar.f12040g;
        long j11 = pVar.f12041h;
        boolean d10 = pVar.d(1);
        if (this.f12113e || this.f12119k) {
            URL url2 = url;
            int i11 = i10;
            byte[] bArr2 = bArr;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 > 20) {
                    throw new a0(new NoRouteToHostException("Too many redirects: " + i13), pVar, 2001, 1);
                }
                int i14 = i11;
                long j12 = j10;
                URL url3 = url2;
                long j13 = j11;
                y10 = y(url2, i11, bArr2, j10, j11, d10, false, pVar.f12038e);
                int responseCode = y10.getResponseCode();
                String headerField = y10.getHeaderField("Location");
                if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    y10.disconnect();
                    url2 = w(url3, headerField, pVar);
                    i11 = i14;
                } else if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                } else {
                    y10.disconnect();
                    if (this.f12119k && responseCode == 302) {
                        i11 = i14;
                    } else {
                        bArr2 = null;
                        i11 = 1;
                    }
                    url2 = w(url3, headerField, pVar);
                }
                i12 = i13;
                j10 = j12;
                j11 = j13;
            }
            return y10;
        }
        return y(url, i10, bArr, j10, j11, d10, true, pVar.f12038e);
    }

    HttpURLConnection B(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        try {
            return C(bArr, i10, i11);
        } catch (IOException e10) {
            throw a0.c(e10, (p) p3.m0.j(this.f12121m), 2);
        }
    }

    @Override // o3.l
    public void close() {
        try {
            InputStream inputStream = this.f12123o;
            if (inputStream != null) {
                long j10 = this.f12126r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f12127s;
                }
                A(this.f12122n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new a0(e10, (p) p3.m0.j(this.f12121m), 2000, 3);
                }
            }
        } finally {
            this.f12123o = null;
            v();
            if (this.f12124p) {
                this.f12124p = false;
                s();
            }
        }
    }

    @Override // o3.g, o3.l
    public Map<String, List<String>> f() {
        HttpURLConnection httpURLConnection = this.f12122n;
        return httpURLConnection == null ? b5.r.j() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // o3.l
    public Uri k() {
        HttpURLConnection httpURLConnection = this.f12122n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // o3.l
    public long n(p pVar) {
        byte[] bArr;
        this.f12121m = pVar;
        long j10 = 0;
        this.f12127s = 0L;
        this.f12126r = 0L;
        t(pVar);
        try {
            HttpURLConnection z10 = z(pVar);
            this.f12122n = z10;
            this.f12125q = z10.getResponseCode();
            String responseMessage = z10.getResponseMessage();
            int i10 = this.f12125q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = z10.getHeaderFields();
                if (this.f12125q == 416) {
                    if (pVar.f12040g == e0.c(z10.getHeaderField("Content-Range"))) {
                        this.f12124p = true;
                        u(pVar);
                        long j11 = pVar.f12041h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = z10.getErrorStream();
                try {
                    bArr = errorStream != null ? p3.m0.T0(errorStream) : p3.m0.f12311f;
                } catch (IOException unused) {
                    bArr = p3.m0.f12311f;
                }
                byte[] bArr2 = bArr;
                v();
                throw new c0(this.f12125q, responseMessage, this.f12125q == 416 ? new m(2008) : null, headerFields, pVar, bArr2);
            }
            String contentType = z10.getContentType();
            a5.k<String> kVar = this.f12120l;
            if (kVar != null && !kVar.apply(contentType)) {
                v();
                throw new b0(contentType, pVar);
            }
            if (this.f12125q == 200) {
                long j12 = pVar.f12040g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean x10 = x(z10);
            if (x10) {
                this.f12126r = pVar.f12041h;
            } else {
                long j13 = pVar.f12041h;
                if (j13 != -1) {
                    this.f12126r = j13;
                } else {
                    long b10 = e0.b(z10.getHeaderField("Content-Length"), z10.getHeaderField("Content-Range"));
                    this.f12126r = b10 != -1 ? b10 - j10 : -1L;
                }
            }
            try {
                this.f12123o = z10.getInputStream();
                if (x10) {
                    this.f12123o = new GZIPInputStream(this.f12123o);
                }
                this.f12124p = true;
                u(pVar);
                try {
                    D(j10, pVar);
                    return this.f12126r;
                } catch (IOException e10) {
                    v();
                    if (e10 instanceof a0) {
                        throw ((a0) e10);
                    }
                    throw new a0(e10, pVar, 2000, 1);
                }
            } catch (IOException e11) {
                v();
                throw new a0(e11, pVar, 2000, 1);
            }
        } catch (IOException e12) {
            v();
            throw a0.c(e12, pVar, 1);
        }
    }
}
