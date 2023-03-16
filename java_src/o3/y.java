package o3;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class y extends g {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f12140e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f12141f;

    /* renamed from: g  reason: collision with root package name */
    private long f12142g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12143h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends m {
        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }

        public b(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public y() {
        super(false);
    }

    private static RandomAccessFile v(Uri uri) {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) p3.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, (p3.m0.f12306a < 21 || !a.b(e10.getCause())) ? 2005 : 2005);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f12142g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) p3.m0.j(this.f12140e)).read(bArr, i10, (int) Math.min(this.f12142g, i11));
            if (read > 0) {
                this.f12142g -= read;
                r(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // o3.l
    public void close() {
        this.f12141f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f12140e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f12140e = null;
            if (this.f12143h) {
                this.f12143h = false;
                s();
            }
        }
    }

    @Override // o3.l
    public Uri k() {
        return this.f12141f;
    }

    @Override // o3.l
    public long n(p pVar) {
        Uri uri = pVar.f12034a;
        this.f12141f = uri;
        t(pVar);
        RandomAccessFile v10 = v(uri);
        this.f12140e = v10;
        try {
            v10.seek(pVar.f12040g);
            long j10 = pVar.f12041h;
            if (j10 == -1) {
                j10 = this.f12140e.length() - pVar.f12040g;
            }
            this.f12142g = j10;
            if (j10 >= 0) {
                this.f12143h = true;
                u(pVar);
                return this.f12142g;
            }
            throw new b(null, null, 2008);
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
