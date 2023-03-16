package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Z0 extends R0 implements O0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Z0(O0 o02, O0 o03) {
        super(o02, o03);
    }

    @Override // j$.util.stream.O0
    public void i(Object obj, int i10) {
        ((O0) this.f9889a).i(obj, i10);
        ((O0) this.f9890b).i(obj, i10 + ((int) ((O0) this.f9889a).count()));
    }

    @Override // j$.util.stream.O0
    public Object k() {
        long count = count();
        if (count < 2147483639) {
            Object g10 = g((int) count);
            i(g10, 0);
            return g10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.O0
    public void l(Object obj) {
        ((O0) this.f9889a).l(obj);
        ((O0) this.f9890b).l(obj);
    }

    @Override // j$.util.stream.P0
    public /* synthetic */ Object[] o(j$.util.function.n nVar) {
        return D0.G(this, nVar);
    }

    public String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f9889a, this.f9890b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
