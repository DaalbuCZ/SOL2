package z3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f17425a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f17426b;

        /* synthetic */ a(Object obj, t0 t0Var) {
            o.i(obj);
            this.f17426b = obj;
            this.f17425a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List list = this.f17425a;
            o.i(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f17426b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f17425a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb.append((String) this.f17425a.get(i10));
                if (i10 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
