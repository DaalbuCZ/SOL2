package y7;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import l8.c;
import l8.t;
/* loaded from: classes.dex */
public class a implements l8.c {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f17036a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f17037b;

    /* renamed from: c  reason: collision with root package name */
    private final y7.c f17038c;

    /* renamed from: d  reason: collision with root package name */
    private final l8.c f17039d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17040e;

    /* renamed from: f  reason: collision with root package name */
    private String f17041f;

    /* renamed from: g  reason: collision with root package name */
    private e f17042g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f17043h;

    /* renamed from: y7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0244a implements c.a {
        C0244a() {
        }

        @Override // l8.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            a.this.f17041f = t.f11229b.b(byteBuffer);
            if (a.this.f17042g != null) {
                a.this.f17042g.a(a.this.f17041f);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f17045a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17046b;

        /* renamed from: c  reason: collision with root package name */
        public final FlutterCallbackInformation f17047c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.f17045a = assetManager;
            this.f17046b = str;
            this.f17047c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.f17046b + ", library path: " + this.f17047c.callbackLibraryPath + ", function: " + this.f17047c.callbackName + " )";
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f17048a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17049b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17050c;

        public c(String str, String str2) {
            this.f17048a = str;
            this.f17049b = null;
            this.f17050c = str2;
        }

        public c(String str, String str2, String str3) {
            this.f17048a = str;
            this.f17049b = str2;
            this.f17050c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f17048a.equals(cVar.f17048a)) {
                return this.f17050c.equals(cVar.f17050c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f17048a.hashCode() * 31) + this.f17050c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f17048a + ", function: " + this.f17050c + " )";
        }
    }

    /* loaded from: classes.dex */
    private static class d implements l8.c {

        /* renamed from: a  reason: collision with root package name */
        private final y7.c f17051a;

        private d(y7.c cVar) {
            this.f17051a = cVar;
        }

        /* synthetic */ d(y7.c cVar, C0244a c0244a) {
            this(cVar);
        }

        @Override // l8.c
        public c.InterfaceC0159c a(c.d dVar) {
            return this.f17051a.a(dVar);
        }

        @Override // l8.c
        public /* synthetic */ c.InterfaceC0159c b() {
            return l8.b.a(this);
        }

        @Override // l8.c
        public void c(String str, c.a aVar, c.InterfaceC0159c interfaceC0159c) {
            this.f17051a.c(str, aVar, interfaceC0159c);
        }

        @Override // l8.c
        public void d(String str, ByteBuffer byteBuffer) {
            this.f17051a.h(str, byteBuffer, null);
        }

        @Override // l8.c
        public void f(String str, c.a aVar) {
            this.f17051a.f(str, aVar);
        }

        @Override // l8.c
        public void h(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f17051a.h(str, byteBuffer, bVar);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f17040e = false;
        C0244a c0244a = new C0244a();
        this.f17043h = c0244a;
        this.f17036a = flutterJNI;
        this.f17037b = assetManager;
        y7.c cVar = new y7.c(flutterJNI);
        this.f17038c = cVar;
        cVar.f("flutter/isolate", c0244a);
        this.f17039d = new d(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f17040e = true;
        }
    }

    @Override // l8.c
    @Deprecated
    public c.InterfaceC0159c a(c.d dVar) {
        return this.f17039d.a(dVar);
    }

    @Override // l8.c
    public /* synthetic */ c.InterfaceC0159c b() {
        return l8.b.a(this);
    }

    @Override // l8.c
    @Deprecated
    public void c(String str, c.a aVar, c.InterfaceC0159c interfaceC0159c) {
        this.f17039d.c(str, aVar, interfaceC0159c);
    }

    @Override // l8.c
    @Deprecated
    public void d(String str, ByteBuffer byteBuffer) {
        this.f17039d.d(str, byteBuffer);
    }

    @Override // l8.c
    @Deprecated
    public void f(String str, c.a aVar) {
        this.f17039d.f(str, aVar);
    }

    @Override // l8.c
    @Deprecated
    public void h(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f17039d.h(str, byteBuffer, bVar);
    }

    public void j(b bVar) {
        if (this.f17040e) {
            x7.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        w8.e.a("DartExecutor#executeDartCallback");
        try {
            x7.b.f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.f17036a;
            String str = bVar.f17046b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.f17047c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.f17045a, null);
            this.f17040e = true;
        } finally {
            w8.e.d();
        }
    }

    public void k(c cVar, List<String> list) {
        if (this.f17040e) {
            x7.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        w8.e.a("DartExecutor#executeDartEntrypoint");
        try {
            x7.b.f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.f17036a.runBundleAndSnapshotFromLibrary(cVar.f17048a, cVar.f17050c, cVar.f17049b, this.f17037b, list);
            this.f17040e = true;
        } finally {
            w8.e.d();
        }
    }

    public l8.c l() {
        return this.f17039d;
    }

    public String m() {
        return this.f17041f;
    }

    public boolean n() {
        return this.f17040e;
    }

    public void o() {
        if (this.f17036a.isAttached()) {
            this.f17036a.notifyLowMemoryWarning();
        }
    }

    public void p() {
        x7.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f17036a.setPlatformMessageHandler(this.f17038c);
    }

    public void q() {
        x7.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f17036a.setPlatformMessageHandler(null);
    }
}
