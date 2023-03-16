package k8;

import java.util.ArrayList;
import l8.k;
import l8.s;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final l8.k f10824a;

    /* renamed from: b  reason: collision with root package name */
    private b f10825b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f10826c;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // l8.k.c
        public void onMethodCall(l8.j jVar, k.d dVar) {
            if (n.this.f10825b == null) {
                x7.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f11211a;
            Object obj = jVar.f11212b;
            x7.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                n.this.f10825b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e10) {
                dVar.b("error", e10.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public n(y7.a aVar) {
        a aVar2 = new a();
        this.f10826c = aVar2;
        l8.k kVar = new l8.k(aVar, "flutter/spellcheck", s.f11226b);
        this.f10824a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f10825b = bVar;
    }
}
