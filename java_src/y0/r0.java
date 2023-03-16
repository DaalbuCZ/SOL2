package y0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/* loaded from: classes.dex */
public class r0 {

    /* loaded from: classes.dex */
    public static abstract class a implements Comparator<File> {

        /* renamed from: n  reason: collision with root package name */
        private final Map<File, Long> f16689n;

        /* renamed from: y0.r0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0242a extends HashMap<File, Long> {

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ File[] f16690n;

            C0242a(File[] fileArr) {
                this.f16690n = fileArr;
                for (File file : fileArr) {
                    put(file, Long.valueOf(file.lastModified()));
                }
            }
        }

        public a(File[] fileArr) {
            this.f16689n = new C0242a(fileArr);
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return b(file, this.f16689n.get(file), file2, this.f16689n.get(file2));
        }

        public abstract int b(File file, Long l10, File file2, Long l11);
    }

    public static String a(File file) {
        StringBuilder sb = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
        while (scanner.hasNextLine()) {
            try {
                sb.append(scanner.nextLine());
            } finally {
                scanner.close();
            }
        }
        return sb.toString();
    }

    public static void b(File file, String str, t tVar) {
        PrintWriter printWriter;
        PrintWriter printWriter2 = null;
        try {
            try {
                tVar.e(file.length());
                printWriter = new PrintWriter(file);
            } catch (Throwable th) {
                th = th;
                printWriter = printWriter2;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
        }
        try {
            printWriter.println(str);
            tVar.b(a3.b(str));
            printWriter.close();
        } catch (FileNotFoundException e11) {
            e = e11;
            printWriter2 = printWriter;
            i0.c(e);
            if (printWriter2 != null) {
                printWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (printWriter != null) {
                printWriter.close();
            }
            throw th;
        }
    }

    public static void c(File[] fileArr, a aVar) {
        Arrays.sort(fileArr, aVar);
    }

    public static boolean d(File file, t tVar) {
        File[] listFiles;
        boolean z10 = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                z10 = d(file2, tVar);
            } else {
                long length = file2.length();
                z10 = file2.delete();
                if (z10) {
                    tVar.e(length);
                }
            }
        }
        if (z10) {
            long length2 = file.length();
            z10 = file.delete();
            if (z10) {
                tVar.e(length2);
            }
        }
        return z10;
    }

    public static void e(File file, String str, t tVar) {
        PrintWriter printWriter;
        PrintWriter printWriter2 = null;
        try {
            try {
                tVar.e(file.length());
                printWriter = new PrintWriter(file);
            } catch (Throwable th) {
                th = th;
                printWriter = printWriter2;
            }
        } catch (FileNotFoundException e10) {
            e = e10;
        }
        try {
            printWriter.print("");
            printWriter.flush();
            printWriter.println(str);
            tVar.b(a3.b(str));
            printWriter.close();
        } catch (FileNotFoundException e11) {
            e = e11;
            printWriter2 = printWriter;
            i0.c(e);
            if (printWriter2 != null) {
                printWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            if (printWriter != null) {
                printWriter.close();
            }
            throw th;
        }
    }

    public static boolean f(File file, t tVar) {
        File[] listFiles;
        boolean z10 = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                z10 = d(file2, tVar);
            } else {
                long length = file2.length();
                z10 = file2.delete();
                if (z10) {
                    tVar.e(length);
                }
            }
        }
        return z10;
    }
}
