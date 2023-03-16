package y0;

import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class g1 implements p1<k3> {

    /* renamed from: a  reason: collision with root package name */
    private final p f16530a;

    public g1(p pVar) {
        this.f16530a = pVar;
    }

    @Override // y0.p1
    /* renamed from: a */
    public k3 b(File file) {
        try {
            return this.f16530a.a(r0.a(file));
        } catch (IOException unused) {
            return null;
        }
    }
}
