package r5;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e implements Closeable {

    /* renamed from: t  reason: collision with root package name */
    private static final Logger f13029t = Logger.getLogger(e.class.getName());

    /* renamed from: n  reason: collision with root package name */
    private final RandomAccessFile f13030n;

    /* renamed from: o  reason: collision with root package name */
    int f13031o;

    /* renamed from: p  reason: collision with root package name */
    private int f13032p;

    /* renamed from: q  reason: collision with root package name */
    private b f13033q;

    /* renamed from: r  reason: collision with root package name */
    private b f13034r;

    /* renamed from: s  reason: collision with root package name */
    private final byte[] f13035s = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        boolean f13036a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StringBuilder f13037b;

        a(StringBuilder sb) {
            this.f13037b = sb;
        }

        @Override // r5.e.d
        public void a(InputStream inputStream, int i10) {
            if (this.f13036a) {
                this.f13036a = false;
            } else {
                this.f13037b.append(", ");
            }
            this.f13037b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        static final b f13039c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        final int f13040a;

        /* renamed from: b  reason: collision with root package name */
        final int f13041b;

        b(int i10, int i11) {
            this.f13040a = i10;
            this.f13041b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f13040a + ", length = " + this.f13041b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: n  reason: collision with root package name */
        private int f13042n;

        /* renamed from: o  reason: collision with root package name */
        private int f13043o;

        private c(b bVar) {
            this.f13042n = e.this.Z(bVar.f13040a + 4);
            this.f13043o = bVar.f13041b;
        }

        /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f13043o == 0) {
                return -1;
            }
            e.this.f13030n.seek(this.f13042n);
            int read = e.this.f13030n.read();
            this.f13042n = e.this.Z(this.f13042n + 1);
            this.f13043o--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            e.B(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f13043o;
            if (i12 > 0) {
                if (i11 > i12) {
                    i11 = i12;
                }
                e.this.S(this.f13042n, bArr, i10, i11);
                this.f13042n = e.this.Z(this.f13042n + i11);
                this.f13043o -= i11;
                return i11;
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(InputStream inputStream, int i10);
    }

    public e(File file) {
        if (!file.exists()) {
            t(file);
        }
        this.f13030n = D(file);
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T B(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    private static RandomAccessFile D(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b E(int i10) {
        if (i10 == 0) {
            return b.f13039c;
        }
        this.f13030n.seek(i10);
        return new b(i10, this.f13030n.readInt());
    }

    private void G() {
        this.f13030n.seek(0L);
        this.f13030n.readFully(this.f13035s);
        int N = N(this.f13035s, 0);
        this.f13031o = N;
        if (N <= this.f13030n.length()) {
            this.f13032p = N(this.f13035s, 4);
            int N2 = N(this.f13035s, 8);
            int N3 = N(this.f13035s, 12);
            this.f13033q = E(N2);
            this.f13034r = E(N3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f13031o + ", Actual length: " + this.f13030n.length());
    }

    private static int N(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int O() {
        return this.f13031o - Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int Z = Z(i10);
        int i13 = Z + i12;
        int i14 = this.f13031o;
        if (i13 <= i14) {
            this.f13030n.seek(Z);
            randomAccessFile = this.f13030n;
        } else {
            int i15 = i14 - Z;
            this.f13030n.seek(Z);
            this.f13030n.readFully(bArr, i11, i15);
            this.f13030n.seek(16L);
            randomAccessFile = this.f13030n;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.readFully(bArr, i11, i12);
    }

    private void W(int i10, byte[] bArr, int i11, int i12) {
        RandomAccessFile randomAccessFile;
        int Z = Z(i10);
        int i13 = Z + i12;
        int i14 = this.f13031o;
        if (i13 <= i14) {
            this.f13030n.seek(Z);
            randomAccessFile = this.f13030n;
        } else {
            int i15 = i14 - Z;
            this.f13030n.seek(Z);
            this.f13030n.write(bArr, i11, i15);
            this.f13030n.seek(16L);
            randomAccessFile = this.f13030n;
            i11 += i15;
            i12 -= i15;
        }
        randomAccessFile.write(bArr, i11, i12);
    }

    private void X(int i10) {
        this.f13030n.setLength(i10);
        this.f13030n.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z(int i10) {
        int i11 = this.f13031o;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void a0(int i10, int i11, int i12, int i13) {
        c0(this.f13035s, i10, i11, i12, i13);
        this.f13030n.seek(0L);
        this.f13030n.write(this.f13035s);
    }

    private static void b0(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void c0(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            b0(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void p(int i10) {
        int i11 = i10 + 4;
        int O = O();
        if (O >= i11) {
            return;
        }
        int i12 = this.f13031o;
        do {
            O += i12;
            i12 <<= 1;
        } while (O < i11);
        X(i12);
        b bVar = this.f13034r;
        int Z = Z(bVar.f13040a + 4 + bVar.f13041b);
        if (Z < this.f13033q.f13040a) {
            FileChannel channel = this.f13030n.getChannel();
            channel.position(this.f13031o);
            long j10 = Z - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f13034r.f13040a;
        int i14 = this.f13033q.f13040a;
        if (i13 < i14) {
            int i15 = (this.f13031o + i13) - 16;
            a0(i12, this.f13032p, i14, i15);
            this.f13034r = new b(i15, this.f13034r.f13041b);
        } else {
            a0(i12, this.f13032p, i14, i13);
        }
        this.f13031o = i12;
    }

    private static void t(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile D = D(file2);
        try {
            D.setLength(4096L);
            D.seek(0L);
            byte[] bArr = new byte[16];
            c0(bArr, 4096, 0, 0, 0);
            D.write(bArr);
            D.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            D.close();
            throw th;
        }
    }

    public synchronized void R() {
        if (y()) {
            throw new NoSuchElementException();
        }
        if (this.f13032p == 1) {
            o();
        } else {
            b bVar = this.f13033q;
            int Z = Z(bVar.f13040a + 4 + bVar.f13041b);
            S(Z, this.f13035s, 0, 4);
            int N = N(this.f13035s, 0);
            a0(this.f13031o, this.f13032p - 1, Z, this.f13034r.f13040a);
            this.f13032p--;
            this.f13033q = new b(Z, N);
        }
    }

    public int Y() {
        if (this.f13032p == 0) {
            return 16;
        }
        b bVar = this.f13034r;
        int i10 = bVar.f13040a;
        int i11 = this.f13033q.f13040a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f13041b + 16 : (((i10 + 4) + bVar.f13041b) + this.f13031o) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f13030n.close();
    }

    public void j(byte[] bArr) {
        k(bArr, 0, bArr.length);
    }

    public synchronized void k(byte[] bArr, int i10, int i11) {
        int Z;
        B(bArr, "buffer");
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        p(i11);
        boolean y10 = y();
        if (y10) {
            Z = 16;
        } else {
            b bVar = this.f13034r;
            Z = Z(bVar.f13040a + 4 + bVar.f13041b);
        }
        b bVar2 = new b(Z, i11);
        b0(this.f13035s, 0, i11);
        W(bVar2.f13040a, this.f13035s, 0, 4);
        W(bVar2.f13040a + 4, bArr, i10, i11);
        a0(this.f13031o, this.f13032p + 1, y10 ? bVar2.f13040a : this.f13033q.f13040a, bVar2.f13040a);
        this.f13034r = bVar2;
        this.f13032p++;
        if (y10) {
            this.f13033q = bVar2;
        }
    }

    public synchronized void o() {
        a0(4096, 0, 0, 0);
        this.f13032p = 0;
        b bVar = b.f13039c;
        this.f13033q = bVar;
        this.f13034r = bVar;
        if (this.f13031o > 4096) {
            X(4096);
        }
        this.f13031o = 4096;
    }

    public synchronized void r(d dVar) {
        int i10 = this.f13033q.f13040a;
        for (int i11 = 0; i11 < this.f13032p; i11++) {
            b E = E(i10);
            dVar.a(new c(this, E, null), E.f13041b);
            i10 = Z(E.f13040a + 4 + E.f13041b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f13031o);
        sb.append(", size=");
        sb.append(this.f13032p);
        sb.append(", first=");
        sb.append(this.f13033q);
        sb.append(", last=");
        sb.append(this.f13034r);
        sb.append(", element lengths=[");
        try {
            r(new a(sb));
        } catch (IOException e10) {
            f13029t.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized boolean y() {
        return this.f13032p == 0;
    }
}
