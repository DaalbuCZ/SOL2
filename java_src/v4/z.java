package v4;

import android.os.IBinder;
import java.util.List;
/* loaded from: classes.dex */
final class z extends t {

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ IBinder f15686o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ c0 f15687p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(c0 c0Var, IBinder iBinder) {
        this.f15687p = c0Var;
        this.f15686o = iBinder;
    }

    @Override // v4.t
    public final void a() {
        List<Runnable> list;
        List list2;
        this.f15687p.f15647n.f15661m = k.e(this.f15686o);
        d0.n(this.f15687p.f15647n);
        this.f15687p.f15647n.f15655g = false;
        list = this.f15687p.f15647n.f15652d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f15687p.f15647n.f15652d;
        list2.clear();
    }
}
