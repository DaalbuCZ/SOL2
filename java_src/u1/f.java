package u1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import b5.q;
import b5.r;
import b5.s0;
import java.util.Arrays;
import p3.m0;
import s1.m1;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f14935c = new f(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final f f14936d = new f(new int[]{2, 5, 6}, 8);

    /* renamed from: e  reason: collision with root package name */
    private static final b5.r<Integer, Integer> f14937e = new r.a().d(5, 6).d(17, 6).d(7, 6).d(18, 6).d(6, 8).d(8, 8).d(14, 8).b();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f14938a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14939b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final AudioAttributes f14940a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int[] a() {
            q.a D = b5.q.D();
            s0 it = f.f14937e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f14940a)) {
                    D.a(Integer.valueOf(intValue));
                }
            }
            D.a(2);
            return d5.d.k(D.h());
        }

        public static int b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(m0.G(i12)).build(), f14940a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public f(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f14938a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f14938a = new int[0];
        }
        this.f14939b = i10;
    }

    private static boolean b() {
        if (m0.f12306a >= 17) {
            String str = m0.f12308c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static f c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static f d(Context context, Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f14936d : (m0.f12306a < 29 || !(m0.v0(context) || m0.q0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f14935c : new f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new f(a.a(), 8);
    }

    private static int e(int i10) {
        int i11 = m0.f12306a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(m0.f12307b) && i10 == 1) {
            i10 = 2;
        }
        return m0.G(i10);
    }

    private static int g(int i10, int i11) {
        return m0.f12306a >= 29 ? a.b(i10, i11) : ((Integer) p3.a.e(f14937e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Arrays.equals(this.f14938a, fVar.f14938a) && this.f14939b == fVar.f14939b;
        }
        return false;
    }

    public Pair<Integer, Integer> f(m1 m1Var) {
        int f10 = p3.v.f((String) p3.a.e(m1Var.f13587y), m1Var.f13584v);
        if (f14937e.containsKey(Integer.valueOf(f10))) {
            if (f10 == 18 && !i(18)) {
                f10 = 6;
            } else if (f10 == 8 && !i(8)) {
                f10 = 7;
            }
            if (i(f10)) {
                int i10 = m1Var.L;
                if (i10 == -1 || f10 == 18) {
                    int i11 = m1Var.M;
                    if (i11 == -1) {
                        i11 = 48000;
                    }
                    i10 = g(f10, i11);
                } else if (i10 > this.f14939b) {
                    return null;
                }
                int e10 = e(i10);
                if (e10 == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(f10), Integer.valueOf(e10));
            }
            return null;
        }
        return null;
    }

    public boolean h(m1 m1Var) {
        return f(m1Var) != null;
    }

    public int hashCode() {
        return this.f14939b + (Arrays.hashCode(this.f14938a) * 31);
    }

    public boolean i(int i10) {
        return Arrays.binarySearch(this.f14938a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f14939b + ", supportedEncodings=" + Arrays.toString(this.f14938a) + "]";
    }
}
