.class public Lcom/google/firebase/messaging/FirebaseMessaging;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/FirebaseMessaging$a;
    }
.end annotation


# static fields
.field private static final o:J

.field private static p:Lcom/google/firebase/messaging/w0;

.field static q:Le1/g;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "FirebaseUnknownNullness"
        }
    .end annotation
.end field

.field static r:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field private final a:Lf5/e;

.field private final b:Lh6/a;

.field private final c:Lj6/e;

.field private final d:Landroid/content/Context;

.field private final e:Lcom/google/firebase/messaging/d0;

.field private final f:Lcom/google/firebase/messaging/r0;

.field private final g:Lcom/google/firebase/messaging/FirebaseMessaging$a;

.field private final h:Ljava/util/concurrent/Executor;

.field private final i:Ljava/util/concurrent/Executor;

.field private final j:Ljava/util/concurrent/Executor;

.field private final k:Lt4/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt4/i<",
            "Lcom/google/firebase/messaging/b1;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/google/firebase/messaging/i0;

.field private m:Z

.field private final n:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/firebase/messaging/FirebaseMessaging;->o:J

    return-void
.end method

.method constructor <init>(Lf5/e;Lh6/a;Li6/b;Li6/b;Lj6/e;Le1/g;Lf6/d;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/e;",
            "Lh6/a;",
            "Li6/b<",
            "Lc7/i;",
            ">;",
            "Li6/b<",
            "Lg6/j;",
            ">;",
            "Lj6/e;",
            "Le1/g;",
            "Lf6/d;",
            ")V"
        }
    .end annotation

    new-instance v8, Lcom/google/firebase/messaging/i0;

    invoke-virtual {p1}, Lf5/e;->l()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v8, v0}, Lcom/google/firebase/messaging/i0;-><init>(Landroid/content/Context;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lf5/e;Lh6/a;Li6/b;Li6/b;Lj6/e;Le1/g;Lf6/d;Lcom/google/firebase/messaging/i0;)V

    return-void
.end method

.method constructor <init>(Lf5/e;Lh6/a;Li6/b;Li6/b;Lj6/e;Le1/g;Lf6/d;Lcom/google/firebase/messaging/i0;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/e;",
            "Lh6/a;",
            "Li6/b<",
            "Lc7/i;",
            ">;",
            "Li6/b<",
            "Lg6/j;",
            ">;",
            "Lj6/e;",
            "Le1/g;",
            "Lf6/d;",
            "Lcom/google/firebase/messaging/i0;",
            ")V"
        }
    .end annotation

    new-instance v7, Lcom/google/firebase/messaging/d0;

    move-object v0, v7

    move-object v1, p1

    move-object/from16 v2, p8

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/messaging/d0;-><init>(Lf5/e;Lcom/google/firebase/messaging/i0;Li6/b;Li6/b;Lj6/e;)V

    invoke-static {}, Lcom/google/firebase/messaging/m;->f()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    invoke-static {}, Lcom/google/firebase/messaging/m;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v9

    invoke-static {}, Lcom/google/firebase/messaging/m;->b()Ljava/util/concurrent/Executor;

    move-result-object v10

    move-object v0, p0

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v10}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Lf5/e;Lh6/a;Lj6/e;Le1/g;Lf6/d;Lcom/google/firebase/messaging/i0;Lcom/google/firebase/messaging/d0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method constructor <init>(Lf5/e;Lh6/a;Lj6/e;Le1/g;Lf6/d;Lcom/google/firebase/messaging/i0;Lcom/google/firebase/messaging/d0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Z

    sput-object p4, Lcom/google/firebase/messaging/FirebaseMessaging;->q:Le1/g;

    iput-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    iput-object p2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Lh6/a;

    iput-object p3, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lj6/e;

    new-instance p3, Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-direct {p3, p0, p5}, Lcom/google/firebase/messaging/FirebaseMessaging$a;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lf6/d;)V

    iput-object p3, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-virtual {p1}, Lf5/e;->l()Landroid/content/Context;

    move-result-object p3

    iput-object p3, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    new-instance p4, Lcom/google/firebase/messaging/o;

    invoke-direct {p4}, Lcom/google/firebase/messaging/o;-><init>()V

    iput-object p4, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->n:Landroid/app/Application$ActivityLifecycleCallbacks;

    iput-object p6, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lcom/google/firebase/messaging/i0;

    iput-object p8, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Lcom/google/firebase/messaging/d0;

    new-instance p5, Lcom/google/firebase/messaging/r0;

    invoke-direct {p5, p8}, Lcom/google/firebase/messaging/r0;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p5, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Lcom/google/firebase/messaging/r0;

    iput-object p9, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/Executor;

    iput-object p10, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->j:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lf5/e;->l()Landroid/content/Context;

    move-result-object p1

    instance-of p5, p1, Landroid/app/Application;

    if-eqz p5, :cond_0

    check-cast p1, Landroid/app/Application;

    invoke-virtual {p1, p4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto :goto_0

    :cond_0
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Context "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p4, "FirebaseMessaging"

    invoke-static {p4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    if-eqz p2, :cond_1

    new-instance p1, Lcom/google/firebase/messaging/r;

    invoke-direct {p1, p0}, Lcom/google/firebase/messaging/r;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    invoke-interface {p2, p1}, Lh6/a;->c(Lh6/a$a;)V

    :cond_1
    new-instance p1, Lcom/google/firebase/messaging/t;

    invoke-direct {p1, p0}, Lcom/google/firebase/messaging/t;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    invoke-interface {p9, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/firebase/messaging/m;->g()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-static {p0, p6, p7, p3, p1}, Lcom/google/firebase/messaging/b1;->f(Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/messaging/i0;Lcom/google/firebase/messaging/d0;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Lt4/i;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lt4/i;

    new-instance p2, Lcom/google/firebase/messaging/x;

    invoke-direct {p2, p0}, Lcom/google/firebase/messaging/x;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    invoke-virtual {p1, p9, p2}, Lt4/i;->f(Ljava/util/concurrent/Executor;Lt4/f;)Lt4/i;

    new-instance p1, Lcom/google/firebase/messaging/s;

    invoke-direct {p1, p0}, Lcom/google/firebase/messaging/s;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    invoke-interface {p9, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic A(Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;)Lt4/i;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Lcom/google/firebase/messaging/d0;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/d0;->f()Lt4/i;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->j:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/firebase/messaging/y;

    invoke-direct {v2, p0, p1, p2}, Lcom/google/firebase/messaging/y;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;)V

    invoke-virtual {v0, v1, v2}, Lt4/i;->q(Ljava/util/concurrent/Executor;Lt4/h;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method private synthetic B(Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;Ljava/lang/String;)Lt4/i;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->s(Landroid/content/Context;)Lcom/google/firebase/messaging/w0;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lcom/google/firebase/messaging/i0;

    invoke-virtual {v2}, Lcom/google/firebase/messaging/i0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, p3, v2}, Lcom/google/firebase/messaging/w0;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object p1, p2, Lcom/google/firebase/messaging/w0$a;->a:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/firebase/messaging/FirebaseMessaging;->x(Ljava/lang/String;)V

    :cond_1
    invoke-static {p3}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method private synthetic C(Lt4/j;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Lh6/a;

    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-static {v1}, Lcom/google/firebase/messaging/i0;->c(Lf5/e;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "FCM"

    invoke-interface {v0, v1, v2}, Lh6/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic D(Lt4/j;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Lcom/google/firebase/messaging/d0;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/d0;->c()Lt4/i;

    move-result-object v0

    invoke-static {v0}, Lt4/l;->a(Lt4/i;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->s(Landroid/content/Context;)Lcom/google/firebase/messaging/w0;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-static {v2}, Lcom/google/firebase/messaging/i0;->c(Lf5/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/messaging/w0;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic E(Lt4/j;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic F(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->x(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic G()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->Q()V

    :cond_0
    return-void
.end method

.method private synthetic H(Lcom/google/firebase/messaging/b1;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/messaging/b1;->q()V

    :cond_0
    return-void
.end method

.method private synthetic I()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/firebase/messaging/m0;->c(Landroid/content/Context;)V

    return-void
.end method

.method private static synthetic J(Ljava/lang/String;Lcom/google/firebase/messaging/b1;)Lt4/i;
    .locals 0

    invoke-virtual {p1, p0}, Lcom/google/firebase/messaging/b1;->r(Ljava/lang/String;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic K(Ljava/lang/String;Lcom/google/firebase/messaging/b1;)Lt4/i;
    .locals 0

    invoke-virtual {p1, p0}, Lcom/google/firebase/messaging/b1;->u(Ljava/lang/String;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized P()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->S(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private Q()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Lh6/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lh6/a;->a()Ljava/lang/String;

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->v()Lcom/google/firebase/messaging/w0$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->T(Lcom/google/firebase/messaging/w0$a;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->P()V

    :cond_1
    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;)Lt4/i;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/messaging/FirebaseMessaging;->A(Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;Ljava/lang/String;)Lt4/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/messaging/FirebaseMessaging;->B(Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;Ljava/lang/String;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/google/firebase/messaging/FirebaseMessaging;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->I()V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Lcom/google/firebase/messaging/b1;)Lt4/i;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->K(Ljava/lang/String;Lcom/google/firebase/messaging/b1;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/google/firebase/messaging/FirebaseMessaging;Lt4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->C(Lt4/j;)V

    return-void
.end method

.method public static synthetic f(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->F(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/messaging/b1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->H(Lcom/google/firebase/messaging/b1;)V

    return-void
.end method

.method static declared-synchronized getInstance(Lf5/e;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, v0}, Lf5/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-string v1, "Firebase Messaging component is not present"

    invoke-static {p0, v1}, Lz3/o;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static synthetic h(Lcom/google/firebase/messaging/FirebaseMessaging;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->G()V

    return-void
.end method

.method public static synthetic i(Lcom/google/firebase/messaging/FirebaseMessaging;Lt4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->E(Lt4/j;)V

    return-void
.end method

.method public static synthetic j(Lcom/google/firebase/messaging/FirebaseMessaging;Lt4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->D(Lt4/j;)V

    return-void
.end method

.method public static synthetic k(Ljava/lang/String;Lcom/google/firebase/messaging/b1;)Lt4/i;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->J(Ljava/lang/String;Lcom/google/firebase/messaging/b1;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Lcom/google/firebase/messaging/FirebaseMessaging;)Lf5/e;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    return-object p0
.end method

.method static synthetic m(Lcom/google/firebase/messaging/FirebaseMessaging;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->Q()V

    return-void
.end method

.method public static declared-synchronized r()Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lf5/e;->n()Lf5/e;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance(Lf5/e;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized s(Landroid/content/Context;)Lcom/google/firebase/messaging/w0;
    .locals 2

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->p:Lcom/google/firebase/messaging/w0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/firebase/messaging/w0;

    invoke-direct {v1, p0}, Lcom/google/firebase/messaging/w0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->p:Lcom/google/firebase/messaging/w0;

    :cond_0
    sget-object p0, Lcom/google/firebase/messaging/FirebaseMessaging;->p:Lcom/google/firebase/messaging/w0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private t()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-virtual {v0}, Lf5/e;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-virtual {v0}, Lf5/e;->r()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static w()Le1/g;
    .locals 1

    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->q:Le1/g;

    return-object v0
.end method

.method private x(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-virtual {v0}, Lf5/e;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invoking onNewToken for app: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-virtual {v2}, Lf5/e;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.firebase.messaging.NEW_TOKEN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "token"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Lcom/google/firebase/messaging/l;

    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    invoke-direct {p1, v1}, Lcom/google/firebase/messaging/l;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/l;->i(Landroid/content/Intent;)Lt4/i;

    :cond_1
    return-void
.end method


# virtual methods
.method public L(Lcom/google/firebase/messaging/o0;)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/firebase/messaging/o0;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gcm.intent.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.google.example.invalidpackage"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    const/4 v5, 0x0

    if-lt v3, v4, :cond_0

    const/high16 v3, 0x4000000

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    invoke-static {v2, v5, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const-string v2, "app"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/o0;->J(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    const-string v1, "com.google.android.gtalkservice.permission.GTALK_SERVICE"

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing \'to\'"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public M(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-virtual {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->f(Z)V

    return-void
.end method

.method public N(Z)V
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/messaging/h0;->y(Z)V

    return-void
.end method

.method declared-synchronized O(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public R(Ljava/lang/String;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lt4/i;

    new-instance v1, Lcom/google/firebase/messaging/q;

    invoke-direct {v1, p1}, Lcom/google/firebase/messaging/q;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lt4/i;->r(Lt4/h;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method declared-synchronized S(J)V
    .locals 4

    monitor-enter p0

    const-wide/16 v0, 0x1e

    const-wide/16 v2, 0x2

    mul-long/2addr v2, p1

    :try_start_0
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-wide v2, Lcom/google/firebase/messaging/FirebaseMessaging;->o:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    new-instance v2, Lcom/google/firebase/messaging/x0;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/firebase/messaging/x0;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;J)V

    invoke-virtual {p0, v2, p1, p2}, Lcom/google/firebase/messaging/FirebaseMessaging;->p(Ljava/lang/Runnable;J)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method T(Lcom/google/firebase/messaging/w0$a;)Z
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lcom/google/firebase/messaging/i0;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/i0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/firebase/messaging/w0$a;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public U(Ljava/lang/String;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->k:Lt4/i;

    new-instance v1, Lcom/google/firebase/messaging/z;

    invoke-direct {v1, p1}, Lcom/google/firebase/messaging/z;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lt4/i;->r(Lt4/h;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method n()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Lh6/a;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {v0}, Lh6/a;->b()Lt4/i;

    move-result-object v0

    invoke-static {v0}, Lt4/l;->a(Lt4/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->v()Lcom/google/firebase/messaging/w0$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->T(Lcom/google/firebase/messaging/w0$a;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lcom/google/firebase/messaging/w0$a;->a:Ljava/lang/String;

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-static {v1}, Lcom/google/firebase/messaging/i0;->c(Lf5/e;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Lcom/google/firebase/messaging/r0;

    new-instance v3, Lcom/google/firebase/messaging/p;

    invoke-direct {v3, p0, v1, v0}, Lcom/google/firebase/messaging/p;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Ljava/lang/String;Lcom/google/firebase/messaging/w0$a;)V

    invoke-virtual {v2, v1, v3}, Lcom/google/firebase/messaging/r0;->b(Ljava/lang/String;Lcom/google/firebase/messaging/r0$a;)Lt4/i;

    move-result-object v0

    :try_start_1
    invoke-static {v0}, Lt4/l;->a(Lt4/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    :goto_1
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public o()Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Lh6/a;

    if-eqz v0, :cond_0

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/firebase/messaging/u;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/messaging/u;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->v()Lcom/google/firebase/messaging/w0$a;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {v0}, Lt4/l;->e(Ljava/lang/Object;)Lt4/i;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    invoke-static {}, Lcom/google/firebase/messaging/m;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/messaging/w;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/messaging/w;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method p(Ljava/lang/Runnable;J)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->r:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v2, 0x1

    new-instance v3, Le4/a;

    const-string v4, "TAG"

    invoke-direct {v3, v4}, Le4/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->r:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_0
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->r:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p1, p2, p3, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method q()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    return-object v0
.end method

.method public u()Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Lh6/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lh6/a;->b()Lt4/i;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->h:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/firebase/messaging/v;

    invoke-direct {v2, p0, v0}, Lcom/google/firebase/messaging/v;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method v()Lcom/google/firebase/messaging/w0$a;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->s(Landroid/content/Context;)Lcom/google/firebase/messaging/w0;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->t()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Lf5/e;

    invoke-static {v2}, Lcom/google/firebase/messaging/i0;->c(Lf5/e;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/messaging/w0;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/messaging/w0$a;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->c()Z

    move-result v0

    return v0
.end method

.method z()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lcom/google/firebase/messaging/i0;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/i0;->g()Z

    move-result v0

    return v0
.end method
