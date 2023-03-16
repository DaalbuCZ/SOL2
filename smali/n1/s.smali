.class public Ln1/s;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lh1/e;

.field private final c:Lo1/d;

.field private final d:Ln1/y;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lp1/b;

.field private final g:Lq1/a;

.field private final h:Lq1/a;

.field private final i:Lo1/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh1/e;Lo1/d;Ln1/y;Ljava/util/concurrent/Executor;Lp1/b;Lq1/a;Lq1/a;Lo1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/s;->a:Landroid/content/Context;

    iput-object p2, p0, Ln1/s;->b:Lh1/e;

    iput-object p3, p0, Ln1/s;->c:Lo1/d;

    iput-object p4, p0, Ln1/s;->d:Ln1/y;

    iput-object p5, p0, Ln1/s;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Ln1/s;->f:Lp1/b;

    iput-object p7, p0, Ln1/s;->g:Lq1/a;

    iput-object p8, p0, Ln1/s;->h:Lq1/a;

    iput-object p9, p0, Ln1/s;->i:Lo1/c;

    return-void
.end method

.method public static synthetic a(Ln1/s;Lg1/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ln1/s;->t(Lg1/p;ILjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Ln1/s;Lg1/p;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Ln1/s;->l(Lg1/p;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ln1/s;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ln1/s;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ln1/s;Lg1/p;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Ln1/s;->m(Lg1/p;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ln1/s;Ljava/lang/Iterable;Lg1/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ln1/s;->n(Ljava/lang/Iterable;Lg1/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ln1/s;Lg1/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ln1/s;->r(Lg1/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ln1/s;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ln1/s;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ln1/s;Lg1/p;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln1/s;->s(Lg1/p;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ln1/s;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Ln1/s;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(Lg1/p;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Ln1/s;->c:Lo1/d;

    invoke-interface {v0, p1}, Lo1/d;->I(Lg1/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Lg1/p;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Ln1/s;->c:Lo1/d;

    invoke-interface {v0, p1}, Lo1/d;->F(Lg1/p;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;Lg1/p;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln1/s;->c:Lo1/d;

    invoke-interface {v0, p1}, Lo1/d;->Q(Ljava/lang/Iterable;)V

    iget-object p1, p0, Ln1/s;->c:Lo1/d;

    iget-object v0, p0, Ln1/s;->g:Lq1/a;

    invoke-interface {v0}, Lq1/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lo1/d;->K(Lg1/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln1/s;->c:Lo1/d;

    invoke-interface {v0, p1}, Lo1/d;->h(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln1/s;->i:Lo1/c;

    invoke-interface {v0}, Lo1/c;->b()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Ln1/s;->i:Lo1/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lj1/c$b;->t:Lj1/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lo1/c;->f(JLj1/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(Lg1/p;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ln1/s;->c:Lo1/d;

    iget-object v1, p0, Ln1/s;->g:Lq1/a;

    invoke-interface {v1}, Lq1/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lo1/d;->K(Lg1/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(Lg1/p;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln1/s;->d:Ln1/y;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Ln1/y;->b(Lg1/p;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(Lg1/p;ILjava/lang/Runnable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ln1/s;->f:Lp1/b;

    iget-object v1, p0, Ln1/s;->c:Lo1/d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ln1/i;

    invoke-direct {v2, v1}, Ln1/i;-><init>(Lo1/d;)V

    invoke-interface {v0, v2}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Ln1/s;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ln1/s;->f:Lp1/b;

    new-instance v1, Ln1/m;

    invoke-direct {v1, p0, p1, p2}, Ln1/m;-><init>(Ln1/s;Lg1/p;I)V

    invoke-interface {v0, v1}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Ln1/s;->u(Lg1/p;I)Lh1/g;
    :try_end_0
    .catch Lp1/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v0, p0, Ln1/s;->d:Ln1/y;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Ln1/y;->b(Lg1/p;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p1
.end method


# virtual methods
.method public j(Lh1/m;)Lg1/i;
    .locals 4

    iget-object v0, p0, Ln1/s;->f:Lp1/b;

    iget-object v1, p0, Ln1/s;->i:Lo1/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ln1/r;

    invoke-direct {v2, v1}, Ln1/r;-><init>(Lo1/c;)V

    invoke-interface {v0, v2}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/a;

    invoke-static {}, Lg1/i;->a()Lg1/i$a;

    move-result-object v1

    iget-object v2, p0, Ln1/s;->g:Lq1/a;

    invoke-interface {v2}, Lq1/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg1/i$a;->i(J)Lg1/i$a;

    move-result-object v1

    iget-object v2, p0, Ln1/s;->h:Lq1/a;

    invoke-interface {v2}, Lq1/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg1/i$a;->k(J)Lg1/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, Lg1/i$a;->j(Ljava/lang/String;)Lg1/i$a;

    move-result-object v1

    new-instance v2, Lg1/h;

    const-string v3, "proto"

    invoke-static {v3}, Le1/b;->b(Ljava/lang/String;)Le1/b;

    move-result-object v3

    invoke-virtual {v0}, Lj1/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lg1/h;-><init>(Le1/b;[B)V

    invoke-virtual {v1, v2}, Lg1/i$a;->h(Lg1/h;)Lg1/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lg1/i$a;->d()Lg1/i;

    move-result-object v0

    invoke-interface {p1, v0}, Lh1/m;->a(Lg1/i;)Lg1/i;

    move-result-object p1

    return-object p1
.end method

.method k()Z
    .locals 2

    iget-object v0, p0, Ln1/s;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(Lg1/p;I)Lh1/g;
    .locals 11

    iget-object v0, p0, Ln1/s;->b:Lh1/e;

    invoke-virtual {p1}, Lg1/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lh1/e;->a(Ljava/lang/String;)Lh1/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Lh1/g;->e(J)Lh1/g;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    :cond_1
    :goto_1
    iget-object v1, p0, Ln1/s;->f:Lp1/b;

    new-instance v2, Ln1/k;

    invoke-direct {v2, p0, p1}, Ln1/k;-><init>(Ln1/s;Lg1/p;)V

    invoke-interface {v1, v2}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Ln1/s;->f:Lp1/b;

    new-instance v2, Ln1/l;

    invoke-direct {v2, p0, p1}, Ln1/l;-><init>(Ln1/s;Lg1/p;)V

    invoke-interface {v1, v2}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, Lk1/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lh1/g;->a()Lh1/g;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo1/k;

    invoke-virtual {v3}, Lo1/k;->b()Lg1/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lg1/p;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Ln1/s;->j(Lh1/m;)Lg1/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, Lh1/f;->a()Lh1/f$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lh1/f$a;->b(Ljava/lang/Iterable;)Lh1/f$a;

    move-result-object v1

    invoke-virtual {p1}, Lg1/p;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lh1/f$a;->c([B)Lh1/f$a;

    move-result-object v1

    invoke-virtual {v1}, Lh1/f$a;->a()Lh1/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lh1/m;->b(Lh1/f;)Lh1/g;

    move-result-object v1

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, Lh1/g;->c()Lh1/g$a;

    move-result-object v1

    sget-object v2, Lh1/g$a;->o:Lh1/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Ln1/s;->f:Lp1/b;

    new-instance v1, Ln1/p;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Ln1/p;-><init>(Ln1/s;Ljava/lang/Iterable;Lg1/p;J)V

    invoke-interface {v0, v1}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    iget-object v0, p0, Ln1/s;->d:Ln1/y;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, Ln1/y;->a(Lg1/p;IZ)V

    return-object v3

    :cond_6
    iget-object v1, p0, Ln1/s;->f:Lp1/b;

    new-instance v2, Ln1/o;

    invoke-direct {v2, p0, v6}, Ln1/o;-><init>(Ln1/s;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    invoke-virtual {v3}, Lh1/g;->c()Lh1/g$a;

    move-result-object v1

    sget-object v2, Lh1/g$a;->n:Lh1/g$a;

    if-ne v1, v2, :cond_7

    invoke-virtual {v3}, Lh1/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, Lg1/p;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Ln1/s;->f:Lp1/b;

    new-instance v5, Ln1/j;

    invoke-direct {v5, p0}, Ln1/j;-><init>(Ln1/s;)V

    invoke-interface {v4, v5}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, Lh1/g;->c()Lh1/g$a;

    move-result-object v1

    sget-object v2, Lh1/g$a;->q:Lh1/g$a;

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo1/k;

    invoke-virtual {v4}, Lo1/k;->b()Lg1/i;

    move-result-object v4

    invoke-virtual {v4}, Lg1/i;->j()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_6

    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_6
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    iget-object v2, p0, Ln1/s;->f:Lp1/b;

    new-instance v4, Ln1/q;

    invoke-direct {v4, p0, v1}, Ln1/q;-><init>(Ln1/s;Ljava/util/Map;)V

    invoke-interface {v2, v4}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    iget-object p2, p0, Ln1/s;->f:Lp1/b;

    new-instance v0, Ln1/n;

    invoke-direct {v0, p0, p1, v8, v9}, Ln1/n;-><init>(Ln1/s;Lg1/p;J)V

    invoke-interface {p2, v0}, Lp1/b;->c(Lp1/b$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(Lg1/p;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Ln1/s;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Ln1/h;

    invoke-direct {v1, p0, p1, p2, p3}, Ln1/h;-><init>(Ln1/s;Lg1/p;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
