package y5;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f17026a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17027b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f17028c;

    /* renamed from: d  reason: collision with root package name */
    public final e f17029d;

    public e(Throwable th, d dVar) {
        this.f17026a = th.getLocalizedMessage();
        this.f17027b = th.getClass().getName();
        this.f17028c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f17029d = cause != null ? new e(cause, dVar) : null;
    }
}
