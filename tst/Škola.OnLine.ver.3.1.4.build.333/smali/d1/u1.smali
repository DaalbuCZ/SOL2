.class public Ld1/u1;
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
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Ld1/f2;

.field private final b:Ld1/s2;

.field private final c:Ljava/lang/String;

.field private final d:Ld1/i1;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld1/f2;Ld1/s2;Ljava/lang/String;Ld1/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/u1;->a:Ld1/f2;

    iput-object p2, p0, Ld1/u1;->b:Ld1/s2;

    iput-object p3, p0, Ld1/u1;->c:Ljava/lang/String;

    iput-object p4, p0, Ld1/u1;->d:Ld1/i1;

    const/4 p1, 0x0

    iput-object p1, p0, Ld1/u1;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ld1/f2;Ld1/s2;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/f2;",
            "Ld1/s2;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/u1;->a:Ld1/f2;

    iput-object p2, p0, Ld1/u1;->b:Ld1/s2;

    iput-object p3, p0, Ld1/u1;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Ld1/u1;->d:Ld1/i1;

    iput-object p4, p0, Ld1/u1;->e:Ljava/util/List;

    return-void
.end method

.method private a(Ld1/z1;)Ld1/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/c0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ld1/u1;->b:Ld1/s2;

    invoke-interface {v0, p1}, Ld1/s2;->k(Ld1/z1;)Ld1/z2;

    move-result-object p1

    invoke-virtual {p1}, Ld1/z2;->i()Ld1/c0;

    move-result-object p1
    :try_end_0
    .catch Ld1/e3; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Ld1/c0;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ld1/c0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private static c(Ld1/z1;I)Z
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0}, Ld1/z1;->n()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sub-long/2addr v2, p0

    cmp-long p0, v2, v0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private d(Ld1/z1;)Ld1/c0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld1/z1;",
            ")",
            "Ld1/c0<",
            "Ld1/d3;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ld1/u1;->b:Ld1/s2;

    invoke-interface {v0, p1}, Ld1/s2;->o(Ld1/z1;)Ld1/z2;

    move-result-object p1

    invoke-virtual {p1}, Ld1/z2;->i()Ld1/c0;

    move-result-object p1
    :try_end_0
    .catch Ld1/e3; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Ld1/c0;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ld1/c0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld1/z1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/u1;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ld1/u1;->e:Ljava/util/List;

    return-object v0

    :cond_0
    iget-object v0, p0, Ld1/u1;->b:Ld1/s2;

    invoke-interface {v0}, Ld1/s2;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Ld1/n2;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld1/n2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0}, Ld1/u1;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld1/z1;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v6, 0x1e

    :try_start_1
    invoke-static {v4, v6}, Ld1/u1;->c(Ld1/z1;I)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v5, p0, Ld1/u1;->b:Ld1/s2;

    :goto_1
    invoke-virtual {v4}, Ld1/z1;->g()J

    move-result-wide v6

    goto :goto_2

    :cond_1
    iget-object v6, p0, Ld1/u1;->b:Ld1/s2;

    invoke-interface {v6, v4}, Ld1/s2;->c(Ld1/z1;)Ld1/z2;

    move-result-object v6

    invoke-virtual {v6, v5}, Ld1/z2;->a(I)Ld1/c0;

    move-result-object v7

    invoke-direct {p0, v4}, Ld1/u1;->d(Ld1/z1;)Ld1/c0;

    move-result-object v8

    invoke-direct {p0, v4}, Ld1/u1;->a(Ld1/z1;)Ld1/c0;

    move-result-object v9

    invoke-virtual {v7}, Ld1/c0;->c()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v8}, Ld1/c0;->c()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Ld1/c0;->c()Z

    move-result v10

    if-nez v10, :cond_2

    iget-object v5, p0, Ld1/u1;->b:Ld1/s2;

    goto :goto_1

    :goto_2
    invoke-interface {v5, v6, v7}, Ld1/s2;->q(J)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ld1/z1;->l()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v10, v10, v12

    if-gtz v10, :cond_3

    iget-object v10, p0, Ld1/u1;->a:Ld1/f2;

    invoke-virtual {v10, v4}, Ld1/f2;->a(Ld1/z1;)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Ld1/z1;->b(J)V

    iget-object v12, p0, Ld1/u1;->b:Ld1/s2;

    invoke-virtual {v4}, Ld1/z1;->g()J

    move-result-wide v13

    invoke-interface {v12, v13, v14, v10, v11}, Ld1/s2;->p(JJ)V

    :cond_3
    invoke-virtual {v8}, Ld1/c0;->c()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v8}, Ld1/c0;->a()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ld1/d3;

    invoke-virtual {v4}, Ld1/z1;->l()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Ld1/d3;->b(J)V

    new-instance v11, Ld1/g0;

    iget-object v12, p0, Ld1/u1;->c:Ljava/lang/String;

    invoke-direct {v11, v12}, Ld1/g0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Ld1/d3;->c(Ld1/g0;)V

    iget-object v11, p0, Ld1/u1;->a:Ld1/f2;

    invoke-virtual {v11, v10, v4}, Ld1/f2;->c(Ld1/d3;Ld1/z1;)V

    goto :goto_3

    :cond_4
    :goto_4
    invoke-virtual {v7}, Ld1/c0;->c()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, p0, Ld1/u1;->a:Ld1/f2;

    invoke-virtual {v7}, Ld1/c0;->a()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v8, v10, v4}, Ld1/f2;->f(Ljava/util/List;Ld1/z1;)V

    invoke-virtual {v7}, Ld1/c0;->b()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Ld1/z2;->g(Ljava/util/List;)Z

    invoke-virtual {v6, v5}, Ld1/z2;->a(I)Ld1/c0;

    move-result-object v7

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Ld1/c0;->c()Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, p0, Ld1/u1;->d:Ld1/i1;

    if-eqz v5, :cond_6

    invoke-virtual {v9}, Ld1/c0;->a()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Ld1/i1;->b(Ld1/z1;Ljava/util/List;)Ld1/n2;

    :cond_6
    iget-object v5, p0, Ld1/u1;->b:Ld1/s2;

    invoke-virtual {v4}, Ld1/z1;->g()J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, Ld1/s2;->q(J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :catch_0
    move-exception v5

    :try_start_2
    const-string v6, "Bugfender-SDK"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "There was a problem sending the old session "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ld1/z1;->g()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ld1/i0;->d(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v6, v5, Ld1/k1;

    if-nez v6, :cond_0

    instance-of v5, v5, Ld1/j2;

    if-nez v5, :cond_0

    iget-object v5, p0, Ld1/u1;->b:Ld1/s2;

    invoke-virtual {v4}, Ld1/z1;->g()J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, Ld1/s2;->q(J)Z

    goto/16 :goto_0

    :cond_7
    new-instance v1, Ld1/n2;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_8

    if-lez v3, :cond_9

    :cond_8
    move v2, v5

    :cond_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v0}, Ld1/n2;-><init>(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v1

    :catch_1
    move-exception v0

    new-instance v1, Ld1/n2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Ld1/n2;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld1/u1;->b()Ld1/n2;

    move-result-object v0

    return-object v0
.end method
