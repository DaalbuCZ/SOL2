package j$.util.stream;
/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0294e {

    /* renamed from: a  reason: collision with root package name */
    protected final int f10009a;

    /* renamed from: b  reason: collision with root package name */
    protected int f10010b;

    /* renamed from: c  reason: collision with root package name */
    protected int f10011c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f10012d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0294e() {
        this.f10009a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0294e(int i10) {
        if (i10 >= 0) {
            this.f10009a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
            return;
        }
        throw new IllegalArgumentException("Illegal Capacity: " + i10);
    }

    public abstract void clear();

    public long count() {
        int i10 = this.f10011c;
        return i10 == 0 ? this.f10010b : this.f10012d[i10] + this.f10010b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int s(int i10) {
        return 1 << ((i10 == 0 || i10 == 1) ? this.f10009a : Math.min((this.f10009a + i10) - 1, 30));
    }
}
