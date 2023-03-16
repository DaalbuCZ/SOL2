package c7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f3228b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f3229a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f3228b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f3228b;
                if (dVar == null) {
                    dVar = new d();
                    f3228b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f3229a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f3229a);
        }
        return unmodifiableSet;
    }
}
