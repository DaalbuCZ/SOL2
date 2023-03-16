.class public final Lq5/j0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "awaitEvenIfOnMainThread task continuation executor"

    invoke-static {v0}, Lq5/u;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lq5/j0;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Lt4/j;Lt4/i;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lq5/j0;->i(Lt4/j;Lt4/i;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lt4/j;Lt4/i;)Ljava/lang/Void;
    .locals 0

    invoke-static {p0, p1}, Lq5/j0;->h(Lt4/j;Lt4/i;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/concurrent/CountDownLatch;Lt4/i;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lq5/j0;->g(Ljava/util/concurrent/CountDownLatch;Lt4/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lt4/i;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt4/i<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sget-object v1, Lq5/j0;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq5/g0;

    invoke-direct {v2, v0}, Lq5/g0;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p0, v1, v2}, Lt4/i;->h(Ljava/util/concurrent/Executor;Lt4/a;)Lt4/i;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x4

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {p0}, Lt4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lt4/i;->l()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lt4/i;->n()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lt4/i;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lt4/i;->k()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/util/concurrent/CountDownLatch;JLjava/util/concurrent/TimeUnit;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long/2addr v1, p1

    :goto_0
    :try_start_1
    sget-object p3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, p3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return p0

    :catch_0
    const/4 v0, 0x1

    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sub-long p1, v1, p1

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    throw p0
.end method

.method public static f(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "Lt4/i<",
            "TT;>;>;)",
            "Lt4/i<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    new-instance v1, Lq5/j0$a;

    invoke-direct {v1, p1, v0}, Lq5/j0$a;-><init>(Ljava/util/concurrent/Callable;Lt4/j;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Ljava/util/concurrent/CountDownLatch;Lt4/i;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic h(Lt4/j;Lt4/i;)Ljava/lang/Void;
    .locals 1

    invoke-virtual {p1}, Lt4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lt4/i;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt4/j;->e(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lt4/i;->k()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lt4/j;->d(Ljava/lang/Exception;)Z

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static synthetic i(Lt4/j;Lt4/i;)Ljava/lang/Void;
    .locals 1

    invoke-virtual {p1}, Lt4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lt4/i;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt4/j;->e(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lt4/i;->k()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {p0, p1}, Lt4/j;->d(Ljava/lang/Exception;)Z

    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static j(Ljava/util/concurrent/Executor;Lt4/i;Lt4/i;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lt4/i<",
            "TT;>;",
            "Lt4/i<",
            "TT;>;)",
            "Lt4/i<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    new-instance v1, Lq5/h0;

    invoke-direct {v1, v0}, Lq5/h0;-><init>(Lt4/j;)V

    invoke-virtual {p1, p0, v1}, Lt4/i;->h(Ljava/util/concurrent/Executor;Lt4/a;)Lt4/i;

    invoke-virtual {p2, p0, v1}, Lt4/i;->h(Ljava/util/concurrent/Executor;Lt4/a;)Lt4/i;

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lt4/i;Lt4/i;)Lt4/i;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt4/i<",
            "TT;>;",
            "Lt4/i<",
            "TT;>;)",
            "Lt4/i<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    new-instance v1, Lq5/i0;

    invoke-direct {v1, v0}, Lq5/i0;-><init>(Lt4/j;)V

    invoke-virtual {p0, v1}, Lt4/i;->i(Lt4/a;)Lt4/i;

    invoke-virtual {p1, v1}, Lt4/i;->i(Lt4/a;)Lt4/i;

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p0

    return-object p0
.end method
