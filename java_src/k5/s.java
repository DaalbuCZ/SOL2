package k5;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class s extends t {

    /* renamed from: n  reason: collision with root package name */
    private final List<c<?>> f10677n;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f10677n = list;
    }
}
