.class public Ly0/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/lang/String; = "Bugfender"

.field private static b:Ly0/y1; = null

.field private static c:Ly0/h1; = null

.field private static d:Ly0/q1; = null

.field private static e:Z = false

.field private static f:Z = false

.field private static g:Z = false

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;

.field private static j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Ljava/lang/String;Z)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly0/q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {p0, v0}, Ly0/q1;->n(Ly0/q;)V

    :cond_0
    return-void
.end method

.method public static B(Ljava/lang/String;Ljava/lang/Float;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly0/q;

    invoke-direct {v0, p0, p1}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {p0, v0}, Ly0/q1;->n(Ly0/q;)V

    :cond_0
    return-void
.end method

.method public static C(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly0/q;

    invoke-direct {v0, p0, p1}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {p0, v0}, Ly0/q1;->n(Ly0/q;)V

    :cond_0
    return-void
.end method

.method public static D(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly0/q;

    invoke-direct {v0, p0, p1}, Ly0/q;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {p0, v0}, Ly0/q1;->n(Ly0/q;)V

    :cond_0
    return-void
.end method

.method public static E(Z)V
    .locals 3

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ly0/a;->o()Z

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0}, Ly0/q1;->E(Z)V

    sget-boolean v0, Ly0/a;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Force enable: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ly0/i0;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static F(J)V
    .locals 2

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->j(J)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The maximum size should be a positive number"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method private static G()Z
    .locals 1

    invoke-static {}, Ly0/a;->q()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static H()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->j0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static J(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->m0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->D(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static c()V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0}, Ly0/q1;->B()V

    :cond_0
    return-void
.end method

.method public static d()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ly0/a;->e(Lz0/c;)V

    return-void
.end method

.method public static e(Lz0/c;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    new-instance p0, Lz0/a;

    invoke-direct {p0}, Lz0/a;-><init>()V

    :cond_0
    sget-object v0, Ly0/a;->c:Ly0/h1;

    invoke-interface {v0, p0}, Ly0/h1;->a(Lz0/c;)V

    :cond_1
    return-void
.end method

.method public static varargs f(Landroid/app/Application;[Ljava/lang/Object;)V
    .locals 7

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-boolean v0, Ly0/a;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Ly0/a;->g:Z

    new-instance v0, Ly0/o;

    sget-object v2, Ly0/a;->d:Ly0/q1;

    sget-object v3, Ly0/a;->b:Ly0/y1;

    invoke-static {}, Ly0/a;->G()Z

    move-result v4

    invoke-static {}, Ly0/a;->H()Z

    move-result v5

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ly0/o;-><init>(Ly0/q1;Ly0/y1;ZZLjava/util/List;)V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->I(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static h()V
    .locals 2

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0}, Ly0/q1;->p0()V

    sget-boolean v0, Ly0/a;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->a:Ljava/lang/String;

    const-string v1, "Synchronizing all the logs and issues"

    invoke-static {v0, v1}, Ly0/i0;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static i()Ljava/net/URL;
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0}, Ly0/q1;->t0()Ljava/net/URL;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static j(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const-string v1, "activity"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v2, v0, :cond_0

    iget-object p0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static k()Ljava/net/URL;
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0}, Ly0/q1;->x0()Ljava/net/URL;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/a;)Landroid/content/Intent;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/bugfender/sdk/ui/FeedbackActivity;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/a;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Ly0/i0;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->P(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static declared-synchronized n(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    const-class v13, Ly0/a;

    monitor-enter v13

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v1, Ly0/a;->c:Ly0/h1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    :try_start_1
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v14, 0x0

    invoke-virtual {v0, v14, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-static/range {p0 .. p0}, Ly0/a;->p(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    sput-boolean p2, Ly0/a;->e:Z

    new-instance v15, Ly0/b1;

    invoke-direct {v15}, Ly0/b1;-><init>()V

    new-instance v11, Ly0/w0;

    invoke-direct {v11}, Ly0/w0;-><init>()V

    invoke-virtual {v15}, Ly0/b1;->l()Ly0/x0;

    move-result-object v3

    invoke-virtual {v15, v3}, Ly0/b1;->b(Ly0/x0;)Ly0/s0;

    move-result-object v4

    invoke-virtual {v15}, Ly0/b1;->q()Ly0/k2;

    move-result-object v5

    invoke-virtual {v15, v5}, Ly0/b1;->e(Ly0/k2;)Ly0/d2;

    move-result-object v6

    invoke-virtual {v15}, Ly0/b1;->j()Ly0/n3;

    move-result-object v7

    invoke-virtual {v15, v7}, Ly0/b1;->g(Ly0/n3;)Ly0/g3;

    move-result-object v8

    invoke-virtual {v15}, Ly0/b1;->d()Ly0/p1;

    move-result-object v9

    invoke-virtual {v15}, Ly0/b1;->p()Ly0/r;

    move-result-object v10

    invoke-virtual {v15}, Ly0/b1;->o()Ly0/t;

    move-result-object v16

    move-object v1, v15

    move-object/from16 v2, p0

    move-object v14, v11

    move-object/from16 v11, v16

    invoke-virtual/range {v1 .. v11}, Ly0/b1;->f(Landroid/content/Context;Ly0/x0;Ly0/s0;Ly0/k2;Ly0/d2;Ly0/n3;Ly0/g3;Ly0/p1;Ly0/r;Ly0/t;)Ly0/s2;

    move-result-object v3

    sget-object v1, Ly0/a;->h:Ljava/lang/String;

    const v2, 0x134b0a2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v1, v2, v12}, Ly0/w0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ly0/w2;

    move-result-object v1

    const/4 v2, 0x0

    sput-object v2, Ly0/a;->h:Ljava/lang/String;

    new-instance v5, Ly0/f2;

    invoke-direct {v5, v1}, Ly0/f2;-><init>(Ly0/w2;)V

    invoke-virtual {v15, v0}, Ly0/b1;->k(Landroid/content/Context;)Ly0/e0;

    move-result-object v7

    invoke-virtual {v15, v0}, Ly0/b1;->i(Landroid/content/Context;)Ly0/z;

    move-result-object v1

    invoke-virtual {v15, v0}, Ly0/b1;->m(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-virtual {v15, v0, v1, v2}, Ly0/b1;->a(Landroid/content/Context;Ly0/z;Landroid/content/SharedPreferences;)Ly0/s;

    move-result-object v8

    invoke-virtual {v15, v0}, Ly0/b1;->h(Landroid/content/Context;)Ly0/j3;

    move-result-object v6

    new-instance v11, Ly0/q1;

    sget-object v1, Ly0/a;->i:Ljava/lang/String;

    invoke-virtual {v15, v12, v1}, Ly0/b1;->c(Ljava/lang/String;Ljava/lang/String;)Ly0/z0;

    move-result-object v9

    sget-object v10, Ly0/a;->j:Ljava/lang/String;

    move-object v1, v11

    move-object/from16 v2, p1

    move-object/from16 v4, v16

    invoke-direct/range {v1 .. v10}, Ly0/q1;-><init>(Ljava/lang/String;Ly0/s2;Ly0/t;Ly0/f2;Ly0/j3;Ly0/e0;Ly0/s;Ly0/z0;Ljava/lang/String;)V

    sput-object v11, Ly0/a;->d:Ly0/q1;

    const/4 v1, 0x0

    sput-object v1, Ly0/a;->i:Ljava/lang/String;

    const-wide/32 v1, 0x500000

    invoke-virtual {v11, v1, v2}, Ly0/q1;->j(J)V

    new-instance v1, Ly0/m1;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ly0/a;->d:Ly0/q1;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Ly0/m1;-><init>(Ljava/lang/String;Ly0/q1;Ljava/util/concurrent/ExecutorService;)V

    sput-object v1, Ly0/a;->c:Ly0/h1;

    invoke-virtual {v15}, Ly0/b1;->n()Ly0/y1;

    move-result-object v0

    sput-object v0, Ly0/a;->b:Ly0/y1;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_1
    monitor-exit v13

    return-void

    :cond_2
    :goto_0
    :try_start_2
    sget-object v0, Ly0/a;->a:Ljava/lang/String;

    const-string v1, "WARNING: The Bugfender sdk is not initialized. The context or application token provided is null."

    invoke-static {v0, v1}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v13

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v13

    throw v0
.end method

.method private static o()Z
    .locals 2

    sget-object v0, Ly0/a;->d:Ly0/q1;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    sget-boolean v0, Ly0/a;->f:Z

    if-nez v0, :cond_0

    sput-boolean v1, Ly0/a;->f:Z

    sget-object v0, Ly0/a;->a:Ljava/lang/String;

    const-string v1, "WARNING: Bugfender SDK is not initialized. You should call first to the method Bugfender.init()"

    invoke-static {v0, v1}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method private static p(Landroid/content/Context;)Z
    .locals 3

    invoke-static {p0}, Ly0/a;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v1, Ly0/a;->a:Ljava/lang/String;

    const-string v2, "WARNING: Bugfender SDK couldn\'t be initialized."

    invoke-static {v1, v2}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static q()Z
    .locals 1

    sget-boolean v0, Ly0/a;->e:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static r(Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static s(ILjava/lang/String;Ljava/lang/String;Ly0/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ly0/a;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p4, p5}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p4, p5}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    invoke-static {p4, p5}, Ly0/i0;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    invoke-static {p4, p5}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, Ly0/a;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Ly0/a;->d:Ly0/q1;

    invoke-static {p3}, Ly0/n0$c;->g(Ly0/b;)Ly0/n0$c;

    move-result-object v5

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Ly0/q1;->i(ILjava/lang/String;Ljava/lang/String;Ly0/n0$c;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static t(Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ly0/a;->a:Ljava/lang/String;

    const-string v0, "WARNING: deviceName can not be empty or null. Bugfender.overrideDeviceName() is ignored"

    invoke-static {p0, v0}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sput-object p0, Ly0/a;->j:Ljava/lang/String;

    invoke-static {}, Ly0/a;->o()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Ly0/a;->a:Ljava/lang/String;

    const-string v0, "WARNING: Bugfender.overrideDeviceName() must be called before the method Bugfender.init(), ignoring this call"

    invoke-static {p0, v0}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static u(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0}, Ly0/q1;->C(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    sget-object v1, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v1}, Ly0/q1;->p0()V

    sget-boolean v1, Ly0/a;->e:Z

    if-eqz v1, :cond_0

    sget-object v1, Ly0/a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reported crash with Title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and Message: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->Y(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    sget-object v1, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v1}, Ly0/q1;->p0()V

    sget-boolean v1, Ly0/a;->e:Z

    if-eqz v1, :cond_0

    sget-object v1, Ly0/a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reported issue with Title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and Message: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static x(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v0, p0, p1}, Ly0/q1;->e0(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    sget-object v1, Ly0/a;->d:Ly0/q1;

    invoke-virtual {v1}, Ly0/q1;->p0()V

    sget-boolean v1, Ly0/a;->e:Z

    if-eqz v1, :cond_0

    sget-object v1, Ly0/a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reported feedback with Title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and Message: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static y(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ly0/a;->a:Ljava/lang/String;

    const-string v0, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()"

    invoke-static {p0, v0}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Ly0/a;->r(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sput-object p0, Ly0/a;->h:Ljava/lang/String;

    goto :goto_0

    :cond_1
    sget-object p0, Ly0/a;->a:Ljava/lang/String;

    const-string v0, "The custom URL you have passed is malformed. Using default one."

    invoke-static {p0, v0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static z(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ly0/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ly0/a;->a:Ljava/lang/String;

    const-string v0, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()"

    invoke-static {p0, v0}, Ly0/i0;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Ly0/a;->r(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sput-object p0, Ly0/a;->i:Ljava/lang/String;

    goto :goto_0

    :cond_1
    sget-object p0, Ly0/a;->a:Ljava/lang/String;

    const-string v0, "The custom URL you have passed is malformed. Using default one."

    invoke-static {p0, v0}, Ly0/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
