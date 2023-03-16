package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class q extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static q f5706a;

    private q() {
    }

    public static synchronized q e() {
        q qVar;
        synchronized (q.class) {
            if (f5706a == null) {
                f5706a = new q();
            }
            qVar = f5706a;
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }
}
