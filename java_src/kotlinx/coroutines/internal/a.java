package kotlinx.coroutines.internal;

import java.util.Objects;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f10903a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private int f10904b;

    /* renamed from: c  reason: collision with root package name */
    private int f10905c;

    private final void b() {
        Object[] objArr = this.f10903a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        z8.e.c(objArr, objArr2, 0, this.f10904b, 0, 10, null);
        Object[] objArr3 = this.f10903a;
        int length2 = objArr3.length;
        int i10 = this.f10904b;
        z8.e.c(objArr3, objArr2, length2 - i10, 0, i10, 4, null);
        this.f10903a = objArr2;
        this.f10904b = 0;
        this.f10905c = length;
    }

    public final void a(T t10) {
        Object[] objArr = this.f10903a;
        int i10 = this.f10905c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f10905c = length;
        if (length == this.f10904b) {
            b();
        }
    }

    public final boolean c() {
        return this.f10904b == this.f10905c;
    }

    public final T d() {
        int i10 = this.f10904b;
        if (i10 == this.f10905c) {
            return null;
        }
        Object[] objArr = this.f10903a;
        T t10 = (T) objArr[i10];
        objArr[i10] = null;
        this.f10904b = (i10 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t10, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t10;
    }
}
