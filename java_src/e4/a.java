package e4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import z3.o;
/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f6767a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreadFactory f6768b = Executors.defaultThreadFactory();

    public a(String str) {
        o.j(str, "Name must not be null");
        this.f6767a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6768b.newThread(new b(runnable, 0));
        newThread.setName(this.f6767a);
        return newThread;
    }
}
