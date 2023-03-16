package y0;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import y0.n0;
/* loaded from: classes.dex */
public class i1 implements Callable<n2<Integer>> {

    /* renamed from: a  reason: collision with root package name */
    private final s2 f16534a;

    /* renamed from: b  reason: collision with root package name */
    private final f2 f16535b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16536c;

    /* renamed from: d  reason: collision with root package name */
    private final k3 f16537d;

    /* renamed from: e  reason: collision with root package name */
    private final s f16538e;

    public i1(s2 s2Var, f2 f2Var, String str, s sVar, k3 k3Var) {
        this.f16534a = s2Var;
        this.f16535b = f2Var;
        this.f16536c = str;
        this.f16537d = k3Var;
        this.f16538e = sVar;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public n2<Integer> call() {
        int i10 = 0;
        if (this.f16537d.b()) {
            for (z1 z1Var : this.f16534a.a()) {
                try {
                    n2<Integer> b10 = b(z1Var, this.f16534a.f(z1Var).i().a());
                    if (b10.a().intValue() > 0) {
                        new u1(this.f16535b, this.f16534a, this.f16536c, Collections.singletonList(z1Var)).call();
                    }
                    i10 += b10.a().intValue();
                } catch (e3 unused) {
                }
            }
        }
        return new n2<>(Integer.valueOf(i10));
    }

    public n2<Integer> b(z1 z1Var, List<String> list) {
        int i10 = 0;
        if (list.size() > 0) {
            if (z1Var.l() <= 0) {
                try {
                    long a10 = this.f16535b.a(z1Var);
                    z1Var.b(a10);
                    this.f16534a.o(z1Var.g(), a10);
                } catch (v0 unused) {
                    return new n2<>(0);
                }
            }
            for (String str : list) {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("title", "Crash Report");
                        String optString2 = jSONObject.optString("raw", "{}");
                        String optString3 = jSONObject.optString("message", "");
                        long optLong = jSONObject.optLong("date", new Date().getTime());
                        UUID a11 = u0.a(this.f16538e.e());
                        this.f16535b.e(Collections.singletonList(new n0.b().a(n0.c.D.e()).h("bf_issue").i(a11.toString()).d(new Date(optLong)).e()), z1Var);
                        this.f16535b.f(d3.a().d(a11).j(optString).c(optString2).h(optString3).b(z1Var.l()).e(new g0(this.f16536c)).l("crash").f(), z1Var);
                        i10++;
                    } finally {
                        this.f16534a.c(z1Var.g());
                    }
                } catch (JSONException e10) {
                    i0.c(e10);
                }
            }
        }
        return new n2<>(Integer.valueOf(i10));
    }
}
