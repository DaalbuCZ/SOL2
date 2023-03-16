package d2;

import android.util.Pair;
import android.util.SparseArray;
import c.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p3.a0;
import p3.m0;
import p3.s;
import p3.w;
import s1.h2;
import s1.i;
import w1.m;
import x1.b0;
import x1.e0;
import x1.f0;
import x1.l;
import x1.m;
import x1.n;
import x1.r;
/* loaded from: classes.dex */
public class e implements l {

    /* renamed from: c0  reason: collision with root package name */
    public static final r f6437c0 = d.f6436b;

    /* renamed from: d0  reason: collision with root package name */
    private static final byte[] f6438d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0  reason: collision with root package name */
    private static final byte[] f6439e0 = m0.l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0  reason: collision with root package name */
    private static final byte[] f6440f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0  reason: collision with root package name */
    private static final byte[] f6441g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0  reason: collision with root package name */
    private static final UUID f6442h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0  reason: collision with root package name */
    private static final Map<String, Integer> f6443i0;
    private long A;
    private long B;
    private s C;
    private s D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* renamed from: a  reason: collision with root package name */
    private final d2.c f6444a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f6445a0;

    /* renamed from: b  reason: collision with root package name */
    private final g f6446b;

    /* renamed from: b0  reason: collision with root package name */
    private n f6447b0;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<c> f6448c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6449d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f6450e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f6451f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f6452g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f6453h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f6454i;

    /* renamed from: j  reason: collision with root package name */
    private final a0 f6455j;

    /* renamed from: k  reason: collision with root package name */
    private final a0 f6456k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f6457l;

    /* renamed from: m  reason: collision with root package name */
    private final a0 f6458m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f6459n;

    /* renamed from: o  reason: collision with root package name */
    private ByteBuffer f6460o;

    /* renamed from: p  reason: collision with root package name */
    private long f6461p;

    /* renamed from: q  reason: collision with root package name */
    private long f6462q;

    /* renamed from: r  reason: collision with root package name */
    private long f6463r;

    /* renamed from: s  reason: collision with root package name */
    private long f6464s;

    /* renamed from: t  reason: collision with root package name */
    private long f6465t;

    /* renamed from: u  reason: collision with root package name */
    private c f6466u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6467v;

    /* renamed from: w  reason: collision with root package name */
    private int f6468w;

    /* renamed from: x  reason: collision with root package name */
    private long f6469x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6470y;

    /* renamed from: z  reason: collision with root package name */
    private long f6471z;

    /* loaded from: classes.dex */
    private final class b implements d2.b {
        private b() {
        }

        @Override // d2.b
        public void a(int i10) {
            e.this.p(i10);
        }

        @Override // d2.b
        public int b(int i10) {
            return e.this.v(i10);
        }

        @Override // d2.b
        public void c(int i10, double d10) {
            e.this.s(i10, d10);
        }

        @Override // d2.b
        public boolean d(int i10) {
            return e.this.A(i10);
        }

        @Override // d2.b
        public void e(int i10, int i11, m mVar) {
            e.this.m(i10, i11, mVar);
        }

        @Override // d2.b
        public void f(int i10, String str) {
            e.this.I(i10, str);
        }

        @Override // d2.b
        public void g(int i10, long j10, long j11) {
            e.this.H(i10, j10, j11);
        }

        @Override // d2.b
        public void h(int i10, long j10) {
            e.this.y(i10, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class c {
        public byte[] N;
        public f0 T;
        public boolean U;
        public e0 X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f6473a;

        /* renamed from: b  reason: collision with root package name */
        public String f6474b;

        /* renamed from: c  reason: collision with root package name */
        public int f6475c;

        /* renamed from: d  reason: collision with root package name */
        public int f6476d;

        /* renamed from: e  reason: collision with root package name */
        public int f6477e;

        /* renamed from: f  reason: collision with root package name */
        public int f6478f;

        /* renamed from: g  reason: collision with root package name */
        private int f6479g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6480h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f6481i;

        /* renamed from: j  reason: collision with root package name */
        public e0.a f6482j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f6483k;

        /* renamed from: l  reason: collision with root package name */
        public w1.m f6484l;

        /* renamed from: m  reason: collision with root package name */
        public int f6485m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f6486n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f6487o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f6488p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f6489q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f6490r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f6491s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f6492t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f6493u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f6494v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f6495w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f6496x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f6497y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f6498z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void f() {
            p3.a.e(this.X);
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] g(String str) {
            byte[] bArr = this.f6483k;
            if (bArr != null) {
                return bArr;
            }
            throw h2.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(a0 a0Var) {
            try {
                a0Var.P(16);
                long s10 = a0Var.s();
                if (s10 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (s10 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (s10 != 826496599) {
                    p3.r.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] d10 = a0Var.d();
                for (int e10 = a0Var.e() + 20; e10 < d10.length - 4; e10++) {
                    if (d10[e10] == 0 && d10[e10 + 1] == 0 && d10[e10 + 2] == 1 && d10[e10 + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d10, e10, d10.length)));
                    }
                }
                throw h2.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw h2.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(a0 a0Var) {
            try {
                int u10 = a0Var.u();
                if (u10 == 1) {
                    return true;
                }
                if (u10 == 65534) {
                    a0Var.O(24);
                    if (a0Var.v() == e.f6442h0.getMostSignificantBits()) {
                        if (a0Var.v() == e.f6442h0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw h2.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i10 = 0;
                    int i11 = 1;
                    while ((bArr[i11] & 255) == 255) {
                        i10 += 255;
                        i11++;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 + (bArr[i11] & 255);
                    int i14 = 0;
                    while ((bArr[i12] & 255) == 255) {
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (bArr[i12] & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i18];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw h2.a("Error parsing vorbis codec private", null);
                        }
                        throw h2.a("Error parsing vorbis codec private", null);
                    }
                    throw h2.a("Error parsing vorbis codec private", null);
                }
                throw h2.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw h2.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f6474b) ? z10 : this.f6478f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:203:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x03e4  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x03f3  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x050e  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(x1.n r20, int r21) {
            /*
                Method dump skipped, instructions count: 1572
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d2.e.c.i(x1.n, int):void");
        }

        @RequiresNonNull({"output"})
        public void j() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.a(this.X, this.f6482j);
            }
        }

        public void n() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f6443i0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(new d2.a(), i10);
    }

    e(d2.c cVar, int i10) {
        this.f6462q = -1L;
        this.f6463r = -9223372036854775807L;
        this.f6464s = -9223372036854775807L;
        this.f6465t = -9223372036854775807L;
        this.f6471z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f6444a = cVar;
        cVar.d(new b());
        this.f6449d = (i10 & 1) == 0;
        this.f6446b = new g();
        this.f6448c = new SparseArray<>();
        this.f6452g = new a0(4);
        this.f6453h = new a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f6454i = new a0(4);
        this.f6450e = new a0(w.f12350a);
        this.f6451f = new a0(4);
        this.f6455j = new a0();
        this.f6456k = new a0();
        this.f6457l = new a0(8);
        this.f6458m = new a0();
        this.f6459n = new a0();
        this.L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] B() {
        return new l[]{new e()};
    }

    private boolean C(x1.a0 a0Var, long j10) {
        if (this.f6470y) {
            this.A = j10;
            a0Var.f16188a = this.f6471z;
            this.f6470y = false;
            return true;
        }
        if (this.f6467v) {
            long j11 = this.A;
            if (j11 != -1) {
                a0Var.f16188a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void D(m mVar, int i10) {
        if (this.f6452g.f() >= i10) {
            return;
        }
        if (this.f6452g.b() < i10) {
            a0 a0Var = this.f6452g;
            a0Var.c(Math.max(a0Var.b() * 2, i10));
        }
        mVar.readFully(this.f6452g.d(), this.f6452g.f(), i10 - this.f6452g.f());
        this.f6452g.N(i10);
    }

    private void E() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f6445a0 = false;
        this.f6455j.K(0);
    }

    private long F(long j10) {
        long j11 = this.f6463r;
        if (j11 != -9223372036854775807L) {
            return m0.M0(j10, j11, 1000L);
        }
        throw h2.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void G(String str, long j10, byte[] bArr) {
        byte[] t10;
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                t10 = t(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                t10 = t(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                t10 = t(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(t10, 0, bArr, i10, t10.length);
    }

    @RequiresNonNull({"#2.output"})
    private int J(m mVar, c cVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f6474b)) {
            K(mVar, f6438d0, i10);
        } else if ("S_TEXT/ASS".equals(cVar.f6474b)) {
            K(mVar, f6440f0, i10);
        } else if (!"S_TEXT/WEBVTT".equals(cVar.f6474b)) {
            e0 e0Var = cVar.X;
            if (!this.V) {
                if (cVar.f6480h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        mVar.readFully(this.f6452g.d(), 0, 1);
                        this.S++;
                        if ((this.f6452g.d()[0] & 128) == 128) {
                            throw h2.a("Extension bit is set in signal byte", null);
                        }
                        this.Z = this.f6452g.d()[0];
                        this.W = true;
                    }
                    byte b10 = this.Z;
                    if ((b10 & 1) == 1) {
                        boolean z11 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.f6445a0) {
                            mVar.readFully(this.f6457l.d(), 0, 8);
                            this.S += 8;
                            this.f6445a0 = true;
                            this.f6452g.d()[0] = (byte) ((z11 ? 128 : 0) | 8);
                            this.f6452g.O(0);
                            e0Var.b(this.f6452g, 1, 1);
                            this.T++;
                            this.f6457l.O(0);
                            e0Var.b(this.f6457l, 8, 1);
                            this.T += 8;
                        }
                        if (z11) {
                            if (!this.X) {
                                mVar.readFully(this.f6452g.d(), 0, 1);
                                this.S++;
                                this.f6452g.O(0);
                                this.Y = this.f6452g.C();
                                this.X = true;
                            }
                            int i12 = this.Y * 4;
                            this.f6452g.K(i12);
                            mVar.readFully(this.f6452g.d(), 0, i12);
                            this.S += i12;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i13 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f6460o;
                            if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                this.f6460o = ByteBuffer.allocate(i13);
                            }
                            this.f6460o.position(0);
                            this.f6460o.putShort(s10);
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i14 >= i11) {
                                    break;
                                }
                                int G = this.f6452g.G();
                                if (i14 % 2 == 0) {
                                    this.f6460o.putShort((short) (G - i15));
                                } else {
                                    this.f6460o.putInt(G - i15);
                                }
                                i14++;
                                i15 = G;
                            }
                            int i16 = (i10 - this.S) - i15;
                            int i17 = i11 % 2;
                            ByteBuffer byteBuffer2 = this.f6460o;
                            if (i17 == 1) {
                                byteBuffer2.putInt(i16);
                            } else {
                                byteBuffer2.putShort((short) i16);
                                this.f6460o.putInt(0);
                            }
                            this.f6458m.M(this.f6460o.array(), i13);
                            e0Var.b(this.f6458m, i13, 1);
                            this.T += i13;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f6481i;
                    if (bArr != null) {
                        this.f6455j.M(bArr, bArr.length);
                    }
                }
                if (cVar.o(z10)) {
                    this.O |= 268435456;
                    this.f6459n.K(0);
                    int f10 = (this.f6455j.f() + i10) - this.S;
                    this.f6452g.K(4);
                    this.f6452g.d()[0] = (byte) ((f10 >> 24) & 255);
                    this.f6452g.d()[1] = (byte) ((f10 >> 16) & 255);
                    this.f6452g.d()[2] = (byte) ((f10 >> 8) & 255);
                    this.f6452g.d()[3] = (byte) (f10 & 255);
                    e0Var.b(this.f6452g, 4, 2);
                    this.T += 4;
                }
                this.V = true;
            }
            int f11 = i10 + this.f6455j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f6474b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f6474b)) {
                if (cVar.T != null) {
                    p3.a.f(this.f6455j.f() == 0);
                    cVar.T.d(mVar);
                }
                while (true) {
                    int i18 = this.S;
                    if (i18 >= f11) {
                        break;
                    }
                    int L = L(mVar, e0Var, f11 - i18);
                    this.S += L;
                    this.T += L;
                }
            } else {
                byte[] d10 = this.f6451f.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i19 = cVar.Y;
                int i20 = 4 - i19;
                while (this.S < f11) {
                    int i21 = this.U;
                    if (i21 == 0) {
                        M(mVar, d10, i20, i19);
                        this.S += i19;
                        this.f6451f.O(0);
                        this.U = this.f6451f.G();
                        this.f6450e.O(0);
                        e0Var.d(this.f6450e, 4);
                        this.T += 4;
                    } else {
                        int L2 = L(mVar, e0Var, i21);
                        this.S += L2;
                        this.T += L2;
                        this.U -= L2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f6474b)) {
                this.f6453h.O(0);
                e0Var.d(this.f6453h, 4);
                this.T += 4;
            }
            return r();
        } else {
            K(mVar, f6441g0, i10);
        }
        return r();
    }

    private void K(m mVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f6456k.b() < length) {
            this.f6456k.L(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f6456k.d(), 0, bArr.length);
        }
        mVar.readFully(this.f6456k.d(), bArr.length, i10);
        this.f6456k.O(0);
        this.f6456k.N(length);
    }

    private int L(m mVar, e0 e0Var, int i10) {
        int a10 = this.f6455j.a();
        if (a10 > 0) {
            int min = Math.min(i10, a10);
            e0Var.d(this.f6455j, min);
            return min;
        }
        return e0Var.f(mVar, i10, false);
    }

    private void M(m mVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f6455j.a());
        mVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f6455j.j(bArr, i10, min);
        }
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void h(int i10) {
        if (this.C == null || this.D == null) {
            throw h2.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void k(int i10) {
        if (this.f6466u != null) {
            return;
        }
        throw h2.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void l() {
        p3.a.h(this.f6447b0);
    }

    private b0 n(s sVar, s sVar2) {
        int i10;
        if (this.f6462q == -1 || this.f6465t == -9223372036854775807L || sVar == null || sVar.c() == 0 || sVar2 == null || sVar2.c() != sVar.c()) {
            return new b0.b(this.f6465t);
        }
        int c10 = sVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = sVar.b(i12);
            jArr[i12] = this.f6462q + sVar2.b(i12);
        }
        while (true) {
            i10 = c10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f6462q + this.f6461p) - jArr[i10]);
        jArr2[i10] = this.f6465t - jArr3[i10];
        long j10 = jArr2[i10];
        if (j10 <= 0) {
            p3.r.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new x1.d(iArr, jArr, jArr2, jArr3);
    }

    @RequiresNonNull({"#1.output"})
    private void o(c cVar, long j10, int i10, int i11, int i12) {
        String str;
        f0 f0Var = cVar.T;
        if (f0Var != null) {
            f0Var.c(cVar.X, j10, i10, i11, i12, cVar.f6482j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f6474b) || "S_TEXT/ASS".equals(cVar.f6474b) || "S_TEXT/WEBVTT".equals(cVar.f6474b)) {
                if (this.K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        G(cVar.f6474b, j11, this.f6456k.d());
                        int e10 = this.f6456k.e();
                        while (true) {
                            if (e10 >= this.f6456k.f()) {
                                break;
                            } else if (this.f6456k.d()[e10] == 0) {
                                this.f6456k.N(e10);
                                break;
                            } else {
                                e10++;
                            }
                        }
                        e0 e0Var = cVar.X;
                        a0 a0Var = this.f6456k;
                        e0Var.d(a0Var, a0Var.f());
                        i11 += this.f6456k.f();
                    }
                }
                p3.r.i("MatroskaExtractor", str);
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    this.f6459n.K(0);
                } else {
                    int f10 = this.f6459n.f();
                    cVar.X.b(this.f6459n, f10, 2);
                    i11 += f10;
                }
            }
            cVar.X.c(j10, i10, i11, i12, cVar.f6482j);
        }
        this.F = true;
    }

    private static int[] q(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int r() {
        int i10 = this.T;
        E();
        return i10;
    }

    private static byte[] t(long j10, String str, long j11) {
        p3.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return m0.l0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    private static boolean z(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case j.f3071t3 /* 23 */:
            case j.f3076u3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.f3101z3 /* 29 */:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    protected boolean A(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    protected void H(int i10, long j10, long j11) {
        l();
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
        } else if (i10 == 174) {
            this.f6466u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f6468w = -1;
            this.f6469x = -1L;
        } else if (i10 == 20533) {
            u(i10).f6480h = true;
        } else if (i10 == 21968) {
            u(i10).f6496x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f6462q;
            if (j12 != -1 && j12 != j10) {
                throw h2.a("Multiple Segment elements not supported", null);
            }
            this.f6462q = j10;
            this.f6461p = j11;
        } else if (i10 == 475249515) {
            this.C = new s();
            this.D = new s();
        } else if (i10 == 524531317 && !this.f6467v) {
            if (this.f6449d && this.f6471z != -1) {
                this.f6470y = true;
                return;
            }
            this.f6447b0.t(new b0.b(this.f6465t));
            this.f6467v = true;
        }
    }

    protected void I(int i10, String str) {
        if (i10 == 134) {
            u(i10).f6474b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                u(i10).f6473a = str;
            } else if (i10 != 2274716) {
            } else {
                u(i10).W = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            throw h2.a("DocType " + str + " not supported", null);
        }
    }

    @Override // x1.l
    public final void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f6444a.c();
        this.f6446b.e();
        E();
        for (int i10 = 0; i10 < this.f6448c.size(); i10++) {
            this.f6448c.valueAt(i10).n();
        }
    }

    @Override // x1.l
    public final void c(n nVar) {
        this.f6447b0 = nVar;
    }

    @Override // x1.l
    public final int i(m mVar, x1.a0 a0Var) {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f6444a.b(mVar);
            if (z10 && C(a0Var, mVar.q())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f6448c.size(); i10++) {
            c valueAt = this.f6448c.valueAt(i10);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    @Override // x1.l
    public final boolean j(m mVar) {
        return new f().b(mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0241, code lost:
        throw s1.h2.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m(int r22, int r23, x1.m r24) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.e.m(int, int, x1.m):void");
    }

    protected void p(int i10) {
        l();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            c cVar = this.f6448c.get(this.M);
            cVar.f();
            if (this.R > 0 && "A_OPUS".equals(cVar.f6474b)) {
                this.f6459n.L(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            int i13 = 0;
            while (i13 < this.K) {
                long j10 = this.H + ((cVar.f6477e * i13) / 1000);
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                int i16 = i11 - i15;
                o(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.G = 0;
        } else if (i10 == 174) {
            c cVar2 = (c) p3.a.h(this.f6466u);
            String str = cVar2.f6474b;
            if (str == null) {
                throw h2.a("CodecId is missing in TrackEntry element", null);
            }
            if (z(str)) {
                cVar2.i(this.f6447b0, cVar2.f6475c);
                this.f6448c.put(cVar2.f6475c, cVar2);
            }
            this.f6466u = null;
        } else if (i10 == 19899) {
            int i17 = this.f6468w;
            if (i17 != -1) {
                long j11 = this.f6469x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f6471z = j11;
                        return;
                    }
                    return;
                }
            }
            throw h2.a("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i10 == 25152) {
            k(i10);
            c cVar3 = this.f6466u;
            if (cVar3.f6480h) {
                if (cVar3.f6482j == null) {
                    throw h2.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f6484l = new w1.m(new m.b(i.f13425a, "video/webm", this.f6466u.f6482j.f16210b));
            }
        } else if (i10 == 28032) {
            k(i10);
            c cVar4 = this.f6466u;
            if (cVar4.f6480h && cVar4.f6481i != null) {
                throw h2.a("Combining encryption and compression is not supported", null);
            }
        } else if (i10 == 357149030) {
            if (this.f6463r == -9223372036854775807L) {
                this.f6463r = 1000000L;
            }
            long j12 = this.f6464s;
            if (j12 != -9223372036854775807L) {
                this.f6465t = F(j12);
            }
        } else if (i10 == 374648427) {
            if (this.f6448c.size() == 0) {
                throw h2.a("No valid tracks were found", null);
            }
            this.f6447b0.i();
        } else if (i10 == 475249515) {
            if (!this.f6467v) {
                this.f6447b0.t(n(this.C, this.D));
                this.f6467v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void s(int i10, double d10) {
        if (i10 == 181) {
            u(i10).Q = (int) d10;
        } else if (i10 == 17545) {
            this.f6464s = (long) d10;
        } else {
            switch (i10) {
                case 21969:
                    u(i10).D = (float) d10;
                    return;
                case 21970:
                    u(i10).E = (float) d10;
                    return;
                case 21971:
                    u(i10).F = (float) d10;
                    return;
                case 21972:
                    u(i10).G = (float) d10;
                    return;
                case 21973:
                    u(i10).H = (float) d10;
                    return;
                case 21974:
                    u(i10).I = (float) d10;
                    return;
                case 21975:
                    u(i10).J = (float) d10;
                    return;
                case 21976:
                    u(i10).K = (float) d10;
                    return;
                case 21977:
                    u(i10).L = (float) d10;
                    return;
                case 21978:
                    u(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            u(i10).f6491s = (float) d10;
                            return;
                        case 30324:
                            u(i10).f6492t = (float) d10;
                            return;
                        case 30325:
                            u(i10).f6493u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    protected c u(int i10) {
        k(i10);
        return this.f6466u;
    }

    protected int v(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void w(c cVar, x1.m mVar, int i10) {
        if (cVar.f6479g != 1685485123 && cVar.f6479g != 1685480259) {
            mVar.h(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        mVar.readFully(bArr, 0, i10);
    }

    protected void x(c cVar, int i10, x1.m mVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f6474b)) {
            mVar.h(i11);
            return;
        }
        this.f6459n.K(i11);
        mVar.readFully(this.f6459n.d(), 0, i11);
    }

    protected void y(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw h2.a("ContentEncodingOrder " + j10 + " not supported", null);
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw h2.a("ContentEncodingScope " + j10 + " not supported", null);
        } else {
            switch (i10) {
                case 131:
                    u(i10).f6476d = (int) j10;
                    return;
                case 136:
                    u(i10).V = j10 == 1;
                    return;
                case 155:
                    this.I = F(j10);
                    return;
                case 159:
                    u(i10).O = (int) j10;
                    return;
                case 176:
                    u(i10).f6485m = (int) j10;
                    return;
                case 179:
                    h(i10);
                    this.C.a(F(j10));
                    return;
                case 186:
                    u(i10).f6486n = (int) j10;
                    return;
                case 215:
                    u(i10).f6475c = (int) j10;
                    return;
                case 231:
                    this.B = F(j10);
                    return;
                case 238:
                    this.P = (int) j10;
                    return;
                case 241:
                    if (this.E) {
                        return;
                    }
                    h(i10);
                    this.D.a(j10);
                    this.E = true;
                    return;
                case 251:
                    this.Q = true;
                    return;
                case 16871:
                    u(i10).f6479g = (int) j10;
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    throw h2.a("ContentCompAlgo " + j10 + " not supported", null);
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        throw h2.a("DocTypeReadVersion " + j10 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    throw h2.a("EBMLReadVersion " + j10 + " not supported", null);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    throw h2.a("ContentEncAlgo " + j10 + " not supported", null);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    throw h2.a("AESSettingsCipherMode " + j10 + " not supported", null);
                case 21420:
                    this.f6469x = j10 + this.f6462q;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    k(i10);
                    if (i11 == 0) {
                        this.f6466u.f6495w = 0;
                        return;
                    } else if (i11 == 1) {
                        this.f6466u.f6495w = 2;
                        return;
                    } else if (i11 == 3) {
                        this.f6466u.f6495w = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.f6466u.f6495w = 3;
                        return;
                    }
                case 21680:
                    u(i10).f6487o = (int) j10;
                    return;
                case 21682:
                    u(i10).f6489q = (int) j10;
                    return;
                case 21690:
                    u(i10).f6488p = (int) j10;
                    return;
                case 21930:
                    u(i10).U = j10 == 1;
                    return;
                case 21998:
                    u(i10).f6478f = (int) j10;
                    return;
                case 22186:
                    u(i10).R = j10;
                    return;
                case 22203:
                    u(i10).S = j10;
                    return;
                case 25188:
                    u(i10).P = (int) j10;
                    return;
                case 30114:
                    this.R = j10;
                    return;
                case 30321:
                    k(i10);
                    int i12 = (int) j10;
                    if (i12 == 0) {
                        this.f6466u.f6490r = 0;
                        return;
                    } else if (i12 == 1) {
                        this.f6466u.f6490r = 1;
                        return;
                    } else if (i12 == 2) {
                        this.f6466u.f6490r = 2;
                        return;
                    } else if (i12 != 3) {
                        return;
                    } else {
                        this.f6466u.f6490r = 3;
                        return;
                    }
                case 2352003:
                    u(i10).f6477e = (int) j10;
                    return;
                case 2807729:
                    this.f6463r = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            k(i10);
                            int i13 = (int) j10;
                            if (i13 == 1) {
                                this.f6466u.A = 2;
                                return;
                            } else if (i13 != 2) {
                                return;
                            } else {
                                this.f6466u.A = 1;
                                return;
                            }
                        case 21946:
                            k(i10);
                            int c10 = q3.c.c((int) j10);
                            if (c10 != -1) {
                                this.f6466u.f6498z = c10;
                                return;
                            }
                            return;
                        case 21947:
                            k(i10);
                            this.f6466u.f6496x = true;
                            int b10 = q3.c.b((int) j10);
                            if (b10 != -1) {
                                this.f6466u.f6497y = b10;
                                return;
                            }
                            return;
                        case 21948:
                            u(i10).B = (int) j10;
                            return;
                        case 21949:
                            u(i10).C = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }
}
