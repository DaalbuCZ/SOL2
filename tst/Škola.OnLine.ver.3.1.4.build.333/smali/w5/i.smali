.class public Lw5/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw5/i$a;
    }
.end annotation


# instance fields
.field private final a:Lw5/d;

.field private final b:Lv5/i;

.field private final c:Ljava/lang/String;

.field private final d:Lw5/i$a;

.field private final e:Lw5/i$a;

.field private final f:Ljava/util/concurrent/atomic/AtomicMarkableReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicMarkableReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;La6/f;Lv5/i;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw5/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lw5/i$a;-><init>(Lw5/i;Z)V

    iput-object v0, p0, Lw5/i;->d:Lw5/i$a;

    new-instance v0, Lw5/i$a;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lw5/i$a;-><init>(Lw5/i;Z)V

    iput-object v0, p0, Lw5/i;->e:Lw5/i$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;-><init>(Ljava/lang/Object;Z)V

    iput-object v0, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    iput-object p1, p0, Lw5/i;->c:Ljava/lang/String;

    new-instance p1, Lw5/d;

    invoke-direct {p1, p2}, Lw5/d;-><init>(La6/f;)V

    iput-object p1, p0, Lw5/i;->a:Lw5/d;

    iput-object p3, p0, Lw5/i;->b:Lv5/i;

    return-void
.end method

.method public static synthetic a(Lw5/i;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lw5/i;->h()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lw5/i;)Lv5/i;
    .locals 0

    iget-object p0, p0, Lw5/i;->b:Lv5/i;

    return-object p0
.end method

.method static synthetic c(Lw5/i;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lw5/i;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lw5/i;)Lw5/d;
    .locals 0

    iget-object p0, p0, Lw5/i;->a:Lw5/d;

    return-object p0
.end method

.method private synthetic h()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lw5/i;->k()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public static i(Ljava/lang/String;La6/f;Lv5/i;)Lw5/i;
    .locals 3

    new-instance v0, Lw5/d;

    invoke-direct {v0, p1}, Lw5/d;-><init>(La6/f;)V

    new-instance v1, Lw5/i;

    invoke-direct {v1, p0, p1, p2}, Lw5/i;-><init>(Ljava/lang/String;La6/f;Lv5/i;)V

    iget-object p1, v1, Lw5/i;->d:Lw5/i$a;

    iget-object p1, p1, Lw5/i$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw5/b;

    const/4 p2, 0x0

    invoke-virtual {v0, p0, p2}, Lw5/d;->g(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lw5/b;->e(Ljava/util/Map;)V

    iget-object p1, v1, Lw5/i;->e:Lw5/i$a;

    iget-object p1, p1, Lw5/i$a;->a:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw5/b;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v2}, Lw5/d;->g(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1, v2}, Lw5/b;->e(Ljava/util/Map;)V

    iget-object p1, v1, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0, p0}, Lw5/d;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    return-object v1
.end method

.method public static j(Ljava/lang/String;La6/f;)Ljava/lang/String;
    .locals 1

    new-instance v0, Lw5/d;

    invoke-direct {v0, p1}, Lw5/d;-><init>(La6/f;)V

    invoke-virtual {v0, p0}, Lw5/d;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private k()V
    .locals 5

    iget-object v0, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lw5/i;->g()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    iget-object v4, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v4, v1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    iget-object v0, p0, Lw5/i;->a:Lw5/d;

    iget-object v2, p0, Lw5/i;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lw5/d;->m(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public e()Ljava/util/Map;
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

    iget-object v0, p0, Lw5/i;->d:Lw5/i$a;

    invoke-virtual {v0}, Lw5/i$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Map;
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

    iget-object v0, p0, Lw5/i;->e:Lw5/i$a;

    invoke-virtual {v0}, Lw5/i$a;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lw5/i;->d:Lw5/i$a;

    invoke-virtual {v0, p1, p2}, Lw5/i$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lw5/i;->e:Lw5/i$a;

    invoke-virtual {v0, p1, p2}, Lw5/i$a;->f(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public n(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x400

    invoke-static {p1, v0}, Lw5/b;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, v1}, Lv5/h;->B(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lw5/i;->f:Ljava/util/concurrent/atomic/AtomicMarkableReference;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lw5/i;->b:Lv5/i;

    new-instance v0, Lw5/g;

    invoke-direct {v0, p0}, Lw5/g;-><init>(Lw5/i;)V

    invoke-virtual {p1, v0}, Lv5/i;->h(Ljava/util/concurrent/Callable;)Ly4/i;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
