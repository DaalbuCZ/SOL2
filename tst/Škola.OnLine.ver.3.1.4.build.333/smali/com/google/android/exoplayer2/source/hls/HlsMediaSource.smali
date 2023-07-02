.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Lz2/a;
.source ""

# interfaces
.implements Lf3/l$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:I

.field private final C:Z

.field private final D:Lf3/l;

.field private final E:J

.field private final F:Lx1/v1;

.field private G:Lx1/v1$g;

.field private H:Lt3/p0;

.field private final u:Le3/h;

.field private final v:Lx1/v1$h;

.field private final w:Le3/g;

.field private final x:Lz2/h;

.field private final y:Lb2/y;

.field private final z:Lt3/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Lx1/k1;->a(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lx1/v1;Le3/g;Le3/h;Lz2/h;Lb2/y;Lt3/g0;Lf3/l;JZIZ)V
    .locals 1

    invoke-direct {p0}, Lz2/a;-><init>()V

    iget-object v0, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/v1$h;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lx1/v1$h;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Lx1/v1;

    iget-object p1, p1, Lx1/v1;->q:Lx1/v1$g;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Le3/g;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Le3/h;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:Lz2/h;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lb2/y;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lt3/g0;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:J

    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Z

    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:I

    iput-boolean p12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Z

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1;Le3/g;Le3/h;Lz2/h;Lb2/y;Lt3/g0;Lf3/l;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Lx1/v1;Le3/g;Le3/h;Lz2/h;Lb2/y;Lt3/g0;Lf3/l;JZIZ)V

    return-void
.end method

.method private F(Lf3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lz2/q0;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v1, Lf3/g;->h:J

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    invoke-interface {v4}, Lf3/l;->l()J

    move-result-wide v4

    sub-long v17, v2, v4

    iget-boolean v2, v1, Lf3/g;->o:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_0

    iget-wide v5, v1, Lf3/g;->u:J

    add-long v5, v17, v5

    move-wide v13, v5

    goto :goto_0

    :cond_0
    move-wide v13, v3

    :goto_0
    invoke-direct/range {p0 .. p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->J(Lf3/g;)J

    move-result-wide v11

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    iget-wide v5, v2, Lx1/v1$g;->n:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_1

    invoke-static {v5, v6}, Lu3/n0;->B0(J)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    invoke-static {v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->L(Lf3/g;J)J

    move-result-wide v2

    :goto_1
    move-wide v5, v2

    iget-wide v2, v1, Lf3/g;->u:J

    add-long v9, v2, v11

    move-wide v7, v11

    invoke-static/range {v5 .. v10}, Lu3/n0;->r(JJJ)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->M(Lf3/g;J)V

    invoke-direct {v0, v1, v11, v12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->K(Lf3/g;J)J

    move-result-wide v19

    iget v2, v1, Lf3/g;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    iget-boolean v2, v1, Lf3/g;->f:Z

    if-eqz v2, :cond_2

    move/from16 v23, v4

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    move/from16 v23, v2

    :goto_2
    new-instance v2, Lz2/q0;

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v9, v1, Lf3/g;->u:J

    const/16 v21, 0x1

    iget-boolean v1, v1, Lf3/g;->o:Z

    xor-int/lit8 v22, v1, 0x1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Lx1/v1;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    move-object/from16 v26, v1

    move-object v6, v2

    move-wide/from16 v7, p2

    move-wide v3, v9

    move-wide/from16 v9, p4

    move-wide v15, v3

    move-object/from16 v24, p6

    invoke-direct/range {v6 .. v26}, Lz2/q0;-><init>(JJJJJJJZZZLjava/lang/Object;Lx1/v1;Lx1/v1$g;)V

    return-object v2
.end method

.method private G(Lf3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lz2/q0;
    .locals 24

    move-object/from16 v0, p1

    iget-wide v1, v0, Lf3/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    iget-object v1, v0, Lf3/g;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, v0, Lf3/g;->g:Z

    if-nez v1, :cond_2

    iget-wide v1, v0, Lf3/g;->e:J

    iget-wide v3, v0, Lf3/g;->u:J

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lf3/g;->r:Ljava/util/List;

    invoke-static {v3, v1, v2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)Lf3/g$d;

    move-result-object v1

    iget-wide v1, v1, Lf3/g$e;->r:J

    goto :goto_2

    :cond_2
    :goto_0
    iget-wide v1, v0, Lf3/g;->e:J

    goto :goto_2

    :cond_3
    :goto_1
    const-wide/16 v1, 0x0

    :goto_2
    move-wide/from16 v16, v1

    new-instance v1, Lz2/q0;

    move-object v3, v1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-wide v10, v0, Lf3/g;->u:J

    move-wide v12, v10

    const-wide/16 v14, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Lx1/v1;

    move-object/from16 v22, v2

    const/16 v23, 0x0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v21, p6

    invoke-direct/range {v3 .. v23}, Lz2/q0;-><init>(JJJJJJJZZZLjava/lang/Object;Lx1/v1;Lx1/v1$g;)V

    return-object v1
.end method

.method private static H(Ljava/util/List;J)Lf3/g$b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf3/g$b;",
            ">;J)",
            "Lf3/g$b;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf3/g$b;

    iget-wide v3, v2, Lf3/g$e;->r:J

    cmp-long v5, v3, p1

    if-gtz v5, :cond_0

    iget-boolean v5, v2, Lf3/g$b;->y:Z

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    cmp-long v2, v3, p1

    if-lez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method

.method private static I(Ljava/util/List;J)Lf3/g$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf3/g$d;",
            ">;J)",
            "Lf3/g$d;"
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p0, p1, p2, p2}, Lu3/n0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf3/g$d;

    return-object p0
.end method

.method private J(Lf3/g;)J
    .locals 4

    iget-boolean v0, p1, Lf3/g;->p:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E:J

    invoke-static {v0, v1}, Lu3/n0;->a0(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lu3/n0;->B0(J)J

    move-result-wide v0

    invoke-virtual {p1}, Lf3/g;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method private K(Lf3/g;J)J
    .locals 4

    iget-wide v0, p1, Lf3/g;->e:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p1, Lf3/g;->u:J

    add-long/2addr v0, p2

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    iget-wide p2, p2, Lx1/v1$g;->n:J

    invoke-static {p2, p3}, Lu3/n0;->B0(J)J

    move-result-wide p2

    sub-long/2addr v0, p2

    :goto_0
    iget-boolean p2, p1, Lf3/g;->g:Z

    if-eqz p2, :cond_1

    return-wide v0

    :cond_1
    iget-object p2, p1, Lf3/g;->s:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)Lf3/g$b;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-wide p1, p2, Lf3/g$e;->r:J

    return-wide p1

    :cond_2
    iget-object p2, p1, Lf3/g;->r:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_3
    iget-object p1, p1, Lf3/g;->r:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->I(Ljava/util/List;J)Lf3/g$d;

    move-result-object p1

    iget-object p2, p1, Lf3/g$d;->z:Ljava/util/List;

    invoke-static {p2, v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H(Ljava/util/List;J)Lf3/g$b;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-wide p1, p2, Lf3/g$e;->r:J

    return-wide p1

    :cond_4
    iget-wide p1, p1, Lf3/g$e;->r:J

    return-wide p1
.end method

.method private static L(Lf3/g;J)J
    .locals 7

    iget-object v0, p0, Lf3/g;->v:Lf3/g$f;

    iget-wide v1, p0, Lf3/g;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    iget-wide v3, p0, Lf3/g;->u:J

    sub-long/2addr v3, v1

    goto :goto_0

    :cond_0
    iget-wide v1, v0, Lf3/g$f;->d:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-wide v5, p0, Lf3/g;->n:J

    cmp-long v5, v5, v3

    if-eqz v5, :cond_1

    move-wide v3, v1

    goto :goto_0

    :cond_1
    iget-wide v0, v0, Lf3/g$f;->c:J

    cmp-long v2, v0, v3

    if-eqz v2, :cond_2

    move-wide v3, v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x3

    iget-wide v2, p0, Lf3/g;->m:J

    mul-long v3, v2, v0

    :goto_0
    add-long/2addr v3, p1

    return-wide v3
.end method

.method private M(Lf3/g;J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Lx1/v1;

    iget-object v0, v0, Lx1/v1;->q:Lx1/v1$g;

    iget v1, v0, Lx1/v1$g;->q:F

    const v2, -0x800001

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    iget v0, v0, Lx1/v1$g;->r:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    iget-object p1, p1, Lf3/g;->v:Lf3/g$f;

    iget-wide v0, p1, Lf3/g$f;->c:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p1, Lf3/g$f;->d:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    new-instance v0, Lx1/v1$g$a;

    invoke-direct {v0}, Lx1/v1$g$a;-><init>()V

    invoke-static {p2, p3}, Lu3/n0;->Y0(J)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Lx1/v1$g$a;->k(J)Lx1/v1$g$a;

    move-result-object p2

    const/high16 p3, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    move v0, p3

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    iget v0, v0, Lx1/v1$g;->q:F

    :goto_1
    invoke-virtual {p2, v0}, Lx1/v1$g$a;->j(F)Lx1/v1$g$a;

    move-result-object p2

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    iget p3, p1, Lx1/v1$g;->r:F

    :goto_2
    invoke-virtual {p2, p3}, Lx1/v1$g$a;->h(F)Lx1/v1$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lx1/v1$g$a;->f()Lx1/v1$g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G:Lx1/v1$g;

    return-void
.end method


# virtual methods
.method protected C(Lt3/p0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H:Lt3/p0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lb2/y;

    invoke-interface {p1}, Lb2/y;->c()V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lb2/y;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lb2/y;->e(Landroid/os/Looper;Ly1/t1;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lx1/v1$h;

    iget-object v1, v1, Lx1/v1$h;->a:Landroid/net/Uri;

    invoke-interface {v0, v1, p1, p0}, Lf3/l;->h(Landroid/net/Uri;Lz2/b0$a;Lf3/l$e;)V

    return-void
.end method

.method protected E()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    invoke-interface {v0}, Lf3/l;->stop()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lb2/y;

    invoke-interface {v0}, Lb2/y;->a()V

    return-void
.end method

.method public a()Lx1/v1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F:Lx1/v1;

    return-object v0
.end method

.method public b(Lz2/r;)V
    .locals 0

    check-cast p1, Le3/k;

    invoke-virtual {p1}, Le3/k;->B()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    invoke-interface {v0}, Lf3/l;->f()V

    return-void
.end method

.method public j(Lz2/u$b;Lt3/b;J)Lz2/r;
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p1}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object v9

    invoke-virtual/range {p0 .. p1}, Lz2/a;->t(Lz2/u$b;)Lb2/w$a;

    move-result-object v7

    new-instance v16, Le3/k;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Le3/h;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Le3/g;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->H:Lt3/p0;

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Lb2/y;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lt3/g0;

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:Lz2/h;

    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:Z

    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:I

    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Z

    invoke-virtual/range {p0 .. p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v15

    move-object/from16 v1, v16

    move-object/from16 v10, p2

    invoke-direct/range {v1 .. v15}, Le3/k;-><init>(Le3/h;Lf3/l;Le3/g;Lt3/p0;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;Lt3/b;Lz2/h;ZIZLy1/t1;)V

    return-object v16
.end method

.method public n(Lf3/g;)V
    .locals 12

    iget-boolean v0, p1, Lf3/g;->p:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    iget-wide v3, p1, Lf3/g;->h:J

    invoke-static {v3, v4}, Lu3/n0;->Y0(J)J

    move-result-wide v3

    move-wide v9, v3

    goto :goto_0

    :cond_0
    move-wide v9, v1

    :goto_0
    iget v0, p1, Lf3/g;->d:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move-wide v7, v1

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v7, v9

    :goto_2
    new-instance v11, Lcom/google/android/exoplayer2/source/hls/a;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    invoke-interface {v0}, Lf3/l;->b()Lf3/h;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf3/h;

    invoke-direct {v11, v0, p1}, Lcom/google/android/exoplayer2/source/hls/a;-><init>(Lf3/h;Lf3/g;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Lf3/l;

    invoke-interface {v0}, Lf3/l;->a()Z

    move-result v0

    move-object v5, p0

    move-object v6, p1

    if-eqz v0, :cond_3

    invoke-direct/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F(Lf3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lz2/q0;

    move-result-object p1

    goto :goto_3

    :cond_3
    invoke-direct/range {v5 .. v11}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G(Lf3/g;JJLcom/google/android/exoplayer2/source/hls/a;)Lz2/q0;

    move-result-object p1

    :goto_3
    invoke-virtual {p0, p1}, Lz2/a;->D(Lx1/y3;)V

    return-void
.end method
