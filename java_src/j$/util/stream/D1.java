package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class D1 extends E1 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9797c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9798d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(O0 o02, Object obj, int i10, Q0 q02) {
        this(o02, obj, i10, 0);
        this.f9797c = 0;
    }

    @Override // j$.util.stream.E1
    void a() {
        switch (this.f9797c) {
            case 0:
                ((O0) this.f9801a).i(this.f9798d, this.f9802b);
                return;
            default:
                this.f9801a.m((Object[]) this.f9798d, this.f9802b);
                return;
        }
    }

    @Override // j$.util.stream.E1
    E1 b(int i10, int i11) {
        switch (this.f9797c) {
            case 0:
                return new D1(this, ((O0) this.f9801a).f(i10), i11);
            default:
                return new D1(this, this.f9801a.f(i10), i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(P0 p02, Object obj, int i10, int i11) {
        super(p02, i10);
        this.f9797c = i11;
        this.f9798d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1(P0 p02, Object[] objArr, int i10, Q0 q02) {
        super(p02, i10);
        this.f9797c = 1;
        this.f9797c = 1;
        this.f9798d = objArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(D1 d12, O0 o02, int i10) {
        super(d12, o02, i10);
        this.f9797c = 0;
        this.f9798d = d12.f9798d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(D1 d12, P0 p02, int i10) {
        super(d12, p02, i10);
        this.f9797c = 1;
        this.f9798d = (Object[]) d12.f9798d;
    }
}
