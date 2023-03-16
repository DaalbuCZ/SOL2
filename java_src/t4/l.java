package t4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class l {
    public static <TResult> TResult a(i<TResult> iVar) {
        z3.o.g();
        z3.o.j(iVar, "Task must not be null");
        if (iVar.o()) {
            return (TResult) j(iVar);
        }
        o oVar = new o(null);
        k(iVar, oVar);
        oVar.d();
        return (TResult) j(iVar);
    }

    public static <TResult> TResult b(i<TResult> iVar, long j10, TimeUnit timeUnit) {
        z3.o.g();
        z3.o.j(iVar, "Task must not be null");
        z3.o.j(timeUnit, "TimeUnit must not be null");
        if (iVar.o()) {
            return (TResult) j(iVar);
        }
        o oVar = new o(null);
        k(iVar, oVar);
        if (oVar.e(j10, timeUnit)) {
            return (TResult) j(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> i<TResult> c(Executor executor, Callable<TResult> callable) {
        z3.o.j(executor, "Executor must not be null");
        z3.o.j(callable, "Callback must not be null");
        j0 j0Var = new j0();
        executor.execute(new k0(j0Var, callable));
        return j0Var;
    }

    public static <TResult> i<TResult> d(Exception exc) {
        j0 j0Var = new j0();
        j0Var.s(exc);
        return j0Var;
    }

    public static <TResult> i<TResult> e(TResult tresult) {
        j0 j0Var = new j0();
        j0Var.t(tresult);
        return j0Var;
    }

    public static i<Void> f(Collection<? extends i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        for (i<?> iVar : collection) {
            Objects.requireNonNull(iVar, "null tasks are not accepted");
        }
        j0 j0Var = new j0();
        q qVar = new q(collection.size(), j0Var);
        for (i<?> iVar2 : collection) {
            k(iVar2, qVar);
        }
        return j0Var;
    }

    public static i<Void> g(i<?>... iVarArr) {
        return (iVarArr == null || iVarArr.length == 0) ? e(null) : f(Arrays.asList(iVarArr));
    }

    public static i<List<i<?>>> h(Collection<? extends i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(Collections.emptyList());
        }
        return f(collection).j(k.f14741a, new m(collection));
    }

    public static i<List<i<?>>> i(i<?>... iVarArr) {
        return (iVarArr == null || iVarArr.length == 0) ? e(Collections.emptyList()) : h(Arrays.asList(iVarArr));
    }

    private static Object j(i iVar) {
        if (iVar.p()) {
            return iVar.l();
        }
        if (iVar.n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.k());
    }

    private static void k(i iVar, p pVar) {
        Executor executor = k.f14742b;
        iVar.f(executor, pVar);
        iVar.d(executor, pVar);
        iVar.a(executor, pVar);
    }
}
