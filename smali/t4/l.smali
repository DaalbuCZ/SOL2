.class public final Lt4/l;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lt4/i;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lt4/i<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    invoke-static {}, Lz3/o;->g()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lt4/i;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lt4/l;->j(Lt4/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lt4/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt4/o;-><init>(Lt4/n;)V

    invoke-static {p0, v0}, Lt4/l;->k(Lt4/i;Lt4/p;)V

    invoke-virtual {v0}, Lt4/o;->d()V

    invoke-static {p0}, Lt4/l;->j(Lt4/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lt4/i;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lt4/i<",
            "TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    invoke-static {}, Lz3/o;->g()V

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    invoke-static {p3, v0}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lt4/i;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lt4/l;->j(Lt4/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lt4/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt4/o;-><init>(Lt4/n;)V

    invoke-static {p0, v0}, Lt4/l;->k(Lt4/i;Lt4/p;)V

    invoke-virtual {v0, p1, p2, p3}, Lt4/o;->e(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lt4/l;->j(Lt4/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Timed out waiting for Task"

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Lt4/i<",
            "TTResult;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lt4/j0;

    invoke-direct {v0}, Lt4/j0;-><init>()V

    new-instance v1, Lt4/k0;

    invoke-direct {v1, v0, p1}, Lt4/k0;-><init>(Lt4/j0;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static d(Ljava/lang/Exception;)Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lt4/i<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lt4/j0;

    invoke-direct {v0}, Lt4/j0;-><init>()V

    invoke-virtual {v0, p0}, Lt4/j0;->s(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lt4/i<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lt4/j0;

    invoke-direct {v0}, Lt4/j0;-><init>()V

    invoke-virtual {v0, p0}, Lt4/j0;->t(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static f(Ljava/util/Collection;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lt4/i<",
            "*>;>;)",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt4/i;

    const-string v2, "null tasks are not accepted"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Lt4/j0;

    invoke-direct {v0}, Lt4/j0;-><init>()V

    new-instance v1, Lt4/q;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2, v0}, Lt4/q;-><init>(ILt4/j0;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt4/i;

    invoke-static {v2, v1}, Lt4/l;->k(Lt4/i;Lt4/p;)V

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    invoke-static {p0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static varargs g([Lt4/i;)Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lt4/i<",
            "*>;)",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lt4/l;->f(Ljava/util/Collection;)Lt4/i;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    invoke-static {p0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/util/Collection;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lt4/i<",
            "*>;>;)",
            "Lt4/i<",
            "Ljava/util/List<",
            "Lt4/i<",
            "*>;>;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lt4/l;->f(Ljava/util/Collection;)Lt4/i;

    move-result-object v0

    new-instance v1, Lt4/m;

    invoke-direct {v1, p0}, Lt4/m;-><init>(Ljava/util/Collection;)V

    sget-object p0, Lt4/k;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, p0, v1}, Lt4/i;->j(Ljava/util/concurrent/Executor;Lt4/a;)Lt4/i;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static varargs i([Lt4/i;)Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lt4/i<",
            "*>;)",
            "Lt4/i<",
            "Ljava/util/List<",
            "Lt4/i<",
            "*>;>;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lt4/l;->h(Ljava/util/Collection;)Lt4/i;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method private static j(Lt4/i;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lt4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lt4/i;->l()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lt4/i;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lt4/i;->k()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static k(Lt4/i;Lt4/p;)V
    .locals 1

    sget-object v0, Lt4/k;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lt4/i;->f(Ljava/util/concurrent/Executor;Lt4/f;)Lt4/i;

    invoke-virtual {p0, v0, p1}, Lt4/i;->d(Ljava/util/concurrent/Executor;Lt4/e;)Lt4/i;

    invoke-virtual {p0, v0, p1}, Lt4/i;->a(Ljava/util/concurrent/Executor;Lt4/c;)Lt4/i;

    return-void
.end method
