package v9;

import b9.g;
import j9.p;
import k9.l;
import kotlinx.coroutines.internal.c0;
import r9.p1;
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<Integer, g.b, Integer> {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ c<?> f15805o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f15805o = cVar;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b c10 = this.f15805o.f15798r.c(key);
            if (key != p1.f13154l) {
                return Integer.valueOf(bVar != c10 ? Integer.MIN_VALUE : i10 + 1);
            }
            p1 p1Var = (p1) c10;
            p1 b10 = e.b((p1) bVar, p1Var);
            if (b10 == p1Var) {
                if (p1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + p1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // j9.p
        public /* bridge */ /* synthetic */ Integer k(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.S(0, new a(cVar))).intValue() == cVar.f15799s) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f15798r + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final p1 b(p1 p1Var, p1 p1Var2) {
        while (p1Var != null) {
            if (p1Var == p1Var2 || !(p1Var instanceof c0)) {
                return p1Var;
            }
            p1Var = ((c0) p1Var).H0();
        }
        return null;
    }
}
