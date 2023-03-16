package a5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    private static class b<T> implements k<T>, Serializable {

        /* renamed from: n  reason: collision with root package name */
        private final List<? extends k<? super T>> f204n;

        private b(List<? extends k<? super T>> list) {
            this.f204n = list;
        }

        @Override // a5.k
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f204n.size(); i10++) {
                if (!this.f204n.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b) {
                return this.f204n.equals(((b) obj).f204n);
            }
            return false;
        }

        public int hashCode() {
            return this.f204n.hashCode() + 306654252;
        }

        public String toString() {
            return l.d("and", this.f204n);
        }
    }

    public static <T> k<T> b(k<? super T> kVar, k<? super T> kVar2) {
        return new b(c((k) j.i(kVar), (k) j.i(kVar2)));
    }

    private static <T> List<k<? super T>> c(k<? super T> kVar, k<? super T> kVar2) {
        return Arrays.asList(kVar, kVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
