package k3;

import android.text.TextUtils;
import b5.s;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f10533d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    private static final s<String> f10534e = s.J("auto", "none");

    /* renamed from: f  reason: collision with root package name */
    private static final s<String> f10535f = s.K("dot", "sesame", "circle");

    /* renamed from: g  reason: collision with root package name */
    private static final s<String> f10536g = s.J("filled", "open");

    /* renamed from: h  reason: collision with root package name */
    private static final s<String> f10537h = s.K("after", "before", "outside");

    /* renamed from: a  reason: collision with root package name */
    public final int f10538a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10539b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10540c;

    private b(int i10, int i11, int i12) {
        this.f10538a = i10;
        this.f10539b = i11;
        this.f10540c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e10 = a5.b.e(str.trim());
        if (e10.isEmpty()) {
            return null;
        }
        return b(s.E(TextUtils.split(e10, f10533d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static k3.b b(b5.s<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.b(b5.s):k3.b");
    }
}
