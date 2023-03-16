package kotlinx.coroutines.internal;

import r9.f2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final b9.g f10943a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f10944b;

    /* renamed from: c  reason: collision with root package name */
    private final f2<Object>[] f10945c;

    /* renamed from: d  reason: collision with root package name */
    private int f10946d;

    public l0(b9.g gVar, int i10) {
        this.f10943a = gVar;
        this.f10944b = new Object[i10];
        this.f10945c = new f2[i10];
    }

    public final void a(f2<?> f2Var, Object obj) {
        Object[] objArr = this.f10944b;
        int i10 = this.f10946d;
        objArr[i10] = obj;
        f2<Object>[] f2VarArr = this.f10945c;
        this.f10946d = i10 + 1;
        f2VarArr[i10] = f2Var;
    }

    public final void b(b9.g gVar) {
        int length = this.f10945c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            f2<Object> f2Var = this.f10945c[length];
            k9.k.b(f2Var);
            f2Var.r(gVar, this.f10944b[length]);
            if (i10 < 0) {
                return;
            }
            length = i10;
        }
    }
}
