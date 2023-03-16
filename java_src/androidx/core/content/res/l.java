package androidx.core.content.res;
/* loaded from: classes.dex */
final class l {

    /* renamed from: k  reason: collision with root package name */
    static final l f1381k = k(b.f1347c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f1382a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1383b;

    /* renamed from: c  reason: collision with root package name */
    private final float f1384c;

    /* renamed from: d  reason: collision with root package name */
    private final float f1385d;

    /* renamed from: e  reason: collision with root package name */
    private final float f1386e;

    /* renamed from: f  reason: collision with root package name */
    private final float f1387f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f1388g;

    /* renamed from: h  reason: collision with root package name */
    private final float f1389h;

    /* renamed from: i  reason: collision with root package name */
    private final float f1390i;

    /* renamed from: j  reason: collision with root package name */
    private final float f1391j;

    private l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f1387f = f10;
        this.f1382a = f11;
        this.f1383b = f12;
        this.f1384c = f13;
        this.f1385d = f14;
        this.f1386e = f15;
        this.f1388g = fArr;
        this.f1389h = f16;
        this.f1390i = f17;
        this.f1391j = f18;
    }

    static l k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f1345a;
        float f13 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f14 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f15 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f16 = (f12 / 10.0f) + 0.8f;
        float d10 = ((double) f16) >= 0.9d ? b.d(0.59f, 0.69f, (f16 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f16 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f16;
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f13) * exp) + 1.0f) - exp, (((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp};
        float f17 = 1.0f / ((5.0f * f10) + 1.0f);
        float f18 = f17 * f17 * f17 * f17;
        float f19 = 1.0f - f18;
        float cbrt = (f18 * f10) + (0.1f * f19 * f19 * ((float) Math.cbrt(f10 * 5.0d)));
        float h10 = b.h(f11) / fArr[1];
        double d12 = h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f13) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f15) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new l(h10, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d10, f16, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f1382a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f1385d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f1389h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f1390i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f1387f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f1383b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f1386e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f1384c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] i() {
        return this.f1388g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f1391j;
    }
}
