package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
final class f implements g {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f1454c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f1455d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f1456e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f1457f = e.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f1458a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1459b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f1458a = f1454c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < localeArr.length; i10++) {
                Locale locale = localeArr[i10];
                if (locale == null) {
                    throw new NullPointerException("list[" + i10 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f1458a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f1459b = sb;
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.g
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f1458a;
        if (this.f1458a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f1458a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.g
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f1458a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f1458a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f1458a;
            if (i10 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i10]);
            if (i10 < this.f1458a.length - 1) {
                sb.append(',');
            }
            i10++;
        }
    }
}
