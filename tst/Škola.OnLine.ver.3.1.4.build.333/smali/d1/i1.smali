.class public Ld1/i1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ld1/n2<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ld1/s2;

.field private final b:Ld1/f2;

.field private final c:Ljava/lang/String;

.field private final d:Ld1/k3;

.field private final e:Ld1/s;


# direct methods
.method public constructor <init>(Ld1/s2;Ld1/f2;Ljava/lang/String;Ld1/s;Ld1/k3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/i1;->a:Ld1/s2;

    iput-object p2, p0, Ld1/i1;->b:Ld1/f2;

    iput-object p3, p0, Ld1/i1;->c:Ljava/lang/String;

    iput-object p5, p0, Ld1/i1;->d:Ld1/k3;

    iput-object p4, p0, Ld1/i1;->e:Ld1/s;

    return-void
.end method


# virtual methods
.method public a()Ld1/n2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/n2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/i1;->d:Ld1/k3;

    invoke-virtual {v0}, Ld1/k3;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld1/i1;->a:Ld1/s2;

    invoke-interface {v0}, Ld1/s2;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld1/z1;

    :try_start_0
    iget-object v3, p0, Ld1/i1;->a:Ld1/s2;

    invoke-interface {v3, v2}, Ld1/s2;->k(Ld1/z1;)Ld1/z2;

    move-result-object v3

    invoke-virtual {v3}, Ld1/z2;->i()Ld1/c0;

    move-result-object v3

    invoke-virtual {v3}, Ld1/c0;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Ld1/i1;->b(Ld1/z1;Ljava/util/List;)Ld1/n2;

    move-result-object v3

    invoke-virtual {v3}, Ld1/n2;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lez v4, :cond_0

    new-instance v4, Ld1/u1;

    iget-object v5, p0, Ld1/i1;->b:Ld1/f2;

    iget-object v6, p0, Ld1/i1;->a:Ld1/s2;

    iget-object v7, p0, Ld1/i1;->c:Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v4, v5, v6, v7, v2}, Ld1/u1;-><init>(Ld1/f2;Ld1/s2;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v4}, Ld1/u1;->b()Ld1/n2;

    :cond_0
    invoke-virtual {v3}, Ld1/n2;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2
    :try_end_0
    .catch Ld1/e3; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    new-instance v0, Ld1/n2;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Ld1/n2;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public b(Ld1/z1;Ljava/util/List;)Ld1/n2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ld1/n2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Ld1/z1;->l()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Ld1/i1;->b:Ld1/f2;

    invoke-virtual {v0, p1}, Ld1/f2;->a(Ld1/z1;)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ld1/z1;->b(J)V

    iget-object v0, p0, Ld1/i1;->a:Ld1/s2;

    invoke-virtual {p1}, Ld1/z1;->g()J

    move-result-wide v4

    invoke-interface {v0, v4, v5, v2, v3}, Ld1/s2;->p(JJ)V
    :try_end_0
    .catch Ld1/v0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Ld1/n2;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Ld1/n2;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_1
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "title"

    const-string v3, "Crash Report"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "raw"

    const-string v4, "{}"

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "message"

    const-string v5, ""

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "date"

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v5

    iget-object v2, p0, Ld1/i1;->e:Ld1/s;

    invoke-interface {v2}, Ld1/s;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ld1/u0;->a(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    new-instance v7, Ld1/n0$b;

    invoke-direct {v7}, Ld1/n0$b;-><init>()V

    sget-object v8, Ld1/n0$c;->o:Ld1/n0$c;

    invoke-virtual {v8}, Ld1/n0$c;->e()I

    move-result v8

    invoke-virtual {v7, v8}, Ld1/n0$b;->a(I)Ld1/n0$b;

    move-result-object v7

    const-string v8, "bf_issue"

    invoke-virtual {v7, v8}, Ld1/n0$b;->h(Ljava/lang/String;)Ld1/n0$b;

    move-result-object v7

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ld1/n0$b;->i(Ljava/lang/String;)Ld1/n0$b;

    move-result-object v7

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, v8}, Ld1/n0$b;->d(Ljava/util/Date;)Ld1/n0$b;

    move-result-object v5

    invoke-virtual {v5}, Ld1/n0$b;->e()Ld1/n0;

    move-result-object v5

    iget-object v6, p0, Ld1/i1;->b:Ld1/f2;

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v6, v5, p1}, Ld1/f2;->f(Ljava/util/List;Ld1/z1;)V

    invoke-static {}, Ld1/d3;->a()Ld1/d3$b;

    move-result-object v5

    invoke-virtual {v5, v2}, Ld1/d3$b;->d(Ljava/util/UUID;)Ld1/d3$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Ld1/d3$b;->i(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Ld1/d3$b;->c(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Ld1/d3$b;->g(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {p1}, Ld1/z1;->l()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ld1/d3$b;->a(J)Ld1/d3$b;

    move-result-object v0

    new-instance v2, Ld1/g0;

    iget-object v3, p0, Ld1/i1;->c:Ljava/lang/String;

    invoke-direct {v2, v3}, Ld1/g0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ld1/d3$b;->b(Ld1/g0;)Ld1/d3$b;

    move-result-object v0

    const-string v2, "crash"

    invoke-virtual {v0, v2}, Ld1/d3$b;->k(Ljava/lang/String;)Ld1/d3$b;

    move-result-object v0

    invoke-virtual {v0}, Ld1/d3$b;->e()Ld1/d3;

    move-result-object v0

    iget-object v2, p0, Ld1/i1;->b:Ld1/f2;

    invoke-virtual {v2, v0, p1}, Ld1/f2;->c(Ld1/d3;Ld1/z1;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :catch_1
    move-exception v0

    :try_start_2
    invoke-static {v0}, Ld1/i0;->c(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    iget-object v0, p0, Ld1/i1;->a:Ld1/s2;

    invoke-virtual {p1}, Ld1/z1;->g()J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Ld1/s2;->f(J)Z

    goto/16 :goto_1

    :goto_3
    iget-object v0, p0, Ld1/i1;->a:Ld1/s2;

    invoke-virtual {p1}, Ld1/z1;->g()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ld1/s2;->f(J)Z

    throw p2

    :cond_1
    new-instance p1, Ld1/n2;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Ld1/n2;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld1/i1;->a()Ld1/n2;

    move-result-object v0

    return-object v0
.end method
