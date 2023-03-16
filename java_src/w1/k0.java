package w1;

import android.annotation.SuppressLint;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import t1.t1;
import w1.g0;
import w1.m;
/* loaded from: classes.dex */
public final class k0 implements g0 {

    /* renamed from: d  reason: collision with root package name */
    public static final g0.c f15924d = j0.f15922a;

    /* renamed from: a  reason: collision with root package name */
    private final UUID f15925a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f15926b;

    /* renamed from: c  reason: collision with root package name */
    private int f15927c;

    /* loaded from: classes.dex */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, t1 t1Var) {
            LogSessionId a10 = t1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) p3.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
        }
    }

    private k0(UUID uuid) {
        p3.a.e(uuid);
        p3.a.b(!s1.i.f13426b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f15925a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f15926b = mediaDrm;
        this.f15927c = 1;
        if (s1.i.f13428d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g0 A(UUID uuid) {
        try {
            return C(uuid);
        } catch (p0 unused) {
            p3.r.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new d0();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(p3.m0.f12309d);
    }

    public static k0 C(UUID uuid) {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new p0(1, e10);
        } catch (Exception e11) {
            throw new p0(2, e11);
        }
    }

    private static byte[] q(byte[] bArr) {
        int indexOf;
        p3.a0 a0Var = new p3.a0(bArr);
        int p10 = a0Var.p();
        short r10 = a0Var.r();
        short r11 = a0Var.r();
        if (r10 != 1 || r11 != 1) {
            p3.r.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short r12 = a0Var.r();
        Charset charset = a5.d.f202e;
        String A = a0Var.A(r12, charset);
        if (A.contains("<LA_URL>")) {
            return bArr;
        }
        if (A.indexOf("</DATA>") == -1) {
            p3.r.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = A.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + A.substring(indexOf);
        int i10 = p10 + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i10);
        allocate.putShort(r10);
        allocate.putShort(r11);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return s1.i.f13427c.equals(uuid) ? w1.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = s1.i.f13429e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = f2.l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = q(r4)
            byte[] r4 = f2.l.a(r0, r4)
        L18:
            int r1 = p3.m0.f12306a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = s1.i.f13428d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p3.m0.f12308c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p3.m0.f12309d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = f2.l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.k0.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (p3.m0.f12306a < 26 && s1.i.f13427c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (p3.m0.f12306a >= 27 || !s1.i.f13427c.equals(uuid)) ? uuid : s1.i.f13426b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static m.b y(UUID uuid, List<m.b> list) {
        boolean z10;
        if (s1.i.f13428d.equals(uuid)) {
            if (p3.m0.f12306a >= 28 && list.size() > 1) {
                m.b bVar = list.get(0);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    m.b bVar2 = list.get(i11);
                    byte[] bArr = (byte[]) p3.a.e(bVar2.f15945r);
                    if (!p3.m0.c(bVar2.f15944q, bVar.f15944q) || !p3.m0.c(bVar2.f15943p, bVar.f15943p) || !f2.l.c(bArr)) {
                        z10 = false;
                        break;
                    }
                    i10 += bArr.length;
                }
                z10 = true;
                if (z10) {
                    byte[] bArr2 = new byte[i10];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr3 = (byte[]) p3.a.e(list.get(i13).f15945r);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i12, length);
                        i12 += length;
                    }
                    return bVar.b(bArr2);
                }
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                m.b bVar3 = list.get(i14);
                int g10 = f2.l.g((byte[]) p3.a.e(bVar3.f15945r));
                int i15 = p3.m0.f12306a;
                if (i15 < 23 && g10 == 0) {
                    return bVar3;
                }
                if (i15 >= 23 && g10 == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(g0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    @Override // w1.g0
    public synchronized void a() {
        int i10 = this.f15927c - 1;
        this.f15927c = i10;
        if (i10 == 0) {
            this.f15926b.release();
        }
    }

    @Override // w1.g0
    public boolean b(byte[] bArr, String str) {
        if (p3.m0.f12306a >= 31) {
            return a.a(this.f15926b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f15925a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // w1.g0
    public void c(byte[] bArr, byte[] bArr2) {
        this.f15926b.restoreKeys(bArr, bArr2);
    }

    @Override // w1.g0
    public Map<String, String> d(byte[] bArr) {
        return this.f15926b.queryKeyStatus(bArr);
    }

    @Override // w1.g0
    public void e(byte[] bArr) {
        this.f15926b.closeSession(bArr);
    }

    @Override // w1.g0
    public void f(byte[] bArr, t1 t1Var) {
        if (p3.m0.f12306a >= 31) {
            try {
                a.b(this.f15926b, bArr, t1Var);
            } catch (UnsupportedOperationException unused) {
                p3.r.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // w1.g0
    public byte[] g(byte[] bArr, byte[] bArr2) {
        if (s1.i.f13427c.equals(this.f15925a)) {
            bArr2 = w1.a.b(bArr2);
        }
        return this.f15926b.provideKeyResponse(bArr, bArr2);
    }

    @Override // w1.g0
    public g0.d h() {
        MediaDrm.ProvisionRequest provisionRequest = this.f15926b.getProvisionRequest();
        return new g0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // w1.g0
    public void i(byte[] bArr) {
        this.f15926b.provideProvisionResponse(bArr);
    }

    @Override // w1.g0
    @SuppressLint({"WrongConstant"})
    public g0.a j(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap) {
        byte[] bArr2;
        String str;
        m.b bVar = null;
        if (list != null) {
            bVar = y(this.f15925a, list);
            bArr2 = s(this.f15925a, (byte[]) p3.a.e(bVar.f15945r));
            str = t(this.f15925a, bVar.f15944q);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f15926b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f15925a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f15943p)) {
            defaultUrl = bVar.f15943p;
        }
        return new g0.a(r10, defaultUrl, p3.m0.f12306a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // w1.g0
    public int k() {
        return 2;
    }

    @Override // w1.g0
    public void l(final g0.b bVar) {
        this.f15926b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: w1.i0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                k0.this.z(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // w1.g0
    public byte[] n() {
        return this.f15926b.openSession();
    }

    @Override // w1.g0
    /* renamed from: v */
    public h0 m(byte[] bArr) {
        return new h0(u(this.f15925a), bArr, p3.m0.f12306a < 21 && s1.i.f13428d.equals(this.f15925a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f15926b.getPropertyString(str);
    }
}
