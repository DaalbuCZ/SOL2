.class public Lcom/google/firebase/crashlytics/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Lv5/m;


# direct methods
.method private constructor <init>(Lv5/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    return-void
.end method

.method public static d()Lcom/google/firebase/crashlytics/a;
    .locals 2

    invoke-static {}, Lk5/e;->n()Lk5/e;

    move-result-object v0

    const-class v1, Lcom/google/firebase/crashlytics/a;

    invoke-virtual {v0, v1}, Lk5/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/crashlytics/a;

    const-string v1, "FirebaseCrashlytics component is not present."

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method static e(Lk5/e;Lo6/e;Ln6/a;Ln6/a;)Lcom/google/firebase/crashlytics/a;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/e;",
            "Lo6/e;",
            "Ln6/a<",
            "Ls5/a;",
            ">;",
            "Ln6/a<",
            "Ln5/a;",
            ">;)",
            "Lcom/google/firebase/crashlytics/a;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lk5/e;->l()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Firebase Crashlytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lv5/m;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls5/f;->g(Ljava/lang/String;)V

    new-instance v13, La6/f;

    invoke-direct {v13, v0}, La6/f;-><init>(Landroid/content/Context;)V

    new-instance v14, Lv5/s;

    move-object/from16 v2, p0

    invoke-direct {v14, v2}, Lv5/s;-><init>(Lk5/e;)V

    new-instance v15, Lv5/w;

    move-object/from16 v3, p1

    invoke-direct {v15, v0, v1, v3, v14}, Lv5/w;-><init>(Landroid/content/Context;Ljava/lang/String;Lo6/e;Lv5/s;)V

    new-instance v7, Ls5/d;

    move-object/from16 v1, p2

    invoke-direct {v7, v1}, Ls5/d;-><init>(Ln6/a;)V

    new-instance v1, Lr5/d;

    move-object/from16 v3, p3

    invoke-direct {v1, v3}, Lr5/d;-><init>(Ln6/a;)V

    const-string v3, "Crashlytics Exception Handler"

    invoke-static {v3}, Lv5/u;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v12

    new-instance v3, Lv5/m;

    invoke-virtual {v1}, Lr5/d;->e()Lu5/b;

    move-result-object v9

    invoke-virtual {v1}, Lr5/d;->d()Lt5/a;

    move-result-object v10

    move-object v4, v3

    move-object/from16 v5, p0

    move-object v6, v15

    move-object v8, v14

    move-object v11, v13

    invoke-direct/range {v4 .. v12}, Lv5/m;-><init>(Lk5/e;Lv5/w;Ls5/a;Lv5/s;Lu5/b;Lt5/a;La6/f;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual/range {p0 .. p0}, Lk5/e;->q()Lk5/l;

    move-result-object v1

    invoke-virtual {v1}, Lk5/l;->c()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, Lv5/h;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lv5/h;->l(Landroid/content/Context;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Mapping file ID is: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv5/e;

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v6

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v2}, Lv5/e;->c()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v2}, Lv5/e;->a()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    invoke-virtual {v2}, Lv5/e;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v8, v9

    const-string v2, "Build id for %s on %s: %s"

    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ls5/f;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v6, Ls5/e;

    invoke-direct {v6, v0}, Ls5/e;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    move-object v2, v15

    move-object v9, v3

    move-object v3, v7

    :try_start_0
    invoke-static/range {v1 .. v6}, Lv5/a;->a(Landroid/content/Context;Lv5/w;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls5/e;)Lv5/a;

    move-result-object v10
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Installer package name is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v10, Lv5/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls5/f;->i(Ljava/lang/String;)V

    const-string v1, "com.google.firebase.crashlytics.startup"

    invoke-static {v1}, Lv5/u;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v11

    new-instance v4, Lz5/b;

    invoke-direct {v4}, Lz5/b;-><init>()V

    iget-object v5, v10, Lv5/a;->f:Ljava/lang/String;

    iget-object v6, v10, Lv5/a;->g:Ljava/lang/String;

    move-object v1, v0

    move-object v2, v7

    move-object v3, v15

    move-object v7, v13

    move-object v8, v14

    invoke-static/range {v1 .. v8}, Lc6/f;->l(Landroid/content/Context;Ljava/lang/String;Lv5/w;Lz5/b;Ljava/lang/String;Ljava/lang/String;La6/f;Lv5/s;)Lc6/f;

    move-result-object v0

    invoke-virtual {v0, v11}, Lc6/f;->p(Ljava/util/concurrent/Executor;)Ly4/i;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/crashlytics/a$a;

    invoke-direct {v2}, Lcom/google/firebase/crashlytics/a$a;-><init>()V

    invoke-virtual {v1, v11, v2}, Ly4/i;->h(Ljava/util/concurrent/Executor;Ly4/a;)Ly4/i;

    invoke-virtual {v9, v10, v0}, Lv5/m;->s(Lv5/a;Lc6/i;)Z

    move-result v1

    new-instance v2, Lcom/google/firebase/crashlytics/a$b;

    invoke-direct {v2, v1, v9, v0}, Lcom/google/firebase/crashlytics/a$b;-><init>(ZLv5/m;Lc6/f;)V

    invoke-static {v11, v2}, Ly4/l;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Ly4/i;

    new-instance v0, Lcom/google/firebase/crashlytics/a;

    invoke-direct {v0, v9}, Lcom/google/firebase/crashlytics/a;-><init>(Lv5/m;)V

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v2, "Error retrieving app package info."

    invoke-virtual {v0, v2, v1}, Ls5/f;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()Ly4/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0}, Lv5/m;->e()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0}, Lv5/m;->f()Ly4/i;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0}, Lv5/m;->g()Z

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0, p1}, Lv5/m;->n(Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v0, "A null value was passed to recordException. Ignoring."

    invoke-virtual {p1, v0}, Ls5/f;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0, p1}, Lv5/m;->o(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0}, Lv5/m;->t()Ly4/i;

    return-void
.end method

.method public i(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0, p1}, Lv5/m;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv5/m;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0, p1, p2}, Lv5/m;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/a;->a:Lv5/m;

    invoke-virtual {v0, p1}, Lv5/m;->x(Ljava/lang/String;)V

    return-void
.end method
