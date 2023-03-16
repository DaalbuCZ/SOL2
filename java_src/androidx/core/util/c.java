package androidx.core.util;

import android.util.Log;
import java.io.Writer;
@Deprecated
/* loaded from: classes.dex */
public class c extends Writer {

    /* renamed from: n  reason: collision with root package name */
    private final String f1554n;

    /* renamed from: o  reason: collision with root package name */
    private StringBuilder f1555o = new StringBuilder(128);

    public c(String str) {
        this.f1554n = str;
    }

    private void a() {
        if (this.f1555o.length() > 0) {
            Log.d(this.f1554n, this.f1555o.toString());
            StringBuilder sb = this.f1555o;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f1555o.append(c10);
            }
        }
    }
}
