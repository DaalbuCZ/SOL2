package l3;

import a5.d;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import d3.b;
import d3.g;
import d3.h;
import d3.j;
import java.util.List;
import p3.a0;
import p3.m0;
import p3.r;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final a0 f11108o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f11109p;

    /* renamed from: q  reason: collision with root package name */
    private final int f11110q;

    /* renamed from: r  reason: collision with root package name */
    private final int f11111r;

    /* renamed from: s  reason: collision with root package name */
    private final String f11112s;

    /* renamed from: t  reason: collision with root package name */
    private final float f11113t;

    /* renamed from: u  reason: collision with root package name */
    private final int f11114u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f11108o = new a0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f11110q = 0;
            this.f11111r = -1;
            this.f11112s = "sans-serif";
            this.f11109p = false;
            this.f11113t = 0.85f;
            this.f11114u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f11110q = bArr[24];
        this.f11111r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f11112s = "Serif".equals(m0.E(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f11114u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f11109p = z10;
        if (z10) {
            this.f11113t = m0.p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f11113t = 0.85f;
        }
    }

    private void C(a0 a0Var, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        D(a0Var.a() >= 12);
        int I = a0Var.I();
        int I2 = a0Var.I();
        a0Var.P(2);
        int C = a0Var.C();
        a0Var.P(1);
        int m10 = a0Var.m();
        if (I2 > spannableStringBuilder.length()) {
            r.i("Tx3gDecoder", "Truncating styl end (" + I2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i10 = spannableStringBuilder.length();
        } else {
            i10 = I2;
        }
        if (I < i10) {
            int i11 = i10;
            F(spannableStringBuilder, C, this.f11110q, I, i11, 0);
            E(spannableStringBuilder, m10, this.f11111r, I, i11, 0);
            return;
        }
        r.i("Tx3gDecoder", "Ignoring styl with start (" + I + ") >= end (" + i10 + ").");
    }

    private static void D(boolean z10) {
        if (!z10) {
            throw new j("Unexpected subtitle format.");
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = r1
            goto Ld
        Lc:
            r10 = r0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.a.F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void G(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String H(a0 a0Var) {
        char g10;
        D(a0Var.a() >= 2);
        int I = a0Var.I();
        if (I == 0) {
            return "";
        }
        return a0Var.A(I, (a0Var.a() < 2 || !((g10 = a0Var.g()) == 65279 || g10 == 65534)) ? d.f200c : d.f203f);
    }

    @Override // d3.g
    protected h A(byte[] bArr, int i10, boolean z10) {
        this.f11108o.M(bArr, i10);
        String H = H(this.f11108o);
        if (H.isEmpty()) {
            return b.f11115o;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        F(spannableStringBuilder, this.f11110q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder, this.f11111r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder, this.f11112s, 0, spannableStringBuilder.length());
        float f10 = this.f11113t;
        while (this.f11108o.a() >= 8) {
            int e10 = this.f11108o.e();
            int m10 = this.f11108o.m();
            int m11 = this.f11108o.m();
            if (m11 == 1937013100) {
                D(this.f11108o.a() >= 2);
                int I = this.f11108o.I();
                for (int i11 = 0; i11 < I; i11++) {
                    C(this.f11108o, spannableStringBuilder);
                }
            } else if (m11 == 1952608120 && this.f11109p) {
                D(this.f11108o.a() >= 2);
                f10 = m0.p(this.f11108o.I() / this.f11114u, 0.0f, 0.95f);
            }
            this.f11108o.O(e10 + m10);
        }
        return new b(new b.C0093b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}
