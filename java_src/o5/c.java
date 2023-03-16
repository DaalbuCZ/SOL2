package o5;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f12145a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12146b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f12147c;

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f12149e;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12148d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f12150f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f12145a = eVar;
        this.f12146b = i10;
        this.f12147c = timeUnit;
    }

    @Override // o5.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f12148d) {
            n5.f f10 = n5.f.f();
            f10.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f12149e = new CountDownLatch(1);
            this.f12150f = false;
            this.f12145a.a(str, bundle);
            n5.f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f12149e.await(this.f12146b, this.f12147c)) {
                    this.f12150f = true;
                    n5.f.f().i("App exception callback received from Analytics listener.");
                } else {
                    n5.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                n5.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f12149e = null;
        }
    }

    @Override // o5.b
    public void i(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f12149e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
