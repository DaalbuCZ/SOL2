package d3;

import android.os.Bundle;
import b5.q;
import java.util.ArrayList;
import java.util.List;
import s1.h;
/* loaded from: classes.dex */
public final class e implements s1.h {

    /* renamed from: o  reason: collision with root package name */
    public static final e f6537o = new e(q.J());

    /* renamed from: p  reason: collision with root package name */
    public static final h.a<e> f6538p = d.f6536a;

    /* renamed from: n  reason: collision with root package name */
    public final q<b> f6539n;

    public e(List<b> list) {
        this.f6539n = q.F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(0));
        return new e(parcelableArrayList == null ? q.J() : p3.c.b(b.F, parcelableArrayList));
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
