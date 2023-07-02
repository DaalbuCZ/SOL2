.class public Le7/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/perf/application/a$b;


# static fields
.field private static final E:Lz6/a;

.field private static final F:Le7/k;


# instance fields
.field private A:Lg7/c$b;

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Z

.field private final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Le7/c;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private q:Lk5/e;

.field private r:Lw6/e;

.field private s:Lo6/e;

.field private t:Ln6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/b<",
            "Lj1/g;",
            ">;"
        }
    .end annotation
.end field

.field private u:Le7/b;

.field private v:Ljava/util/concurrent/ExecutorService;

.field private w:Landroid/content/Context;

.field private x:Lcom/google/firebase/perf/config/a;

.field private y:Le7/d;

.field private z:Lcom/google/firebase/perf/application/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz6/a;->e()Lz6/a;

    move-result-object v0

    sput-object v0, Le7/k;->E:Lz6/a;

    new-instance v0, Le7/k;

    invoke-direct {v0}, Le7/k;-><init>()V

    sput-object v0, Le7/k;->F:Le7/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Le7/k;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Le7/k;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Le7/k;->D:Z

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0xa

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Le7/k;->n:Ljava/util/Map;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private D(Lg7/i$b;Lg7/d;)Lg7/i;
    .locals 1

    invoke-direct {p0}, Le7/k;->G()V

    iget-object v0, p0, Le7/k;->A:Lg7/c$b;

    invoke-virtual {v0, p2}, Lg7/c$b;->P(Lg7/d;)Lg7/c$b;

    move-result-object p2

    invoke-virtual {p1}, Lg7/i$b;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lg7/i$b;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/y$a;->E()Lcom/google/protobuf/y$a;

    move-result-object p2

    check-cast p2, Lg7/c$b;

    invoke-direct {p0}, Le7/k;->j()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lg7/c$b;->M(Ljava/util/Map;)Lg7/c$b;

    move-result-object p2

    :cond_1
    invoke-virtual {p1, p2}, Lg7/i$b;->L(Lg7/c$b;)Lg7/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object p1

    check-cast p1, Lg7/i;

    return-object p1
.end method

.method private E()V
    .locals 9

    iget-object v0, p0, Le7/k;->q:Lk5/e;

    invoke-virtual {v0}, Lk5/e;->l()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Le7/k;->w:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le7/k;->B:Ljava/lang/String;

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    iput-object v0, p0, Le7/k;->x:Lcom/google/firebase/perf/config/a;

    new-instance v0, Le7/d;

    iget-object v1, p0, Le7/k;->w:Landroid/content/Context;

    new-instance v8, Lf7/i;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x64

    const-wide/16 v5, 0x1

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lf7/i;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0x1f4

    invoke-direct {v0, v1, v8, v2, v3}, Le7/d;-><init>(Landroid/content/Context;Lf7/i;J)V

    iput-object v0, p0, Le7/k;->y:Le7/d;

    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v0

    iput-object v0, p0, Le7/k;->z:Lcom/google/firebase/perf/application/a;

    new-instance v0, Le7/b;

    iget-object v1, p0, Le7/k;->t:Ln6/b;

    iget-object v2, p0, Le7/k;->x:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v2}, Lcom/google/firebase/perf/config/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Le7/b;-><init>(Ln6/b;Ljava/lang/String;)V

    iput-object v0, p0, Le7/k;->u:Le7/b;

    invoke-direct {p0}, Le7/k;->h()V

    return-void
.end method

.method private F(Lg7/i$b;Lg7/d;)V
    .locals 4

    invoke-virtual {p0}, Le7/k;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Le7/k;->s(Lg7/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Le7/k;->E:Lz6/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Transport is not initialized yet, %s will be queued for to be dispatched later"

    invoke-virtual {v0, v2, v1}, Lz6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le7/k;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Le7/c;

    invoke-direct {v1, p1, p2}, Le7/c;-><init>(Lg7/i$b;Lg7/d;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, Le7/k;->D(Lg7/i$b;Lg7/d;)Lg7/i;

    move-result-object p1

    invoke-direct {p0, p1}, Le7/k;->t(Lg7/i;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p1}, Le7/k;->g(Lg7/i;)V

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->updatePerfSessionIfExpired()Z

    :cond_2
    return-void
.end method

.method private G()V
    .locals 7

    iget-object v0, p0, Le7/k;->x:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le7/k;->A:Lg7/c$b;

    invoke-virtual {v0}, Lg7/c$b;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Le7/k;->D:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Le7/k;->s:Lo6/e;

    invoke-interface {v3}, Lo6/e;->a()Ly4/i;

    move-result-object v3

    const-wide/32 v4, 0xea60

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v3, v4, v5, v6}, Ly4/l;->b(Ly4/i;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v3

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v4, Le7/k;->E:Lz6/a;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/concurrent/TimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Task to retrieve Installation Id is timed out: %s"

    invoke-virtual {v4, v1, v2}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v3

    sget-object v4, Le7/k;->E:Lz6/a;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Task to retrieve Installation Id is interrupted: %s"

    invoke-virtual {v4, v1, v2}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_2
    move-exception v3

    sget-object v4, Le7/k;->E:Lz6/a;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/concurrent/ExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Unable to retrieve Installation Id: %s"

    invoke-virtual {v4, v1, v2}, Lz6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Le7/k;->A:Lg7/c$b;

    invoke-virtual {v1, v0}, Lg7/c$b;->O(Ljava/lang/String;)Lg7/c$b;

    goto :goto_1

    :cond_1
    sget-object v0, Le7/k;->E:Lz6/a;

    const-string v1, "Firebase Installation Id is empty, contact Firebase Support for debugging."

    invoke-virtual {v0, v1}, Lz6/a;->j(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private H()V
    .locals 1

    iget-object v0, p0, Le7/k;->r:Lw6/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Le7/k;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lw6/e;->c()Lw6/e;

    move-result-object v0

    iput-object v0, p0, Le7/k;->r:Lw6/e;

    :cond_0
    return-void
.end method

.method public static synthetic a(Le7/k;Lg7/g;Lg7/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le7/k;->y(Lg7/g;Lg7/d;)V

    return-void
.end method

.method public static synthetic b(Le7/k;)V
    .locals 0

    invoke-direct {p0}, Le7/k;->E()V

    return-void
.end method

.method public static synthetic c(Le7/k;Le7/c;)V
    .locals 0

    invoke-direct {p0, p1}, Le7/k;->v(Le7/c;)V

    return-void
.end method

.method public static synthetic d(Le7/k;)V
    .locals 0

    invoke-direct {p0}, Le7/k;->z()V

    return-void
.end method

.method public static synthetic e(Le7/k;Lg7/h;Lg7/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le7/k;->x(Lg7/h;Lg7/d;)V

    return-void
.end method

.method public static synthetic f(Le7/k;Lg7/m;Lg7/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le7/k;->w(Lg7/m;Lg7/d;)V

    return-void
.end method

.method private g(Lg7/i;)V
    .locals 5

    invoke-virtual {p1}, Lg7/i;->j()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Le7/k;->E:Lz6/a;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {p1}, Lg7/i;->m()Lg7/m;

    move-result-object v1

    invoke-direct {p0, v1}, Le7/k;->i(Lg7/m;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const-string v1, "Logging %s. In a minute, visit the Firebase console to view your data: %s"

    invoke-virtual {v0, v1, v3}, Lz6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Le7/k;->E:Lz6/a;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Logging %s"

    invoke-virtual {v0, v1, v2}, Lz6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Le7/k;->u:Le7/b;

    invoke-virtual {v0, p1}, Le7/b;->b(Lg7/i;)V

    return-void
.end method

.method private h()V
    .locals 3

    iget-object v0, p0, Le7/k;->z:Lcom/google/firebase/perf/application/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    sget-object v2, Le7/k;->F:Le7/k;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/application/a;->k(Ljava/lang/ref/WeakReference;)V

    invoke-static {}, Lg7/c;->f0()Lg7/c$b;

    move-result-object v0

    iput-object v0, p0, Le7/k;->A:Lg7/c$b;

    iget-object v1, p0, Le7/k;->q:Lk5/e;

    invoke-virtual {v1}, Lk5/e;->q()Lk5/l;

    move-result-object v1

    invoke-virtual {v1}, Lk5/l;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg7/c$b;->Q(Ljava/lang/String;)Lg7/c$b;

    move-result-object v0

    invoke-static {}, Lg7/a;->Y()Lg7/a$b;

    move-result-object v1

    iget-object v2, p0, Le7/k;->B:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg7/a$b;->L(Ljava/lang/String;)Lg7/a$b;

    move-result-object v1

    sget-object v2, Lw6/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg7/a$b;->M(Ljava/lang/String;)Lg7/a$b;

    move-result-object v1

    iget-object v2, p0, Le7/k;->w:Landroid/content/Context;

    invoke-static {v2}, Le7/k;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg7/a$b;->N(Ljava/lang/String;)Lg7/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg7/c$b;->N(Lg7/a$b;)Lg7/c$b;

    iget-object v0, p0, Le7/k;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    :goto_0
    iget-object v0, p0, Le7/k;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le7/k;->o:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le7/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Le7/g;

    invoke-direct {v2, p0, v0}, Le7/g;-><init>(Le7/k;Le7/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private i(Lg7/m;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lg7/m;->p0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "_st_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le7/k;->C:Ljava/lang/String;

    iget-object v1, p0, Le7/k;->B:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lz6/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Le7/k;->C:Ljava/lang/String;

    iget-object v1, p0, Le7/k;->B:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lz6/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Le7/k;->H()V

    iget-object v0, p0, Le7/k;->r:Lw6/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lw6/e;->b()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static k()Le7/k;
    .locals 1

    sget-object v0, Le7/k;->F:Le7/k;

    return-object v0
.end method

.method private static l(Lg7/g;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lg7/g;->e0()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lg7/g;->b0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lg7/g;->a0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x2

    aput-object p0, v1, v2

    const-string p0, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static m(Lg7/h;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lg7/h;->C0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg7/h;->t0()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lg7/h;->y0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lg7/h;->m0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, "UNKNOWN"

    :goto_1
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p0}, Lg7/h;->v0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v4, v5

    const/4 p0, 0x1

    aput-object v2, v4, p0

    const/4 p0, 0x2

    new-instance v2, Ljava/text/DecimalFormat;

    const-string v5, "#.####"

    invoke-direct {v2, v5}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    long-to-double v0, v0

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v5

    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, p0

    const-string p0, "network request trace: %s (responseCode: %s, responseTime: %sms)"

    invoke-static {v3, p0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static n(Lg7/j;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lg7/j;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lg7/j;->m()Lg7/m;

    move-result-object p0

    invoke-static {p0}, Le7/k;->o(Lg7/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lg7/j;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lg7/j;->s()Lg7/h;

    move-result-object p0

    invoke-static {p0}, Le7/k;->m(Lg7/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p0}, Lg7/j;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lg7/j;->h()Lg7/g;

    move-result-object p0

    invoke-static {p0}, Le7/k;->l(Lg7/g;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p0, "log"

    return-object p0
.end method

.method private static o(Lg7/m;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lg7/m;->m0()J

    move-result-wide v0

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lg7/m;->p0()Ljava/lang/String;

    move-result-object p0

    const/4 v4, 0x0

    aput-object p0, v3, v4

    new-instance p0, Ljava/text/DecimalFormat;

    const-string v4, "#.####"

    invoke-direct {p0, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    long-to-double v0, v0

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v4

    invoke-virtual {p0, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aput-object p0, v3, v0

    const-string p0, "trace metric: %s (duration: %sms)"

    invoke-static {v2, p0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :catch_0
    :goto_0
    return-object v0
.end method

.method private q(Lg7/i;)V
    .locals 3

    invoke-virtual {p1}, Lg7/i;->j()Z

    move-result v0

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Le7/k;->z:Lcom/google/firebase/perf/application/a;

    sget-object v0, Lf7/b;->o:Lf7/b;

    :goto_0
    invoke-virtual {v0}, Lf7/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/firebase/perf/application/a;->d(Ljava/lang/String;J)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lg7/i;->r()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Le7/k;->z:Lcom/google/firebase/perf/application/a;

    sget-object v0, Lf7/b;->p:Lf7/b;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private s(Lg7/j;)Z
    .locals 8

    iget-object v0, p0, Le7/k;->n:Ljava/util/Map;

    const-string v1, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Le7/k;->n:Ljava/util/Map;

    const-string v3, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Le7/k;->n:Ljava/util/Map;

    const-string v5, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {p1}, Lg7/j;->j()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    if-lez v0, :cond_0

    iget-object p1, p0, Le7/k;->n:Ljava/util/Map;

    sub-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_0
    invoke-interface {p1}, Lg7/j;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    if-lez v2, :cond_1

    iget-object p1, p0, Le7/k;->n:Ljava/util/Map;

    sub-int/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_1
    invoke-interface {p1}, Lg7/j;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    if-lez v4, :cond_2

    iget-object p1, p0, Le7/k;->n:Ljava/util/Map;

    sub-int/2addr v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_2
    sget-object v1, Le7/k;->E:Lz6/a;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v7

    const/4 p1, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    const/4 p1, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    const-string p1, "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."

    invoke-virtual {v1, p1, v3}, Lz6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v5
.end method

.method private t(Lg7/i;)Z
    .locals 3

    iget-object v0, p0, Le7/k;->x:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-object v0, Le7/k;->E:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Performance collection is not enabled, dropping %s"

    invoke-virtual {v0, p1, v1}, Lz6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    invoke-virtual {p1}, Lg7/i;->W()Lg7/c;

    move-result-object v0

    invoke-virtual {v0}, Lg7/c;->b0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Le7/k;->E:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "App Instance ID is null or empty, dropping %s"

    invoke-virtual {v0, p1, v1}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_1
    iget-object v0, p0, Le7/k;->w:Landroid/content/Context;

    invoke-static {p1, v0}, Lb7/e;->b(Lg7/i;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Le7/k;->E:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."

    invoke-virtual {v0, p1, v1}, Lz6/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_2
    iget-object v0, p0, Le7/k;->y:Le7/d;

    invoke-virtual {v0, p1}, Le7/d;->h(Lg7/i;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0, p1}, Le7/k;->q(Lg7/i;)V

    sget-object v0, Le7/k;->E:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Event dropped due to device sampling - %s"

    invoke-virtual {v0, p1, v1}, Lz6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_3
    iget-object v0, p0, Le7/k;->y:Le7/d;

    invoke-virtual {v0, p1}, Le7/d;->g(Lg7/i;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Le7/k;->q(Lg7/i;)V

    sget-object v0, Le7/k;->E:Lz6/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Le7/k;->n(Lg7/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Rate limited (per device) - %s"

    invoke-virtual {v0, p1, v1}, Lz6/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_4
    return v1
.end method

.method private synthetic v(Le7/c;)V
    .locals 1

    iget-object v0, p1, Le7/c;->a:Lg7/i$b;

    iget-object p1, p1, Le7/c;->b:Lg7/d;

    invoke-direct {p0, v0, p1}, Le7/k;->F(Lg7/i$b;Lg7/d;)V

    return-void
.end method

.method private synthetic w(Lg7/m;Lg7/d;)V
    .locals 1

    invoke-static {}, Lg7/i;->Y()Lg7/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg7/i$b;->O(Lg7/m;)Lg7/i$b;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Le7/k;->F(Lg7/i$b;Lg7/d;)V

    return-void
.end method

.method private synthetic x(Lg7/h;Lg7/d;)V
    .locals 1

    invoke-static {}, Lg7/i;->Y()Lg7/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg7/i$b;->N(Lg7/h;)Lg7/i$b;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Le7/k;->F(Lg7/i$b;Lg7/d;)V

    return-void
.end method

.method private synthetic y(Lg7/g;Lg7/d;)V
    .locals 1

    invoke-static {}, Lg7/i;->Y()Lg7/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg7/i$b;->M(Lg7/g;)Lg7/i$b;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Le7/k;->F(Lg7/i$b;Lg7/d;)V

    return-void
.end method

.method private synthetic z()V
    .locals 2

    iget-object v0, p0, Le7/k;->y:Le7/d;

    iget-boolean v1, p0, Le7/k;->D:Z

    invoke-virtual {v0, v1}, Le7/d;->a(Z)V

    return-void
.end method


# virtual methods
.method public A(Lg7/g;Lg7/d;)V
    .locals 2

    iget-object v0, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le7/h;

    invoke-direct {v1, p0, p1, p2}, Le7/h;-><init>(Le7/k;Lg7/g;Lg7/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(Lg7/h;Lg7/d;)V
    .locals 2

    iget-object v0, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le7/i;

    invoke-direct {v1, p0, p1, p2}, Le7/i;-><init>(Le7/k;Lg7/h;Lg7/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public C(Lg7/m;Lg7/d;)V
    .locals 2

    iget-object v0, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le7/j;

    invoke-direct {v1, p0, p1, p2}, Le7/j;-><init>(Le7/k;Lg7/m;Lg7/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onUpdateAppState(Lg7/d;)V
    .locals 1

    sget-object v0, Lg7/d;->p:Lg7/d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Le7/k;->D:Z

    invoke-virtual {p0}, Le7/k;->u()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Le7/f;

    invoke-direct {v0, p0}, Le7/f;-><init>(Le7/k;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public r(Lk5/e;Lo6/e;Ln6/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/e;",
            "Lo6/e;",
            "Ln6/b<",
            "Lj1/g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le7/k;->q:Lk5/e;

    invoke-virtual {p1}, Lk5/e;->q()Lk5/l;

    move-result-object p1

    invoke-virtual {p1}, Lk5/l;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le7/k;->C:Ljava/lang/String;

    iput-object p2, p0, Le7/k;->s:Lo6/e;

    iput-object p3, p0, Le7/k;->t:Ln6/b;

    iget-object p1, p0, Le7/k;->v:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Le7/e;

    invoke-direct {p2, p0}, Le7/e;-><init>(Le7/k;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Le7/k;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
