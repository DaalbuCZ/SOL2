package i0;

import j9.l;
import k9.k;
/* loaded from: classes.dex */
public abstract class f<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8214a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        public static /* synthetic */ f b(a aVar, Object obj, String str, b bVar, e eVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                bVar = c.f8205a.a();
            }
            if ((i10 & 4) != 0) {
                eVar = i0.a.f8200a;
            }
            return aVar.a(obj, str, bVar, eVar);
        }

        public final <T> f<T> a(T t10, String str, b bVar, e eVar) {
            k.e(t10, "<this>");
            k.e(str, "tag");
            k.e(bVar, "verificationMode");
            k.e(eVar, "logger");
            return new g(t10, str, bVar, eVar);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    public abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Object obj, String str) {
        k.e(obj, "value");
        k.e(str, "message");
        return str + " value: " + obj;
    }

    public abstract f<T> c(String str, l<? super T, Boolean> lVar);
}
