package y9;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f17100j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    final String f17101a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17102b;

    /* renamed from: c  reason: collision with root package name */
    private final String f17103c;

    /* renamed from: d  reason: collision with root package name */
    final String f17104d;

    /* renamed from: e  reason: collision with root package name */
    final int f17105e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f17106f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f17107g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private final String f17108h;

    /* renamed from: i  reason: collision with root package name */
    private final String f17109i;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        String f17110a;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        String f17113d;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f17115f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        List<String> f17116g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        String f17117h;

        /* renamed from: b  reason: collision with root package name */
        String f17111b = "";

        /* renamed from: c  reason: collision with root package name */
        String f17112c = "";

        /* renamed from: e  reason: collision with root package name */
        int f17114e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f17115f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int i10, int i11) {
            return z9.a.a(c.p(str, i10, i11, false));
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int i(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(c.a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void k() {
            List<String> list = this.f17115f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f17115f.isEmpty()) {
                this.f17115f.add("");
                return;
            }
            List<String> list2 = this.f17115f;
            list2.set(list2.size() - 1, "");
        }

        private static int l(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private void m(String str, int i10, int i11, boolean z10, boolean z11) {
            String a10 = c.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (f(a10)) {
                return;
            }
            if (g(a10)) {
                k();
                return;
            }
            List<String> list = this.f17115f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f17115f;
                list2.set(list2.size() - 1, a10);
            } else {
                this.f17115f.add(a10);
            }
            if (z10) {
                this.f17115f.add("");
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:11:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void o(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f17115f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f17115f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f17115f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = z9.a.i(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = r3
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y9.c.a.o(java.lang.String, int, int):void");
        }

        private static int p(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int q(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public c a() {
            if (this.f17110a != null) {
                if (this.f17113d != null) {
                    return new c(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int c() {
            int i10 = this.f17114e;
            return i10 != -1 ? i10 : c.d(this.f17110a);
        }

        public a d(@Nullable String str) {
            this.f17116g = str != null ? c.u(c.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a e(@Nullable String str) {
            this.f17117h = str != null ? c.b(str, "", false, false, false, false) : null;
            return this;
        }

        a h(@Nullable c cVar, String str) {
            int p10;
            int i10;
            int i11;
            int k10 = z9.a.k(str, 0, str.length());
            int l10 = z9.a.l(str, k10, str.length());
            if (p(str, k10, l10) != -1) {
                if (str.regionMatches(true, k10, "https:", 0, 6)) {
                    this.f17110a = "https";
                    k10 += 6;
                } else if (!str.regionMatches(true, k10, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, p10) + "'");
                } else {
                    this.f17110a = "http";
                    k10 += 5;
                }
            } else if (cVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            } else {
                this.f17110a = cVar.f17101a;
            }
            int q10 = q(str, k10, l10);
            char c10 = '?';
            char c11 = '#';
            if (q10 >= 2 || cVar == null || !cVar.f17101a.equals(this.f17110a)) {
                boolean z10 = false;
                boolean z11 = false;
                int i12 = k10 + q10;
                while (true) {
                    i10 = z9.a.i(str, i12, l10, "@/\\?#");
                    char charAt = i10 != l10 ? str.charAt(i10) : (char) 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z10) {
                            i11 = i10;
                            this.f17112c += "%40" + c.a(str, i12, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int h10 = z9.a.h(str, i12, i10, ':');
                            i11 = i10;
                            String a10 = c.a(str, i12, h10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                a10 = this.f17111b + "%40" + a10;
                            }
                            this.f17111b = a10;
                            if (h10 != i11) {
                                this.f17112c = c.a(str, h10 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        }
                        i12 = i11 + 1;
                    }
                    c10 = '?';
                    c11 = '#';
                }
                int l11 = l(str, i12, i10);
                int i13 = l11 + 1;
                if (i13 < i10) {
                    this.f17113d = b(str, i12, l11);
                    int i14 = i(str, i13, i10);
                    this.f17114e = i14;
                    if (i14 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i13, i10) + '\"');
                    }
                } else {
                    this.f17113d = b(str, i12, l11);
                    this.f17114e = c.d(this.f17110a);
                }
                if (this.f17113d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i12, l11) + '\"');
                }
                k10 = i10;
            } else {
                this.f17111b = cVar.j();
                this.f17112c = cVar.f();
                this.f17113d = cVar.f17104d;
                this.f17114e = cVar.f17105e;
                this.f17115f.clear();
                this.f17115f.addAll(cVar.h());
                if (k10 == l10 || str.charAt(k10) == '#') {
                    d(cVar.i());
                }
            }
            int i15 = z9.a.i(str, k10, l10, "?#");
            o(str, k10, i15);
            if (i15 < l10 && str.charAt(i15) == '?') {
                int h11 = z9.a.h(str, i15, l10, '#');
                this.f17116g = c.u(c.a(str, i15 + 1, h11, " \"'<>#", true, false, true, true, null));
                i15 = h11;
            }
            if (i15 < l10 && str.charAt(i15) == '#') {
                this.f17117h = c.a(str, 1 + i15, l10, "", true, false, false, false, null);
            }
            return this;
        }

        public a j(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f17112c = c.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a n(@Nullable String str) {
            this.f17116g = str != null ? c.u(c.b(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public a r(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f17111b = c.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f17110a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f17111b.isEmpty() || !this.f17112c.isEmpty()) {
                sb.append(this.f17111b);
                if (!this.f17112c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f17112c);
                }
                sb.append('@');
            }
            String str3 = this.f17113d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f17113d);
                    sb.append(']');
                } else {
                    sb.append(this.f17113d);
                }
            }
            if (this.f17114e != -1 || this.f17110a != null) {
                int c10 = c();
                String str4 = this.f17110a;
                if (str4 == null || c10 != c.d(str4)) {
                    sb.append(':');
                    sb.append(c10);
                }
            }
            c.o(sb, this.f17115f);
            if (this.f17116g != null) {
                sb.append('?');
                c.l(sb, this.f17116g);
            }
            if (this.f17117h != null) {
                sb.append('#');
                sb.append(this.f17117h);
            }
            return sb.toString();
        }
    }

    c(a aVar) {
        this.f17101a = aVar.f17110a;
        this.f17102b = q(aVar.f17111b, false);
        this.f17103c = q(aVar.f17112c, false);
        this.f17104d = aVar.f17113d;
        this.f17105e = aVar.c();
        this.f17106f = r(aVar.f17115f, false);
        List<String> list = aVar.f17116g;
        this.f17107g = list != null ? r(list, true) : null;
        String str = aVar.f17117h;
        this.f17108h = str != null ? q(str, false) : null;
        this.f17109i = aVar.toString();
    }

    static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || t(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            aa.a aVar = new aa.a();
            aVar.d0(str, i10, i12);
            c(aVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return aVar.O();
        }
        return str.substring(i10, i11);
    }

    static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }

    static void c(aa.a aVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        aa.a aVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    aVar.c0(z10 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z10 || (z11 && !t(str, i10, i11)))))) {
                    if (aVar2 == null) {
                        aVar2 = new aa.a();
                    }
                    if (charset == null || charset.equals(z9.a.f17525j)) {
                        aVar2.e0(codePointAt);
                    } else {
                        aVar2.b0(str, i10, Character.charCount(codePointAt) + i10, charset);
                    }
                    while (!aVar2.p()) {
                        int D = aVar2.D() & 255;
                        aVar.Z(37);
                        char[] cArr = f17100j;
                        aVar.Z(cArr[(D >> 4) & 15]);
                        aVar.Z(cArr[D & 15]);
                    }
                } else {
                    aVar.e0(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static c k(String str) {
        return new a().h(null, str).a();
    }

    static void l(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    public static c n(String str) {
        try {
            return k(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append('/');
            sb.append(list.get(i10));
        }
    }

    static String p(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                aa.a aVar = new aa.a();
                aVar.d0(str, i10, i12);
                s(aVar, str, i12, i11, z10);
                return aVar.O();
            }
        }
        return str.substring(i10, i11);
    }

    static String q(String str, boolean z10) {
        return p(str, 0, str.length(), z10);
    }

    private List<String> r(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? q(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void s(aa.a aVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                if (codePointAt == 43 && z10) {
                    aVar.Z(32);
                }
                aVar.e0(codePointAt);
            } else {
                int e10 = z9.a.e(str.charAt(i10 + 1));
                int e11 = z9.a.e(str.charAt(i12));
                if (e10 != -1 && e11 != -1) {
                    aVar.Z((e10 << 4) + e11);
                    i10 = i12;
                }
                aVar.e0(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    static boolean t(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && z9.a.e(str.charAt(i10 + 1)) != -1 && z9.a.e(str.charAt(i12)) != -1;
    }

    static List<String> u(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    public String e() {
        if (this.f17108h == null) {
            return null;
        }
        return this.f17109i.substring(this.f17109i.indexOf(35) + 1);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof c) && ((c) obj).f17109i.equals(this.f17109i);
    }

    public String f() {
        if (this.f17103c.isEmpty()) {
            return "";
        }
        int indexOf = this.f17109i.indexOf(64);
        return this.f17109i.substring(this.f17109i.indexOf(58, this.f17101a.length() + 3) + 1, indexOf);
    }

    public String g() {
        int indexOf = this.f17109i.indexOf(47, this.f17101a.length() + 3);
        String str = this.f17109i;
        return this.f17109i.substring(indexOf, z9.a.i(str, indexOf, str.length(), "?#"));
    }

    public List<String> h() {
        int indexOf = this.f17109i.indexOf(47, this.f17101a.length() + 3);
        String str = this.f17109i;
        int i10 = z9.a.i(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < i10) {
            int i11 = indexOf + 1;
            int h10 = z9.a.h(this.f17109i, i11, i10, '/');
            arrayList.add(this.f17109i.substring(i11, h10));
            indexOf = h10;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f17109i.hashCode();
    }

    @Nullable
    public String i() {
        if (this.f17107g == null) {
            return null;
        }
        int indexOf = this.f17109i.indexOf(63) + 1;
        String str = this.f17109i;
        return this.f17109i.substring(indexOf, z9.a.h(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f17102b.isEmpty()) {
            return "";
        }
        int length = this.f17101a.length() + 3;
        String str = this.f17109i;
        return this.f17109i.substring(length, z9.a.i(str, length, str.length(), ":@"));
    }

    public a m() {
        a aVar = new a();
        aVar.f17110a = this.f17101a;
        aVar.f17111b = j();
        aVar.f17112c = f();
        aVar.f17113d = this.f17104d;
        aVar.f17114e = this.f17105e != d(this.f17101a) ? this.f17105e : -1;
        aVar.f17115f.clear();
        aVar.f17115f.addAll(h());
        aVar.d(i());
        aVar.f17117h = e();
        return aVar;
    }

    public String toString() {
        return this.f17109i;
    }
}
