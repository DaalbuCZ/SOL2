package k3;

import android.text.Layout;
import d3.j;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p3.m0;
import p3.n0;
import p3.r;
/* loaded from: classes.dex */
public final class c extends d3.g {

    /* renamed from: p  reason: collision with root package name */
    private static final Pattern f10541p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f10542q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f10543r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s  reason: collision with root package name */
    static final Pattern f10544s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    static final Pattern f10545t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u  reason: collision with root package name */
    private static final Pattern f10546u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v  reason: collision with root package name */
    private static final Pattern f10547v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w  reason: collision with root package name */
    private static final b f10548w = new b(30.0f, 1, 1);

    /* renamed from: x  reason: collision with root package name */
    private static final a f10549x = new a(32, 15);

    /* renamed from: o  reason: collision with root package name */
    private final XmlPullParserFactory f10550o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f10551a;

        /* renamed from: b  reason: collision with root package name */
        final int f10552b;

        a(int i10, int i11) {
            this.f10551a = i10;
            this.f10552b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final float f10553a;

        /* renamed from: b  reason: collision with root package name */
        final int f10554b;

        /* renamed from: c  reason: collision with root package name */
        final int f10555c;

        b(float f10, int i10, int i11) {
            this.f10553a = f10;
            this.f10554b = i10;
            this.f10555c = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0150c {

        /* renamed from: a  reason: collision with root package name */
        final int f10556a;

        /* renamed from: b  reason: collision with root package name */
        final int f10557b;

        C0150c(int i10, int i11) {
            this.f10556a = i10;
            this.f10557b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f10550o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static g C(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    private static boolean D(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static Layout.Alignment E(String str) {
        String e10 = a5.b.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1364013995:
                if (e10.equals("center")) {
                    c10 = 0;
                    break;
                }
                break;
            case 100571:
                if (e10.equals("end")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3317767:
                if (e10.equals("left")) {
                    c10 = 2;
                    break;
                }
                break;
            case 108511772:
                if (e10.equals("right")) {
                    c10 = 3;
                    break;
                }
                break;
            case 109757538:
                if (e10.equals("start")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static a F(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f10547v.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt((String) p3.a.e(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) p3.a.e(matcher.group(2)));
                if (parseInt == 0 || parseInt2 == 0) {
                    throw new j("Invalid cell resolution " + parseInt + " " + parseInt2);
                }
                return new a(parseInt, parseInt2);
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        r.i("TtmlDecoder", sb.toString());
        return aVar;
    }

    private static void G(String str, g gVar) {
        Matcher matcher;
        String[] P0 = m0.P0(str, "\\s+");
        if (P0.length == 1) {
            matcher = f10543r.matcher(str);
        } else if (P0.length != 2) {
            throw new j("Invalid number of entries for fontSize: " + P0.length + ".");
        } else {
            matcher = f10543r.matcher(P0[1]);
            r.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new j("Invalid expression for fontSize: '" + str + "'.");
        }
        String str2 = (String) p3.a.e(matcher.group(3));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                gVar.z(3);
                break;
            case 1:
                gVar.z(2);
                break;
            case 2:
                gVar.z(1);
                break;
            default:
                throw new j("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) p3.a.e(matcher.group(1))));
    }

    private static b H(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] P0 = m0.P0(attributeValue2, " ");
            if (P0.length != 2) {
                throw new j("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(P0[0]) / Integer.parseInt(P0[1]);
        }
        b bVar = f10548w;
        int i10 = bVar.f10554b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f10555c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    private static Map<String, g> I(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0150c c0150c, Map<String, e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "style")) {
                String a10 = n0.a(xmlPullParser, "style");
                g N = N(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : O(a10)) {
                        N.a(map.get(str));
                    }
                }
                String g10 = N.g();
                if (g10 != null) {
                    map.put(g10, N);
                }
            } else if (n0.f(xmlPullParser, "region")) {
                e L = L(xmlPullParser, aVar, c0150c);
                if (L != null) {
                    map2.put(L.f10571a, L);
                }
            } else if (n0.f(xmlPullParser, "metadata")) {
                J(xmlPullParser, map3);
            }
        } while (!n0.d(xmlPullParser, "head"));
        return map;
    }

    private static void J(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a10;
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, "image") && (a10 = n0.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!n0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static d K(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        g N = N(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = P(attributeValue, bVar);
                    break;
                case 2:
                    j13 = P(attributeValue, bVar);
                    break;
                case 3:
                    j12 = P(attributeValue, bVar);
                    break;
                case 4:
                    String[] O = O(attributeValue);
                    if (O.length > 0) {
                        strArr = O;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f10561d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (dVar != null) {
                long j17 = dVar.f10562e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return d.c(xmlPullParser.getName(), j16, j11, N, strArr, str2, str, dVar);
        }
        j11 = j13;
        return d.c(xmlPullParser.getName(), j16, j11, N, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0184, code lost:
        if (r0.equals("tb") == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static k3.e L(org.xmlpull.v1.XmlPullParser r17, k3.c.a r18, k3.c.C0150c r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.L(org.xmlpull.v1.XmlPullParser, k3.c$a, k3.c$c):k3.e");
    }

    private static float M(String str) {
        Matcher matcher = f10544s.matcher(str);
        if (!matcher.matches()) {
            r.i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) p3.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            r.j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c4, code lost:
        if (r3.equals("text") == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static k3.g N(org.xmlpull.v1.XmlPullParser r12, k3.g r13) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.N(org.xmlpull.v1.XmlPullParser, k3.g):k3.g");
    }

    private static String[] O(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : m0.P0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long P(java.lang.String r13, k3.c.b r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.P(java.lang.String, k3.c$b):long");
    }

    private static C0150c Q(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String a10 = n0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f10546u.matcher(a10);
        if (matcher.matches()) {
            try {
                return new C0150c(Integer.parseInt((String) p3.a.e(matcher.group(1))), Integer.parseInt((String) p3.a.e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb.append(str);
        sb.append(a10);
        r.i("TtmlDecoder", sb.toString());
        return null;
    }

    @Override // d3.g
    protected d3.h A(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f10550o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0150c c0150c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f10548w;
            a aVar = f10549x;
            int i11 = 0;
            h hVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = H(newPullParser);
                            aVar = F(newPullParser, f10549x);
                            c0150c = Q(newPullParser);
                        }
                        C0150c c0150c2 = c0150c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (D(name)) {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                I(newPullParser, hashMap, aVar2, c0150c2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d K = K(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(K);
                                    if (dVar != null) {
                                        dVar.a(K);
                                    }
                                } catch (j e10) {
                                    r.j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        } else {
                            r.f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar3;
                        }
                        c0150c = c0150c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) p3.a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) p3.a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new j("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new j("Unable to decode source", e12);
        }
    }
}
