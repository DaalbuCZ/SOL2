package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: s  reason: collision with root package name */
    c<ListenableWorker.a> f2519s;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f2519s.p(Worker.this.q());
            } catch (Throwable th) {
                Worker.this.f2519s.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    public final e5.a<ListenableWorker.a> o() {
        this.f2519s = c.t();
        b().execute(new a());
        return this.f2519s;
    }

    public abstract ListenableWorker.a q();
}
