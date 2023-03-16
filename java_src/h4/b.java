package h4;

import android.os.Looper;
import android.util.Log;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ClassLoader f8081a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Thread f8082b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (f8081a == null) {
                f8081a = b();
            }
            classLoader = f8081a;
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f8082b == null) {
                f8082b = c();
                if (f8082b == null) {
                    return null;
                }
            }
            synchronized (f8082b) {
                try {
                    classLoader = f8082b.getContextClassLoader();
                } catch (SecurityException e10) {
                    String message = e10.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        SecurityException e10;
        a aVar;
        a aVar2;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= activeCount) {
                            aVar2 = null;
                            break;
                        }
                        aVar2 = threadArr[i10];
                        if ("GmsDynamite".equals(aVar2.getName())) {
                            break;
                        }
                        i10++;
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    aVar = null;
                }
                if (aVar2 == null) {
                    try {
                        aVar = new a(threadGroup, "GmsDynamite");
                        try {
                            aVar.setContextClassLoader(null);
                            aVar.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            aVar2 = aVar;
                            return aVar2;
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        aVar = aVar2;
                    }
                    aVar2 = aVar;
                }
            }
            return aVar2;
        }
    }
}
