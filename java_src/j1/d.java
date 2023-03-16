package j1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f10240c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f10241a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f10242b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f10243a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<c> f10244b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f10243a, Collections.unmodifiableList(this.f10244b));
        }

        public a b(List<c> list) {
            this.f10244b = list;
            return this;
        }

        public a c(String str) {
            this.f10243a = str;
            return this;
        }
    }

    d(String str, List<c> list) {
        this.f10241a = str;
        this.f10242b = list;
    }

    public static a c() {
        return new a();
    }

    @e6.d(tag = 2)
    public List<c> a() {
        return this.f10242b;
    }

    @e6.d(tag = 1)
    public String b() {
        return this.f10241a;
    }
}
