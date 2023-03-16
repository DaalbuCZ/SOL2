package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class r extends v<Float> {

    /* renamed from: a  reason: collision with root package name */
    private static r f5707a;

    private r() {
    }

    public static synchronized r e() {
        r rVar;
        synchronized (r.class) {
            if (f5707a == null) {
                f5707a = new r();
            }
            rVar = f5707a;
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "sessions_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float d() {
        return Float.valueOf(0.01f);
    }
}
