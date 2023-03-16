package f3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import d3.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3.m0;
import p3.r;
import p3.z;
/* loaded from: classes.dex */
final class b {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f7171h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f7172i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f7173j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f7174a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f7175b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f7176c;

    /* renamed from: d  reason: collision with root package name */
    private final C0106b f7177d;

    /* renamed from: e  reason: collision with root package name */
    private final a f7178e;

    /* renamed from: f  reason: collision with root package name */
    private final h f7179f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f7180g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7181a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f7182b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f7183c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f7184d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f7181a = i10;
            this.f7182b = iArr;
            this.f7183c = iArr2;
            this.f7184d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0106b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7185a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7186b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7187c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7188d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7189e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7190f;

        public C0106b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f7185a = i10;
            this.f7186b = i11;
            this.f7187c = i12;
            this.f7188d = i13;
            this.f7189e = i14;
            this.f7190f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f7191a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7192b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f7193c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f7194d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f7191a = i10;
            this.f7192b = z10;
            this.f7193c = bArr;
            this.f7194d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f7195a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7196b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7197c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f7198d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f7195a = i10;
            this.f7196b = i11;
            this.f7197c = i12;
            this.f7198d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f7199a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7200b;

        public e(int i10, int i11) {
            this.f7199a = i10;
            this.f7200b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f7201a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7202b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7203c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7204d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7205e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7206f;

        /* renamed from: g  reason: collision with root package name */
        public final int f7207g;

        /* renamed from: h  reason: collision with root package name */
        public final int f7208h;

        /* renamed from: i  reason: collision with root package name */
        public final int f7209i;

        /* renamed from: j  reason: collision with root package name */
        public final int f7210j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray<g> f7211k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f7201a = i10;
            this.f7202b = z10;
            this.f7203c = i11;
            this.f7204d = i12;
            this.f7205e = i13;
            this.f7206f = i14;
            this.f7207g = i15;
            this.f7208h = i16;
            this.f7209i = i17;
            this.f7210j = i18;
            this.f7211k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f7211k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f7211k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f7212a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7213b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7214c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7215d;

        /* renamed from: e  reason: collision with root package name */
        public final int f7216e;

        /* renamed from: f  reason: collision with root package name */
        public final int f7217f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f7212a = i10;
            this.f7213b = i11;
            this.f7214c = i12;
            this.f7215d = i13;
            this.f7216e = i14;
            this.f7217f = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f7218a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7219b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f7220c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f7221d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f7222e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f7223f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f7224g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0106b f7225h;

        /* renamed from: i  reason: collision with root package name */
        public d f7226i;

        public h(int i10, int i11) {
            this.f7218a = i10;
            this.f7219b = i11;
        }

        public void a() {
            this.f7220c.clear();
            this.f7221d.clear();
            this.f7222e.clear();
            this.f7223f.clear();
            this.f7224g.clear();
            this.f7225h = null;
            this.f7226i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f7174a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7175b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f7176c = new Canvas();
        this.f7177d = new C0106b(719, 575, 0, 719, 0, 575);
        this.f7178e = new a(0, c(), d(), e());
        this.f7179f = new h(i10, i11);
    }

    private static byte[] a(int i10, int i11, z zVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zVar.h(i11);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = f(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = f(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = f(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = f(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int g(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int h10;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = zVar.h(2);
            if (h11 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (zVar.g()) {
                    h10 = zVar.h(3) + 3;
                } else {
                    if (zVar.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int h12 = zVar.h(2);
                        if (h12 == 0) {
                            z10 = true;
                        } else if (h12 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (h12 == 2) {
                            h10 = zVar.h(4) + 12;
                        } else if (h12 != 3) {
                            z10 = z11;
                        } else {
                            h10 = zVar.h(8) + 29;
                        }
                        h11 = 0;
                        i12 = 0;
                    }
                    h11 = 0;
                }
                z10 = z11;
                i12 = h10;
                h11 = zVar.h(2);
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int h(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int h10;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = zVar.h(4);
            int i14 = 2;
            if (h11 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (zVar.g()) {
                if (zVar.g()) {
                    int h12 = zVar.h(2);
                    if (h12 != 0) {
                        if (h12 != 1) {
                            if (h12 == 2) {
                                h10 = zVar.h(4) + 9;
                            } else if (h12 != 3) {
                                z10 = z11;
                                h11 = 0;
                                i12 = 0;
                            } else {
                                h10 = zVar.h(8) + 25;
                            }
                        }
                        z10 = z11;
                        i12 = i14;
                        h11 = 0;
                    } else {
                        z10 = z11;
                        i12 = 1;
                        h11 = 0;
                    }
                } else {
                    h10 = zVar.h(2) + 4;
                }
                h11 = zVar.h(4);
                z10 = z11;
                i12 = h10;
            } else {
                int h13 = zVar.h(3);
                if (h13 != 0) {
                    i14 = h13 + 2;
                    z10 = z11;
                    i12 = i14;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static int i(z zVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int h10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            byte h11 = zVar.h(8);
            if (h11 != 0) {
                z10 = z11;
                h10 = 1;
            } else if (zVar.g()) {
                z10 = z11;
                h10 = zVar.h(7);
                h11 = zVar.h(8);
            } else {
                int h12 = zVar.h(7);
                if (h12 != 0) {
                    z10 = z11;
                    h10 = h12;
                    h11 = 0;
                } else {
                    z10 = true;
                    h11 = 0;
                    h10 = 0;
                }
            }
            if (h10 != 0 && paint != null) {
                if (bArr != null) {
                    h11 = bArr[h11];
                }
                paint.setColor(iArr[h11]);
                canvas.drawRect(i12, i11, i12 + h10, i11 + 1, paint);
            }
            i12 += h10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static void j(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        z zVar = new z(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zVar.b() != 0) {
            int h10 = zVar.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                i13 = g(zVar, iArr, bArr2, i13, i14, paint, canvas);
                                zVar.c();
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f7171h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f7172i : bArr5;
                        }
                        bArr2 = bArr3;
                        i13 = g(zVar, iArr, bArr2, i13, i14, paint, canvas);
                        zVar.c();
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f7173j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = h(zVar, iArr, bArr4, i13, i14, paint, canvas);
                        zVar.c();
                        break;
                    case 18:
                        i13 = i(zVar, iArr, null, i13, i14, paint, canvas);
                        break;
                    default:
                        switch (h10) {
                            case 32:
                                bArr7 = a(4, 4, zVar);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, zVar);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, zVar);
                                continue;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static void k(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f7184d : i10 == 2 ? aVar.f7183c : aVar.f7182b;
        j(cVar.f7193c, iArr, i10, i11, i12, paint, canvas);
        j(cVar.f7194d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private static a l(z zVar, int i10) {
        int h10;
        int i11;
        int h11;
        int h12;
        int i12;
        int i13 = 8;
        int h13 = zVar.h(8);
        zVar.r(8);
        int i14 = 2;
        int i15 = i10 - 2;
        int[] c10 = c();
        int[] d10 = d();
        int[] e10 = e();
        while (i15 > 0) {
            int h14 = zVar.h(i13);
            int h15 = zVar.h(i13);
            int i16 = i15 - 2;
            int[] iArr = (h15 & 128) != 0 ? c10 : (h15 & 64) != 0 ? d10 : e10;
            if ((h15 & 1) != 0) {
                h12 = zVar.h(i13);
                i12 = zVar.h(i13);
                h10 = zVar.h(i13);
                h11 = zVar.h(i13);
                i11 = i16 - 4;
            } else {
                int h16 = zVar.h(4) << 4;
                h10 = zVar.h(4) << 4;
                i11 = i16 - 2;
                h11 = zVar.h(i14) << 6;
                h12 = zVar.h(6) << i14;
                i12 = h16;
            }
            if (h12 == 0) {
                h11 = 255;
                i12 = 0;
                h10 = 0;
            }
            double d11 = h12;
            double d12 = i12 - 128;
            double d13 = h10 - 128;
            iArr[h14] = f((byte) (255 - (h11 & 255)), m0.q((int) (d11 + (1.402d * d12)), 0, 255), m0.q((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), m0.q((int) (d11 + (d13 * 1.772d)), 0, 255));
            i15 = i11;
            h13 = h13;
            i13 = 8;
            i14 = 2;
        }
        return new a(h13, c10, d10, e10);
    }

    private static C0106b m(z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int h10 = zVar.h(16);
        int h11 = zVar.h(16);
        if (g10) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            int h14 = zVar.h(16);
            i13 = zVar.h(16);
            i12 = h13;
            i11 = h14;
            i10 = h12;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = h10;
            i13 = h11;
        }
        return new C0106b(h10, h11, i10, i12, i11, i13);
    }

    private static c n(z zVar) {
        byte[] bArr;
        int h10 = zVar.h(16);
        zVar.r(4);
        int h11 = zVar.h(2);
        boolean g10 = zVar.g();
        zVar.r(1);
        byte[] bArr2 = m0.f12311f;
        if (h11 == 1) {
            zVar.r(zVar.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = zVar.h(16);
            int h13 = zVar.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                zVar.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                zVar.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d o(z zVar, int i10) {
        int h10 = zVar.h(8);
        int h11 = zVar.h(4);
        int h12 = zVar.h(2);
        zVar.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = zVar.h(8);
            zVar.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(zVar.h(16), zVar.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f p(z zVar, int i10) {
        int h10;
        int h11;
        int h12 = zVar.h(8);
        zVar.r(4);
        boolean g10 = zVar.g();
        zVar.r(3);
        int i11 = 16;
        int h13 = zVar.h(16);
        int h14 = zVar.h(16);
        int h15 = zVar.h(3);
        int h16 = zVar.h(3);
        int i12 = 2;
        zVar.r(2);
        int h17 = zVar.h(8);
        int h18 = zVar.h(8);
        int h19 = zVar.h(4);
        int h20 = zVar.h(2);
        zVar.r(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h21 = zVar.h(i11);
            int h22 = zVar.h(i12);
            int h23 = zVar.h(i12);
            int h24 = zVar.h(12);
            int i14 = h20;
            zVar.r(4);
            int h25 = zVar.h(12);
            i13 -= 6;
            if (h22 == 1 || h22 == 2) {
                i13 -= 2;
                h10 = zVar.h(8);
                h11 = zVar.h(8);
            } else {
                h10 = 0;
                h11 = 0;
            }
            sparseArray.put(h21, new g(h22, h23, h24, h25, h10, h11));
            h20 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(h12, g10, h13, h14, h15, h16, h17, h18, h19, h20, sparseArray);
    }

    private static void q(z zVar, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i10;
        a aVar2;
        c cVar;
        int h10 = zVar.h(8);
        int h11 = zVar.h(16);
        int h12 = zVar.h(16);
        int d10 = zVar.d() + h12;
        if (h12 * 8 > zVar.b()) {
            r.i("DvbParser", "Data field length exceeds limit");
            zVar.r(zVar.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f7218a) {
                    d dVar = hVar.f7226i;
                    d o10 = o(zVar, h12);
                    if (o10.f7197c == 0) {
                        if (dVar != null && dVar.f7196b != o10.f7196b) {
                            hVar.f7226i = o10;
                            break;
                        }
                    } else {
                        hVar.f7226i = o10;
                        hVar.f7220c.clear();
                        hVar.f7221d.clear();
                        hVar.f7222e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f7226i;
                if (h11 == hVar.f7218a && dVar2 != null) {
                    f p10 = p(zVar, h12);
                    if (dVar2.f7197c == 0 && (fVar = hVar.f7220c.get(p10.f7201a)) != null) {
                        p10.a(fVar);
                    }
                    hVar.f7220c.put(p10.f7201a, p10);
                    break;
                }
                break;
            case 18:
                if (h11 == hVar.f7218a) {
                    a l10 = l(zVar, h12);
                    sparseArray = hVar.f7221d;
                    aVar = l10;
                } else if (h11 == hVar.f7219b) {
                    a l11 = l(zVar, h12);
                    sparseArray = hVar.f7223f;
                    aVar = l11;
                }
                i10 = aVar.f7181a;
                aVar2 = aVar;
                sparseArray.put(i10, aVar2);
                break;
            case 19:
                if (h11 == hVar.f7218a) {
                    c n10 = n(zVar);
                    sparseArray = hVar.f7222e;
                    cVar = n10;
                } else if (h11 == hVar.f7219b) {
                    c n11 = n(zVar);
                    sparseArray = hVar.f7224g;
                    cVar = n11;
                }
                i10 = cVar.f7191a;
                aVar2 = cVar;
                sparseArray.put(i10, aVar2);
                break;
            case 20:
                if (h11 == hVar.f7218a) {
                    hVar.f7225h = m(zVar);
                    break;
                }
                break;
        }
        zVar.s(d10 - zVar.d());
    }

    public List<d3.b> b(byte[] bArr, int i10) {
        int i11;
        SparseArray<g> sparseArray;
        z zVar = new z(bArr, i10);
        while (zVar.b() >= 48 && zVar.h(8) == 15) {
            q(zVar, this.f7179f);
        }
        h hVar = this.f7179f;
        d dVar = hVar.f7226i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0106b c0106b = hVar.f7225h;
        if (c0106b == null) {
            c0106b = this.f7177d;
        }
        Bitmap bitmap = this.f7180g;
        if (bitmap == null || c0106b.f7185a + 1 != bitmap.getWidth() || c0106b.f7186b + 1 != this.f7180g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0106b.f7185a + 1, c0106b.f7186b + 1, Bitmap.Config.ARGB_8888);
            this.f7180g = createBitmap;
            this.f7176c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f7198d;
        for (int i12 = 0; i12 < sparseArray2.size(); i12++) {
            this.f7176c.save();
            e valueAt = sparseArray2.valueAt(i12);
            f fVar = this.f7179f.f7220c.get(sparseArray2.keyAt(i12));
            int i13 = valueAt.f7199a + c0106b.f7187c;
            int i14 = valueAt.f7200b + c0106b.f7189e;
            this.f7176c.clipRect(i13, i14, Math.min(fVar.f7203c + i13, c0106b.f7188d), Math.min(fVar.f7204d + i14, c0106b.f7190f));
            a aVar = this.f7179f.f7221d.get(fVar.f7207g);
            if (aVar == null && (aVar = this.f7179f.f7223f.get(fVar.f7207g)) == null) {
                aVar = this.f7178e;
            }
            SparseArray<g> sparseArray3 = fVar.f7211k;
            int i15 = 0;
            while (i15 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i15);
                g valueAt2 = sparseArray3.valueAt(i15);
                c cVar = this.f7179f.f7222e.get(keyAt);
                c cVar2 = cVar == null ? this.f7179f.f7224g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i11 = i15;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f7206f, valueAt2.f7214c + i13, i14 + valueAt2.f7215d, cVar2.f7192b ? null : this.f7174a, this.f7176c);
                } else {
                    i11 = i15;
                    sparseArray = sparseArray3;
                }
                i15 = i11 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f7202b) {
                int i16 = fVar.f7206f;
                this.f7175b.setColor(i16 == 3 ? aVar.f7184d[fVar.f7208h] : i16 == 2 ? aVar.f7183c[fVar.f7209i] : aVar.f7182b[fVar.f7210j]);
                this.f7176c.drawRect(i13, i14, fVar.f7203c + i13, fVar.f7204d + i14, this.f7175b);
            }
            arrayList.add(new b.C0093b().f(Bitmap.createBitmap(this.f7180g, i13, i14, fVar.f7203c, fVar.f7204d)).k(i13 / c0106b.f7185a).l(0).h(i14 / c0106b.f7186b, 0).i(0).n(fVar.f7203c / c0106b.f7185a).g(fVar.f7204d / c0106b.f7186b).a());
            this.f7176c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f7176c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f7179f.a();
    }
}
