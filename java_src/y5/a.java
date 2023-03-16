package y5;
/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f17021a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f17022b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17023c;

    public a(int i10, d... dVarArr) {
        this.f17021a = i10;
        this.f17022b = dVarArr;
        this.f17023c = new b(i10);
    }

    @Override // y5.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        d[] dVarArr;
        if (stackTraceElementArr.length <= this.f17021a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f17022b) {
            if (stackTraceElementArr2.length <= this.f17021a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f17021a ? this.f17023c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
