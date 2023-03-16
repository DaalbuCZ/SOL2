package y0;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import y0.r0;
/* loaded from: classes.dex */
public class z2<T> {

    /* renamed from: i  reason: collision with root package name */
    public static int f16822i = 65536;

    /* renamed from: a  reason: collision with root package name */
    private final File f16823a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16824b;

    /* renamed from: c  reason: collision with root package name */
    private File f16825c;

    /* renamed from: d  reason: collision with root package name */
    private PrintWriter f16826d;

    /* renamed from: e  reason: collision with root package name */
    private final n<T, String> f16827e;

    /* renamed from: f  reason: collision with root package name */
    private final p1<List<T>> f16828f;

    /* renamed from: g  reason: collision with root package name */
    private int f16829g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final t f16830h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16831a;

        a(String str) {
            this.f16831a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f16831a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends r0.a {
        public b(File[] fileArr) {
            super(fileArr);
        }

        @Override // y0.r0.a
        public int b(File file, Long l10, File file2, Long l11) {
            return l10.compareTo(l11);
        }
    }

    public z2(n<T, String> nVar, p1<List<T>> p1Var, File file, String str, t tVar) {
        this.f16827e = nVar;
        this.f16828f = p1Var;
        this.f16823a = file;
        this.f16824b = str;
        this.f16830h = tVar;
    }

    private c0<T> b(File file, String str, int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (file != null) {
            File[] listFiles = file.listFiles(new a(str));
            r0.c(listFiles, new b(listFiles));
            if (i10 == 0) {
                i10 = Integer.MAX_VALUE;
            }
            for (int i11 = 0; i11 < listFiles.length && i11 < i10; i11++) {
                File file2 = listFiles[i11];
                linkedList2.add(file2);
                linkedList.addAll(this.f16828f.b(file2));
            }
        }
        return new c0<>(linkedList, linkedList2);
    }

    private boolean f(String str, File file) {
        return file.length() + ((long) a3.b(str)) <= ((long) f16822i);
    }

    private boolean h(boolean z10) {
        boolean z11 = !z10;
        if (z11 && this.f16829g > 0) {
            this.f16829g = 0;
            return true;
        }
        int i10 = this.f16829g;
        if (i10 > 1) {
            return true;
        }
        if (z10) {
            this.f16829g = i10 + 1;
        }
        return z11;
    }

    public c0<T> a(int i10) {
        return b(this.f16823a, this.f16824b, i10);
    }

    public boolean c() {
        File[] listFiles;
        boolean z10 = true;
        for (File file : this.f16823a.listFiles()) {
            long length = file.length();
            boolean delete = file.delete();
            if (delete) {
                this.f16830h.e(length);
            }
            z10 &= delete;
        }
        return z10;
    }

    public boolean d(File file) {
        long length = file.length();
        boolean delete = file.delete();
        if (delete) {
            this.f16830h.e(length);
        }
        return delete;
    }

    public boolean e(T t10) {
        try {
            String b10 = this.f16827e.b(t10);
            File file = this.f16825c;
            if (file != null && !f(b10, file)) {
                l();
            }
            if (this.f16825c == null) {
                this.f16825c = new File(this.f16823a, this.f16824b);
            }
            if (this.f16826d == null) {
                this.f16826d = new PrintWriter(this.f16825c);
            }
            this.f16826d.println(b10);
            this.f16826d.flush();
            boolean checkError = this.f16826d.checkError();
            if (!checkError) {
                this.f16830h.b(a3.b(b10));
            }
            return h(checkError);
        } catch (Exception unused) {
            return h(true);
        }
    }

    public boolean g(List<File> list) {
        boolean z10 = true;
        for (File file : list) {
            long length = file.length();
            boolean delete = file.delete();
            if (delete) {
                this.f16830h.e(length);
            }
            z10 &= delete;
        }
        return z10;
    }

    public c0<T> i() {
        return a(0);
    }

    public c0<T> j(int i10) {
        return b(this.f16823a, this.f16824b + "-", i10);
    }

    public c0<T> k() {
        return j(0);
    }

    public boolean l() {
        PrintWriter printWriter = this.f16826d;
        if (printWriter != null) {
            printWriter.close();
        }
        if (this.f16825c != null) {
            File file = this.f16823a;
            File file2 = new File(file, this.f16824b + "-" + System.currentTimeMillis() + ".json");
            boolean renameTo = this.f16825c.renameTo(file2);
            if (renameTo) {
                this.f16825c = null;
                this.f16826d = null;
                if (file2.length() == 0) {
                    file2.delete();
                }
            }
            return renameTo;
        }
        return false;
    }
}
