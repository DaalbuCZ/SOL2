package y0;

import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import y0.n0;
/* loaded from: classes.dex */
public class x0 implements n<n0, String> {
    @Override // y0.n
    /* renamed from: c */
    public String b(n0 n0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("line", n0Var.e());
            jSONObject.put("level", n0Var.d());
            jSONObject.put("absoluteTime", n0Var.a());
            jSONObject.put("date", u.c().format(n0Var.b()));
            String g10 = n0Var.g();
            String str = "";
            if (g10 == null) {
                g10 = "";
            }
            jSONObject.put("tag", g10);
            String f10 = n0Var.f();
            if (f10 == null) {
                f10 = "";
            }
            jSONObject.put("method", f10);
            String c10 = n0Var.c();
            if (c10 == null) {
                c10 = "";
            }
            jSONObject.put("file", c10);
            String h10 = n0Var.h();
            if (h10 == null) {
                h10 = "";
            }
            jSONObject.put("text", h10);
            String j10 = n0Var.j();
            if (j10 == null) {
                j10 = "";
            }
            jSONObject.put("thn", j10);
            String i10 = n0Var.i();
            if (i10 != null) {
                str = i10;
            }
            jSONObject.put("th", str);
            return jSONObject.toString();
        } catch (JSONException e10) {
            i0.c(e10);
            return null;
        }
    }

    @Override // y0.n
    /* renamed from: d */
    public n0 a(String str) {
        Date date;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("line");
            int i11 = jSONObject.getInt("level");
            long j10 = jSONObject.getLong("absoluteTime");
            try {
                date = u.c().parse(jSONObject.optString("date"));
            } catch (ParseException unused) {
                date = null;
            }
            String string = jSONObject.has("tag") ? jSONObject.getString("tag") : "";
            String string2 = jSONObject.has("method") ? jSONObject.getString("method") : "";
            String string3 = jSONObject.has("file") ? jSONObject.getString("file") : "";
            return new n0.b().f(i10).a(i11).b(j10).d(date).h(string).g(string2).c(string3).i(jSONObject.has("text") ? jSONObject.getString("text") : "").k(jSONObject.has("thn") ? jSONObject.getString("thn") : "").j(jSONObject.has("th") ? jSONObject.getString("th") : "").e();
        } catch (JSONException unused2) {
            return null;
        }
    }
}
