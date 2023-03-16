package c2;

import b5.q;
import c2.b;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p3.n0;
import p3.r;
import s1.h2;
/* loaded from: classes.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f3147a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f3148b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f3149c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | XmlPullParserException | h2 unused) {
            r.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static b b(String str) {
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (n0.f(newPullParser, "x:xmpmeta")) {
            long j10 = -9223372036854775807L;
            q<b.a> J = q.J();
            do {
                newPullParser.next();
                if (!n0.f(newPullParser, "rdf:Description")) {
                    if (n0.f(newPullParser, "Container:Directory")) {
                        str2 = "Container";
                        str3 = "Item";
                    } else if (n0.f(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                    J = f(newPullParser, str2, str3);
                } else if (!d(newPullParser)) {
                    return null;
                } else {
                    j10 = e(newPullParser);
                    J = c(newPullParser);
                }
            } while (!n0.d(newPullParser, "x:xmpmeta"));
            if (J.isEmpty()) {
                return null;
            }
            return new b(j10, J);
        }
        throw h2.a("Couldn't find xmp metadata", null);
    }

    private static q<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f3149c) {
            String a10 = n0.a(xmlPullParser, str);
            if (a10 != null) {
                return q.L(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a10), 0L));
            }
        }
        return q.J();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f3147a) {
            String a10 = n0.a(xmlPullParser, str);
            if (a10 != null) {
                return Integer.parseInt(a10) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f3148b) {
            String a10 = n0.a(xmlPullParser, str);
            if (a10 != null) {
                long parseLong = Long.parseLong(a10);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static q<b.a> f(XmlPullParser xmlPullParser, String str, String str2) {
        q.a D = q.D();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (n0.f(xmlPullParser, str3)) {
                String a10 = n0.a(xmlPullParser, str2 + ":Mime");
                String a11 = n0.a(xmlPullParser, str2 + ":Semantic");
                String a12 = n0.a(xmlPullParser, str2 + ":Length");
                String a13 = n0.a(xmlPullParser, str2 + ":Padding");
                if (a10 == null || a11 == null) {
                    return q.J();
                }
                D.a(new b.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0L, a13 != null ? Long.parseLong(a13) : 0L));
            }
        } while (!n0.d(xmlPullParser, str4));
        return D.h();
    }
}
