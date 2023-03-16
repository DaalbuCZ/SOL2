package q9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import z8.r;
import z8.w;
/* loaded from: classes.dex */
public class n extends m {

    /* loaded from: classes.dex */
    public static final class a extends k9.l implements j9.p<CharSequence, Integer, y8.l<? extends Integer, ? extends Integer>> {

        /* renamed from: o */
        final /* synthetic */ List<String> f12941o;

        /* renamed from: p */
        final /* synthetic */ boolean f12942p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z10) {
            super(2);
            this.f12941o = list;
            this.f12942p = z10;
        }

        public final y8.l<Integer, Integer> a(CharSequence charSequence, int i10) {
            k9.k.e(charSequence, "$this$$receiver");
            y8.l o10 = n.o(charSequence, this.f12941o, i10, this.f12942p, false);
            if (o10 != null) {
                return y8.p.a(o10.c(), Integer.valueOf(((String) o10.d()).length()));
            }
            return null;
        }

        @Override // j9.p
        public /* bridge */ /* synthetic */ y8.l<? extends Integer, ? extends Integer> k(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends k9.l implements j9.l<n9.c, String> {

        /* renamed from: o */
        final /* synthetic */ CharSequence f12943o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f12943o = charSequence;
        }

        @Override // j9.l
        /* renamed from: a */
        public final String c(n9.c cVar) {
            k9.k.e(cVar, "it");
            return n.O(this.f12943o, cVar);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = q(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return y(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int B(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = q(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return z(charSequence, str, i10, z10);
    }

    public static final int C(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int c10;
        char k10;
        k9.k.e(charSequence, "<this>");
        k9.k.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            k10 = z8.f.k(cArr);
            return ((String) charSequence).lastIndexOf(k10, i10);
        }
        for (c10 = n9.f.c(i10, q(charSequence)); -1 < c10; c10--) {
            char charAt = charSequence.charAt(c10);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (q9.b.d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return c10;
            }
        }
        return -1;
    }

    public static final p9.b<String> D(CharSequence charSequence) {
        k9.k.e(charSequence, "<this>");
        return N(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> E(CharSequence charSequence) {
        List<String> f10;
        k9.k.e(charSequence, "<this>");
        f10 = p9.h.f(D(charSequence));
        return f10;
    }

    private static final p9.b<n9.c> F(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List a10;
        I(i11);
        a10 = z8.e.a(strArr);
        return new c(charSequence, i10, i11, new a(a10, z10));
    }

    static /* synthetic */ p9.b G(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return F(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean H(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        k9.k.e(charSequence, "<this>");
        k9.k.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!q9.b.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final void I(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> J(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        Iterable<n9.c> c10;
        int i11;
        k9.k.e(charSequence, "<this>");
        k9.k.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return K(charSequence, str, z10, i10);
            }
        }
        c10 = p9.h.c(G(charSequence, strArr, 0, z10, i10, 2, null));
        i11 = z8.k.i(c10, 10);
        ArrayList arrayList = new ArrayList(i11);
        for (n9.c cVar : c10) {
            arrayList.add(O(charSequence, cVar));
        }
        return arrayList;
    }

    private static final List<String> K(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> b10;
        I(i10);
        int i11 = 0;
        int s10 = s(charSequence, str, 0, z10);
        if (s10 == -1 || i10 == 1) {
            b10 = z8.i.b(charSequence.toString());
            return b10;
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? n9.f.c(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i11, s10).toString());
            i11 = str.length() + s10;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            s10 = s(charSequence, str, i11, z10);
        } while (s10 != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List L(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return J(charSequence, strArr, z10, i10);
    }

    public static final p9.b<String> M(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        p9.b<String> d10;
        k9.k.e(charSequence, "<this>");
        k9.k.e(strArr, "delimiters");
        d10 = p9.h.d(G(charSequence, strArr, 0, z10, i10, 2, null), new b(charSequence));
        return d10;
    }

    public static /* synthetic */ p9.b N(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return M(charSequence, strArr, z10, i10);
    }

    public static final String O(CharSequence charSequence, n9.c cVar) {
        k9.k.e(charSequence, "<this>");
        k9.k.e(cVar, "range");
        return charSequence.subSequence(cVar.x().intValue(), cVar.v().intValue() + 1).toString();
    }

    public static final String P(String str, char c10, String str2) {
        int v10;
        k9.k.e(str, "<this>");
        k9.k.e(str2, "missingDelimiterValue");
        v10 = v(str, c10, 0, false, 6, null);
        if (v10 == -1) {
            return str2;
        }
        String substring = str.substring(v10 + 1, str.length());
        k9.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String Q(String str, String str2, String str3) {
        k9.k.e(str, "<this>");
        k9.k.e(str2, "delimiter");
        k9.k.e(str3, "missingDelimiterValue");
        int w10 = w(str, str2, 0, false, 6, null);
        if (w10 == -1) {
            return str3;
        }
        String substring = str.substring(w10 + str2.length(), str.length());
        k9.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String R(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return P(str, c10, str2);
    }

    public static /* synthetic */ String S(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Q(str, str2, str3);
    }

    public static final String T(String str, char c10, String str2) {
        k9.k.e(str, "<this>");
        k9.k.e(str2, "missingDelimiterValue");
        int A = A(str, c10, 0, false, 6, null);
        if (A == -1) {
            return str2;
        }
        String substring = str.substring(A + 1, str.length());
        k9.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String U(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return T(str, c10, str2);
    }

    public static final String V(String str, char c10, String str2) {
        int v10;
        k9.k.e(str, "<this>");
        k9.k.e(str2, "missingDelimiterValue");
        v10 = v(str, c10, 0, false, 6, null);
        if (v10 == -1) {
            return str2;
        }
        String substring = str.substring(0, v10);
        k9.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String W(String str, String str2, String str3) {
        k9.k.e(str, "<this>");
        k9.k.e(str2, "delimiter");
        k9.k.e(str3, "missingDelimiterValue");
        int w10 = w(str, str2, 0, false, 6, null);
        if (w10 == -1) {
            return str3;
        }
        String substring = str.substring(0, w10);
        k9.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String X(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return V(str, c10, str2);
    }

    public static /* synthetic */ String Y(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return W(str, str2, str3);
    }

    public static CharSequence Z(CharSequence charSequence) {
        k9.k.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = q9.a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!c10) {
                    break;
                }
                length--;
            } else if (c10) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean m(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        k9.k.e(charSequence, "<this>");
        k9.k.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (w(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0) {
                return true;
            }
        } else if (u(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean n(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m(charSequence, charSequence2, z10);
    }

    public static final y8.l<Integer, String> o(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        int c10;
        n9.a f10;
        int d10;
        Object obj;
        String str;
        Object obj2;
        int a10;
        Object p10;
        if (!z10 && collection.size() == 1) {
            p10 = r.p(collection);
            String str2 = (String) p10;
            int w10 = !z11 ? w(charSequence, str2, i10, false, 4, null) : B(charSequence, str2, i10, false, 4, null);
            if (w10 < 0) {
                return null;
            }
            return y8.p.a(Integer.valueOf(w10), str2);
        }
        if (z11) {
            c10 = n9.f.c(i10, q(charSequence));
            f10 = n9.f.f(c10, 0);
        } else {
            a10 = n9.f.a(i10, 0);
            f10 = new n9.c(a10, charSequence.length());
        }
        if (charSequence instanceof String) {
            d10 = f10.d();
            int g10 = f10.g();
            int h10 = f10.h();
            if ((h10 > 0 && d10 <= g10) || (h10 < 0 && g10 <= d10)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str3 = (String) obj2;
                        if (m.i(str3, 0, (String) charSequence, d10, str3.length(), z10)) {
                            break;
                        }
                    }
                    str = (String) obj2;
                    if (str == null) {
                        if (d10 == g10) {
                            break;
                        }
                        d10 += h10;
                    } else {
                        break;
                    }
                }
                return y8.p.a(Integer.valueOf(d10), str);
            }
            return null;
        }
        d10 = f10.d();
        int g11 = f10.g();
        int h11 = f10.h();
        if ((h11 > 0 && d10 <= g11) || (h11 < 0 && g11 <= d10)) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String str4 = (String) obj;
                    if (H(str4, 0, charSequence, d10, str4.length(), z10)) {
                        break;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    if (d10 == g11) {
                        break;
                    }
                    d10 += h11;
                } else {
                    break;
                }
            }
            return y8.p.a(Integer.valueOf(d10), str);
        }
        return null;
    }

    public static final n9.c p(CharSequence charSequence) {
        k9.k.e(charSequence, "<this>");
        return new n9.c(0, charSequence.length() - 1);
    }

    public static final int q(CharSequence charSequence) {
        k9.k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int r(CharSequence charSequence, char c10, int i10, boolean z10) {
        k9.k.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? x(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int s(CharSequence charSequence, String str, int i10, boolean z10) {
        k9.k.e(charSequence, "<this>");
        k9.k.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? u(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    private static final int t(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        int c10;
        int a10;
        n9.a f10;
        int a11;
        int c11;
        if (z11) {
            c10 = n9.f.c(i10, q(charSequence));
            a10 = n9.f.a(i11, 0);
            f10 = n9.f.f(c10, a10);
        } else {
            a11 = n9.f.a(i10, 0);
            c11 = n9.f.c(i11, charSequence.length());
            f10 = new n9.c(a11, c11);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int d10 = f10.d();
            int g10 = f10.g();
            int h10 = f10.h();
            if ((h10 <= 0 || d10 > g10) && (h10 >= 0 || g10 > d10)) {
                return -1;
            }
            while (!m.i((String) charSequence2, 0, (String) charSequence, d10, charSequence2.length(), z10)) {
                if (d10 == g10) {
                    return -1;
                }
                d10 += h10;
            }
            return d10;
        }
        int d11 = f10.d();
        int g11 = f10.g();
        int h11 = f10.h();
        if ((h11 <= 0 || d11 > g11) && (h11 >= 0 || g11 > d11)) {
            return -1;
        }
        while (!H(charSequence2, 0, charSequence, d11, charSequence2.length(), z10)) {
            if (d11 == g11) {
                return -1;
            }
            d11 += h11;
        }
        return d11;
    }

    static /* synthetic */ int u(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return t(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int v(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return r(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int w(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return s(charSequence, str, i10, z10);
    }

    public static final int x(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int a10;
        boolean z11;
        char k10;
        k9.k.e(charSequence, "<this>");
        k9.k.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            k10 = z8.f.k(cArr);
            return ((String) charSequence).indexOf(k10, i10);
        }
        a10 = n9.f.a(i10, 0);
        w it = new n9.c(a10, q(charSequence)).iterator();
        while (it.hasNext()) {
            int b10 = it.b();
            char charAt = charSequence.charAt(b10);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    continue;
                    break;
                } else if (q9.b.d(cArr[i11], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return b10;
            }
        }
        return -1;
    }

    public static final int y(CharSequence charSequence, char c10, int i10, boolean z10) {
        k9.k.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? C(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int z(CharSequence charSequence, String str, int i10, boolean z10) {
        k9.k.e(charSequence, "<this>");
        k9.k.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? t(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }
}
