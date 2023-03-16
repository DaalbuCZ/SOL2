package y0;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class o0 implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final j3<String> f16626a;

    /* renamed from: b  reason: collision with root package name */
    private final f2 f16627b;

    /* renamed from: c  reason: collision with root package name */
    private final c3 f16628c;

    /* renamed from: d  reason: collision with root package name */
    private String f16629d;

    public o0(j3<String> j3Var, f2 f2Var, c3 c3Var, String str) {
        this.f16626a = j3Var;
        this.f16627b = f2Var;
        this.f16628c = c3Var;
        this.f16629d = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Boolean call() {
        try {
            this.f16627b.c(this.f16628c.a(), this.f16628c.l(), new q<>(this.f16629d, null));
            return Boolean.valueOf(this.f16626a.b(this.f16629d));
        } catch (v0 unused) {
            return Boolean.FALSE;
        }
    }
}
