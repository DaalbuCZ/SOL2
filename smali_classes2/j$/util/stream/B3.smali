.class abstract Lj$/util/stream/B3;
.super Ljava/lang/Object;


# instance fields
.field final a:J

.field final b:J

.field c:Lj$/util/H;

.field d:J

.field e:J


# direct methods
.method constructor <init>(Lj$/util/H;JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/B3;->c:Lj$/util/H;

    iput-wide p2, p0, Lj$/util/stream/B3;->a:J

    iput-wide p4, p0, Lj$/util/stream/B3;->b:J

    iput-wide p6, p0, Lj$/util/stream/B3;->d:J

    iput-wide p8, p0, Lj$/util/stream/B3;->e:J

    return-void
.end method


# virtual methods
.method protected abstract b(Lj$/util/H;JJJJ)Lj$/util/H;
.end method

.method public characteristics()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/B3;->c:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->characteristics()I

    move-result v0

    return v0
.end method

.method public estimateSize()J
    .locals 6

    iget-wide v0, p0, Lj$/util/stream/B3;->a:J

    iget-wide v2, p0, Lj$/util/stream/B3;->e:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    iget-wide v4, p0, Lj$/util/stream/B3;->d:J

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sub-long/2addr v2, v0

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    return-wide v2
.end method

.method public bridge synthetic trySplit()Lj$/util/B;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/B3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/B;

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/D;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/B3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/D;

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/F;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/B3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/F;

    return-object v0
.end method

.method public trySplit()Lj$/util/H;
    .locals 12

    iget-wide v0, p0, Lj$/util/stream/B3;->a:J

    iget-wide v2, p0, Lj$/util/stream/B3;->e:J

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    return-object v1

    :cond_0
    iget-wide v4, p0, Lj$/util/stream/B3;->d:J

    cmp-long v0, v4, v2

    if-ltz v0, :cond_1

    return-object v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lj$/util/stream/B3;->c:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->trySplit()Lj$/util/H;

    move-result-object v3

    if-nez v3, :cond_2

    return-object v1

    :cond_2
    iget-wide v4, p0, Lj$/util/stream/B3;->d:J

    invoke-interface {v3}, Lj$/util/H;->estimateSize()J

    move-result-wide v6

    add-long/2addr v6, v4

    iget-wide v4, p0, Lj$/util/stream/B3;->b:J

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    iget-wide v4, p0, Lj$/util/stream/B3;->a:J

    cmp-long v0, v4, v10

    if-ltz v0, :cond_3

    iput-wide v10, p0, Lj$/util/stream/B3;->d:J

    goto :goto_0

    :cond_3
    iget-wide v8, p0, Lj$/util/stream/B3;->b:J

    cmp-long v0, v10, v8

    if-ltz v0, :cond_4

    iput-object v3, p0, Lj$/util/stream/B3;->c:Lj$/util/H;

    iput-wide v10, p0, Lj$/util/stream/B3;->e:J

    goto :goto_0

    :cond_4
    iget-wide v0, p0, Lj$/util/stream/B3;->d:J

    cmp-long v2, v0, v4

    if-ltz v2, :cond_5

    cmp-long v2, v6, v8

    if-gtz v2, :cond_5

    iput-wide v10, p0, Lj$/util/stream/B3;->d:J

    return-object v3

    :cond_5
    iput-wide v10, p0, Lj$/util/stream/B3;->d:J

    move-object v2, p0

    move-wide v6, v8

    move-wide v8, v0

    invoke-virtual/range {v2 .. v11}, Lj$/util/stream/B3;->b(Lj$/util/H;JJJJ)Lj$/util/H;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/z;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/B3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/z;

    return-object v0
.end method