package o1;

import android.database.Cursor;
import o1.m0;
/* loaded from: classes.dex */
public final /* synthetic */ class y implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ y f11912a = new y();

    private /* synthetic */ y() {
    }

    @Override // o1.m0.b
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
