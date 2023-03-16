package d4;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class m {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private static String f6562a;

    /* renamed from: b  reason: collision with root package name */
    private static int f6563b;

    public static String a() {
        BufferedReader bufferedReader;
        if (f6562a == null) {
            int i10 = f6563b;
            if (i10 == 0) {
                i10 = Process.myPid();
                f6563b = i10;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i10 > 0) {
                try {
                    String str2 = "/proc/" + i10 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader.readLine();
                            z3.o.i(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            k.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                k.a(bufferedReader);
            }
            f6562a = str;
        }
        return f6562a;
    }
}
