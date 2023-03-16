package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class o2 implements k.l {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9198a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9199b;

    /* renamed from: c  reason: collision with root package name */
    private final n2 f9200c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f9201d;

    /* loaded from: classes.dex */
    public static class a {
        public m2 a(n2 n2Var, String str, Handler handler) {
            return new m2(n2Var, str, handler);
        }
    }

    public o2(i2 i2Var, a aVar, n2 n2Var, Handler handler) {
        this.f9198a = i2Var;
        this.f9199b = aVar;
        this.f9200c = n2Var;
        this.f9201d = handler;
    }

    @Override // io.flutter.plugins.webviewflutter.k.l
    public void a(Long l10, String str) {
        this.f9198a.b(this.f9199b.a(this.f9200c, str, this.f9201d), l10.longValue());
    }

    public void b(Handler handler) {
        this.f9201d = handler;
    }
}
