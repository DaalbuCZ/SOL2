package x1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.a;
import p3.m0;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f16296c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f16297a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f16298b = -1;

    private boolean b(String str) {
        Matcher matcher = f16296c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) m0.j(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) m0.j(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f16297a = parseInt;
                    this.f16298b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f16297a == -1 || this.f16298b == -1) ? false : true;
    }

    public boolean c(k2.a aVar) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            a.b c10 = aVar.c(i10);
            if (c10 instanceof p2.e) {
                p2.e eVar = (p2.e) c10;
                if ("iTunSMPB".equals(eVar.f12215p) && b(eVar.f12216q)) {
                    return true;
                }
            } else if (c10 instanceof p2.j) {
                p2.j jVar = (p2.j) c10;
                if ("com.apple.iTunes".equals(jVar.f12228o) && "iTunSMPB".equals(jVar.f12229p) && b(jVar.f12230q)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 > 0 || i12 > 0) {
            this.f16297a = i11;
            this.f16298b = i12;
            return true;
        }
        return false;
    }
}
