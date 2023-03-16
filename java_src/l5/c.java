package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements i6.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ c f11123a = new c();

    private /* synthetic */ c() {
    }

    @Override // i6.b
    public final Object get() {
        ScheduledExecutorService q10;
        q10 = ExecutorsRegistrar.q();
        return q10;
    }
}
