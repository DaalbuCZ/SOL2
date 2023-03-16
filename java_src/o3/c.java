package o3;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f11931e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f11932f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f11933g;

    /* renamed from: h  reason: collision with root package name */
    private long f11934h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11935i;

    /* loaded from: classes.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f11931e = context.getAssets();
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f11934h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) p3.m0.j(this.f11933g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f11934h;
        if (j11 != -1) {
            this.f11934h = j11 - read;
        }
        r(read);
        return read;
    }

    @Override // o3.l
    public void close() {
        this.f11932f = null;
        try {
            try {
                InputStream inputStream = this.f11933g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f11933g = null;
            if (this.f11935i) {
                this.f11935i = false;
                s();
            }
        }
    }

    @Override // o3.l
    public Uri k() {
        return this.f11932f;
    }

    @Override // o3.l
    public long n(p pVar) {
        try {
            Uri uri = pVar.f12034a;
            this.f11932f = uri;
            String str = (String) p3.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            t(pVar);
            InputStream open = this.f11931e.open(str, 1);
            this.f11933g = open;
            if (open.skip(pVar.f12040g) >= pVar.f12040g) {
                long j10 = pVar.f12041h;
                if (j10 != -1) {
                    this.f11934h = j10;
                } else {
                    long available = this.f11933g.available();
                    this.f11934h = available;
                    if (available == 2147483647L) {
                        this.f11934h = -1L;
                    }
                }
                this.f11935i = true;
                u(pVar);
                return this.f11934h;
            }
            throw new a(null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
