package c0;

import android.database.sqlite.SQLiteStatement;
import b0.f;
/* loaded from: classes.dex */
class e extends d implements f {

    /* renamed from: o  reason: collision with root package name */
    private final SQLiteStatement f3122o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3122o = sQLiteStatement;
    }

    @Override // b0.f
    public long U() {
        return this.f3122o.executeInsert();
    }

    @Override // b0.f
    public int q() {
        return this.f3122o.executeUpdateDelete();
    }
}
