package q3;

import p3.a0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f12570a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12571b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12572c;

    private d(int i10, int i11, String str) {
        this.f12570a = i10;
        this.f12571b = i11;
        this.f12572c = str;
    }

    public static d a(a0 a0Var) {
        String str;
        a0Var.P(2);
        int C = a0Var.C();
        int i10 = C >> 1;
        int C2 = ((a0Var.C() >> 3) & 31) | ((C & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i10);
        sb.append(C2 >= 10 ? "." : ".0");
        sb.append(C2);
        return new d(i10, C2, sb.toString());
    }
}
