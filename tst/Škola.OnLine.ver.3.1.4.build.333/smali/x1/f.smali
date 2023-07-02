.class public abstract Lx1/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/l3;
.implements Lx1/n3;


# instance fields
.field private final n:I

.field private final o:Lx1/o1;

.field private p:Lx1/o3;

.field private q:I

.field private r:Ly1/t1;

.field private s:I

.field private t:Lz2/n0;

.field private u:[Lx1/n1;

.field private v:J

.field private w:J

.field private x:J

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx1/f;->n:I

    new-instance p1, Lx1/o1;

    invoke-direct {p1}, Lx1/o1;-><init>()V

    iput-object p1, p0, Lx1/f;->o:Lx1/o1;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lx1/f;->x:J

    return-void
.end method

.method private R(JZ)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx1/f;->y:Z

    iput-wide p1, p0, Lx1/f;->w:J

    iput-wide p1, p0, Lx1/f;->x:J

    invoke-virtual {p0, p1, p2, p3}, Lx1/f;->L(JZ)V

    return-void
.end method


# virtual methods
.method public synthetic A(FF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/k3;->a(Lx1/l3;FF)V

    return-void
.end method

.method protected final B(Ljava/lang/Throwable;Lx1/n1;I)Lx1/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lx1/f;->C(Ljava/lang/Throwable;Lx1/n1;ZI)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method protected final C(Ljava/lang/Throwable;Lx1/n1;ZI)Lx1/q;
    .locals 9

    if-eqz p2, :cond_0

    iget-boolean v0, p0, Lx1/f;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx1/f;->z:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p2}, Lx1/n3;->a(Lx1/n1;)I

    move-result v1

    invoke-static {v1}, Lx1/m3;->f(I)I

    move-result v1
    :try_end_0
    .catch Lx1/q; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lx1/f;->z:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Lx1/f;->z:Z

    throw p1

    :catch_0
    iput-boolean v0, p0, Lx1/f;->z:Z

    :cond_0
    const/4 v1, 0x4

    :goto_0
    move v6, v1

    invoke-interface {p0}, Lx1/l3;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lx1/f;->F()I

    move-result v4

    move-object v2, p1

    move-object v5, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v2 .. v8}, Lx1/q;->f(Ljava/lang/Throwable;Ljava/lang/String;ILx1/n1;IZI)Lx1/q;

    move-result-object p1

    return-object p1
.end method

.method protected final D()Lx1/o3;
    .locals 1

    iget-object v0, p0, Lx1/f;->p:Lx1/o3;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/o3;

    return-object v0
.end method

.method protected final E()Lx1/o1;
    .locals 1

    iget-object v0, p0, Lx1/f;->o:Lx1/o1;

    invoke-virtual {v0}, Lx1/o1;->a()V

    iget-object v0, p0, Lx1/f;->o:Lx1/o1;

    return-object v0
.end method

.method protected final F()I
    .locals 1

    iget v0, p0, Lx1/f;->q:I

    return v0
.end method

.method protected final G()Ly1/t1;
    .locals 1

    iget-object v0, p0, Lx1/f;->r:Ly1/t1;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/t1;

    return-object v0
.end method

.method protected final H()[Lx1/n1;
    .locals 1

    iget-object v0, p0, Lx1/f;->u:[Lx1/n1;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx1/n1;

    return-object v0
.end method

.method protected final I()Z
    .locals 1

    invoke-virtual {p0}, Lx1/f;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lx1/f;->y:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx1/f;->t:Lz2/n0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/n0;

    invoke-interface {v0}, Lz2/n0;->i()Z

    move-result v0

    :goto_0
    return v0
.end method

.method protected abstract J()V
.end method

.method protected K(ZZ)V
    .locals 0

    return-void
.end method

.method protected abstract L(JZ)V
.end method

.method protected M()V
    .locals 0

    return-void
.end method

.method protected N()V
    .locals 0

    return-void
.end method

.method protected O()V
    .locals 0

    return-void
.end method

.method protected abstract P([Lx1/n1;JJ)V
.end method

.method protected final Q(Lx1/o1;La2/g;I)I
    .locals 5

    iget-object v0, p0, Lx1/f;->t:Lz2/n0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/n0;

    invoke-interface {v0, p1, p2, p3}, Lz2/n0;->p(Lx1/o1;La2/g;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    invoke-virtual {p2}, La2/a;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lx1/f;->x:J

    iget-boolean p1, p0, Lx1/f;->y:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x3

    :goto_0
    return v0

    :cond_1
    iget-wide v0, p2, La2/g;->r:J

    iget-wide v2, p0, Lx1/f;->v:J

    add-long/2addr v0, v2

    iput-wide v0, p2, La2/g;->r:J

    iget-wide p1, p0, Lx1/f;->x:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lx1/f;->x:J

    goto :goto_1

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Lx1/o1;->b:Lx1/n1;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx1/n1;

    iget-wide v0, p2, Lx1/n1;->C:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object v0

    iget-wide v1, p2, Lx1/n1;->C:J

    iget-wide v3, p0, Lx1/f;->v:J

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lx1/n1$b;->k0(J)Lx1/n1$b;

    move-result-object p2

    invoke-virtual {p2}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p2

    iput-object p2, p1, Lx1/o1;->b:Lx1/n1;

    :cond_3
    :goto_1
    return p3
.end method

.method protected S(J)I
    .locals 3

    iget-object v0, p0, Lx1/f;->t:Lz2/n0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/n0;

    iget-wide v1, p0, Lx1/f;->v:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lz2/n0;->d(J)I

    move-result p1

    return p1
.end method

.method public final c()V
    .locals 1

    iget v0, p0, Lx1/f;->s:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-object v0, p0, Lx1/f;->o:Lx1/o1;

    invoke-virtual {v0}, Lx1/o1;->a()V

    invoke-virtual {p0}, Lx1/f;->M()V

    return-void
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lx1/f;->s:I

    return v0
.end method

.method public final g()V
    .locals 3

    iget v0, p0, Lx1/f;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lu3/a;->f(Z)V

    iget-object v0, p0, Lx1/f;->o:Lx1/o1;

    invoke-virtual {v0}, Lx1/o1;->a()V

    iput v2, p0, Lx1/f;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Lx1/f;->t:Lz2/n0;

    iput-object v0, p0, Lx1/f;->u:[Lx1/n1;

    iput-boolean v2, p0, Lx1/f;->y:Z

    invoke-virtual {p0}, Lx1/f;->J()V

    return-void
.end method

.method public final h()Lz2/n0;
    .locals 1

    iget-object v0, p0, Lx1/f;->t:Lz2/n0;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lx1/f;->n:I

    return v0
.end method

.method public final l()Z
    .locals 4

    iget-wide v0, p0, Lx1/f;->x:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final p([Lx1/n1;Lz2/n0;JJ)V
    .locals 6

    iget-boolean v0, p0, Lx1/f;->y:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lu3/a;->f(Z)V

    iput-object p2, p0, Lx1/f;->t:Lz2/n0;

    iget-wide v0, p0, Lx1/f;->x:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Lx1/f;->x:J

    :cond_0
    iput-object p1, p0, Lx1/f;->u:[Lx1/n1;

    iput-wide p5, p0, Lx1/f;->v:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lx1/f;->P([Lx1/n1;JJ)V

    return-void
.end method

.method public final q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx1/f;->y:Z

    return-void
.end method

.method public final r(Lx1/o3;[Lx1/n1;Lz2/n0;JZZJJ)V
    .locals 9

    move-object v7, p0

    move v8, p6

    iget v0, v7, Lx1/f;->s:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    move-object v0, p1

    iput-object v0, v7, Lx1/f;->p:Lx1/o3;

    iput v1, v7, Lx1/f;->s:I

    move/from16 v0, p7

    invoke-virtual {p0, p6, v0}, Lx1/f;->K(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p8

    move-wide/from16 v5, p10

    invoke-virtual/range {v0 .. v6}, Lx1/f;->p([Lx1/n1;Lz2/n0;JJ)V

    move-wide v0, p4

    invoke-direct {p0, p4, p5, p6}, Lx1/f;->R(JZ)V

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lx1/f;->t:Lz2/n0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/n0;

    invoke-interface {v0}, Lz2/n0;->b()V

    return-void
.end method

.method public final start()V
    .locals 2

    iget v0, p0, Lx1/f;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lu3/a;->f(Z)V

    const/4 v0, 0x2

    iput v0, p0, Lx1/f;->s:I

    invoke-virtual {p0}, Lx1/f;->N()V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget v0, p0, Lx1/f;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    iput v1, p0, Lx1/f;->s:I

    invoke-virtual {p0}, Lx1/f;->O()V

    return-void
.end method

.method public final t()J
    .locals 2

    iget-wide v0, p0, Lx1/f;->x:J

    return-wide v0
.end method

.method public final u(J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lx1/f;->R(JZ)V

    return-void
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Lx1/f;->y:Z

    return v0
.end method

.method public w()Lu3/t;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final x(ILy1/t1;)V
    .locals 0

    iput p1, p0, Lx1/f;->q:I

    iput-object p2, p0, Lx1/f;->r:Ly1/t1;

    return-void
.end method

.method public final y()Lx1/n3;
    .locals 0

    return-object p0
.end method
