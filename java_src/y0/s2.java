package y0;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public interface s2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<File> f16699a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f16700b = Pattern.compile("logs-([\\d]+)\\.json");

    /* loaded from: classes.dex */
    class a implements Comparator<File> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            String name = file.getName();
            String name2 = file2.getName();
            Pattern pattern = s2.f16700b;
            Matcher matcher = pattern.matcher(name);
            Matcher matcher2 = pattern.matcher(name2);
            boolean matches = matcher.matches();
            boolean matches2 = matcher2.matches();
            if (matches && matches2) {
                return Long.valueOf(matcher.group(1)).compareTo(Long.valueOf(matcher2.group(1)));
            } else if (matches || matches2) {
                return name.equals("logs") ? 1 : -1;
            } else {
                throw new IllegalStateException("Log file doesn't comply to log-TIMESTAMP.json");
            }
        }
    }

    List<z1> a();

    boolean b(File file);

    z1 c();

    boolean c(long j10);

    List<z1> d();

    k3 e();

    z2<d3> f();

    z2<String> f(z1 z1Var);

    z2<String> g();

    long h();

    z2<n0> i();

    List<File> j(long j10, Comparator<File> comparator);

    void k(k3 k3Var);

    void l(z1 z1Var);

    void m(long j10);

    z2<d3> n(z1 z1Var);

    void o(long j10, long j11);

    boolean p(long j10);

    z2<n0> q(z1 z1Var);
}
