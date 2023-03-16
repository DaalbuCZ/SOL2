package v4;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class m extends h implements n {
    public m() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // v4.h
    protected final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            i.b(parcel);
            k((Bundle) i.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            i.b(parcel);
            C((Bundle) i.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
