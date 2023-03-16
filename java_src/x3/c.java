package x3;

import android.text.TextUtils;
import java.util.ArrayList;
import z3.o;
/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: n  reason: collision with root package name */
    private final m.a<y3.b<?>, w3.b> f16317n;

    public c(m.a<y3.b<?>, w3.b> aVar) {
        this.f16317n = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (y3.b<?> bVar : this.f16317n.keySet()) {
            w3.b bVar2 = (w3.b) o.i(this.f16317n.get(bVar));
            z10 &= !bVar2.C();
            String b10 = bVar.b();
            String valueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(b10).length() + 2 + valueOf.length());
            sb.append(b10);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z10 ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
