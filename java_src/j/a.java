package j;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f10197c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f10198d = new ExecutorC0140a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f10199e = new b();

    /* renamed from: a  reason: collision with root package name */
    private c f10200a;

    /* renamed from: b  reason: collision with root package name */
    private c f10201b;

    /* renamed from: j.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class ExecutorC0140a implements Executor {
        ExecutorC0140a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    private a() {
        j.b bVar = new j.b();
        this.f10201b = bVar;
        this.f10200a = bVar;
    }

    public static Executor d() {
        return f10199e;
    }

    public static a e() {
        if (f10197c != null) {
            return f10197c;
        }
        synchronized (a.class) {
            if (f10197c == null) {
                f10197c = new a();
            }
        }
        return f10197c;
    }

    @Override // j.c
    public void a(Runnable runnable) {
        this.f10200a.a(runnable);
    }

    @Override // j.c
    public boolean b() {
        return this.f10200a.b();
    }

    @Override // j.c
    public void c(Runnable runnable) {
        this.f10200a.c(runnable);
    }
}
