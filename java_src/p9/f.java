package p9;

import java.util.Iterator;
import k9.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    /* loaded from: classes.dex */
    public static final class a implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f12506a;

        public a(Iterator it) {
            this.f12506a = it;
        }

        @Override // p9.b
        public Iterator<T> iterator() {
            return this.f12506a;
        }
    }

    public static <T> b<T> a(Iterator<? extends T> it) {
        k.e(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> b<T> b(b<? extends T> bVar) {
        k.e(bVar, "<this>");
        return bVar instanceof p9.a ? bVar : new p9.a(bVar);
    }
}
