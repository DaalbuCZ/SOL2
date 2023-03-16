package p2;

import k2.a;
import s1.m1;
import s1.z1;
/* loaded from: classes.dex */
public abstract class i implements a.b {

    /* renamed from: n  reason: collision with root package name */
    public final String f12227n;

    public i(String str) {
        this.f12227n = str;
    }

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
        return this.f12227n;
    }
}
