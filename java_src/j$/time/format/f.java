package j$.time.format;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g[] f9454a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9455b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(List list, boolean z10) {
        this.f9454a = (g[]) list.toArray(new g[list.size()]);
        this.f9455b = z10;
    }

    f(g[] gVarArr, boolean z10) {
        this.f9454a = gVarArr;
        this.f9455b = z10;
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        int length = sb.length();
        if (this.f9455b) {
            vVar.g();
        }
        try {
            for (g gVar : this.f9454a) {
                if (!gVar.a(vVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (this.f9455b) {
                vVar.a();
            }
            return true;
        } finally {
            if (this.f9455b) {
                vVar.a();
            }
        }
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        if (!this.f9455b) {
            for (g gVar : this.f9454a) {
                i10 = gVar.b(sVar, charSequence, i10);
                if (i10 < 0) {
                    break;
                }
            }
            return i10;
        }
        sVar.q();
        int i11 = i10;
        for (g gVar2 : this.f9454a) {
            i11 = gVar2.b(sVar, charSequence, i11);
            if (i11 < 0) {
                sVar.e(false);
                return i10;
            }
        }
        sVar.e(true);
        return i11;
    }

    public f c(boolean z10) {
        return z10 == this.f9455b ? this : new f(this.f9454a, z10);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f9454a != null) {
            sb.append(this.f9455b ? "[" : "(");
            for (g gVar : this.f9454a) {
                sb.append(gVar);
            }
            sb.append(this.f9455b ? "]" : ")");
        }
        return sb.toString();
    }
}
