package y0;

import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import y0.r0;
/* loaded from: classes.dex */
public class v2 implements s2 {

    /* renamed from: c  reason: collision with root package name */
    private final Context f16730c;

    /* renamed from: d  reason: collision with root package name */
    private final k2 f16731d;

    /* renamed from: e  reason: collision with root package name */
    private final p1<z1> f16732e;

    /* renamed from: f  reason: collision with root package name */
    private final n<n0, String> f16733f;

    /* renamed from: g  reason: collision with root package name */
    private final p1<List<n0>> f16734g;

    /* renamed from: h  reason: collision with root package name */
    private final n<d3, String> f16735h;

    /* renamed from: i  reason: collision with root package name */
    private final p1<List<d3>> f16736i;

    /* renamed from: j  reason: collision with root package name */
    private final n<String, String> f16737j = new p3();

    /* renamed from: k  reason: collision with root package name */
    private final p1<List<String>> f16738k = new m3();

    /* renamed from: l  reason: collision with root package name */
    private z2<n0> f16739l;

    /* renamed from: m  reason: collision with root package name */
    private z2<d3> f16740m;

    /* renamed from: n  reason: collision with root package name */
    private z2<String> f16741n;

    /* renamed from: o  reason: collision with root package name */
    private final p1<k3> f16742o;

    /* renamed from: p  reason: collision with root package name */
    private final r<k3> f16743p;

    /* renamed from: q  reason: collision with root package name */
    private File f16744q;

    /* renamed from: r  reason: collision with root package name */
    private File f16745r;

    /* renamed from: s  reason: collision with root package name */
    private final t f16746s;

    /* loaded from: classes.dex */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory() && file.getName().equalsIgnoreCase("logs");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends r0.a {
        b(File[] fileArr) {
            super(fileArr);
        }

        @Override // y0.r0.a
        public int b(File file, Long l10, File file2, Long l11) {
            return l10.compareTo(l11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends r0.a {
        c(File[] fileArr) {
            super(fileArr);
        }

        @Override // y0.r0.a
        public int b(File file, Long l10, File file2, Long l11) {
            return l10.compareTo(l11);
        }
    }

    public v2(Context context, k2 k2Var, d2 d2Var, x0 x0Var, s0 s0Var, n3 n3Var, g3 g3Var, p1<k3> p1Var, r<k3> rVar, t tVar) {
        this.f16730c = context;
        this.f16731d = k2Var;
        this.f16732e = d2Var;
        this.f16733f = x0Var;
        this.f16734g = s0Var;
        this.f16735h = n3Var;
        this.f16736i = g3Var;
        this.f16742o = p1Var;
        this.f16743p = rVar;
        this.f16746s = tVar;
    }

    private File r(File file, String str) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory() && file2.getName().contains(str)) {
                return file2;
            }
        }
        String str2 = "The " + str + " folder inside the session folder: " + file.getName() + " couldn't be opened.";
        i0.d("Bugfender-SDK", str2);
        throw new FileNotFoundException(str2);
    }

    private void s(File[] fileArr, Comparator<File> comparator) {
        if (comparator == null) {
            r0.c(fileArr, new b(fileArr));
        } else {
            Arrays.sort(fileArr, comparator);
        }
    }

    private long t(File file) {
        File[] listFiles;
        if (file.isDirectory()) {
            long j10 = 0;
            for (File file2 : file.listFiles()) {
                j10 += file2.isFile() ? file2.length() : t(file2);
            }
            return j10;
        }
        return file.length();
    }

    private File u(long j10) {
        File w10 = w();
        File file = new File(w10, "session-" + j10);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    private File v(z1 z1Var) {
        File u10 = u(z1Var.g());
        if (u10 == null || !u10.exists()) {
            String str = "The old session with local-sessionId: " + z1Var.g() + " couldn't be opened.";
            i0.d("Bugfender-SDK", str);
            throw new FileNotFoundException(str);
        }
        return u10;
    }

    private File w() {
        return this.f16730c.getDir("bugfender", 0);
    }

    private File x() {
        return new File(w(), "device_status.json");
    }

    @Override // y0.s2
    public List<z1> a() {
        File[] listFiles;
        File w10 = w();
        z1 c10 = c();
        ArrayList arrayList = new ArrayList();
        File[] listFiles2 = w10.listFiles();
        r0.c(listFiles2, new c(listFiles2));
        for (File file : listFiles2) {
            if (file.isDirectory() && !file.getName().contains(String.valueOf(c10.g()))) {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().equalsIgnoreCase("session.json")) {
                        z1 b10 = this.f16732e.b(file2);
                        if (b10 != null) {
                            arrayList.add(b10);
                        } else {
                            r0.d(file, this.f16746s);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // y0.s2
    public boolean b(File file) {
        long length = file.length();
        boolean delete = file.delete();
        if (delete) {
            this.f16746s.e(length);
        }
        return delete;
    }

    @Override // y0.s2
    public z1 c() {
        if (this.f16745r != null) {
            this.f16745r = new File(this.f16744q, "session.json");
        }
        return this.f16732e.b(this.f16745r);
    }

    @Override // y0.s2
    public boolean c(long j10) {
        return r0.f(new File(u(j10), "crashes"), this.f16746s);
    }

    @Override // y0.s2
    public List<z1> d() {
        z1 c10 = c();
        List<z1> a10 = a();
        if (a10.isEmpty()) {
            return Collections.singletonList(c10);
        }
        a10.add(a10.size(), c10);
        return a10;
    }

    @Override // y0.s2
    public k3 e() {
        return this.f16742o.b(x());
    }

    @Override // y0.s2
    public z2<d3> f() {
        return this.f16740m;
    }

    @Override // y0.s2
    public z2<String> f(z1 z1Var) {
        try {
            return new z2<>(this.f16737j, this.f16738k, r(v(z1Var), "crashes"), "crashes", this.f16746s);
        } catch (FileNotFoundException e10) {
            throw new e3(e10);
        }
    }

    @Override // y0.s2
    public z2<String> g() {
        return this.f16741n;
    }

    @Override // y0.s2
    public long h() {
        if (!this.f16746s.d()) {
            this.f16746s.c(t(w()));
        }
        return this.f16746s.a();
    }

    @Override // y0.s2
    public z2<n0> i() {
        return this.f16739l;
    }

    @Override // y0.s2
    public List<File> j(long j10, Comparator<File> comparator) {
        File[] listFiles = u(j10).listFiles(new a());
        if (listFiles.length > 0) {
            File[] listFiles2 = listFiles[0].listFiles();
            s(listFiles2, comparator);
            return Arrays.asList(listFiles2);
        }
        return Collections.emptyList();
    }

    @Override // y0.s2
    public void k(k3 k3Var) {
        this.f16743p.a(k3Var, x());
    }

    @Override // y0.s2
    public void l(z1 z1Var) {
        File w10 = w();
        if (!w10.exists()) {
            throw new a1("Bugfender folder doesn't exist and it couldn't be created");
        }
        String str = "session-" + z1Var.g();
        File file = new File(w10, str);
        this.f16744q = file;
        if (!file.mkdir()) {
            throw new a1("Session with name: " + str + " couldn't create the session folder.");
        }
        this.f16745r = new File(this.f16744q, "session.json");
        r0.b(this.f16745r, this.f16731d.b(z1Var), this.f16746s);
        File file2 = new File(this.f16744q, "logs");
        if (!file2.mkdir()) {
            throw new a1("Session folder: " + this.f16744q.getName() + " couldn't create the log folder.");
        }
        this.f16739l = new z2<>(this.f16733f, this.f16734g, file2, "logs", this.f16746s);
        File file3 = new File(this.f16744q, "issues");
        if (!file3.mkdir()) {
            throw new a1("Session folder: " + this.f16744q.getName() + " couldn't create the issue folder.");
        }
        this.f16740m = new z2<>(this.f16735h, this.f16736i, file3, "issues", this.f16746s);
        File file4 = new File(this.f16744q, "crashes");
        if (file4.mkdir()) {
            this.f16741n = new z2<>(this.f16737j, this.f16738k, file4, "crashes", this.f16746s);
            return;
        }
        throw new a1("Crashes folder: " + file4.getName() + " couldn't create the crashes folder.");
    }

    @Override // y0.s2
    public void m(long j10) {
        z1 c10 = c();
        c10.b(j10);
        r0.e(this.f16745r, this.f16731d.b(c10), this.f16746s);
    }

    @Override // y0.s2
    public z2<d3> n(z1 z1Var) {
        try {
            return new z2<>(this.f16735h, this.f16736i, r(v(z1Var), "issues"), "issues", this.f16746s);
        } catch (FileNotFoundException e10) {
            throw new e3(e10);
        }
    }

    @Override // y0.s2
    public void o(long j10, long j11) {
        File file = new File(u(j10), "session.json");
        z1 b10 = this.f16732e.b(file);
        b10.b(j11);
        r0.e(file, this.f16731d.b(b10), this.f16746s);
    }

    @Override // y0.s2
    public boolean p(long j10) {
        return r0.d(u(j10), this.f16746s);
    }

    @Override // y0.s2
    public z2<n0> q(z1 z1Var) {
        try {
            return new z2<>(this.f16733f, this.f16734g, r(v(z1Var), "logs"), "logs", this.f16746s);
        } catch (FileNotFoundException e10) {
            throw new e3(e10);
        }
    }
}
