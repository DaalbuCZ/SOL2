.class public abstract Lx1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/c3;


# instance fields
.field protected final a:Lx1/y3$d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx1/y3$d;

    invoke-direct {v0}, Lx1/y3$d;-><init>()V

    iput-object v0, p0, Lx1/e;->a:Lx1/y3$d;

    return-void
.end method

.method private M()I
    .locals 2

    invoke-interface {p0}, Lx1/c3;->B()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method private O(JI)V
    .locals 6

    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lx1/e;->N(IJIZ)V

    return-void
.end method


# virtual methods
.method public final G(J)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, p1, p2, v0}, Lx1/e;->O(JI)V

    return-void
.end method

.method public final I()Z
    .locals 3

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    iget-object v2, p0, Lx1/e;->a:Lx1/y3$d;

    invoke-virtual {v0, v1, v2}, Lx1/y3;->r(ILx1/y3$d;)Lx1/y3$d;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3$d;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final J()J
    .locals 3

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    iget-object v2, p0, Lx1/e;->a:Lx1/y3$d;

    invoke-virtual {v0, v1, v2}, Lx1/y3;->r(ILx1/y3$d;)Lx1/y3$d;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3$d;->f()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final K()I
    .locals 4

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    invoke-direct {p0}, Lx1/e;->M()I

    move-result v2

    invoke-interface {p0}, Lx1/c3;->F()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lx1/y3;->i(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final L()I
    .locals 4

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    invoke-direct {p0}, Lx1/e;->M()I

    move-result v2

    invoke-interface {p0}, Lx1/c3;->F()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lx1/y3;->p(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public abstract N(IJIZ)V
.end method

.method public final o()Z
    .locals 3

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    iget-object v2, p0, Lx1/e;->a:Lx1/y3$d;

    invoke-virtual {v0, v1, v2}, Lx1/y3;->r(ILx1/y3$d;)Lx1/y3$d;

    move-result-object v0

    iget-boolean v0, v0, Lx1/y3$d;->u:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final r()Z
    .locals 2

    invoke-virtual {p0}, Lx1/e;->K()I

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

.method public final w()Z
    .locals 2

    invoke-virtual {p0}, Lx1/e;->L()I

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

.method public final z()Z
    .locals 3

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lx1/c3;->u()I

    move-result v1

    iget-object v2, p0, Lx1/e;->a:Lx1/y3$d;

    invoke-virtual {v0, v1, v2}, Lx1/y3;->r(ILx1/y3$d;)Lx1/y3$d;

    move-result-object v0

    iget-boolean v0, v0, Lx1/y3$d;->v:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
