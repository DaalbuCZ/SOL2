package com.google.firebase.perf.config;
/* loaded from: classes.dex */
public final class b extends v<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static b f5690a;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized b e() {
        b bVar;
        synchronized (b.class) {
            if (f5690a == null) {
                f5690a = new b();
            }
            bVar = f5690a;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.v
    public String b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean d() {
        return Boolean.FALSE;
    }
}
