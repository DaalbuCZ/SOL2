package d5;

import a5.j;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class d extends e {

    /* loaded from: classes.dex */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: n  reason: collision with root package name */
        final int[] f6574n;

        /* renamed from: o  reason: collision with root package name */
        final int f6575o;

        /* renamed from: p  reason: collision with root package name */
        final int f6576p;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        a(int[] iArr, int i10, int i11) {
            this.f6574n = iArr;
            this.f6575o = i10;
            this.f6576p = i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Integer) && d.h(this.f6574n, ((Integer) obj).intValue(), this.f6575o, this.f6576p) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Integer get(int i10) {
            j.g(i10, size());
            return Integer.valueOf(this.f6574n[this.f6575o + i10]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f6574n[this.f6575o + i10] != aVar.f6574n[aVar.f6575o + i10]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: g */
        public Integer set(int i10, Integer num) {
            j.g(i10, size());
            int[] iArr = this.f6574n;
            int i11 = this.f6575o;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) j.i(num)).intValue();
            return Integer.valueOf(i12);
        }

        int[] h() {
            return Arrays.copyOfRange(this.f6574n, this.f6575o, this.f6576p);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f6575o; i11 < this.f6576p; i11++) {
                i10 = (i10 * 31) + d.f(this.f6574n[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int h10;
            if (!(obj instanceof Integer) || (h10 = d.h(this.f6574n, ((Integer) obj).intValue(), this.f6575o, this.f6576p)) < 0) {
                return -1;
            }
            return h10 - this.f6575o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int i10;
            if (!(obj instanceof Integer) || (i10 = d.i(this.f6574n, ((Integer) obj).intValue(), this.f6575o, this.f6576p)) < 0) {
                return -1;
            }
            return i10 - this.f6575o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f6576p - this.f6575o;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            j.m(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f6574n;
            int i12 = this.f6575o;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f6574n[this.f6575o]);
            int i10 = this.f6575o;
            while (true) {
                i10++;
                if (i10 >= this.f6576p) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f6574n[i10]);
            }
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        j.f(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int[] iArr, int i10) {
        return h(iArr, i10, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int j(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).h();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) j.i(array[i10])).intValue();
        }
        return iArr;
    }
}
