package j2;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f10318a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10319b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10320c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f10321d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10322e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10323f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10324g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10325h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10326i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10327j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10328k;

    n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f10318a = (String) p3.a.e(str);
        this.f10319b = str2;
        this.f10320c = str3;
        this.f10321d = codecCapabilities;
        this.f10325h = z10;
        this.f10326i = z11;
        this.f10327j = z12;
        this.f10322e = z13;
        this.f10323f = z14;
        this.f10324g = z15;
        this.f10328k = p3.v.s(str2);
    }

    private static boolean A(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = m0.f12307b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(m0.f12307b)) ? false : true;
    }

    public static n C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new n(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && q(codecCapabilities)));
    }

    private static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((m0.f12306a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        p3.r.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(m0.l(i10, widthAlignment) * widthAlignment, m0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point c10 = c(videoCapabilities, i10, i11);
        int i12 = c10.x;
        int i13 = c10.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int intValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
        int i10 = intValue >= 180000000 ? 1024 : intValue >= 120000000 ? 512 : intValue >= 60000000 ? 256 : intValue >= 30000000 ? 128 : intValue >= 18000000 ? 64 : intValue >= 12000000 ? 32 : intValue >= 7200000 ? 16 : intValue >= 3600000 ? 8 : intValue >= 1800000 ? 4 : intValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f12306a >= 19 && i(codecCapabilities);
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(m1 m1Var) {
        Pair<Integer, Integer> q10;
        if (m1Var.f13584v == null || (q10 = v.q(m1Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q10.first).intValue();
        int intValue2 = ((Integer) q10.second).intValue();
        if ("video/dolby-vision".equals(m1Var.f13587y)) {
            if ("video/avc".equals(this.f10319b)) {
                intValue = 8;
            } else {
                intValue = "video/hevc".equals(this.f10319b) ? 2 : 2;
            }
            intValue2 = 0;
        }
        if (this.f10328k || intValue == 42) {
            MediaCodecInfo.CodecProfileLevel[] g10 = g();
            if (m0.f12306a <= 23 && "video/x-vnd.on2.vp9".equals(this.f10319b) && g10.length == 0) {
                g10 = f(this.f10321d);
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g10) {
                if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2 && !A(this.f10319b, intValue)) {
                    return true;
                }
            }
            w("codec.profileLevel, " + m1Var.f13584v + ", " + this.f10320c);
            return false;
        }
        return true;
    }

    private boolean o(m1 m1Var) {
        return this.f10319b.equals(m1Var.f13587y) || this.f10319b.equals(v.m(m1Var));
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f12306a >= 21 && r(codecCapabilities);
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f12306a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        p3.r.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f10318a + ", " + this.f10319b + "] [" + m0.f12310e + "]");
    }

    private void w(String str) {
        p3.r.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f10318a + ", " + this.f10319b + "] [" + m0.f12310e + "]");
    }

    private static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean y(String str) {
        return m0.f12309d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean z(String str) {
        if (m0.f12306a <= 22) {
            String str2 = m0.f12309d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10321d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public v1.i e(m1 m1Var, m1 m1Var2) {
        int i10 = !m0.c(m1Var.f13587y, m1Var2.f13587y) ? 8 : 0;
        if (this.f10328k) {
            if (m1Var.G != m1Var2.G) {
                i10 |= 1024;
            }
            if (!this.f10322e && (m1Var.D != m1Var2.D || m1Var.E != m1Var2.E)) {
                i10 |= 512;
            }
            if (!m0.c(m1Var.K, m1Var2.K)) {
                i10 |= 2048;
            }
            if (y(this.f10318a) && !m1Var.g(m1Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new v1.i(this.f10318a, m1Var, m1Var2, m1Var.g(m1Var2) ? 3 : 2, 0);
            }
        } else {
            if (m1Var.L != m1Var2.L) {
                i10 |= 4096;
            }
            if (m1Var.M != m1Var2.M) {
                i10 |= 8192;
            }
            if (m1Var.N != m1Var2.N) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f10319b)) {
                Pair<Integer, Integer> q10 = v.q(m1Var);
                Pair<Integer, Integer> q11 = v.q(m1Var2);
                if (q10 != null && q11 != null) {
                    int intValue = ((Integer) q10.first).intValue();
                    int intValue2 = ((Integer) q11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new v1.i(this.f10318a, m1Var, m1Var2, 3, 0);
                    }
                }
            }
            if (!m1Var.g(m1Var2)) {
                i10 |= 32;
            }
            if (x(this.f10319b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new v1.i(this.f10318a, m1Var, m1Var2, 1, 0);
            }
        }
        return new v1.i(this.f10318a, m1Var, m1Var2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10321d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10321d;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (a(this.f10318a, this.f10319b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
                return true;
            } else {
                str = "channelCount.support, " + i10;
            }
        }
        w(str);
        return false;
    }

    public boolean k(int i10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10321d;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i10)) {
                return true;
            } else {
                str = "sampleRate.support, " + i10;
            }
        }
        w(str);
        return false;
    }

    public boolean m(m1 m1Var) {
        int i10;
        if (o(m1Var) && l(m1Var)) {
            if (!this.f10328k) {
                if (m0.f12306a >= 21) {
                    int i11 = m1Var.M;
                    if (i11 != -1 && !k(i11)) {
                        return false;
                    }
                    int i12 = m1Var.L;
                    if (i12 != -1 && !j(i12)) {
                        return false;
                    }
                }
                return true;
            }
            int i13 = m1Var.D;
            if (i13 <= 0 || (i10 = m1Var.E) <= 0) {
                return true;
            }
            if (m0.f12306a >= 21) {
                return u(i13, i10, m1Var.F);
            }
            boolean z10 = i13 * i10 <= v.N();
            if (!z10) {
                w("legacyFrameSize, " + m1Var.D + "x" + m1Var.E);
            }
            return z10;
        }
        return false;
    }

    public boolean n() {
        if (m0.f12306a >= 29 && "video/x-vnd.on2.vp9".equals(this.f10319b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(m1 m1Var) {
        if (this.f10328k) {
            return this.f10322e;
        }
        Pair<Integer, Integer> q10 = v.q(m1Var);
        return q10 != null && ((Integer) q10.first).intValue() == 42;
    }

    public String toString() {
        return this.f10318a;
    }

    public boolean u(int i10, int i11, double d10) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f10321d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (d(videoCapabilities, i10, i11, d10)) {
                return true;
            } else {
                if (i10 < i11 && B(this.f10318a) && d(videoCapabilities, i11, i10, d10)) {
                    v("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
                    return true;
                }
                str = "sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10;
            }
        }
        w(str);
        return false;
    }
}
