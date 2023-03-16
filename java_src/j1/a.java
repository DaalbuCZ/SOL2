package j1;

import g1.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static final a f10214e = new C0143a().b();

    /* renamed from: a  reason: collision with root package name */
    private final f f10215a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f10216b;

    /* renamed from: c  reason: collision with root package name */
    private final b f10217c;

    /* renamed from: d  reason: collision with root package name */
    private final String f10218d;

    /* renamed from: j1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0143a {

        /* renamed from: a  reason: collision with root package name */
        private f f10219a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f10220b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f10221c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f10222d = "";

        C0143a() {
        }

        public C0143a a(d dVar) {
            this.f10220b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f10219a, Collections.unmodifiableList(this.f10220b), this.f10221c, this.f10222d);
        }

        public C0143a c(String str) {
            this.f10222d = str;
            return this;
        }

        public C0143a d(b bVar) {
            this.f10221c = bVar;
            return this;
        }

        public C0143a e(f fVar) {
            this.f10219a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f10215a = fVar;
        this.f10216b = list;
        this.f10217c = bVar;
        this.f10218d = str;
    }

    public static C0143a e() {
        return new C0143a();
    }

    @e6.d(tag = 4)
    public String a() {
        return this.f10218d;
    }

    @e6.d(tag = 3)
    public b b() {
        return this.f10217c;
    }

    @e6.d(tag = 2)
    public List<d> c() {
        return this.f10216b;
    }

    @e6.d(tag = 1)
    public f d() {
        return this.f10215a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
