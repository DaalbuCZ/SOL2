package o3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f11966e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f11967f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f11968g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f11969h;

    /* renamed from: i  reason: collision with root package name */
    private long f11970i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11971j;

    /* loaded from: classes.dex */
    public static class a extends m {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public h(Context context) {
        super(false);
        this.f11966e = context.getContentResolver();
    }

    @Override // o3.i
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f11970i;
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
        int read = ((FileInputStream) p3.m0.j(this.f11969h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f11970i;
        if (j11 != -1) {
            this.f11970i = j11 - read;
        }
        r(read);
        return read;
    }

    @Override // o3.l
    public void close() {
        this.f11967f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f11969h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f11969h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f11968g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f11968g = null;
                        if (this.f11971j) {
                            this.f11971j = false;
                            s();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(e10, 2000);
                }
            } catch (IOException e11) {
                throw new a(e11, 2000);
            }
        } catch (Throwable th) {
            this.f11969h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f11968g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f11968g = null;
                    if (this.f11971j) {
                        this.f11971j = false;
                        s();
                    }
                    throw th;
                } catch (IOException e12) {
                    throw new a(e12, 2000);
                }
            } finally {
                this.f11968g = null;
                if (this.f11971j) {
                    this.f11971j = false;
                    s();
                }
            }
        }
    }

    @Override // o3.l
    public Uri k() {
        return this.f11967f;
    }

    @Override // o3.l
    public long n(p pVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = pVar.f12034a;
            this.f11967f = uri;
            t(pVar);
            if ("content".equals(pVar.f12034a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f11966e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f11966e.openAssetFileDescriptor(uri, "r");
            }
            this.f11968g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f11969h = fileInputStream;
            int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
            if (i10 != 0 && pVar.f12040g > length) {
                throw new a(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(pVar.f12040g + startOffset) - startOffset;
            if (skip == pVar.f12040g) {
                if (i10 == 0) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f11970i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f11970i = position;
                        if (position < 0) {
                            throw new a(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - skip;
                    this.f11970i = j10;
                    if (j10 < 0) {
                        throw new a(null, 2008);
                    }
                }
                long j11 = pVar.f12041h;
                if (j11 != -1) {
                    long j12 = this.f11970i;
                    if (j12 != -1) {
                        j11 = Math.min(j12, j11);
                    }
                    this.f11970i = j11;
                }
                this.f11971j = true;
                u(pVar);
                long j13 = pVar.f12041h;
                return j13 != -1 ? j13 : this.f11970i;
            }
            throw new a(null, 2008);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
