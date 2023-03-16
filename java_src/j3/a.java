package j3;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import d3.b;
import d3.g;
import d3.h;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3.a0;
import p3.r;
import p3.s;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: q  reason: collision with root package name */
    private static final Pattern f10379q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f10380r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o  reason: collision with root package name */
    private final StringBuilder f10381o;

    /* renamed from: p  reason: collision with root package name */
    private final ArrayList<String> f10382p;

    public a() {
        super("SubripDecoder");
        this.f10381o = new StringBuilder();
        this.f10382p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private d3.b C(Spanned spanned, String str) {
        char c10;
        char c11;
        b.C0093b o10 = new b.C0093b().o(spanned);
        if (str == null) {
            return o10.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1 || c10 == 2) {
            o10.l(0);
        } else if (c10 == 3 || c10 == 4 || c10 == 5) {
            o10.l(2);
        } else {
            o10.l(1);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        if (c11 == 0 || c11 == 1 || c11 == 2) {
            o10.i(2);
        } else if (c11 == 3 || c11 == 4 || c11 == 5) {
            o10.i(0);
        } else {
            o10.i(1);
        }
        return o10.k(D(o10.d())).h(D(o10.c()), 0).a();
    }

    static float D(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private static long E(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L) + (Long.parseLong((String) p3.a.e(matcher.group(i10 + 2))) * 60 * 1000) + (Long.parseLong((String) p3.a.e(matcher.group(i10 + 3))) * 1000);
        String group2 = matcher.group(i10 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f10380r.matcher(trim);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i10;
            int length = group.length();
            sb.replace(start, start + length, "");
            i10 += length;
        }
        return sb.toString();
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        s sVar = new s();
        a0 a0Var = new a0(bArr, i10);
        while (true) {
            String o10 = a0Var.o();
            int i11 = 0;
            if (o10 == null) {
                break;
            } else if (o10.length() != 0) {
                try {
                    Integer.parseInt(o10);
                    o10 = a0Var.o();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (o10 == null) {
                    r.i("SubripDecoder", "Unexpected end");
                    break;
                }
                Matcher matcher = f10379q.matcher(o10);
                if (matcher.matches()) {
                    sVar.a(E(matcher, 1));
                    sVar.a(E(matcher, 6));
                    this.f10381o.setLength(0);
                    this.f10382p.clear();
                    while (true) {
                        String o11 = a0Var.o();
                        if (TextUtils.isEmpty(o11)) {
                            break;
                        }
                        if (this.f10381o.length() > 0) {
                            this.f10381o.append("<br>");
                        }
                        this.f10381o.append(F(o11, this.f10382p));
                    }
                    Spanned fromHtml = Html.fromHtml(this.f10381o.toString());
                    String str2 = null;
                    while (true) {
                        if (i11 >= this.f10382p.size()) {
                            break;
                        }
                        String str3 = this.f10382p.get(i11);
                        if (str3.matches("\\{\\\\an[1-9]\\}")) {
                            str2 = str3;
                            break;
                        }
                        i11++;
                    }
                    arrayList.add(C(fromHtml, str2));
                    arrayList.add(d3.b.E);
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(o10);
                    r.i("SubripDecoder", sb.toString());
                }
            }
        }
        return new b((d3.b[]) arrayList.toArray(new d3.b[0]), sVar.d());
    }
}
