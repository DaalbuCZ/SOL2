.class abstract Lj$/util/stream/H3;
.super Ljava/lang/Object;


# instance fields
.field protected final a:Lj$/util/H;

.field protected final b:Z

.field private final c:J

.field private final d:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method constructor <init>(Lj$/util/H;JJ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/H3;->a:Lj$/util/H;

    const-wide/16 v0, 0x0

    cmp-long p1, p4, v0

    if-gez p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lj$/util/stream/H3;->b:Z

    if-ltz p1, :cond_1

    move-wide v0, p4

    :cond_1
    iput-wide v0, p0, Lj$/util/stream/H3;->c:J

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    if-ltz p1, :cond_2

    add-long/2addr p2, p4

    :cond_2
    invoke-direct {v0, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method constructor <init>(Lj$/util/H;Lj$/util/stream/H3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/H3;->a:Lj$/util/H;

    iget-boolean p1, p2, Lj$/util/stream/H3;->b:Z

    iput-boolean p1, p0, Lj$/util/stream/H3;->b:Z

    iget-object p1, p2, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    iget-wide p1, p2, Lj$/util/stream/H3;->c:J

    iput-wide p1, p0, Lj$/util/stream/H3;->c:J

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/H3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->characteristics()I

    move-result v0

    and-int/lit16 v0, v0, -0x4051

    return v0
.end method

.method public final estimateSize()J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/H3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final n(J)J
    .locals 9

    :cond_0
    iget-object v0, p0, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    iget-boolean v0, p0, Lj$/util/stream/H3;->b:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-wide p1, v2

    :goto_0
    return-wide p1

    :cond_2
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-lez v6, :cond_3

    iget-object v6, p0, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    sub-long v7, v0, v4

    invoke-virtual {v6, v0, v1, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v6

    if-eqz v6, :cond_0

    :cond_3
    iget-boolean v6, p0, Lj$/util/stream/H3;->b:Z

    if-eqz v6, :cond_4

    sub-long/2addr p1, v4

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_4
    iget-wide p1, p0, Lj$/util/stream/H3;->c:J

    cmp-long v6, v0, p1

    if-lez v6, :cond_5

    sub-long/2addr v0, p1

    sub-long/2addr v4, v0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    :cond_5
    return-wide v4
.end method

.method protected abstract o(Lj$/util/H;)Lj$/util/H;
.end method

.method protected final p()I
    .locals 4

    iget-object v0, p0, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    iget-boolean v0, p0, Lj$/util/stream/H3;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public bridge synthetic trySplit()Lj$/util/B;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/H3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/B;

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/D;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/H3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/D;

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/F;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/H3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/F;

    return-object v0
.end method

.method public final trySplit()Lj$/util/H;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/H3;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lj$/util/stream/H3;->a:Lj$/util/H;

    invoke-interface {v0}, Lj$/util/H;->trySplit()Lj$/util/H;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lj$/util/stream/H3;->o(Lj$/util/H;)Lj$/util/H;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public bridge synthetic trySplit()Lj$/util/z;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/H3;->trySplit()Lj$/util/H;

    move-result-object v0

    check-cast v0, Lj$/util/z;

    return-object v0
.end method
