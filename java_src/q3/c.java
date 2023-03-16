package q3;

import android.os.Bundle;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import s1.h;
/* loaded from: classes.dex */
public final class c implements s1.h {

    /* renamed from: s  reason: collision with root package name */
    public static final h.a<c> f12564s = b.f12563a;

    /* renamed from: n  reason: collision with root package name */
    public final int f12565n;

    /* renamed from: o  reason: collision with root package name */
    public final int f12566o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12567p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f12568q;

    /* renamed from: r  reason: collision with root package name */
    private int f12569r;

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f12565n = i10;
        this.f12566o = i11;
        this.f12567p = i12;
        this.f12568q = bArr;
    }

    @Pure
    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int c(int i10) {
        if (i10 != 1) {
            if (i10 != 16) {
                if (i10 != 18) {
                    return (i10 == 6 || i10 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c e(Bundle bundle) {
        return new c(bundle.getInt(d(0), -1), bundle.getInt(d(1), -1), bundle.getInt(d(2), -1), bundle.getByteArray(d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12565n == cVar.f12565n && this.f12566o == cVar.f12566o && this.f12567p == cVar.f12567p && Arrays.equals(this.f12568q, cVar.f12568q);
    }

    public int hashCode() {
        if (this.f12569r == 0) {
            this.f12569r = ((((((527 + this.f12565n) * 31) + this.f12566o) * 31) + this.f12567p) * 31) + Arrays.hashCode(this.f12568q);
        }
        return this.f12569r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f12565n);
        sb.append(", ");
        sb.append(this.f12566o);
        sb.append(", ");
        sb.append(this.f12567p);
        sb.append(", ");
        sb.append(this.f12568q != null);
        sb.append(")");
        return sb.toString();
    }
}
