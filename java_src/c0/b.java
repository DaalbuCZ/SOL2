package c0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import b0.c;
import java.io.File;
/* loaded from: classes.dex */
class b implements b0.c {

    /* renamed from: n  reason: collision with root package name */
    private final Context f3109n;

    /* renamed from: o  reason: collision with root package name */
    private final String f3110o;

    /* renamed from: p  reason: collision with root package name */
    private final c.a f3111p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f3112q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f3113r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private a f3114s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f3115t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: n  reason: collision with root package name */
        final c0.a[] f3116n;

        /* renamed from: o  reason: collision with root package name */
        final c.a f3117o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f3118p;

        /* renamed from: c0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0070a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.a f3119a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c0.a[] f3120b;

            C0070a(c.a aVar, c0.a[] aVarArr) {
                this.f3119a = aVar;
                this.f3120b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f3119a.c(a.b(this.f3120b, sQLiteDatabase));
            }
        }

        a(Context context, String str, c0.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f2719a, new C0070a(aVar, aVarArr));
            this.f3117o = aVar;
            this.f3116n = aVarArr;
        }

        static c0.a b(c0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            c0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new c0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        c0.a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.f3116n, sQLiteDatabase);
        }

        synchronized b0.b c() {
            this.f3118p = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f3118p) {
                return a(writableDatabase);
            }
            close();
            return c();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f3116n[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f3117o.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f3117o.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f3118p = true;
            this.f3117o.e(a(sQLiteDatabase), i10, i11);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f3118p) {
                return;
            }
            this.f3117o.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f3118p = true;
            this.f3117o.g(a(sQLiteDatabase), i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str, c.a aVar, boolean z10) {
        this.f3109n = context;
        this.f3110o = str;
        this.f3111p = aVar;
        this.f3112q = z10;
    }

    private a a() {
        a aVar;
        synchronized (this.f3113r) {
            if (this.f3114s == null) {
                c0.a[] aVarArr = new c0.a[1];
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 23 || this.f3110o == null || !this.f3112q) {
                    this.f3114s = new a(this.f3109n, this.f3110o, aVarArr, this.f3111p);
                } else {
                    this.f3114s = new a(this.f3109n, new File(this.f3109n.getNoBackupFilesDir(), this.f3110o).getAbsolutePath(), aVarArr, this.f3111p);
                }
                if (i10 >= 16) {
                    this.f3114s.setWriteAheadLoggingEnabled(this.f3115t);
                }
            }
            aVar = this.f3114s;
        }
        return aVar;
    }

    @Override // b0.c
    public b0.b T() {
        return a().c();
    }

    @Override // b0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // b0.c
    public String getDatabaseName() {
        return this.f3110o;
    }

    @Override // b0.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f3113r) {
            a aVar = this.f3114s;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.f3115t = z10;
        }
    }
}
