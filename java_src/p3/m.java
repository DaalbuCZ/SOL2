package p3;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12301a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f12302b = {12344};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f12303c = {12445, 13120, 12344};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f12304d = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f12305e = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* loaded from: classes.dex */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static void a() {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            r.c("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i10 = glGetError;
        }
        if (i10 != 0) {
            d("glError: " + GLU.gluErrorString(i10));
        }
    }

    public static boolean b(Context context) {
        String eglQueryString;
        int i10 = m0.f12306a;
        if (i10 < 24) {
            return false;
        }
        if (i10 >= 26 || !("samsung".equals(m0.f12308c) || "XT1650".equals(m0.f12309d))) {
            return (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean c() {
        String eglQueryString;
        return m0.f12306a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    static void d(String str) {
        if (f12301a) {
            throw new a(str);
        }
        r.c("GlUtil", str);
    }
}
