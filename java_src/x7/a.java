package x7;

import a8.f;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f16394e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f16395f;

    /* renamed from: a  reason: collision with root package name */
    private f f16396a;

    /* renamed from: b  reason: collision with root package name */
    private z7.a f16397b;

    /* renamed from: c  reason: collision with root package name */
    private FlutterJNI.c f16398c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f16399d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private f f16400a;

        /* renamed from: b  reason: collision with root package name */
        private z7.a f16401b;

        /* renamed from: c  reason: collision with root package name */
        private FlutterJNI.c f16402c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f16403d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x7.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ThreadFactoryC0239a implements ThreadFactory {

            /* renamed from: a  reason: collision with root package name */
            private int f16404a;

            private ThreadFactoryC0239a() {
                this.f16404a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i10 = this.f16404a;
                this.f16404a = i10 + 1;
                sb.append(i10);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f16402c == null) {
                this.f16402c = new FlutterJNI.c();
            }
            if (this.f16403d == null) {
                this.f16403d = Executors.newCachedThreadPool(new ThreadFactoryC0239a());
            }
            if (this.f16400a == null) {
                this.f16400a = new f(this.f16402c.a(), this.f16403d);
            }
        }

        public a a() {
            b();
            return new a(this.f16400a, this.f16401b, this.f16402c, this.f16403d);
        }
    }

    private a(f fVar, z7.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f16396a = fVar;
        this.f16397b = aVar;
        this.f16398c = cVar;
        this.f16399d = executorService;
    }

    public static a e() {
        f16395f = true;
        if (f16394e == null) {
            f16394e = new b().a();
        }
        return f16394e;
    }

    public z7.a a() {
        return this.f16397b;
    }

    public ExecutorService b() {
        return this.f16399d;
    }

    public f c() {
        return this.f16396a;
    }

    public FlutterJNI.c d() {
        return this.f16398c;
    }
}
