package c8;

import android.content.Context;
import io.flutter.plugin.platform.h;
import io.flutter.view.d;
import l8.c;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: c8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0073a {
        String a(String str);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3232a;

        /* renamed from: b  reason: collision with root package name */
        private final io.flutter.embedding.engine.a f3233b;

        /* renamed from: c  reason: collision with root package name */
        private final c f3234c;

        /* renamed from: d  reason: collision with root package name */
        private final d f3235d;

        /* renamed from: e  reason: collision with root package name */
        private final h f3236e;

        /* renamed from: f  reason: collision with root package name */
        private final InterfaceC0073a f3237f;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, d dVar, h hVar, InterfaceC0073a interfaceC0073a) {
            this.f3232a = context;
            this.f3233b = aVar;
            this.f3234c = cVar;
            this.f3235d = dVar;
            this.f3236e = hVar;
            this.f3237f = interfaceC0073a;
        }

        public Context a() {
            return this.f3232a;
        }

        public c b() {
            return this.f3234c;
        }

        public InterfaceC0073a c() {
            return this.f3237f;
        }

        public h d() {
            return this.f3236e;
        }

        public d e() {
            return this.f3235d;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
