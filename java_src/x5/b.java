package x5;

import org.json.JSONObject;
import q5.r;
import x5.d;
/* loaded from: classes.dex */
class b implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(r rVar) {
        return new d(rVar.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // x5.h
    public d a(r rVar, JSONObject jSONObject) {
        return b(rVar);
    }
}
