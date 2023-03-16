package i3;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.m0;
import p3.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f8295a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8296b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f8297c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f8298d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8299e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8300f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8301g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8302h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8303i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8304j;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8305a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8306b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8307c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8308d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8309e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8310f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8311g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8312h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8313i;

        /* renamed from: j  reason: collision with root package name */
        public final int f8314j;

        /* renamed from: k  reason: collision with root package name */
        public final int f8315k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f8305a = i10;
            this.f8306b = i11;
            this.f8307c = i12;
            this.f8308d = i13;
            this.f8309e = i14;
            this.f8310f = i15;
            this.f8311g = i16;
            this.f8312h = i17;
            this.f8313i = i18;
            this.f8314j = i19;
            this.f8315k = i20;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < split.length; i20++) {
                String e10 = a5.b.e(split[i20].trim());
                e10.hashCode();
                switch (e10.hashCode()) {
                    case -1178781136:
                        if (e10.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1026963764:
                        if (e10.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -192095652:
                        if (e10.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -70925746:
                        if (e10.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3029637:
                        if (e10.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3373707:
                        if (e10.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 366554320:
                        if (e10.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 767321349:
                        if (e10.equals("borderstyle")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1767875043:
                        if (e10.equals("alignment")) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1988365454:
                        if (e10.equals("outlinecolour")) {
                            c10 = '\t';
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
                        i16 = i20;
                        break;
                    case 1:
                        i17 = i20;
                        break;
                    case 2:
                        i18 = i20;
                        break;
                    case 3:
                        i12 = i20;
                        break;
                    case 4:
                        i15 = i20;
                        break;
                    case 5:
                        i10 = i20;
                        break;
                    case 6:
                        i14 = i20;
                        break;
                    case 7:
                        i19 = i20;
                        break;
                    case '\b':
                        i11 = i20;
                        break;
                    case '\t':
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, split.length);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f8316c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f8317d = Pattern.compile(m0.C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f8318e = Pattern.compile(m0.C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f8319f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f8320a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f8321b;

        private b(int i10, PointF pointF) {
            this.f8320a = i10;
            this.f8321b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f8319f.matcher(str);
            if (matcher.find()) {
                return c.e((String) p3.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f8316c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) p3.a.e(matcher.group(1));
                try {
                    PointF c10 = c(str2);
                    if (c10 != null) {
                        pointF = c10;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a10 = a(str2);
                    if (a10 != -1) {
                        i10 = a10;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f8317d.matcher(str);
            Matcher matcher2 = f8318e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    r.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) p3.a.e(group)).trim()), Float.parseFloat(((String) p3.a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f8316c.matcher(str).replaceAll("");
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f8295a = str;
        this.f8296b = i10;
        this.f8297c = num;
        this.f8298d = num2;
        this.f8299e = f10;
        this.f8300f = z10;
        this.f8301g = z11;
        this.f8302h = z12;
        this.f8303i = z13;
        this.f8304j = i11;
    }

    public static c b(String str, a aVar) {
        p3.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f8315k;
        if (length != i10) {
            r.i("SsaStyle", m0.C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f8305a].trim();
            int i11 = aVar.f8306b;
            int e10 = i11 != -1 ? e(split[i11].trim()) : -1;
            int i12 = aVar.f8307c;
            Integer h10 = i12 != -1 ? h(split[i12].trim()) : null;
            int i13 = aVar.f8308d;
            Integer h11 = i13 != -1 ? h(split[i13].trim()) : null;
            int i14 = aVar.f8309e;
            float i15 = i14 != -1 ? i(split[i14].trim()) : -3.4028235E38f;
            int i16 = aVar.f8310f;
            boolean z10 = i16 != -1 && f(split[i16].trim());
            int i17 = aVar.f8311g;
            boolean z11 = i17 != -1 && f(split[i17].trim());
            int i18 = aVar.f8312h;
            boolean z12 = i18 != -1 && f(split[i18].trim());
            int i19 = aVar.f8313i;
            boolean z13 = i19 != -1 && f(split[i19].trim());
            int i20 = aVar.f8314j;
            return new c(trim, e10, h10, h11, i15, z10, z11, z12, z13, i20 != -1 ? g(split[i20].trim()) : -1);
        } catch (RuntimeException e11) {
            r.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e11);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            r.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            p3.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(d5.d.d(((parseLong >> 24) & 255) ^ 255), d5.d.d(parseLong & 255), d5.d.d((parseLong >> 8) & 255), d5.d.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            r.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            r.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
