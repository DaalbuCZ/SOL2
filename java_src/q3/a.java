package q3;

import java.util.ArrayList;
import java.util.List;
import p3.a0;
import p3.w;
import s1.h2;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f12557a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12558b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12559c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12560d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12561e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12562f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f12557a = list;
        this.f12558b = i10;
        this.f12559c = i11;
        this.f12560d = i12;
        this.f12561e = f10;
        this.f12562f = str;
    }

    private static byte[] a(a0 a0Var) {
        int I = a0Var.I();
        int e10 = a0Var.e();
        a0Var.P(I);
        return p3.e.d(a0Var.d(), e10, I);
    }

    public static a b(a0 a0Var) {
        float f10;
        String str;
        int i10;
        try {
            a0Var.P(4);
            int C = (a0Var.C() & 3) + 1;
            if (C != 3) {
                ArrayList arrayList = new ArrayList();
                int C2 = a0Var.C() & 31;
                for (int i11 = 0; i11 < C2; i11++) {
                    arrayList.add(a(a0Var));
                }
                int C3 = a0Var.C();
                for (int i12 = 0; i12 < C3; i12++) {
                    arrayList.add(a(a0Var));
                }
                int i13 = -1;
                if (C2 > 0) {
                    w.c l10 = p3.w.l((byte[]) arrayList.get(0), C, ((byte[]) arrayList.get(0)).length);
                    int i14 = l10.f12372f;
                    int i15 = l10.f12373g;
                    float f11 = l10.f12374h;
                    str = p3.e.a(l10.f12367a, l10.f12368b, l10.f12369c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    f10 = 1.0f;
                    str = null;
                    i10 = -1;
                }
                return new a(arrayList, C, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw h2.a("Error parsing AVC config", e10);
        }
    }
}
