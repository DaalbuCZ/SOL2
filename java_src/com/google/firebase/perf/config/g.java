package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class g extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static g f5696a;

    private g() {
    }

    public static synchronized g e() {
        g gVar;
        synchronized (g.class) {
            if (f5696a == null) {
                f5696a = new g();
            }
            gVar = f5696a;
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 70L;
    }
}
