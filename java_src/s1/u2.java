package s1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
final class u2 extends a {

    /* renamed from: s  reason: collision with root package name */
    private final int f13858s;

    /* renamed from: t  reason: collision with root package name */
    private final int f13859t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f13860u;

    /* renamed from: v  reason: collision with root package name */
    private final int[] f13861v;

    /* renamed from: w  reason: collision with root package name */
    private final l3[] f13862w;

    /* renamed from: x  reason: collision with root package name */
    private final Object[] f13863x;

    /* renamed from: y  reason: collision with root package name */
    private final HashMap<Object, Integer> f13864y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Collection<? extends e2> collection, u2.p0 p0Var) {
        super(false, p0Var);
        int i10 = 0;
        int size = collection.size();
        this.f13860u = new int[size];
        this.f13861v = new int[size];
        this.f13862w = new l3[size];
        this.f13863x = new Object[size];
        this.f13864y = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (e2 e2Var : collection) {
            this.f13862w[i12] = e2Var.b();
            this.f13861v[i12] = i10;
            this.f13860u[i12] = i11;
            i10 += this.f13862w[i12].t();
            i11 += this.f13862w[i12].m();
            this.f13863x[i12] = e2Var.a();
            this.f13864y.put(this.f13863x[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f13858s = i10;
        this.f13859t = i11;
    }

    @Override // s1.a
    protected Object C(int i10) {
        return this.f13863x[i10];
    }

    @Override // s1.a
    protected int E(int i10) {
        return this.f13860u[i10];
    }

    @Override // s1.a
    protected int F(int i10) {
        return this.f13861v[i10];
    }

    @Override // s1.a
    protected l3 I(int i10) {
        return this.f13862w[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<l3> J() {
        return Arrays.asList(this.f13862w);
    }

    @Override // s1.l3
    public int m() {
        return this.f13859t;
    }

    @Override // s1.l3
    public int t() {
        return this.f13858s;
    }

    @Override // s1.a
    protected int x(Object obj) {
        Integer num = this.f13864y.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // s1.a
    protected int y(int i10) {
        return p3.m0.h(this.f13860u, i10 + 1, false, false);
    }

    @Override // s1.a
    protected int z(int i10) {
        return p3.m0.h(this.f13861v, i10 + 1, false, false);
    }
}
