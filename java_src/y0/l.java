package y0;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/* loaded from: classes.dex */
public class l implements r<k3> {

    /* renamed from: a  reason: collision with root package name */
    private final p f16560a;

    public l(p pVar) {
        this.f16560a = pVar;
    }

    @Override // y0.r
    /* renamed from: b */
    public void a(k3 k3Var, File file) {
        String b10 = this.f16560a.b(k3Var);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(b10);
            fileWriter.close();
        } catch (IOException e10) {
            i0.c(e10);
        }
    }
}
