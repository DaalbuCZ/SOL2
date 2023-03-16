package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements k5.h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ h f11128a = new h();

    private /* synthetic */ h() {
    }

    @Override // k5.h
    public final Object a(k5.e eVar) {
        ScheduledExecutorService l10;
        l10 = ExecutorsRegistrar.l(eVar);
        return l10;
    }
}
