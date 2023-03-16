package f7;

import i7.d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    private String f7319h;

    /* renamed from: a  reason: collision with root package name */
    private h7.d f7312a = h7.d.f8116t;

    /* renamed from: b  reason: collision with root package name */
    private t f7313b = t.f7334n;

    /* renamed from: c  reason: collision with root package name */
    private d f7314c = c.f7276n;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, g<?>> f7315d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<x> f7316e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<x> f7317f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f7318g = false;

    /* renamed from: i  reason: collision with root package name */
    private int f7320i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f7321j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7322k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7323l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7324m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7325n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f7326o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7327p = false;

    /* renamed from: q  reason: collision with root package name */
    private v f7328q = u.f7337n;

    /* renamed from: r  reason: collision with root package name */
    private v f7329r = u.f7338o;

    private void a(String str, int i10, int i11, List<x> list) {
        x xVar;
        x xVar2;
        boolean z10 = l7.d.f11181a;
        x xVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            xVar = d.b.f8360b.b(str);
            if (z10) {
                xVar3 = l7.d.f11183c.b(str);
                xVar2 = l7.d.f11182b.b(str);
            }
            xVar2 = null;
        } else if (i10 == 2 || i11 == 2) {
            return;
        } else {
            x a10 = d.b.f8360b.a(i10, i11);
            if (z10) {
                xVar3 = l7.d.f11183c.a(i10, i11);
                x a11 = l7.d.f11182b.a(i10, i11);
                xVar = a10;
                xVar2 = a11;
            } else {
                xVar = a10;
                xVar2 = null;
            }
        }
        list.add(xVar);
        if (z10) {
            list.add(xVar3);
            list.add(xVar2);
        }
    }

    public e b() {
        List<x> arrayList = new ArrayList<>(this.f7316e.size() + this.f7317f.size() + 3);
        arrayList.addAll(this.f7316e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f7317f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.f7319h, this.f7320i, this.f7321j, arrayList);
        return new e(this.f7312a, this.f7314c, this.f7315d, this.f7318g, this.f7322k, this.f7326o, this.f7324m, this.f7325n, this.f7327p, this.f7323l, this.f7313b, this.f7319h, this.f7320i, this.f7321j, this.f7316e, this.f7317f, arrayList, this.f7328q, this.f7329r);
    }

    public f c(x xVar) {
        this.f7316e.add(xVar);
        return this;
    }
}
