.class public final Lb3/m;
.super Lb3/f;
.source ""


# instance fields
.field private final j:Lb3/g;

.field private k:Lb3/g$b;

.field private l:J

.field private volatile m:Z


# direct methods
.method public constructor <init>(Lt3/l;Lt3/p;Lx1/n1;ILjava/lang/Object;Lb3/g;)V
    .locals 11

    const/4 v3, 0x2

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v10}, Lb3/f;-><init>(Lt3/l;Lt3/p;ILx1/n1;ILjava/lang/Object;JJ)V

    move-object/from16 v1, p6

    iput-object v1, v0, Lb3/m;->j:Lb3/g;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-wide v0, p0, Lb3/m;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v1, p0, Lb3/m;->j:Lb3/g;

    iget-object v2, p0, Lb3/m;->k:Lb3/g$b;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    invoke-interface/range {v1 .. v6}, Lb3/g;->c(Lb3/g$b;JJ)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lb3/f;->b:Lt3/p;

    iget-wide v1, p0, Lb3/m;->l:J

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

    :goto_0
    :try_start_1
    iget-boolean v0, p0, Lb3/m;->m:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lb3/m;->j:Lb3/g;

    invoke-interface {v0, v7}, Lb3/g;->b(Lc2/m;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :try_start_2
    invoke-interface {v7}, Lc2/m;->q()J

    move-result-wide v0

    iget-object v2, p0, Lb3/f;->b:Lt3/p;

    iget-wide v2, v2, Lt3/p;->g:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lb3/m;->l:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lb3/f;->i:Lt3/o0;

    invoke-static {v0}, Lt3/o;->a(Lt3/l;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-interface {v7}, Lc2/m;->q()J

    move-result-wide v1

    iget-object v3, p0, Lb3/f;->b:Lt3/p;

    iget-wide v3, v3, Lt3/p;->g:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lb3/m;->l:J

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lb3/f;->i:Lt3/o0;

    invoke-static {v1}, Lt3/o;->a(Lt3/l;)V

    throw v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb3/m;->m:Z

    return-void
.end method

.method public g(Lb3/g$b;)V
    .locals 0

    iput-object p1, p0, Lb3/m;->k:Lb3/g$b;

    return-void
.end method
