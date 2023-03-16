package y0;

import android.text.TextUtils;
import java.util.UUID;
/* loaded from: classes.dex */
public class d3 {

    /* renamed from: a  reason: collision with root package name */
    private UUID f16505a;

    /* renamed from: b  reason: collision with root package name */
    private String f16506b;

    /* renamed from: c  reason: collision with root package name */
    private String f16507c;

    /* renamed from: d  reason: collision with root package name */
    private String f16508d;

    /* renamed from: e  reason: collision with root package name */
    private String f16509e;

    /* renamed from: f  reason: collision with root package name */
    private Long f16510f;

    /* renamed from: g  reason: collision with root package name */
    private g0 f16511g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private UUID f16512a;

        /* renamed from: b  reason: collision with root package name */
        private String f16513b;

        /* renamed from: c  reason: collision with root package name */
        private String f16514c;

        /* renamed from: d  reason: collision with root package name */
        private String f16515d;

        /* renamed from: e  reason: collision with root package name */
        private String f16516e;

        /* renamed from: f  reason: collision with root package name */
        private long f16517f;

        /* renamed from: g  reason: collision with root package name */
        private g0 f16518g;

        private b() {
        }

        public b b(long j10) {
            this.f16517f = j10;
            return this;
        }

        public b c(String str) {
            this.f16516e = str;
            return this;
        }

        public b d(UUID uuid) {
            this.f16512a = uuid;
            return this;
        }

        public b e(g0 g0Var) {
            this.f16518g = g0Var;
            return this;
        }

        public d3 f() {
            return new d3(this);
        }

        public b h(String str) {
            this.f16515d = str;
            return this;
        }

        public b j(String str) {
            this.f16514c = str;
            return this;
        }

        public b l(String str) {
            this.f16513b = str;
            return this;
        }
    }

    private d3(b bVar) {
        this.f16505a = bVar.f16512a;
        this.f16506b = TextUtils.isEmpty(bVar.f16513b) ? "issue" : bVar.f16513b;
        this.f16507c = bVar.f16514c;
        this.f16508d = bVar.f16515d;
        this.f16509e = bVar.f16516e;
        this.f16510f = Long.valueOf(bVar.f16517f);
        this.f16511g = bVar.f16518g;
    }

    public static b a() {
        return new b();
    }

    public void b(long j10) {
        this.f16510f = Long.valueOf(j10);
    }

    public void c(g0 g0Var) {
        this.f16511g = g0Var;
    }

    public g0 d() {
        return this.f16511g;
    }

    public String e() {
        return this.f16509e;
    }

    public Long f() {
        return this.f16510f;
    }

    public String g() {
        return this.f16508d;
    }

    public String h() {
        return this.f16507c;
    }

    public String i() {
        return this.f16506b;
    }

    public UUID j() {
        return this.f16505a;
    }
}
