package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class t9 {

    /* renamed from: a  reason: collision with root package name */
    final String f5029a;

    /* renamed from: b  reason: collision with root package name */
    final int f5030b;

    /* renamed from: c  reason: collision with root package name */
    Boolean f5031c;

    /* renamed from: d  reason: collision with root package name */
    Boolean f5032d;

    /* renamed from: e  reason: collision with root package name */
    Long f5033e;

    /* renamed from: f  reason: collision with root package name */
    Long f5034f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t9(String str, int i10) {
        this.f5029a = str;
        this.f5030b = i10;
    }

    private static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, f3 f3Var) {
        boolean startsWith;
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (f3Var != null) {
                        f3Var.w().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    startsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009f, code lost:
        if (r8.compareTo(r5) <= 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.p3 r9, double r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.t9.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.p3, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean f(String str, com.google.android.gms.internal.measurement.w3 w3Var, f3 f3Var) {
        List list;
        z3.o.i(w3Var);
        if (str == null || !w3Var.M() || w3Var.N() == 1) {
            return null;
        }
        if (w3Var.N() == 7) {
            if (w3Var.E() == 0) {
                return null;
            }
        } else if (!w3Var.L()) {
            return null;
        }
        int N = w3Var.N();
        boolean J = w3Var.J();
        String H = (J || N == 2 || N == 7) ? w3Var.H() : w3Var.H().toUpperCase(Locale.ENGLISH);
        if (w3Var.E() == 0) {
            list = null;
        } else {
            List<String> I = w3Var.I();
            if (!J) {
                ArrayList arrayList = new ArrayList(I.size());
                for (String str2 : I) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                I = Collections.unmodifiableList(arrayList);
            }
            list = I;
        }
        return d(str, N, J, H, list, N == 2 ? H : null, f3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(double d10, com.google.android.gms.internal.measurement.p3 p3Var) {
        try {
            return e(new BigDecimal(d10), p3Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean h(long j10, com.google.android.gms.internal.measurement.p3 p3Var) {
        try {
            return e(new BigDecimal(j10), p3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean i(String str, com.google.android.gms.internal.measurement.p3 p3Var) {
        if (c9.N(str)) {
            try {
                return e(new BigDecimal(str), p3Var, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean j(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean c();
}
