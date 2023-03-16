package r2;

import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public abstract class b implements a.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // k2.a.b
    public /* synthetic */ m1 g() {
        return k2.b.b(this);
    }

    @Override // k2.a.b
    public /* synthetic */ void h(z1.b bVar) {
        k2.b.c(this, bVar);
    }

    @Override // k2.a.b
    public /* synthetic */ byte[] l() {
        return k2.b.a(this);
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
