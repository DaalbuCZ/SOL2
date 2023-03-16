package n8;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import c.j;
import j$.util.Map;
import java.util.HashMap;
import k8.g;
@TargetApi(j.f3076u3)
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Integer> f11798c;

    /* renamed from: a  reason: collision with root package name */
    private final c f11799a;

    /* renamed from: b  reason: collision with root package name */
    private final g f11800b;

    /* renamed from: n8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0172a implements g.b {
        C0172a() {
        }

        @Override // k8.g.b
        public void a(String str) {
            a.this.f11799a.setPointerIcon(a.this.d(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends HashMap<String, Integer> {
        b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        PointerIcon b(int i10);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public a(c cVar, g gVar) {
        this.f11799a = cVar;
        this.f11800b = gVar;
        gVar.b(new C0172a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon d(String str) {
        if (f11798c == null) {
            f11798c = new b();
        }
        return this.f11799a.b(((Integer) Map.EL.getOrDefault(f11798c, str, 1000)).intValue());
    }

    public void c() {
        this.f11800b.b(null);
    }
}
