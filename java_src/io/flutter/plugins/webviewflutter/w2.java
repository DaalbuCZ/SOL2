package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import io.flutter.plugins.webviewflutter.k;
/* loaded from: classes.dex */
public class w2 implements k.w {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f9260a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9261b;

    /* loaded from: classes.dex */
    public static class a {
        public WebStorage a() {
            return WebStorage.getInstance();
        }
    }

    public w2(i2 i2Var, a aVar) {
        this.f9260a = i2Var;
        this.f9261b = aVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.w
    public void a(Long l10) {
        this.f9260a.b(this.f9261b.a(), l10.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.w
    public void b(Long l10) {
        ((WebStorage) this.f9260a.h(l10.longValue())).deleteAllData();
    }
}
