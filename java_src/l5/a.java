package l5;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements i6.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f11121a = new a();

    private /* synthetic */ a() {
    }

    @Override // i6.b
    public final Object get() {
        ScheduledExecutorService s10;
        s10 = ExecutorsRegistrar.s();
        return s10;
    }
}
