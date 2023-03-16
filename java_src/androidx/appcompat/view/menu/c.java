package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: n  reason: collision with root package name */
    Context f554n;

    /* renamed from: o  reason: collision with root package name */
    LayoutInflater f555o;

    /* renamed from: p  reason: collision with root package name */
    e f556p;

    /* renamed from: q  reason: collision with root package name */
    ExpandedMenuView f557q;

    /* renamed from: r  reason: collision with root package name */
    int f558r;

    /* renamed from: s  reason: collision with root package name */
    int f559s;

    /* renamed from: t  reason: collision with root package name */
    int f560t;

    /* renamed from: u  reason: collision with root package name */
    private j.a f561u;

    /* renamed from: v  reason: collision with root package name */
    a f562v;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: n  reason: collision with root package name */
        private int f563n = -1;

        public a() {
            a();
        }

        void a() {
            g v10 = c.this.f556p.v();
            if (v10 != null) {
                ArrayList<g> z10 = c.this.f556p.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f563n = i10;
                        return;
                    }
                }
            }
            this.f563n = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList<g> z10 = c.this.f556p.z();
            int i11 = i10 + c.this.f558r;
            int i12 = this.f563n;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f556p.z().size() - c.this.f558r;
            return this.f563n < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f555o.inflate(cVar.f560t, viewGroup, false);
            }
            ((k.a) view).d(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.f560t = i10;
        this.f559s = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f554n = context;
        this.f555o = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f562v == null) {
            this.f562v = new a();
        }
        return this.f562v;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f561u;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public k c(ViewGroup viewGroup) {
        if (this.f557q == null) {
            this.f557q = (ExpandedMenuView) this.f555o.inflate(c.g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f562v == null) {
                this.f562v = new a();
            }
            this.f557q.setAdapter((ListAdapter) this.f562v);
            this.f557q.setOnItemClickListener(this);
        }
        return this.f557q;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r3, androidx.appcompat.view.menu.e r4) {
        /*
            r2 = this;
            int r0 = r2.f559s
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f559s
            r0.<init>(r3, r1)
            r2.f554n = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f555o = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f554n
            if (r0 == 0) goto L23
            r2.f554n = r3
            android.view.LayoutInflater r0 = r2.f555o
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f556p = r4
            androidx.appcompat.view.menu.c$a r3 = r2.f562v
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.c.d(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            new f(mVar).d(null);
            j.a aVar = this.f561u;
            if (aVar != null) {
                aVar.c(mVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        a aVar = this.f562v;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
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
        this.f561u = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f556p.M(this.f562v.getItem(i10), this, 0);
    }
}
