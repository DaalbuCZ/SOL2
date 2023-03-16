package p4;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.d9;
import com.google.android.gms.measurement.internal.n9;
import java.util.List;
/* loaded from: classes.dex */
public abstract class e extends p0 implements f {
    public e() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        List z10;
        switch (i10) {
            case 1:
                q0.c(parcel);
                d0((com.google.android.gms.measurement.internal.v) q0.a(parcel, com.google.android.gms.measurement.internal.v.CREATOR), (n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                q0.c(parcel);
                s((d9) q0.a(parcel, d9.CREATOR), (n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                q0.c(parcel);
                g0((n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                q0.c(parcel);
                p((com.google.android.gms.measurement.internal.v) q0.a(parcel, com.google.android.gms.measurement.internal.v.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                q0.c(parcel);
                r((n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean g10 = q0.g(parcel);
                q0.c(parcel);
                z10 = z((n9) q0.a(parcel, n9.CREATOR), g10);
                parcel2.writeNoException();
                parcel2.writeTypedList(z10);
                return true;
            case 9:
                String readString3 = parcel.readString();
                q0.c(parcel);
                byte[] B = B((com.google.android.gms.measurement.internal.v) q0.a(parcel, com.google.android.gms.measurement.internal.v.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(B);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                q0.c(parcel);
                m(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                q0.c(parcel);
                String H = H((n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(H);
                return true;
            case 12:
                q0.c(parcel);
                U((com.google.android.gms.measurement.internal.d) q0.a(parcel, com.google.android.gms.measurement.internal.d.CREATOR), (n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                q0.c(parcel);
                y((com.google.android.gms.measurement.internal.d) q0.a(parcel, com.google.android.gms.measurement.internal.d.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                q0.c(parcel);
                z10 = G(parcel.readString(), parcel.readString(), q0.g(parcel), (n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(z10);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean g11 = q0.g(parcel);
                q0.c(parcel);
                z10 = x(readString7, readString8, readString9, g11);
                parcel2.writeNoException();
                parcel2.writeTypedList(z10);
                return true;
            case 16:
                q0.c(parcel);
                z10 = h0(parcel.readString(), parcel.readString(), (n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(z10);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                q0.c(parcel);
                z10 = L(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(z10);
                return true;
            case 18:
                q0.c(parcel);
                O((n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                q0.c(parcel);
                v((Bundle) q0.a(parcel, Bundle.CREATOR), (n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                q0.c(parcel);
                D((n9) q0.a(parcel, n9.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
