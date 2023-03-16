package y0;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f16676a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread f16677b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f16678c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f16679d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Throwable f16680a;

        /* renamed from: b  reason: collision with root package name */
        private Thread f16681b;

        /* renamed from: c  reason: collision with root package name */
        private Date f16682c;

        public b b(Thread thread) {
            this.f16681b = thread;
            return this;
        }

        public b c(Throwable th) {
            this.f16680a = (Throwable) l3.a(th, "throwable == null");
            return this;
        }

        public b d(Date date) {
            this.f16682c = (Date) l3.a(date, "date == null");
            return this;
        }

        public q2 e() {
            return new q2(this);
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final Throwable f16683a;

        c(Throwable th) {
            this.f16683a = th;
        }

        public String a() {
            String[] split = toString().split("\n");
            return split.length >= 1 ? split[1] : "Crash Report";
        }

        public String toString() {
            StringWriter stringWriter = new StringWriter();
            this.f16683a.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (h0.b(stringWriter2)) {
                stringWriter2 = h0.c(stringWriter2);
            }
            return "``` \n " + stringWriter2 + " \n ```";
        }
    }

    private q2(b bVar) {
        this.f16676a = UUID.randomUUID();
        this.f16677b = bVar.f16681b;
        this.f16678c = bVar.f16680a;
        this.f16679d = bVar.f16682c;
    }

    public static q2 a(Thread thread, Throwable th) {
        return new b().c(th).b(thread).d(new Date()).e();
    }

    public String b() {
        try {
            c cVar = new c(this.f16678c);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f16676a.toString());
            jSONObject.put("title", cVar.a());
            jSONObject.put("message", cVar.toString());
            jSONObject.put("date", new Date().getTime());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
