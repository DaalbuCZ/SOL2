package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1406a = aVar.p(iconCompat.f1406a, 1);
        iconCompat.f1408c = aVar.j(iconCompat.f1408c, 2);
        iconCompat.f1409d = aVar.r(iconCompat.f1409d, 3);
        iconCompat.f1410e = aVar.p(iconCompat.f1410e, 4);
        iconCompat.f1411f = aVar.p(iconCompat.f1411f, 5);
        iconCompat.f1412g = (ColorStateList) aVar.r(iconCompat.f1412g, 6);
        iconCompat.f1414i = aVar.t(iconCompat.f1414i, 7);
        iconCompat.f1415j = aVar.t(iconCompat.f1415j, 8);
        iconCompat.v();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.w(aVar.f());
        int i10 = iconCompat.f1406a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1408c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1409d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1410e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1411f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1412g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1414i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1415j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
