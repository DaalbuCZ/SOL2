package c3;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import c3.a;
import f2.l;
import f2.p;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import o3.j0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p3.m0;
import s1.h2;
import s1.m1;
import w1.m;
/* loaded from: classes.dex */
public class b implements j0.a<c3.a> {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParserFactory f3177a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3178a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3179b;

        /* renamed from: c  reason: collision with root package name */
        private final a f3180c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Pair<String, Object>> f3181d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f3180c = aVar;
            this.f3178a = str;
            this.f3179b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        protected void a(Object obj) {
        }

        protected abstract Object b();

        protected final Object c(String str) {
            for (int i10 = 0; i10 < this.f3181d.size(); i10++) {
                Pair<String, Object> pair = this.f3181d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f3180c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        protected boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f3179b.equals(name)) {
                        n(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e10 = e(this, name, this.f3178a);
                            if (e10 == null) {
                                i10 = 1;
                            } else {
                                a(e10.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        protected final boolean g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        protected void h(XmlPullParser xmlPullParser) {
        }

        protected final int i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw h2.c(null, e10);
                }
            }
            return i10;
        }

        protected final long j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw h2.c(null, e10);
                }
            }
            return j10;
        }

        protected final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e10) {
                    throw h2.c(null, e10);
                }
            }
            throw new C0072b(str);
        }

        protected final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e10) {
                    throw h2.c(null, e10);
                }
            }
            throw new C0072b(str);
        }

        protected final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0072b(str);
        }

        protected abstract void n(XmlPullParser xmlPullParser);

        protected void o(XmlPullParser xmlPullParser) {
        }

        protected final void p(String str, Object obj) {
            this.f3181d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: c3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0072b extends h2 {
        public C0072b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: e  reason: collision with root package name */
        private boolean f3182e;

        /* renamed from: f  reason: collision with root package name */
        private UUID f3183f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f3184g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static p[] q(byte[] bArr) {
            return new p[]{new p(true, null, 8, r(bArr), 0, 0, null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb.append((char) bArr[i10]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // c3.b.a
        public Object b() {
            UUID uuid = this.f3183f;
            return new a.C0071a(uuid, l.a(uuid, this.f3184g), q(this.f3184g));
        }

        @Override // c3.b.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // c3.b.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f3182e = false;
            }
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f3182e = true;
                this.f3183f = UUID.fromString(s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // c3.b.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.f3182e) {
                this.f3184g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends a {

        /* renamed from: e  reason: collision with root package name */
        private m1 f3185e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] J = m0.J(str);
                byte[][] i10 = p3.e.i(J);
                if (i10 == null) {
                    arrayList.add(J);
                } else {
                    Collections.addAll(arrayList, i10);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // c3.b.a
        public Object b() {
            return this.f3185e;
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            m1.b bVar = new m1.b();
            String r10 = r(m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                bVar.K("video/mp4").j0(k(xmlPullParser, "MaxWidth")).Q(k(xmlPullParser, "MaxHeight")).T(q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r10 == null) {
                    r10 = "audio/mp4a-latm";
                }
                int k10 = k(xmlPullParser, "Channels");
                int k11 = k(xmlPullParser, "SamplingRate");
                List<byte[]> q10 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q10.isEmpty() && "audio/mp4a-latm".equals(r10)) {
                    q10 = Collections.singletonList(u1.a.a(k11, k10));
                }
                bVar.K("audio/mp4").H(k10).f0(k11).T(q10);
            } else if (intValue == 3) {
                int i10 = 0;
                String str = (String) c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i10 = 64;
                    } else if (str.equals("DESC")) {
                        i10 = 1024;
                    }
                }
                bVar.K("application/mp4").c0(i10);
            } else {
                bVar.K("application/mp4");
            }
            this.f3185e = bVar.S(xmlPullParser.getAttributeValue(null, "Index")).U((String) c("Name")).e0(r10).G(k(xmlPullParser, "Bitrate")).V((String) c("Language")).E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends a {

        /* renamed from: e  reason: collision with root package name */
        private final List<a.b> f3186e;

        /* renamed from: f  reason: collision with root package name */
        private int f3187f;

        /* renamed from: g  reason: collision with root package name */
        private int f3188g;

        /* renamed from: h  reason: collision with root package name */
        private long f3189h;

        /* renamed from: i  reason: collision with root package name */
        private long f3190i;

        /* renamed from: j  reason: collision with root package name */
        private long f3191j;

        /* renamed from: k  reason: collision with root package name */
        private int f3192k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3193l;

        /* renamed from: m  reason: collision with root package name */
        private a.C0071a f3194m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f3192k = -1;
            this.f3194m = null;
            this.f3186e = new LinkedList();
        }

        @Override // c3.b.a
        public void a(Object obj) {
            if (obj instanceof a.b) {
                this.f3186e.add((a.b) obj);
            } else if (obj instanceof a.C0071a) {
                p3.a.f(this.f3194m == null);
                this.f3194m = (a.C0071a) obj;
            }
        }

        @Override // c3.b.a
        public Object b() {
            int size = this.f3186e.size();
            a.b[] bVarArr = new a.b[size];
            this.f3186e.toArray(bVarArr);
            if (this.f3194m != null) {
                a.C0071a c0071a = this.f3194m;
                m mVar = new m(new m.b(c0071a.f3158a, "video/mp4", c0071a.f3159b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f3161a;
                    if (i11 == 2 || i11 == 1) {
                        m1[] m1VarArr = bVar.f3170j;
                        for (int i12 = 0; i12 < m1VarArr.length; i12++) {
                            m1VarArr[i12] = m1VarArr[i12].b().M(mVar).E();
                        }
                    }
                }
            }
            return new c3.a(this.f3187f, this.f3188g, this.f3189h, this.f3190i, this.f3191j, this.f3192k, this.f3193l, this.f3194m, bVarArr);
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            this.f3187f = k(xmlPullParser, "MajorVersion");
            this.f3188g = k(xmlPullParser, "MinorVersion");
            this.f3189h = j(xmlPullParser, "TimeScale", 10000000L);
            this.f3190i = l(xmlPullParser, "Duration");
            this.f3191j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.f3192k = i(xmlPullParser, "LookaheadCount", -1);
            this.f3193l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.f3189h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends a {

        /* renamed from: e  reason: collision with root package name */
        private final String f3195e;

        /* renamed from: f  reason: collision with root package name */
        private final List<m1> f3196f;

        /* renamed from: g  reason: collision with root package name */
        private int f3197g;

        /* renamed from: h  reason: collision with root package name */
        private String f3198h;

        /* renamed from: i  reason: collision with root package name */
        private long f3199i;

        /* renamed from: j  reason: collision with root package name */
        private String f3200j;

        /* renamed from: k  reason: collision with root package name */
        private String f3201k;

        /* renamed from: l  reason: collision with root package name */
        private int f3202l;

        /* renamed from: m  reason: collision with root package name */
        private int f3203m;

        /* renamed from: n  reason: collision with root package name */
        private int f3204n;

        /* renamed from: o  reason: collision with root package name */
        private int f3205o;

        /* renamed from: p  reason: collision with root package name */
        private String f3206p;

        /* renamed from: q  reason: collision with root package name */
        private ArrayList<Long> f3207q;

        /* renamed from: r  reason: collision with root package name */
        private long f3208r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f3195e = str;
            this.f3196f = new LinkedList();
        }

        private void q(XmlPullParser xmlPullParser) {
            int s10 = s(xmlPullParser);
            this.f3197g = s10;
            p("Type", Integer.valueOf(s10));
            this.f3198h = this.f3197g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            p("Subtype", this.f3198h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f3200j = attributeValue;
            p("Name", attributeValue);
            this.f3201k = m(xmlPullParser, "Url");
            this.f3202l = i(xmlPullParser, "MaxWidth", -1);
            this.f3203m = i(xmlPullParser, "MaxHeight", -1);
            this.f3204n = i(xmlPullParser, "DisplayWidth", -1);
            this.f3205o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f3206p = attributeValue2;
            p("Language", attributeValue2);
            long i10 = i(xmlPullParser, "TimeScale", -1);
            this.f3199i = i10;
            if (i10 == -1) {
                this.f3199i = ((Long) c("TimeScale")).longValue();
            }
            this.f3207q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.f3207q.size();
            long j10 = j(xmlPullParser, "t", -9223372036854775807L);
            int i10 = 1;
            if (j10 == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else if (this.f3208r == -1) {
                    throw h2.c("Unable to infer start time", null);
                } else {
                    j10 = this.f3208r + this.f3207q.get(size - 1).longValue();
                }
            }
            this.f3207q.add(Long.valueOf(j10));
            this.f3208r = j(xmlPullParser, "d", -9223372036854775807L);
            long j11 = j(xmlPullParser, "r", 1L);
            if (j11 > 1 && this.f3208r == -9223372036854775807L) {
                throw h2.c("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j12 = i10;
                if (j12 >= j11) {
                    return;
                }
                this.f3207q.add(Long.valueOf((this.f3208r * j12) + j10));
                i10++;
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if ("audio".equalsIgnoreCase(attributeValue)) {
                    return 1;
                }
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw h2.c("Invalid key value[" + attributeValue + "]", null);
            }
            throw new C0072b("Type");
        }

        @Override // c3.b.a
        public void a(Object obj) {
            if (obj instanceof m1) {
                this.f3196f.add((m1) obj);
            }
        }

        @Override // c3.b.a
        public Object b() {
            m1[] m1VarArr = new m1[this.f3196f.size()];
            this.f3196f.toArray(m1VarArr);
            return new a.b(this.f3195e, this.f3201k, this.f3197g, this.f3198h, this.f3199i, this.f3200j, this.f3202l, this.f3203m, this.f3204n, this.f3205o, this.f3206p, m1VarArr, this.f3207q, this.f3208r);
        }

        @Override // c3.b.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // c3.b.a
        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public b() {
        try {
            this.f3177a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // o3.j0.a
    /* renamed from: b */
    public c3.a a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f3177a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (c3.a) new e(null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw h2.c(null, e10);
        }
    }
}
