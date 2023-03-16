package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class m extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static m f5702a;

    private m() {
    }

    public static synchronized m e() {
        m mVar;
        synchronized (m.class) {
            if (f5702a == null) {
                f5702a = new m();
            }
            mVar = f5702a;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 0L;
    }
}
