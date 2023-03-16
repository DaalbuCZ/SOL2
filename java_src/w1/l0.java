package w1;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o3.l;
import o3.p;
import w1.g0;
/* loaded from: classes.dex */
public final class l0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final l.a f15933a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15934b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15935c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f15936d;

    public l0(String str, boolean z10, l.a aVar) {
        p3.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f15933a = aVar;
        this.f15934b = str;
        this.f15935c = z10;
        this.f15936d = new HashMap();
    }

    private static byte[] c(l.a aVar, String str, byte[] bArr, Map<String, String> map) {
        o3.o0 o0Var = new o3.o0(aVar.a());
        o3.p a10 = new p.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i10 = 0;
        o3.p pVar = a10;
        while (true) {
            try {
                o3.n nVar = new o3.n(o0Var, pVar);
                try {
                    byte[] T0 = p3.m0.T0(nVar);
                    p3.m0.n(nVar);
                    return T0;
                } catch (o3.c0 e10) {
                    String d10 = d(e10, i10);
                    if (d10 == null) {
                        throw e10;
                    }
                    i10++;
                    pVar = pVar.a().j(d10).a();
                    p3.m0.n(nVar);
                }
            } catch (Exception e11) {
                throw new o0(a10, (Uri) p3.a.e(o0Var.s()), o0Var.f(), o0Var.r(), e11);
            }
        }
    }

    private static String d(o3.c0 c0Var, int i10) {
        Map<String, List<String>> map;
        List<String> list;
        int i11 = c0Var.f11936q;
        if (!((i11 == 307 || i11 == 308) && i10 < 5) || (map = c0Var.f11938s) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // w1.n0
    public byte[] a(UUID uuid, g0.a aVar) {
        String b10 = aVar.b();
        if (this.f15935c || TextUtils.isEmpty(b10)) {
            b10 = this.f15934b;
        }
        if (TextUtils.isEmpty(b10)) {
            throw new o0(new p.b().i(Uri.EMPTY).a(), Uri.EMPTY, b5.r.j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = s1.i.f13429e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : s1.i.f13427c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f15936d) {
            hashMap.putAll(this.f15936d);
        }
        return c(this.f15933a, b10, aVar.a(), hashMap);
    }

    @Override // w1.n0
    public byte[] b(UUID uuid, g0.d dVar) {
        return c(this.f15933a, dVar.b() + "&signedRequest=" + p3.m0.D(dVar.a()), null, Collections.emptyMap());
    }

    public void e(String str, String str2) {
        p3.a.e(str);
        p3.a.e(str2);
        synchronized (this.f15936d) {
            this.f15936d.put(str, str2);
        }
    }
}
