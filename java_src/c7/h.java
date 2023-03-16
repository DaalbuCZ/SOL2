package c7;

import android.content.Context;
import k5.r;
/* loaded from: classes.dex */
public class h {

    /* loaded from: classes.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static k5.c<?> b(String str, String str2) {
        return k5.c.l(f.a(str, str2), f.class);
    }

    public static k5.c<?> c(final String str, final a<Context> aVar) {
        return k5.c.m(f.class).b(r.j(Context.class)).f(new k5.h() { // from class: c7.g
            @Override // k5.h
            public final Object a(k5.e eVar) {
                f d10;
                d10 = h.d(str, aVar, eVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, k5.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
