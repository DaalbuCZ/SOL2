package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class t extends v<Long> {

    /* renamed from: a  reason: collision with root package name */
    private static t f5709a;

    private t() {
    }

    public static synchronized t e() {
        t tVar;
        synchronized (t.class) {
            if (f5709a == null) {
                f5709a = new t();
            }
            tVar = f5709a;
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long d() {
        return 300L;
    }
}
