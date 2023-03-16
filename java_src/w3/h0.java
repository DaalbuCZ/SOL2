package w3;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class h0 extends j0 {

    /* renamed from: f  reason: collision with root package name */
    private final Callable f16084f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h0(Callable callable, g0 g0Var) {
        super();
        this.f16084f = callable;
    }

    @Override // w3.j0
    final String a() {
        try {
            return (String) this.f16084f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
