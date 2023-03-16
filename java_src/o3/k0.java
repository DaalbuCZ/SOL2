package o3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class k0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f12002e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12003f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f12004g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f12005h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f12006i;

    /* renamed from: j  reason: collision with root package name */
    private long f12007j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12008k;

    /* loaded from: classes.dex */
    public static class a extends m {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public k0(Context context) {
        super(false);
        this.f12002e = context.getResources();
        this.f12003f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f12007j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) p3.m0.j(this.f12006i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f12007j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f12007j;
        if (j11 != -1) {
            this.f12007j = j11 - read;
        }
        r(read);
        return read;
    }

    @Override // o3.l
    public void close() {
        this.f12004g = null;
        try {
            try {
                InputStream inputStream = this.f12006i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f12006i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f12005h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f12005h = null;
                        if (this.f12008k) {
                            this.f12008k = false;
                            s();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(null, e10, 2000);
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th) {
            this.f12006i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f12005h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f12005h = null;
                    if (this.f12008k) {
                        this.f12008k = false;
                        s();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f12005h = null;
                if (this.f12008k) {
                    this.f12008k = false;
                    s();
                }
            }
        }
    }

    @Override // o3.l
    public Uri k() {
        return this.f12004g;
    }

    @Override // o3.l
    public long n(p pVar) {
        int parseInt;
        String str;
        Uri uri = pVar.f12034a;
        this.f12004g = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((String) p3.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = Integer.parseInt((String) p3.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        } else if (!TextUtils.equals("android.resource", uri.getScheme())) {
            throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
        } else {
            String str2 = (String) p3.a.e(uri.getPath());
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            parseInt = this.f12002e.getIdentifier(sb.toString(), "raw", this.f12003f);
            if (parseInt == 0) {
                throw new a("Resource not found.", null, 2005);
            }
        }
        t(pVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f12002e.openRawResourceFd(parseInt);
            this.f12005h = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new a("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
            this.f12006i = fileInputStream;
            int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i10 != 0) {
                try {
                    if (pVar.f12040g > length) {
                        throw new a(null, null, 2008);
                    }
                } catch (a e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(pVar.f12040g + startOffset) - startOffset;
            if (skip == pVar.f12040g) {
                if (i10 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f12007j = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f12007j = size;
                        if (size < 0) {
                            throw new a(null, null, 2008);
                        }
                    }
                } else {
                    long j10 = length - skip;
                    this.f12007j = j10;
                    if (j10 < 0) {
                        throw new m(2008);
                    }
                }
                long j11 = pVar.f12041h;
                if (j11 != -1) {
                    long j12 = this.f12007j;
                    if (j12 != -1) {
                        j11 = Math.min(j12, j11);
                    }
                    this.f12007j = j11;
                }
                this.f12008k = true;
                u(pVar);
                long j13 = pVar.f12041h;
                return j13 != -1 ? j13 : this.f12007j;
            }
            throw new a(null, null, 2008);
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, 2005);
        }
    }
}
