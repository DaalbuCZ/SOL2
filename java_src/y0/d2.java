package y0;

import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class d2 implements p1<z1> {

    /* renamed from: a  reason: collision with root package name */
    private n<z1, String> f16504a;

    public d2(n<z1, String> nVar) {
        this.f16504a = nVar;
    }

    @Override // y0.p1
    /* renamed from: a */
    public z1 b(File file) {
        try {
            return this.f16504a.a(r0.a(file));
        } catch (IOException unused) {
            return null;
        }
    }
}
