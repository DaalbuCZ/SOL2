package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class n extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static n f5703a;

    private n() {
    }

    public static synchronized n e() {
        n nVar;
        synchronized (n.class) {
            if (f5703a == null) {
                f5703a = new n();
            }
            nVar = f5703a;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 100L;
    }
}
