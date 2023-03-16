package q5;

import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f12848a;

    /* renamed from: b  reason: collision with root package name */
    private final v5.f f12849b;

    public n(String str, v5.f fVar) {
        this.f12848a = str;
        this.f12849b = fVar;
    }

    private File b() {
        return this.f12849b.e(this.f12848a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            n5.f f10 = n5.f.f();
            f10.e("Error creating marker: " + this.f12848a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
