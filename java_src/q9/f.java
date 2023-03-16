package q9;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends k9.l implements j9.l<String, String> {

        /* renamed from: o  reason: collision with root package name */
        public static final a f12939o = new a();

        a() {
            super(1);
        }

        @Override // j9.l
        /* renamed from: a */
        public final String c(String str) {
            k9.k.e(str, "line");
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends k9.l implements j9.l<String, String> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f12940o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f12940o = str;
        }

        @Override // j9.l
        /* renamed from: a */
        public final String c(String str) {
            k9.k.e(str, "line");
            return this.f12940o + str;
        }
    }

    private static final j9.l<String, String> b(String str) {
        return str.length() == 0 ? a.f12939o : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!q9.a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String c10;
        k9.k.e(str, "<this>");
        k9.k.e(str2, "newIndent");
        List<String> E = n.E(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : E) {
            if (!d.h((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z8.h.i(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(c(str3)));
        }
        Integer num = (Integer) z8.h.o(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * E.size());
        j9.l<String, String> b10 = b(str2);
        int e10 = z8.h.e(E);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : E) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                z8.h.h();
            }
            String str4 = (String) obj2;
            if ((i10 == 0 || i10 == e10) && d.h(str4)) {
                str4 = null;
            } else {
                String a02 = p.a0(str4, intValue);
                if (a02 != null && (c10 = b10.c(a02)) != null) {
                    str4 = c10;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i10 = i11;
        }
        String sb = ((StringBuilder) z8.h.l(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, c.j.N0, null)).toString();
        k9.k.d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        k9.k.e(str, "<this>");
        return d(str, "");
    }
}
