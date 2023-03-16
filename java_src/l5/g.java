package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements k5.h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f11127a = new g();

    private /* synthetic */ g() {
    }

    @Override // k5.h
    public final Object a(k5.e eVar) {
        ScheduledExecutorService n10;
        n10 = ExecutorsRegistrar.n(eVar);
        return n10;
    }
}
