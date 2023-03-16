package r;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import r.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: n  reason: collision with root package name */
    protected boolean f12944n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f12945o;

    /* renamed from: p  reason: collision with root package name */
    protected Cursor f12946p;

    /* renamed from: q  reason: collision with root package name */
    protected Context f12947q;

    /* renamed from: r  reason: collision with root package name */
    protected int f12948r;

    /* renamed from: s  reason: collision with root package name */
    protected C0187a f12949s;

    /* renamed from: t  reason: collision with root package name */
    protected DataSetObserver f12950t;

    /* renamed from: u  reason: collision with root package name */
    protected r.b f12951u;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0187a extends ContentObserver {
        C0187a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f12944n = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f12944n = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    @Override // r.b.a
    public Cursor b() {
        return this.f12946p;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f12945o = true;
        } else {
            this.f12945o = false;
        }
        boolean z10 = cursor != null;
        this.f12946p = cursor;
        this.f12944n = z10;
        this.f12947q = context;
        this.f12948r = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f12949s = new C0187a();
            bVar = new b();
        } else {
            bVar = null;
            this.f12949s = null;
        }
        this.f12950t = bVar;
        if (z10) {
            C0187a c0187a = this.f12949s;
            if (c0187a != null) {
                cursor.registerContentObserver(c0187a);
            }
            DataSetObserver dataSetObserver = this.f12950t;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f12944n || (cursor = this.f12946p) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f12944n) {
            this.f12946p.moveToPosition(i10);
            if (view == null) {
                view = g(this.f12947q, this.f12946p, viewGroup);
            }
            e(view, this.f12947q, this.f12946p);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f12951u == null) {
            this.f12951u = new r.b(this);
        }
        return this.f12951u;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f12944n || (cursor = this.f12946p) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f12946p;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f12944n && (cursor = this.f12946p) != null && cursor.moveToPosition(i10)) {
            return this.f12946p.getLong(this.f12948r);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f12944n) {
            if (this.f12946p.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f12947q, this.f12946p, viewGroup);
                }
                e(view, this.f12947q, this.f12946p);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f12945o || (cursor = this.f12946p) == null || cursor.isClosed()) {
            return;
        }
        this.f12944n = this.f12946p.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f12946p;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0187a c0187a = this.f12949s;
            if (c0187a != null) {
                cursor2.unregisterContentObserver(c0187a);
            }
            DataSetObserver dataSetObserver = this.f12950t;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12946p = cursor;
        if (cursor != null) {
            C0187a c0187a2 = this.f12949s;
            if (c0187a2 != null) {
                cursor.registerContentObserver(c0187a2);
            }
            DataSetObserver dataSetObserver2 = this.f12950t;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f12948r = cursor.getColumnIndexOrThrow("_id");
            this.f12944n = true;
            notifyDataSetChanged();
        } else {
            this.f12948r = -1;
            this.f12944n = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
