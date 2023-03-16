package o1;

import android.database.sqlite.SQLiteDatabase;
import o1.t0;
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements t0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ p0 f11883a = new p0();

    private /* synthetic */ p0() {
    }

    @Override // o1.t0.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
