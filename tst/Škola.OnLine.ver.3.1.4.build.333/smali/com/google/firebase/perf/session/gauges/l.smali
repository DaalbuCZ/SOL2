.class public Lcom/google/firebase/perf/session/gauges/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final f:Lz6/a;


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lg7/b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Runtime;

.field private d:Ljava/util/concurrent/ScheduledFuture;

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz6/a;->e()Lz6/a;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/perf/session/gauges/l;->f:Lz6/a;

    return-void
.end method

.method constructor <init>()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/firebase/perf/session/gauges/l;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runtime;)V

    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runtime;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->d:Ljava/util/concurrent/ScheduledFuture;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/firebase/perf/session/gauges/l;->e:J

    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/l;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/l;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-object p2, p0, Lcom/google/firebase/perf/session/gauges/l;->c:Ljava/lang/Runtime;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/perf/session/gauges/l;Lf7/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/l;->g(Lf7/l;)V

    return-void
.end method

.method public static synthetic b(Lcom/google/firebase/perf/session/gauges/l;Lf7/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/l;->f(Lf7/l;)V

    return-void
.end method

.method private d()I
    .locals 5

    sget-object v0, Lf7/k;->s:Lf7/k;

    iget-object v1, p0, Lcom/google/firebase/perf/session/gauges/l;->c:Ljava/lang/Runtime;

    invoke-virtual {v1}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v1

    iget-object v3, p0, Lcom/google/firebase/perf/session/gauges/l;->c:Ljava/lang/Runtime;

    invoke-virtual {v3}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lf7/k;->e(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lf7/o;->c(J)I

    move-result v0

    return v0
.end method

.method public static e(J)Z
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic f(Lf7/l;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/l;->l(Lf7/l;)Lg7/b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private synthetic g(Lf7/l;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/l;->l(Lf7/l;)Lg7/b;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private declared-synchronized h(Lf7/l;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/firebase/perf/session/gauges/k;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/perf/session/gauges/k;-><init>(Lcom/google/firebase/perf/session/gauges/l;Lf7/l;)V

    const-wide/16 v2, 0x0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    sget-object v0, Lcom/google/firebase/perf/session/gauges/l;->f:Lz6/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to collect Memory Metric: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz6/a;->j(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized i(JLf7/l;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iput-wide p1, p0, Lcom/google/firebase/perf/session/gauges/l;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/firebase/perf/session/gauges/j;

    invoke-direct {v1, p0, p3}, Lcom/google/firebase/perf/session/gauges/j;-><init>(Lcom/google/firebase/perf/session/gauges/l;Lf7/l;)V

    const-wide/16 v2, 0x0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v4, p1

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/session/gauges/l;->d:Ljava/util/concurrent/ScheduledFuture;
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    sget-object p2, Lcom/google/firebase/perf/session/gauges/l;->f:Lz6/a;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to start collecting Memory Metrics: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz6/a;->j(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private l(Lf7/l;)Lg7/b;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lf7/l;->b()J

    move-result-wide v0

    invoke-static {}, Lg7/b;->U()Lg7/b$b;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Lg7/b$b;->L(J)Lg7/b$b;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/firebase/perf/session/gauges/l;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lg7/b$b;->M(I)Lg7/b$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object p1

    check-cast p1, Lg7/b;

    return-object p1
.end method


# virtual methods
.method public c(Lf7/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/session/gauges/l;->h(Lf7/l;)V

    return-void
.end method

.method public j(JLf7/l;)V
    .locals 2

    invoke-static {p1, p2}, Lcom/google/firebase/perf/session/gauges/l;->e(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/google/firebase/perf/session/gauges/l;->e:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/perf/session/gauges/l;->k()V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/perf/session/gauges/l;->i(JLf7/l;)V

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/perf/session/gauges/l;->i(JLf7/l;)V

    return-void
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->d:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/perf/session/gauges/l;->d:Ljava/util/concurrent/ScheduledFuture;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/firebase/perf/session/gauges/l;->e:J

    return-void
.end method
