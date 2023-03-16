package a7;
/* loaded from: classes.dex */
public enum b {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");
    

    /* renamed from: n  reason: collision with root package name */
    private String f223n;

    b(String str) {
        this.f223n = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f223n;
    }
}
