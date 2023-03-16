package com.google.protobuf;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: e  reason: collision with root package name */
    private static final p f5954e = p.b();

    /* renamed from: a  reason: collision with root package name */
    private h f5955a;

    /* renamed from: b  reason: collision with root package name */
    private p f5956b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile s0 f5957c;

    /* renamed from: d  reason: collision with root package name */
    private volatile h f5958d;

    protected void a(s0 s0Var) {
        h hVar;
        if (this.f5957c != null) {
            return;
        }
        synchronized (this) {
            if (this.f5957c != null) {
                return;
            }
            try {
                if (this.f5955a != null) {
                    this.f5957c = s0Var.q().a(this.f5955a, this.f5956b);
                    hVar = this.f5955a;
                } else {
                    this.f5957c = s0Var;
                    hVar = h.f5966o;
                }
                this.f5958d = hVar;
            } catch (c0 unused) {
                this.f5957c = s0Var;
                this.f5958d = h.f5966o;
            }
        }
    }

    public int b() {
        if (this.f5958d != null) {
            return this.f5958d.size();
        }
        h hVar = this.f5955a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f5957c != null) {
            return this.f5957c.d();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.f5957c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.f5957c;
        this.f5955a = null;
        this.f5958d = null;
        this.f5957c = s0Var;
        return s0Var2;
    }

    public h e() {
        if (this.f5958d != null) {
            return this.f5958d;
        }
        h hVar = this.f5955a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f5958d != null) {
                return this.f5958d;
            }
            this.f5958d = this.f5957c == null ? h.f5966o : this.f5957c.p();
            return this.f5958d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            s0 s0Var = this.f5957c;
            s0 s0Var2 = f0Var.f5957c;
            return (s0Var == null && s0Var2 == null) ? e().equals(f0Var.e()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.c(s0Var.e())) : c(s0Var2.e()).equals(s0Var2) : s0Var.equals(s0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
