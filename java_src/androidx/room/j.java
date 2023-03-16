package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
/* loaded from: classes.dex */
class j implements b0.c {

    /* renamed from: n  reason: collision with root package name */
    private final Context f2276n;

    /* renamed from: o  reason: collision with root package name */
    private final String f2277o;

    /* renamed from: p  reason: collision with root package name */
    private final File f2278p;

    /* renamed from: q  reason: collision with root package name */
    private final int f2279q;

    /* renamed from: r  reason: collision with root package name */
    private final b0.c f2280r;

    /* renamed from: s  reason: collision with root package name */
    private a f2281s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2282t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, String str, File file, int i10, b0.c cVar) {
        this.f2276n = context;
        this.f2277o = str;
        this.f2278p = file;
        this.f2279q = i10;
        this.f2280r = cVar;
    }

    private void a(File file) {
        ReadableByteChannel channel;
        if (this.f2277o != null) {
            channel = Channels.newChannel(this.f2276n.getAssets().open(this.f2277o));
        } else if (this.f2278p == null) {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        } else {
            channel = new FileInputStream(this.f2278p).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2276n.getCacheDir());
        createTempFile.deleteOnExit();
        a0.d.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (createTempFile.renameTo(file)) {
        } else {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    private void c() {
        String databaseName = getDatabaseName();
        File databasePath = this.f2276n.getDatabasePath(databaseName);
        a aVar = this.f2281s;
        a0.a aVar2 = new a0.a(databaseName, this.f2276n.getFilesDir(), aVar == null || aVar.f2181j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            } else if (this.f2281s == null) {
                aVar2.c();
                return;
            } else {
                try {
                    int c10 = a0.c.c(databasePath);
                    int i10 = this.f2279q;
                    if (c10 == i10) {
                        aVar2.c();
                        return;
                    } else if (this.f2281s.a(c10, i10)) {
                        aVar2.c();
                        return;
                    } else {
                        if (this.f2276n.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.c();
                        return;
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar2.c();
                    return;
                }
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // b0.c
    public synchronized b0.b T() {
        if (!this.f2282t) {
            c();
            this.f2282t = true;
        }
        return this.f2280r.T();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f2281s = aVar;
    }

    @Override // b0.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2280r.close();
        this.f2282t = false;
    }

    @Override // b0.c
    public String getDatabaseName() {
        return this.f2280r.getDatabaseName();
    }

    @Override // b0.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f2280r.setWriteAheadLoggingEnabled(z10);
    }
}
