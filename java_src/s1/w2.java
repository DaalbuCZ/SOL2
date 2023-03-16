package s1;

import android.os.Bundle;
import s1.h;
/* loaded from: classes.dex */
public abstract class w2 implements h {

    /* renamed from: n  reason: collision with root package name */
    public static final h.a<w2> f13926n = v2.f13868a;

    /* JADX INFO: Access modifiers changed from: private */
    public static w2 b(Bundle bundle) {
        h.a aVar;
        int i10 = bundle.getInt(c(0), -1);
        if (i10 == 0) {
            aVar = p1.f13657q;
        } else if (i10 == 1) {
            aVar = j2.f13508p;
        } else if (i10 == 2) {
            aVar = f3.f13378q;
        } else if (i10 != 3) {
            throw new IllegalArgumentException("Unknown RatingType: " + i10);
        } else {
            aVar = j3.f13510q;
        }
        return (w2) aVar.a(bundle);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
