package m3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.m0;
import p3.r;
/* loaded from: classes.dex */
final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f11339c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f11340d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final a0 f11341a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f11342b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f11339c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.z((String) p3.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] P0 = m0.P0(str, "\\.");
        String str2 = P0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.y(str2.substring(0, indexOf2));
            dVar.x(str2.substring(indexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (P0.length > 1) {
            dVar.w((String[]) m0.G0(P0, 1, P0.length));
        }
    }

    private static boolean b(a0 a0Var) {
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        byte[] d10 = a0Var.d();
        if (e10 + 2 > f10) {
            return false;
        }
        int i10 = e10 + 1;
        if (d10[e10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (d10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10) {
                a0Var.P(f10 - a0Var.e());
                return true;
            } else if (((char) d10[i11]) == '*' && ((char) d10[i12]) == '/') {
                i11 = i12 + 1;
                f10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(a0 a0Var) {
        char k10 = k(a0Var, a0Var.e());
        if (k10 == '\t' || k10 == '\n' || k10 == '\f' || k10 == '\r' || k10 == ' ') {
            a0Var.P(1);
            return true;
        }
        return false;
    }

    private static void e(String str, d dVar) {
        Matcher matcher = f11340d.matcher(a5.b.e(str));
        if (!matcher.matches()) {
            r.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i10 = 2;
        String str2 = (String) p3.a.e(matcher.group(2));
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
                i10 = 3;
            case 1:
                dVar.t(i10);
                break;
            case 2:
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) p3.a.e(matcher.group(1))));
    }

    private static String f(a0 a0Var, StringBuilder sb) {
        boolean z10 = false;
        sb.setLength(0);
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        while (e10 < f10 && !z10) {
            char c10 = (char) a0Var.d()[e10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                e10++;
                sb.append(c10);
            }
        }
        a0Var.P(e10 - a0Var.e());
        return sb.toString();
    }

    static String g(a0 a0Var, StringBuilder sb) {
        n(a0Var);
        if (a0Var.a() == 0) {
            return null;
        }
        String f10 = f(a0Var, sb);
        if ("".equals(f10)) {
            return "" + ((char) a0Var.C());
        }
        return f10;
    }

    private static String h(a0 a0Var, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int e10 = a0Var.e();
            String g10 = g(a0Var, sb);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                a0Var.O(e10);
                z10 = true;
            } else {
                sb2.append(g10);
            }
        }
        return sb2.toString();
    }

    private static String i(a0 a0Var, StringBuilder sb) {
        n(a0Var);
        if (a0Var.a() >= 5 && "::cue".equals(a0Var.z(5))) {
            int e10 = a0Var.e();
            String g10 = g(a0Var, sb);
            if (g10 == null) {
                return null;
            }
            if ("{".equals(g10)) {
                a0Var.O(e10);
                return "";
            }
            String l10 = "(".equals(g10) ? l(a0Var) : null;
            if (")".equals(g(a0Var, sb))) {
                return l10;
            }
            return null;
        }
        return null;
    }

    private static void j(a0 a0Var, d dVar, StringBuilder sb) {
        n(a0Var);
        String f10 = f(a0Var, sb);
        if (!"".equals(f10) && ":".equals(g(a0Var, sb))) {
            n(a0Var);
            String h10 = h(a0Var, sb);
            if (h10 == null || "".equals(h10)) {
                return;
            }
            int e10 = a0Var.e();
            String g10 = g(a0Var, sb);
            if (!";".equals(g10)) {
                if (!"}".equals(g10)) {
                    return;
                }
                a0Var.O(e10);
            }
            if ("color".equals(f10)) {
                dVar.q(p3.f.b(h10));
            } else if ("background-color".equals(f10)) {
                dVar.n(p3.f.b(h10));
            } else {
                boolean z10 = true;
                if ("ruby-position".equals(f10)) {
                    if ("over".equals(h10)) {
                        dVar.v(1);
                    } else if ("under".equals(h10)) {
                        dVar.v(2);
                    }
                } else if ("text-combine-upright".equals(f10)) {
                    if (!"all".equals(h10) && !h10.startsWith("digits")) {
                        z10 = false;
                    }
                    dVar.p(z10);
                } else if ("text-decoration".equals(f10)) {
                    if ("underline".equals(h10)) {
                        dVar.A(true);
                    }
                } else if ("font-family".equals(f10)) {
                    dVar.r(h10);
                } else if ("font-weight".equals(f10)) {
                    if ("bold".equals(h10)) {
                        dVar.o(true);
                    }
                } else if ("font-style".equals(f10)) {
                    if ("italic".equals(h10)) {
                        dVar.u(true);
                    }
                } else if ("font-size".equals(f10)) {
                    e(h10, dVar);
                }
            }
        }
    }

    private static char k(a0 a0Var, int i10) {
        return (char) a0Var.d()[i10];
    }

    private static String l(a0 a0Var) {
        int e10 = a0Var.e();
        int f10 = a0Var.f();
        boolean z10 = false;
        while (e10 < f10 && !z10) {
            int i10 = e10 + 1;
            z10 = ((char) a0Var.d()[e10]) == ')';
            e10 = i10;
        }
        return a0Var.z((e10 - 1) - a0Var.e()).trim();
    }

    static void m(a0 a0Var) {
        do {
        } while (!TextUtils.isEmpty(a0Var.o()));
    }

    static void n(a0 a0Var) {
        while (true) {
            for (boolean z10 = true; a0Var.a() > 0 && z10; z10 = false) {
                if (!c(a0Var) && !b(a0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(a0 a0Var) {
        this.f11342b.setLength(0);
        int e10 = a0Var.e();
        m(a0Var);
        this.f11341a.M(a0Var.d(), a0Var.e());
        this.f11341a.O(e10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f11341a, this.f11342b);
            if (i10 == null || !"{".equals(g(this.f11341a, this.f11342b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int e11 = this.f11341a.e();
                String g10 = g(this.f11341a, this.f11342b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f11341a.O(e11);
                    j(this.f11341a, dVar, this.f11342b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
