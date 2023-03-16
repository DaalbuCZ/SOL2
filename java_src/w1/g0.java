package w1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import t1.t1;
import w1.m;
/* loaded from: classes.dex */
public interface g0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f15867a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15868b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15869c;

        public a(byte[] bArr, String str, int i10) {
            this.f15867a = bArr;
            this.f15868b = str;
            this.f15869c = i10;
        }

        public byte[] a() {
            return this.f15867a;
        }

        public String b() {
            return this.f15868b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* loaded from: classes.dex */
    public interface c {
        g0 a(UUID uuid);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f15870a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15871b;

        public d(byte[] bArr, String str) {
            this.f15870a = bArr;
            this.f15871b = str;
        }

        public byte[] a() {
            return this.f15870a;
        }

        public String b() {
            return this.f15871b;
        }
    }

    void a();

    boolean b(byte[] bArr, String str);

    void c(byte[] bArr, byte[] bArr2);

    Map<String, String> d(byte[] bArr);

    void e(byte[] bArr);

    void f(byte[] bArr, t1 t1Var);

    byte[] g(byte[] bArr, byte[] bArr2);

    d h();

    void i(byte[] bArr);

    a j(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap);

    int k();

    void l(b bVar);

    v1.b m(byte[] bArr);

    byte[] n();
}
