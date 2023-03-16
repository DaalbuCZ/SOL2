package x3;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
@Deprecated
/* loaded from: classes.dex */
public abstract class f {
    @GuardedBy("sAllClients")

    /* renamed from: a  reason: collision with root package name */
    private static final Set<f> f16333a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends y3.c {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends y3.h {
    }
}
