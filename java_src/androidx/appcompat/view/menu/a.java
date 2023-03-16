package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: n  reason: collision with root package name */
    protected Context f522n;

    /* renamed from: o  reason: collision with root package name */
    protected Context f523o;

    /* renamed from: p  reason: collision with root package name */
    protected e f524p;

    /* renamed from: q  reason: collision with root package name */
    protected LayoutInflater f525q;

    /* renamed from: r  reason: collision with root package name */
    protected LayoutInflater f526r;

    /* renamed from: s  reason: collision with root package name */
    private j.a f527s;

    /* renamed from: t  reason: collision with root package name */
    private int f528t;

    /* renamed from: u  reason: collision with root package name */
    private int f529u;

    /* renamed from: v  reason: collision with root package name */
    protected k f530v;

    /* renamed from: w  reason: collision with root package name */
    private int f531w;

    public a(Context context, int i10, int i11) {
        this.f522n = context;
        this.f525q = LayoutInflater.from(context);
        this.f528t = i10;
        this.f529u = i11;
    }

    protected void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f530v).addView(view, i10);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f527s;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public abstract void c(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void d(Context context, e eVar) {
        this.f523o = context;
        this.f526r = LayoutInflater.from(context);
        this.f524p = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        j.a aVar = this.f527s;
        m mVar2 = mVar;
        if (aVar != null) {
            if (mVar == null) {
                mVar2 = this.f524p;
            }
            return aVar.c(mVar2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f530v;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f524p;
        int i10 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> E = this.f524p.E();
            int size = E.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = E.get(i12);
                if (q(i11, gVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View n10 = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n10.setPressed(false);
                        n10.jumpDrawablesToCurrentState();
                    }
                    if (n10 != childAt) {
                        a(n10, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i10)) {
                i10++;
            }
        }
    }

    public k.a g(ViewGroup viewGroup) {
        return (k.a) this.f525q.inflate(this.f529u, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f527s = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f527s;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a g10 = view instanceof k.a ? (k.a) view : g(viewGroup);
        c(gVar, g10);
        return (View) g10;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f530v == null) {
            k kVar = (k) this.f525q.inflate(this.f528t, viewGroup, false);
            this.f530v = kVar;
            kVar.b(this.f524p);
            f(true);
        }
        return this.f530v;
    }

    public void p(int i10) {
        this.f531w = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
