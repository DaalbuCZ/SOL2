package k8;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.c;
import java.util.HashMap;
import l8.a;
import l8.r;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final l8.a<Object> f10692a;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f10693b;

    /* renamed from: c  reason: collision with root package name */
    private b f10694c;

    /* renamed from: d  reason: collision with root package name */
    final a.d<Object> f10695d;

    /* renamed from: k8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0151a implements a.d<Object> {
        C0151a() {
        }

        @Override // l8.a.d
        public void a(Object obj, a.e<Object> eVar) {
            if (a.this.f10694c == null) {
                eVar.a(null);
                return;
            }
            HashMap hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            HashMap hashMap2 = (HashMap) hashMap.get("data");
            x7.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1140076541:
                    if (str.equals("tooltip")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -649620375:
                    if (str.equals("announce")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 114595:
                    if (str.equals("tap")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 114203431:
                    if (str.equals("longPress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f10694c.d(str2);
                        break;
                    }
                    break;
                case 1:
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f10694c.a(str3);
                        break;
                    }
                    break;
                case 2:
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f10694c.f(num.intValue());
                        break;
                    }
                    break;
                case 3:
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f10694c.e(num2.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i10);

        void f(int i10);
    }

    public a(y7.a aVar, FlutterJNI flutterJNI) {
        C0151a c0151a = new C0151a();
        this.f10695d = c0151a;
        l8.a<Object> aVar2 = new l8.a<>(aVar, "flutter/accessibility", r.f11223a);
        this.f10692a = aVar2;
        aVar2.e(c0151a);
        this.f10693b = flutterJNI;
    }

    public void b(int i10, c.g gVar) {
        this.f10693b.dispatchSemanticsAction(i10, gVar);
    }

    public void c(int i10, c.g gVar, Object obj) {
        this.f10693b.dispatchSemanticsAction(i10, gVar, obj);
    }

    public void d() {
        this.f10693b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f10693b.setSemanticsEnabled(true);
    }

    public void f(int i10) {
        this.f10693b.setAccessibilityFeatures(i10);
    }

    public void g(b bVar) {
        this.f10694c = bVar;
        this.f10693b.setAccessibilityDelegate(bVar);
    }
}
