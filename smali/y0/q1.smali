.class public Ly0/q1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Ly0/y;

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private final e:Ljava/util/concurrent/ExecutorService;

.field private final f:Ly0/a0;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Ly0/s2;

.field private final j:Ly0/t;

.field private final k:Ly0/j3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Ly0/e0;

.field private final m:Ly0/s;

.field private final n:Ly0/f2;

.field private final o:Ly0/z0;

.field private p:Ly0/p2;

.field private volatile q:Ly0/k3;

.field private r:Ly0/z1;

.field private volatile s:Z

.field private volatile t:Z

.field private volatile u:Z

.field private final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "*>;>;"
        }
    .end annotation
.end field

.field private w:J

.field private final x:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly0/s2;Ly0/t;Ly0/f2;Ly0/j3;Ly0/e0;Ly0/s;Ly0/z0;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ly0/s2;",
            "Ly0/t;",
            "Ly0/f2;",
            "Ly0/j3<",
            "Ljava/lang/String;",
            ">;",
            "Ly0/e0;",
            "Ly0/s;",
            "Ly0/z0;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0/q1;->s:Z

    iput-boolean v0, p0, Ly0/q1;->t:Z

    iput-boolean v0, p0, Ly0/q1;->u:Z

    const-wide/32 v0, 0x500000

    iput-wide v0, p0, Ly0/q1;->w:J

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Ly0/q1;->g:Ljava/lang/String;

    iput-object p2, p0, Ly0/q1;->i:Ly0/s2;

    iput-object p3, p0, Ly0/q1;->j:Ly0/t;

    iput-object p5, p0, Ly0/q1;->k:Ly0/j3;

    iput-object p6, p0, Ly0/q1;->l:Ly0/e0;

    iput-object p7, p0, Ly0/q1;->m:Ly0/s;

    iput-object p4, p0, Ly0/q1;->n:Ly0/f2;

    iput-object p8, p0, Ly0/q1;->o:Ly0/z0;

    iput-object p9, p0, Ly0/q1;->h:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    iput-object p2, p0, Ly0/q1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p3

    iput-object p3, p0, Ly0/q1;->d:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Ly0/y;

    check-cast p3, Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance p5, Ly0/q1$a;

    invoke-direct {p5, p0}, Ly0/q1$a;-><init>(Ly0/q1;)V

    const/16 p6, 0x1388

    const/16 p7, 0x14

    invoke-direct {p4, p3, p6, p7, p5}, Ly0/y;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;IILy0/y$c;)V

    iput-object p4, p0, Ly0/q1;->c:Ly0/y;

    invoke-static {p2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ly0/a0;

    invoke-direct {p2}, Ly0/a0;-><init>()V

    iput-object p2, p0, Ly0/q1;->f:Ly0/a0;

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-direct {p0}, Ly0/q1;->v0()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ly0/q1;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Ly0/q1;->k(Ljava/lang/String;)V

    return-void
.end method

.method private A(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)Ly0/n0;
    .locals 6

    invoke-direct {p0}, Ly0/q1;->u0()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ly0/n0$b;

    invoke-direct {v4}, Ly0/n0$b;-><init>()V

    invoke-virtual {v4, p2}, Ly0/n0$b;->h(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Ly0/n0$b;->i(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Ly0/n0$b;->g(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Ly0/n0$b;->d(Ljava/util/Date;)Ly0/n0$b;

    move-result-object p2

    iget-object p3, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v4

    invoke-virtual {p2, v4, v5}, Ly0/n0$b;->b(J)Ly0/n0$b;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Ly0/n0$b;->c(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p1}, Ly0/n0$c;->e()I

    move-result p1

    invoke-virtual {p2, p1}, Ly0/n0$b;->a(I)Ly0/n0$b;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ly0/n0$b;->f(I)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Ly0/n0$b;->k(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1, v3}, Ly0/n0$b;->j(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Ly0/n0$b;->e()Ly0/n0;

    move-result-object p1

    return-object p1
.end method

.method private F()Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v6, Ly0/l2;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v2, p0, Ly0/q1;->j:Ly0/t;

    iget-wide v3, p0, Ly0/q1;->w:J

    iget-object v5, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ly0/l2;-><init>(Ly0/s2;Ly0/t;JLjava/util/concurrent/atomic/AtomicLong;)V

    iget-object v0, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic G(Ly0/q1;Ly0/k3;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->y(Ly0/k3;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private H(Ly0/k3;)Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/k3;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v6, Ly0/i1;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v2, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v3, p0, Ly0/q1;->g:Ljava/lang/String;

    iget-object v4, p0, Ly0/q1;->m:Ly0/s;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ly0/i1;-><init>(Ly0/s2;Ly0/f2;Ljava/lang/String;Ly0/s;Ly0/k3;)V

    new-instance p1, Ly0/u1;

    iget-object v0, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v2, p0, Ly0/q1;->g:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, v6}, Ly0/u1;-><init>(Ly0/f2;Ly0/s2;Ljava/lang/String;Ly0/i1;)V

    iget-object v0, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method static synthetic J(Ly0/q1;)Z
    .locals 0

    iget-boolean p0, p0, Ly0/q1;->t:Z

    return p0
.end method

.method private K(Ly0/z1;)Z
    .locals 0

    :try_start_0
    invoke-direct {p0, p1}, Ly0/q1;->x(Ly0/z1;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {p1}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method private L(Ly0/k3;)J
    .locals 2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ly0/k3;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x1e

    const/16 v0, 0x12c

    goto :goto_1

    :cond_1
    :goto_0
    const/16 p1, 0xa

    const/16 v0, 0x46

    :goto_1
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    sub-int/2addr v0, p1

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/2addr v0, p1

    int-to-long v0, v0

    return-wide v0
.end method

.method static synthetic M(Ly0/q1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Ly0/q1;->h0()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static synthetic N(Ly0/q1;Ly0/k3;)Ly0/k3;
    .locals 0

    iput-object p1, p0, Ly0/q1;->q:Ly0/k3;

    return-object p1
.end method

.method private O()V
    .locals 0

    invoke-direct {p0}, Ly0/q1;->X()V

    invoke-direct {p0}, Ly0/q1;->S()V

    return-void
.end method

.method static synthetic R(Ly0/q1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Ly0/q1;->f0()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private S()V
    .locals 2

    new-instance v0, Ly0/x2;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    invoke-direct {v0, v1}, Ly0/x2;-><init>(Ly0/s2;)V

    iget-object v1, p0, Ly0/q1;->c:Ly0/y;

    invoke-virtual {v1, v0}, Ly0/y;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method static synthetic T(Ly0/q1;Ly0/k3;)V
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->t(Ly0/k3;)V

    return-void
.end method

.method private U(Ly0/k3;)V
    .locals 11

    iget-object v0, p0, Ly0/q1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Ly0/q1$f;

    invoke-direct {v1, p0}, Ly0/q1$f;-><init>(Ly0/q1;)V

    invoke-direct {p0, p1}, Ly0/q1;->L(Ly0/k3;)J

    move-result-wide v2

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x12c

    move-object v6, v10

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, p0, Ly0/q1;->f:Ly0/a0;

    sget-wide v1, Ly0/a0;->b:J

    new-instance v3, Ly0/q1$g;

    invoke-direct {v3, p0, p1}, Ly0/q1$g;-><init>(Ly0/q1;Ly0/k3;)V

    invoke-virtual {v0, v1, v2, v3}, Ly0/a0;->b(JLy0/a0$c;)V

    iget-object v4, p0, Ly0/q1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v5, Ly0/q1$h;

    invoke-direct {v5, p0}, Ly0/q1$h;-><init>(Ly0/q1;)V

    const-wide/16 v6, 0x5

    const-wide/16 v8, 0xa

    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic W(Ly0/q1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Ly0/q1;->c0()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private X()V
    .locals 2

    new-instance v0, Ly0/b3;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    invoke-direct {v0, v1}, Ly0/b3;-><init>(Ly0/s2;)V

    iget-object v1, p0, Ly0/q1;->c:Ly0/y;

    invoke-virtual {v1, v0}, Ly0/y;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method static synthetic Z(Ly0/q1;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    iget-object p0, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method private a([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;
    .locals 4

    iget-object v0, p0, Ly0/q1;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    array-length v0, p1

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    :goto_0
    array-length v0, p1

    if-ge v1, v0, :cond_1

    aget-object v0, p1, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ly0/q1;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method private a0()V
    .locals 1

    iget-object v0, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Ly0/q1;->y0()V

    :cond_0
    invoke-direct {p0}, Ly0/q1;->O()V

    invoke-direct {p0}, Ly0/q1;->F()Ljava/util/concurrent/Future;

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;
    .locals 9

    invoke-virtual {p0}, Ly0/q1;->s0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly0/u0;->a(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Ly0/d3;->a()Ly0/d3$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ly0/d3$b;->d(Ljava/util/UUID;)Ly0/d3$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Ly0/d3$b;->j(Ljava/lang/String;)Ly0/d3$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Ly0/d3$b;->h(Ljava/lang/String;)Ly0/d3$b;

    move-result-object p1

    invoke-virtual {p1, p3}, Ly0/d3$b;->l(Ljava/lang/String;)Ly0/d3$b;

    move-result-object p1

    invoke-virtual {p1}, Ly0/d3$b;->f()Ly0/d3;

    move-result-object v4

    new-instance v3, Ly0/x1;

    iget-object p1, p0, Ly0/q1;->i:Ly0/s2;

    invoke-direct {v3, p1}, Ly0/x1;-><init>(Ly0/s2;)V

    new-instance v6, Ly0/t1;

    invoke-direct {v6}, Ly0/t1;-><init>()V

    new-instance p1, Ly0/b0;

    iget-object v2, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v5, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v7, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v8, p0, Ly0/q1;->q:Ly0/k3;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Ly0/b0;-><init>(Ly0/s2;Ly0/i2;Ljava/lang/Object;Ly0/f2;Ly0/l1;Ljava/util/concurrent/atomic/AtomicLong;Ly0/k3;)V

    invoke-direct {p0, p1}, Ly0/q1;->m(Ljava/util/concurrent/Callable;)V

    sget-object p1, Ly0/n0$c;->t:Ly0/n0$c;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p4, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private c(Ly0/n0;)Ljava/util/concurrent/Callable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/n0;",
            ")",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v2, Ly0/b2;

    iget-object v0, p0, Ly0/q1;->i:Ly0/s2;

    invoke-direct {v2, v0}, Ly0/b2;-><init>(Ly0/s2;)V

    new-instance v5, Ly0/e2;

    invoke-direct {v5}, Ly0/e2;-><init>()V

    new-instance v8, Ly0/b0;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v4, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v6, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v7, p0, Ly0/q1;->q:Ly0/k3;

    move-object v0, v8

    move-object v3, p1

    invoke-direct/range {v0 .. v7}, Ly0/b0;-><init>(Ly0/s2;Ly0/i2;Ljava/lang/Object;Ly0/f2;Ly0/l1;Ljava/util/concurrent/atomic/AtomicLong;Ly0/k3;)V

    return-object v8
.end method

.method private c0()Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly0/d1;

    iget-object v1, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v2, p0, Ly0/q1;->k:Ly0/j3;

    invoke-direct {p0}, Ly0/q1;->r0()Ly0/c3;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ly0/d1;-><init>(Ly0/f2;Ly0/j3;Ly0/c3;)V

    iget-object v1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Ly0/q1;Ly0/n0;)Ljava/util/concurrent/Callable;
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->c(Ly0/n0;)Ljava/util/concurrent/Callable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d0(Ly0/q1;)Ly0/a0;
    .locals 0

    iget-object p0, p0, Ly0/q1;->f:Ly0/a0;

    return-object p0
.end method

.method static synthetic e(Ly0/q1;Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)Ly0/n0;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly0/q1;->A(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)Ly0/n0;

    move-result-object p0

    return-object p0
.end method

.method private f(Ljava/lang/String;J)Ly0/z1;
    .locals 2

    new-instance v0, Ly0/z1$a;

    invoke-direct {v0}, Ly0/z1$a;-><init>()V

    invoke-virtual {v0, p2, p3}, Ly0/z1$a;->i(J)Ly0/z1$a;

    move-result-object p2

    new-instance p3, Ly0/l0;

    new-instance v0, Ly0/g0;

    invoke-direct {v0, p1}, Ly0/g0;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p1}, Ly0/s;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, v0, p1, v1}, Ly0/l0;-><init>(Ly0/g0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ly0/z1$a;->f(Ly0/l0;)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->i()F

    move-result p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->a(F)Ly0/z1$a;

    move-result-object p1

    invoke-direct {p0}, Ly0/q1;->r0()Ly0/c3;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->g(Ly0/c3;)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->o()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ly0/z1$a;->c(J)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->m()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->d(Ljava/lang/String;)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->d()I

    move-result p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->b(I)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->r()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->j(Ljava/lang/String;)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->f()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ly0/z1$a;->k(J)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->l(Ljava/lang/String;)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->n()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ly0/z1$a;->o(J)Ly0/z1$a;

    move-result-object p1

    iget-object p2, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {p2}, Ly0/s;->l()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->p(Ljava/lang/String;)Ly0/z1$a;

    move-result-object p1

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, p2}, Ly0/z1$a;->e(Ljava/util/Date;)Ly0/z1$a;

    move-result-object p1

    invoke-virtual {p0}, Ly0/q1;->s0()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p2

    invoke-static {p2}, Ly0/p0;->g(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ly0/z1$a;->n(Ljava/lang/String;)Ly0/z1$a;

    move-result-object p1

    invoke-virtual {p1}, Ly0/z1$a;->h()Ly0/z1;

    move-result-object p1

    return-object p1
.end method

.method private f0()Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly0/n1;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v2, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v3, p0, Ly0/q1;->g:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Ly0/n1;-><init>(Ly0/s2;Ly0/f2;Ljava/lang/String;)V

    iget-object v1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g(Ly0/q1;Ly0/p2;)Ly0/p2;
    .locals 0

    iput-object p1, p0, Ly0/q1;->p:Ly0/p2;

    return-object p1
.end method

.method static synthetic g0(Ly0/q1;)V
    .locals 0

    invoke-direct {p0}, Ly0/q1;->a0()V

    return-void
.end method

.method private h()V
    .locals 8

    iget-object v0, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Ly0/q3;

    iget-object v2, p0, Ly0/q1;->n:Ly0/f2;

    invoke-direct {p0}, Ly0/q1;->r0()Ly0/c3;

    move-result-object v3

    iget-object v4, p0, Ly0/q1;->k:Ly0/j3;

    new-instance v5, Ly0/q1$d;

    invoke-direct {v5, p0}, Ly0/q1$d;-><init>(Ly0/q1;)V

    iget-object v6, p0, Ly0/q1;->i:Ly0/s2;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ly0/q3;-><init>(Ly0/f2;Ly0/c3;Ly0/j3;Ly0/h2;Ly0/s2;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private h0()Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly0/r1;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v2, p0, Ly0/q1;->n:Ly0/f2;

    invoke-direct {v0, v1, v2}, Ly0/r1;-><init>(Ly0/s2;Ly0/f2;)V

    iget-object v1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i0(Ly0/q1;)Ly0/p2;
    .locals 0

    iget-object p0, p0, Ly0/q1;->p:Ly0/p2;

    return-object p0
.end method

.method private k(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Ly0/q1;->f(Ljava/lang/String;J)Ly0/z1;

    move-result-object p1

    iput-object p1, p0, Ly0/q1;->r:Ly0/z1;

    invoke-direct {p0, p1}, Ly0/q1;->s(Ly0/z1;)V

    return-void
.end method

.method static synthetic k0(Ly0/q1;)Ly0/s2;
    .locals 0

    iget-object p0, p0, Ly0/q1;->i:Ly0/s2;

    return-object p0
.end method

.method private l0()V
    .locals 1

    iget-object v0, p0, Ly0/q1;->c:Ly0/y;

    invoke-virtual {v0}, Ly0/y;->c()V

    iget-object v0, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iget-object v0, p0, Ly0/q1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method private m(Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Ly0/q1;->s:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Ly0/q1;->y0()V

    :cond_0
    iget-object v0, p0, Ly0/q1;->c:Ly0/y;

    invoke-virtual {v0, p1}, Ly0/y;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x1f4

    if-le p1, v0, :cond_2

    iget-object p1, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic n0(Ly0/q1;)Ly0/k3;
    .locals 0

    iget-object p0, p0, Ly0/q1;->q:Ly0/k3;

    return-object p0
.end method

.method private o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ly0/q1;->A(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)Ly0/n0;

    move-result-object p1

    invoke-direct {p0, p1}, Ly0/q1;->c(Ly0/n0;)Ljava/util/concurrent/Callable;

    move-result-object p1

    invoke-direct {p0, p1}, Ly0/q1;->m(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method private o0()V
    .locals 2

    new-instance v0, Ly0/k3$b;

    iget-object v1, p0, Ly0/q1;->q:Ly0/k3;

    invoke-direct {v0, v1}, Ly0/k3$b;-><init>(Ly0/k3;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ly0/k3$b;->b(Z)Ly0/k3$b;

    move-result-object v0

    invoke-virtual {v0}, Ly0/k3$b;->c()Ly0/k3;

    move-result-object v0

    iput-object v0, p0, Ly0/q1;->q:Ly0/k3;

    iget-boolean v0, p0, Ly0/q1;->s:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ly0/q1;->O()V

    invoke-direct {p0}, Ly0/q1;->h0()Ljava/util/concurrent/Future;

    invoke-direct {p0}, Ly0/q1;->f0()Ljava/util/concurrent/Future;

    iget-object v0, p0, Ly0/q1;->q:Ly0/k3;

    invoke-direct {p0, v0}, Ly0/q1;->y(Ly0/k3;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method static synthetic p(Ly0/q1;)V
    .locals 0

    invoke-direct {p0}, Ly0/q1;->h()V

    return-void
.end method

.method static synthetic q(Ly0/q1;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->m(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method static synthetic q0(Ly0/q1;)V
    .locals 0

    invoke-direct {p0}, Ly0/q1;->l0()V

    return-void
.end method

.method static synthetic r(Ly0/q1;Ly0/k3;)V
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->U(Ly0/k3;)V

    return-void
.end method

.method private r0()Ly0/c3;
    .locals 3

    new-instance v0, Ly0/c3$b;

    invoke-direct {v0}, Ly0/c3$b;-><init>()V

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->n(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    iget-object v2, p0, Ly0/q1;->h:Ljava/lang/String;

    invoke-interface {v1, v2}, Ly0/s;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->i(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->g(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->j(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->o(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->f(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->h(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->m(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->k(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->q()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly0/c3$b;->e(J)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly0/c3$b;->a(J)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ly0/c3$b;->b(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    const v1, 0x134b0a2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->l(Ljava/lang/String;)Ly0/c3$b;

    move-result-object v0

    iget-object v1, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v1}, Ly0/s;->p()Z

    move-result v1

    invoke-virtual {v0, v1}, Ly0/c3$b;->c(Z)Ly0/c3$b;

    move-result-object v0

    invoke-virtual {v0}, Ly0/c3$b;->d()Ly0/c3;

    move-result-object v0

    return-object v0
.end method

.method private s(Ly0/z1;)V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;

    invoke-direct {v0}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;-><init>()V

    iget-object v1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    iget-object v1, p0, Ly0/q1;->d:Ljava/util/concurrent/ExecutorService;

    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    iget-object v0, p0, Ly0/q1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Ly0/q1$e;

    invoke-direct {v1, p0, p1}, Ly0/q1$e;-><init>(Ly0/q1;Ly0/z1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private t(Ly0/k3;)V
    .locals 2

    if-eqz p1, :cond_1

    const v0, 0x134b0a2

    :try_start_0
    invoke-virtual {p1}, Ly0/k3;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    const-string v0, "Bugfender-SDK"

    const-string v1, "There\'s a new Bugfender SDK version. Please check bugfender.com."

    invoke-static {v0, v1}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Ly0/q1;->y(Ly0/k3;)Ljava/util/concurrent/Future;

    :cond_1
    invoke-direct {p0}, Ly0/q1;->F()Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {p1}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    :goto_1
    new-instance p1, Ly0/q;

    iget-object v0, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v0}, Ly0/s;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$package_id"

    invoke-direct {p1, v1, v0}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ly0/q1;->n(Ly0/q;)V

    new-instance p1, Ly0/q;

    iget-object v0, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v0}, Ly0/s;->k()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$android_id"

    invoke-direct {p1, v1, v0}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ly0/q1;->n(Ly0/q;)V

    return-void
.end method

.method static synthetic u(Ly0/q1;Ly0/z1;)Z
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->K(Ly0/z1;)Z

    move-result p0

    return p0
.end method

.method private u0()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Ly0/q1;->u:Z

    if-nez v1, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-direct {p0, v1}, Ly0/q1;->a([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;

    move-result-object v5

    const/4 v6, 0x6

    if-nez v5, :cond_0

    array-length v7, v1

    if-lt v7, v6, :cond_2

    :cond_0
    if-nez v5, :cond_1

    aget-object v5, v1, v6

    :cond_1
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0
.end method

.method static synthetic v(Ly0/q1;Z)Z
    .locals 0

    iput-boolean p1, p0, Ly0/q1;->s:Z

    return p1
.end method

.method private v0()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le v2, v4, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, v0, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v4

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-object v0, v0, v3

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic w(Ly0/q1;Ly0/k3;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0, p1}, Ly0/q1;->H(Ly0/k3;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private x(Ly0/z1;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/z1;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly0/y2;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    invoke-direct {v0, v1, p1}, Ly0/y2;-><init>(Ly0/s2;Ly0/z1;)V

    iget-object p1, p0, Ly0/q1;->c:Ly0/y;

    invoke-virtual {p1, v0}, Ly0/y;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method private y(Ly0/k3;)Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/k3;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ly0/n2<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    new-instance v6, Ly0/i1;

    iget-object v1, p0, Ly0/q1;->i:Ly0/s2;

    iget-object v2, p0, Ly0/q1;->n:Ly0/f2;

    iget-object v3, p0, Ly0/q1;->g:Ljava/lang/String;

    iget-object v4, p0, Ly0/q1;->m:Ly0/s;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ly0/i1;-><init>(Ly0/s2;Ly0/f2;Ljava/lang/String;Ly0/s;Ly0/k3;)V

    iget-object p1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method private y0()V
    .locals 3

    iget-object v0, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Callable;

    iget-object v2, p0, Ly0/q1;->c:Ly0/y;

    invoke-virtual {v2, v1}, Ly0/y;->b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/q1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method static synthetic z(Ly0/q1;)Ly0/e0;
    .locals 0

    iget-object p0, p0, Ly0/q1;->l:Ly0/e0;

    return-object p0
.end method


# virtual methods
.method public B()V
    .locals 2

    iget-object v0, p0, Ly0/q1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Ly0/q1$c;

    invoke-direct {v1, p0}, Ly0/q1$c;-><init>(Ly0/q1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ly0/o0;

    iget-object v1, p0, Ly0/q1;->k:Ly0/j3;

    iget-object v2, p0, Ly0/q1;->n:Ly0/f2;

    invoke-direct {p0}, Ly0/q1;->r0()Ly0/c3;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Ly0/o0;-><init>(Ly0/j3;Ly0/f2;Ly0/c3;Ljava/lang/String;)V

    iget-object p1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public D(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly0/n0$c;->q:Ly0/n0$c;

    invoke-direct {p0, v0, p1, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public E(Z)V
    .locals 0

    iput-boolean p1, p0, Ly0/q1;->t:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ly0/q1;->l:Ly0/e0;

    invoke-interface {p1}, Ly0/e0;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ly0/q1;->o0()V

    :cond_0
    return-void
.end method

.method public I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly0/n0$c;->t:Ly0/n0$c;

    invoke-direct {p0, v0, p1, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public P(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly0/n0$c;->s:Ly0/n0$c;

    invoke-direct {p0, v0, p1, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public Q(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    iget-object v0, p0, Ly0/q1;->o:Ly0/z0;

    const-string v1, "crash"

    const-string v2, "bf_issue"

    invoke-direct {p0, p1, p2, v1, v2}, Ly0/q1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly0/z0;->c(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public V(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "bf_issue"

    invoke-direct {p0, p1, p2, v0, v1}, Ly0/q1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method

.method public Y(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Ly0/q1;->o:Ly0/z0;

    invoke-virtual {p0, p1, p2}, Ly0/q1;->V(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly0/z0;->c(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public b0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;
    .locals 2

    const-string v0, "user-feedback"

    const-string v1, "bf_issue"

    invoke-direct {p0, p1, p2, v0, v1}, Ly0/q1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method

.method public e0(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Ly0/q1;->o:Ly0/z0;

    invoke-virtual {p0, p1, p2}, Ly0/q1;->b0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ly0/z0;->c(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public i(ILjava/lang/String;Ljava/lang/String;Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ly0/n0$b;

    invoke-direct {v2}, Ly0/n0$b;-><init>()V

    invoke-virtual {v2, p5}, Ly0/n0$b;->h(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p5

    invoke-virtual {p5, p6}, Ly0/n0$b;->i(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p5

    invoke-virtual {p5, p2}, Ly0/n0$b;->g(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    new-instance p5, Ljava/util/Date;

    invoke-direct {p5}, Ljava/util/Date;-><init>()V

    invoke-virtual {p2, p5}, Ly0/n0$b;->d(Ljava/util/Date;)Ly0/n0$b;

    move-result-object p2

    iget-object p5, p0, Ly0/q1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p5

    invoke-virtual {p2, p5, p6}, Ly0/n0$b;->b(J)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Ly0/n0$b;->c(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p4}, Ly0/n0$c;->e()I

    move-result p3

    invoke-virtual {p2, p3}, Ly0/n0$b;->a(I)Ly0/n0$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Ly0/n0$b;->f(I)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ly0/n0$b;->j(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ly0/n0$b;->k(Ljava/lang/String;)Ly0/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Ly0/n0$b;->e()Ly0/n0;

    move-result-object p1

    invoke-direct {p0, p1}, Ly0/q1;->c(Ly0/n0;)Ljava/util/concurrent/Callable;

    move-result-object p1

    invoke-direct {p0, p1}, Ly0/q1;->m(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public j(J)V
    .locals 4

    const-wide/32 v0, 0x3200000

    cmp-long v2, p1, v0

    const-string v3, "Bugfender-SDK"

    if-lez v2, :cond_0

    iput-wide v0, p0, Ly0/q1;->w:J

    const-string p1, "Provided maximum local storage size is higher than 50 MB. Setting it to 50 MB."

    :goto_0
    invoke-static {v3, p1}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    iput-wide v0, p0, Ly0/q1;->w:J

    const-string p1, "Provided maximum local storage size is lower than 1 MB. Setting it to 1 MB."

    goto :goto_0

    :cond_1
    iput-wide p1, p0, Ly0/q1;->w:J

    :goto_1
    return-void
.end method

.method public j0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly0/n0$c;->r:Ly0/n0$c;

    invoke-direct {p0, v0, p1, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly0/n0$c;->o:Ly0/n0$c;

    invoke-direct {p0, v0, p1, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ly0/n0$c;->p:Ly0/n0$c;

    invoke-direct {p0, v0, p1, p2}, Ly0/q1;->o(Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public n(Ly0/q;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ly0/q<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Ly0/o2;

    iget-object v1, p0, Ly0/q1;->k:Ly0/j3;

    new-instance v2, Ly0/q1$b;

    invoke-direct {v2, p0, p1}, Ly0/q1$b;-><init>(Ly0/q1;Ly0/q;)V

    invoke-direct {v0, v1, p1, v2}, Ly0/o2;-><init>(Ly0/j3;Ly0/q;Ly0/h2;)V

    iget-object p1, p0, Ly0/q1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public p0()V
    .locals 1

    iget-object v0, p0, Ly0/q1;->l:Ly0/e0;

    invoke-interface {v0}, Ly0/e0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ly0/q1;->o0()V

    :cond_0
    return-void
.end method

.method public s0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/q1;->m:Ly0/s;

    invoke-interface {v0}, Ly0/s;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public t0()Ljava/net/URL;
    .locals 2

    iget-object v0, p0, Ly0/q1;->o:Ly0/z0;

    invoke-virtual {p0}, Ly0/q1;->s0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly0/z0;->a(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public w0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/q1;->r:Ly0/z1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly0/z1;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public x0()Ljava/net/URL;
    .locals 2

    invoke-virtual {p0}, Ly0/q1;->w0()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ly0/q1;->o:Ly0/z0;

    invoke-virtual {v1, v0}, Ly0/z0;->d(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
