package c0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import b0.f;
import java.util.List;
/* loaded from: classes.dex */
class a implements b0.b {

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f3102o = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f3103p = new String[0];

    /* renamed from: n  reason: collision with root package name */
    private final SQLiteDatabase f3104n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0069a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0.e f3105a;

        C0069a(b0.e eVar) {
            this.f3105a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f3105a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0.e f3107a;

        b(b0.e eVar) {
            this.f3107a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f3107a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SQLiteDatabase sQLiteDatabase) {
        this.f3104n = sQLiteDatabase;
    }

    @Override // b0.b
    public boolean A() {
        return this.f3104n.inTransaction();
    }

    @Override // b0.b
    public void J() {
        this.f3104n.setTransactionSuccessful();
    }

    @Override // b0.b
    public Cursor L(b0.e eVar) {
        return this.f3104n.rawQueryWithFactory(new C0069a(eVar), eVar.a(), f3103p, null);
    }

    @Override // b0.b
    public void M(String str, Object[] objArr) {
        this.f3104n.execSQL(str, objArr);
    }

    @Override // b0.b
    public Cursor V(String str) {
        return L(new b0.a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f3104n == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3104n.close();
    }

    @Override // b0.b
    public void d() {
        this.f3104n.endTransaction();
    }

    @Override // b0.b
    public void e() {
        this.f3104n.beginTransaction();
    }

    @Override // b0.b
    public List<Pair<String, String>> i() {
        return this.f3104n.getAttachedDbs();
    }

    @Override // b0.b
    public boolean isOpen() {
        return this.f3104n.isOpen();
    }

    @Override // b0.b
    public void m(String str) {
        this.f3104n.execSQL(str);
    }

    @Override // b0.b
    public f s(String str) {
        return new e(this.f3104n.compileStatement(str));
    }

    @Override // b0.b
    public Cursor w(b0.e eVar, CancellationSignal cancellationSignal) {
        return this.f3104n.rawQueryWithFactory(new b(eVar), eVar.a(), f3103p, null, cancellationSignal);
    }

    @Override // b0.b
    public String z() {
        return this.f3104n.getPath();
    }
}
