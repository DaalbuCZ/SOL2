package z3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class s extends a4.a {
    public static final Parcelable.Creator<s> CREATOR = new w();

    /* renamed from: n  reason: collision with root package name */
    private final int f17438n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private List<m> f17439o;

    public s(int i10, @Nullable List<m> list) {
        this.f17438n = i10;
        this.f17439o = list;
    }

    public final int k() {
        return this.f17438n;
    }

    public final List<m> s() {
        return this.f17439o;
    }

    public final void v(m mVar) {
        if (this.f17439o == null) {
            this.f17439o = new ArrayList();
        }
        this.f17439o.add(mVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = a4.c.a(parcel);
        a4.c.i(parcel, 1, this.f17438n);
        a4.c.q(parcel, 2, this.f17439o, false);
        a4.c.b(parcel, a10);
    }
}
