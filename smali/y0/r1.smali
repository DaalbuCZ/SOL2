.class public Ly0/r1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ly0/n2<",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ly0/s2;

.field private final b:Ly0/f2;

.field private final c:Ly0/n0;


# direct methods
.method public constructor <init>(Ly0/s2;Ly0/f2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/r1;->a:Ly0/s2;

    iput-object p2, p0, Ly0/r1;->b:Ly0/f2;

    const/4 p1, 0x0

    iput-object p1, p0, Ly0/r1;->c:Ly0/n0;

    return-void
.end method

.method public constructor <init>(Ly0/s2;Ly0/f2;Ly0/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ly0/r1;->c:Ly0/n0;

    iput-object p1, p0, Ly0/r1;->a:Ly0/s2;

    iput-object p2, p0, Ly0/r1;->b:Ly0/f2;

    return-void
.end method

.method private a(Ly0/z2;)Ly0/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/z2<",
            "Ly0/n0;",
            ">;)",
            "Ly0/c0<",
            "Ly0/n0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ly0/z2;->j(I)Ly0/c0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()Ly0/n2;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ly0/r1;->a:Ly0/s2;

    invoke-interface {v0}, Ly0/s2;->c()Ly0/z1;

    move-result-object v0

    invoke-virtual {v0}, Ly0/z1;->l()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    :try_start_1
    iget-object v1, p0, Ly0/r1;->b:Ly0/f2;

    invoke-virtual {v1, v0}, Ly0/f2;->a(Ly0/z1;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ly0/z1;->b(J)V

    iget-object v3, p0, Ly0/r1;->a:Ly0/s2;

    invoke-interface {v3, v1, v2}, Ly0/s2;->m(J)V
    :try_end_1
    .catch Ly0/v0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    instance-of v1, v0, Ly0/k1;

    if-nez v1, :cond_0

    invoke-static {v0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    :cond_0
    new-instance v1, Ly0/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    :goto_0
    iget-object v1, p0, Ly0/r1;->a:Ly0/s2;

    invoke-interface {v1}, Ly0/s2;->i()Ly0/z2;

    move-result-object v1

    invoke-direct {p0, v1}, Ly0/r1;->a(Ly0/z2;)Ly0/c0;

    move-result-object v2

    iget-object v3, p0, Ly0/r1;->c:Ly0/n0;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ly0/c0;->a()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Ly0/r1;->c:Ly0/n0;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v2}, Ly0/c0;->c()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2}, Ly0/c0;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    invoke-virtual {v2}, Ly0/c0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v1, v2}, Ly0/z2;->d(Ljava/io/File;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ly0/n2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v0

    :cond_4
    const/4 v3, 0x1

    :goto_2
    invoke-virtual {v2}, Ly0/c0;->c()Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_6

    :try_start_3
    iget-object v4, p0, Ly0/r1;->b:Ly0/f2;

    invoke-virtual {v2}, Ly0/c0;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Ly0/f2;->e(Ljava/util/List;Ly0/z1;)V

    invoke-virtual {v2}, Ly0/c0;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ly0/z2;->g(Ljava/util/List;)Z

    move-result v2

    and-int/2addr v3, v2

    invoke-direct {p0, v1}, Ly0/r1;->a(Ly0/z2;)Ly0/c0;

    move-result-object v2
    :try_end_3
    .catch Ly0/v0; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    :try_start_4
    instance-of v1, v0, Ly0/k1;

    if-nez v1, :cond_5

    invoke-static {v0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    :cond_5
    new-instance v1, Ly0/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_6
    new-instance v0, Ly0/n2;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Ly0/n2;-><init>(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    instance-of v1, v0, Ly0/k1;

    if-eqz v1, :cond_7

    instance-of v1, v0, Ly0/j2;

    if-nez v1, :cond_8

    :cond_7
    invoke-static {v0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    :cond_8
    new-instance v1, Ly0/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/r1;->b()Ly0/n2;

    move-result-object v0

    return-object v0
.end method
