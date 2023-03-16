package j$.time.format;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String[] f9466c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d  reason: collision with root package name */
    static final k f9467d = new k("+HH:MM:ss", "Z");

    /* renamed from: e  reason: collision with root package name */
    static final k f9468e = new k("+HH:MM:ss", "0");

    /* renamed from: a  reason: collision with root package name */
    private final String f9469a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9470b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i10 = 0;
        while (true) {
            String[] strArr = f9466c;
            if (i10 >= strArr.length) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i10].equals(str)) {
                this.f9470b = i10;
                this.f9469a = str2;
                return;
            } else {
                i10++;
            }
        }
    }

    private boolean c(int[] iArr, int i10, CharSequence charSequence, boolean z10) {
        int i11 = this.f9470b;
        if ((i11 + 3) / 2 < i10) {
            return false;
        }
        int i12 = iArr[0];
        if (i11 % 2 == 0 && i10 > 1) {
            int i13 = i12 + 1;
            if (i13 > charSequence.length() || charSequence.charAt(i12) != ':') {
                return z10;
            }
            i12 = i13;
        }
        if (i12 + 2 > charSequence.length()) {
            return z10;
        }
        int i14 = i12 + 1;
        char charAt = charSequence.charAt(i12);
        int i15 = i14 + 1;
        char charAt2 = charSequence.charAt(i14);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i16 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i16 >= 0 && i16 <= 59) {
                iArr[i10] = i16;
                iArr[0] = i15;
                return false;
            }
        }
        return z10;
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        Long e10 = vVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        if (e10 == null) {
            return false;
        }
        long longValue = e10.longValue();
        int i10 = (int) longValue;
        if (longValue == i10) {
            if (i10 != 0) {
                int abs = Math.abs((i10 / 3600) % 100);
                int abs2 = Math.abs((i10 / 60) % 60);
                int abs3 = Math.abs(i10 % 60);
                int length = sb.length();
                sb.append(i10 < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i11 = this.f9470b;
                if (i11 >= 3 || (i11 >= 1 && abs2 > 0)) {
                    sb.append(i11 % 2 == 0 ? ":" : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i12 = this.f9470b;
                    if (i12 >= 7 || (i12 >= 5 && abs3 > 0)) {
                        sb.append(i12 % 2 != 0 ? "" : ":");
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f9469a);
            return true;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r16.r(r17, r18, r15.f9469a, 0, r9) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    @Override // j$.time.format.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(j$.time.format.s r16, java.lang.CharSequence r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r7 = r17
            r8 = r18
            int r1 = r17.length()
            java.lang.String r2 = r0.f9469a
            int r9 = r2.length()
            if (r9 != 0) goto L22
            if (r8 != r1) goto L41
            j$.time.temporal.a r2 = j$.time.temporal.a.OFFSET_SECONDS
            r3 = 0
            r1 = r16
            r5 = r18
            r6 = r18
        L1d:
            int r1 = r1.n(r2, r3, r5, r6)
            return r1
        L22:
            if (r8 != r1) goto L26
            int r1 = ~r8
            return r1
        L26:
            java.lang.String r4 = r0.f9469a
            r5 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r9
            boolean r1 = r1.r(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L41
        L36:
            j$.time.temporal.a r2 = j$.time.temporal.a.OFFSET_SECONDS
            r3 = 0
            int r6 = r8 + r9
            r1 = r16
            r5 = r18
            goto L1d
        L41:
            char r1 = r17.charAt(r18)
            r2 = 43
            r3 = 45
            if (r1 == r2) goto L4d
            if (r1 != r3) goto L9a
        L4d:
            r2 = 1
            if (r1 != r3) goto L52
            r1 = -1
            goto L53
        L52:
            r1 = r2
        L53:
            r3 = 4
            int[] r3 = new int[r3]
            int r4 = r8 + 1
            r5 = 0
            r3[r5] = r4
            boolean r4 = r15.c(r3, r2, r7, r2)
            r6 = 2
            r10 = 3
            if (r4 != 0) goto L79
            int r4 = r0.f9470b
            if (r4 < r10) goto L69
            r4 = r2
            goto L6a
        L69:
            r4 = r5
        L6a:
            boolean r4 = r15.c(r3, r6, r7, r4)
            if (r4 != 0) goto L79
            boolean r4 = r15.c(r3, r10, r7, r5)
            if (r4 == 0) goto L77
            goto L79
        L77:
            r4 = r5
            goto L7a
        L79:
            r4 = r2
        L7a:
            if (r4 != 0) goto L9a
            long r11 = (long) r1
            r1 = r3[r2]
            long r1 = (long) r1
            r13 = 3600(0xe10, double:1.7786E-320)
            long r1 = r1 * r13
            r4 = r3[r6]
            long r6 = (long) r4
            r13 = 60
            long r6 = r6 * r13
            long r6 = r6 + r1
            r1 = r3[r10]
            long r1 = (long) r1
            long r6 = r6 + r1
            long r6 = r6 * r11
            j$.time.temporal.a r2 = j$.time.temporal.a.OFFSET_SECONDS
            r9 = r3[r5]
            r1 = r16
            r3 = r6
            r5 = r18
            r6 = r9
            goto L1d
        L9a:
            if (r9 != 0) goto L9d
            goto L36
        L9d:
            int r1 = ~r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.k.b(j$.time.format.s, java.lang.CharSequence, int):int");
    }

    public String toString() {
        String replace = this.f9469a.replace("'", "''");
        StringBuilder b10 = j$.time.a.b("Offset(");
        b10.append(f9466c[this.f9470b]);
        b10.append(",'");
        b10.append(replace);
        b10.append("')");
        return b10.toString();
    }
}
