.class final Lj$/util/stream/a1;
.super Lj$/util/stream/R0;


# direct methods
.method constructor <init>(Lj$/util/stream/P0;Lj$/util/stream/P0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/R0;-><init>(Lj$/util/stream/P0;Lj$/util/stream/P0;)V

    return-void
.end method


# virtual methods
.method public a(Lj$/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    invoke-interface {v0, p1}, Lj$/util/stream/P0;->a(Lj$/util/function/Consumer;)V

    iget-object v0, p0, Lj$/util/stream/R0;->b:Lj$/util/stream/P0;

    invoke-interface {v0, p1}, Lj$/util/stream/P0;->a(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public m([Ljava/lang/Object;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/P0;->m([Ljava/lang/Object;I)V

    iget-object v0, p0, Lj$/util/stream/R0;->b:Lj$/util/stream/P0;

    iget-object v1, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    invoke-interface {v1}, Lj$/util/stream/P0;->count()J

    move-result-wide v1

    long-to-int v1, v1

    add-int/2addr p2, v1

    invoke-interface {v0, p1, p2}, Lj$/util/stream/P0;->m([Ljava/lang/Object;I)V

    return-void
.end method

.method public o(Lj$/util/function/n;)[Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lj$/util/stream/R0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lj$/util/function/n;->u(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj$/util/stream/a1;->m([Ljava/lang/Object;I)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(JJLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/R0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    invoke-interface {v0}, Lj$/util/stream/P0;->count()J

    move-result-wide v7

    cmp-long v0, p1, v7

    if-ltz v0, :cond_1

    iget-object v1, p0, Lj$/util/stream/R0;->b:Lj$/util/stream/P0;

    sub-long v2, p1, v7

    sub-long v4, p3, v7

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lj$/util/stream/P0;->p(JJLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1

    :cond_1
    cmp-long v0, p3, v7

    if-gtz v0, :cond_2

    iget-object v1, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lj$/util/stream/P0;->p(JJLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v0, 0x1

    .line 1
    iget-object v1, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    move-wide v2, p1

    move-wide v4, v7

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lj$/util/stream/P0;->p(JJLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    iget-object v1, p0, Lj$/util/stream/R0;->b:Lj$/util/stream/P0;

    const-wide/16 v2, 0x0

    sub-long v4, p3, v7

    invoke-interface/range {v1 .. v6}, Lj$/util/stream/P0;->p(JJLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lj$/util/stream/D0;->d0(ILj$/util/stream/P0;Lj$/util/stream/P0;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1
.end method

.method public spliterator()Lj$/util/H;
    .locals 1

    new-instance v0, Lj$/util/stream/r1;

    invoke-direct {v0, p0}, Lj$/util/stream/r1;-><init>(Lj$/util/stream/P0;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lj$/util/stream/R0;->count()J

    move-result-wide v0

    const-wide/16 v2, 0x20

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v3, p0, Lj$/util/stream/R0;->a:Lj$/util/stream/P0;

    aput-object v3, v0, v1

    iget-object v1, p0, Lj$/util/stream/R0;->b:Lj$/util/stream/P0;

    aput-object v1, v0, v2

    const-string v1, "ConcNode[%s.%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lj$/util/stream/R0;->count()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "ConcNode[size=%d]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
