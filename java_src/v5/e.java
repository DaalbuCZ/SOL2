package v5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import q5.p;
import s5.b0;
import s5.c0;
import t5.h;
import x5.i;
/* loaded from: classes.dex */
public class e {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f15692d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    private static final int f15693e = 15;

    /* renamed from: f  reason: collision with root package name */
    private static final h f15694f = new h();

    /* renamed from: g  reason: collision with root package name */
    private static final Comparator<? super File> f15695g = c.f15690n;

    /* renamed from: h  reason: collision with root package name */
    private static final FilenameFilter f15696h = b.f15689a;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f15697a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final f f15698b;

    /* renamed from: c  reason: collision with root package name */
    private final i f15699c;

    public e(f fVar, i iVar) {
        this.f15698b = fVar;
        this.f15699c = iVar;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f15692d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(File file, b0.d dVar, String str) {
        try {
            h hVar = f15694f;
            F(this.f15698b.g(str), hVar.G(hVar.F(A(file)).m(dVar)));
        } catch (IOException e10) {
            n5.f f10 = n5.f.f();
            f10.l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> p10 = this.f15698b.p(str, f15696h);
        if (p10.isEmpty()) {
            n5.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p10);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z10 = false;
            for (File file : p10) {
                try {
                    arrayList.add(f15694f.h(A(file)));
                } catch (IOException e10) {
                    n5.f.f().l("Could not add event to report for " + file, e10);
                }
                if (z10 || s(file.getName())) {
                    z10 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f15698b.o(str, "report"), arrayList, j10, z10, r5.i.j(str, this.f15698b));
            return;
        }
        n5.f.f().k("Could not parse event files for session " + str);
    }

    private void D(File file, List<b0.e.d> list, long j10, boolean z10, String str) {
        try {
            h hVar = f15694f;
            b0 l10 = hVar.F(A(file)).n(j10, z10, str).l(c0.d(list));
            b0.e j11 = l10.j();
            if (j11 == null) {
                return;
            }
            F(z10 ? this.f15698b.j(j11.h()) : this.f15698b.l(j11.h()), hVar.G(l10));
        } catch (IOException e10) {
            n5.f f10 = n5.f.f();
            f10.l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> p10 = this.f15698b.p(str, a.f15688a);
        Collections.sort(p10, d.f15691n);
        return f(p10, i10);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f15692d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f15692d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> e(String str) {
        this.f15698b.b();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            n5.f f10 = n5.f.f();
            f10.b("Removing session over cap: " + last);
            this.f15698b.c(last);
            p10.remove(last);
        }
        return p10;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                return size;
            }
            f.s(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f15699c.b().f16339a.f16351b;
        List<File> n10 = n();
        int size = n10.size();
        if (size <= i10) {
            return;
        }
        for (File file : n10.subList(i10, size)) {
            file.delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    private static String m(int i10, boolean z10) {
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i10));
        String str = z10 ? "_" : "";
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15698b.k());
        arrayList.addAll(this.f15698b.h());
        Comparator<? super File> comparator = f15695g;
        Collections.sort(arrayList, comparator);
        List<File> m10 = this.f15698b.m();
        Collections.sort(m10, comparator);
        arrayList.addAll(m10);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f15693e);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f15698b.m());
        j(this.f15698b.k());
        j(this.f15698b.h());
    }

    public void k(String str, long j10) {
        for (String str2 : e(str)) {
            n5.f f10 = n5.f.f();
            f10.i("Finalizing report for session " + str2);
            C(str2, j10);
            this.f15698b.c(str2);
        }
        g();
    }

    public void l(String str, b0.d dVar) {
        File o10 = this.f15698b.o(str, "report");
        n5.f f10 = n5.f.f();
        f10.b("Writing native session report for " + str + " to file: " + o10);
        B(o10, dVar, str);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f15698b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f15698b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f15698b.m().isEmpty() && this.f15698b.k().isEmpty() && this.f15698b.h().isEmpty()) ? false : true;
    }

    public List<p> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n10) {
            try {
                arrayList.add(p.a(f15694f.F(A(file)), file.getName(), file));
            } catch (IOException e10) {
                n5.f f10 = n5.f.f();
                f10.l("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(b0.e.d dVar, String str, boolean z10) {
        int i10 = this.f15699c.b().f16339a.f16350a;
        try {
            F(this.f15698b.o(str, m(this.f15697a.getAndIncrement(), z10)), f15694f.i(dVar));
        } catch (IOException e10) {
            n5.f f10 = n5.f.f();
            f10.l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(b0 b0Var) {
        b0.e j10 = b0Var.j();
        if (j10 == null) {
            n5.f.f().b("Could not get session for report");
            return;
        }
        String h10 = j10.h();
        try {
            F(this.f15698b.o(h10, "report"), f15694f.G(b0Var));
            G(this.f15698b.o(h10, "start-time"), "", j10.k());
        } catch (IOException e10) {
            n5.f f10 = n5.f.f();
            f10.c("Could not persist report for session " + h10, e10);
        }
    }
}
