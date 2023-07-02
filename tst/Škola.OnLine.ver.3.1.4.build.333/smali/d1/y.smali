.class public Ld1/y;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld1/y$b;,
        Ld1/y$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final b:I

.field private final c:I

.field private d:Z

.field private e:I

.field private final f:Ld1/y$c;

.field private final g:Ld1/y$b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ThreadPoolExecutor;IILd1/y$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld1/y;->d:Z

    iput-object p1, p0, Ld1/y;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iput p2, p0, Ld1/y;->b:I

    iput p3, p0, Ld1/y;->c:I

    iput-object p4, p0, Ld1/y;->f:Ld1/y$c;

    new-instance p1, Ld1/y$b;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ld1/y$b;-><init>(Ld1/y$a;)V

    iput-object p1, p0, Ld1/y;->g:Ld1/y$b;

    return-void
.end method

.method private a()F
    .locals 1

    iget-object v0, p0, Ld1/y;->g:Ld1/y$b;

    invoke-virtual {v0}, Ld1/y$b;->e()V

    iget-object v0, p0, Ld1/y;->g:Ld1/y$b;

    invoke-virtual {v0}, Ld1/y$b;->a()F

    move-result v0

    return v0
.end method

.method private d()V
    .locals 4

    iget-object v0, p0, Ld1/y;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-boolean v1, p0, Ld1/y;->d:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, Ld1/y;->b:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Ld1/y;->a()F

    move-result v1

    iget v3, p0, Ld1/y;->c:I

    int-to-float v3, v3

    cmpg-float v1, v1, v3

    if-gez v1, :cond_0

    iput v0, p0, Ld1/y;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld1/y;->d:Z

    iget-object v0, p0, Ld1/y;->f:Ld1/y$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ld1/y;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Ld1/y;->d:Z

    if-nez v1, :cond_1

    iget v1, p0, Ld1/y;->e:I

    div-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_1

    iput-boolean v2, p0, Ld1/y;->d:Z

    iget-object v0, p0, Ld1/y;->g:Ld1/y$b;

    invoke-virtual {v0}, Ld1/y$b;->f()V

    iget-object v0, p0, Ld1/y;->f:Ld1/y$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ld1/y;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-boolean v3, p0, Ld1/y;->d:Z

    xor-int/2addr v2, v3

    :goto_0
    invoke-interface {v0, v1, v2}, Ld1/y$c;->a(Ljava/util/concurrent/ThreadPoolExecutor;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized b(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Ld1/y;->d()V

    iget-boolean v0, p0, Ld1/y;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld1/y;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Ld1/y;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :cond_0
    return-void
.end method
