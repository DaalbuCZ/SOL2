.class public final Lcom/google/android/exoplayer2/source/dash/DashMediaSource;
.super Lz2/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$f;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$d;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$h;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$g;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;,
        Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final A:Lt3/g0;

.field private final B:Lc3/b;

.field private final C:J

.field private final D:Lz2/b0$a;

.field private final E:Lt3/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/j0$a<",
            "+",
            "Ld3/c;",
            ">;"
        }
    .end annotation
.end field

.field private final F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

.field private final G:Ljava/lang/Object;

.field private final H:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/exoplayer2/source/dash/b;",
            ">;"
        }
    .end annotation
.end field

.field private final I:Ljava/lang/Runnable;

.field private final J:Ljava/lang/Runnable;

.field private final K:Lcom/google/android/exoplayer2/source/dash/e$b;

.field private final L:Lt3/i0;

.field private M:Lt3/l;

.field private N:Lt3/h0;

.field private O:Lt3/p0;

.field private P:Ljava/io/IOException;

.field private Q:Landroid/os/Handler;

.field private R:Lx1/v1$g;

.field private S:Landroid/net/Uri;

.field private T:Landroid/net/Uri;

.field private U:Ld3/c;

.field private V:Z

.field private W:J

.field private X:J

.field private Y:J

.field private Z:I

.field private a0:J

.field private b0:I

.field private final u:Lx1/v1;

.field private final v:Z

.field private final w:Lt3/l$a;

.field private final x:Lcom/google/android/exoplayer2/source/dash/a$a;

.field private final y:Lz2/h;

.field private final z:Lb2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.dash"

    invoke-static {v0}, Lx1/k1;->a(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lx1/v1;Ld3/c;Lt3/l$a;Lt3/j0$a;Lcom/google/android/exoplayer2/source/dash/a$a;Lz2/h;Lb2/y;Lt3/g0;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/v1;",
            "Ld3/c;",
            "Lt3/l$a;",
            "Lt3/j0$a<",
            "+",
            "Ld3/c;",
            ">;",
            "Lcom/google/android/exoplayer2/source/dash/a$a;",
            "Lz2/h;",
            "Lb2/y;",
            "Lt3/g0;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Lz2/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:Lx1/v1;

    iget-object v0, p1, Lx1/v1;->q:Lx1/v1$g;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:Lx1/v1$g;

    iget-object v0, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/v1$h;

    iget-object v0, v0, Lx1/v1$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S:Landroid/net/Uri;

    iget-object p1, p1, Lx1/v1;->o:Lx1/v1$h;

    iget-object p1, p1, Lx1/v1$h;->a:Landroid/net/Uri;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:Landroid/net/Uri;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->w:Lt3/l$a;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lt3/j0$a;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->x:Lcom/google/android/exoplayer2/source/dash/a$a;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lb2/y;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iput-wide p9, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:J

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->y:Lz2/h;

    new-instance p1, Lc3/b;

    invoke-direct {p1}, Lc3/b;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B:Lc3/b;

    const/4 p1, 0x1

    if-eqz p2, :cond_0

    move p3, p1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-boolean p3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Z

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object p5

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    new-instance p5, Ljava/lang/Object;

    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->G:Ljava/lang/Object;

    new-instance p5, Landroid/util/SparseArray;

    invoke-direct {p5}, Landroid/util/SparseArray;-><init>()V

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    new-instance p5, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;

    invoke-direct {p5, p0, p4}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$c;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;)V

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->K:Lcom/google/android/exoplayer2/source/dash/e$b;

    const-wide p5, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0:J

    iput-wide p5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    if-eqz p3, :cond_1

    iget-boolean p2, p2, Ld3/c;->d:Z

    xor-int/2addr p1, p2

    invoke-static {p1}, Lu3/a;->f(Z)V

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Ljava/lang/Runnable;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Ljava/lang/Runnable;

    new-instance p1, Lt3/i0$a;

    invoke-direct {p1}, Lt3/i0$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Lt3/i0;

    goto :goto_1

    :cond_1
    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    invoke-direct {p1, p0, p4}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$f;

    invoke-direct {p1, p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$f;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Lt3/i0;

    new-instance p1, Lc3/d;

    invoke-direct {p1, p0}, Lc3/d;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Ljava/lang/Runnable;

    new-instance p1, Lc3/e;

    invoke-direct {p1, p0}, Lc3/e;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Ljava/lang/Runnable;

    :goto_1
    return-void
.end method

.method synthetic constructor <init>(Lx1/v1;Ld3/c;Lt3/l$a;Lt3/j0$a;Lcom/google/android/exoplayer2/source/dash/a$a;Lz2/h;Lb2/y;Lt3/g0;JLcom/google/android/exoplayer2/source/dash/DashMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;-><init>(Lx1/v1;Ld3/c;Lt3/l$a;Lt3/j0$a;Lcom/google/android/exoplayer2/source/dash/a$a;Lz2/h;Lb2/y;Lt3/g0;J)V

    return-void
.end method

.method public static synthetic F(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->i0()V

    return-void
.end method

.method public static synthetic G(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R()V

    return-void
.end method

.method static synthetic H(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0(J)V

    return-void
.end method

.method static synthetic I(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0(Ljava/io/IOException;)V

    return-void
.end method

.method static synthetic J(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)Lt3/h0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    return-object p0
.end method

.method static synthetic K(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)Ljava/io/IOException;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ljava/io/IOException;

    return-object p0
.end method

.method private static L(Ld3/g;JJ)J
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    iget-wide v5, v0, Ld3/g;->b:J

    invoke-static {v5, v6}, Lu3/n0;->B0(J)J

    move-result-wide v5

    invoke-static/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P(Ld3/g;)Z

    move-result v7

    const/4 v8, 0x0

    const-wide v9, 0x7fffffffffffffffL

    move v11, v8

    :goto_0
    iget-object v12, v0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_6

    iget-object v12, v0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld3/a;

    iget-object v13, v12, Ld3/a;->c:Ljava/util/List;

    iget v12, v12, Ld3/a;->b:I

    const/4 v14, 0x1

    if-eq v12, v14, :cond_0

    const/4 v15, 0x2

    if-eq v12, v15, :cond_0

    goto :goto_1

    :cond_0
    move v14, v8

    :goto_1
    if-eqz v7, :cond_1

    if-nez v14, :cond_5

    :cond_1
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld3/j;

    invoke-virtual {v12}, Ld3/j;->b()Lc3/f;

    move-result-object v12

    if-nez v12, :cond_3

    add-long/2addr v5, v1

    return-wide v5

    :cond_3
    invoke-interface {v12, v1, v2, v3, v4}, Lc3/f;->m(JJ)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v15, v13, v15

    if-nez v15, :cond_4

    return-wide v5

    :cond_4
    invoke-interface {v12, v1, v2, v3, v4}, Lc3/f;->g(JJ)J

    move-result-wide v15

    add-long/2addr v15, v13

    const-wide/16 v13, 0x1

    sub-long v13, v15, v13

    invoke-interface {v12, v13, v14}, Lc3/f;->d(J)J

    move-result-wide v15

    add-long/2addr v15, v5

    invoke-interface {v12, v13, v14, v1, v2}, Lc3/f;->f(JJ)J

    move-result-wide v12

    add-long/2addr v12, v15

    invoke-static {v9, v10, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    :cond_5
    :goto_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_6
    return-wide v9
.end method

.method private static M(Ld3/g;JJ)J
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    iget-wide v5, v0, Ld3/g;->b:J

    invoke-static {v5, v6}, Lu3/n0;->B0(J)J

    move-result-wide v5

    invoke-static/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P(Ld3/g;)Z

    move-result v7

    const/4 v8, 0x0

    move-wide v10, v5

    move v9, v8

    :goto_0
    iget-object v12, v0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v9, v12, :cond_6

    iget-object v12, v0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld3/a;

    iget-object v13, v12, Ld3/a;->c:Ljava/util/List;

    iget v12, v12, Ld3/a;->b:I

    const/4 v14, 0x1

    if-eq v12, v14, :cond_0

    const/4 v15, 0x2

    if-eq v12, v15, :cond_0

    goto :goto_1

    :cond_0
    move v14, v8

    :goto_1
    if-eqz v7, :cond_1

    if-nez v14, :cond_5

    :cond_1
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld3/j;

    invoke-virtual {v12}, Ld3/j;->b()Lc3/f;

    move-result-object v12

    if-nez v12, :cond_3

    return-wide v5

    :cond_3
    invoke-interface {v12, v1, v2, v3, v4}, Lc3/f;->m(JJ)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v13, v13, v15

    if-nez v13, :cond_4

    return-wide v5

    :cond_4
    invoke-interface {v12, v1, v2, v3, v4}, Lc3/f;->g(JJ)J

    move-result-wide v13

    invoke-interface {v12, v13, v14}, Lc3/f;->d(J)J

    move-result-wide v12

    add-long/2addr v12, v5

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :cond_5
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_6
    return-wide v10
.end method

.method private static N(Ld3/c;J)J
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Ld3/c;->e()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ld3/c;->d(I)Ld3/g;

    move-result-object v2

    iget-wide v3, v2, Ld3/g;->b:J

    invoke-static {v3, v4}, Lu3/n0;->B0(J)J

    move-result-wide v3

    invoke-virtual {v0, v1}, Ld3/c;->g(I)J

    move-result-wide v5

    invoke-static/range {p1 .. p2}, Lu3/n0;->B0(J)J

    move-result-wide v7

    iget-wide v0, v0, Ld3/c;->a:J

    invoke-static {v0, v1}, Lu3/n0;->B0(J)J

    move-result-wide v0

    const-wide/16 v9, 0x1388

    invoke-static {v9, v10}, Lu3/n0;->B0(J)J

    move-result-wide v9

    const/4 v11, 0x0

    move v12, v11

    :goto_0
    iget-object v13, v2, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_3

    iget-object v13, v2, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld3/a;

    iget-object v13, v13, Ld3/a;->c:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ld3/j;

    invoke-virtual {v13}, Ld3/j;->b()Lc3/f;

    move-result-object v13

    if-eqz v13, :cond_2

    add-long v14, v0, v3

    invoke-interface {v13, v5, v6, v7, v8}, Lc3/f;->h(JJ)J

    move-result-wide v16

    add-long v14, v14, v16

    sub-long/2addr v14, v7

    const-wide/32 v16, 0x186a0

    sub-long v18, v9, v16

    cmp-long v13, v14, v18

    if-ltz v13, :cond_1

    cmp-long v13, v14, v9

    if-lez v13, :cond_2

    add-long v16, v9, v16

    cmp-long v13, v14, v16

    if-gez v13, :cond_2

    :cond_1
    move-wide v9, v14

    :cond_2
    :goto_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x3e8

    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v9, v10, v0, v1, v2}, Lh5/c;->a(JJLjava/math/RoundingMode;)J

    move-result-wide v0

    return-wide v0
.end method

.method private O()J
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Z:I

    add-int/lit8 v0, v0, -0x1

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v1, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method private static P(Ld3/g;)Z
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld3/a;

    iget v2, v2, Ld3/a;->b:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v4, 0x2

    if-ne v2, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v3

    :cond_2
    return v0
.end method

.method private static Q(Ld3/g;)Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Ld3/g;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld3/a;

    iget-object v2, v2, Ld3/a;->c:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld3/j;

    invoke-virtual {v2}, Ld3/j;->b()Lc3/f;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lc3/f;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method private synthetic R()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->c0(Z)V

    return-void
.end method

.method private S()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    new-instance v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;

    invoke-direct {v1, p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;)V

    invoke-static {v0, v1}, Lu3/e0;->j(Lt3/h0;Lu3/e0$b;)V

    return-void
.end method

.method private a0(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "DashMediaSource"

    const-string v1, "Failed to resolve time offset."

    invoke-static {v0, v1, p1}, Lu3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->c0(Z)V

    return-void
.end method

.method private b0(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->c0(Z)V

    return-void
.end method

.method private c0(Z)V
    .locals 31

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    iget v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    if-lt v3, v4, :cond_0

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/exoplayer2/source/dash/b;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget v6, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    sub-int/2addr v3, v6

    invoke-virtual {v4, v5, v3}, Lcom/google/android/exoplayer2/source/dash/b;->M(Ld3/c;I)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v2, v1}, Ld3/c;->d(I)Ld3/g;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v3}, Ld3/c;->e()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v5, v3}, Ld3/c;->d(I)Ld3/g;

    move-result-object v5

    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v6, v3}, Ld3/c;->g(I)J

    move-result-wide v6

    iget-wide v8, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    invoke-static {v8, v9}, Lu3/n0;->a0(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Lu3/n0;->B0(J)J

    move-result-wide v8

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v3, v1}, Ld3/c;->g(I)J

    move-result-wide v10

    invoke-static {v2, v10, v11, v8, v9}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M(Ld3/g;JJ)J

    move-result-wide v10

    invoke-static {v5, v6, v7, v8, v9}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L(Ld3/g;JJ)J

    move-result-wide v6

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-boolean v3, v3, Ld3/c;->d:Z

    if-eqz v3, :cond_2

    invoke-static {v5}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q(Ld3/g;)Z

    move-result v3

    if-nez v3, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v3, :cond_3

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-wide v14, v5, Ld3/c;->f:J

    cmp-long v5, v14, v12

    if-eqz v5, :cond_3

    invoke-static {v14, v15}, Lu3/n0;->B0(J)J

    move-result-wide v14

    sub-long v14, v6, v14

    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :cond_3
    sub-long v5, v6, v10

    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-boolean v14, v7, Ld3/c;->d:Z

    move-object/from16 v16, v2

    if-eqz v14, :cond_6

    iget-wide v1, v7, Ld3/c;->a:J

    cmp-long v1, v1, v12

    if-eqz v1, :cond_4

    move v1, v4

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1}, Lu3/a;->f(Z)V

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-wide v1, v1, Ld3/c;->a:J

    invoke-static {v1, v2}, Lu3/n0;->B0(J)J

    move-result-wide v1

    sub-long/2addr v8, v1

    sub-long/2addr v8, v10

    invoke-direct {v0, v8, v9, v5, v6}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->j0(JJ)V

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-wide v1, v1, Ld3/c;->a:J

    invoke-static {v10, v11}, Lu3/n0;->Y0(J)J

    move-result-wide v14

    add-long/2addr v1, v14

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:Lx1/v1$g;

    iget-wide v14, v4, Lx1/v1$g;->n:J

    invoke-static {v14, v15}, Lu3/n0;->B0(J)J

    move-result-wide v14

    sub-long/2addr v8, v14

    const-wide/32 v14, 0x4c4b40

    const-wide/16 v17, 0x2

    div-long v12, v5, v17

    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    cmp-long v4, v8, v12

    move-wide/from16 v17, v1

    if-gez v4, :cond_5

    move-wide/from16 v26, v12

    goto :goto_3

    :cond_5
    move-wide/from16 v26, v8

    :goto_3
    move-object/from16 v1, v16

    goto :goto_4

    :cond_6
    move-object/from16 v1, v16

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v26, 0x0

    :goto_4
    iget-wide v1, v1, Ld3/g;->b:J

    invoke-static {v1, v2}, Lu3/n0;->B0(J)J

    move-result-wide v1

    sub-long v22, v10, v1

    new-instance v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-wide v7, v2, Ld3/c;->a:J

    iget-wide v9, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    iget v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:Lx1/v1;

    iget-boolean v12, v2, Ld3/c;->d:Z

    if-eqz v12, :cond_7

    iget-object v12, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:Lx1/v1$g;

    goto :goto_5

    :cond_7
    const/4 v12, 0x0

    :goto_5
    move-object/from16 v30, v12

    move-object v14, v1

    move-wide v15, v7

    move-wide/from16 v19, v9

    move/from16 v21, v4

    move-wide/from16 v24, v5

    move-object/from16 v28, v2

    move-object/from16 v29, v11

    invoke-direct/range {v14 .. v30}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$b;-><init>(JJJIJJJLd3/c;Lx1/v1;Lx1/v1$g;)V

    invoke-virtual {v0, v1}, Lz2/a;->D(Lx1/y3;)V

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Z

    if-nez v1, :cond_b

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    if-eqz v3, :cond_8

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Ljava/lang/Runnable;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    invoke-static {v4, v5}, Lu3/n0;->a0(J)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N(Ld3/c;J)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_8
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:Z

    if-eqz v1, :cond_9

    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->i0()V

    goto :goto_6

    :cond_9
    if-eqz p1, :cond_b

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-boolean v2, v1, Ld3/c;->d:Z

    if-eqz v2, :cond_b

    iget-wide v1, v1, Ld3/c;->e:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_b

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_a

    const-wide/16 v1, 0x1388

    :cond_a
    iget-wide v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:J

    add-long/2addr v5, v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long/2addr v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->g0(J)V

    :cond_b
    :goto_6
    return-void
.end method

.method private d0(Ld3/o;)V
    .locals 2

    iget-object v0, p1, Ld3/o;->a:Ljava/lang/String;

    const-string v1, "urn:mpeg:dash:utc:direct:2014"

    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "urn:mpeg:dash:utc:direct:2012"

    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_0
    const-string v1, "urn:mpeg:dash:utc:http-iso:2014"

    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "urn:mpeg:dash:utc:http-iso:2012"

    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2014"

    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2012"

    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "urn:mpeg:dash:utc:ntp:2014"

    invoke-static {v0, p1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "urn:mpeg:dash:utc:ntp:2012"

    invoke-static {v0, p1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unsupported UTC timing scheme"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0(Ljava/io/IOException;)V

    goto :goto_5

    :cond_4
    :goto_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S()V

    goto :goto_5

    :cond_5
    :goto_1
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$h;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;)V

    goto :goto_3

    :cond_6
    :goto_2
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$d;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$d;-><init>()V

    :goto_3
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->f0(Ld3/o;Lt3/j0$a;)V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->e0(Ld3/o;)V

    :goto_5
    return-void
.end method

.method private e0(Ld3/o;)V
    .locals 4

    :try_start_0
    iget-object p1, p1, Ld3/o;->b:Ljava/lang/String;

    invoke-static {p1}, Lu3/n0;->I0(Ljava/lang/String;)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->X:J

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0(J)V
    :try_end_0
    .catch Lx1/u2; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0(Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method private f0(Ld3/o;Lt3/j0$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/o;",
            "Lt3/j0$a<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lt3/j0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lt3/l;

    iget-object p1, p1, Ld3/o;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const/4 v2, 0x5

    invoke-direct {v0, v1, p1, v2, p2}, Lt3/j0;-><init>(Lt3/l;Landroid/net/Uri;ILt3/j0$a;)V

    new-instance p1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$g;-><init>(Lcom/google/android/exoplayer2/source/dash/DashMediaSource;Lcom/google/android/exoplayer2/source/dash/DashMediaSource$a;)V

    const/4 p2, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->h0(Lt3/j0;Lt3/h0$b;I)V

    return-void
.end method

.method private g0(J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private h0(Lt3/j0;Lt3/h0$b;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt3/j0<",
            "TT;>;",
            "Lt3/h0$b<",
            "Lt3/j0<",
            "TT;>;>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    invoke-virtual {v0, p1, p2, p3}, Lt3/h0;->n(Lt3/h0$e;Lt3/h0$b;I)J

    move-result-wide v5

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    new-instance p3, Lz2/n;

    iget-wide v2, p1, Lt3/j0;->a:J

    iget-object v4, p1, Lt3/j0;->b:Lt3/p;

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Lz2/n;-><init>(JLt3/p;J)V

    iget p1, p1, Lt3/j0;->c:I

    invoke-virtual {p2, p3, p1}, Lz2/b0$a;->z(Lz2/n;I)V

    return-void
.end method

.method private i0()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->I:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->G:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S:Landroid/net/Uri;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:Z

    new-instance v0, Lt3/j0;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lt3/l;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->E:Lt3/j0$a;

    const/4 v4, 0x4

    invoke-direct {v0, v2, v1, v4, v3}, Lt3/j0;-><init>(Lt3/l;Landroid/net/Uri;ILt3/j0$a;)V

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->F:Lcom/google/android/exoplayer2/source/dash/DashMediaSource$e;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    invoke-interface {v2, v4}, Lt3/g0;->d(I)I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->h0(Lt3/j0;Lt3/h0$b;I)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private j0(JJ)V
    .locals 17

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p2}, Lu3/n0;->Y0(J)J

    move-result-wide v5

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:Lx1/v1;

    iget-object v1, v1, Lx1/v1;->q:Lx1/v1$g;

    iget-wide v1, v1, Lx1/v1$g;->p:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v7

    if-eqz v3, :cond_0

    :goto_0
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    move-wide v9, v1

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v1, v1, Ld3/c;->j:Ld3/l;

    if-eqz v1, :cond_1

    iget-wide v1, v1, Ld3/l;->c:J

    cmp-long v3, v1, v7

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-wide v9, v5

    :goto_1
    sub-long v1, p1, p3

    invoke-static {v1, v2}, Lu3/n0;->Y0(J)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v11, v1, v3

    if-gez v11, :cond_2

    cmp-long v11, v9, v3

    if-lez v11, :cond_2

    move-wide v1, v3

    :cond_2
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-wide v3, v3, Ld3/c;->c:J

    cmp-long v11, v3, v7

    if-eqz v11, :cond_3

    add-long/2addr v1, v3

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :cond_3
    move-wide v3, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:Lx1/v1;

    iget-object v1, v1, Lx1/v1;->q:Lx1/v1$g;

    iget-wide v1, v1, Lx1/v1$g;->o:J

    cmp-long v11, v1, v7

    if-eqz v11, :cond_4

    :goto_2
    invoke-static/range {v1 .. v6}, Lu3/n0;->r(JJJ)J

    move-result-wide v3

    goto :goto_3

    :cond_4
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v1, v1, Ld3/c;->j:Ld3/l;

    if-eqz v1, :cond_5

    iget-wide v1, v1, Ld3/l;->b:J

    cmp-long v11, v1, v7

    if-eqz v11, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    cmp-long v1, v3, v9

    if-lez v1, :cond_6

    move-wide v9, v3

    :cond_6
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:Lx1/v1$g;

    iget-wide v1, v1, Lx1/v1$g;->n:J

    cmp-long v5, v1, v7

    if-eqz v5, :cond_7

    goto :goto_4

    :cond_7
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v2, v1, Ld3/c;->j:Ld3/l;

    if-eqz v2, :cond_8

    iget-wide v5, v2, Ld3/l;->a:J

    cmp-long v2, v5, v7

    if-eqz v2, :cond_8

    move-wide v1, v5

    goto :goto_4

    :cond_8
    iget-wide v1, v1, Ld3/c;->g:J

    cmp-long v5, v1, v7

    if-eqz v5, :cond_9

    goto :goto_4

    :cond_9
    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->C:J

    :goto_4
    cmp-long v5, v1, v3

    if-gez v5, :cond_a

    move-wide v1, v3

    :cond_a
    cmp-long v5, v1, v9

    if-lez v5, :cond_b

    const-wide/32 v1, 0x4c4b40

    const-wide/16 v5, 0x2

    div-long v5, p3, v5

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    sub-long v1, p1, v1

    invoke-static {v1, v2}, Lu3/n0;->Y0(J)J

    move-result-wide v11

    move-wide v13, v3

    move-wide v15, v9

    invoke-static/range {v11 .. v16}, Lu3/n0;->r(JJJ)J

    move-result-wide v1

    :cond_b
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:Lx1/v1;

    iget-object v5, v5, Lx1/v1;->q:Lx1/v1$g;

    iget v6, v5, Lx1/v1$g;->q:F

    const v11, -0x800001

    cmpl-float v12, v6, v11

    if-eqz v12, :cond_c

    goto :goto_5

    :cond_c
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v6, v6, Ld3/c;->j:Ld3/l;

    if-eqz v6, :cond_d

    iget v6, v6, Ld3/l;->d:F

    goto :goto_5

    :cond_d
    move v6, v11

    :goto_5
    iget v5, v5, Lx1/v1$g;->r:F

    cmpl-float v12, v5, v11

    if-eqz v12, :cond_e

    goto :goto_6

    :cond_e
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v5, v5, Ld3/c;->j:Ld3/l;

    if-eqz v5, :cond_f

    iget v5, v5, Ld3/l;->e:F

    goto :goto_6

    :cond_f
    move v5, v11

    :goto_6
    cmpl-float v12, v6, v11

    const/high16 v13, 0x3f800000    # 1.0f

    if-nez v12, :cond_11

    cmpl-float v11, v5, v11

    if-nez v11, :cond_11

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v11, v11, Ld3/c;->j:Ld3/l;

    if-eqz v11, :cond_10

    iget-wide v11, v11, Ld3/l;->a:J

    cmp-long v7, v11, v7

    if-nez v7, :cond_11

    :cond_10
    move v5, v13

    move v6, v5

    :cond_11
    new-instance v7, Lx1/v1$g$a;

    invoke-direct {v7}, Lx1/v1$g$a;-><init>()V

    invoke-virtual {v7, v1, v2}, Lx1/v1$g$a;->k(J)Lx1/v1$g$a;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lx1/v1$g$a;->i(J)Lx1/v1$g$a;

    move-result-object v1

    invoke-virtual {v1, v9, v10}, Lx1/v1$g$a;->g(J)Lx1/v1$g$a;

    move-result-object v1

    invoke-virtual {v1, v6}, Lx1/v1$g$a;->j(F)Lx1/v1$g$a;

    move-result-object v1

    invoke-virtual {v1, v5}, Lx1/v1$g$a;->h(F)Lx1/v1$g$a;

    move-result-object v1

    invoke-virtual {v1}, Lx1/v1$g$a;->f()Lx1/v1$g;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->R:Lx1/v1$g;

    return-void
.end method


# virtual methods
.method protected C(Lt3/p0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->O:Lt3/p0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lb2/y;

    invoke-interface {p1}, Lb2/y;->c()V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lb2/y;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lb2/y;->e(Landroid/os/Looper;Ly1/t1;)V

    iget-boolean p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->c0(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->w:Lt3/l$a;

    invoke-interface {p1}, Lt3/l$a;->a()Lt3/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lt3/l;

    new-instance p1, Lt3/h0;

    const-string v0, "DashMediaSource"

    invoke-direct {p1, v0}, Lt3/h0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    invoke-static {}, Lu3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->i0()V

    :goto_0
    return-void
.end method

.method protected E()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->M:Lt3/l;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lt3/h0;->l()V

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->N:Lt3/h0;

    :cond_0
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:J

    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->X:J

    iget-boolean v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->v:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->T:Landroid/net/Uri;

    iput-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S:Landroid/net/Uri;

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ljava/io/IOException;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    :cond_2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Z:I

    iput-wide v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0:J

    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B:Lc3/b;

    invoke-virtual {v0}, Lc3/b;->i()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lb2/y;

    invoke-interface {v0}, Lb2/y;->a()V

    return-void
.end method

.method T(J)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    :cond_0
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0:J

    :cond_1
    return-void
.end method

.method U()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Q:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->J:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->i0()V

    return-void
.end method

.method V(Lt3/j0;JJ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "*>;JJ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lz2/n;

    iget-wide v3, v1, Lt3/j0;->a:J

    iget-object v5, v1, Lt3/j0;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->c()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget-wide v3, v1, Lt3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    iget v1, v1, Lt3/j0;->c:I

    invoke-virtual {v2, v14, v1}, Lz2/b0$a;->q(Lz2/n;I)V

    return-void
.end method

.method W(Lt3/j0;JJ)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Ld3/c;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v14, p2

    new-instance v12, Lz2/n;

    iget-wide v3, v0, Lt3/j0;->a:J

    iget-object v5, v0, Lt3/j0;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->c()J

    move-result-wide v16

    move-object v2, v12

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    move-object v14, v12

    move-wide/from16 v12, v16

    invoke-direct/range {v2 .. v13}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget-wide v3, v0, Lt3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    iget-object v2, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    iget v3, v0, Lt3/j0;->c:I

    invoke-virtual {v2, v14, v3}, Lz2/b0$a;->t(Lz2/n;I)V

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld3/c;

    iget-object v3, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ld3/c;->e()I

    move-result v3

    :goto_0
    invoke-virtual {v2, v4}, Ld3/c;->d(I)Ld3/g;

    move-result-object v5

    iget-wide v5, v5, Ld3/g;->b:J

    move v7, v4

    :goto_1
    if-ge v7, v3, :cond_1

    iget-object v8, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v8, v7}, Ld3/c;->d(I)Ld3/g;

    move-result-object v8

    iget-wide v8, v8, Ld3/g;->b:J

    cmp-long v8, v8, v5

    if-gez v8, :cond_1

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    iget-boolean v5, v2, Ld3/c;->d:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_6

    sub-int v5, v3, v7

    invoke-virtual {v2}, Ld3/c;->e()I

    move-result v8

    if-le v5, v8, :cond_2

    const-string v5, "DashMediaSource"

    const-string v8, "Loaded out of sync manifest"

    :goto_2
    invoke-static {v5, v8}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    move v5, v6

    goto :goto_3

    :cond_2
    iget-wide v8, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0:J

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v8, v10

    if-eqz v5, :cond_3

    iget-wide v10, v2, Ld3/c;->h:J

    const-wide/16 v12, 0x3e8

    mul-long/2addr v10, v12

    cmp-long v5, v10, v8

    if-gtz v5, :cond_3

    const-string v5, "DashMediaSource"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Loaded stale dynamic manifest: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, v2, Ld3/c;->h:J

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, ", "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v9, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0:J

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_3
    move v5, v4

    :goto_3
    if-eqz v5, :cond_5

    iget v2, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Z:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Z:I

    iget-object v3, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget v0, v0, Lt3/j0;->c:I

    invoke-interface {v3, v0}, Lt3/g0;->d(I)I

    move-result v0

    if-ge v2, v0, :cond_4

    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->O()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->g0(J)V

    goto :goto_4

    :cond_4
    new-instance v0, Lc3/c;

    invoke-direct {v0}, Lc3/c;-><init>()V

    iput-object v0, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->P:Ljava/io/IOException;

    :goto_4
    return-void

    :cond_5
    iput v4, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Z:I

    :cond_6
    iput-object v2, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-boolean v5, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:Z

    iget-boolean v2, v2, Ld3/c;->d:Z

    and-int/2addr v2, v5

    iput-boolean v2, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->V:Z

    move-wide/from16 v8, p2

    sub-long v10, v8, p4

    iput-wide v10, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->W:J

    iput-wide v8, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->X:J

    iget-object v2, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->G:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v5, v0, Lt3/j0;->b:Lt3/p;

    iget-object v5, v5, Lt3/p;->a:Landroid/net/Uri;

    iget-object v8, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S:Landroid/net/Uri;

    if-ne v5, v8, :cond_7

    move v4, v6

    :cond_7
    if-eqz v4, :cond_9

    iget-object v4, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v4, v4, Ld3/c;->k:Landroid/net/Uri;

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lt3/j0;->f()Landroid/net/Uri;

    move-result-object v4

    :goto_5
    iput-object v4, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S:Landroid/net/Uri;

    :cond_9
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_b

    iget-object v0, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-boolean v2, v0, Ld3/c;->d:Z

    if-eqz v2, :cond_c

    iget-object v0, v0, Ld3/c;->i:Ld3/o;

    if-eqz v0, :cond_a

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->d0(Ld3/o;)V

    goto :goto_6

    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->S()V

    goto :goto_6

    :cond_b
    iget v0, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    add-int/2addr v0, v7

    iput v0, v1, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    :cond_c
    invoke-direct {v1, v6}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->c0(Z)V

    :goto_6
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method X(Lt3/j0;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Ld3/c;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lt3/h0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    new-instance v15, Lz2/n;

    iget-wide v4, v1, Lt3/j0;->a:J

    iget-object v6, v1, Lt3/j0;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->d()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->c()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v3, Lz2/q;

    iget v4, v1, Lt3/j0;->c:I

    invoke-direct {v3, v4}, Lz2/q;-><init>(I)V

    new-instance v4, Lt3/g0$c;

    move/from16 v5, p7

    invoke-direct {v4, v15, v3, v2, v5}, Lt3/g0$c;-><init>(Lz2/n;Lz2/q;Ljava/io/IOException;I)V

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    invoke-interface {v3, v4}, Lt3/g0;->a(Lt3/g0$c;)J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    if-nez v5, :cond_0

    sget-object v3, Lt3/h0;->g:Lt3/h0$c;

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    invoke-static {v5, v3, v4}, Lt3/h0;->h(ZJ)Lt3/h0$c;

    move-result-object v3

    :goto_0
    invoke-virtual {v3}, Lt3/h0$c;->c()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    iget v6, v1, Lt3/j0;->c:I

    invoke-virtual {v5, v15, v6, v2, v4}, Lz2/b0$a;->x(Lz2/n;ILjava/io/IOException;Z)V

    if-eqz v4, :cond_1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget-wide v4, v1, Lt3/j0;->a:J

    invoke-interface {v2, v4, v5}, Lt3/g0;->c(J)V

    :cond_1
    return-object v3
.end method

.method Y(Lt3/j0;JJ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Ljava/lang/Long;",
            ">;JJ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    new-instance v14, Lz2/n;

    iget-wide v3, v1, Lt3/j0;->a:J

    iget-object v5, v1, Lt3/j0;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->c()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget-wide v3, v1, Lt3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    iget v3, v1, Lt3/j0;->c:I

    invoke-virtual {v2, v14, v3}, Lz2/b0$a;->t(Lz2/n;I)V

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sub-long v1, v1, p2

    invoke-direct {p0, v1, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0(J)V

    return-void
.end method

.method Z(Lt3/j0;JJLjava/io/IOException;)Lt3/h0$c;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Ljava/lang/Long;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")",
            "Lt3/h0$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->D:Lz2/b0$a;

    new-instance v14, Lz2/n;

    iget-wide v5, v1, Lt3/j0;->a:J

    iget-object v7, v1, Lt3/j0;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->f()Landroid/net/Uri;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->d()Ljava/util/Map;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->c()J

    move-result-wide v15

    move-object v4, v14

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-object v0, v14

    move-wide v14, v15

    invoke-direct/range {v4 .. v15}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget v4, v1, Lt3/j0;->c:I

    const/4 v5, 0x1

    invoke-virtual {v3, v0, v4, v2, v5}, Lz2/b0$a;->x(Lz2/n;ILjava/io/IOException;Z)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget-wide v4, v1, Lt3/j0;->a:J

    invoke-interface {v3, v4, v5}, Lt3/g0;->c(J)V

    invoke-direct {v0, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->a0(Ljava/io/IOException;)V

    sget-object v1, Lt3/h0;->f:Lt3/h0$c;

    return-object v1
.end method

.method public a()Lx1/v1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->u:Lx1/v1;

    return-object v0
.end method

.method public b(Lz2/r;)V
    .locals 1

    check-cast p1, Lcom/google/android/exoplayer2/source/dash/b;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/dash/b;->I()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    iget p1, p1, Lcom/google/android/exoplayer2/source/dash/b;->n:I

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Lt3/i0;

    invoke-interface {v0}, Lt3/i0;->b()V

    return-void
.end method

.method public j(Lz2/u$b;Lt3/b;J)Lz2/r;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v16, p2

    iget-object v2, v1, Lz2/s;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget v3, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    sub-int v3, v2, v3

    move v6, v3

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    invoke-virtual {v2, v3}, Ld3/c;->d(I)Ld3/g;

    move-result-object v2

    iget-wide v4, v2, Ld3/g;->b:J

    invoke-virtual {v0, v1, v4, v5}, Lz2/a;->x(Lz2/u$b;J)Lz2/b0$a;

    move-result-object v12

    invoke-virtual/range {p0 .. p1}, Lz2/a;->t(Lz2/u$b;)Lb2/w$a;

    move-result-object v10

    new-instance v1, Lcom/google/android/exoplayer2/source/dash/b;

    move-object v2, v1

    iget v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->b0:I

    add-int/2addr v3, v4

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->U:Ld3/c;

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->B:Lc3/b;

    iget-object v7, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->x:Lcom/google/android/exoplayer2/source/dash/a$a;

    iget-object v8, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->O:Lt3/p0;

    iget-object v9, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->z:Lb2/y;

    iget-object v11, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->A:Lt3/g0;

    iget-wide v13, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->Y:J

    iget-object v15, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->L:Lt3/i0;

    move-object/from16 p1, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->y:Lz2/h;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->K:Lcom/google/android/exoplayer2/source/dash/e$b;

    move-object/from16 v18, v1

    invoke-virtual/range {p0 .. p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v19

    invoke-direct/range {v2 .. v19}, Lcom/google/android/exoplayer2/source/dash/b;-><init>(ILd3/c;Lc3/b;ILcom/google/android/exoplayer2/source/dash/a$a;Lt3/p0;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;JLt3/i0;Lt3/b;Lz2/h;Lcom/google/android/exoplayer2/source/dash/e$b;Ly1/t1;)V

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;->H:Landroid/util/SparseArray;

    move-object/from16 v2, p1

    iget v3, v2, Lcom/google/android/exoplayer2/source/dash/b;->n:I

    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v2
.end method
