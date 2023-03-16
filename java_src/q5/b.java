package q5;

import java.io.File;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: a  reason: collision with root package name */
    private final s5.b0 f12724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12725b;

    /* renamed from: c  reason: collision with root package name */
    private final File f12726c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(s5.b0 b0Var, String str, File file) {
        Objects.requireNonNull(b0Var, "Null report");
        this.f12724a = b0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f12725b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f12726c = file;
    }

    @Override // q5.p
    public s5.b0 b() {
        return this.f12724a;
    }

    @Override // q5.p
    public File c() {
        return this.f12726c;
    }

    @Override // q5.p
    public String d() {
        return this.f12725b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f12724a.equals(pVar.b()) && this.f12725b.equals(pVar.d()) && this.f12726c.equals(pVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12724a.hashCode() ^ 1000003) * 1000003) ^ this.f12725b.hashCode()) * 1000003) ^ this.f12726c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f12724a + ", sessionId=" + this.f12725b + ", reportFile=" + this.f12726c + "}";
    }
}
