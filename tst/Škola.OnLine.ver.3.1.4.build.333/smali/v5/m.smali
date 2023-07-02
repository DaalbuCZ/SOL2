.class public Lv5/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lk5/e;

.field private final c:Lv5/s;

.field private final d:Lv5/b0;

.field private final e:J

.field private f:Lv5/n;

.field private g:Lv5/n;

.field private h:Z

.field private i:Lv5/k;

.field private final j:Lv5/w;

.field private final k:La6/f;

.field public final l:Lu5/b;

.field private final m:Lt5/a;

.field private final n:Ljava/util/concurrent/ExecutorService;

.field private final o:Lv5/i;

.field private final p:Ls5/a;


# direct methods
.method public constructor <init>(Lk5/e;Lv5/w;Ls5/a;Lv5/s;Lu5/b;Lt5/a;La6/f;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/m;->b:Lk5/e;

    iput-object p4, p0, Lv5/m;->c:Lv5/s;

    invoke-virtual {p1}, Lk5/e;->l()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lv5/m;->a:Landroid/content/Context;

    iput-object p2, p0, Lv5/m;->j:Lv5/w;

    iput-object p3, p0, Lv5/m;->p:Ls5/a;

    iput-object p5, p0, Lv5/m;->l:Lu5/b;

    iput-object p6, p0, Lv5/m;->m:Lt5/a;

    iput-object p8, p0, Lv5/m;->n:Ljava/util/concurrent/ExecutorService;

    iput-object p7, p0, Lv5/m;->k:La6/f;

    new-instance p1, Lv5/i;

    invoke-direct {p1, p8}, Lv5/i;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lv5/m;->o:Lv5/i;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lv5/m;->e:J

    new-instance p1, Lv5/b0;

    invoke-direct {p1}, Lv5/b0;-><init>()V

    iput-object p1, p0, Lv5/m;->d:Lv5/b0;

    return-void
.end method

.method static synthetic a(Lv5/m;Lc6/i;)Ly4/i;
    .locals 0

    invoke-direct {p0, p1}, Lv5/m;->i(Lc6/i;)Ly4/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lv5/m;)Lv5/n;
    .locals 0

    iget-object p0, p0, Lv5/m;->f:Lv5/n;

    return-object p0
.end method

.method static synthetic c(Lv5/m;)Lv5/k;
    .locals 0

    iget-object p0, p0, Lv5/m;->i:Lv5/k;

    return-object p0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lv5/m;->o:Lv5/i;

    new-instance v1, Lv5/m$d;

    invoke-direct {v1, p0}, Lv5/m$d;-><init>(Lv5/m;)V

    invoke-virtual {v0, v1}, Lv5/i;->h(Ljava/util/concurrent/Callable;)Ly4/i;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lv5/j0;->d(Ly4/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    iput-boolean v0, p0, Lv5/m;->h:Z

    return-void

    :catch_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i(Lc6/i;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/i;",
            ")",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    invoke-virtual {p0}, Lv5/m;->r()V

    :try_start_0
    iget-object v1, p0, Lv5/m;->l:Lu5/b;

    new-instance v2, Lv5/l;

    invoke-direct {v2, p0}, Lv5/l;-><init>(Lv5/m;)V

    invoke-interface {v1, v2}, Lu5/b;->a(Lu5/a;)V

    invoke-interface {p1}, Lc6/i;->b()Lc6/d;

    move-result-object v1

    iget-object v1, v1, Lc6/d;->b:Lc6/d$a;

    iget-boolean v1, v1, Lc6/d$a;->a:Z

    if-nez v1, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Ls5/f;->b(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ly4/l;->d(Ljava/lang/Exception;)Ly4/i;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lv5/m;->q()V

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0, p1}, Lv5/k;->B(Lc6/i;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Previous sessions could not be finalized."

    invoke-virtual {v0, v1}, Ls5/f;->k(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-interface {p1}, Lc6/i;->a()Ly4/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv5/k;->U(Ly4/i;)Ly4/i;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Lv5/m;->q()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    invoke-virtual {v0, v1, p1}, Ls5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Ly4/l;->d(Ljava/lang/Exception;)Ly4/i;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Lv5/m;->q()V

    return-object p1

    :goto_0
    invoke-virtual {p0}, Lv5/m;->q()V

    throw p1
.end method

.method private k(Lc6/i;)V
    .locals 3

    new-instance v0, Lv5/m$b;

    invoke-direct {v0, p0, p1}, Lv5/m$b;-><init>(Lv5/m;Lc6/i;)V

    iget-object p1, p0, Lv5/m;->n:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

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

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during initialization."

    goto :goto_0

    :catch_2
    move-exception p1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    :goto_0
    invoke-virtual {v0, v1, p1}, Ls5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

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

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, Ls5/f;->i(Ljava/lang/String;)V

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
.method public e()Ly4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0}, Lv5/k;->o()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public f()Ly4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0}, Lv5/k;->t()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lv5/m;->h:Z

    return v0
.end method

.method h()Z
    .locals 1

    iget-object v0, p0, Lv5/m;->f:Lv5/n;

    invoke-virtual {v0}, Lv5/n;->c()Z

    move-result v0

    return v0
.end method

.method public j(Lc6/i;)Ly4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/i;",
            ")",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/m;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lv5/m$a;

    invoke-direct {v1, p0, p1}, Lv5/m$a;-><init>(Lv5/m;Lc6/i;)V

    invoke-static {v0, v1}, Lv5/j0;->f(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lv5/m;->e:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v2, v0, v1, p1}, Lv5/k;->Y(JLjava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lv5/k;->X(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public p(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Recorded on-demand fatal events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lv5/m;->d:Lv5/b0;

    invoke-virtual {v2}, Lv5/b0;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dropped on-demand fatal events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lv5/m;->d:Lv5/b0;

    invoke-virtual {v2}, Lv5/b0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    iget-object v1, p0, Lv5/m;->d:Lv5/b0;

    invoke-virtual {v1}, Lv5/b0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.crashlytics.on-demand.recorded-exceptions"

    invoke-virtual {v0, v2, v1}, Lv5/k;->S(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    iget-object v1, p0, Lv5/m;->d:Lv5/b0;

    invoke-virtual {v1}, Lv5/b0;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.crashlytics.on-demand.dropped-exceptions"

    invoke-virtual {v0, v2, v1}, Lv5/k;->S(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lv5/k;->O(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method q()V
    .locals 2

    iget-object v0, p0, Lv5/m;->o:Lv5/i;

    new-instance v1, Lv5/m$c;

    invoke-direct {v1, p0}, Lv5/m$c;-><init>(Lv5/m;)V

    invoke-virtual {v0, v1}, Lv5/i;->h(Ljava/util/concurrent/Callable;)Ly4/i;

    return-void
.end method

.method r()V
    .locals 2

    iget-object v0, p0, Lv5/m;->o:Lv5/i;

    invoke-virtual {v0}, Lv5/i;->b()V

    iget-object v0, p0, Lv5/m;->f:Lv5/n;

    invoke-virtual {v0}, Lv5/n;->a()Z

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Initialization marker file was created."

    invoke-virtual {v0, v1}, Ls5/f;->i(Ljava/lang/String;)V

    return-void
.end method

.method public s(Lv5/a;Lc6/i;)Z
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v1, Lv5/m;->a:Landroid/content/Context;

    const-string v3, "com.crashlytics.RequireBuildId"

    const/4 v11, 0x1

    invoke-static {v2, v3, v11}, Lv5/h;->k(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v15, p1

    iget-object v3, v15, Lv5/a;->b:Ljava/lang/String;

    invoke-static {v3, v2}, Lv5/m;->m(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lv5/g;

    iget-object v3, v1, Lv5/m;->j:Lv5/w;

    invoke-direct {v2, v3}, Lv5/g;-><init>(Lv5/w;)V

    invoke-virtual {v2}, Lv5/g;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v25, 0x0

    :try_start_0
    new-instance v2, Lv5/n;

    const-string v3, "crash_marker"

    iget-object v4, v1, Lv5/m;->k:La6/f;

    invoke-direct {v2, v3, v4}, Lv5/n;-><init>(Ljava/lang/String;La6/f;)V

    iput-object v2, v1, Lv5/m;->g:Lv5/n;

    new-instance v2, Lv5/n;

    const-string v3, "initialization_marker"

    iget-object v4, v1, Lv5/m;->k:La6/f;

    invoke-direct {v2, v3, v4}, Lv5/n;-><init>(Ljava/lang/String;La6/f;)V

    iput-object v2, v1, Lv5/m;->f:Lv5/n;

    new-instance v13, Lw5/i;

    iget-object v2, v1, Lv5/m;->k:La6/f;

    iget-object v3, v1, Lv5/m;->o:Lv5/i;

    invoke-direct {v13, v14, v2, v3}, Lw5/i;-><init>(Ljava/lang/String;La6/f;Lv5/i;)V

    new-instance v12, Lw5/c;

    iget-object v2, v1, Lv5/m;->k:La6/f;

    invoke-direct {v12, v2}, Lw5/c;-><init>(La6/f;)V

    new-instance v8, Ld6/a;

    const/16 v2, 0x400

    new-array v3, v11, [Ld6/d;

    new-instance v4, Ld6/c;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Ld6/c;-><init>(I)V

    aput-object v4, v3, v25

    invoke-direct {v8, v2, v3}, Ld6/a;-><init>(I[Ld6/d;)V

    iget-object v2, v1, Lv5/m;->a:Landroid/content/Context;

    iget-object v3, v1, Lv5/m;->j:Lv5/w;

    iget-object v4, v1, Lv5/m;->k:La6/f;

    iget-object v10, v1, Lv5/m;->d:Lv5/b0;

    move-object/from16 v5, p1

    move-object v6, v12

    move-object v7, v13

    move-object/from16 v9, p2

    invoke-static/range {v2 .. v10}, Lv5/e0;->g(Landroid/content/Context;Lv5/w;La6/f;Lv5/a;Lw5/c;Lw5/i;Ld6/d;Lc6/i;Lv5/b0;)Lv5/e0;

    move-result-object v22

    new-instance v2, Lv5/k;

    iget-object v3, v1, Lv5/m;->a:Landroid/content/Context;

    iget-object v4, v1, Lv5/m;->o:Lv5/i;

    iget-object v5, v1, Lv5/m;->j:Lv5/w;

    iget-object v6, v1, Lv5/m;->c:Lv5/s;

    iget-object v7, v1, Lv5/m;->k:La6/f;

    iget-object v8, v1, Lv5/m;->g:Lv5/n;

    iget-object v9, v1, Lv5/m;->p:Ls5/a;

    iget-object v10, v1, Lv5/m;->m:Lt5/a;

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

    invoke-direct/range {v12 .. v24}, Lv5/k;-><init>(Landroid/content/Context;Lv5/i;Lv5/w;Lv5/s;La6/f;Lv5/n;Lv5/a;Lw5/i;Lw5/c;Lv5/e0;Ls5/a;Lt5/a;)V

    iput-object v2, v1, Lv5/m;->i:Lv5/k;

    invoke-virtual/range {p0 .. p0}, Lv5/m;->h()Z

    move-result v2

    invoke-direct/range {p0 .. p0}, Lv5/m;->d()V

    iget-object v4, v1, Lv5/m;->i:Lv5/k;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v5

    invoke-virtual {v4, v3, v5, v0}, Lv5/k;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lc6/i;)V

    if-eqz v2, :cond_0

    iget-object v2, v1, Lv5/m;->a:Landroid/content/Context;

    invoke-static {v2}, Lv5/h;->c(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v2

    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    invoke-virtual {v2, v3}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lv5/m;->k(Lc6/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v25

    :cond_0
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v2, "Successfully configured exception handler."

    invoke-virtual {v0, v2}, Ls5/f;->b(Ljava/lang/String;)V

    return v11

    :catch_0
    move-exception v0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-virtual {v2, v3, v0}, Ls5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, v1, Lv5/m;->i:Lv5/k;

    return v25

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()Ly4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0}, Lv5/k;->Q()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lv5/m;->c:Lv5/s;

    invoke-virtual {v0, p1}, Lv5/s;->g(Ljava/lang/Boolean;)V

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0, p1, p2}, Lv5/k;->R(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0, p1, p2}, Lv5/k;->S(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv5/m;->i:Lv5/k;

    invoke-virtual {v0, p1}, Lv5/k;->T(Ljava/lang/String;)V

    return-void
.end method
