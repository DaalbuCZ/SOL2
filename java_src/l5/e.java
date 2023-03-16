package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements k5.h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ e f11125a = new e();

    private /* synthetic */ e() {
    }

    @Override // k5.h
    public final Object a(k5.e eVar) {
        ScheduledExecutorService m10;
        m10 = ExecutorsRegistrar.m(eVar);
        return m10;
    }
}
