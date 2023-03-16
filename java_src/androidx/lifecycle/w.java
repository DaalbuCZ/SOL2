package androidx.lifecycle;

import java.util.HashMap;
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, u> f2139a = new HashMap<>();

    public final void a() {
        for (u uVar : this.f2139a.values()) {
            uVar.a();
        }
        this.f2139a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final u b(String str) {
        return this.f2139a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, u uVar) {
        u put = this.f2139a.put(str, uVar);
        if (put != null) {
            put.c();
        }
    }
}
