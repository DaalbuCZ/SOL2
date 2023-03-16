package w5;

import android.content.Context;
import e1.g;
import g1.u;
import java.nio.charset.Charset;
import q5.p;
import s5.b0;
import t5.h;
import x5.i;
/* loaded from: classes.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final h f16119c = new h();

    /* renamed from: d  reason: collision with root package name */
    private static final String f16120d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e  reason: collision with root package name */
    private static final String f16121e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f  reason: collision with root package name */
    private static final e1.e<b0, byte[]> f16122f = a.f16118a;

    /* renamed from: a  reason: collision with root package name */
    private final e f16123a;

    /* renamed from: b  reason: collision with root package name */
    private final e1.e<b0, byte[]> f16124b;

    b(e eVar, e1.e<b0, byte[]> eVar2) {
        this.f16123a = eVar;
        this.f16124b = eVar2;
    }

    public static b b(Context context, i iVar, q5.b0 b0Var) {
        u.f(context);
        g g10 = u.c().g(new com.google.android.datatransport.cct.a(f16120d, f16121e));
        e1.b b10 = e1.b.b("json");
        e1.e<b0, byte[]> eVar = f16122f;
        return new b(new e(g10.a("FIREBASE_CRASHLYTICS_REPORT", b0.class, b10, eVar), iVar.b(), b0Var), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] d(b0 b0Var) {
        return f16119c.G(b0Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }

    public t4.i<p> c(p pVar, boolean z10) {
        return this.f16123a.i(pVar, z10).a();
    }
}
