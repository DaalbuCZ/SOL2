package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class d extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static d f5692a;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized d e() {
        d dVar;
        synchronized (d.class) {
            if (f5692a == null) {
                f5692a = new d();
            }
            dVar = f5692a;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
