package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements i6.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f11124a = new d();

    private /* synthetic */ d() {
    }

    @Override // i6.b
    public final Object get() {
        ScheduledExecutorService p10;
        p10 = ExecutorsRegistrar.p();
        return p10;
    }
}
