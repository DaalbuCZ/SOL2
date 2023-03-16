package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f1509d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f1510e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f1511f;

    /* renamed from: g  reason: collision with root package name */
    static final a f1512g;

    /* renamed from: h  reason: collision with root package name */
    static final a f1513h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1514a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1515b;

    /* renamed from: c  reason: collision with root package name */
    private final d f1516c;

    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0028a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1517a;

        /* renamed from: b  reason: collision with root package name */
        private int f1518b;

        /* renamed from: c  reason: collision with root package name */
        private d f1519c;

        public C0028a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f1513h : a.f1512g;
        }

        private void c(boolean z10) {
            this.f1517a = z10;
            this.f1519c = a.f1509d;
            this.f1518b = 2;
        }

        public a a() {
            return (this.f1518b == 2 && this.f1519c == a.f1509d) ? b(this.f1517a) : new a(this.f1517a, this.f1518b, this.f1519c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f1520f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f1521a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1522b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1523c;

        /* renamed from: d  reason: collision with root package name */
        private int f1524d;

        /* renamed from: e  reason: collision with root package name */
        private char f1525e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f1520f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f1521a = charSequence;
            this.f1522b = z10;
            this.f1523c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f1520f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f1524d;
            do {
                int i11 = this.f1524d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1521a;
                int i12 = i11 - 1;
                this.f1524d = i12;
                charAt = charSequence.charAt(i12);
                this.f1525e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f1524d = i10;
            this.f1525e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f1524d;
                if (i10 >= this.f1523c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f1521a;
                this.f1524d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f1525e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f1524d;
            while (true) {
                int i11 = this.f1524d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1521a;
                int i12 = i11 - 1;
                this.f1524d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f1525e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f1524d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f1521a;
                            int i14 = i13 - 1;
                            this.f1524d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f1525e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f1524d = i10;
            this.f1525e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f1524d;
            while (true) {
                int i11 = this.f1524d;
                if (i11 >= this.f1523c) {
                    this.f1524d = i10;
                    this.f1525e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f1521a;
                this.f1524d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f1525e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f1524d;
                        if (i12 < this.f1523c) {
                            CharSequence charSequence2 = this.f1521a;
                            this.f1524d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f1525e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f1521a.charAt(this.f1524d - 1);
            this.f1525e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f1521a, this.f1524d);
                this.f1524d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f1524d--;
            byte c10 = c(this.f1525e);
            if (this.f1522b) {
                char c11 = this.f1525e;
                return c11 == '>' ? h() : c11 == ';' ? f() : c10;
            }
            return c10;
        }

        byte b() {
            char charAt = this.f1521a.charAt(this.f1524d);
            this.f1525e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f1521a, this.f1524d);
                this.f1524d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f1524d++;
            byte c10 = c(this.f1525e);
            if (this.f1522b) {
                char c11 = this.f1525e;
                return c11 == '<' ? i() : c11 == '&' ? g() : c10;
            }
            return c10;
        }

        int d() {
            this.f1524d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f1524d < this.f1523c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                break;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                break;
                            case 18:
                                i12--;
                                i11 = 0;
                                break;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f1524d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f1524d = this.f1523c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f1524d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f1543c;
        f1509d = dVar;
        f1510e = Character.toString((char) 8206);
        f1511f = Character.toString((char) 8207);
        f1512g = new a(false, 2, dVar);
        f1513h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f1514a = z10;
        this.f1515b = i10;
        this.f1516c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0028a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f1514a || !(a10 || b(charSequence) == 1)) ? this.f1514a ? (!a10 || b(charSequence) == -1) ? f1511f : "" : "" : f1510e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f1514a || !(a10 || a(charSequence) == 1)) ? this.f1514a ? (!a10 || a(charSequence) == -1) ? f1511f : "" : "" : f1510e;
    }

    public boolean d() {
        return (this.f1515b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f1516c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? e.f1542b : e.f1541a));
        }
        if (a10 != this.f1514a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? e.f1542b : e.f1541a));
        }
        return spannableStringBuilder;
    }
}
