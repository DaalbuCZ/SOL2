package l0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k0.m;
import k0.r;
import k0.u;
/* loaded from: classes.dex */
public class g extends r {

    /* renamed from: j  reason: collision with root package name */
    private static final String f11053j = k0.j.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final i f11054a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11055b;

    /* renamed from: c  reason: collision with root package name */
    private final k0.d f11056c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends u> f11057d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f11058e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f11059f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f11060g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11061h;

    /* renamed from: i  reason: collision with root package name */
    private m f11062i;

    public g(i iVar, String str, k0.d dVar, List<? extends u> list, List<g> list2) {
        this.f11054a = iVar;
        this.f11055b = str;
        this.f11056c = dVar;
        this.f11057d = list;
        this.f11060g = list2;
        this.f11058e = new ArrayList(list.size());
        this.f11059f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f11059f.addAll(gVar.f11059f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String b10 = list.get(i10).b();
            this.f11058e.add(b10);
            this.f11059f.add(b10);
        }
    }

    public g(i iVar, List<? extends u> list) {
        this(iVar, null, k0.d.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        for (String str : set) {
            if (l10.contains(str)) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                if (i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                hashSet.addAll(gVar2.c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (this.f11061h) {
            k0.j.c().h(f11053j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f11058e)), new Throwable[0]);
        } else {
            t0.b bVar = new t0.b(this);
            this.f11054a.p().b(bVar);
            this.f11062i = bVar.d();
        }
        return this.f11062i;
    }

    public k0.d b() {
        return this.f11056c;
    }

    public List<String> c() {
        return this.f11058e;
    }

    public String d() {
        return this.f11055b;
    }

    public List<g> e() {
        return this.f11060g;
    }

    public List<? extends u> f() {
        return this.f11057d;
    }

    public i g() {
        return this.f11054a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f11061h;
    }

    public void k() {
        this.f11061h = true;
    }
}
