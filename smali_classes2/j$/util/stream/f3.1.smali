.class abstract Lj$/util/stream/f3;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/H;


# instance fields
.field final a:Z

.field final b:Lj$/util/stream/D0;

.field private c:Lj$/util/function/A;

.field d:Lj$/util/H;

.field e:Lj$/util/stream/q2;

.field f:Lj$/util/function/d;

.field g:J

.field h:Lj$/util/stream/e;

.field i:Z


# direct methods
.method constructor <init>(Lj$/util/stream/D0;Lj$/util/H;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/f3;->b:Lj$/util/stream/D0;

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/f3;->c:Lj$/util/function/A;

    iput-object p2, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    iput-boolean p3, p0, Lj$/util/stream/f3;->a:Z

    return-void
.end method

.method constructor <init>(Lj$/util/stream/D0;Lj$/util/function/A;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/f3;->b:Lj$/util/stream/D0;

    iput-object p2, p0, Lj$/util/stream/f3;->c:Lj$/util/function/A;

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    iput-boolean p3, p0, Lj$/util/stream/f3;->a:Z

    return-void
.end method

.method private c()Z
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lj$/util/stream/f3;->h:Lj$/util/stream/e;

    invoke-virtual {v0}, Lj$/util/stream/e;->count()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    invoke-interface {v0}, Lj$/util/stream/q2;->r()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/f3;->f:Lj$/util/function/d;

    check-cast v0, Lj$/util/stream/b;

    iget v2, v0, Lj$/util/stream/b;->a:I

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 1
    :pswitch_0
    iget-object v0, v0, Lj$/util/stream/b;->b:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/s3;

    .line 2
    iget-object v2, v0, Lj$/util/stream/f3;->d:Lj$/util/H;

    iget-object v0, v0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    invoke-interface {v2, v0}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v0

    goto :goto_2

    .line 3
    :pswitch_1
    iget-object v0, v0, Lj$/util/stream/b;->b:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/q3;

    .line 4
    iget-object v2, v0, Lj$/util/stream/f3;->d:Lj$/util/H;

    iget-object v0, v0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    invoke-interface {v2, v0}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v0

    goto :goto_2

    .line 5
    :pswitch_2
    iget-object v0, v0, Lj$/util/stream/b;->b:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/o3;

    .line 6
    iget-object v2, v0, Lj$/util/stream/f3;->d:Lj$/util/H;

    iget-object v0, v0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    invoke-interface {v2, v0}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v0

    goto :goto_2

    .line 7
    :goto_1
    iget-object v0, v0, Lj$/util/stream/b;->b:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/J3;

    .line 8
    iget-object v2, v0, Lj$/util/stream/f3;->d:Lj$/util/H;

    iget-object v0, v0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    invoke-interface {v2, v0}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v0

    :goto_2
    if-nez v0, :cond_0

    .line 9
    :cond_1
    iget-boolean v0, p0, Lj$/util/stream/f3;->i:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    iget-object v0, p0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    invoke-interface {v0}, Lj$/util/stream/q2;->h()V

    iput-boolean v1, p0, Lj$/util/stream/f3;->i:Z

    goto :goto_0

    :cond_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method final b()Z
    .locals 8

    iget-object v0, p0, Lj$/util/stream/f3;->h:Lj$/util/stream/e;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj$/util/stream/f3;->i:Z

    if-eqz v0, :cond_0

    return v3

    :cond_0
    invoke-virtual {p0}, Lj$/util/stream/f3;->d()V

    invoke-virtual {p0}, Lj$/util/stream/f3;->e()V

    iput-wide v1, p0, Lj$/util/stream/f3;->g:J

    iget-object v0, p0, Lj$/util/stream/f3;->e:Lj$/util/stream/q2;

    iget-object v1, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    invoke-interface {v1}, Lj$/util/H;->getExactSizeIfKnown()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lj$/util/stream/q2;->j(J)V

    invoke-direct {p0}, Lj$/util/stream/f3;->c()Z

    move-result v0

    return v0

    :cond_1
    iget-wide v4, p0, Lj$/util/stream/f3;->g:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lj$/util/stream/f3;->g:J

    invoke-virtual {v0}, Lj$/util/stream/e;->count()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    if-nez v3, :cond_3

    iput-wide v1, p0, Lj$/util/stream/f3;->g:J

    iget-object v0, p0, Lj$/util/stream/f3;->h:Lj$/util/stream/e;

    invoke-virtual {v0}, Lj$/util/stream/e;->clear()V

    invoke-direct {p0}, Lj$/util/stream/f3;->c()Z

    move-result v3

    :cond_3
    return v3
.end method

.method public final characteristics()I
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/f3;->d()V

    iget-object v0, p0, Lj$/util/stream/f3;->b:Lj$/util/stream/D0;

    invoke-virtual {v0}, Lj$/util/stream/D0;->r0()I

    move-result v0

    invoke-static {v0}, Lj$/util/stream/e3;->k(I)I

    move-result v0

    .line 1
    sget v1, Lj$/util/stream/e3;->f:I

    and-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    and-int/lit16 v0, v0, -0x4041

    .line 2
    iget-object v1, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    invoke-interface {v1}, Lj$/util/H;->characteristics()I

    move-result v1

    and-int/lit16 v1, v1, 0x4040

    or-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method final d()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/f3;->c:Lj$/util/function/A;

    invoke-interface {v0}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/H;

    iput-object v0, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    const/4 v0, 0x0

    iput-object v0, p0, Lj$/util/stream/f3;->c:Lj$/util/function/A;

    :cond_0
    return-void
.end method

.method abstract e()V
.end method

.method public final estimateSize()J
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/f3;->d()V

    iget-object v0, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public getComparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-static {p0, v0}, Lj$/util/a;->j(Lj$/util/H;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final getExactSizeIfKnown()J
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/f3;->d()V

    sget-object v0, Lj$/util/stream/e3;->SIZED:Lj$/util/stream/e3;

    iget-object v1, p0, Lj$/util/stream/f3;->b:Lj$/util/stream/D0;

    invoke-virtual {v1}, Lj$/util/stream/D0;->r0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->getExactSizeIfKnown()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method abstract h(Lj$/util/H;)Lj$/util/stream/f3;
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->j(Lj$/util/H;I)Z

    move-result p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "%s[%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trySplit()Lj$/util/H;
    .locals 2

    iget-boolean v0, p0, Lj$/util/stream/f3;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lj$/util/stream/f3;->i:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj$/util/stream/f3;->d()V

    iget-object v0, p0, Lj$/util/stream/f3;->d:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->trySplit()Lj$/util/H;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lj$/util/stream/f3;->h(Lj$/util/H;)Lj$/util/stream/f3;

    move-result-object v1

    :cond_1
    :goto_0
    return-object v1
.end method
