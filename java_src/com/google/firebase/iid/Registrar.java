package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import h6.a;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements h6.a {

        /* renamed from: a  reason: collision with root package name */
        final FirebaseInstanceId f5337a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f5337a = firebaseInstanceId;
        }

        @Override // h6.a
        public String a() {
            return this.f5337a.n();
        }

        @Override // h6.a
        public t4.i<String> b() {
            String n10 = this.f5337a.n();
            return n10 != null ? t4.l.e(n10) : this.f5337a.j().i(q.f5373a);
        }

        @Override // h6.a
        public void c(a.InterfaceC0119a interfaceC0119a) {
            this.f5337a.a(interfaceC0119a);
        }

        @Override // h6.a
        public void d(String str, String str2) {
            this.f5337a.f(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(k5.e eVar) {
        return new FirebaseInstanceId((f5.e) eVar.a(f5.e.class), eVar.f(c7.i.class), eVar.f(g6.j.class), (j6.e) eVar.a(j6.e.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ h6.a lambda$getComponents$1$Registrar(k5.e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<k5.c<?>> getComponents() {
        return Arrays.asList(k5.c.c(FirebaseInstanceId.class).b(k5.r.j(f5.e.class)).b(k5.r.i(c7.i.class)).b(k5.r.i(g6.j.class)).b(k5.r.j(j6.e.class)).f(o.f5371a).c().d(), k5.c.c(h6.a.class).b(k5.r.j(FirebaseInstanceId.class)).f(p.f5372a).d(), c7.h.b("fire-iid", "21.1.0"));
    }
}
