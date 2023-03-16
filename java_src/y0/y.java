package y0;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f16768a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16769b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16770c;

    /* renamed from: e  reason: collision with root package name */
    private int f16772e;

    /* renamed from: f  reason: collision with root package name */
    private final c f16773f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16771d = true;

    /* renamed from: g  reason: collision with root package name */
    private final b f16774g = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private float f16775a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f16776b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f16777c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f16778d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                long maxMemory = Runtime.getRuntime().maxMemory();
                b.this.f16775a = (1.0f - (((float) Runtime.getRuntime().totalMemory()) / ((float) maxMemory))) * 100.0f;
                b.this.f16776b.postDelayed(b.this.f16777c, TimeUnit.SECONDS.toMillis(1L));
            }
        }

        private b() {
            this.f16775a = 100.0f;
            this.f16776b = new Handler();
            this.f16777c = new a();
            this.f16778d = false;
        }

        float a() {
            return this.f16775a;
        }

        void e() {
            if (this.f16778d) {
                return;
            }
            this.f16778d = true;
            this.f16777c.run();
        }

        void f() {
            if (this.f16778d) {
                this.f16776b.removeCallbacksAndMessages(null);
                this.f16778d = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(ThreadPoolExecutor threadPoolExecutor, boolean z10);
    }

    public y(ThreadPoolExecutor threadPoolExecutor, int i10, int i11, c cVar) {
        this.f16768a = threadPoolExecutor;
        this.f16769b = i10;
        this.f16770c = i11;
        this.f16773f = cVar;
    }

    private float a() {
        this.f16774g.e();
        return this.f16774g.a();
    }

    private void d() {
        c cVar;
        ThreadPoolExecutor threadPoolExecutor;
        int size = this.f16768a.getQueue().size();
        boolean z10 = true;
        if (this.f16771d && size >= this.f16769b && a() < this.f16770c) {
            this.f16772e = size;
            this.f16771d = false;
            cVar = this.f16773f;
            if (cVar == null) {
                return;
            }
            threadPoolExecutor = this.f16768a;
        } else if (this.f16771d || size >= this.f16772e / 2) {
            return;
        } else {
            this.f16771d = true;
            this.f16774g.f();
            cVar = this.f16773f;
            if (cVar == null) {
                return;
            }
            threadPoolExecutor = this.f16768a;
            z10 = true ^ this.f16771d;
        }
        cVar.a(threadPoolExecutor, z10);
    }

    public synchronized <T> Future<T> b(Callable<T> callable) {
        d();
        if (this.f16771d) {
            return this.f16768a.submit(callable);
        }
        return null;
    }

    public void c() {
        ThreadPoolExecutor threadPoolExecutor = this.f16768a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
