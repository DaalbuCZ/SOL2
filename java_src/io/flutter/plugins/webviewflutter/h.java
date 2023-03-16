package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import c8.a;
/* loaded from: classes.dex */
abstract class h {

    /* renamed from: a  reason: collision with root package name */
    final AssetManager f9111a;

    /* loaded from: classes.dex */
    static class a extends h {

        /* renamed from: b  reason: collision with root package name */
        final a.InterfaceC0073a f9112b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(AssetManager assetManager, a.InterfaceC0073a interfaceC0073a) {
            super(assetManager);
            this.f9112b = interfaceC0073a;
        }

        @Override // io.flutter.plugins.webviewflutter.h
        public String a(String str) {
            return this.f9112b.a(str);
        }
    }

    public h(AssetManager assetManager) {
        this.f9111a = assetManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String a(String str);

    public String[] b(String str) {
        return this.f9111a.list(str);
    }
}
