package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class z4 {

    /* renamed from: a  reason: collision with root package name */
    public final z4 f4326a;

    /* renamed from: b  reason: collision with root package name */
    final y f4327b;

    /* renamed from: c  reason: collision with root package name */
    final Map f4328c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map f4329d = new HashMap();

    public z4(z4 z4Var, y yVar) {
        this.f4326a = z4Var;
        this.f4327b = yVar;
    }

    public final z4 a() {
        return new z4(this, this.f4327b);
    }

    public final q b(q qVar) {
        return this.f4327b.a(this, qVar);
    }

    public final q c(f fVar) {
        q qVar = q.f4079c;
        Iterator G = fVar.G();
        while (G.hasNext()) {
            qVar = this.f4327b.a(this, fVar.E(((Integer) G.next()).intValue()));
            if (qVar instanceof h) {
                break;
            }
        }
        return qVar;
    }

    public final q d(String str) {
        if (this.f4328c.containsKey(str)) {
            return (q) this.f4328c.get(str);
        }
        z4 z4Var = this.f4326a;
        if (z4Var != null) {
            return z4Var.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, q qVar) {
        if (this.f4329d.containsKey(str)) {
            return;
        }
        if (qVar == null) {
            this.f4328c.remove(str);
        } else {
            this.f4328c.put(str, qVar);
        }
    }

    public final void f(String str, q qVar) {
        e(str, qVar);
        this.f4329d.put(str, Boolean.TRUE);
    }

    public final void g(String str, q qVar) {
        z4 z4Var;
        if (!this.f4328c.containsKey(str) && (z4Var = this.f4326a) != null && z4Var.h(str)) {
            this.f4326a.g(str, qVar);
        } else if (this.f4329d.containsKey(str)) {
        } else {
            if (qVar == null) {
                this.f4328c.remove(str);
            } else {
                this.f4328c.put(str, qVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f4328c.containsKey(str)) {
            return true;
        }
        z4 z4Var = this.f4326a;
        if (z4Var != null) {
            return z4Var.h(str);
        }
        return false;
    }
}
