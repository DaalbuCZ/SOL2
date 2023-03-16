.class public abstract Ld3/m;
.super Lv1/h;
.source ""

# interfaces
.implements Ld3/h;


# instance fields
.field private q:Ld3/h;

.field private r:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lv1/h;-><init>()V

    return-void
.end method


# virtual methods
.method public e(J)I
    .locals 3

    iget-object v0, p0, Ld3/m;->q:Ld3/h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/h;

    iget-wide v1, p0, Ld3/m;->r:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ld3/h;->e(J)I

    move-result p1

    return p1
.end method

.method public g(I)J
    .locals 4

    iget-object v0, p0, Ld3/m;->q:Ld3/h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/h;

    invoke-interface {v0, p1}, Ld3/h;->g(I)J

    move-result-wide v0

    iget-wide v2, p0, Ld3/m;->r:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public h(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld3/m;->q:Ld3/h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/h;

    iget-wide v1, p0, Ld3/m;->r:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Ld3/h;->h(J)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Ld3/m;->q:Ld3/h;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/h;

    invoke-interface {v0}, Ld3/h;->j()I

    move-result v0

    return v0
.end method

.method public m()V
    .locals 1

    invoke-super {p0}, Lv1/a;->m()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/m;->q:Ld3/h;

    return-void
.end method

.method public y(JLd3/h;J)V
    .locals 2

    iput-wide p1, p0, Lv1/h;->o:J

    iput-object p3, p0, Ld3/m;->q:Ld3/h;

    const-wide v0, 0x7fffffffffffffffL

    cmp-long p3, p4, v0

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move-wide p1, p4

    :goto_0
    iput-wide p1, p0, Ld3/m;->r:J

    return-void
.end method
