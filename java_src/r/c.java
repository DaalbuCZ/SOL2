package r;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: v  reason: collision with root package name */
    private int f12955v;

    /* renamed from: w  reason: collision with root package name */
    private int f12956w;

    /* renamed from: x  reason: collision with root package name */
    private LayoutInflater f12957x;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f12956w = i10;
        this.f12955v = i10;
        this.f12957x = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // r.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12957x.inflate(this.f12956w, viewGroup, false);
    }

    @Override // r.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12957x.inflate(this.f12955v, viewGroup, false);
    }
}
