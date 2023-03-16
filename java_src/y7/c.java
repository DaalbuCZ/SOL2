package y7;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.c;
import y7.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c implements l8.c, y7.f {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f17058a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, f> f17059b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<b>> f17060c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f17061d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f17062e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, c.b> f17063f;

    /* renamed from: g  reason: collision with root package name */
    private int f17064g;

    /* renamed from: h  reason: collision with root package name */
    private final d f17065h;

    /* renamed from: i  reason: collision with root package name */
    private WeakHashMap<c.InterfaceC0159c, d> f17066i;

    /* renamed from: j  reason: collision with root package name */
    private i f17067j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f17068a;

        /* renamed from: b  reason: collision with root package name */
        int f17069b;

        /* renamed from: c  reason: collision with root package name */
        long f17070c;

        b(ByteBuffer byteBuffer, int i10, long j10) {
            this.f17068a = byteBuffer;
            this.f17069b = i10;
            this.f17070c = j10;
        }
    }

    /* renamed from: y7.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0245c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f17071a;

        C0245c(ExecutorService executorService) {
            this.f17071a = executorService;
        }

        @Override // y7.c.d
        public void a(Runnable runnable) {
            this.f17071a.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        void a(Runnable runnable);
    }

    /* loaded from: classes.dex */
    private static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        ExecutorService f17072a = x7.a.e().b();

        e() {
        }

        @Override // y7.c.i
        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f17072a) : new C0245c(this.f17072a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f17073a;

        /* renamed from: b  reason: collision with root package name */
        public final d f17074b;

        f(c.a aVar, d dVar) {
            this.f17073a = aVar;
            this.f17074b = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final FlutterJNI f17075a;

        /* renamed from: b  reason: collision with root package name */
        private final int f17076b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f17077c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i10) {
            this.f17075a = flutterJNI;
            this.f17076b = i10;
        }

        @Override // l8.c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f17077c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f17075a.invokePlatformMessageEmptyResponseCallback(this.f17076b);
            } else {
                this.f17075a.invokePlatformMessageResponseCallback(this.f17076b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f17078a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f17079b = new ConcurrentLinkedQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f17080c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f17078a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void f() {
            if (this.f17080c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f17079b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f17080c.set(false);
                    if (!this.f17079b.isEmpty()) {
                        this.f17078a.execute(new Runnable() { // from class: y7.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.h.this.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // y7.c.d
        public void a(Runnable runnable) {
            this.f17079b.add(runnable);
            this.f17078a.execute(new Runnable() { // from class: y7.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface i {
        d a(c.d dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j implements c.InterfaceC0159c {
        private j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f17059b = new HashMap();
        this.f17060c = new HashMap();
        this.f17061d = new Object();
        this.f17062e = new AtomicBoolean(false);
        this.f17063f = new HashMap();
        this.f17064g = 1;
        this.f17065h = new y7.g();
        this.f17066i = new WeakHashMap<>();
        this.f17058a = flutterJNI;
        this.f17067j = iVar;
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i10, final long j10) {
        d dVar = fVar != null ? fVar.f17074b : null;
        w8.e.b("PlatformChannel ScheduleHandler on " + str, i10);
        Runnable runnable = new Runnable() { // from class: y7.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.m(str, i10, fVar, byteBuffer, j10);
            }
        };
        if (dVar == null) {
            dVar = this.f17065h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i10) {
        if (fVar != null) {
            try {
                x7.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f17073a.a(byteBuffer, new g(this.f17058a, i10));
                return;
            } catch (Error e10) {
                k(e10);
                return;
            } catch (Exception e11) {
                x7.b.c("DartMessenger", "Uncaught exception in binary message listener", e11);
            }
        } else {
            x7.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f17058a.invokePlatformMessageEmptyResponseCallback(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i10, f fVar, ByteBuffer byteBuffer, long j10) {
        w8.e.e("PlatformChannel ScheduleHandler on " + str, i10);
        w8.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i10);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f17058a.cleanupMessageData(j10);
            w8.e.d();
        }
    }

    @Override // l8.c
    public c.InterfaceC0159c a(c.d dVar) {
        d a10 = this.f17067j.a(dVar);
        j jVar = new j();
        this.f17066i.put(jVar, a10);
        return jVar;
    }

    @Override // l8.c
    public /* synthetic */ c.InterfaceC0159c b() {
        return l8.b.a(this);
    }

    @Override // l8.c
    public void c(String str, c.a aVar, c.InterfaceC0159c interfaceC0159c) {
        if (aVar == null) {
            x7.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f17061d) {
                this.f17059b.remove(str);
            }
            return;
        }
        d dVar = null;
        if (interfaceC0159c != null && (dVar = this.f17066i.get(interfaceC0159c)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        x7.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f17061d) {
            this.f17059b.put(str, new f(aVar, dVar));
            List<b> remove = this.f17060c.remove(str);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                j(str, this.f17059b.get(str), bVar.f17068a, bVar.f17069b, bVar.f17070c);
            }
        }
    }

    @Override // l8.c
    public void d(String str, ByteBuffer byteBuffer) {
        x7.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        h(str, byteBuffer, null);
    }

    @Override // y7.f
    public void e(int i10, ByteBuffer byteBuffer) {
        x7.b.f("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f17063f.remove(Integer.valueOf(i10));
        if (remove != null) {
            try {
                x7.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e10) {
                k(e10);
            } catch (Exception e11) {
                x7.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e11);
            }
        }
    }

    @Override // l8.c
    public void f(String str, c.a aVar) {
        c(str, aVar, null);
    }

    @Override // y7.f
    public void g(String str, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar;
        boolean z10;
        x7.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f17061d) {
            fVar = this.f17059b.get(str);
            z10 = this.f17062e.get() && fVar == null;
            if (z10) {
                if (!this.f17060c.containsKey(str)) {
                    this.f17060c.put(str, new LinkedList());
                }
                this.f17060c.get(str).add(new b(byteBuffer, i10, j10));
            }
        }
        if (z10) {
            return;
        }
        j(str, fVar, byteBuffer, i10, j10);
    }

    @Override // l8.c
    public void h(String str, ByteBuffer byteBuffer, c.b bVar) {
        w8.e.a("DartMessenger#send on " + str);
        try {
            x7.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i10 = this.f17064g;
            this.f17064g = i10 + 1;
            if (bVar != null) {
                this.f17063f.put(Integer.valueOf(i10), bVar);
            }
            if (byteBuffer == null) {
                this.f17058a.dispatchEmptyPlatformMessage(str, i10);
            } else {
                this.f17058a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
        } finally {
            w8.e.d();
        }
    }
}
