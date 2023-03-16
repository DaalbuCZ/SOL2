package q5;

import com.google.auto.value.AutoValue;
import java.io.File;
@AutoValue
/* loaded from: classes.dex */
public abstract class p {
    public static p a(s5.b0 b0Var, String str, File file) {
        return new b(b0Var, str, file);
    }

    public abstract s5.b0 b();

    public abstract File c();

    public abstract String d();
}
