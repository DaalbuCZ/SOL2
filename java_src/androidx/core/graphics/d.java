package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import androidx.core.provider.g;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final j f1402a;

    /* renamed from: b  reason: collision with root package name */
    private static final m.e<String, Typeface> f1403b;

    /* loaded from: classes.dex */
    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        private h.e f1404a;

        public a(h.e eVar) {
            this.f1404a = eVar;
        }

        @Override // androidx.core.provider.g.c
        public void a(int i10) {
            h.e eVar = this.f1404a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f1404a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1402a = i10 >= 29 ? new i() : i10 >= 28 ? new h() : i10 >= 26 ? new g() : (i10 < 24 || !f.n()) ? i10 >= 21 ? new e() : new j() : new f();
        f1403b = new m.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        Typeface g10;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g10 = g(context, typeface, i10)) == null) ? Typeface.create(typeface, i10) : g10;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        return f1402a.c(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface b10;
        if (bVar instanceof e.C0023e) {
            e.C0023e c0023e = (e.C0023e) bVar;
            Typeface h10 = h(c0023e.c());
            if (h10 != null) {
                if (eVar != null) {
                    eVar.d(h10, handler);
                }
                return h10;
            }
            boolean z11 = !z10 ? eVar != null : c0023e.a() != 0;
            int d10 = z10 ? c0023e.d() : -1;
            b10 = androidx.core.provider.g.a(context, c0023e.b(), i12, z11, d10, h.e.e(handler), new a(eVar));
        } else {
            b10 = f1402a.b(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (b10 != null) {
                    eVar.d(b10, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (b10 != null) {
            f1403b.d(e(resources, i10, str, i11, i12), b10);
        }
        return b10;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface e10 = f1402a.e(context, resources, i10, str, i12);
        if (e10 != null) {
            f1403b.d(e(resources, i10, str, i11, i12), e10);
        }
        return e10;
    }

    private static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return f1403b.c(e(resources, i10, str, i11, i12));
    }

    private static Typeface g(Context context, Typeface typeface, int i10) {
        j jVar = f1402a;
        e.c j10 = jVar.j(typeface);
        if (j10 == null) {
            return null;
        }
        return jVar.b(context, j10, context.getResources(), i10);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
