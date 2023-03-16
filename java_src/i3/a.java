package i3;

import android.text.Layout;
import d3.g;
import d3.h;
import i3.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.m0;
import p3.r;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f8284t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o  reason: collision with root package name */
    private final boolean f8285o;

    /* renamed from: p  reason: collision with root package name */
    private final b f8286p;

    /* renamed from: q  reason: collision with root package name */
    private Map<String, c> f8287q;

    /* renamed from: r  reason: collision with root package name */
    private float f8288r;

    /* renamed from: s  reason: collision with root package name */
    private float f8289s;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f8288r = -3.4028235E38f;
        this.f8289s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f8285o = false;
            this.f8286p = null;
            return;
        }
        this.f8285o = true;
        String D = m0.D(list.get(0));
        p3.a.a(D.startsWith("Format:"));
        this.f8286p = (b) p3.a.e(b.a(D));
        H(new a0(list.get(1)));
    }

    private static int C(long j10, List<Long> list, List<List<d3.b>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static float D(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static d3.b E(java.lang.String r8, i3.c r9, i3.c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.E(java.lang.String, i3.c, i3.c$b, float, float):d3.b");
    }

    private void F(String str, b bVar, List<List<d3.b>> list, List<Long> list2) {
        int i10;
        StringBuilder sb;
        p3.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f8294e);
        if (split.length != bVar.f8294e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long K = K(split[bVar.f8290a]);
            if (K == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long K2 = K(split[bVar.f8291b]);
                if (K2 != -9223372036854775807L) {
                    Map<String, c> map = this.f8287q;
                    c cVar = (map == null || (i10 = bVar.f8292c) == -1) ? null : map.get(split[i10].trim());
                    String str2 = split[bVar.f8293d];
                    d3.b E = E(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.f8288r, this.f8289s);
                    int C = C(K2, list2, list);
                    for (int C2 = C(K, list2, list); C2 < C; C2++) {
                        list.get(C2).add(E);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        r.i("SsaDecoder", sb.toString());
    }

    private void G(a0 a0Var, List<List<d3.b>> list, List<Long> list2) {
        b bVar = this.f8285o ? this.f8286p : null;
        while (true) {
            String o10 = a0Var.o();
            if (o10 == null) {
                return;
            }
            if (o10.startsWith("Format:")) {
                bVar = b.a(o10);
            } else if (o10.startsWith("Dialogue:")) {
                if (bVar == null) {
                    r.i("SsaDecoder", "Skipping dialogue line before complete format: " + o10);
                } else {
                    F(o10, bVar, list, list2);
                }
            }
        }
    }

    private void H(a0 a0Var) {
        while (true) {
            String o10 = a0Var.o();
            if (o10 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(o10)) {
                I(a0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(o10)) {
                this.f8287q = J(a0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(o10)) {
                r.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(o10)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I(p3.a0 r5) {
        /*
            r4 = this;
        L0:
            java.lang.String r0 = r5.o()
            if (r0 == 0) goto L59
            int r1 = r5.a()
            if (r1 == 0) goto L14
            int r1 = r5.h()
            r2 = 91
            if (r1 == r2) goto L59
        L14:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L1f
            goto L0
        L1f:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r1 = a5.b.e(r1)
            r1.hashCode()
            java.lang.String r2 = "playresx"
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L4c
            java.lang.String r2 = "playresy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3f
            goto L0
        L3f:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f8289s = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L4c:
            r0 = r0[r3]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r4.f8288r = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.I(p3.a0):void");
    }

    private static Map<String, c> J(a0 a0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String o10 = a0Var.o();
            if (o10 == null || (a0Var.a() != 0 && a0Var.h() == 91)) {
                break;
            } else if (o10.startsWith("Format:")) {
                aVar = c.a.a(o10);
            } else if (o10.startsWith("Style:")) {
                if (aVar == null) {
                    r.i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + o10);
                } else {
                    c b10 = c.b(o10, aVar);
                    if (b10 != null) {
                        linkedHashMap.put(b10.f8295a, b10);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = f8284t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) m0.j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) m0.j(matcher.group(3))) * 1000000) + (Long.parseLong((String) m0.j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static int L(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int M(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment N(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                r.i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        if (!this.f8285o) {
            H(a0Var);
        }
        G(a0Var, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
