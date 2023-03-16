package a5;
/* loaded from: classes.dex */
public abstract class c implements k<Character> {

    /* loaded from: classes.dex */
    static abstract class a extends c {
        a() {
        }

        @Override // a5.k
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends a {

        /* renamed from: n  reason: collision with root package name */
        private final char f195n;

        b(char c10) {
            this.f195n = c10;
        }

        @Override // a5.c
        public boolean e(char c10) {
            return c10 == this.f195n;
        }

        public String toString() {
            String g10 = c.g(this.f195n);
            StringBuilder sb = new StringBuilder(String.valueOf(g10).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(g10);
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: a5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static abstract class AbstractC0005c extends a {

        /* renamed from: n  reason: collision with root package name */
        private final String f196n;

        AbstractC0005c(String str) {
            this.f196n = (String) j.i(str);
        }

        public final String toString() {
            return this.f196n;
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends AbstractC0005c {

        /* renamed from: o  reason: collision with root package name */
        static final d f197o = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // a5.c
        public int c(CharSequence charSequence, int i10) {
            j.k(i10, charSequence.length());
            return -1;
        }

        @Override // a5.c
        public boolean e(char c10) {
            return false;
        }
    }

    protected c() {
    }

    public static c d(char c10) {
        return new b(c10);
    }

    public static c f() {
        return d.f197o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        j.k(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
