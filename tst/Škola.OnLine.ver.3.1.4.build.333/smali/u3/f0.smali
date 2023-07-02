.class public final Lu3/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/t;


# instance fields
.field private final n:Lu3/d;

.field private o:Z

.field private p:J

.field private q:J

.field private r:Lx1/b3;


# direct methods
.method public constructor <init>(Lu3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/f0;->n:Lu3/d;

    sget-object p1, Lx1/b3;->q:Lx1/b3;

    iput-object p1, p0, Lu3/f0;->r:Lx1/b3;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lu3/f0;->p:J

    iget-boolean p1, p0, Lu3/f0;->o:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu3/f0;->n:Lu3/d;

    invoke-interface {p1}, Lu3/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lu3/f0;->q:J

    :cond_0
    return-void
.end method

.method public b(Lx1/b3;)V
    .locals 2

    iget-boolean v0, p0, Lu3/f0;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu3/f0;->z()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu3/f0;->a(J)V

    :cond_0
    iput-object p1, p0, Lu3/f0;->r:Lx1/b3;

    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Lu3/f0;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/f0;->n:Lu3/d;

    invoke-interface {v0}, Lu3/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lu3/f0;->q:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu3/f0;->o:Z

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-boolean v0, p0, Lu3/f0;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lu3/f0;->z()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu3/f0;->a(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu3/f0;->o:Z

    :cond_0
    return-void
.end method

.method public j()Lx1/b3;
    .locals 1

    iget-object v0, p0, Lu3/f0;->r:Lx1/b3;

    return-object v0
.end method

.method public z()J
    .locals 7

    iget-wide v0, p0, Lu3/f0;->p:J

    iget-boolean v2, p0, Lu3/f0;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lu3/f0;->n:Lu3/d;

    invoke-interface {v2}, Lu3/d;->b()J

    move-result-wide v2

    iget-wide v4, p0, Lu3/f0;->q:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lu3/f0;->r:Lx1/b3;

    iget v5, v4, Lx1/b3;->n:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lu3/n0;->B0(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2, v3}, Lx1/b3;->b(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
