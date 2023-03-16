package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f5274e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f5275a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f5276b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5277c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f5278d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i10, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f5276b = str;
        this.f5277c = i10;
        this.f5278d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f5277c);
        StrictMode.ThreadPolicy threadPolicy = this.f5278d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f5274e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f5276b, Long.valueOf(this.f5275a.getAndIncrement())));
        return newThread;
    }
}
