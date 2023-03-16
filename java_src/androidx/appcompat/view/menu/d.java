package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: n  reason: collision with root package name */
    e f565n;

    /* renamed from: o  reason: collision with root package name */
    private int f566o = -1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f567p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f568q;

    /* renamed from: r  reason: collision with root package name */
    private final LayoutInflater f569r;

    /* renamed from: s  reason: collision with root package name */
    private final int f570s;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f568q = z10;
        this.f569r = layoutInflater;
        this.f565n = eVar;
        this.f570s = i10;
        a();
    }

    void a() {
        g v10 = this.f565n.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f565n.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f566o = i10;
                    return;
                }
            }
        }
        this.f566o = -1;
    }

    public e b() {
        return this.f565n;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f568q ? this.f565n.z() : this.f565n.E();
        int i11 = this.f566o;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f567p = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z10 = this.f568q ? this.f565n.z() : this.f565n.E();
        int i10 = this.f566o;
        int size = z10.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f569r.inflate(this.f570s, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f565n.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f567p) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
