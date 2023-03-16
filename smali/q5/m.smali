.class public Lq5/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lf5/e;

.field private final c:Lq5/s;

.field private final d:Lq5/b0;

.field private final e:J

.field private f:Lq5/n;

.field private g:Lq5/n;

.field private h:Z

.field private i:Lq5/k;

.field private final j:Lq5/w;

.field private final k:Lv5/f;

.field public final l:Lp5/b;

.field private final m:Lo5/a;

.field private final n:Ljava/util/concurrent/ExecutorService;

.field private final o:Lq5/i;

.field private final p:Ln5/a;


# direct methods
.method public constructor <init>(Lf5/e;Lq5/w;Ln5/a;Lq5/s;Lp5/b;Lo5/a;Lv5/f;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/m;->b:Lf5/e;

    iput-object p4, p0, Lq5/m;->c:Lq5/s;

    invoke-virtual {p1}, Lf5/e;->l()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lq5/m;->a:Landroid/content/Context;

    iput-object p2, p0, Lq5/m;->j:Lq5/w;

    iput-object p3, p0, Lq5/m;->p:Ln5/a;

    iput-object p5, p0, Lq5/m;->l:Lp5/b;

    iput-object p6, p0, Lq5/m;->m:Lo5/a;

    iput-object p8, p0, Lq5/m;->n:Ljava/util/concurrent/ExecutorService;

    iput-object p7, p0, Lq5/m;->k:Lv5/f;

    new-instance p1, Lq5/i;

    invoke-direct {p1, p8}, Lq5/i;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lq5/m;->o:Lq5/i;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lq5/m;->e:J

    new-instance p1, Lq5/b0;

    invoke-direct {p1}, Lq5/b0;-><init>()V

    iput-object p1, p0, Lq5/m;->d:Lq5/b0;

    return-void
.end method

.method static synthetic a(Lq5/m;Lx5/i;)Lt4/i;
    .locals 0

    invoke-direct {p0, p1}, Lq5/m;->i(Lx5/i;)Lt4/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lq5/m;)Lq5/n;
    .locals 0

    iget-object p0, p0, Lq5/m;->f:Lq5/n;

    return-object p0
.end method

.method static synthetic c(Lq5/m;)Lq5/k;
    .locals 0

    iget-object p0, p0, Lq5/m;->i:Lq5/k;

    return-object p0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lq5/m;->o:Lq5/i;

    new-instance v1, Lq5/m$d;

    invoke-direct {v1, p0}, Lq5/m$d;-><init>(Lq5/m;)V

    invoke-virtual {v0, v1}, Lq5/i;->h(Ljava/util/concurrent/Callable;)Lt4/i;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lq5/j0;->d(Lt4/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    iput-boolean v0, p0, Lq5/m;->h:Z

    return-void

    :catch_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i(Lx5/i;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/i;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    invoke-virtual {p0}, Lq5/m;->r()V

    :try_start_0
    iget-object v1, p0, Lq5/m;->l:Lp5/b;

    new-instance v2, Lq5/l;

    invoke-direct {v2, p0}, Lq5/l;-><init>(Lq5/m;)V

    invoke-interface {v1, v2}, Lp5/b;->a(Lp5/a;)V

    invoke-interface {p1}, Lx5/i;->b()Lx5/d;

    move-result-object v1

    iget-object v1, v1, Lx5/d;->b:Lx5/d$a;

    iget-boolean v1, v1, Lx5/d$a;->a:Z

    if-nez v1, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln5/f;->b(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lt4/l;->d(Ljava/lang/Exception;)Lt4/i;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lq5/m;->q()V

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0, p1}, Lq5/k;->B(Lx5/i;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Previous sessions could not be finalized."

    invoke-virtual {v0, v1}, Ln5/f;->k(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-interface {p1}, Lx5/i;->a()Lt4/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq5/k;->U(Lt4/i;)Lt4/i;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lq5/m;->q()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    invoke-virtual {v0, v1, p1}, Ln5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lt4/l;->d(Ljava/lang/Exception;)Lt4/i;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Lq5/m;->q()V

    return-object p1

    :goto_0
    invoke-virtual {p0}, Lq5/m;->q()V

    throw p1
.end method

.method private k(Lx5/i;)V
    .locals 3

    new-instance v0, Lq5/m$b;

    invoke-direct {v0, p0, p1}, Lq5/m$b;-><init>(Lq5/m;Lx5/i;)V

    iget-object p1, p0, Lq5/m;->n:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-virtual {v0, v1}, Ln5/f;->b(Ljava/lang/String;)V

    const-wide/16 v0, 0x4

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during initialization."

    goto :goto_0

    :catch_2
    move-exception p1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    :goto_0
    invoke-virtual {v0, v1, p1}, Ln5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public static l()Ljava/lang/String;
    .locals 1

    const-string v0, "18.3.5"

    return-object v0
.end method

.method static m(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, Ln5/f;->i(Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string p0, "FirebaseCrashlytics"

    const-string p1, "."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  | "

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  |"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   \\ |  | /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    \\    /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     \\  /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      \\/"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      /\\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     /  \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    /    \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   / |  | \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public e()Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0}, Lq5/k;->o()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public f()Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0}, Lq5/k;->t()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lq5/m;->h:Z

    return v0
.end method

.method h()Z
    .locals 1

    iget-object v0, p0, Lq5/m;->f:Lq5/n;

    invoke-virtual {v0}, Lq5/n;->c()Z

    move-result v0

    return v0
.end method

.method public j(Lx5/i;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/i;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/m;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lq5/m$a;

    invoke-direct {v1, p0, p1}, Lq5/m$a;-><init>(Lq5/m;Lx5/i;)V

    invoke-static {v0, v1}, Lq5/j0;->f(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lq5/m;->e:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v2, v0, v1, p1}, Lq5/k;->Y(JLjava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lq5/k;->X(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public p(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Recorded on-demand fatal events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lq5/m;->d:Lq5/b0;

    invoke-virtual {v2}, Lq5/b0;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/f;->b(Ljava/lang/String;)V

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dropped on-demand fatal events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lq5/m;->d:Lq5/b0;

    invoke-virtual {v2}, Lq5/b0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    iget-object v1, p0, Lq5/m;->d:Lq5/b0;

    invoke-virtual {v1}, Lq5/b0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.crashlytics.on-demand.recorded-exceptions"

    invoke-virtual {v0, v2, v1}, Lq5/k;->S(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    iget-object v1, p0, Lq5/m;->d:Lq5/b0;

    invoke-virtual {v1}, Lq5/b0;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.crashlytics.on-demand.dropped-exceptions"

    invoke-virtual {v0, v2, v1}, Lq5/k;->S(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lq5/k;->O(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method q()V
    .locals 2

    iget-object v0, p0, Lq5/m;->o:Lq5/i;

    new-instance v1, Lq5/m$c;

    invoke-direct {v1, p0}, Lq5/m$c;-><init>(Lq5/m;)V

    invoke-virtual {v0, v1}, Lq5/i;->h(Ljava/util/concurrent/Callable;)Lt4/i;

    return-void
.end method

.method r()V
    .locals 2

    iget-object v0, p0, Lq5/m;->o:Lq5/i;

    invoke-virtual {v0}, Lq5/i;->b()V

    iget-object v0, p0, Lq5/m;->f:Lq5/n;

    invoke-virtual {v0}, Lq5/n;->a()Z

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Initialization marker file was created."

    invoke-virtual {v0, v1}, Ln5/f;->i(Ljava/lang/String;)V

    return-void
.end method

.method public s(Lq5/a;Lx5/i;)Z
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v1, Lq5/m;->a:Landroid/content/Context;

    const-string v3, "com.crashlytics.RequireBuildId"

    const/4 v11, 0x1

    invoke-static {v2, v3, v11}, Lq5/h;->k(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v15, p1

    iget-object v3, v15, Lq5/a;->b:Ljava/lang/String;

    invoke-static {v3, v2}, Lq5/m;->m(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lq5/g;

    iget-object v3, v1, Lq5/m;->j:Lq5/w;

    invoke-direct {v2, v3}, Lq5/g;-><init>(Lq5/w;)V

    invoke-virtual {v2}, Lq5/g;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v25, 0x0

    :try_start_0
    new-instance v2, Lq5/n;

    const-string v3, "crash_marker"

    iget-object v4, v1, Lq5/m;->k:Lv5/f;

    invoke-direct {v2, v3, v4}, Lq5/n;-><init>(Ljava/lang/String;Lv5/f;)V

    iput-object v2, v1, Lq5/m;->g:Lq5/n;

    new-instance v2, Lq5/n;

    const-string v3, "initialization_marker"

    iget-object v4, v1, Lq5/m;->k:Lv5/f;

    invoke-direct {v2, v3, v4}, Lq5/n;-><init>(Ljava/lang/String;Lv5/f;)V

    iput-object v2, v1, Lq5/m;->f:Lq5/n;

    new-instance v13, Lr5/i;

    iget-object v2, v1, Lq5/m;->k:Lv5/f;

    iget-object v3, v1, Lq5/m;->o:Lq5/i;

    invoke-direct {v13, v14, v2, v3}, Lr5/i;-><init>(Ljava/lang/String;Lv5/f;Lq5/i;)V

    new-instance v12, Lr5/c;

    iget-object v2, v1, Lq5/m;->k:Lv5/f;

    invoke-direct {v12, v2}, Lr5/c;-><init>(Lv5/f;)V

    new-instance v8, Ly5/a;

    const/16 v2, 0x400

    new-array v3, v11, [Ly5/d;

    new-instance v4, Ly5/c;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Ly5/c;-><init>(I)V

    aput-object v4, v3, v25

    invoke-direct {v8, v2, v3}, Ly5/a;-><init>(I[Ly5/d;)V

    iget-object v2, v1, Lq5/m;->a:Landroid/content/Context;

    iget-object v3, v1, Lq5/m;->j:Lq5/w;

    iget-object v4, v1, Lq5/m;->k:Lv5/f;

    iget-object v10, v1, Lq5/m;->d:Lq5/b0;

    move-object/from16 v5, p1

    move-object v6, v12

    move-object v7, v13

    move-object/from16 v9, p2

    invoke-static/range {v2 .. v10}, Lq5/e0;->g(Landroid/content/Context;Lq5/w;Lv5/f;Lq5/a;Lr5/c;Lr5/i;Ly5/d;Lx5/i;Lq5/b0;)Lq5/e0;

    move-result-object v22

    new-instance v2, Lq5/k;

    iget-object v3, v1, Lq5/m;->a:Landroid/content/Context;

    iget-object v4, v1, Lq5/m;->o:Lq5/i;

    iget-object v5, v1, Lq5/m;->j:Lq5/w;

    iget-object v6, v1, Lq5/m;->c:Lq5/s;

    iget-object v7, v1, Lq5/m;->k:Lv5/f;

    iget-object v8, v1, Lq5/m;->g:Lq5/n;

    iget-object v9, v1, Lq5/m;->p:Ln5/a;

    iget-object v10, v1, Lq5/m;->m:Lo5/a;

    move-object/from16 v21, v12

    move-object v12, v2

    move-object/from16 v20, v13

    move-object v13, v3

    move-object v3, v14

    move-object v14, v4

    move-object v15, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move-object/from16 v19, p1

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    invoke-direct/range {v12 .. v24}, Lq5/k;-><init>(Landroid/content/Context;Lq5/i;Lq5/w;Lq5/s;Lv5/f;Lq5/n;Lq5/a;Lr5/i;Lr5/c;Lq5/e0;Ln5/a;Lo5/a;)V

    iput-object v2, v1, Lq5/m;->i:Lq5/k;

    invoke-virtual/range {p0 .. p0}, Lq5/m;->h()Z

    move-result v2

    invoke-direct/range {p0 .. p0}, Lq5/m;->d()V

    iget-object v4, v1, Lq5/m;->i:Lq5/k;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v5

    invoke-virtual {v4, v3, v5, v0}, Lq5/k;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lx5/i;)V

    if-eqz v2, :cond_0

    iget-object v2, v1, Lq5/m;->a:Landroid/content/Context;

    invoke-static {v2}, Lq5/h;->c(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v2

    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    invoke-virtual {v2, v3}, Ln5/f;->b(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lq5/m;->k(Lx5/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v25

    :cond_0
    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v2, "Successfully configured exception handler."

    invoke-virtual {v0, v2}, Ln5/f;->b(Ljava/lang/String;)V

    return v11

    :catch_0
    move-exception v0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-virtual {v2, v3, v0}, Ln5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lq5/m;->i:Lq5/k;

    return v25

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0}, Lq5/k;->Q()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lq5/m;->c:Lq5/s;

    invoke-virtual {v0, p1}, Lq5/s;->g(Ljava/lang/Boolean;)V

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0, p1, p2}, Lq5/k;->R(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0, p1, p2}, Lq5/k;->S(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lq5/m;->i:Lq5/k;

    invoke-virtual {v0, p1}, Lq5/k;->T(Ljava/lang/String;)V

    return-void
.end method
