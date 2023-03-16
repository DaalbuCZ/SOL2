package p3;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p3.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 implements n {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f12273b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f12274a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements n.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f12275a;

        /* renamed from: b  reason: collision with root package name */
        private g0 f12276b;

        private b() {
        }

        private void b() {
            this.f12275a = null;
            this.f12276b = null;
            g0.n(this);
        }

        @Override // p3.n.a
        public void a() {
            ((Message) p3.a.e(this.f12275a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) p3.a.e(this.f12275a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f12275a = message;
            this.f12276b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f12274a = handler;
    }

    private static b m() {
        b bVar;
        List<b> list = f12273b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f12273b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // p3.n
    public boolean a(n.a aVar) {
        return ((b) aVar).c(this.f12274a);
    }

    @Override // p3.n
    public boolean b(int i10) {
        return this.f12274a.hasMessages(i10);
    }

    @Override // p3.n
    public n.a c(int i10, int i11, int i12) {
        return m().d(this.f12274a.obtainMessage(i10, i11, i12), this);
    }

    @Override // p3.n
    public boolean d(int i10) {
        return this.f12274a.sendEmptyMessage(i10);
    }

    @Override // p3.n
    public n.a e(int i10, int i11, int i12, Object obj) {
        return m().d(this.f12274a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // p3.n
    public boolean f(int i10, long j10) {
        return this.f12274a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // p3.n
    public void g(int i10) {
        this.f12274a.removeMessages(i10);
    }

    @Override // p3.n
    public n.a h(int i10, Object obj) {
        return m().d(this.f12274a.obtainMessage(i10, obj), this);
    }

    @Override // p3.n
    public void i(Object obj) {
        this.f12274a.removeCallbacksAndMessages(obj);
    }

    @Override // p3.n
    public boolean j(Runnable runnable) {
        return this.f12274a.post(runnable);
    }

    @Override // p3.n
    public n.a k(int i10) {
        return m().d(this.f12274a.obtainMessage(i10), this);
    }
}
