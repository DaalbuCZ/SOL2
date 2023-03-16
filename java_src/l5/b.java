package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements i6.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f11122a = new b();

    private /* synthetic */ b() {
    }

    @Override // i6.b
    public final Object get() {
        ScheduledExecutorService r10;
        r10 = ExecutorsRegistrar.r();
        return r10;
    }
}
