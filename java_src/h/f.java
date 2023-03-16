package h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import h.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f7588a;

    /* renamed from: b  reason: collision with root package name */
    final b f7589b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f7590a;

        /* renamed from: b  reason: collision with root package name */
        final Context f7591b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f7592c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final m.g<Menu, Menu> f7593d = new m.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f7591b = context;
            this.f7590a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f7593d.get(menu);
            if (menu2 == null) {
                i.d dVar = new i.d(this.f7591b, (o.a) menu);
                this.f7593d.put(menu, dVar);
                return dVar;
            }
            return menu2;
        }

        @Override // h.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f7590a.onActionItemClicked(e(bVar), new i.c(this.f7591b, (o.b) menuItem));
        }

        @Override // h.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f7590a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // h.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f7590a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // h.b.a
        public void d(b bVar) {
            this.f7590a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f7592c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f7592c.get(i10);
                if (fVar != null && fVar.f7589b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f7591b, bVar);
            this.f7592c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f7588a = context;
        this.f7589b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f7589b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f7589b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new i.d(this.f7588a, (o.a) this.f7589b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f7589b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f7589b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f7589b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f7589b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f7589b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f7589b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f7589b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f7589b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f7589b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f7589b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f7589b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f7589b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f7589b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f7589b.s(z10);
    }
}
