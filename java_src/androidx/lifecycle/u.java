package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f2135a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f2136b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f2136b = true;
        Map<String, Object> map = this.f2135a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f2135a.values()) {
                    b(obj);
                }
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
    }
}
