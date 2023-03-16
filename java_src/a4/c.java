package a4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return r(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        s(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z10) {
        t(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            t(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            t(parcel, i10, 0);
        }
    }

    public static void e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcel.writeBundle(bundle);
        s(parcel, r10);
    }

    public static void f(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            t(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            t(parcel, i10, 0);
        }
    }

    public static void g(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            t(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            t(parcel, i10, 0);
        }
    }

    public static void h(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        s(parcel, r10);
    }

    public static void i(Parcel parcel, int i10, int i11) {
        t(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void j(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcel.writeIntArray(iArr);
        s(parcel, r10);
    }

    public static void k(Parcel parcel, int i10, long j10) {
        t(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void l(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            t(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            t(parcel, i10, 0);
        }
    }

    public static void m(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        s(parcel, r10);
    }

    public static void n(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcel.writeString(str);
        s(parcel, r10);
    }

    public static void o(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcel.writeStringList(list);
        s(parcel, r10);
    }

    public static <T extends Parcelable> void p(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t10, i11);
            }
        }
        s(parcel, r10);
    }

    public static <T extends Parcelable> void q(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                t(parcel, i10, 0);
                return;
            }
            return;
        }
        int r10 = r(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t10, 0);
            }
        }
        s(parcel, r10);
    }

    private static int r(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void s(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    private static void t(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void u(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
