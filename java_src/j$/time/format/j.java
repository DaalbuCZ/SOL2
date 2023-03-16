package j$.time.format;

import java.util.Objects;
/* loaded from: classes2.dex */
public class j implements g {

    /* renamed from: f */
    static final long[] f9460f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a */
    final j$.time.temporal.o f9461a;

    /* renamed from: b */
    final int f9462b;

    /* renamed from: c */
    final int f9463c;

    /* renamed from: d */
    private final int f9464d;

    /* renamed from: e */
    final int f9465e;

    public j(j$.time.temporal.o oVar, int i10, int i11, int i12) {
        this.f9461a = oVar;
        this.f9462b = i10;
        this.f9463c = i11;
        this.f9464d = i12;
        this.f9465e = 0;
    }

    protected j(j$.time.temporal.o oVar, int i10, int i11, int i12, int i13) {
        this.f9461a = oVar;
        this.f9462b = i10;
        this.f9463c = i11;
        this.f9464d = i12;
        this.f9465e = i13;
    }

    public static /* synthetic */ int c(j jVar) {
        return jVar.f9464d;
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        int i10;
        Long e10 = vVar.e(this.f9461a);
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        x b10 = vVar.b();
        String l10 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        if (l10.length() > this.f9463c) {
            StringBuilder b11 = j$.time.a.b("Field ");
            b11.append(this.f9461a);
            b11.append(" cannot be printed as the value ");
            b11.append(longValue);
            b11.append(" exceeds the maximum print width of ");
            b11.append(this.f9463c);
            throw new j$.time.d(b11.toString());
        }
        Objects.requireNonNull(b10);
        if (longValue >= 0) {
            int i11 = d.f9452a[A.c(this.f9464d)];
            if (i11 == 1 ? !((i10 = this.f9462b) >= 19 || longValue < f9460f[i10]) : i11 == 2) {
                sb.append('+');
            }
        } else {
            int i12 = d.f9452a[A.c(this.f9464d)];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb.append('-');
            } else if (i12 == 4) {
                StringBuilder b12 = j$.time.a.b("Field ");
                b12.append(this.f9461a);
                b12.append(" cannot be printed as the value ");
                b12.append(longValue);
                b12.append(" cannot be negative according to the SignStyle");
                throw new j$.time.d(b12.toString());
            }
        }
        for (int i13 = 0; i13 < this.f9462b - l10.length(); i13++) {
            sb.append('0');
        }
        sb.append(l10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x013e, code lost:
        if (r2 <= r3) goto L61;
     */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(j$.time.format.s r19, java.lang.CharSequence r20, int r21) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.b(j$.time.format.s, java.lang.CharSequence, int):int");
    }

    boolean d() {
        int i10 = this.f9465e;
        return i10 == -1 || (i10 > 0 && this.f9462b == this.f9463c && this.f9464d == 4);
    }

    public j e() {
        return this.f9465e == -1 ? this : new j(this.f9461a, this.f9462b, this.f9463c, this.f9464d, -1);
    }

    public j f(int i10) {
        return new j(this.f9461a, this.f9462b, this.f9463c, this.f9464d, this.f9465e + i10);
    }

    public String toString() {
        StringBuilder b10;
        int i10 = this.f9462b;
        if (i10 == 1 && this.f9463c == 19 && this.f9464d == 1) {
            b10 = j$.time.a.b("Value(");
            b10.append(this.f9461a);
        } else if (i10 == this.f9463c && this.f9464d == 4) {
            b10 = j$.time.a.b("Value(");
            b10.append(this.f9461a);
            b10.append(",");
            b10.append(this.f9462b);
        } else {
            b10 = j$.time.a.b("Value(");
            b10.append(this.f9461a);
            b10.append(",");
            b10.append(this.f9462b);
            b10.append(",");
            b10.append(this.f9463c);
            b10.append(",");
            b10.append(A.d(this.f9464d));
        }
        b10.append(")");
        return b10.toString();
    }
}
