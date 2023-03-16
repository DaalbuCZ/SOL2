package v4;
/* loaded from: classes.dex */
public abstract class t implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    private final t4.j f15679n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t() {
        this.f15679n = null;
    }

    public t(t4.j jVar) {
        this.f15679n = jVar;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final t4.j b() {
        return this.f15679n;
    }

    public final void c(Exception exc) {
        t4.j jVar = this.f15679n;
        if (jVar != null) {
            jVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }
}
