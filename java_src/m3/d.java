package m3;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    private int f11348f;

    /* renamed from: h  reason: collision with root package name */
    private int f11350h;

    /* renamed from: o  reason: collision with root package name */
    private float f11357o;

    /* renamed from: a  reason: collision with root package name */
    private String f11343a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f11344b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f11345c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f11346d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f11347e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11349g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11351i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f11352j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f11353k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f11354l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f11355m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f11356n = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f11358p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11359q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f11353k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f11351i) {
            return this.f11350h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f11359q;
    }

    public int c() {
        if (this.f11349g) {
            return this.f11348f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f11347e;
    }

    public float e() {
        return this.f11357o;
    }

    public int f() {
        return this.f11356n;
    }

    public int g() {
        return this.f11358p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f11343a.isEmpty() && this.f11344b.isEmpty() && this.f11345c.isEmpty() && this.f11346d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f11343a, str, 1073741824), this.f11344b, str2, 2), this.f11346d, str3, 4);
        if (B == -1 || !set.containsAll(this.f11345c)) {
            return 0;
        }
        return B + (this.f11345c.size() * 4);
    }

    public int i() {
        int i10 = this.f11354l;
        if (i10 == -1 && this.f11355m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f11355m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f11351i;
    }

    public boolean k() {
        return this.f11349g;
    }

    public boolean l() {
        return this.f11352j == 1;
    }

    public boolean m() {
        return this.f11353k == 1;
    }

    public d n(int i10) {
        this.f11350h = i10;
        this.f11351i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f11354l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f11359q = z10;
        return this;
    }

    public d q(int i10) {
        this.f11348f = i10;
        this.f11349g = true;
        return this;
    }

    public d r(String str) {
        this.f11347e = str == null ? null : a5.b.e(str);
        return this;
    }

    public d s(float f10) {
        this.f11357o = f10;
        return this;
    }

    public d t(int i10) {
        this.f11356n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f11355m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f11358p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f11345c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f11343a = str;
    }

    public void y(String str) {
        this.f11344b = str;
    }

    public void z(String str) {
        this.f11346d = str;
    }
}
