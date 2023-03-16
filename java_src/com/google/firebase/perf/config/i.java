package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class i extends v<Float> {

    /* renamed from: a  reason: collision with root package name */
    private static i f5698a;

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized i e() {
        i iVar;
        synchronized (i.class) {
            if (f5698a == null) {
                f5698a = new i();
            }
            iVar = f5698a;
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Float d() {
        return Float.valueOf(1.0f);
    }
}
