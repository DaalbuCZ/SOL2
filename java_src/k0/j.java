package k0;

import android.util.Log;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f10498a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f10499b = 20;

    /* loaded from: classes.dex */
    public static class a extends j {

        /* renamed from: c  reason: collision with root package name */
        private int f10500c;

        public a(int i10) {
            super(i10);
            this.f10500c = i10;
        }

        @Override // k0.j
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f10500c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // k0.j
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f10500c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // k0.j
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f10500c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // k0.j
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f10500c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // k0.j
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f10500c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public j(int i10) {
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            if (f10498a == null) {
                f10498a = new a(3);
            }
            jVar = f10498a;
        }
        return jVar;
    }

    public static synchronized void e(j jVar) {
        synchronized (j.class) {
            f10498a = jVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i10 = f10499b;
        if (length >= i10) {
            str = str.substring(0, i10);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
