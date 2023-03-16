package v4;

import java.util.Objects;
/* loaded from: classes.dex */
public final class f {
    public static Object a(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
