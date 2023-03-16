package a0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f1e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final File f2a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f3b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f5d;

    public a(String str, File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f2a = file2;
        this.f3b = a(file2.getAbsolutePath());
        this.f4c = z10;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f1e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f3b.lock();
        if (this.f4c) {
            try {
                FileChannel channel = new FileOutputStream(this.f2a).getChannel();
                this.f5d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f5d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f3b.unlock();
    }
}
