.class public Ly0/n1;
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

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ly0/s2;Ly0/f2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/n1;->a:Ly0/s2;

    iput-object p2, p0, Ly0/n1;->b:Ly0/f2;

    iput-object p3, p0, Ly0/n1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ly0/n2;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly0/n2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly0/n1;->a:Ly0/s2;

    invoke-interface {v0}, Ly0/s2;->c()Ly0/z1;

    move-result-object v0

    iget-object v1, p0, Ly0/n1;->a:Ly0/s2;

    invoke-interface {v1}, Ly0/s2;->f()Ly0/z2;

    move-result-object v1

    invoke-virtual {v1}, Ly0/z2;->k()Ly0/c0;

    move-result-object v2

    invoke-virtual {v2}, Ly0/c0;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Ly0/z1;->l()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gtz v3, :cond_0

    :try_start_0
    iget-object v3, p0, Ly0/n1;->b:Ly0/f2;

    invoke-virtual {v3, v0}, Ly0/f2;->a(Ly0/z1;)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ly0/z1;->b(J)V

    iget-object v5, p0, Ly0/n1;->a:Ly0/s2;

    invoke-interface {v5, v3, v4}, Ly0/s2;->m(J)V
    :try_end_0
    .catch Ly0/v0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ly0/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    :goto_0
    const/4 v3, 0x0

    invoke-virtual {v2}, Ly0/c0;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/d3;

    invoke-virtual {v0}, Ly0/z1;->l()J

    move-result-wide v5

    long-to-int v5, v5

    int-to-long v5, v5

    invoke-virtual {v3, v5, v6}, Ly0/d3;->b(J)V

    new-instance v5, Ly0/g0;

    iget-object v6, p0, Ly0/n1;->c:Ljava/lang/String;

    invoke-direct {v5, v6}, Ly0/g0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ly0/d3;->c(Ly0/g0;)V

    :try_start_1
    iget-object v5, p0, Ly0/n1;->b:Ly0/f2;

    invoke-virtual {v5, v3, v0}, Ly0/f2;->f(Ly0/d3;Ly0/z1;)V
    :try_end_1
    .catch Ly0/v0; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v3, 0x1

    goto :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Ly0/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ly0/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ly0/c0;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ly0/z2;->g(Ljava/util/List;)Z

    :cond_2
    new-instance v0, Ly0/n2;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Ly0/n2;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    invoke-virtual {v2}, Ly0/c0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {v2}, Ly0/c0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v1, v2}, Ly0/z2;->d(Ljava/io/File;)Z

    goto :goto_2

    :cond_4
    new-instance v0, Ly0/n2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Ly0/n2;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/n1;->a()Ly0/n2;

    move-result-object v0

    return-object v0
.end method
