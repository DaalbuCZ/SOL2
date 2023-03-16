package b5;

import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class s<E> extends o<E> implements Set<E> {
    @RetainedWith
    @CheckForNull

    /* renamed from: o  reason: collision with root package name */
    private transient q<E> f2878o;

    private static <E> s<E> C(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 == 1) {
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                return I(obj);
            }
            int x10 = x(i10);
            Object[] objArr2 = new Object[x10];
            int i11 = x10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = g0.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int a11 = n.a(hashCode);
                while (true) {
                    int i15 = a11 & i11;
                    Object obj2 = objArr2[i15];
                    if (obj2 == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj2.equals(a10)) {
                        break;
                    } else {
                        a11++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new q0(obj3);
            } else if (x(i13) < x10 / 2) {
                return C(i13, objArr);
            } else {
                if (L(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new l0(objArr, i12, objArr2, i11, i13);
            }
        }
        return H();
    }

    public static <E> s<E> D(Collection<? extends E> collection) {
        if ((collection instanceof s) && !(collection instanceof SortedSet)) {
            s<E> sVar = (s) collection;
            if (!sVar.s()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return C(array.length, array);
    }

    public static <E> s<E> E(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? C(eArr.length, (Object[]) eArr.clone()) : I(eArr[0]) : H();
    }

    public static <E> s<E> H() {
        return l0.f2845v;
    }

    public static <E> s<E> I(E e10) {
        return new q0(e10);
    }

    public static <E> s<E> J(E e10, E e11) {
        return C(2, e10, e11);
    }

    public static <E> s<E> K(E e10, E e11, E e12) {
        return C(3, e10, e11, e12);
    }

    private static boolean L(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            a5.j.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    q<E> F() {
        return q.x(toArray());
    }

    boolean G() {
        return false;
    }

    @Override // b5.o
    public q<E> d() {
        q<E> qVar = this.f2878o;
        if (qVar == null) {
            q<E> F = F();
            this.f2878o = F;
            return F;
        }
        return qVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof s) && G() && ((s) obj).G() && hashCode() != obj.hashCode()) {
            return false;
        }
        return p0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return p0.d(this);
    }

    @Override // b5.o, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: v */
    public abstract s0<E> iterator();
}
