.class public Lj$/util/h;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/h;


# instance fields
.field private a:D

.field private b:D

.field private count:J

.field private max:D

.field private min:D

.field private sum:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    iput-wide v0, p0, Lj$/util/h;->min:D

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    iput-wide v0, p0, Lj$/util/h;->max:D

    return-void
.end method

.method private e(D)V
    .locals 4

    iget-wide v0, p0, Lj$/util/h;->a:D

    sub-double/2addr p1, v0

    iget-wide v0, p0, Lj$/util/h;->sum:D

    add-double v2, v0, p1

    sub-double v0, v2, v0

    sub-double/2addr v0, p1

    iput-wide v0, p0, Lj$/util/h;->a:D

    iput-wide v2, p0, Lj$/util/h;->sum:D

    return-void
.end method


# virtual methods
.method public a(Lj$/util/h;)V
    .locals 4

    iget-wide v0, p0, Lj$/util/h;->count:J

    iget-wide v2, p1, Lj$/util/h;->count:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj$/util/h;->count:J

    iget-wide v0, p0, Lj$/util/h;->b:D

    iget-wide v2, p1, Lj$/util/h;->b:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lj$/util/h;->b:D

    iget-wide v0, p1, Lj$/util/h;->sum:D

    invoke-direct {p0, v0, v1}, Lj$/util/h;->e(D)V

    iget-wide v0, p1, Lj$/util/h;->a:D

    invoke-direct {p0, v0, v1}, Lj$/util/h;->e(D)V

    iget-wide v0, p0, Lj$/util/h;->min:D

    iget-wide v2, p1, Lj$/util/h;->min:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lj$/util/h;->min:D

    iget-wide v0, p0, Lj$/util/h;->max:D

    iget-wide v2, p1, Lj$/util/h;->max:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lj$/util/h;->max:D

    return-void
.end method

.method public c(D)V
    .locals 4

    iget-wide v0, p0, Lj$/util/h;->count:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj$/util/h;->count:J

    iget-wide v0, p0, Lj$/util/h;->b:D

    add-double/2addr v0, p1

    iput-wide v0, p0, Lj$/util/h;->b:D

    invoke-direct {p0, p1, p2}, Lj$/util/h;->e(D)V

    iget-wide v0, p0, Lj$/util/h;->min:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lj$/util/h;->min:D

    iget-wide v0, p0, Lj$/util/h;->max:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lj$/util/h;->max:D

    return-void
.end method

.method public final d()D
    .locals 4

    iget-wide v0, p0, Lj$/util/h;->sum:D

    iget-wide v2, p0, Lj$/util/h;->a:D

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lj$/util/h;->b:D

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v0, p0, Lj$/util/h;->b:D

    :cond_0
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const-class v1, Lj$/util/h;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1
    iget-wide v1, p0, Lj$/util/h;->count:J

    .line 2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    invoke-virtual {p0}, Lj$/util/h;->d()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 3
    iget-wide v2, p0, Lj$/util/h;->min:D

    .line 4
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    .line 5
    iget-wide v2, p0, Lj$/util/h;->count:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 6
    invoke-virtual {p0}, Lj$/util/h;->d()D

    move-result-wide v2

    .line 7
    iget-wide v4, p0, Lj$/util/h;->count:J

    long-to-double v4, v4

    div-double/2addr v2, v4

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    .line 8
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    .line 9
    iget-wide v2, p0, Lj$/util/h;->max:D

    .line 10
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "%s{count=%d, sum=%f, min=%f, average=%f, max=%f}"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
