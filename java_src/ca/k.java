package ca;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* loaded from: classes.dex */
public final class k extends SQLiteOpenHelper {

    /* renamed from: n  reason: collision with root package name */
    public static final a f3288n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    private static k f3289o;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k9.g gVar) {
            this();
        }

        public final k a(Context context) {
            if (k.f3289o == null) {
                k9.k.b(context);
                Context applicationContext = context.getApplicationContext();
                k9.k.d(applicationContext, "ctx!!.applicationContext");
                k.f3289o = new k(applicationContext, null);
            }
            k kVar = k.f3289o;
            k9.k.b(kVar);
            return kVar;
        }
    }

    private k(Context context) {
        super(context, "download_tasks.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public /* synthetic */ k(Context context, k9.g gVar) {
        this(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        k9.k.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("CREATE TABLE task (_id INTEGER PRIMARY KEY,task_id VARCHAR(256), url TEXT, status INTEGER DEFAULT 0, progress INTEGER DEFAULT 0, file_name TEXT, saved_dir TEXT, headers TEXT, mime_type VARCHAR(128), resumable TINYINT DEFAULT 0, show_notification TINYINT DEFAULT 0, open_file_from_notification TINYINT DEFAULT 0, time_created INTEGER DEFAULT 0, save_in_public_storage TINYINT DEFAULT 0, allow_cellular TINYINT DEFAULT 1)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        k9.k.e(sQLiteDatabase, "db");
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        String str;
        k9.k.e(sQLiteDatabase, "db");
        if (i11 == 4) {
            str = "ALTER TABLE task ADD COLUMN allow_cellular TINYINT DEFAULT 1";
        } else if (i10 != 2 || i11 != 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS task");
            onCreate(sQLiteDatabase);
            return;
        } else {
            str = "ALTER TABLE task ADD COLUMN save_in_public_storage TINYINT DEFAULT 0";
        }
        sQLiteDatabase.execSQL(str);
    }
}
