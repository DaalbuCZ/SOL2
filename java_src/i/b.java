package i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import m.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f8184a;

    /* renamed from: b  reason: collision with root package name */
    private g<o.b, MenuItem> f8185b;

    /* renamed from: c  reason: collision with root package name */
    private g<o.c, SubMenu> f8186c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f8184a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof o.b) {
            o.b bVar = (o.b) menuItem;
            if (this.f8185b == null) {
                this.f8185b = new g<>();
            }
            MenuItem menuItem2 = this.f8185b.get(menuItem);
            if (menuItem2 == null) {
                c cVar = new c(this.f8184a, bVar);
                this.f8185b.put(bVar, cVar);
                return cVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof o.c) {
            o.c cVar = (o.c) subMenu;
            if (this.f8186c == null) {
                this.f8186c = new g<>();
            }
            SubMenu subMenu2 = this.f8186c.get(cVar);
            if (subMenu2 == null) {
                f fVar = new f(this.f8184a, cVar);
                this.f8186c.put(cVar, fVar);
                return fVar;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        g<o.b, MenuItem> gVar = this.f8185b;
        if (gVar != null) {
            gVar.clear();
        }
        g<o.c, SubMenu> gVar2 = this.f8186c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f8185b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f8185b.size()) {
            if (this.f8185b.i(i11).getGroupId() == i10) {
                this.f8185b.j(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f8185b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f8185b.size(); i11++) {
            if (this.f8185b.i(i11).getItemId() == i10) {
                this.f8185b.j(i11);
                return;
            }
        }
    }
}
