package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public class t9 {

    /* renamed from: c  reason: collision with root package name */
    private static final u8 f4193c = u8.f4236c;

    /* renamed from: a  reason: collision with root package name */
    protected volatile oa f4194a;

    /* renamed from: b  reason: collision with root package name */
    private volatile h8 f4195b;

    public final int a() {
        if (this.f4195b != null) {
            return ((e8) this.f4195b).f3822r.length;
        }
        if (this.f4194a != null) {
            return this.f4194a.d();
        }
        return 0;
    }

    public final h8 b() {
        if (this.f4195b != null) {
            return this.f4195b;
        }
        synchronized (this) {
            if (this.f4195b != null) {
                return this.f4195b;
            }
            this.f4195b = this.f4194a == null ? h8.f3880o : this.f4194a.c();
            return this.f4195b;
        }
    }

    protected final void c(oa oaVar) {
        if (this.f4194a != null) {
            return;
        }
        synchronized (this) {
            if (this.f4194a == null) {
                try {
                    this.f4194a = oaVar;
                    this.f4195b = h8.f3880o;
                } catch (r9 unused) {
                    this.f4194a = oaVar;
                    this.f4195b = h8.f3880o;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t9) {
            t9 t9Var = (t9) obj;
            oa oaVar = this.f4194a;
            oa oaVar2 = t9Var.f4194a;
            if (oaVar == null && oaVar2 == null) {
                return b().equals(t9Var.b());
            }
            if (oaVar == null || oaVar2 == null) {
                if (oaVar != null) {
                    t9Var.c(oaVar.g());
                    return oaVar.equals(t9Var.f4194a);
                }
                c(oaVar2.g());
                return this.f4194a.equals(oaVar2);
            }
            return oaVar.equals(oaVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
