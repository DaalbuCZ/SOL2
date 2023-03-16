.class public abstract Ls1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/p2;


# instance fields
.field protected final a:Ls1/l3$d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls1/l3$d;

    invoke-direct {v0}, Ls1/l3$d;-><init>()V

    iput-object v0, p0, Ls1/e;->a:Ls1/l3$d;

    return-void
.end method

.method private N()I
    .locals 2

    invoke-interface {p0}, Ls1/p2;->D()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method


# virtual methods
.method public final B()Z
    .locals 3

    invoke-interface {p0}, Ls1/p2;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    iget-boolean v0, v0, Ls1/l3$d;->v:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final H(J)V
    .locals 1

    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v0

    invoke-interface {p0, v0, p1, p2}, Ls1/p2;->n(IJ)V

    return-void
.end method

.method public final J()Z
    .locals 3

    invoke-interface {p0}, Ls1/p2;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3$d;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K()J
    .locals 3

    invoke-interface {p0}, Ls1/p2;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3$d;->f()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final L()I
    .locals 4

    invoke-interface {p0}, Ls1/p2;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v1

    invoke-direct {p0}, Ls1/e;->N()I

    move-result v2

    invoke-interface {p0}, Ls1/p2;->G()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ls1/l3;->i(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final M()I
    .locals 4

    invoke-interface {p0}, Ls1/p2;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v1

    invoke-direct {p0}, Ls1/e;->N()I

    move-result v2

    invoke-interface {p0}, Ls1/p2;->G()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ls1/l3;->p(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final q()Z
    .locals 3

    invoke-interface {p0}, Ls1/p2;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ls1/p2;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    iget-boolean v0, v0, Ls1/l3$d;->u:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t()Z
    .locals 2

    invoke-virtual {p0}, Ls1/e;->L()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final y()Z
    .locals 2

    invoke-virtual {p0}, Ls1/e;->M()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
