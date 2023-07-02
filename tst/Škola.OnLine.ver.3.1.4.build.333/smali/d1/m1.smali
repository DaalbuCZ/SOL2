.class public Ld1/m1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/h1;


# instance fields
.field private final a:Ld1/q1;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private e:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ld1/q1;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/m1;->e:Ljava/util/concurrent/Future;

    iput-object p1, p0, Ld1/m1;->b:Ljava/lang/String;

    iput-object p2, p0, Ld1/m1;->a:Ld1/q1;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    iput p1, p0, Ld1/m1;->c:I

    iput-object p3, p0, Ld1/m1;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic b(Ld1/m1;)I
    .locals 0

    iget p0, p0, Ld1/m1;->c:I

    return p0
.end method

.method static synthetic c(Ld1/m1;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    .locals 0

    iput-object p1, p0, Ld1/m1;->e:Ljava/util/concurrent/Future;

    return-object p1
.end method

.method private d(Ld1/f0;Le1/c;)V
    .locals 8

    invoke-virtual {p1}, Ld1/f0;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BF/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Le1/b;

    invoke-virtual {p1}, Ld1/f0;->b()Ld1/k0;

    move-result-object v1

    invoke-virtual {v1}, Ld1/k0;->g()Ld1/b;

    move-result-object v5

    invoke-virtual {p1}, Ld1/f0;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ld1/f0;->c()Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x0

    const-string v3, "logcat"

    const-string v4, "Logcat"

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Le1/b;-><init>(ILjava/lang/String;Ljava/lang/String;Ld1/b;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Le1/c;->a(Le1/b;)Le1/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Ld1/m1;->f(Le1/b;)V

    :cond_1
    return-void
.end method

.method static synthetic e(Ld1/m1;Ld1/f0;Le1/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld1/m1;->d(Ld1/f0;Le1/c;)V

    return-void
.end method

.method private f(Le1/b;)V
    .locals 7

    iget-object v0, p0, Ld1/m1;->a:Ld1/q1;

    invoke-virtual {p1}, Le1/b;->c()I

    move-result v1

    invoke-virtual {p1}, Le1/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Le1/b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Le1/b;->b()Ld1/b;

    move-result-object v4

    invoke-static {v4}, Ld1/n0$c;->g(Ld1/b;)Ld1/n0$c;

    move-result-object v4

    invoke-virtual {p1}, Le1/b;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Le1/b;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Ld1/q1;->i(ILjava/lang/String;Ljava/lang/String;Ld1/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic g(Ld1/m1;)Ljava/util/concurrent/Future;
    .locals 0

    iget-object p0, p0, Ld1/m1;->e:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method static synthetic h(Ld1/m1;)Ld1/q1;
    .locals 0

    iget-object p0, p0, Ld1/m1;->a:Ld1/q1;

    return-object p0
.end method

.method static synthetic i(Ld1/m1;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Ld1/m1;->d:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method


# virtual methods
.method public a(Le1/c;)V
    .locals 8

    new-instance v0, Ld1/m1$a;

    invoke-direct {v0, p0, p1}, Ld1/m1$a;-><init>(Ld1/m1;Le1/c;)V

    new-instance p1, Ld1/c1;

    iget-object v1, p0, Ld1/m1;->b:Ljava/lang/String;

    invoke-direct {p1, v1}, Ld1/c1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ld1/c1;->d(Ld1/c1$a;)V

    iget-object v0, p0, Ld1/m1;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Ld1/m1;->e:Ljava/util/concurrent/Future;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Ld1/m1$b;

    invoke-direct {v2, p0, p1}, Ld1/m1$b;-><init>(Ld1/m1;Ld1/c1;)V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    const-wide/16 v5, 0x5

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
