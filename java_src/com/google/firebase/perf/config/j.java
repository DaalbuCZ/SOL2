package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class j extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static j f5699a;

    private j() {
    }

    public static synchronized j e() {
        j jVar;
        synchronized (j.class) {
            if (f5699a == null) {
                f5699a = new j();
            }
            jVar = f5699a;
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 600L;
    }
}
