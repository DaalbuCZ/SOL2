package k8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l8.k;
import l8.s;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final l8.k f10697a;

    /* renamed from: b  reason: collision with root package name */
    private z7.a f10698b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<k.d>> f10699c;

    /* renamed from: d  reason: collision with root package name */
    final k.c f10700d;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // l8.k.c
        public void onMethodCall(l8.j jVar, k.d dVar) {
            String str;
            if (b.this.f10698b == null) {
                return;
            }
            String str2 = jVar.f11211a;
            Map map = (Map) jVar.b();
            x7.b.f("DeferredComponentChannel", "Received '" + str2 + "' message.");
            int intValue = ((Integer) map.get("loadingUnitId")).intValue();
            String str3 = (String) map.get("componentName");
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1004447972:
                    if (str2.equals("uninstallDeferredComponent")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 399701758:
                    if (str2.equals("getDeferredComponentInstallState")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 520962947:
                    if (str2.equals("installDeferredComponent")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b.this.f10698b.b(intValue, str3);
                    str = null;
                    break;
                case 1:
                    str = b.this.f10698b.a(intValue, str3);
                    break;
                case 2:
                    b.this.f10698b.f(intValue, str3);
                    if (!b.this.f10699c.containsKey(str3)) {
                        b.this.f10699c.put(str3, new ArrayList());
                    }
                    ((List) b.this.f10699c.get(str3)).add(dVar);
                    return;
                default:
                    dVar.c();
                    return;
            }
            dVar.a(str);
        }
    }

    public b(y7.a aVar) {
        a aVar2 = new a();
        this.f10700d = aVar2;
        l8.k kVar = new l8.k(aVar, "flutter/deferredcomponent", s.f11226b);
        this.f10697a = kVar;
        kVar.e(aVar2);
        this.f10698b = x7.a.e().a();
        this.f10699c = new HashMap();
    }

    public void c(z7.a aVar) {
        this.f10698b = aVar;
    }
}
