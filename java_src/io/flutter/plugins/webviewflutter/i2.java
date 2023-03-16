package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class i2 {

    /* renamed from: a */
    private final WeakHashMap<Object, Long> f9120a = new WeakHashMap<>();

    /* renamed from: b */
    private final HashMap<Long, WeakReference<Object>> f9121b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<Long, Object> f9122c = new HashMap<>();

    /* renamed from: d */
    private final ReferenceQueue<Object> f9123d = new ReferenceQueue<>();

    /* renamed from: e */
    private final HashMap<WeakReference<Object>, Long> f9124e = new HashMap<>();

    /* renamed from: f */
    private final Handler f9125f;

    /* renamed from: g */
    private final a f9126g;

    /* renamed from: h */
    private long f9127h;

    /* renamed from: i */
    private boolean f9128i;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);
    }

    private i2(a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f9125f = handler;
        this.f9127h = 65536L;
        this.f9128i = false;
        this.f9126g = aVar;
        handler.postDelayed(new h2(this), 30000L);
    }

    private void c(Object obj, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Identifier must be >= 0.");
        }
        WeakReference<Object> weakReference = new WeakReference<>(obj, this.f9123d);
        this.f9120a.put(obj, Long.valueOf(j10));
        this.f9121b.put(Long.valueOf(j10), weakReference);
        this.f9124e.put(weakReference, Long.valueOf(j10));
        this.f9122c.put(Long.valueOf(j10), obj);
    }

    private void d() {
        if (this.f9128i) {
            throw new AssertionError("Manager has already been closed.");
        }
    }

    public static i2 i(a aVar) {
        return new i2(aVar);
    }

    public void j() {
        while (true) {
            WeakReference weakReference = (WeakReference) this.f9123d.poll();
            if (weakReference == null) {
                this.f9125f.postDelayed(new h2(this), 30000L);
                return;
            }
            Long remove = this.f9124e.remove(weakReference);
            if (remove != null) {
                this.f9121b.remove(remove);
                this.f9122c.remove(remove);
                this.f9126g.a(remove.longValue());
            }
        }
    }

    public void b(Object obj, long j10) {
        d();
        c(obj, j10);
    }

    public void e() {
        this.f9125f.removeCallbacks(new h2(this));
        this.f9128i = true;
    }

    public boolean f(Object obj) {
        d();
        return this.f9120a.containsKey(obj);
    }

    public Long g(Object obj) {
        d();
        Long l10 = this.f9120a.get(obj);
        if (l10 != null) {
            this.f9122c.put(l10, obj);
        }
        return l10;
    }

    public <T> T h(long j10) {
        d();
        WeakReference<Object> weakReference = this.f9121b.get(Long.valueOf(j10));
        return weakReference != null ? (T) weakReference.get() : (T) this.f9122c.get(Long.valueOf(j10));
    }

    public <T> T k(long j10) {
        d();
        return (T) this.f9122c.remove(Long.valueOf(j10));
    }
}
