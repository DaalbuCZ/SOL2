package w3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import z3.q0;
import z3.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: e  reason: collision with root package name */
    private static volatile r0 f16115e;

    /* renamed from: g  reason: collision with root package name */
    private static Context f16117g;

    /* renamed from: a  reason: collision with root package name */
    static final x f16111a = new r(v.f("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b  reason: collision with root package name */
    static final x f16112b = new s(v.f("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    static final x f16113c = new t(v.f("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d  reason: collision with root package name */
    static final x f16114d = new u(v.f("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f  reason: collision with root package name */
    private static final Object f16116f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 a(String str, v vVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, vVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String c(boolean z10, String str, v vVar) {
        String str2 = true != (!z10 && f(str, vVar, true, false).f16094a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = d4.a.b("SHA-256");
        z3.o.i(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, d4.j.a(b10.digest(vVar.m0())), Boolean.valueOf(z10), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d(Context context) {
        synchronized (z.class) {
            if (f16117g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f16117g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                return f16115e.g();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    private static j0 f(final String str, final v vVar, final boolean z10, boolean z11) {
        try {
            h();
            z3.o.i(f16117g);
            try {
                return f16115e.V(new e0(str, vVar, z10, z11), g4.b.m0(f16117g.getPackageManager())) ? j0.b() : new h0(new Callable() { // from class: w3.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return z.c(z10, str, vVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return j0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return j0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, g4.a] */
    private static j0 g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        String concat;
        j0 d10;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            z3.o.i(f16117g);
            try {
                h();
                a0 a0Var = new a0(str, z10, false, g4.b.m0(f16117g), false);
                try {
                    c0 k02 = z13 ? f16115e.k0(a0Var) : f16115e.W(a0Var);
                    if (k02.s()) {
                        d10 = j0.f(k02.v());
                    } else {
                        String k10 = k02.k();
                        PackageManager.NameNotFoundException nameNotFoundException = k02.x() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (k10 == null) {
                            k10 = "error checking package certificate";
                        }
                        d10 = j0.g(k02.v(), k02.x(), k10, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    e = e10;
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    concat = "module call";
                    d10 = j0.d(concat, e);
                    return d10;
                }
            } catch (DynamiteModule.a e11) {
                e = e11;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            return d10;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void h() {
        if (f16115e != null) {
            return;
        }
        z3.o.i(f16117g);
        synchronized (f16116f) {
            if (f16115e == null) {
                f16115e = q0.e(DynamiteModule.d(f16117g, DynamiteModule.f3654f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
