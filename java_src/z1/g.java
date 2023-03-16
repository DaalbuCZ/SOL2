package z1;

import b5.q;
import p3.a0;
import p3.m0;
import p3.r;
import s1.m1;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final m1 f17174a;

    public g(m1 m1Var) {
        this.f17174a = m1Var;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 != 1) {
            if (i10 != 85) {
                if (i10 != 255) {
                    if (i10 != 8192) {
                        if (i10 != 8193) {
                            return null;
                        }
                        return "audio/vnd.dts";
                    }
                    return "audio/ac3";
                }
                return "audio/mp4a-latm";
            }
            return "audio/mpeg";
        }
        return "audio/raw";
    }

    private static a c(a0 a0Var) {
        a0Var.P(4);
        int p10 = a0Var.p();
        int p11 = a0Var.p();
        a0Var.P(4);
        int p12 = a0Var.p();
        String a10 = a(p12);
        if (a10 != null) {
            m1.b bVar = new m1.b();
            bVar.j0(p10).Q(p11).e0(a10);
            return new g(bVar.E());
        }
        r.i("StreamFormatChunk", "Ignoring track with unsupported compression " + p12);
        return null;
    }

    public static a d(int i10, a0 a0Var) {
        if (i10 == 2) {
            return c(a0Var);
        }
        if (i10 == 1) {
            return e(a0Var);
        }
        r.i("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.k0(i10));
        return null;
    }

    private static a e(a0 a0Var) {
        int u10 = a0Var.u();
        String b10 = b(u10);
        if (b10 == null) {
            r.i("StreamFormatChunk", "Ignoring track with unsupported format tag " + u10);
            return null;
        }
        int u11 = a0Var.u();
        int p10 = a0Var.p();
        a0Var.P(6);
        int b02 = m0.b0(a0Var.I());
        int u12 = a0Var.u();
        byte[] bArr = new byte[u12];
        a0Var.j(bArr, 0, u12);
        m1.b bVar = new m1.b();
        bVar.e0(b10).H(u11).f0(p10);
        if ("audio/raw".equals(b10) && b02 != 0) {
            bVar.Y(b02);
        }
        if ("audio/mp4a-latm".equals(b10) && u12 > 0) {
            bVar.T(q.K(bArr));
        }
        return new g(bVar.E());
    }

    @Override // z1.a
    public int getType() {
        return 1718776947;
    }
}
