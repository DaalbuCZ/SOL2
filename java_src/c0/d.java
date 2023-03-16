package c0;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes.dex */
class d implements b0.d {

    /* renamed from: n  reason: collision with root package name */
    private final SQLiteProgram f3121n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(SQLiteProgram sQLiteProgram) {
        this.f3121n = sQLiteProgram;
    }

    @Override // b0.d
    public void H(int i10, long j10) {
        this.f3121n.bindLong(i10, j10);
    }

    @Override // b0.d
    public void P(int i10, byte[] bArr) {
        this.f3121n.bindBlob(i10, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3121n.close();
    }

    @Override // b0.d
    public void n(int i10, String str) {
        this.f3121n.bindString(i10, str);
    }

    @Override // b0.d
    public void u(int i10) {
        this.f3121n.bindNull(i10);
    }

    @Override // b0.d
    public void v(int i10, double d10) {
        this.f3121n.bindDouble(i10, d10);
    }
}
