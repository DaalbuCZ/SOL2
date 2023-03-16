package b0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2719a;

        public a(int i10) {
            this.f2719a = i10;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e10) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e10);
                    }
                }
            } catch (Exception e11) {
                Log.w("SupportSQLite", "delete failed: ", e11);
            }
        }

        public void b(b0.b bVar) {
        }

        public void c(b0.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.z());
            if (!bVar.isOpen()) {
                a(bVar.z());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = bVar.i();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        a((String) next.second);
                    }
                } else {
                    a(bVar.z());
                }
            }
        }

        public abstract void d(b0.b bVar);

        public abstract void e(b0.b bVar, int i10, int i11);

        public void f(b0.b bVar) {
        }

        public abstract void g(b0.b bVar, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2720a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2721b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2722c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2723d;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            Context f2724a;

            /* renamed from: b  reason: collision with root package name */
            String f2725b;

            /* renamed from: c  reason: collision with root package name */
            a f2726c;

            /* renamed from: d  reason: collision with root package name */
            boolean f2727d;

            a(Context context) {
                this.f2724a = context;
            }

            public b a() {
                if (this.f2726c != null) {
                    if (this.f2724a != null) {
                        if (this.f2727d && TextUtils.isEmpty(this.f2725b)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new b(this.f2724a, this.f2725b, this.f2726c, this.f2727d);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            public a b(a aVar) {
                this.f2726c = aVar;
                return this;
            }

            public a c(String str) {
                this.f2725b = str;
                return this;
            }

            public a d(boolean z10) {
                this.f2727d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10) {
            this.f2720a = context;
            this.f2721b = str;
            this.f2722c = aVar;
            this.f2723d = z10;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: b0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057c {
        c a(b bVar);
    }

    b0.b T();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
