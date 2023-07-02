.class public Lr5/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ln6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/a<",
            "Ln5/a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile b:Lt5/a;

.field private volatile c:Lu5/b;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lu5/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln6/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln6/a<",
            "Ln5/a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lu5/c;

    invoke-direct {v0}, Lu5/c;-><init>()V

    new-instance v1, Lt5/f;

    invoke-direct {v1}, Lt5/f;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lr5/d;-><init>(Ln6/a;Lu5/b;Lt5/a;)V

    return-void
.end method

.method public constructor <init>(Ln6/a;Lu5/b;Lt5/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln6/a<",
            "Ln5/a;",
            ">;",
            "Lu5/b;",
            "Lt5/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/d;->a:Ln6/a;

    iput-object p2, p0, Lr5/d;->c:Lu5/b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lr5/d;->d:Ljava/util/List;

    iput-object p3, p0, Lr5/d;->b:Lt5/a;

    invoke-direct {p0}, Lr5/d;->f()V

    return-void
.end method

.method public static synthetic a(Lr5/d;Ln6/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lr5/d;->i(Ln6/b;)V

    return-void
.end method

.method public static synthetic b(Lr5/d;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr5/d;->g(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic c(Lr5/d;Lu5/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lr5/d;->h(Lu5/a;)V

    return-void
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lr5/d;->a:Ln6/a;

    new-instance v1, Lr5/a;

    invoke-direct {v1, p0}, Lr5/a;-><init>(Lr5/d;)V

    invoke-interface {v0, v1}, Ln6/a;->a(Ln6/a$a;)V

    return-void
.end method

.method private synthetic g(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lr5/d;->b:Lt5/a;

    invoke-interface {v0, p1, p2}, Lt5/a;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private synthetic h(Lu5/a;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr5/d;->c:Lu5/b;

    instance-of v0, v0, Lu5/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr5/d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Lr5/d;->c:Lu5/b;

    invoke-interface {v0, p1}, Lu5/b;->a(Lu5/a;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private synthetic i(Ln6/b;)V
    .locals 5

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "AnalyticsConnector now available."

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Ln6/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln5/a;

    new-instance v0, Lt5/e;

    invoke-direct {v0, p1}, Lt5/e;-><init>(Ln5/a;)V

    new-instance v1, Lr5/e;

    invoke-direct {v1}, Lr5/e;-><init>()V

    invoke-static {p1, v1}, Lr5/d;->j(Ln5/a;Lr5/e;)Ln5/a$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v2, "Registered Firebase Analytics listener."

    invoke-virtual {p1, v2}, Ls5/f;->b(Ljava/lang/String;)V

    new-instance p1, Lt5/d;

    invoke-direct {p1}, Lt5/d;-><init>()V

    new-instance v2, Lt5/c;

    const/16 v3, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v0, v3, v4}, Lt5/c;-><init>(Lt5/e;ILjava/util/concurrent/TimeUnit;)V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr5/d;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu5/a;

    invoke-virtual {p1, v3}, Lt5/d;->a(Lu5/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Lr5/e;->d(Lt5/b;)V

    invoke-virtual {v1, v2}, Lr5/e;->e(Lt5/b;)V

    iput-object p1, p0, Lr5/d;->c:Lu5/b;

    iput-object v2, p0, Lr5/d;->b:Lt5/a;

    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p1

    const-string v0, "Could not register Firebase Analytics listener; a listener is already registered."

    invoke-virtual {p1, v0}, Ls5/f;->k(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private static j(Ln5/a;Lr5/e;)Ln5/a$a;
    .locals 2

    const-string v0, "clx"

    invoke-interface {p0, v0, p1}, Ln5/a;->a(Ljava/lang/String;Ln5/a$b;)Ln5/a$a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object v0

    const-string v1, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    invoke-virtual {v0, v1}, Ls5/f;->b(Ljava/lang/String;)V

    const-string v0, "crash"

    invoke-interface {p0, v0, p1}, Ln5/a;->a(Ljava/lang/String;Ln5/a$b;)Ln5/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ls5/f;->f()Ls5/f;

    move-result-object p0

    const-string p1, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    invoke-virtual {p0, p1}, Ls5/f;->k(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public d()Lt5/a;
    .locals 1

    new-instance v0, Lr5/b;

    invoke-direct {v0, p0}, Lr5/b;-><init>(Lr5/d;)V

    return-object v0
.end method

.method public e()Lu5/b;
    .locals 1

    new-instance v0, Lr5/c;

    invoke-direct {v0, p0}, Lr5/c;-><init>(Lr5/d;)V

    return-object v0
.end method
