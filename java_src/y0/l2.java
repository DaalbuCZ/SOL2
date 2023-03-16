package y0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import y0.n0;
/* loaded from: classes.dex */
public class l2 implements Callable<Boolean> {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f16564f = Pattern.compile("\\{\"bf_start_date\":(\\d+),\"bf_end_date\":(\\d+)\\}");

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16565a;

    /* renamed from: b  reason: collision with root package name */
    private final t f16566b;

    /* renamed from: c  reason: collision with root package name */
    private final long f16567c;

    /* renamed from: d  reason: collision with root package name */
    private final x0 f16568d = new x0();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f16569e;

    public l2(s2 s2Var, t tVar, long j10, AtomicLong atomicLong) {
        this.f16565a = s2Var;
        this.f16566b = tVar;
        this.f16567c = j10;
        this.f16569e = atomicLong;
    }

    private void b(File file, String str, Long l10) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readLine = bufferedReader.readLine();
        bufferedReader.close();
        if (l10 == null) {
            l10 = Long.valueOf(this.f16568d.a(readLine).b().getTime());
        }
        long time = this.f16568d.a(str).b().getTime();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bf_start_date", l10);
        jSONObject.put("bf_end_date", time);
        String b10 = this.f16568d.b(new n0.b().b(this.f16569e.getAndIncrement()).d(new Date()).a(n0.c.D.e()).f(0).j("").k("").h("bf_gap_log").c("").i(jSONObject.toString()).e());
        this.f16566b.e(file.length());
        this.f16566b.b(a3.b(b10));
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(b10);
        printWriter.close();
    }

    private boolean c(z1 z1Var, List<z1> list) {
        n0 a10;
        for (z1 z1Var2 : list) {
            long g10 = z1Var2.g();
            List<File> j10 = this.f16565a.j(g10, s2.f16699a);
            if (!j10.isEmpty()) {
                File file = j10.get(0);
                t0 t0Var = new t0(file, i3.f16539a);
                String c10 = t0Var.c();
                t0Var.close();
                if (c10 != null) {
                    if (!c10.equals("") && (a10 = this.f16568d.a(c10)) != null) {
                        Matcher matcher = f16564f.matcher(a10.h() != null ? a10.h() : "");
                        if (!matcher.matches()) {
                            b(file, c10, null);
                            return true;
                        } else if (j10.size() > 1) {
                            b(j10.get(1), c10, Long.valueOf(new Date(Long.valueOf(matcher.group(1)).longValue()).getTime()));
                        } else {
                            try {
                                this.f16565a.n(z1Var2).c();
                            } catch (e3 unused) {
                            }
                            try {
                                this.f16565a.f(z1Var2).c();
                            } catch (e3 unused2) {
                            }
                        }
                    }
                }
                return this.f16565a.b(file);
            } else if (g10 != z1Var.g()) {
                this.f16565a.p(g10);
            }
        }
        d();
        return true;
    }

    private void d() {
        List<z1> a10 = this.f16565a.a();
        if (a10.isEmpty()) {
            return;
        }
        this.f16565a.p(a10.get(0).g());
    }

    private boolean e() {
        return this.f16565a.h() >= this.f16567c;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Boolean call() {
        while (e()) {
            c(this.f16565a.c(), this.f16565a.d());
        }
        return Boolean.TRUE;
    }
}
