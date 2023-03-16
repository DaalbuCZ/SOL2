package w3;

import android.util.Log;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: e  reason: collision with root package name */
    private static final j0 f16093e = new j0(true, 3, 1, null, null);

    /* renamed from: a  reason: collision with root package name */
    final boolean f16094a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    final String f16095b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    final Throwable f16096c;

    /* renamed from: d  reason: collision with root package name */
    final int f16097d;

    private j0(boolean z10, int i10, int i11, @Nullable String str, @Nullable Throwable th) {
        this.f16094a = z10;
        this.f16097d = i10;
        this.f16095b = str;
        this.f16096c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static j0 b() {
        return f16093e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 c(String str) {
        return new j0(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 d(String str, Throwable th) {
        return new j0(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 f(int i10) {
        return new j0(true, i10, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j0 g(int i10, int i11, String str, @Nullable Throwable th) {
        return new j0(false, i10, i11, str, th);
    }

    @Nullable
    String a() {
        return this.f16095b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.f16094a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f16096c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f16096c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
