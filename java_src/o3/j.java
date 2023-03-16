package o3;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import s1.h2;
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: e  reason: collision with root package name */
    private p f11992e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f11993f;

    /* renamed from: g  reason: collision with root package name */
    private int f11994g;

    /* renamed from: h  reason: collision with root package name */
    private int f11995h;

    public j() {
        super(false);
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f11995h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(p3.m0.j(this.f11993f), this.f11994g, bArr, i10, min);
        this.f11994g += min;
        this.f11995h -= min;
        r(min);
        return min;
    }

    @Override // o3.l
    public void close() {
        if (this.f11993f != null) {
            this.f11993f = null;
            s();
        }
        this.f11992e = null;
    }

    @Override // o3.l
    public Uri k() {
        p pVar = this.f11992e;
        if (pVar != null) {
            return pVar.f12034a;
        }
        return null;
    }

    @Override // o3.l
    public long n(p pVar) {
        t(pVar);
        this.f11992e = pVar;
        Uri uri = pVar.f12034a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        p3.a.b(equals, "Unsupported scheme: " + scheme);
        String[] P0 = p3.m0.P0(uri.getSchemeSpecificPart(), ",");
        if (P0.length != 2) {
            throw h2.b("Unexpected URI format: " + uri, null);
        }
        String str = P0[1];
        if (P0[0].contains(";base64")) {
            try {
                this.f11993f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw h2.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f11993f = p3.m0.l0(URLDecoder.decode(str, a5.d.f198a.name()));
        }
        long j10 = pVar.f12040g;
        byte[] bArr = this.f11993f;
        if (j10 > bArr.length) {
            this.f11993f = null;
            throw new m(2008);
        }
        int i10 = (int) j10;
        this.f11994g = i10;
        int length = bArr.length - i10;
        this.f11995h = length;
        long j11 = pVar.f12041h;
        if (j11 != -1) {
            this.f11995h = (int) Math.min(length, j11);
        }
        u(pVar);
        long j12 = pVar.f12041h;
        return j12 != -1 ? j12 : this.f11995h;
    }
}
