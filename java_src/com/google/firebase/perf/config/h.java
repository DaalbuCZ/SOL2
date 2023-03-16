package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class h extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static h f5697a;

    private h() {
    }

    public static synchronized h e() {
        h hVar;
        synchronized (h.class) {
            if (f5697a == null) {
                f5697a = new h();
            }
            hVar = f5697a;
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 700L;
    }
}
