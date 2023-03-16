package com.google.android.gms.auth.api.signin;

import a4.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int u10 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < u10) {
            int n10 = b.n(parcel);
            switch (b.i(n10)) {
                case 1:
                    i10 = b.p(parcel, n10);
                    break;
                case 2:
                    str = b.d(parcel, n10);
                    break;
                case 3:
                    str2 = b.d(parcel, n10);
                    break;
                case 4:
                    str3 = b.d(parcel, n10);
                    break;
                case 5:
                    str4 = b.d(parcel, n10);
                    break;
                case 6:
                    uri = (Uri) b.c(parcel, n10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.d(parcel, n10);
                    break;
                case 8:
                    j10 = b.q(parcel, n10);
                    break;
                case 9:
                    str6 = b.d(parcel, n10);
                    break;
                case 10:
                    arrayList = b.g(parcel, n10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.d(parcel, n10);
                    break;
                case 12:
                    str8 = b.d(parcel, n10);
                    break;
                default:
                    b.t(parcel, n10);
                    break;
            }
        }
        b.h(parcel, u10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
