.class public Lb3/k;
.super Lb3/a;
.source ""


# instance fields
.field private final o:I

.field private final p:J

.field private final q:Lb3/g;

.field private r:J

.field private volatile s:Z

.field private t:Z


# direct methods
.method public constructor <init>(Lt3/l;Lt3/p;Lx1/n1;ILjava/lang/Object;JJJJJIJLb3/g;)V
    .locals 3

    move-object v0, p0

    invoke-direct/range {p0 .. p15}, Lb3/a;-><init>(Lt3/l;Lt3/p;Lx1/n1;ILjava/lang/Object;JJJJJ)V

    move/from16 v1, p16

    iput v1, v0, Lb3/k;->o:I

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lb3/k;->p:J

    move-object/from16 v1, p19

    iput-object v1, v0, Lb3/k;->q:Lb3/g;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-wide v0, p0, Lb3/k;->r:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lb3/a;->j()Lb3/c;

    move-result-object v0

    iget-wide v1, p0, Lb3/k;->p:J

    invoke-virtual {v0, v1, v2}, Lb3/c;->b(J)V

    iget-object v3, p0, Lb3/k;->q:Lb3/g;

    invoke-virtual {p0, v0}, Lb3/k;->l(Lb3/c;)Lb3/g$b;

    move-result-object v4

    iget-wide v0, p0, Lb3/a;->k:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v5

    if-nez v2, :cond_0

    move-wide v0, v5

    goto :goto_0

    :cond_0
    iget-wide v7, p0, Lb3/k;->p:J

    sub-long/2addr v0, v7

    :goto_0
    iget-wide v7, p0, Lb3/a;->l:J

    cmp-long v2, v7, v5

    if-nez v2, :cond_1

    move-wide v7, v5

    goto :goto_1

    :cond_1
    iget-wide v5, p0, Lb3/k;->p:J

    sub-long/2addr v7, v5

    :goto_1
    move-wide v5, v0

    invoke-interface/range {v3 .. v8}, Lb3/g;->c(Lb3/g$b;JJ)V

    :cond_2
    :try_start_0
    iget-object v0, p0, Lb3/f;->b:Lt3/p;

    iget-wide v1, p0, Lb3/k;->r:J

    invoke-virtual {v0, v1, v2}, Lt3/p;->e(J)Lt3/p;

    move-result-object v0

    new-instance v7, Lc2/f;

    iget-object v2, p0, Lb3/f;->i:Lt3/o0;

    iget-wide v3, v0, Lt3/p;->g:J

    invoke-virtual {v2, v0}, Lt3/o0;->f(Lt3/p;)J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lc2/f;-><init>(Lt3/i;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_2
    :try_start_1
    iget-boolean v0, p0, Lb3/k;->s:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lb3/k;->q:Lb3/g;

    invoke-interface {v0, v7}, Lb3/g;->b(Lc2/m;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    :try_start_2
    invoke-interface {v7}, Lc2/m;->q()J

    move-result-wide v0

    iget-object v2, p0, Lb3/f;->b:Lt3/p;

    iget-wide v2, v2, Lt3/p;->g:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lb3/k;->r:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lb3/f;->i:Lt3/o0;

    invoke-static {v0}, Lt3/o;->a(Lt3/l;)V

    iget-boolean v0, p0, Lb3/k;->s:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lb3/k;->t:Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-interface {v7}, Lc2/m;->q()J

    move-result-wide v1

    iget-object v3, p0, Lb3/f;->b:Lt3/p;

    iget-wide v3, v3, Lt3/p;->g:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lb3/k;->r:J

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lb3/f;->i:Lt3/o0;

    invoke-static {v1}, Lt3/o;->a(Lt3/l;)V

    throw v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb3/k;->s:Z

    return-void
.end method

.method public g()J
    .locals 4

    iget-wide v0, p0, Lb3/n;->j:J

    iget v2, p0, Lb3/k;->o:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lb3/k;->t:Z

    return v0
.end method

.method protected l(Lb3/c;)Lb3/g$b;
    .locals 0

    return-object p1
.end method
