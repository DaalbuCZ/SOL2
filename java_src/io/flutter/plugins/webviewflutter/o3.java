package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import c8.a;
import io.flutter.plugins.webviewflutter.e;
import io.flutter.plugins.webviewflutter.h;
import io.flutter.plugins.webviewflutter.o2;
import io.flutter.plugins.webviewflutter.q3;
import io.flutter.plugins.webviewflutter.s2;
import io.flutter.plugins.webviewflutter.v2;
import io.flutter.plugins.webviewflutter.w2;
import io.flutter.plugins.webviewflutter.y2;
/* loaded from: classes.dex */
public class o3 implements c8.a, d8.a {

    /* renamed from: n  reason: collision with root package name */
    private i2 f9202n;

    /* renamed from: o  reason: collision with root package name */
    private a.b f9203o;

    /* renamed from: p  reason: collision with root package name */
    private q3 f9204p;

    /* renamed from: q  reason: collision with root package name */
    private o2 f9205q;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(long j10) {
    }

    private void c(l8.c cVar, io.flutter.plugin.platform.h hVar, Context context, View view, h hVar2) {
        i2 i10 = i2.i(n3.f9194a);
        this.f9202n = i10;
        hVar.a("plugins.flutter.io/webview", new j(i10));
        this.f9204p = new q3(this.f9202n, new q3.d(), context, view);
        this.f9205q = new o2(this.f9202n, new o2.a(), new n2(cVar, this.f9202n), new Handler(context.getMainLooper()));
        f2.d0(cVar, this.f9204p);
        y.d(cVar, this.f9205q);
        d1.d(cVar, new y2(this.f9202n, new y2.c(), new x2(cVar, this.f9202n)));
        c0.d(cVar, new s2(this.f9202n, new s2.a(), new r2(cVar, this.f9202n)));
        r.d(cVar, new e(this.f9202n, new e.a(), new d(cVar, this.f9202n)));
        r0.D(cVar, new v2(this.f9202n, new v2.a()));
        u.f(cVar, new i(hVar2));
        n.f(cVar, new b());
        u0.f(cVar, new w2(this.f9202n, new w2.a()));
    }

    private void d(Context context) {
        this.f9204p.B(context);
        this.f9205q.b(new Handler(context.getMainLooper()));
    }

    @Override // d8.a
    public void onAttachedToActivity(d8.c cVar) {
        d(cVar.e());
    }

    @Override // c8.a
    public void onAttachedToEngine(a.b bVar) {
        this.f9203o = bVar;
        c(bVar.b(), bVar.d(), bVar.a(), null, new h.a(bVar.a().getAssets(), bVar.c()));
    }

    @Override // d8.a
    public void onDetachedFromActivity() {
        d(this.f9203o.a());
    }

    @Override // d8.a
    public void onDetachedFromActivityForConfigChanges() {
        d(this.f9203o.a());
    }

    @Override // c8.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f9202n.e();
    }

    @Override // d8.a
    public void onReattachedToActivityForConfigChanges(d8.c cVar) {
        d(cVar.e());
    }
}
