.class public Lcom/google/firebase/crashlytics/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Lq5/m;


# direct methods
.method private constructor <init>(Lq5/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    return-void
.end method

.method public static d()Lcom/google/firebase/crashlytics/a;
    .locals 2

    invoke-static {}, Lf5/e;->n()Lf5/e;

    move-result-object v0

    const-class v1, Lcom/google/firebase/crashlytics/a;

    invoke-virtual {v0, v1}, Lf5/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/crashlytics/a;

    const-string v1, "FirebaseCrashlytics component is not present."

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method static e(Lf5/e;Lj6/e;Li6/a;Li6/a;)Lcom/google/firebase/crashlytics/a;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/e;",
            "Lj6/e;",
            "Li6/a<",
            "Ln5/a;",
            ">;",
            "Li6/a<",
            "Li5/a;",
            ">;)",
            "Lcom/google/firebase/crashlytics/a;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lf5/e;->l()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Firebase Crashlytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lq5/m;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln5/f;->g(Ljava/lang/String;)V

    new-instance v13, Lv5/f;

    invoke-direct {v13, v0}, Lv5/f;-><init>(Landroid/content/Context;)V

    new-instance v14, Lq5/s;

    move-object/from16 v2, p0

    invoke-direct {v14, v2}, Lq5/s;-><init>(Lf5/e;)V

    new-instance v15, Lq5/w;

    move-object/from16 v3, p1

    invoke-direct {v15, v0, v1, v3, v14}, Lq5/w;-><init>(Landroid/content/Context;Ljava/lang/String;Lj6/e;Lq5/s;)V

    new-instance v7, Ln5/d;

    move-object/from16 v1, p2

    invoke-direct {v7, v1}, Ln5/d;-><init>(Li6/a;)V

    new-instance v1, Lm5/d;

    move-object/from16 v3, p3

    invoke-direct {v1, v3}, Lm5/d;-><init>(Li6/a;)V

    const-string v3, "Crashlytics Exception Handler"

    invoke-static {v3}, Lq5/u;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v12

    new-instance v3, Lq5/m;

    invoke-virtual {v1}, Lm5/d;->e()Lp5/b;

    move-result-object v9

    invoke-virtual {v1}, Lm5/d;->d()Lo5/a;

    move-result-object v10

    move-object v4, v3

    move-object/from16 v5, p0

    move-object v6, v15

    move-object v8, v14

    move-object v11, v13

    invoke-direct/range {v4 .. v12}, Lq5/m;-><init>(Lf5/e;Lq5/w;Ln5/a;Lq5/s;Lp5/b;Lo5/a;Lv5/f;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual/range {p0 .. p0}, Lf5/e;->q()Lf5/l;

    move-result-object v1

    invoke-virtual {v1}, Lf5/l;->c()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, Lq5/h;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lq5/h;->l(Landroid/content/Context;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Mapping file ID is: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/f;->b(Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq5/e;

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v6

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v2}, Lq5/e;->c()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v2}, Lq5/e;->a()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    invoke-virtual {v2}, Lq5/e;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v8, v9

    const-string v2, "Build id for %s on %s: %s"

    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ln5/f;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v6, Ln5/e;

    invoke-direct {v6, v0}, Ln5/e;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    move-object v2, v15

    move-object v9, v3

    move-object v3, v7

    :try_start_0
    invoke-static/range {v1 .. v6}, Lq5/a;->a(Landroid/content/Context;Lq5/w;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln5/e;)Lq5/a;

    move-result-object v10
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Installer package name is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v10, Lq5/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/f;->i(Ljava/lang/String;)V

    const-string v1, "com.google.firebase.crashlytics.startup"

    invoke-static {v1}, Lq5/u;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v11

    new-instance v4, Lu5/b;

    invoke-direct {v4}, Lu5/b;-><init>()V

    iget-object v5, v10, Lq5/a;->f:Ljava/lang/String;

    iget-object v6, v10, Lq5/a;->g:Ljava/lang/String;

    move-object v1, v0

    move-object v2, v7

    move-object v3, v15

    move-object v7, v13

    move-object v8, v14

    invoke-static/range {v1 .. v8}, Lx5/f;->l(Landroid/content/Context;Ljava/lang/String;Lq5/w;Lu5/b;Ljava/lang/String;Ljava/lang/String;Lv5/f;Lq5/s;)Lx5/f;

    move-result-object v0

    invoke-virtual {v0, v11}, Lx5/f;->o(Ljava/util/concurrent/Executor;)Lt4/i;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/crashlytics/a$a;

    invoke-direct {v2}, Lcom/google/firebase/crashlytics/a$a;-><init>()V

    invoke-virtual {v1, v11, v2}, Lt4/i;->h(Ljava/util/concurrent/Executor;Lt4/a;)Lt4/i;

    invoke-virtual {v9, v10, v0}, Lq5/m;->s(Lq5/a;Lx5/i;)Z

    move-result v1

    new-instance v2, Lcom/google/firebase/crashlytics/a$b;

    invoke-direct {v2, v1, v9, v0}, Lcom/google/firebase/crashlytics/a$b;-><init>(ZLq5/m;Lx5/f;)V

    invoke-static {v11, v2}, Lt4/l;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lt4/i;

    new-instance v0, Lcom/google/firebase/crashlytics/a;

    invoke-direct {v0, v9}, Lcom/google/firebase/crashlytics/a;-><init>(Lq5/m;)V

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v2, "Error retrieving app package info."

    invoke-virtual {v0, v2, v1}, Ln5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()Lt4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0}, Lq5/m;->e()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0}, Lq5/m;->f()Lt4/i;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0}, Lq5/m;->g()Z

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0, p1}, Lq5/m;->n(Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object p1

    const-string v0, "A null value was passed to recordException. Ignoring."

    invoke-virtual {p1, v0}, Ln5/f;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0, p1}, Lq5/m;->o(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0}, Lq5/m;->t()Lt4/i;

    return-void
.end method

.method public i(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0, p1}, Lq5/m;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq5/m;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0, p1, p2}, Lq5/m;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lq5/m;

    invoke-virtual {v0, p1}, Lq5/m;->x(Ljava/lang/String;)V

    return-void
.end method
