package v5;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final File f15700a;

    /* renamed from: b  reason: collision with root package name */
    private final File f15701b;

    /* renamed from: c  reason: collision with root package name */
    private final File f15702c;

    /* renamed from: d  reason: collision with root package name */
    private final File f15703d;

    /* renamed from: e  reason: collision with root package name */
    private final File f15704e;

    /* renamed from: f  reason: collision with root package name */
    private final File f15705f;

    public f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f15700a = filesDir;
        if (v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q10 = q(new File(filesDir, str));
        this.f15701b = q10;
        this.f15702c = q(new File(q10, "open-sessions"));
        this.f15703d = q(new File(q10, "reports"));
        this.f15704e = q(new File(q10, "priority-reports"));
        this.f15705f = q(new File(q10, "native-reports"));
    }

    private void a(File file) {
        if (file.exists() && s(file)) {
            n5.f f10 = n5.f.f();
            f10.b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private File n(String str) {
        return r(new File(this.f15702c, str));
    }

    private static synchronized File q(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                n5.f f10 = n5.f.f();
                f10.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                n5.f f11 = n5.f.f();
                f11.d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        }
    }

    private static File r(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    private static boolean v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public void b() {
        a(new File(this.f15700a, ".com.google.firebase.crashlytics"));
        a(new File(this.f15700a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f15700a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f15702c, str));
    }

    public List<String> d() {
        return t(this.f15702c.list());
    }

    public File e(String str) {
        return new File(this.f15701b, str);
    }

    public List<File> f(FilenameFilter filenameFilter) {
        return t(this.f15701b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f15705f, str);
    }

    public List<File> h() {
        return t(this.f15705f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f15704e, str);
    }

    public List<File> k() {
        return t(this.f15704e.listFiles());
    }

    public File l(String str) {
        return new File(this.f15703d, str);
    }

    public List<File> m() {
        return t(this.f15703d.listFiles());
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List<File> p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
