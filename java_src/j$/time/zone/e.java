package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.List;
/* loaded from: classes2.dex */
class e implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f9585a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(List list) {
        this.f9585a = list;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            g.e(new f());
            return null;
        }
        try {
            g gVar = (g) g.class.cast(Class.forName(property, true, g.class.getClassLoader()).newInstance());
            g.e(gVar);
            this.f9585a.add(gVar);
            return null;
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }
}
