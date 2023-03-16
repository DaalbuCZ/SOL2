package q3;

import java.util.Collections;
import java.util.List;
import p3.a0;
import p3.w;
import s1.h2;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f12587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12588b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12589c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12590d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12591e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12592f;

    private f(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f12587a = list;
        this.f12588b = i10;
        this.f12589c = i11;
        this.f12590d = i12;
        this.f12591e = f10;
        this.f12592f = str;
    }

    public static f a(a0 a0Var) {
        int i10;
        int i11;
        try {
            a0Var.P(21);
            int C = a0Var.C() & 3;
            int C2 = a0Var.C();
            int e10 = a0Var.e();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < C2; i14++) {
                a0Var.P(1);
                int I = a0Var.I();
                for (int i15 = 0; i15 < I; i15++) {
                    int I2 = a0Var.I();
                    i13 += I2 + 4;
                    a0Var.P(I2);
                }
            }
            a0Var.O(e10);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String str = null;
            int i16 = -1;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            while (i18 < C2) {
                int C3 = a0Var.C() & 127;
                int I3 = a0Var.I();
                int i20 = i12;
                while (i20 < I3) {
                    int I4 = a0Var.I();
                    byte[] bArr2 = p3.w.f12350a;
                    int i21 = C2;
                    System.arraycopy(bArr2, i12, bArr, i19, bArr2.length);
                    int length = i19 + bArr2.length;
                    System.arraycopy(a0Var.d(), a0Var.e(), bArr, length, I4);
                    if (C3 == 33 && i20 == 0) {
                        w.a h10 = p3.w.h(bArr, length, length + I4);
                        int i22 = h10.f12361h;
                        i17 = h10.f12362i;
                        f10 = h10.f12363j;
                        i10 = C3;
                        i11 = I3;
                        i16 = i22;
                        str = p3.e.c(h10.f12354a, h10.f12355b, h10.f12356c, h10.f12357d, h10.f12358e, h10.f12359f);
                    } else {
                        i10 = C3;
                        i11 = I3;
                    }
                    i19 = length + I4;
                    a0Var.P(I4);
                    i20++;
                    C2 = i21;
                    C3 = i10;
                    I3 = i11;
                    i12 = 0;
                }
                i18++;
                i12 = 0;
            }
            return new f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), C + 1, i16, i17, f10, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw h2.a("Error parsing HEVC config", e11);
        }
    }
}
