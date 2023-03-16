package u4;

import android.content.Context;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15458a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Context context) {
        this.f15458a = context;
    }

    private static long b(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            long j10 = 0;
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    j10 += b(file2);
                }
            }
            return j10;
        }
        return file.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        return b(new File(this.f15458a.getFilesDir(), "assetpacks"));
    }
}
