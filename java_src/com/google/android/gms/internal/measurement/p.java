package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: p  reason: collision with root package name */
    protected final List f4057p;

    /* renamed from: q  reason: collision with root package name */
    protected final List f4058q;

    /* renamed from: r  reason: collision with root package name */
    protected z4 f4059r;

    private p(p pVar) {
        super(pVar.f3917n);
        ArrayList arrayList = new ArrayList(pVar.f4057p.size());
        this.f4057p = arrayList;
        arrayList.addAll(pVar.f4057p);
        ArrayList arrayList2 = new ArrayList(pVar.f4058q.size());
        this.f4058q = arrayList2;
        arrayList2.addAll(pVar.f4058q);
        this.f4059r = pVar.f4059r;
    }

    public p(String str, List list, List list2, z4 z4Var) {
        super(str);
        this.f4057p = new ArrayList();
        this.f4059r = z4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f4057p.add(((q) it.next()).g());
            }
        }
        this.f4058q = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(z4 z4Var, List list) {
        String str;
        q qVar;
        z4 a10 = this.f4059r.a();
        for (int i10 = 0; i10 < this.f4057p.size(); i10++) {
            if (i10 < list.size()) {
                str = (String) this.f4057p.get(i10);
                qVar = z4Var.b((q) list.get(i10));
            } else {
                str = (String) this.f4057p.get(i10);
                qVar = q.f4079c;
            }
            a10.e(str, qVar);
        }
        for (q qVar2 : this.f4058q) {
            q b10 = a10.b(qVar2);
            if (b10 instanceof r) {
                b10 = a10.b(qVar2);
            }
            if (b10 instanceof h) {
                return ((h) b10).a();
            }
        }
        return q.f4079c;
    }

    @Override // com.google.android.gms.internal.measurement.j, com.google.android.gms.internal.measurement.q
    public final q d() {
        return new p(this);
    }
}
