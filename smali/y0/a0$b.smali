.class public abstract Ly0/a0$b;
.super Ly0/a0$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field private final n:Ljava/util/Random;

.field final o:J

.field p:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ly0/a0$c;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Ly0/a0$b;->n:Ljava/util/Random;

    sget-wide v0, Ly0/a0;->b:J

    iput-wide v0, p0, Ly0/a0$b;->o:J

    const/4 v0, 0x0

    iput v0, p0, Ly0/a0$b;->p:I

    return-void
.end method

.method private f()V
    .locals 3

    iget v0, p0, Ly0/a0$b;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ly0/a0$b;->p:I

    iget-wide v1, p0, Ly0/a0$b;->o:J

    invoke-virtual {p0, v0, v1, v2}, Ly0/a0$b;->c(IJ)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ly0/a0$b;->d(J)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-virtual {p0}, Ly0/a0$b;->e()V

    iget v0, p0, Ly0/a0$b;->p:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ly0/a0$b;->g()V

    sget-wide v0, Ly0/a0;->b:J

    invoke-virtual {p0, v0, v1}, Ly0/a0$b;->d(J)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    instance-of v0, p1, Ly0/j2;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ly0/a0$b;->f()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public c(IJ)J
    .locals 6

    const-wide/16 v0, 0x3e8

    div-long/2addr p2, v0

    long-to-double p2, p2

    const/16 v2, 0xf

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-double v2, p1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double/2addr p2, v2

    double-to-long p1, p2

    iget-object p3, p0, Ly0/a0$b;->n:Ljava/util/Random;

    invoke-virtual {p3}, Ljava/util/Random;->nextDouble()D

    move-result-wide v2

    const-wide/16 v4, 0x4650

    invoke-static {p1, p2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-double v4, v4

    mul-double/2addr v2, v4

    long-to-double p1, p1

    add-double/2addr p1, v2

    const-wide v4, 0x40e5180000000000L    # 43200.0

    add-double/2addr v2, v4

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    double-to-long p1, p1

    mul-long/2addr p1, v0

    return-wide p1
.end method

.method protected abstract d(J)V
.end method

.method public abstract e()V
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ly0/a0$b;->p:I

    return-void
.end method
