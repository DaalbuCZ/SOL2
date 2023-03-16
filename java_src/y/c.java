package y;

import b0.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class c implements e, b0.d {

    /* renamed from: v  reason: collision with root package name */
    static final TreeMap<Integer, c> f16407v = new TreeMap<>();

    /* renamed from: n  reason: collision with root package name */
    private volatile String f16408n;

    /* renamed from: o  reason: collision with root package name */
    final long[] f16409o;

    /* renamed from: p  reason: collision with root package name */
    final double[] f16410p;

    /* renamed from: q  reason: collision with root package name */
    final String[] f16411q;

    /* renamed from: r  reason: collision with root package name */
    final byte[][] f16412r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f16413s;

    /* renamed from: t  reason: collision with root package name */
    final int f16414t;

    /* renamed from: u  reason: collision with root package name */
    int f16415u;

    private c(int i10) {
        this.f16414t = i10;
        int i11 = i10 + 1;
        this.f16413s = new int[i11];
        this.f16409o = new long[i11];
        this.f16410p = new double[i11];
        this.f16411q = new String[i11];
        this.f16412r = new byte[i11];
    }

    public static c c(String str, int i10) {
        TreeMap<Integer, c> treeMap = f16407v;
        synchronized (treeMap) {
            Map.Entry<Integer, c> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry == null) {
                c cVar = new c(i10);
                cVar.f(str, i10);
                return cVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            c value = ceilingEntry.getValue();
            value.f(str, i10);
            return value;
        }
    }

    private static void j() {
        TreeMap<Integer, c> treeMap = f16407v;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // b0.d
    public void H(int i10, long j10) {
        this.f16413s[i10] = 2;
        this.f16409o[i10] = j10;
    }

    @Override // b0.d
    public void P(int i10, byte[] bArr) {
        this.f16413s[i10] = 5;
        this.f16412r[i10] = bArr;
    }

    @Override // b0.e
    public String a() {
        return this.f16408n;
    }

    @Override // b0.e
    public void b(b0.d dVar) {
        for (int i10 = 1; i10 <= this.f16415u; i10++) {
            int i11 = this.f16413s[i10];
            if (i11 == 1) {
                dVar.u(i10);
            } else if (i11 == 2) {
                dVar.H(i10, this.f16409o[i10]);
            } else if (i11 == 3) {
                dVar.v(i10, this.f16410p[i10]);
            } else if (i11 == 4) {
                dVar.n(i10, this.f16411q[i10]);
            } else if (i11 == 5) {
                dVar.P(i10, this.f16412r[i10]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    void f(String str, int i10) {
        this.f16408n = str;
        this.f16415u = i10;
    }

    public void k() {
        TreeMap<Integer, c> treeMap = f16407v;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f16414t), this);
            j();
        }
    }

    @Override // b0.d
    public void n(int i10, String str) {
        this.f16413s[i10] = 4;
        this.f16411q[i10] = str;
    }

    @Override // b0.d
    public void u(int i10) {
        this.f16413s[i10] = 1;
    }

    @Override // b0.d
    public void v(int i10, double d10) {
        this.f16413s[i10] = 3;
        this.f16410p[i10] = d10;
    }
}
