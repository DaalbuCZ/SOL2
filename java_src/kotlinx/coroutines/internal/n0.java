package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
final class n0 extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f10952a = new n0();

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f10953b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, j9.l<Throwable, Throwable>> f10954c = new WeakHashMap<>();

    private n0() {
    }

    @Override // kotlinx.coroutines.internal.g
    public j9.l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        j9.l<Throwable, Throwable> b10;
        ReentrantReadWriteLock reentrantReadWriteLock = f10953b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            j9.l<Throwable, Throwable> lVar = f10954c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, j9.l<Throwable, Throwable>> weakHashMap = f10954c;
                j9.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                b10 = j.b(cls);
                weakHashMap.put(cls, b10);
                while (i10 < readHoldCount) {
                    readLock2.lock();
                    i10++;
                }
                writeLock.unlock();
                return b10;
            } finally {
                while (i10 < readHoldCount) {
                    readLock2.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
