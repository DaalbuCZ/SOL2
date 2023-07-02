.class public Lcom/google/firebase/perf/metrics/AppStartTrace;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Landroidx/lifecycle/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/perf/metrics/AppStartTrace$b;,
        Lcom/google/firebase/perf/metrics/AppStartTrace$c;
    }
.end annotation


# static fields
.field private static final L:Lf7/l;

.field private static final M:J

.field private static volatile N:Lcom/google/firebase/perf/metrics/AppStartTrace;

.field private static O:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private A:Lf7/l;

.field private B:Lf7/l;

.field private C:Lf7/l;

.field private D:Lf7/l;

.field private E:Lf7/l;

.field private F:Lf7/l;

.field private G:Ld7/a;

.field private H:Z

.field private I:I

.field private final J:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

.field private K:Z

.field private n:Z

.field private final o:Le7/k;

.field private final p:Lf7/a;

.field private final q:Lcom/google/firebase/perf/config/a;

.field private final r:Lg7/m$b;

.field private s:Landroid/content/Context;

.field private t:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private v:Z

.field private final w:Lf7/l;

.field private final x:Lf7/l;

.field private y:Lf7/l;

.field private z:Lf7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf7/a;

    invoke-direct {v0}, Lf7/a;-><init>()V

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Lf7/l;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:J

    return-void
.end method

.method constructor <init>(Le7/k;Lf7/a;Lcom/google/firebase/perf/config/a;Ljava/util/concurrent/ExecutorService;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->n:Z

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lf7/l;

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lf7/l;

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    iput v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:I

    new-instance v2, Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    invoke-direct {v2, p0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace$b;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;Lcom/google/firebase/perf/metrics/AppStartTrace$a;)V

    iput-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Z

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Le7/k;

    iput-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    iput-object p3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:Lcom/google/firebase/perf/config/a;

    sput-object p4, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object p1

    const-string p2, "_experiment_app_start_ttid"

    invoke-virtual {p1, p2}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    if-lt p1, p2, :cond_0

    invoke-static {}, Landroid/os/Process;->getStartElapsedRealtime()J

    move-result-wide p1

    invoke-static {p1, p2}, Lf7/l;->f(J)Lf7/l;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Lf7/l;

    invoke-static {}, Lk5/e;->n()Lk5/e;

    move-result-object p1

    const-class p2, Lk5/m;

    invoke-virtual {p1, p2}, Lk5/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk5/m;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lk5/m;->b()J

    move-result-wide p1

    invoke-static {p1, p2}, Lf7/l;->f(J)Lf7/l;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:Lf7/l;

    return-void
.end method

.method private A()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lf7/l;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lf7/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v1

    const-string v2, "_experiment_preDrawFoQ"

    invoke-virtual {v1, v2}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    invoke-virtual {v2}, Lf7/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lf7/l;

    invoke-virtual {v2, v3}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v1

    check-cast v1, Lg7/m;

    invoke-virtual {v0, v1}, Lg7/m$b;->O(Lg7/m;)Lg7/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->x(Lg7/m$b;)V

    return-void
.end method

.method public static synthetic h(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->A()V

    return-void
.end method

.method public static synthetic i(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->y()V

    return-void
.end method

.method public static synthetic j(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->z()V

    return-void
.end method

.method public static synthetic k(Lcom/google/firebase/perf/metrics/AppStartTrace;Lg7/m$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->v(Lg7/m$b;)V

    return-void
.end method

.method public static synthetic l(Lcom/google/firebase/perf/metrics/AppStartTrace;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->w()V

    return-void
.end method

.method static synthetic m(Lcom/google/firebase/perf/metrics/AppStartTrace;)Lf7/l;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    return-object p0
.end method

.method static synthetic n(Lcom/google/firebase/perf/metrics/AppStartTrace;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    return p1
.end method

.method static synthetic o(Lcom/google/firebase/perf/metrics/AppStartTrace;)I
    .locals 2

    iget v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:I

    return v0
.end method

.method private p()Lf7/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:Lf7/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Lf7/l;

    return-object v0
.end method

.method public static q()Lcom/google/firebase/perf/metrics/AppStartTrace;
    .locals 2

    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lcom/google/firebase/perf/metrics/AppStartTrace;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lcom/google/firebase/perf/metrics/AppStartTrace;

    goto :goto_0

    :cond_0
    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object v0

    new-instance v1, Lf7/a;

    invoke-direct {v1}, Lf7/a;-><init>()V

    invoke-static {v0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->r(Le7/k;Lf7/a;)Lcom/google/firebase/perf/metrics/AppStartTrace;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method static r(Le7/k;Lf7/a;)Lcom/google/firebase/perf/metrics/AppStartTrace;
    .locals 11
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lcom/google/firebase/perf/metrics/AppStartTrace;

    if-nez v0, :cond_1

    const-class v0, Lcom/google/firebase/perf/metrics/AppStartTrace;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lcom/google/firebase/perf/metrics/AppStartTrace;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/firebase/perf/metrics/AppStartTrace;

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v2

    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v4, 0x0

    const/4 v5, 0x1

    sget-wide v6, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:J

    const-wide/16 v8, 0xa

    add-long/2addr v6, v8

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    invoke-direct {v1, p0, p1, v2, v10}, Lcom/google/firebase/perf/metrics/AppStartTrace;-><init>(Le7/k;Lf7/a;Lcom/google/firebase/perf/config/a;Ljava/util/concurrent/ExecutorService;)V

    sput-object v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lcom/google/firebase/perf/metrics/AppStartTrace;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lcom/google/firebase/perf/metrics/AppStartTrace;

    return-object p0
.end method

.method private s()Lf7/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Lf7/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object v0

    return-object v0
.end method

.method public static setLauncherActivityOnCreateTime(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    return-void
.end method

.method public static setLauncherActivityOnResumeTime(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    return-void
.end method

.method public static setLauncherActivityOnStartTime(Ljava/lang/String;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    return-void
.end method

.method public static t(Landroid/content/Context;)Z
    .locals 7

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v5, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v6, 0x64

    if-eq v5, v6, :cond_2

    goto :goto_0

    :cond_2
    iget-object v5, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    iget-object v4, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_3
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x17

    if-ge v4, v5, :cond_4

    invoke-static {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->u(Landroid/content/Context;)Z

    move-result v4

    goto :goto_1

    :cond_4
    move v4, v1

    :goto_1
    if-eqz v4, :cond_1

    return v1

    :cond_5
    const/4 p0, 0x0

    return p0
.end method

.method public static u(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/PowerManager;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/os/PowerManager;->isInteractive()Z

    move-result p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result p0

    :goto_0
    return p0
.end method

.method private synthetic v(Lg7/m$b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Le7/k;

    invoke-virtual {p1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object p1

    check-cast p1, Lg7/m;

    sget-object v1, Lg7/d;->r:Lg7/d;

    invoke-virtual {v0, p1, v1}, Le7/k;->C(Lg7/m;Lg7/d;)V

    return-void
.end method

.method private w()V
    .locals 6

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v0

    sget-object v1, Lf7/c;->o:Lf7/c;

    invoke-virtual {v1}, Lf7/c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object v1

    invoke-virtual {v1}, Lf7/l;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Lf7/l;

    invoke-virtual {v1, v2}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v2

    sget-object v3, Lf7/c;->p:Lf7/c;

    invoke-virtual {v3}, Lf7/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object v3

    invoke-virtual {v3}, Lf7/l;->e()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    invoke-virtual {v3, v4}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v2

    check-cast v2, Lg7/m;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v2

    sget-object v3, Lf7/c;->q:Lf7/c;

    invoke-virtual {v3}, Lf7/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    invoke-virtual {v4}, Lf7/l;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    iget-object v5, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lf7/l;

    invoke-virtual {v4, v5}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lg7/m$b;->U(J)Lg7/m$b;

    invoke-virtual {v2}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v2

    check-cast v2, Lg7/m;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v2

    sget-object v3, Lf7/c;->r:Lf7/c;

    invoke-virtual {v3}, Lf7/c;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lf7/l;

    invoke-virtual {v4}, Lf7/l;->e()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v3

    iget-object v4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lf7/l;

    iget-object v5, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Lf7/l;

    invoke-virtual {v4, v5}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lg7/m$b;->U(J)Lg7/m$b;

    invoke-virtual {v2}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v2

    check-cast v2, Lg7/m;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Lg7/m$b;->M(Ljava/lang/Iterable;)Lg7/m$b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:Ld7/a;

    invoke-virtual {v2}, Ld7/a;->a()Lg7/k;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg7/m$b;->N(Lg7/k;)Lg7/m$b;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->o:Le7/k;

    invoke-virtual {v0}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v0

    check-cast v0, Lg7/m;

    sget-object v2, Lg7/d;->r:Lg7/d;

    invoke-virtual {v1, v0, v2}, Le7/k;->C(Lg7/m;Lg7/d;)V

    return-void
.end method

.method private x(Lg7/m$b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lf7/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lf7/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lf7/l;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Ljava/util/concurrent/ExecutorService;

    new-instance v1, La7/e;

    invoke-direct {v1, p0, p1}, La7/e;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;Lg7/m$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->C()V

    :cond_1
    :goto_0
    return-void
.end method

.method private y()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lf7/l;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lf7/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v1

    const-string v2, "_experiment_onDrawFoQ"

    invoke-virtual {v1, v2}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    invoke-virtual {v2}, Lf7/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lf7/l;

    invoke-virtual {v2, v3}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v1

    check-cast v1, Lg7/m;

    invoke-virtual {v0, v1}, Lg7/m$b;->O(Lg7/m;)Lg7/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Lf7/l;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v1

    const-string v2, "_experiment_procStart_to_classLoad"

    invoke-virtual {v1, v2}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    invoke-virtual {v2}, Lf7/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object v3

    invoke-virtual {v2, v3}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v1

    check-cast v1, Lg7/m;

    invoke-virtual {v0, v1}, Lg7/m$b;->O(Lg7/m;)Lg7/m$b;

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    iget-boolean v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Z

    if-eqz v1, :cond_2

    const-string v1, "true"

    goto :goto_0

    :cond_2
    const-string v1, "false"

    :goto_0
    const-string v2, "systemDeterminedForeground"

    invoke-virtual {v0, v2, v1}, Lg7/m$b;->S(Ljava/lang/String;Ljava/lang/String;)Lg7/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    iget v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:I

    int-to-long v1, v1

    const-string v3, "onDrawCount"

    invoke-virtual {v0, v3, v1, v2}, Lg7/m$b;->R(Ljava/lang/String;J)Lg7/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:Ld7/a;

    invoke-virtual {v1}, Ld7/a;->a()Lg7/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg7/m$b;->N(Lg7/k;)Lg7/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->x(Lg7/m$b;)V

    return-void
.end method

.method private z()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lf7/l;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lf7/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v1

    invoke-virtual {v1}, Lf7/l;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lf7/l;

    invoke-virtual {v1, v2}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg7/m$b;->U(J)Lg7/m$b;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->x(Lg7/m$b;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized B(Landroid/content/Context;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Landroidx/lifecycle/s;->k()Landroidx/lifecycle/j;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/j;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/i;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Application;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-static {p1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Z

    iput-boolean v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->n:Z

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized C()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Landroidx/lifecycle/s;->k()Landroidx/lifecycle/j;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/j;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/f;->c(Landroidx/lifecycle/i;)V

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    if-eqz p2, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Z

    const/4 v0, 0x1

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->s:Landroid/content/Context;

    invoke-static {p2}, Lcom/google/firebase/perf/metrics/AppStartTrace;->t(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move p2, v0

    :goto_1
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Z

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->t:Ljava/lang/ref/WeakReference;

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {p1}, Lf7/a;->a()Lf7/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lf7/l;

    invoke-virtual {p1, p2}, Lf7/l;->d(Lf7/l;)J

    move-result-wide p1

    sget-wide v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:J

    cmp-long p1, p1, v1

    if-lez p1, :cond_3

    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :goto_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public declared-synchronized onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->q:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const v1, 0x1020002

    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lcom/google/firebase/perf/metrics/AppStartTrace$b;

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    new-instance v2, La7/b;

    invoke-direct {v2, p0}, La7/b;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-static {v1, v2}, Lf7/e;->e(Landroid/view/View;Ljava/lang/Runnable;)V

    new-instance v2, La7/c;

    invoke-direct {v2, p0}, La7/c;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    new-instance v3, La7/a;

    invoke-direct {v3, p0}, La7/a;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-static {v1, v2, v3}, Lf7/h;->a(Landroid/view/View;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Lf7/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->u:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {v1}, Lf7/a;->a()Lf7/l;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Lf7/l;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Ld7/a;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:Ld7/a;

    invoke-static {}, Lz6/a;->e()Lz6/a;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->p()Lf7/l;

    move-result-object p1

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Lf7/l;

    invoke-virtual {p1, v3}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " microseconds"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lz6/a;->a(Ljava/lang/String;)V

    sget-object p1, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Ljava/util/concurrent/ExecutorService;

    new-instance v1, La7/d;

    invoke-direct {v1, p0}, La7/d;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->C()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :cond_4
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iget-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lf7/l;

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {p1}, Lf7/a;->a()Lf7/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lf7/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onAppEnteredBackground()V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/lifecycle/r;
        value = .enum Landroidx/lifecycle/f$b;->ON_STOP:Landroidx/lifecycle/f$b;
    .end annotation

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:Lf7/l;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:Lf7/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v1

    const-string v2, "_experiment_firstBackgrounding"

    invoke-virtual {v1, v2}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    invoke-virtual {v2}, Lf7/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:Lf7/l;

    invoke-virtual {v2, v3}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v1

    check-cast v1, Lg7/m;

    invoke-virtual {v0, v1}, Lg7/m$b;->O(Lg7/m;)Lg7/m$b;

    :cond_1
    :goto_0
    return-void
.end method

.method public onAppEnteredForeground()V
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Landroidx/lifecycle/r;
        value = .enum Landroidx/lifecycle/f$b;->ON_START:Landroidx/lifecycle/f$b;
    .end annotation

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->v:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Lf7/l;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->p:Lf7/a;

    invoke-virtual {v0}, Lf7/a;->a()Lf7/l;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Lf7/l;

    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->r:Lg7/m$b;

    invoke-static {}, Lg7/m;->x0()Lg7/m$b;

    move-result-object v1

    const-string v2, "_experiment_firstForegrounding"

    invoke-virtual {v1, v2}, Lg7/m$b;->V(Ljava/lang/String;)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    invoke-virtual {v2}, Lf7/l;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->T(J)Lg7/m$b;

    move-result-object v1

    invoke-direct {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->s()Lf7/l;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Lf7/l;

    invoke-virtual {v2, v3}, Lf7/l;->d(Lf7/l;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg7/m$b;->U(J)Lg7/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object v1

    check-cast v1, Lg7/m;

    invoke-virtual {v0, v1}, Lg7/m$b;->O(Lg7/m;)Lg7/m$b;

    :cond_1
    :goto_0
    return-void
.end method
