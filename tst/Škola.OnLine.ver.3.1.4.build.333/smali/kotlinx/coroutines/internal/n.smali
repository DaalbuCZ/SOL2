.class public final Lkotlinx/coroutines/internal/n;
.super Lz9/d0;
.source ""

# interfaces
.implements Ljava/lang/Runnable;
.implements Lz9/r0;


# instance fields
.field private final p:Lz9/d0;

.field private final q:I

.field private final synthetic r:Lz9/r0;

.field private volatile runningWorkers:I

.field private final s:Lkotlinx/coroutines/internal/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/internal/s<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz9/d0;I)V
    .locals 0

    invoke-direct {p0}, Lz9/d0;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/internal/n;->p:Lz9/d0;

    iput p2, p0, Lkotlinx/coroutines/internal/n;->q:I

    instance-of p2, p1, Lz9/r0;

    if-eqz p2, :cond_0

    check-cast p1, Lz9/r0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Lz9/q0;->a()Lz9/r0;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lkotlinx/coroutines/internal/n;->r:Lz9/r0;

    new-instance p1, Lkotlinx/coroutines/internal/s;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lkotlinx/coroutines/internal/s;-><init>(Z)V

    iput-object p1, p0, Lkotlinx/coroutines/internal/n;->s:Lkotlinx/coroutines/internal/s;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/internal/n;->t:Ljava/lang/Object;

    return-void
.end method

.method private final Y(Ljava/lang/Runnable;)Z
    .locals 1

    iget-object v0, p0, Lkotlinx/coroutines/internal/n;->s:Lkotlinx/coroutines/internal/s;

    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/s;->a(Ljava/lang/Object;)Z

    iget p1, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    iget v0, p0, Lkotlinx/coroutines/internal/n;->q:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final Z()Z
    .locals 3

    iget-object v0, p0, Lkotlinx/coroutines/internal/n;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    iget v2, p0, Lkotlinx/coroutines/internal/n;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    monitor-exit v0

    return v1

    :cond_0
    :try_start_1
    iget v1, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public b(Lj9/g;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p2}, Lkotlinx/coroutines/internal/n;->Y(Ljava/lang/Runnable;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/n;->Z()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lkotlinx/coroutines/internal/n;->p:Lz9/d0;

    invoke-virtual {p1, p0, p0}, Lz9/d0;->b(Lj9/g;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :cond_0
    iget-object v2, p0, Lkotlinx/coroutines/internal/n;->s:Lkotlinx/coroutines/internal/s;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/s;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    if-eqz v2, :cond_1

    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    sget-object v3, Lj9/h;->n:Lj9/h;

    invoke-static {v3, v2}, Lz9/g0;->a(Lj9/g;Ljava/lang/Throwable;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_0

    iget-object v2, p0, Lkotlinx/coroutines/internal/n;->p:Lz9/d0;

    invoke-virtual {v2, p0}, Lz9/d0;->W(Lj9/g;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lkotlinx/coroutines/internal/n;->p:Lz9/d0;

    invoke-virtual {v0, p0, p0}, Lz9/d0;->b(Lj9/g;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    iget-object v1, p0, Lkotlinx/coroutines/internal/n;->t:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget v2, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    iget-object v2, p0, Lkotlinx/coroutines/internal/n;->s:Lkotlinx/coroutines/internal/s;

    invoke-virtual {v2}, Lkotlinx/coroutines/internal/s;->c()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_2
    iget v2, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lkotlinx/coroutines/internal/n;->runningWorkers:I

    sget-object v2, Lg9/s;->a:Lg9/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method
