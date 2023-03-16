package androidx.core.text;

import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.core.text.d f1541a = new C0031e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final androidx.core.text.d f1542b = new C0031e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final androidx.core.text.d f1543c;

    /* renamed from: d  reason: collision with root package name */
    public static final androidx.core.text.d f1544d;

    /* renamed from: e  reason: collision with root package name */
    public static final androidx.core.text.d f1545e;

    /* renamed from: f  reason: collision with root package name */
    public static final androidx.core.text.d f1546f;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f1547b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f1548a;

        private a(boolean z10) {
            this.f1548a = z10;
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = e.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f1548a) {
                        return 1;
                    }
                } else if (this.f1548a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f1548a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f1549a = new b();

        private b() {
        }

        @Override // androidx.core.text.e.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = e.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements androidx.core.text.d {

        /* renamed from: a  reason: collision with root package name */
        private final c f1550a;

        d(c cVar) {
            this.f1550a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f1550a.a(charSequence, i10, i11);
            if (a10 != 0) {
                if (a10 != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }

        @Override // androidx.core.text.d
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f1550a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    /* renamed from: androidx.core.text.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0031e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1551b;

        C0031e(c cVar, boolean z10) {
            super(cVar);
            this.f1551b = z10;
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return this.f1551b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f1552b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.e.d
        protected boolean b() {
            return androidx.core.text.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f1549a;
        f1543c = new C0031e(bVar, false);
        f1544d = new C0031e(bVar, true);
        f1545e = new C0031e(a.f1547b, false);
        f1546f = f.f1552b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
