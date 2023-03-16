.class public final Lp3/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/t;


# instance fields
.field private final n:Lp3/d;

.field private o:Z

.field private p:J

.field private q:J

.field private r:Ls1/o2;


# direct methods
.method public constructor <init>(Lp3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/e0;->n:Lp3/d;

    sget-object p1, Ls1/o2;->q:Ls1/o2;

    iput-object p1, p0, Lp3/e0;->r:Ls1/o2;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lp3/e0;->p:J

    iget-boolean p1, p0, Lp3/e0;->o:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lp3/e0;->n:Lp3/d;

    invoke-interface {p1}, Lp3/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lp3/e0;->q:J

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-boolean v0, p0, Lp3/e0;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lp3/e0;->n:Lp3/d;

    invoke-interface {v0}, Lp3/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lp3/e0;->q:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp3/e0;->o:Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Lp3/e0;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp3/e0;->z()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lp3/e0;->a(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp3/e0;->o:Z

    :cond_0
    return-void
.end method

.method public d(Ls1/o2;)V
    .locals 2

    iget-boolean v0, p0, Lp3/e0;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lp3/e0;->z()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lp3/e0;->a(J)V

    :cond_0
    iput-object p1, p0, Lp3/e0;->r:Ls1/o2;

    return-void
.end method

.method public j()Ls1/o2;
    .locals 1

    iget-object v0, p0, Lp3/e0;->r:Ls1/o2;

    return-object v0
.end method

.method public z()J
    .locals 7

    iget-wide v0, p0, Lp3/e0;->p:J

    iget-boolean v2, p0, Lp3/e0;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lp3/e0;->n:Lp3/d;

    invoke-interface {v2}, Lp3/d;->b()J

    move-result-wide v2

    iget-wide v4, p0, Lp3/e0;->q:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lp3/e0;->r:Ls1/o2;

    iget v5, v4, Ls1/o2;->n:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lp3/m0;->A0(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2, v3}, Ls1/o2;->b(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
