package a7;
/* loaded from: classes.dex */
public enum c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");
    

    /* renamed from: n  reason: collision with root package name */
    private String f231n;

    c(String str) {
        this.f231n = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f231n;
    }
}
