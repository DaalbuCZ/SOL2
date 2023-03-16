package r9;
/* loaded from: classes.dex */
public final class a2 extends kotlinx.coroutines.internal.p implements k1 {
    public final String C(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z10 = true;
        for (kotlinx.coroutines.internal.r rVar = (kotlinx.coroutines.internal.r) s(); !k9.k.a(rVar, this); rVar = rVar.t()) {
            if (rVar instanceof v1) {
                v1 v1Var = (v1) rVar;
                if (z10) {
                    z10 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(v1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        k9.k.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // r9.k1
    public boolean a() {
        return true;
    }

    @Override // r9.k1
    public a2 i() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.r
    public String toString() {
        return n0.c() ? C("Active") : super.toString();
    }
}
