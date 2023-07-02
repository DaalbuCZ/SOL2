.class public final Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;
.super Lz2/a;
.source ""

# interfaces
.implements Lt3/h0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lz2/a;",
        "Lt3/h0$b<",
        "Lt3/j0<",
        "Lh3/a;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final A:Lz2/h;

.field private final B:Lb2/y;

.field private final C:Lt3/g0;

.field private final D:J

.field private final E:Lz2/b0$a;

.field private final F:Lt3/j0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/j0$a<",
            "+",
            "Lh3/a;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/c;",
            ">;"
        }
    .end annotation
.end field

.field private H:Lt3/l;

.field private I:Lt3/h0;

.field private J:Lt3/i0;

.field private K:Lt3/p0;

.field private L:J

.field private M:Lh3/a;

.field private N:Landroid/os/Handler;

.field private final u:Z

.field private final v:Landroid/net/Uri;

.field private final w:Lx1/v1$h;

.field private final x:Lx1/v1;

.field private final y:Lt3/l$a;

.field private final z:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.smoothstreaming"

    invoke-static {v0}, Lx1/k1;->a(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lx1/v1;Lh3/a;Lt3/l$a;Lt3/j0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lz2/h;Lb2/y;Lt3/g0;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/v1;",
            "Lh3/a;",
            "Lt3/l$a;",
            "Lt3/j0$a<",
            "+",
            "Lh3/a;",
            ">;",
            "Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;",
            "Lz2/h;",
            "Lb2/y;",
            "Lt3/g0;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Lz2/a;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    iget-boolean v2, p2, Lh3/a;->d:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    invoke-static {v2}, Lu3/a;->f(Z)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:Lx1/v1;

    iget-object p1, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/v1$h;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->w:Lx1/v1$h;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-object v2, p1, Lx1/v1$h;->a:Landroid/net/Uri;

    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object p1, v3

    goto :goto_2

    :cond_2
    iget-object p1, p1, Lx1/v1$h;->a:Landroid/net/Uri;

    invoke-static {p1}, Lu3/n0;->B(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lt3/l$a;

    iput-object p4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->F:Lt3/j0$a;

    iput-object p5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->z:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iput-object p6, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Lz2/h;

    iput-object p7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lb2/y;

    iput-object p8, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    iput-wide p9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D:J

    invoke-virtual {p0, v3}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lz2/b0$a;

    if-eqz p2, :cond_3

    move v0, v1

    :cond_3
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->u:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Ljava/util/ArrayList;

    return-void
.end method

.method synthetic constructor <init>(Lx1/v1;Lh3/a;Lt3/l$a;Lt3/j0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lz2/h;Lb2/y;Lt3/g0;JLcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$a;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;-><init>(Lx1/v1;Lh3/a;Lt3/l$a;Lt3/j0$a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lz2/h;Lb2/y;Lt3/g0;J)V

    return-void
.end method

.method public static synthetic F(Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L()V

    return-void
.end method

.method private J()V
    .locals 30

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/exoplayer2/source/smoothstreaming/c;

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    invoke-virtual {v3, v4}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->w(Lh3/a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-object v4, v4, Lh3/a;->f:[Lh3/a$b;

    array-length v5, v4

    const-wide v6, 0x7fffffffffffffffL

    move v8, v1

    move-wide v14, v6

    :goto_1
    if-ge v8, v5, :cond_2

    aget-object v9, v4, v8

    iget v10, v9, Lh3/a$b;->k:I

    if-lez v10, :cond_1

    invoke-virtual {v9, v1}, Lh3/a$b;->e(I)J

    move-result-wide v10

    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    iget v10, v9, Lh3/a$b;->k:I

    add-int/lit8 v10, v10, -0x1

    invoke-virtual {v9, v10}, Lh3/a$b;->e(I)J

    move-result-wide v10

    iget v12, v9, Lh3/a$b;->k:I

    add-int/lit8 v12, v12, -0x1

    invoke-virtual {v9, v12}, Lh3/a$b;->c(I)J

    move-result-wide v12

    add-long/2addr v10, v12

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    cmp-long v1, v14, v6

    const-wide/16 v4, 0x0

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-boolean v1, v1, Lh3/a;->d:Z

    if-eqz v1, :cond_3

    move-wide v9, v6

    goto :goto_2

    :cond_3
    move-wide v9, v4

    :goto_2
    new-instance v1, Lz2/q0;

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-boolean v3, v2, Lh3/a;->d:Z

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:Lx1/v1;

    move-object v8, v1

    move/from16 v18, v3

    move/from16 v19, v3

    move-object/from16 v20, v2

    move-object/from16 v21, v4

    invoke-direct/range {v8 .. v21}, Lz2/q0;-><init>(JJJJZZZLjava/lang/Object;Lx1/v1;)V

    goto/16 :goto_4

    :cond_4
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-boolean v8, v1, Lh3/a;->d:Z

    if-eqz v8, :cond_7

    iget-wide v8, v1, Lh3/a;->h:J

    cmp-long v1, v8, v6

    if-eqz v1, :cond_5

    cmp-long v1, v8, v4

    if-lez v1, :cond_5

    sub-long v4, v2, v8

    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    :cond_5
    move-wide/from16 v21, v14

    sub-long v19, v2, v21

    iget-wide v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D:J

    invoke-static {v1, v2}, Lu3/n0;->B0(J)J

    move-result-wide v1

    sub-long v1, v19, v1

    const-wide/32 v3, 0x4c4b40

    cmp-long v5, v1, v3

    if-gez v5, :cond_6

    const-wide/16 v1, 0x2

    div-long v1, v19, v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :cond_6
    move-wide/from16 v23, v1

    new-instance v1, Lz2/q0;

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v25, 0x1

    const/16 v26, 0x1

    const/16 v27, 0x1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:Lx1/v1;

    move-object/from16 v16, v1

    move-object/from16 v28, v2

    move-object/from16 v29, v3

    invoke-direct/range {v16 .. v29}, Lz2/q0;-><init>(JJJJZZZLjava/lang/Object;Lx1/v1;)V

    goto :goto_4

    :cond_7
    iget-wide v4, v1, Lh3/a;->g:J

    cmp-long v1, v4, v6

    if-eqz v1, :cond_8

    move-wide v12, v4

    goto :goto_3

    :cond_8
    sub-long/2addr v2, v14

    move-wide v12, v2

    :goto_3
    new-instance v1, Lz2/q0;

    add-long v10, v14, v12

    const-wide/16 v16, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-object v3, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:Lx1/v1;

    move-object v9, v1

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    invoke-direct/range {v9 .. v22}, Lz2/q0;-><init>(JJJJZZZLjava/lang/Object;Lx1/v1;)V

    :goto_4
    invoke-virtual {v0, v1}, Lz2/a;->D(Lx1/y3;)V

    return-void
.end method

.method private K()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-boolean v0, v0, Lh3/a;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L:J

    const-wide/16 v2, 0x1388

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->N:Landroid/os/Handler;

    new-instance v3, Lg3/a;

    invoke-direct {v3, p0}, Lg3/a;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private L()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lt3/j0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Lt3/l;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->v:Landroid/net/Uri;

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->F:Lt3/j0$a;

    invoke-direct {v0, v1, v2, v3, v4}, Lt3/j0;-><init>(Lt3/l;Landroid/net/Uri;ILt3/j0$a;)V

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I:Lt3/h0;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    iget v3, v0, Lt3/j0;->c:I

    invoke-interface {v2, v3}, Lt3/g0;->d(I)I

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, Lt3/h0;->n(Lt3/h0$e;Lt3/h0$b;I)J

    move-result-wide v7

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lz2/b0$a;

    new-instance v2, Lz2/n;

    iget-wide v4, v0, Lt3/j0;->a:J

    iget-object v6, v0, Lt3/j0;->b:Lt3/p;

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lz2/n;-><init>(JLt3/p;J)V

    iget v0, v0, Lt3/j0;->c:I

    invoke-virtual {v1, v2, v0}, Lz2/b0$a;->z(Lz2/n;I)V

    return-void
.end method


# virtual methods
.method protected C(Lt3/p0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->K:Lt3/p0;

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lb2/y;

    invoke-interface {p1}, Lb2/y;->c()V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lb2/y;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0}, Lz2/a;->A()Ly1/t1;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lb2/y;->e(Landroid/os/Looper;Ly1/t1;)V

    iget-boolean p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->u:Z

    if-eqz p1, :cond_0

    new-instance p1, Lt3/i0$a;

    invoke-direct {p1}, Lt3/i0$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J:Lt3/i0;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->y:Lt3/l$a;

    invoke-interface {p1}, Lt3/l$a;->a()Lt3/l;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Lt3/l;

    new-instance p1, Lt3/h0;

    const-string v0, "SsMediaSource"

    invoke-direct {p1, v0}, Lt3/h0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I:Lt3/h0;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J:Lt3/i0;

    invoke-static {}, Lu3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->N:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L()V

    :goto_0
    return-void
.end method

.method protected E()V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->u:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H:Lt3/l;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L:J

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I:Lt3/h0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lt3/h0;->l()V

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I:Lt3/h0;

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->N:Landroid/os/Handler;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->N:Landroid/os/Handler;

    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lb2/y;

    invoke-interface {v0}, Lb2/y;->a()V

    return-void
.end method

.method public G(Lt3/j0;JJZ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Lh3/a;",
            ">;JJZ)V"
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

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    iget-wide v3, v1, Lt3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lz2/b0$a;

    iget v1, v1, Lt3/j0;->c:I

    invoke-virtual {v2, v14, v1}, Lz2/b0$a;->q(Lz2/n;I)V

    return-void
.end method

.method public H(Lt3/j0;JJ)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Lh3/a;",
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

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    iget-wide v3, v1, Lt3/j0;->a:J

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lz2/b0$a;

    iget v3, v1, Lt3/j0;->c:I

    invoke-virtual {v2, v14, v3}, Lz2/b0$a;->t(Lz2/n;I)V

    invoke-virtual/range {p1 .. p1}, Lt3/j0;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh3/a;

    iput-object v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    sub-long v1, p2, p4

    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->L:J

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J()V

    invoke-direct {p0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->K()V

    return-void
.end method

.method public I(Lt3/j0;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/j0<",
            "Lh3/a;",
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

    iget-object v4, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    new-instance v5, Lt3/g0$c;

    move/from16 v6, p7

    invoke-direct {v5, v15, v3, v2, v6}, Lt3/g0$c;-><init>(Lz2/n;Lz2/q;Ljava/io/IOException;I)V

    invoke-interface {v4, v5}, Lt3/g0;->a(Lt3/g0$c;)J

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

    iget-object v5, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->E:Lz2/b0$a;

    iget v6, v1, Lt3/j0;->c:I

    invoke-virtual {v5, v15, v6, v2, v4}, Lz2/b0$a;->x(Lz2/n;ILjava/io/IOException;Z)V

    if-eqz v4, :cond_1

    iget-object v2, v0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    iget-wide v4, v1, Lt3/j0;->a:J

    invoke-interface {v2, v4, v5}, Lt3/g0;->c(J)V

    :cond_1
    return-object v3
.end method

.method public a()Lx1/v1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->x:Lx1/v1;

    return-object v0
.end method

.method public b(Lz2/r;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/google/android/exoplayer2/source/smoothstreaming/c;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;->v()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J:Lt3/i0;

    invoke-interface {v0}, Lt3/i0;->b()V

    return-void
.end method

.method public j(Lz2/u$b;Lt3/b;J)Lz2/r;
    .locals 11

    invoke-virtual {p0, p1}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object v8

    invoke-virtual {p0, p1}, Lz2/a;->t(Lz2/u$b;)Lb2/w$a;

    move-result-object v6

    new-instance p1, Lcom/google/android/exoplayer2/source/smoothstreaming/c;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->M:Lh3/a;

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->z:Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->K:Lt3/p0;

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->A:Lz2/h;

    iget-object v5, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->B:Lb2/y;

    iget-object v7, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->C:Lt3/g0;

    iget-object v9, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->J:Lt3/i0;

    move-object v0, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/google/android/exoplayer2/source/smoothstreaming/c;-><init>(Lh3/a;Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lt3/p0;Lz2/h;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;Lt3/i0;Lt3/b;)V

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public bridge synthetic m(Lt3/h0$e;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 0

    check-cast p1, Lt3/j0;

    invoke-virtual/range {p0 .. p7}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->I(Lt3/j0;JJLjava/io/IOException;I)Lt3/h0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Lt3/h0$e;JJ)V
    .locals 0

    check-cast p1, Lt3/j0;

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->H(Lt3/j0;JJ)V

    return-void
.end method

.method public bridge synthetic u(Lt3/h0$e;JJZ)V
    .locals 0

    check-cast p1, Lt3/j0;

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->G(Lt3/j0;JJZ)V

    return-void
.end method
