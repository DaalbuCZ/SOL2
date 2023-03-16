package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class e implements k.f {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9088a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9089b;

    /* renamed from: c  reason: collision with root package name */
    private final d f9090c;

    /* loaded from: classes.dex */
    public static class a {
        public b a(d dVar) {
            return new b(dVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements DownloadListener, p2 {

        /* renamed from: n  reason: collision with root package name */
        private d f9091n;

        public b(d dVar) {
            this.f9091n = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            d dVar = this.f9091n;
            if (dVar != null) {
                dVar.h(this, f.f9096a);
            }
            this.f9091n = null;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            d dVar = this.f9091n;
            if (dVar != null) {
                dVar.j(this, str, str2, str3, str4, j10, g.f9102a);
            }
        }
    }

    public e(i2 i2Var, a aVar, d dVar) {
        this.f9088a = i2Var;
        this.f9089b = aVar;
        this.f9090c = dVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.f
    public void a(Long l10) {
        this.f9088a.b(this.f9089b.a(this.f9090c), l10.longValue());
    }
}
