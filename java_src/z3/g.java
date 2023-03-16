package z3;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import x3.a;
import x3.f;
/* loaded from: classes.dex */
public abstract class g<T extends IInterface> extends c<T> implements a.f {
    private final d S;
    private final Set<Scope> T;
    private final Account U;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public g(Context context, Looper looper, int i10, d dVar, f.a aVar, f.b bVar) {
        this(context, looper, i10, dVar, (y3.c) aVar, (y3.h) bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(Context context, Looper looper, int i10, d dVar, y3.c cVar, y3.h hVar) {
        this(context, looper, h.b(context), w3.e.m(), i10, dVar, (y3.c) o.i(cVar), (y3.h) o.i(hVar));
    }

    protected g(Context context, Looper looper, h hVar, w3.e eVar, int i10, d dVar, y3.c cVar, y3.h hVar2) {
        super(context, looper, hVar, eVar, i10, cVar == null ? null : new e0(cVar), hVar2 == null ? null : new f0(hVar2), dVar.h());
        this.S = dVar;
        this.U = dVar.a();
        this.T = k0(dVar.c());
    }

    private final Set<Scope> k0(Set<Scope> set) {
        Set<Scope> j02 = j0(set);
        for (Scope scope : j02) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return j02;
    }

    @Override // z3.c
    protected final Set<Scope> C() {
        return this.T;
    }

    @Override // x3.a.f
    public Set<Scope> c() {
        return n() ? this.T : Collections.emptySet();
    }

    protected Set<Scope> j0(Set<Scope> set) {
        return set;
    }

    @Override // z3.c
    public final Account u() {
        return this.U;
    }

    @Override // z3.c
    protected final Executor w() {
        return null;
    }
}
