package a4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s10);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s10);
        return createIntArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s10);
        return createFromParcel;
    }

    public static String d(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s10);
        return readString;
    }

    public static ArrayList<String> e(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s10);
        return createStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s10);
        return tArr;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s10);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int i(int i10) {
        return (char) i10;
    }

    public static boolean j(Parcel parcel, int i10) {
        w(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean k(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        if (s10 == 0) {
            return null;
        }
        v(parcel, i10, s10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double l(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        if (s10 == 0) {
            return null;
        }
        v(parcel, i10, s10, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float m(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        if (s10 == 0) {
            return null;
        }
        v(parcel, i10, s10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (s10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s10);
        return readStrongBinder;
    }

    public static int p(Parcel parcel, int i10) {
        w(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int i10) {
        w(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int i10) {
        int s10 = s(parcel, i10);
        if (s10 == 0) {
            return null;
        }
        v(parcel, i10, s10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i10));
    }

    public static int u(Parcel parcel) {
        int n10 = n(parcel);
        int s10 = s(parcel, n10);
        int dataPosition = parcel.dataPosition();
        if (i(n10) == 20293) {
            int i10 = s10 + dataPosition;
            if (i10 < dataPosition || i10 > parcel.dataSize()) {
                throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
            }
            return i10;
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(n10))), parcel);
    }

    private static void v(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
    }

    private static void w(Parcel parcel, int i10, int i11) {
        int s10 = s(parcel, i10);
        if (s10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(s10);
        throw new a("Expected size " + i11 + " got " + s10 + " (0x" + hexString + ")", parcel);
    }
}
