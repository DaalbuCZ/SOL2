.class final Lb6/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb6/e$b;
    }
.end annotation


# instance fields
.field private final a:D

.field private final b:D

.field private final c:J

.field private final d:I

.field private final e:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final g:Lj1/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/f<",
            "Lx5/b0;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lv5/b0;

.field private i:I

.field private j:J


# direct methods
.method constructor <init>(DDJLj1/f;Lv5/b0;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDJ",
            "Lj1/f<",
            "Lx5/b0;",
            ">;",
            "Lv5/b0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lb6/e;->a:D

    iput-wide p3, p0, Lb6/e;->b:D

    iput-wide p5, p0, Lb6/e;->c:J

    iput-object p7, p0, Lb6/e;->g:Lj1/f;

    iput-object p8, p0, Lb6/e;->h:Lv5/b0;

    double-to-int p1, p1

    iput p1, p0, Lb6/e;->d:I

    new-instance p8, Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {p8, p1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p8, p0, Lb6/e;->e:Ljava/util/concurrent/BlockingQueue;

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object p7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 p3, 0x1

    const/4 p4, 0x1

    const-wide/16 p5, 0x0

    move-object p2, p1

    invoke-direct/range {p2 .. p8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object p1, p0, Lb6/e;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 p1, 0x0

    iput p1, p0, Lb6/e;->i:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lb6/e;->j:J

    return-void
.end method

.method constructor <init>(Lj1/f;Lc6/d;Lv5/b0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/f<",
            "Lx5/b0;",
            ">;",
            "Lc6/d;",
            "Lv5/b0;",
            ")V"
        }
    .end annotation

    iget-wide v1, p2, Lc6/d;->f:D

    iget-wide v3, p2, Lc6/d;->g:D

    iget p2, p2, Lc6/d;->h:I

    int-to-long v5, p2

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    move-object v0, p0

    move-object v7, p1

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Lb6/e;-><init>(DDJLj1/f;Lv5/b0;)V

    return-void
.end method

.method public static synthetic a(Lb6/e;Ly4/j;Lv5/p;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb6/e;->n(Ly4/j;Lv5/p;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic b(Lb6/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0, p1}, Lb6/e;->m(Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method static synthetic c(Lb6/e;Lv5/p;Ly4/j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb6/e;->p(Lv5/p;Ly4/j;)V

    return-void
.end method

.method static synthetic d(Lb6/e;)Lv5/b0;
    .locals 0

    iget-object p0, p0, Lb6/e;->h:Lv5/b0;

    return-object p0
.end method

.method static synthetic e(Lb6/e;)D
    .locals 2

    invoke-direct {p0}, Lb6/e;->g()D

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic f(D)V
    .locals 0

    invoke-static {p0, p1}, Lb6/e;->q(D)V

    return-void
.end method

.method private g()D
    .locals 6

    iget-wide v0, p0, Lb6/e;->a:D

    const-wide v2, 0x40ed4c0000000000L    # 60000.0

    div-double/2addr v2, v0

    iget-wide v0, p0, Lb6/e;->b:D

    invoke-direct {p0}, Lb6/e;->h()I

    move-result v4

    int-to-double v4, v4

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    mul-double/2addr v2, v0

    const-wide v0, 0x414b774000000000L    # 3600000.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method private h()I
    .locals 4

    iget-wide v0, p0, Lb6/e;->j:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-direct {p0}, Lb6/e;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lb6/e;->j:J

    :cond_0
    invoke-direct {p0}, Lb6/e;->o()J

    move-result-wide v0

    iget-wide v2, p0, Lb6/e;->j:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lb6/e;->c:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-direct {p0}, Lb6/e;->l()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x64

    iget v2, p0, Lb6/e;->i:I

    add-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    iget v2, p0, Lb6/e;->i:I

    sub-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_0
    iget v1, p0, Lb6/e;->i:I

    if-eq v1, v0, :cond_2

    iput v0, p0, Lb6/e;->i:I

    invoke-direct {p0}, Lb6/e;->o()J

    move-result-wide v1

    iput-wide v1, p0, Lb6/e;->j:J

    :cond_2
    return v0
.end method

.method private k()Z
    .locals 2

    iget-object v0, p0, Lb6/e;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget v1, p0, Lb6/e;->d:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private l()Z
    .locals 2

    iget-object v0, p0, Lb6/e;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    iget v1, p0, Lb6/e;->d:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private synthetic m(Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lb6/e;->g:Lj1/f;

    sget-object v1, Lj1/d;->p:Lj1/d;

    invoke-static {v0, v1}, Ll1/l;->b(Lj1/f;Lj1/d;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private synthetic n(Ly4/j;Lv5/p;Ljava/lang/Exception;)V
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p1, p3}, Ly4/j;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, Lb6/e;->j()V

    invoke-virtual {p1, p2}, Ly4/j;->e(Ljava/lang/Object;)Z

    return-void
.end method

.method private o()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private p(Lv5/p;Ly4/j;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/p;",
            "Ly4/j<",
            "Lv5/p;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending report through Google DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv5/p;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lb6/e;->g:Lj1/f;

    invoke-virtual {p1}, Lv5/p;->b()Lx5/b0;

    move-result-object v1

    invoke-static {v1}, Lj1/c;->e(Ljava/lang/Object;)Lj1/c;

    move-result-object v1

    new-instance v2, Lb6/c;

    invoke-direct {v2, p0, p2, p1}, Lb6/c;-><init>(Lb6/e;Ly4/j;Lv5/p;)V

    invoke-interface {v0, v1, v2}, Lj1/f;->a(Lj1/c;Lj1/h;)V

    return-void
.end method

.method private static q(D)V
    .locals 0

    double-to-long p0, p0

    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method i(Lv5/p;Z)Ly4/j;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv5/p;",
            "Z)",
            "Ly4/j<",
            "Lv5/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb6/e;->e:Ljava/util/concurrent/BlockingQueue;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ly4/j;

    invoke-direct {v1}, Ly4/j;-><init>()V

    if-eqz p2, :cond_1

    iget-object p2, p0, Lb6/e;->h:Lv5/b0;

    invoke-virtual {p2}, Lv5/b0;->d()V

    invoke-direct {p0}, Lb6/e;->k()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enqueueing report: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv5/p;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Queue size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lb6/e;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v3}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object p2, p0, Lb6/e;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v2, Lb6/e$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v1, v3}, Lb6/e$b;-><init>(Lb6/e;Lv5/p;Ly4/j;Lb6/e$a;)V

    invoke-virtual {p2, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Closing task for report: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv5/p;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ly4/j;->e(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-direct {p0}, Lb6/e;->h()I

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Dropping report due to queue being full: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lv5/p;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object p2, p0, Lb6/e;->h:Lv5/b0;

    invoke-virtual {p2}, Lv5/b0;->c()V

    invoke-virtual {v1, p1}, Ly4/j;->e(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_1
    invoke-direct {p0, p1, v1}, Lb6/e;->p(Lv5/p;Ly4/j;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedApi",
            "ThreadPoolCreation"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lb6/d;

    invoke-direct {v2, p0, v0}, Lb6/d;-><init>(Lb6/e;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2

    invoke-static {v0, v2, v3, v1}, Lv5/j0;->e(Ljava/util/concurrent/CountDownLatch;JLjava/util/concurrent/TimeUnit;)Z

    return-void
.end method
