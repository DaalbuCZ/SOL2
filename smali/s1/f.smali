.class public abstract Ls1/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/y2;
.implements Ls1/a3;


# instance fields
.field private final n:I

.field private final o:Ls1/n1;

.field private p:Ls1/b3;

.field private q:I

.field private r:Lt1/t1;

.field private s:I

.field private t:Lu2/n0;

.field private u:[Ls1/m1;

.field private v:J

.field private w:J

.field private x:J

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls1/f;->n:I

    new-instance p1, Ls1/n1;

    invoke-direct {p1}, Ls1/n1;-><init>()V

    iput-object p1, p0, Ls1/f;->o:Ls1/n1;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ls1/f;->x:J

    return-void
.end method

.method private R(JZ)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls1/f;->y:Z

    iput-wide p1, p0, Ls1/f;->w:J

    iput-wide p1, p0, Ls1/f;->x:J

    invoke-virtual {p0, p1, p2, p3}, Ls1/f;->L(JZ)V

    return-void
.end method


# virtual methods
.method public synthetic A(FF)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/x2;->a(Ls1/y2;FF)V

    return-void
.end method

.method protected final B(Ljava/lang/Throwable;Ls1/m1;I)Ls1/q;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Ls1/f;->C(Ljava/lang/Throwable;Ls1/m1;ZI)Ls1/q;

    move-result-object p1

    return-object p1
.end method

.method protected final C(Ljava/lang/Throwable;Ls1/m1;ZI)Ls1/q;
    .locals 9

    if-eqz p2, :cond_0

    iget-boolean v0, p0, Ls1/f;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/f;->z:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p2}, Ls1/a3;->a(Ls1/m1;)I

    move-result v1

    invoke-static {v1}, Ls1/z2;->f(I)I

    move-result v1
    :try_end_0
    .catch Ls1/q; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Ls1/f;->z:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ls1/f;->z:Z

    throw p1

    :catch_0
    iput-boolean v0, p0, Ls1/f;->z:Z

    :cond_0
    const/4 v1, 0x4

    :goto_0
    move v6, v1

    invoke-interface {p0}, Ls1/y2;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ls1/f;->F()I

    move-result v4

    move-object v2, p1

    move-object v5, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v2 .. v8}, Ls1/q;->g(Ljava/lang/Throwable;Ljava/lang/String;ILs1/m1;IZI)Ls1/q;

    move-result-object p1

    return-object p1
.end method

.method protected final D()Ls1/b3;
    .locals 1

    iget-object v0, p0, Ls1/f;->p:Ls1/b3;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/b3;

    return-object v0
.end method

.method protected final E()Ls1/n1;
    .locals 1

    iget-object v0, p0, Ls1/f;->o:Ls1/n1;

    invoke-virtual {v0}, Ls1/n1;->a()V

    iget-object v0, p0, Ls1/f;->o:Ls1/n1;

    return-object v0
.end method

.method protected final F()I
    .locals 1

    iget v0, p0, Ls1/f;->q:I

    return v0
.end method

.method protected final G()Lt1/t1;
    .locals 1

    iget-object v0, p0, Ls1/f;->r:Lt1/t1;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt1/t1;

    return-object v0
.end method

.method protected final H()[Ls1/m1;
    .locals 1

    iget-object v0, p0, Ls1/f;->u:[Ls1/m1;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls1/m1;

    return-object v0
.end method

.method protected final I()Z
    .locals 1

    invoke-virtual {p0}, Ls1/f;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ls1/f;->y:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/f;->t:Lu2/n0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/n0;

    invoke-interface {v0}, Lu2/n0;->i()Z

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

.method protected abstract P([Ls1/m1;JJ)V
.end method

.method protected final Q(Ls1/n1;Lv1/g;I)I
    .locals 5

    iget-object v0, p0, Ls1/f;->t:Lu2/n0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/n0;

    invoke-interface {v0, p1, p2, p3}, Lu2/n0;->e(Ls1/n1;Lv1/g;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    invoke-virtual {p2}, Lv1/a;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Ls1/f;->x:J

    iget-boolean p1, p0, Ls1/f;->y:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x3

    :goto_0
    return v0

    :cond_1
    iget-wide v0, p2, Lv1/g;->r:J

    iget-wide v2, p0, Ls1/f;->v:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lv1/g;->r:J

    iget-wide p1, p0, Ls1/f;->x:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ls1/f;->x:J

    goto :goto_1

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Ls1/n1;->b:Ls1/m1;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ls1/m1;

    iget-wide v0, p2, Ls1/m1;->C:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Ls1/m1;->b()Ls1/m1$b;

    move-result-object v0

    iget-wide v1, p2, Ls1/m1;->C:J

    iget-wide v3, p0, Ls1/f;->v:J

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ls1/m1$b;->i0(J)Ls1/m1$b;

    move-result-object p2

    invoke-virtual {p2}, Ls1/m1$b;->E()Ls1/m1;

    move-result-object p2

    iput-object p2, p1, Ls1/n1;->b:Ls1/m1;

    :cond_3
    :goto_1
    return p3
.end method

.method protected S(J)I
    .locals 3

    iget-object v0, p0, Ls1/f;->t:Lu2/n0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/n0;

    iget-wide v1, p0, Ls1/f;->v:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lu2/n0;->t(J)I

    move-result p1

    return p1
.end method

.method public final c()V
    .locals 1

    iget v0, p0, Ls1/f;->s:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ls1/f;->o:Ls1/n1;

    invoke-virtual {v0}, Ls1/n1;->a()V

    invoke-virtual {p0}, Ls1/f;->M()V

    return-void
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ls1/f;->s:I

    return v0
.end method

.method public final g()V
    .locals 3

    iget v0, p0, Ls1/f;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lp3/a;->f(Z)V

    iget-object v0, p0, Ls1/f;->o:Ls1/n1;

    invoke-virtual {v0}, Ls1/n1;->a()V

    iput v2, p0, Ls1/f;->s:I

    const/4 v0, 0x0

    iput-object v0, p0, Ls1/f;->t:Lu2/n0;

    iput-object v0, p0, Ls1/f;->u:[Ls1/m1;

    iput-boolean v2, p0, Ls1/f;->y:Z

    invoke-virtual {p0}, Ls1/f;->J()V

    return-void
.end method

.method public final h()Lu2/n0;
    .locals 1

    iget-object v0, p0, Ls1/f;->t:Lu2/n0;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Ls1/f;->n:I

    return v0
.end method

.method public final l([Ls1/m1;Lu2/n0;JJ)V
    .locals 6

    iget-boolean v0, p0, Ls1/f;->y:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-object p2, p0, Ls1/f;->t:Lu2/n0;

    iget-wide v0, p0, Ls1/f;->x:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Ls1/f;->x:J

    :cond_0
    iput-object p1, p0, Ls1/f;->u:[Ls1/m1;

    iput-wide p5, p0, Ls1/f;->v:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Ls1/f;->P([Ls1/m1;JJ)V

    return-void
.end method

.method public final m()Z
    .locals 4

    iget-wide v0, p0, Ls1/f;->x:J

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

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final q()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls1/f;->y:Z

    return-void
.end method

.method public final r(Ls1/b3;[Ls1/m1;Lu2/n0;JZZJJ)V
    .locals 9

    move-object v7, p0

    move v8, p6

    iget v0, v7, Ls1/f;->s:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    move-object v0, p1

    iput-object v0, v7, Ls1/f;->p:Ls1/b3;

    iput v1, v7, Ls1/f;->s:I

    move/from16 v0, p7

    invoke-virtual {p0, p6, v0}, Ls1/f;->K(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p8

    move-wide/from16 v5, p10

    invoke-virtual/range {v0 .. v6}, Ls1/f;->l([Ls1/m1;Lu2/n0;JJ)V

    move-wide v0, p4

    invoke-direct {p0, p4, p5, p6}, Ls1/f;->R(JZ)V

    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Ls1/f;->t:Lu2/n0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/n0;

    invoke-interface {v0}, Lu2/n0;->b()V

    return-void
.end method

.method public final start()V
    .locals 2

    iget v0, p0, Ls1/f;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lp3/a;->f(Z)V

    const/4 v0, 0x2

    iput v0, p0, Ls1/f;->s:I

    invoke-virtual {p0}, Ls1/f;->N()V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget v0, p0, Ls1/f;->s:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    iput v1, p0, Ls1/f;->s:I

    invoke-virtual {p0}, Ls1/f;->O()V

    return-void
.end method

.method public final t()J
    .locals 2

    iget-wide v0, p0, Ls1/f;->x:J

    return-wide v0
.end method

.method public final u(J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Ls1/f;->R(JZ)V

    return-void
.end method

.method public final v()Z
    .locals 1

    iget-boolean v0, p0, Ls1/f;->y:Z

    return v0
.end method

.method public final w(ILt1/t1;)V
    .locals 0

    iput p1, p0, Ls1/f;->q:I

    iput-object p2, p0, Ls1/f;->r:Lt1/t1;

    return-void
.end method

.method public x()Lp3/t;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final y()Ls1/a3;
    .locals 0

    return-object p0
.end method
