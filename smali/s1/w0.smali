.class final Ls1/w0;
.super Ls1/e;
.source ""

# interfaces
.implements Ls1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/w0$b;,
        Ls1/w0$d;,
        Ls1/w0$c;,
        Ls1/w0$e;
    }
.end annotation


# instance fields
.field private final A:Ls1/d;

.field private final B:Ls1/g3;

.field private final C:Ls1/r3;

.field private final D:Ls1/s3;

.field private final E:J

.field private F:I

.field private G:Z

.field private H:I

.field private I:I

.field private J:Z

.field private K:I

.field private L:Ls1/d3;

.field private M:Lu2/p0;

.field private N:Z

.field private O:Ls1/p2$b;

.field private P:Ls1/z1;

.field private Q:Ls1/z1;

.field private R:Ls1/m1;

.field private S:Ls1/m1;

.field private T:Landroid/media/AudioTrack;

.field private U:Ljava/lang/Object;

.field private V:Landroid/view/Surface;

.field private W:Landroid/view/SurfaceHolder;

.field private X:Lr3/f;

.field private Y:Z

.field private Z:Landroid/view/TextureView;

.field private a0:I

.field final b:Ln3/d0;

.field private b0:I

.field final c:Ls1/p2$b;

.field private c0:I

.field private final d:Lp3/g;

.field private d0:I

.field private final e:Landroid/content/Context;

.field private e0:Lv1/e;

.field private final f:Ls1/p2;

.field private f0:Lv1/e;

.field private final g:[Ls1/y2;

.field private g0:I

.field private final h:Ln3/c0;

.field private h0:Lu1/e;

.field private final i:Lp3/n;

.field private i0:F

.field private final j:Ls1/i1$f;

.field private j0:Z

.field private final k:Ls1/i1;

.field private k0:Ld3/e;

.field private final l:Lp3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp3/q<",
            "Ls1/p2$d;",
            ">;"
        }
    .end annotation
.end field

.field private l0:Z

.field private final m:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ls1/r$a;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Z

.field private final n:Ls1/l3$b;

.field private n0:Lp3/c0;

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls1/w0$e;",
            ">;"
        }
    .end annotation
.end field

.field private o0:Z

.field private final p:Z

.field private p0:Z

.field private final q:Lu2/u$a;

.field private q0:Ls1/o;

.field private final r:Lt1/a;

.field private r0:Lq3/z;

.field private final s:Landroid/os/Looper;

.field private s0:Ls1/z1;

.field private final t:Lo3/f;

.field private t0:Ls1/m2;

.field private final u:J

.field private u0:I

.field private final v:J

.field private v0:I

.field private final w:Lp3/d;

.field private w0:J

.field private final x:Ls1/w0$c;

.field private final y:Ls1/w0$d;

.field private final z:Ls1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.exoplayer"

    invoke-static {v0}, Ls1/j1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ls1/r$b;Ls1/p2;)V
    .locals 38
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-direct/range {p0 .. p0}, Ls1/e;-><init>()V

    new-instance v2, Lp3/g;

    invoke-direct {v2}, Lp3/g;-><init>()V

    iput-object v2, v1, Ls1/w0;->d:Lp3/g;

    :try_start_0
    const-string v3, "ExoPlayerImpl"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Init "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "ExoPlayerLib/2.18.1"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lp3/m0;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lp3/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Ls1/r$b;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v1, Ls1/w0;->e:Landroid/content/Context;

    iget-object v4, v0, Ls1/r$b;->i:La5/f;

    iget-object v5, v0, Ls1/r$b;->b:Lp3/d;

    invoke-interface {v4, v5}, La5/f;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt1/a;

    iput-object v4, v1, Ls1/w0;->r:Lt1/a;

    iget-object v5, v0, Ls1/r$b;->k:Lp3/c0;

    iput-object v5, v1, Ls1/w0;->n0:Lp3/c0;

    iget-object v5, v0, Ls1/r$b;->l:Lu1/e;

    iput-object v5, v1, Ls1/w0;->h0:Lu1/e;

    iget v5, v0, Ls1/r$b;->q:I

    iput v5, v1, Ls1/w0;->a0:I

    iget v5, v0, Ls1/r$b;->r:I

    iput v5, v1, Ls1/w0;->b0:I

    iget-boolean v5, v0, Ls1/r$b;->p:Z

    iput-boolean v5, v1, Ls1/w0;->j0:Z

    iget-wide v5, v0, Ls1/r$b;->y:J

    iput-wide v5, v1, Ls1/w0;->E:J

    new-instance v15, Ls1/w0$c;

    const/4 v14, 0x0

    invoke-direct {v15, v1, v14}, Ls1/w0$c;-><init>(Ls1/w0;Ls1/w0$a;)V

    iput-object v15, v1, Ls1/w0;->x:Ls1/w0$c;

    new-instance v13, Ls1/w0$d;

    invoke-direct {v13, v14}, Ls1/w0$d;-><init>(Ls1/w0$a;)V

    iput-object v13, v1, Ls1/w0;->y:Ls1/w0$d;

    new-instance v6, Landroid/os/Handler;

    iget-object v5, v0, Ls1/r$b;->j:Landroid/os/Looper;

    invoke-direct {v6, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v5, v0, Ls1/r$b;->d:La5/o;

    invoke-interface {v5}, La5/o;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ls1/c3;

    move-object v8, v6

    move-object v9, v15

    move-object v10, v15

    move-object v11, v15

    move-object v12, v15

    invoke-interface/range {v7 .. v12}, Ls1/c3;->a(Landroid/os/Handler;Lq3/x;Lu1/s;Ld3/n;Lk2/f;)[Ls1/y2;

    move-result-object v7

    iput-object v7, v1, Ls1/w0;->g:[Ls1/y2;

    array-length v5, v7

    const/4 v12, 0x0

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v12

    :goto_0
    invoke-static {v5}, Lp3/a;->f(Z)V

    iget-object v5, v0, Ls1/r$b;->f:La5/o;

    invoke-interface {v5}, La5/o;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ln3/c0;

    iput-object v10, v1, Ls1/w0;->h:Ln3/c0;

    iget-object v5, v0, Ls1/r$b;->e:La5/o;

    invoke-interface {v5}, La5/o;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/u$a;

    iput-object v5, v1, Ls1/w0;->q:Lu2/u$a;

    iget-object v5, v0, Ls1/r$b;->h:La5/o;

    invoke-interface {v5}, La5/o;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lo3/f;

    iput-object v9, v1, Ls1/w0;->t:Lo3/f;

    iget-boolean v5, v0, Ls1/r$b;->s:Z

    iput-boolean v5, v1, Ls1/w0;->p:Z

    iget-object v5, v0, Ls1/r$b;->t:Ls1/d3;

    iput-object v5, v1, Ls1/w0;->L:Ls1/d3;

    move-object/from16 v16, v15

    iget-wide v14, v0, Ls1/r$b;->u:J

    iput-wide v14, v1, Ls1/w0;->u:J

    iget-wide v14, v0, Ls1/r$b;->v:J

    iput-wide v14, v1, Ls1/w0;->v:J

    iget-boolean v5, v0, Ls1/r$b;->z:Z

    iput-boolean v5, v1, Ls1/w0;->N:Z

    iget-object v15, v0, Ls1/r$b;->j:Landroid/os/Looper;

    iput-object v15, v1, Ls1/w0;->s:Landroid/os/Looper;

    iget-object v14, v0, Ls1/r$b;->b:Lp3/d;

    iput-object v14, v1, Ls1/w0;->w:Lp3/d;

    if-nez p2, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    iput-object v5, v1, Ls1/w0;->f:Ls1/p2;

    new-instance v8, Lp3/q;

    new-instance v11, Ls1/m0;

    invoke-direct {v11, v1}, Ls1/m0;-><init>(Ls1/w0;)V

    invoke-direct {v8, v15, v14, v11}, Lp3/q;-><init>(Landroid/os/Looper;Lp3/d;Lp3/q$b;)V

    iput-object v8, v1, Ls1/w0;->l:Lp3/q;

    new-instance v8, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v8, v1, Ls1/w0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v1, Ls1/w0;->o:Ljava/util/List;

    new-instance v8, Lu2/p0$a;

    invoke-direct {v8, v12}, Lu2/p0$a;-><init>(I)V

    iput-object v8, v1, Ls1/w0;->M:Lu2/p0;

    new-instance v8, Ln3/d0;

    array-length v11, v7

    new-array v11, v11, [Ls1/b3;

    array-length v12, v7

    new-array v12, v12, [Ln3/t;

    move-object/from16 v20, v6

    sget-object v6, Ls1/q3;->o:Ls1/q3;

    move-object/from16 v21, v9

    const/4 v9, 0x0

    invoke-direct {v8, v11, v12, v6, v9}, Ln3/d0;-><init>([Ls1/b3;[Ln3/t;Ls1/q3;Ljava/lang/Object;)V

    iput-object v8, v1, Ls1/w0;->b:Ln3/d0;

    new-instance v6, Ls1/l3$b;

    invoke-direct {v6}, Ls1/l3$b;-><init>()V

    iput-object v6, v1, Ls1/w0;->n:Ls1/l3$b;

    new-instance v6, Ls1/p2$b$a;

    invoke-direct {v6}, Ls1/p2$b$a;-><init>()V

    const/16 v12, 0x15

    new-array v9, v12, [I

    const/4 v11, 0x1

    const/16 v18, 0x0

    aput v11, v9, v18

    const/4 v12, 0x2

    aput v12, v9, v11

    move-object/from16 v23, v2

    const/4 v2, 0x3

    aput v2, v9, v12

    const/16 v19, 0xd

    aput v19, v9, v2

    const/16 v22, 0xe

    const/4 v2, 0x4

    aput v22, v9, v2

    const/16 v24, 0xf

    const/4 v2, 0x5

    aput v24, v9, v2

    const/16 v25, 0x10

    const/4 v2, 0x6

    aput v25, v9, v2

    const/16 v26, 0x11

    const/4 v2, 0x7

    aput v26, v9, v2

    const/16 v27, 0x12

    const/16 v2, 0x8

    aput v27, v9, v2

    const/16 v28, 0x13

    const/16 v2, 0x9

    aput v28, v9, v2

    const/16 v11, 0x1f

    const/16 v2, 0xa

    aput v11, v9, v2

    const/16 v30, 0xb

    const/16 v31, 0x14

    aput v31, v9, v30

    const/16 v30, 0xc

    const/16 v32, 0x1e

    aput v32, v9, v30

    const/16 v30, 0x15

    aput v30, v9, v19

    const/16 v19, 0x16

    aput v19, v9, v22

    const/16 v19, 0x17

    aput v19, v9, v24

    const/16 v19, 0x18

    aput v19, v9, v25

    const/16 v19, 0x19

    aput v19, v9, v26

    const/16 v19, 0x1a

    aput v19, v9, v27

    const/16 v19, 0x1b

    aput v19, v9, v28

    const/16 v19, 0x1c

    aput v19, v9, v31

    invoke-virtual {v6, v9}, Ls1/p2$b$a;->c([I)Ls1/p2$b$a;

    move-result-object v6

    const/16 v9, 0x1d

    invoke-virtual {v10}, Ln3/c0;->d()Z

    move-result v12

    invoke-virtual {v6, v9, v12}, Ls1/p2$b$a;->d(IZ)Ls1/p2$b$a;

    move-result-object v6

    invoke-virtual {v6}, Ls1/p2$b$a;->e()Ls1/p2$b;

    move-result-object v6

    iput-object v6, v1, Ls1/w0;->c:Ls1/p2$b;

    new-instance v9, Ls1/p2$b$a;

    invoke-direct {v9}, Ls1/p2$b$a;-><init>()V

    invoke-virtual {v9, v6}, Ls1/p2$b$a;->b(Ls1/p2$b;)Ls1/p2$b$a;

    move-result-object v6

    const/4 v9, 0x4

    invoke-virtual {v6, v9}, Ls1/p2$b$a;->a(I)Ls1/p2$b$a;

    move-result-object v6

    invoke-virtual {v6, v2}, Ls1/p2$b$a;->a(I)Ls1/p2$b$a;

    move-result-object v6

    invoke-virtual {v6}, Ls1/p2$b$a;->e()Ls1/p2$b;

    move-result-object v6

    iput-object v6, v1, Ls1/w0;->O:Ls1/p2$b;

    const/4 v12, 0x0

    invoke-interface {v14, v15, v12}, Lp3/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lp3/n;

    move-result-object v6

    iput-object v6, v1, Ls1/w0;->i:Lp3/n;

    new-instance v9, Ls1/n0;

    invoke-direct {v9, v1}, Ls1/n0;-><init>(Ls1/w0;)V

    iput-object v9, v1, Ls1/w0;->j:Ls1/i1$f;

    invoke-static {v8}, Ls1/m2;->j(Ln3/d0;)Ls1/m2;

    move-result-object v6

    iput-object v6, v1, Ls1/w0;->t0:Ls1/m2;

    invoke-interface {v4, v5, v15}, Lt1/a;->H(Ls1/p2;Landroid/os/Looper;)V

    sget v6, Lp3/m0;->a:I

    if-ge v6, v11, :cond_2

    new-instance v5, Lt1/t1;

    invoke-direct {v5}, Lt1/t1;-><init>()V

    goto :goto_2

    :cond_2
    iget-boolean v5, v0, Ls1/r$b;->A:Z

    invoke-static {v3, v1, v5}, Ls1/w0$b;->a(Landroid/content/Context;Ls1/w0;Z)Lt1/t1;

    move-result-object v5

    :goto_2
    move-object/from16 v22, v5

    new-instance v11, Ls1/i1;

    iget-object v5, v0, Ls1/r$b;->g:La5/o;

    invoke-interface {v5}, La5/o;->get()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Ls1/s1;

    iget v5, v1, Ls1/w0;->F:I

    iget-boolean v12, v1, Ls1/w0;->G:Z

    iget-object v2, v1, Ls1/w0;->L:Ls1/d3;

    move-object/from16 v25, v15

    iget-object v15, v0, Ls1/r$b;->w:Ls1/r1;

    move-object/from16 v27, v2

    move-object/from16 v26, v3

    iget-wide v2, v0, Ls1/r$b;->x:J

    iget-boolean v0, v1, Ls1/w0;->N:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move/from16 v28, v5

    move-object v5, v11

    move/from16 v34, v6

    move-object/from16 v33, v20

    move-object v6, v7

    move-object v7, v10

    move-object/from16 v31, v21

    move-object/from16 v21, v9

    move-object/from16 v9, v17

    move-object/from16 v35, v10

    move-object/from16 v10, v31

    move-object/from16 v29, v11

    const/4 v1, 0x1

    move/from16 v11, v28

    move/from16 v1, v18

    const/16 v17, 0x0

    move-object/from16 v36, v13

    move-object v13, v4

    move-object/from16 v20, v14

    move-object/from16 v30, v17

    move-object/from16 v14, v27

    move-object/from16 v37, v16

    move-wide/from16 v16, v2

    move/from16 v18, v0

    move-object/from16 v19, v25

    :try_start_1
    invoke-direct/range {v5 .. v22}, Ls1/i1;-><init>([Ls1/y2;Ln3/c0;Ln3/d0;Ls1/s1;Lo3/f;IZLt1/a;Ls1/d3;Ls1/r1;JZLandroid/os/Looper;Lp3/d;Ls1/i1$f;Lt1/t1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v2, p0

    move-object/from16 v0, v29

    :try_start_2
    iput-object v0, v2, Ls1/w0;->k:Ls1/i1;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Ls1/w0;->i0:F

    iput v1, v2, Ls1/w0;->F:I

    sget-object v3, Ls1/z1;->T:Ls1/z1;

    iput-object v3, v2, Ls1/w0;->P:Ls1/z1;

    iput-object v3, v2, Ls1/w0;->Q:Ls1/z1;

    iput-object v3, v2, Ls1/w0;->s0:Ls1/z1;

    const/4 v3, -0x1

    iput v3, v2, Ls1/w0;->u0:I

    move/from16 v3, v34

    const/16 v5, 0x15

    if-ge v3, v5, :cond_3

    invoke-direct {v2, v1}, Ls1/w0;->h1(I)I

    move-result v3

    :goto_3
    iput v3, v2, Ls1/w0;->g0:I

    goto :goto_4

    :cond_3
    invoke-static/range {v26 .. v26}, Lp3/m0;->F(Landroid/content/Context;)I

    move-result v3

    goto :goto_3

    :goto_4
    sget-object v3, Ld3/e;->o:Ld3/e;

    iput-object v3, v2, Ls1/w0;->k0:Ld3/e;

    const/4 v3, 0x1

    iput-boolean v3, v2, Ls1/w0;->l0:Z

    invoke-virtual {v2, v4}, Ls1/w0;->l(Ls1/p2$d;)V

    new-instance v3, Landroid/os/Handler;

    move-object/from16 v5, v25

    invoke-direct {v3, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v5, v31

    invoke-interface {v5, v3, v4}, Lo3/f;->i(Landroid/os/Handler;Lo3/f$a;)V

    move-object/from16 v3, v37

    invoke-virtual {v2, v3}, Ls1/w0;->O0(Ls1/r$a;)V

    move-object/from16 v4, p1

    iget-wide v5, v4, Ls1/r$b;->c:J

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-lez v7, :cond_4

    invoke-virtual {v0, v5, v6}, Ls1/i1;->v(J)V

    :cond_4
    new-instance v0, Ls1/b;

    iget-object v5, v4, Ls1/r$b;->a:Landroid/content/Context;

    move-object/from16 v6, v33

    invoke-direct {v0, v5, v6, v3}, Ls1/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls1/b$b;)V

    iput-object v0, v2, Ls1/w0;->z:Ls1/b;

    iget-boolean v5, v4, Ls1/r$b;->o:Z

    invoke-virtual {v0, v5}, Ls1/b;->b(Z)V

    new-instance v0, Ls1/d;

    iget-object v5, v4, Ls1/r$b;->a:Landroid/content/Context;

    invoke-direct {v0, v5, v6, v3}, Ls1/d;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls1/d$b;)V

    iput-object v0, v2, Ls1/w0;->A:Ls1/d;

    iget-boolean v5, v4, Ls1/r$b;->m:Z

    if-eqz v5, :cond_5

    iget-object v14, v2, Ls1/w0;->h0:Lu1/e;

    goto :goto_5

    :cond_5
    move-object/from16 v14, v30

    :goto_5
    invoke-virtual {v0, v14}, Ls1/d;->m(Lu1/e;)V

    new-instance v0, Ls1/g3;

    iget-object v5, v4, Ls1/r$b;->a:Landroid/content/Context;

    invoke-direct {v0, v5, v6, v3}, Ls1/g3;-><init>(Landroid/content/Context;Landroid/os/Handler;Ls1/g3$b;)V

    iput-object v0, v2, Ls1/w0;->B:Ls1/g3;

    iget-object v3, v2, Ls1/w0;->h0:Lu1/e;

    iget v3, v3, Lu1/e;->p:I

    invoke-static {v3}, Lp3/m0;->f0(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ls1/g3;->h(I)V

    new-instance v3, Ls1/r3;

    iget-object v5, v4, Ls1/r$b;->a:Landroid/content/Context;

    invoke-direct {v3, v5}, Ls1/r3;-><init>(Landroid/content/Context;)V

    iput-object v3, v2, Ls1/w0;->C:Ls1/r3;

    iget v5, v4, Ls1/r$b;->n:I

    if-eqz v5, :cond_6

    const/4 v12, 0x1

    goto :goto_6

    :cond_6
    move v12, v1

    :goto_6
    invoke-virtual {v3, v12}, Ls1/r3;->a(Z)V

    new-instance v3, Ls1/s3;

    iget-object v5, v4, Ls1/r$b;->a:Landroid/content/Context;

    invoke-direct {v3, v5}, Ls1/s3;-><init>(Landroid/content/Context;)V

    iput-object v3, v2, Ls1/w0;->D:Ls1/s3;

    iget v4, v4, Ls1/r$b;->n:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_7

    const/4 v12, 0x1

    goto :goto_7

    :cond_7
    move v12, v1

    :goto_7
    invoke-virtual {v3, v12}, Ls1/s3;->a(Z)V

    invoke-static {v0}, Ls1/w0;->R0(Ls1/g3;)Ls1/o;

    move-result-object v0

    iput-object v0, v2, Ls1/w0;->q0:Ls1/o;

    sget-object v0, Lq3/z;->r:Lq3/z;

    iput-object v0, v2, Ls1/w0;->r0:Lq3/z;

    iget-object v0, v2, Ls1/w0;->h0:Lu1/e;

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Ln3/c0;->h(Lu1/e;)V

    iget v0, v2, Ls1/w0;->g0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xa

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    iget v0, v2, Ls1/w0;->g0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v2, v5, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    iget-object v0, v2, Ls1/w0;->h0:Lu1/e;

    const/4 v1, 0x3

    invoke-direct {v2, v3, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    iget v0, v2, Ls1/w0;->a0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {v2, v5, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    iget v0, v2, Ls1/w0;->b0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {v2, v5, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    iget-boolean v0, v2, Ls1/w0;->j0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v1, 0x9

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    move-object/from16 v0, v36

    const/4 v1, 0x7

    invoke-direct {v2, v5, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    const/16 v1, 0x8

    const/4 v3, 0x6

    invoke-direct {v2, v3, v1, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual/range {v23 .. v23}, Lp3/g;->e()Z

    return-void

    :catchall_0
    move-exception v0

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object/from16 v2, p0

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v2, v1

    :goto_8
    iget-object v1, v2, Ls1/w0;->d:Lp3/g;

    invoke-virtual {v1}, Lp3/g;->e()Z

    throw v0
.end method

.method static synthetic A0(Ls1/w0;ZII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ls1/w0;->X1(ZII)V

    return-void
.end method

.method private static synthetic A1(Ls1/m2;Ls1/p2$d;)V
    .locals 1

    iget-boolean v0, p0, Ls1/m2;->l:Z

    iget p0, p0, Ls1/m2;->e:I

    invoke-interface {p1, v0, p0}, Ls1/p2$d;->B(ZI)V

    return-void
.end method

.method static synthetic B0(Ls1/w0;)Ls1/g3;
    .locals 0

    iget-object p0, p0, Ls1/w0;->B:Ls1/g3;

    return-object p0
.end method

.method private static synthetic B1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    iget p0, p0, Ls1/m2;->e:I

    invoke-interface {p1, p0}, Ls1/p2$d;->W(I)V

    return-void
.end method

.method static synthetic C0(Ls1/g3;)Ls1/o;
    .locals 0

    invoke-static {p0}, Ls1/w0;->R0(Ls1/g3;)Ls1/o;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic C1(Ls1/m2;ILs1/p2$d;)V
    .locals 0

    iget-boolean p0, p0, Ls1/m2;->l:Z

    invoke-interface {p2, p0, p1}, Ls1/p2$d;->X(ZI)V

    return-void
.end method

.method static synthetic D0(Ls1/w0;)Ls1/o;
    .locals 0

    iget-object p0, p0, Ls1/w0;->q0:Ls1/o;

    return-object p0
.end method

.method private static synthetic D1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    iget p0, p0, Ls1/m2;->m:I

    invoke-interface {p1, p0}, Ls1/p2$d;->A(I)V

    return-void
.end method

.method static synthetic E0(Ls1/w0;Ls1/o;)Ls1/o;
    .locals 0

    iput-object p1, p0, Ls1/w0;->q0:Ls1/o;

    return-object p1
.end method

.method private static synthetic E1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0}, Ls1/w0;->i1(Ls1/m2;)Z

    move-result p0

    invoke-interface {p1, p0}, Ls1/p2$d;->p0(Z)V

    return-void
.end method

.method static synthetic F0(Ls1/w0;)V
    .locals 0

    invoke-direct {p0}, Ls1/w0;->a2()V

    return-void
.end method

.method private static synthetic F1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    iget-object p0, p0, Ls1/m2;->n:Ls1/o2;

    invoke-interface {p1, p0}, Ls1/p2$d;->p(Ls1/o2;)V

    return-void
.end method

.method static synthetic G0(Ls1/w0;Lv1/e;)Lv1/e;
    .locals 0

    iput-object p1, p0, Ls1/w0;->e0:Lv1/e;

    return-object p1
.end method

.method private G1(Ls1/m2;Ls1/l3;Landroid/util/Pair;)Ls1/m2;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/m2;",
            "Ls1/l3;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Ls1/m2;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Ls1/l3;->u()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v4

    :goto_1
    invoke-static {v3}, Lp3/a;->a(Z)V

    move-object/from16 v3, p1

    iget-object v5, v3, Ls1/m2;->a:Ls1/l3;

    invoke-virtual/range {p1 .. p2}, Ls1/m2;->i(Ls1/l3;)Ls1/m2;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Ls1/l3;->u()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Ls1/m2;->k()Lu2/u$b;

    move-result-object v1

    iget-wide v2, v0, Ls1/w0;->w0:J

    invoke-static {v2, v3}, Lp3/m0;->A0(J)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    sget-object v16, Lu2/v0;->q:Lu2/v0;

    iget-object v2, v0, Ls1/w0;->b:Ln3/d0;

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object v18

    move-object v7, v1

    move-wide v8, v12

    move-wide v10, v12

    move-object/from16 v17, v2

    invoke-virtual/range {v6 .. v18}, Ls1/m2;->c(Lu2/u$b;JJJJLu2/v0;Ln3/d0;Ljava/util/List;)Ls1/m2;

    move-result-object v2

    invoke-virtual {v2, v1}, Ls1/m2;->b(Lu2/u$b;)Ls1/m2;

    move-result-object v1

    iget-wide v2, v1, Ls1/m2;->r:J

    iput-wide v2, v1, Ls1/m2;->p:J

    return-object v1

    :cond_2
    iget-object v3, v6, Ls1/m2;->b:Lu2/u$b;

    iget-object v3, v3, Lu2/s;->a:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v4

    if-eqz v7, :cond_3

    new-instance v8, Lu2/u$b;

    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v8, v9}, Lu2/u$b;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v8, v6, Ls1/m2;->b:Lu2/u$b;

    :goto_2
    move-object v14, v8

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, Ls1/w0;->k()J

    move-result-wide v8

    invoke-static {v8, v9}, Lp3/m0;->A0(J)J

    move-result-wide v8

    invoke-virtual {v5}, Ls1/l3;->u()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v5, v3, v2}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v2

    invoke-virtual {v2}, Ls1/l3$b;->q()J

    move-result-wide v2

    sub-long/2addr v8, v2

    :cond_4
    if-nez v7, :cond_b

    cmp-long v2, v12, v8

    if-gez v2, :cond_5

    goto/16 :goto_6

    :cond_5
    if-nez v2, :cond_9

    iget-object v2, v6, Ls1/m2;->k:Lu2/u$b;

    iget-object v2, v2, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    iget-object v3, v0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v2, v3}, Ls1/l3;->j(ILs1/l3$b;)Ls1/l3$b;

    move-result-object v2

    iget v2, v2, Ls1/l3$b;->p:I

    iget-object v3, v14, Lu2/s;->a:Ljava/lang/Object;

    iget-object v4, v0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v3, v4}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v3

    iget v3, v3, Ls1/l3$b;->p:I

    if-eq v2, v3, :cond_8

    :cond_6
    iget-object v2, v14, Lu2/s;->a:Ljava/lang/Object;

    iget-object v3, v0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v2, v3}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    invoke-virtual {v14}, Lu2/s;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Ls1/w0;->n:Ls1/l3$b;

    iget v2, v14, Lu2/s;->b:I

    iget v3, v14, Lu2/s;->c:I

    invoke-virtual {v1, v2, v3}, Ls1/l3$b;->e(II)J

    move-result-wide v1

    goto :goto_3

    :cond_7
    iget-object v1, v0, Ls1/w0;->n:Ls1/l3$b;

    iget-wide v1, v1, Ls1/l3$b;->q:J

    :goto_3
    iget-wide v8, v6, Ls1/m2;->r:J

    iget-wide v10, v6, Ls1/m2;->r:J

    iget-wide v12, v6, Ls1/m2;->d:J

    iget-wide v3, v6, Ls1/m2;->r:J

    sub-long v3, v1, v3

    iget-object v5, v6, Ls1/m2;->h:Lu2/v0;

    iget-object v15, v6, Ls1/m2;->i:Ln3/d0;

    iget-object v7, v6, Ls1/m2;->j:Ljava/util/List;

    move-object/from16 v18, v7

    move-object v7, v14

    move-object v0, v14

    move-object/from16 v17, v15

    move-wide v14, v3

    move-object/from16 v16, v5

    invoke-virtual/range {v6 .. v18}, Ls1/m2;->c(Lu2/u$b;JJJJLu2/v0;Ln3/d0;Ljava/util/List;)Ls1/m2;

    move-result-object v3

    invoke-virtual {v3, v0}, Ls1/m2;->b(Lu2/u$b;)Ls1/m2;

    move-result-object v6

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v0, p0

    goto/16 :goto_a

    :cond_9
    move-object v0, v14

    invoke-virtual {v0}, Lu2/s;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lp3/a;->f(Z)V

    const-wide/16 v1, 0x0

    iget-wide v3, v6, Ls1/m2;->q:J

    sub-long v7, v12, v8

    sub-long/2addr v3, v7

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    iget-wide v1, v6, Ls1/m2;->p:J

    iget-object v3, v6, Ls1/m2;->k:Lu2/u$b;

    iget-object v4, v6, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v3, v4}, Lu2/s;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    add-long v1, v12, v14

    :cond_a
    iget-object v3, v6, Ls1/m2;->h:Lu2/v0;

    iget-object v4, v6, Ls1/m2;->i:Ln3/d0;

    iget-object v5, v6, Ls1/m2;->j:Ljava/util/List;

    move-object v7, v0

    move-wide v8, v12

    move-wide v10, v12

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    invoke-virtual/range {v6 .. v18}, Ls1/m2;->c(Lu2/u$b;JJJJLu2/v0;Ln3/d0;Ljava/util/List;)Ls1/m2;

    move-result-object v6

    :goto_5
    iput-wide v1, v6, Ls1/m2;->p:J

    goto :goto_4

    :cond_b
    :goto_6
    move-object v0, v14

    invoke-virtual {v0}, Lu2/s;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lp3/a;->f(Z)V

    const-wide/16 v14, 0x0

    if-eqz v7, :cond_c

    sget-object v1, Lu2/v0;->q:Lu2/v0;

    goto :goto_7

    :cond_c
    iget-object v1, v6, Ls1/m2;->h:Lu2/v0;

    :goto_7
    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, p0

    if-eqz v7, :cond_d

    iget-object v2, v0, Ls1/w0;->b:Ln3/d0;

    goto :goto_8

    :cond_d
    iget-object v2, v6, Ls1/m2;->i:Ln3/d0;

    :goto_8
    move-object/from16 v17, v2

    if-eqz v7, :cond_e

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object v2

    goto :goto_9

    :cond_e
    iget-object v2, v6, Ls1/m2;->j:Ljava/util/List;

    :goto_9
    move-object/from16 v18, v2

    move-object v7, v1

    move-wide v8, v12

    move-wide v10, v12

    move-wide v2, v12

    invoke-virtual/range {v6 .. v18}, Ls1/m2;->c(Lu2/u$b;JJJJLu2/v0;Ln3/d0;Ljava/util/List;)Ls1/m2;

    move-result-object v4

    invoke-virtual {v4, v1}, Ls1/m2;->b(Lu2/u$b;)Ls1/m2;

    move-result-object v6

    iput-wide v2, v6, Ls1/m2;->p:J

    :goto_a
    return-object v6
.end method

.method static synthetic H0(Ls1/w0;)Lt1/a;
    .locals 0

    iget-object p0, p0, Ls1/w0;->r:Lt1/a;

    return-object p0
.end method

.method private H1(Ls1/l3;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/l3;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iput p2, p0, Ls1/w0;->u0:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const-wide/16 p3, 0x0

    :cond_0
    iput-wide p3, p0, Ls1/w0;->w0:J

    const/4 p1, 0x0

    iput p1, p0, Ls1/w0;->v0:I

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    invoke-virtual {p1}, Ls1/l3;->t()I

    move-result v0

    if-lt p2, v0, :cond_3

    :cond_2
    iget-boolean p2, p0, Ls1/w0;->G:Z

    invoke-virtual {p1, p2}, Ls1/l3;->e(Z)I

    move-result p2

    iget-object p3, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {p1, p2, p3}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object p3

    invoke-virtual {p3}, Ls1/l3$d;->d()J

    move-result-wide p3

    :cond_3
    move v3, p2

    iget-object v1, p0, Ls1/e;->a:Ls1/l3$d;

    iget-object v2, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-static {p3, p4}, Lp3/m0;->A0(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ls1/l3;->n(Ls1/l3$d;Ls1/l3$b;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method static synthetic I0(Ls1/w0;Ls1/m1;)Ls1/m1;
    .locals 0

    iput-object p1, p0, Ls1/w0;->R:Ls1/m1;

    return-object p1
.end method

.method private I1(II)V
    .locals 3

    iget v0, p0, Ls1/w0;->c0:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Ls1/w0;->d0:I

    if-eq p2, v0, :cond_1

    :cond_0
    iput p1, p0, Ls1/w0;->c0:I

    iput p2, p0, Ls1/w0;->d0:I

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    const/16 v1, 0x18

    new-instance v2, Ls1/p0;

    invoke-direct {v2, p1, p2}, Ls1/p0;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->k(ILp3/q$a;)V

    :cond_1
    return-void
.end method

.method static synthetic J0(Ls1/w0;Lq3/z;)Lq3/z;
    .locals 0

    iput-object p1, p0, Ls1/w0;->r0:Lq3/z;

    return-object p1
.end method

.method private J1(Ls1/l3;Lu2/u$b;J)J
    .locals 1

    iget-object p2, p2, Lu2/s;->a:Ljava/lang/Object;

    iget-object v0, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {p1, p2, v0}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object p1, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {p1}, Ls1/l3$b;->q()J

    move-result-wide p1

    add-long/2addr p3, p1

    return-wide p3
.end method

.method static synthetic K0(Ls1/w0;)Lp3/q;
    .locals 0

    iget-object p0, p0, Ls1/w0;->l:Lp3/q;

    return-object p0
.end method

.method private K1(II)Ls1/m2;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    if-lt p2, p1, :cond_0

    iget-object v2, p0, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gt p2, v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, Lp3/a;->a(Z)V

    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v2

    invoke-virtual {p0}, Ls1/w0;->F()Ls1/l3;

    move-result-object v3

    iget-object v4, p0, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v5, p0, Ls1/w0;->H:I

    add-int/2addr v5, v1

    iput v5, p0, Ls1/w0;->H:I

    invoke-direct {p0, p1, p2}, Ls1/w0;->L1(II)V

    invoke-direct {p0}, Ls1/w0;->S0()Ls1/l3;

    move-result-object v5

    iget-object v6, p0, Ls1/w0;->t0:Ls1/m2;

    invoke-direct {p0, v3, v5}, Ls1/w0;->a1(Ls1/l3;Ls1/l3;)Landroid/util/Pair;

    move-result-object v3

    invoke-direct {p0, v6, v5, v3}, Ls1/w0;->G1(Ls1/m2;Ls1/l3;Landroid/util/Pair;)Ls1/m2;

    move-result-object v3

    iget v5, v3, Ls1/m2;->e:I

    const/4 v6, 0x4

    if-eq v5, v1, :cond_1

    if-eq v5, v6, :cond_1

    if-ge p1, p2, :cond_1

    if-ne p2, v4, :cond_1

    iget-object v4, v3, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v4}, Ls1/l3;->t()I

    move-result v4

    if-lt v2, v4, :cond_1

    move v0, v1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v3, v6}, Ls1/m2;->g(I)Ls1/m2;

    move-result-object v3

    :cond_2
    iget-object v0, p0, Ls1/w0;->k:Ls1/i1;

    iget-object v1, p0, Ls1/w0;->M:Lu2/p0;

    invoke-virtual {v0, p1, p2, v1}, Ls1/i1;->o0(IILu2/p0;)V

    return-object v3
.end method

.method static synthetic L0(Ls1/w0;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ls1/w0;->U:Ljava/lang/Object;

    return-object p0
.end method

.method private L1(II)V
    .locals 2

    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-lt v0, p1, :cond_0

    iget-object v1, p0, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/w0;->M:Lu2/p0;

    invoke-interface {v0, p1, p2}, Lu2/p0;->b(II)Lu2/p0;

    move-result-object p1

    iput-object p1, p0, Ls1/w0;->M:Lu2/p0;

    return-void
.end method

.method static synthetic M0(Ls1/w0;Lv1/e;)Lv1/e;
    .locals 0

    iput-object p1, p0, Ls1/w0;->f0:Lv1/e;

    return-object p1
.end method

.method private M1()V
    .locals 3

    iget-object v0, p0, Ls1/w0;->X:Lr3/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/w0;->y:Ls1/w0$d;

    invoke-direct {p0, v0}, Ls1/w0;->T0(Ls1/t2$b;)Ls1/t2;

    move-result-object v0

    const/16 v2, 0x2710

    invoke-virtual {v0, v2}, Ls1/t2;->n(I)Ls1/t2;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/t2;->m(Ljava/lang/Object;)Ls1/t2;

    move-result-object v0

    invoke-virtual {v0}, Ls1/t2;->l()Ls1/t2;

    iget-object v0, p0, Ls1/w0;->X:Lr3/f;

    iget-object v2, p0, Ls1/w0;->x:Ls1/w0$c;

    invoke-virtual {v0, v2}, Lr3/f;->d(Lr3/f$a;)V

    iput-object v1, p0, Ls1/w0;->X:Lr3/f;

    :cond_0
    iget-object v0, p0, Ls1/w0;->Z:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    iget-object v2, p0, Ls1/w0;->x:Ls1/w0$c;

    if-eq v0, v2, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v2, "SurfaceTextureListener already unset or replaced."

    invoke-static {v0, v2}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ls1/w0;->Z:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :goto_0
    iput-object v1, p0, Ls1/w0;->Z:Landroid/view/TextureView;

    :cond_2
    iget-object v0, p0, Ls1/w0;->W:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_3

    iget-object v2, p0, Ls1/w0;->x:Ls1/w0$c;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iput-object v1, p0, Ls1/w0;->W:Landroid/view/SurfaceHolder;

    :cond_3
    return-void
.end method

.method private N1(IILjava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Ls1/w0;->g:[Ls1/y2;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ls1/y2;->k()I

    move-result v4

    if-ne v4, p1, :cond_0

    invoke-direct {p0, v3}, Ls1/w0;->T0(Ls1/t2$b;)Ls1/t2;

    move-result-object v3

    invoke-virtual {v3, p2}, Ls1/t2;->n(I)Ls1/t2;

    move-result-object v3

    invoke-virtual {v3, p3}, Ls1/t2;->m(Ljava/lang/Object;)Ls1/t2;

    move-result-object v3

    invoke-virtual {v3}, Ls1/t2;->l()Ls1/t2;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic O(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->v1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private O1()V
    .locals 3

    iget v0, p0, Ls1/w0;->i0:F

    iget-object v1, p0, Ls1/w0;->A:Ls1/d;

    invoke-virtual {v1}, Ls1/d;->g()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-direct {p0, v1, v2, v0}, Ls1/w0;->N1(IILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic P(Ls1/w0;Ls1/p2$d;Lp3/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/w0;->k1(Ls1/p2$d;Lp3/l;)V

    return-void
.end method

.method private P0(ILjava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lu2/u;",
            ">;)",
            "Ljava/util/List<",
            "Ls1/g2$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ls1/g2$c;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/u;

    iget-boolean v4, p0, Ls1/w0;->p:Z

    invoke-direct {v2, v3, v4}, Ls1/g2$c;-><init>(Lu2/u;Z)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Ls1/w0;->o:Ljava/util/List;

    add-int v4, v1, p1

    new-instance v5, Ls1/w0$e;

    iget-object v6, v2, Ls1/g2$c;->b:Ljava/lang/Object;

    iget-object v2, v2, Ls1/g2$c;->a:Lu2/p;

    invoke-virtual {v2}, Lu2/p;->Q()Ls1/l3;

    move-result-object v2

    invoke-direct {v5, v6, v2}, Ls1/w0$e;-><init>(Ljava/lang/Object;Ls1/l3;)V

    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ls1/w0;->M:Lu2/p0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2, p1, v1}, Lu2/p0;->d(II)Lu2/p0;

    move-result-object p1

    iput-object p1, p0, Ls1/w0;->M:Lu2/p0;

    return-object v0
.end method

.method public static synthetic Q(FLs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->q1(FLs1/p2$d;)V

    return-void
.end method

.method private Q0()Ls1/z1;
    .locals 3

    invoke-virtual {p0}, Ls1/w0;->F()Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Ls1/w0;->s0:Ls1/z1;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    iget-object v0, v0, Ls1/l3$d;->p:Ls1/u1;

    iget-object v1, p0, Ls1/w0;->s0:Ls1/z1;

    invoke-virtual {v1}, Ls1/z1;->b()Ls1/z1$b;

    move-result-object v1

    iget-object v0, v0, Ls1/u1;->r:Ls1/z1;

    invoke-virtual {v1, v0}, Ls1/z1$b;->H(Ls1/z1;)Ls1/z1$b;

    move-result-object v0

    invoke-virtual {v0}, Ls1/z1$b;->F()Ls1/z1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic R(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->B1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private static R0(Ls1/g3;)Ls1/o;
    .locals 3

    new-instance v0, Ls1/o;

    invoke-virtual {p0}, Ls1/g3;->d()I

    move-result v1

    invoke-virtual {p0}, Ls1/g3;->c()I

    move-result p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p0}, Ls1/o;-><init>(III)V

    return-object v0
.end method

.method private R1(Ljava/util/List;IJZ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu2/u;",
            ">;IJZ)V"
        }
    .end annotation

    move-object/from16 v10, p0

    move/from16 v0, p2

    invoke-direct/range {p0 .. p0}, Ls1/w0;->Z0()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Ls1/w0;->I()J

    move-result-wide v2

    iget v4, v10, Ls1/w0;->H:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v10, Ls1/w0;->H:I

    iget-object v4, v10, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_0

    iget-object v4, v10, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v10, v6, v4}, Ls1/w0;->L1(II)V

    :cond_0
    move-object/from16 v4, p1

    invoke-direct {v10, v6, v4}, Ls1/w0;->P0(ILjava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-direct/range {p0 .. p0}, Ls1/w0;->S0()Ls1/l3;

    move-result-object v4

    invoke-virtual {v4}, Ls1/l3;->u()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v4}, Ls1/l3;->t()I

    move-result v7

    if-ge v0, v7, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ls1/q1;

    move-wide/from16 v7, p3

    invoke-direct {v1, v4, v0, v7, v8}, Ls1/q1;-><init>(Ls1/l3;IJ)V

    throw v1

    :cond_2
    :goto_0
    move-wide/from16 v7, p3

    const/4 v9, -0x1

    if-eqz p5, :cond_3

    iget-boolean v0, v10, Ls1/w0;->G:Z

    invoke-virtual {v4, v0}, Ls1/l3;->e(Z)I

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move v13, v0

    goto :goto_1

    :cond_3
    if-ne v0, v9, :cond_4

    move v13, v1

    move-wide v1, v2

    goto :goto_1

    :cond_4
    move v13, v0

    move-wide v1, v7

    :goto_1
    iget-object v0, v10, Ls1/w0;->t0:Ls1/m2;

    invoke-direct {v10, v4, v13, v1, v2}, Ls1/w0;->H1(Ls1/l3;IJ)Landroid/util/Pair;

    move-result-object v3

    invoke-direct {v10, v0, v4, v3}, Ls1/w0;->G1(Ls1/m2;Ls1/l3;Landroid/util/Pair;)Ls1/m2;

    move-result-object v0

    iget v3, v0, Ls1/m2;->e:I

    if-eq v13, v9, :cond_7

    if-eq v3, v5, :cond_7

    invoke-virtual {v4}, Ls1/l3;->u()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v4}, Ls1/l3;->t()I

    move-result v3

    if-lt v13, v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x2

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v3, 0x4

    :cond_7
    :goto_3
    invoke-virtual {v0, v3}, Ls1/m2;->g(I)Ls1/m2;

    move-result-object v3

    iget-object v11, v10, Ls1/w0;->k:Ls1/i1;

    invoke-static {v1, v2}, Lp3/m0;->A0(J)J

    move-result-wide v14

    iget-object v0, v10, Ls1/w0;->M:Lu2/p0;

    move-object/from16 v16, v0

    invoke-virtual/range {v11 .. v16}, Ls1/i1;->N0(Ljava/util/List;IJLu2/p0;)V

    iget-object v0, v10, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    iget-object v1, v3, Ls1/m2;->b:Lu2/u$b;

    iget-object v1, v1, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v10, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    move v5, v6

    :goto_4
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    invoke-direct {v10, v3}, Ls1/w0;->Y0(Ls1/m2;)J

    move-result-wide v8

    const/4 v11, -0x1

    move-object/from16 v0, p0

    move-object v1, v3

    move v3, v4

    move v4, v6

    move v6, v7

    move-wide v7, v8

    move v9, v11

    invoke-direct/range {v0 .. v9}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    return-void
.end method

.method public static synthetic S(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->x1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private S0()Ls1/l3;
    .locals 3

    new-instance v0, Ls1/u2;

    iget-object v1, p0, Ls1/w0;->o:Ljava/util/List;

    iget-object v2, p0, Ls1/w0;->M:Lu2/p0;

    invoke-direct {v0, v1, v2}, Ls1/u2;-><init>(Ljava/util/Collection;Lu2/p0;)V

    return-object v0
.end method

.method private S1(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-direct {p0, v0}, Ls1/w0;->T1(Ljava/lang/Object;)V

    iput-object v0, p0, Ls1/w0;->V:Landroid/view/Surface;

    return-void
.end method

.method public static synthetic T(IILs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/w0;->j1(IILs1/p2$d;)V

    return-void
.end method

.method private T0(Ls1/t2$b;)Ls1/t2;
    .locals 9

    invoke-direct {p0}, Ls1/w0;->Z0()I

    move-result v0

    new-instance v8, Ls1/t2;

    iget-object v2, p0, Ls1/w0;->k:Ls1/i1;

    iget-object v1, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v4, v1, Ls1/m2;->a:Ls1/l3;

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v5, v0

    iget-object v6, p0, Ls1/w0;->w:Lp3/d;

    invoke-virtual {v2}, Ls1/i1;->C()Landroid/os/Looper;

    move-result-object v7

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Ls1/t2;-><init>(Ls1/t2$a;Ls1/t2$b;Ls1/l3;ILp3/d;Landroid/os/Looper;)V

    return-object v8
.end method

.method private T1(Ljava/lang/Object;)V
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ls1/w0;->g:[Ls1/y2;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_1

    aget-object v6, v1, v4

    invoke-interface {v6}, Ls1/y2;->k()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_0

    invoke-direct {p0, v6}, Ls1/w0;->T0(Ls1/t2$b;)Ls1/t2;

    move-result-object v6

    invoke-virtual {v6, v5}, Ls1/t2;->n(I)Ls1/t2;

    move-result-object v5

    invoke-virtual {v5, p1}, Ls1/t2;->m(Ljava/lang/Object;)Ls1/t2;

    move-result-object v5

    invoke-virtual {v5}, Ls1/t2;->l()Ls1/t2;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ls1/w0;->U:Ljava/lang/Object;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/t2;

    iget-wide v6, p0, Ls1/w0;->E:J

    invoke-virtual {v1, v6, v7}, Ls1/t2;->a(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    move v5, v3

    :catch_1
    iget-object v0, p0, Ls1/w0;->U:Ljava/lang/Object;

    iget-object v1, p0, Ls1/w0;->V:Landroid/view/Surface;

    if-ne v0, v1, :cond_4

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Ls1/w0;->V:Landroid/view/Surface;

    goto :goto_2

    :cond_3
    move v5, v3

    :cond_4
    :goto_2
    iput-object p1, p0, Ls1/w0;->U:Ljava/lang/Object;

    if-eqz v5, :cond_5

    new-instance p1, Ls1/k1;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ls1/k1;-><init>(I)V

    const/16 v0, 0x3eb

    invoke-static {p1, v0}, Ls1/q;->j(Ljava/lang/RuntimeException;I)Ls1/q;

    move-result-object p1

    invoke-direct {p0, v3, p1}, Ls1/w0;->V1(ZLs1/q;)V

    :cond_5
    return-void
.end method

.method public static synthetic U(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->D1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private U0(Ls1/m2;Ls1/m2;ZIZ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/m2;",
            "Ls1/m2;",
            "ZIZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p2, Ls1/m2;->a:Ls1/l3;

    iget-object v1, p1, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v1}, Ls1/l3;->u()Z

    move-result v2

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {v1}, Ls1/l3;->u()Z

    move-result v2

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v4

    const/4 v5, 0x3

    if-eq v2, v4, :cond_1

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    iget-object v2, p2, Ls1/m2;->b:Lu2/u$b;

    iget-object v2, v2, Lu2/s;->a:Ljava/lang/Object;

    iget-object v4, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v0, v2, v4}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v2

    iget v2, v2, Ls1/l3$b;->p:I

    iget-object v4, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v2, v4}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    iget-object v0, v0, Ls1/l3$d;->n:Ljava/lang/Object;

    iget-object v2, p1, Ls1/m2;->b:Lu2/u$b;

    iget-object v2, v2, Lu2/s;->a:Ljava/lang/Object;

    iget-object v4, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v2, v4}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v2

    iget v2, v2, Ls1/l3$b;->p:I

    iget-object v4, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v1, v2, v4}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v1

    iget-object v1, v1, Ls1/l3$d;->n:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 p1, 0x1

    if-eqz p3, :cond_2

    if-nez p4, :cond_2

    move v5, p1

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    if-ne p4, p1, :cond_3

    const/4 v5, 0x2

    goto :goto_0

    :cond_3
    if-eqz p5, :cond_4

    :goto_0
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_5
    if-eqz p3, :cond_6

    if-nez p4, :cond_6

    iget-object p2, p2, Ls1/m2;->b:Lu2/u$b;

    iget-wide p2, p2, Lu2/s;->d:J

    iget-object p1, p1, Ls1/m2;->b:Lu2/u$b;

    iget-wide p4, p1, Lu2/s;->d:J

    cmp-long p1, p2, p4

    if-gez p1, :cond_6

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_6
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic V(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->F1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private V1(ZLs1/q;)V
    .locals 12

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, v0, p1}, Ls1/w0;->K1(II)Ls1/m2;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ls1/m2;->e(Ls1/q;)Ls1/m2;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, p1, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {p1, v1}, Ls1/m2;->b(Lu2/u$b;)Ls1/m2;

    move-result-object p1

    iget-wide v1, p1, Ls1/m2;->r:J

    iput-wide v1, p1, Ls1/m2;->p:J

    const-wide/16 v1, 0x0

    iput-wide v1, p1, Ls1/m2;->q:J

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ls1/m2;->g(I)Ls1/m2;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Ls1/m2;->e(Ls1/q;)Ls1/m2;

    move-result-object p1

    :cond_1
    move-object v3, p1

    iget p1, p0, Ls1/w0;->H:I

    add-int/2addr p1, v1

    iput p1, p0, Ls1/w0;->H:I

    iget-object p1, p0, Ls1/w0;->k:Ls1/i1;

    invoke-virtual {p1}, Ls1/i1;->g1()V

    iget-object p1, v3, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {p1}, Ls1/l3;->u()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object p1, p1, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {p1}, Ls1/l3;->u()Z

    move-result p1

    if-nez p1, :cond_2

    move v7, v1

    goto :goto_1

    :cond_2
    move v7, v0

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x4

    invoke-direct {p0, v3}, Ls1/w0;->Y0(Ls1/m2;)J

    move-result-wide v9

    const/4 v11, -0x1

    move-object v2, p0

    invoke-direct/range {v2 .. v11}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    return-void
.end method

.method public static synthetic W(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->E1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private W1()V
    .locals 3

    iget-object v0, p0, Ls1/w0;->O:Ls1/p2$b;

    iget-object v1, p0, Ls1/w0;->f:Ls1/p2;

    iget-object v2, p0, Ls1/w0;->c:Ls1/p2$b;

    invoke-static {v1, v2}, Lp3/m0;->H(Ls1/p2;Ls1/p2$b;)Ls1/p2$b;

    move-result-object v1

    iput-object v1, p0, Ls1/w0;->O:Ls1/p2$b;

    invoke-virtual {v1, v0}, Ls1/p2$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    const/16 v1, 0xd

    new-instance v2, Ls1/r0;

    invoke-direct {v2, p0}, Ls1/r0;-><init>(Ls1/w0;)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->i(ILp3/q$a;)V

    :cond_0
    return-void
.end method

.method public static synthetic X(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->w1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private X1(ZII)V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    if-eq p2, v2, :cond_1

    move v1, v2

    :cond_1
    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-boolean v4, v0, Ls1/m2;->l:Z

    if-ne v4, v3, :cond_2

    iget v4, v0, Ls1/m2;->m:I

    if-ne v4, v1, :cond_2

    return-void

    :cond_2
    iget v4, p0, Ls1/w0;->H:I

    add-int/2addr v4, v2

    iput v4, p0, Ls1/w0;->H:I

    invoke-virtual {v0, v3, v1}, Ls1/m2;->d(ZI)Ls1/m2;

    move-result-object v2

    iget-object v0, p0, Ls1/w0;->k:Ls1/i1;

    invoke-virtual {v0, v3, v1}, Ls1/i1;->Q0(ZI)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, -0x1

    move-object v0, p0

    move-object v1, v2

    move v2, v3

    move v3, p3

    invoke-direct/range {v0 .. v9}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    return-void
.end method

.method public static synthetic Y(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->A1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private Y0(Ls1/m2;)J
    .locals 4

    iget-object v0, p1, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ls1/w0;->w0:J

    invoke-static {v0, v1}, Lp3/m0;->A0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p1, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v0}, Lu2/s;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Ls1/m2;->r:J

    return-wide v0

    :cond_1
    iget-object v0, p1, Ls1/m2;->a:Ls1/l3;

    iget-object v1, p1, Ls1/m2;->b:Lu2/u$b;

    iget-wide v2, p1, Ls1/m2;->r:J

    invoke-direct {p0, v0, v1, v2, v3}, Ls1/w0;->J1(Ls1/l3;Lu2/u$b;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private Y1(Ls1/m2;IIZZIJI)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p6

    iget-object v9, v6, Ls1/w0;->t0:Ls1/m2;

    iput-object v7, v6, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v9, Ls1/m2;->a:Ls1/l3;

    iget-object v1, v7, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0, v1}, Ls1/l3;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v10, 0x1

    xor-int/lit8 v5, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move/from16 v3, p5

    move/from16 v4, p6

    invoke-direct/range {v0 .. v5}, Ls1/w0;->U0(Ls1/m2;Ls1/m2;ZIZ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, v6, Ls1/w0;->P:Ls1/z1;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v4, v7, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v4}, Ls1/l3;->u()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v7, Ls1/m2;->a:Ls1/l3;

    iget-object v4, v7, Ls1/m2;->b:Lu2/u$b;

    iget-object v4, v4, Lu2/s;->a:Ljava/lang/Object;

    iget-object v5, v6, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v3, v4, v5}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v3

    iget v3, v3, Ls1/l3$b;->p:I

    iget-object v4, v7, Ls1/m2;->a:Ls1/l3;

    iget-object v5, v6, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v4, v3, v5}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v3

    iget-object v3, v3, Ls1/l3$d;->p:Ls1/u1;

    :cond_0
    sget-object v4, Ls1/z1;->T:Ls1/z1;

    iput-object v4, v6, Ls1/w0;->s0:Ls1/z1;

    :cond_1
    if-nez v1, :cond_2

    iget-object v4, v9, Ls1/m2;->j:Ljava/util/List;

    iget-object v5, v7, Ls1/m2;->j:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    iget-object v2, v6, Ls1/w0;->s0:Ls1/z1;

    invoke-virtual {v2}, Ls1/z1;->b()Ls1/z1$b;

    move-result-object v2

    iget-object v4, v7, Ls1/m2;->j:Ljava/util/List;

    invoke-virtual {v2, v4}, Ls1/z1$b;->I(Ljava/util/List;)Ls1/z1$b;

    move-result-object v2

    invoke-virtual {v2}, Ls1/z1$b;->F()Ls1/z1;

    move-result-object v2

    iput-object v2, v6, Ls1/w0;->s0:Ls1/z1;

    invoke-direct/range {p0 .. p0}, Ls1/w0;->Q0()Ls1/z1;

    move-result-object v2

    :cond_3
    iget-object v4, v6, Ls1/w0;->P:Ls1/z1;

    invoke-virtual {v2, v4}, Ls1/z1;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v10

    iput-object v2, v6, Ls1/w0;->P:Ls1/z1;

    iget-boolean v2, v9, Ls1/m2;->l:Z

    iget-boolean v5, v7, Ls1/m2;->l:Z

    const/4 v11, 0x0

    if-eq v2, v5, :cond_4

    move v2, v10

    goto :goto_0

    :cond_4
    move v2, v11

    :goto_0
    iget v5, v9, Ls1/m2;->e:I

    iget v12, v7, Ls1/m2;->e:I

    if-eq v5, v12, :cond_5

    move v5, v10

    goto :goto_1

    :cond_5
    move v5, v11

    :goto_1
    if-nez v5, :cond_6

    if-eqz v2, :cond_7

    :cond_6
    invoke-direct/range {p0 .. p0}, Ls1/w0;->a2()V

    :cond_7
    iget-boolean v12, v9, Ls1/m2;->g:Z

    iget-boolean v13, v7, Ls1/m2;->g:Z

    if-eq v12, v13, :cond_8

    move v12, v10

    goto :goto_2

    :cond_8
    move v12, v11

    :goto_2
    if-eqz v12, :cond_9

    invoke-direct {v6, v13}, Ls1/w0;->Z1(Z)V

    :cond_9
    iget-object v13, v9, Ls1/m2;->a:Ls1/l3;

    iget-object v14, v7, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v13, v14}, Ls1/l3;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    iget-object v13, v6, Ls1/w0;->l:Lp3/q;

    new-instance v14, Ls1/g0;

    move/from16 v15, p2

    invoke-direct {v14, v7, v15}, Ls1/g0;-><init>(Ls1/m2;I)V

    invoke-virtual {v13, v11, v14}, Lp3/q;->i(ILp3/q$a;)V

    :cond_a
    if-eqz p5, :cond_b

    move/from16 v11, p9

    invoke-direct {v6, v8, v9, v11}, Ls1/w0;->e1(ILs1/m2;I)Ls1/p2$e;

    move-result-object v11

    move-wide/from16 v13, p7

    invoke-direct {v6, v13, v14}, Ls1/w0;->d1(J)Ls1/p2$e;

    move-result-object v13

    iget-object v14, v6, Ls1/w0;->l:Lp3/q;

    const/16 v15, 0xb

    new-instance v10, Ls1/q0;

    invoke-direct {v10, v8, v11, v13}, Ls1/q0;-><init>(ILs1/p2$e;Ls1/p2$e;)V

    invoke-virtual {v14, v15, v10}, Lp3/q;->i(ILp3/q$a;)V

    :cond_b
    if-eqz v1, :cond_c

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    new-instance v8, Ls1/s0;

    invoke-direct {v8, v3, v0}, Ls1/s0;-><init>(Ls1/u1;I)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0, v8}, Lp3/q;->i(ILp3/q$a;)V

    :cond_c
    iget-object v0, v9, Ls1/m2;->f:Ls1/q;

    iget-object v1, v7, Ls1/m2;->f:Ls1/q;

    if-eq v0, v1, :cond_d

    iget-object v0, v6, Ls1/w0;->l:Lp3/q;

    new-instance v1, Ls1/u0;

    invoke-direct {v1, v7}, Ls1/u0;-><init>(Ls1/m2;)V

    const/16 v3, 0xa

    invoke-virtual {v0, v3, v1}, Lp3/q;->i(ILp3/q$a;)V

    iget-object v0, v7, Ls1/m2;->f:Ls1/q;

    if-eqz v0, :cond_d

    iget-object v0, v6, Ls1/w0;->l:Lp3/q;

    new-instance v1, Ls1/d0;

    invoke-direct {v1, v7}, Ls1/d0;-><init>(Ls1/m2;)V

    invoke-virtual {v0, v3, v1}, Lp3/q;->i(ILp3/q$a;)V

    :cond_d
    iget-object v0, v9, Ls1/m2;->i:Ln3/d0;

    iget-object v1, v7, Ls1/m2;->i:Ln3/d0;

    if-eq v0, v1, :cond_e

    iget-object v0, v6, Ls1/w0;->h:Ln3/c0;

    iget-object v1, v1, Ln3/d0;->e:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ln3/c0;->e(Ljava/lang/Object;)V

    iget-object v0, v6, Ls1/w0;->l:Lp3/q;

    const/4 v1, 0x2

    new-instance v3, Ls1/z;

    invoke-direct {v3, v7}, Ls1/z;-><init>(Ls1/m2;)V

    invoke-virtual {v0, v1, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_e
    if-eqz v4, :cond_f

    iget-object v0, v6, Ls1/w0;->P:Ls1/z1;

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    const/16 v3, 0xe

    new-instance v4, Ls1/t0;

    invoke-direct {v4, v0}, Ls1/t0;-><init>(Ls1/z1;)V

    invoke-virtual {v1, v3, v4}, Lp3/q;->i(ILp3/q$a;)V

    :cond_f
    if-eqz v12, :cond_10

    iget-object v0, v6, Ls1/w0;->l:Lp3/q;

    const/4 v1, 0x3

    new-instance v3, Ls1/f0;

    invoke-direct {v3, v7}, Ls1/f0;-><init>(Ls1/m2;)V

    invoke-virtual {v0, v1, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_10
    const/4 v0, -0x1

    if-nez v5, :cond_11

    if-eqz v2, :cond_12

    :cond_11
    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    new-instance v3, Ls1/e0;

    invoke-direct {v3, v7}, Ls1/e0;-><init>(Ls1/m2;)V

    invoke-virtual {v1, v0, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_12
    if-eqz v5, :cond_13

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    const/4 v3, 0x4

    new-instance v4, Ls1/v0;

    invoke-direct {v4, v7}, Ls1/v0;-><init>(Ls1/m2;)V

    invoke-virtual {v1, v3, v4}, Lp3/q;->i(ILp3/q$a;)V

    :cond_13
    if-eqz v2, :cond_14

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    const/4 v2, 0x5

    new-instance v3, Ls1/h0;

    move/from16 v4, p3

    invoke-direct {v3, v7, v4}, Ls1/h0;-><init>(Ls1/m2;I)V

    invoke-virtual {v1, v2, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_14
    iget v1, v9, Ls1/m2;->m:I

    iget v2, v7, Ls1/m2;->m:I

    if-eq v1, v2, :cond_15

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    const/4 v2, 0x6

    new-instance v3, Ls1/a0;

    invoke-direct {v3, v7}, Ls1/a0;-><init>(Ls1/m2;)V

    invoke-virtual {v1, v2, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_15
    invoke-static {v9}, Ls1/w0;->i1(Ls1/m2;)Z

    move-result v1

    invoke-static/range {p1 .. p1}, Ls1/w0;->i1(Ls1/m2;)Z

    move-result v2

    if-eq v1, v2, :cond_16

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    const/4 v2, 0x7

    new-instance v3, Ls1/c0;

    invoke-direct {v3, v7}, Ls1/c0;-><init>(Ls1/m2;)V

    invoke-virtual {v1, v2, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_16
    iget-object v1, v9, Ls1/m2;->n:Ls1/o2;

    iget-object v2, v7, Ls1/m2;->n:Ls1/o2;

    invoke-virtual {v1, v2}, Ls1/o2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    const/16 v2, 0xc

    new-instance v3, Ls1/b0;

    invoke-direct {v3, v7}, Ls1/b0;-><init>(Ls1/m2;)V

    invoke-virtual {v1, v2, v3}, Lp3/q;->i(ILp3/q$a;)V

    :cond_17
    if-eqz p4, :cond_18

    iget-object v1, v6, Ls1/w0;->l:Lp3/q;

    sget-object v2, Ls1/l0;->a:Ls1/l0;

    invoke-virtual {v1, v0, v2}, Lp3/q;->i(ILp3/q$a;)V

    :cond_18
    invoke-direct/range {p0 .. p0}, Ls1/w0;->W1()V

    iget-object v0, v6, Ls1/w0;->l:Lp3/q;

    invoke-virtual {v0}, Lp3/q;->f()V

    iget-boolean v0, v9, Ls1/m2;->o:Z

    iget-boolean v1, v7, Ls1/m2;->o:Z

    if-eq v0, v1, :cond_19

    iget-object v0, v6, Ls1/w0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/r$a;

    iget-boolean v2, v7, Ls1/m2;->o:Z

    invoke-interface {v1, v2}, Ls1/r$a;->E(Z)V

    goto :goto_3

    :cond_19
    return-void
.end method

.method public static synthetic Z(Ls1/w0;Ls1/i1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0;->m1(Ls1/i1$e;)V

    return-void
.end method

.method private Z0()I
    .locals 3

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ls1/w0;->u0:I

    return v0

    :cond_0
    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->a:Ls1/l3;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v0, v2}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v0

    iget v0, v0, Ls1/l3$b;->p:I

    return v0
.end method

.method private Z1(Z)V
    .locals 3

    iget-object v0, p0, Ls1/w0;->n0:Lp3/c0;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Ls1/w0;->o0:Z

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp3/c0;->a(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/w0;->o0:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Ls1/w0;->o0:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0, v1}, Lp3/c0;->b(I)V

    iput-boolean v1, p0, Ls1/w0;->o0:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic a0(ILs1/p2$e;Ls1/p2$e;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls1/w0;->t1(ILs1/p2$e;Ls1/p2$e;Ls1/p2$d;)V

    return-void
.end method

.method private a1(Ls1/l3;Ls1/l3;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/l3;",
            "Ls1/l3;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ls1/w0;->k()J

    move-result-wide v0

    invoke-virtual {p1}, Ls1/l3;->u()Z

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, -0x1

    if-nez v2, :cond_3

    invoke-virtual {p2}, Ls1/l3;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v9

    iget-object v7, p0, Ls1/e;->a:Ls1/l3$d;

    iget-object v8, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-static {v0, v1}, Lp3/m0;->A0(J)J

    move-result-wide v10

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Ls1/l3;->n(Ls1/l3$d;Ls1/l3$b;IJ)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v10, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p2, v10}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v5, :cond_1

    return-object v0

    :cond_1
    iget-object v6, p0, Ls1/e;->a:Ls1/l3$d;

    iget-object v7, p0, Ls1/w0;->n:Ls1/l3$b;

    iget v8, p0, Ls1/w0;->F:I

    iget-boolean v9, p0, Ls1/w0;->G:Z

    move-object v11, p1

    move-object v12, p2

    invoke-static/range {v6 .. v12}, Ls1/i1;->z0(Ls1/l3$d;Ls1/l3$b;IZLjava/lang/Object;Ls1/l3;Ls1/l3;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {p2, p1, v0}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object p1, p0, Ls1/w0;->n:Ls1/l3$b;

    iget p1, p1, Ls1/l3$b;->p:I

    iget-object v0, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {p2, p1, v0}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3$d;->d()J

    move-result-wide v0

    invoke-direct {p0, p2, p1, v0, v1}, Ls1/w0;->H1(Ls1/l3;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, p2, v5, v3, v4}, Ls1/w0;->H1(Ls1/l3;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Ls1/l3;->u()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Ls1/l3;->u()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-direct {p0}, Ls1/w0;->Z0()I

    move-result v5

    :goto_2
    if-eqz p1, :cond_6

    move-wide v0, v3

    :cond_6
    invoke-direct {p0, p2, v5, v0, v1}, Ls1/w0;->H1(Ls1/l3;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private a2()V
    .locals 5

    invoke-virtual {p0}, Ls1/w0;->r()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Ls1/w0;->V0()Z

    move-result v0

    iget-object v3, p0, Ls1/w0;->C:Ls1/r3;

    invoke-virtual {p0}, Ls1/w0;->p()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-virtual {v3, v1}, Ls1/r3;->b(Z)V

    iget-object v0, p0, Ls1/w0;->D:Ls1/s3;

    invoke-virtual {p0}, Ls1/w0;->p()Z

    move-result v1

    invoke-virtual {v0, v1}, Ls1/s3;->b(Z)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Ls1/w0;->C:Ls1/r3;

    invoke-virtual {v0, v2}, Ls1/r3;->b(Z)V

    iget-object v0, p0, Ls1/w0;->D:Ls1/s3;

    invoke-virtual {v0, v2}, Ls1/s3;->b(Z)V

    :goto_2
    return-void
.end method

.method public static synthetic b0(Lu1/e;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->o1(Lu1/e;Ls1/p2$d;)V

    return-void
.end method

.method private static b1(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method private b2()V
    .locals 4

    iget-object v0, p0, Ls1/w0;->d:Lp3/g;

    invoke-virtual {v0}, Lp3/g;->b()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Ls1/w0;->W0()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0}, Ls1/w0;->W0()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    invoke-static {v1, v0}, Lp3/m0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Ls1/w0;->l0:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ls1/w0;->m0:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v3, "ExoPlayerImpl"

    invoke-static {v3, v0, v1}, Lp3/r;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v2, p0, Ls1/w0;->m0:Z

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic c0(Ls1/z1;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->y1(Ls1/z1;Ls1/p2$d;)V

    return-void
.end method

.method public static synthetic d0(Ls1/w0;Ls1/p2$d;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0;->r1(Ls1/p2$d;)V

    return-void
.end method

.method private d1(J)Ls1/p2$e;
    .locals 13

    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v2

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->b:Lu2/u$b;

    iget-object v1, v1, Lu2/s;->a:Ljava/lang/Object;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    iget-object v3, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v0, v1, v3}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0, v1}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v3, v3, Ls1/m2;->a:Ls1/l3;

    iget-object v4, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v3, v2, v4}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v3

    iget-object v3, v3, Ls1/l3$d;->n:Ljava/lang/Object;

    iget-object v4, p0, Ls1/e;->a:Ls1/l3$d;

    iget-object v4, v4, Ls1/l3$d;->p:Ls1/u1;

    move v5, v0

    move-object v12, v4

    move-object v4, v1

    move-object v1, v3

    move-object v3, v12

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    move v5, v0

    move-object v3, v1

    move-object v4, v3

    :goto_0
    invoke-static {p1, p2}, Lp3/m0;->X0(J)J

    move-result-wide v6

    new-instance p1, Ls1/p2$e;

    iget-object p2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object p2, p2, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {p2}, Lu2/s;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Ls1/w0;->t0:Ls1/m2;

    invoke-static {p2}, Ls1/w0;->f1(Ls1/m2;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lp3/m0;->X0(J)J

    move-result-wide v8

    goto :goto_1

    :cond_1
    move-wide v8, v6

    :goto_1
    iget-object p2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object p2, p2, Ls1/m2;->b:Lu2/u$b;

    iget v10, p2, Lu2/s;->b:I

    iget v11, p2, Lu2/s;->c:I

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Ls1/p2$e;-><init>(Ljava/lang/Object;ILs1/u1;Ljava/lang/Object;IJJII)V

    return-object p1
.end method

.method public static synthetic e0(ILs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->p1(ILs1/p2$d;)V

    return-void
.end method

.method private e1(ILs1/m2;I)Ls1/p2$e;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    new-instance v2, Ls1/l3$b;

    invoke-direct {v2}, Ls1/l3$b;-><init>()V

    iget-object v3, v1, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v3}, Ls1/l3;->u()Z

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    iget-object v3, v1, Ls1/m2;->b:Lu2/u$b;

    iget-object v5, v3, Lu2/s;->a:Ljava/lang/Object;

    iget-object v3, v1, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v3, v5, v2}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget v3, v2, Ls1/l3$b;->p:I

    iget-object v6, v1, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v6, v5}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result v6

    iget-object v7, v1, Ls1/m2;->a:Ls1/l3;

    iget-object v8, v0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v7, v3, v8}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v7

    iget-object v7, v7, Ls1/l3$d;->n:Ljava/lang/Object;

    iget-object v8, v0, Ls1/e;->a:Ls1/l3$d;

    iget-object v8, v8, Ls1/l3$d;->p:Ls1/u1;

    move v11, v3

    move-object v13, v5

    move v14, v6

    move-object v10, v7

    move-object v12, v8

    goto :goto_0

    :cond_0
    move/from16 v11, p3

    move v14, v4

    move-object v10, v5

    move-object v12, v10

    move-object v13, v12

    :goto_0
    iget-object v3, v1, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v3}, Lu2/s;->b()Z

    move-result v3

    if-nez p1, :cond_3

    if-eqz v3, :cond_1

    iget-object v3, v1, Ls1/m2;->b:Lu2/u$b;

    iget v4, v3, Lu2/s;->b:I

    iget v3, v3, Lu2/s;->c:I

    invoke-virtual {v2, v4, v3}, Ls1/l3$b;->e(II)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    iget-object v3, v1, Ls1/m2;->b:Lu2/u$b;

    iget v3, v3, Lu2/s;->e:I

    if-eq v3, v4, :cond_2

    iget-object v2, v0, Ls1/w0;->t0:Ls1/m2;

    invoke-static {v2}, Ls1/w0;->f1(Ls1/m2;)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    iget-wide v3, v2, Ls1/l3$b;->r:J

    iget-wide v5, v2, Ls1/l3$b;->q:J

    add-long v2, v3, v5

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    iget-wide v2, v1, Ls1/m2;->r:J

    :goto_1
    invoke-static/range {p2 .. p2}, Ls1/w0;->f1(Ls1/m2;)J

    move-result-wide v4

    goto :goto_3

    :cond_4
    iget-wide v2, v2, Ls1/l3$b;->r:J

    iget-wide v4, v1, Ls1/m2;->r:J

    add-long/2addr v2, v4

    :goto_2
    move-wide v4, v2

    :goto_3
    new-instance v6, Ls1/p2$e;

    invoke-static {v2, v3}, Lp3/m0;->X0(J)J

    move-result-wide v15

    invoke-static {v4, v5}, Lp3/m0;->X0(J)J

    move-result-wide v17

    iget-object v1, v1, Ls1/m2;->b:Lu2/u$b;

    iget v2, v1, Lu2/s;->b:I

    iget v1, v1, Lu2/s;->c:I

    move-object v9, v6

    move/from16 v19, v2

    move/from16 v20, v1

    invoke-direct/range {v9 .. v20}, Ls1/p2$e;-><init>(Ljava/lang/Object;ILs1/u1;Ljava/lang/Object;IJJII)V

    return-object v6
.end method

.method public static synthetic f0(Ls1/u1;ILs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/w0;->u1(Ls1/u1;ILs1/p2$d;)V

    return-void
.end method

.method private static f1(Ls1/m2;)J
    .locals 6

    new-instance v0, Ls1/l3$d;

    invoke-direct {v0}, Ls1/l3$d;-><init>()V

    new-instance v1, Ls1/l3$b;

    invoke-direct {v1}, Ls1/l3$b;-><init>()V

    iget-object v2, p0, Ls1/m2;->a:Ls1/l3;

    iget-object v3, p0, Ls1/m2;->b:Lu2/u$b;

    iget-object v3, v3, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-wide v2, p0, Ls1/m2;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object p0, p0, Ls1/m2;->a:Ls1/l3;

    iget v1, v1, Ls1/l3$b;->p:I

    invoke-virtual {p0, v1, v0}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object p0

    invoke-virtual {p0}, Ls1/l3$d;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ls1/l3$b;->q()J

    move-result-wide v0

    iget-wide v2, p0, Ls1/m2;->c:J

    add-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public static synthetic g0(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->z1(Ls1/m2;Ls1/p2$d;)V

    return-void
.end method

.method private g1(Ls1/i1$e;)V
    .locals 12

    iget v1, p0, Ls1/w0;->H:I

    iget v2, p1, Ls1/i1$e;->c:I

    sub-int/2addr v1, v2

    iput v1, p0, Ls1/w0;->H:I

    iget-boolean v2, p1, Ls1/i1$e;->d:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget v2, p1, Ls1/i1$e;->e:I

    iput v2, p0, Ls1/w0;->I:I

    iput-boolean v3, p0, Ls1/w0;->J:Z

    :cond_0
    iget-boolean v2, p1, Ls1/i1$e;->f:Z

    if-eqz v2, :cond_1

    iget v2, p1, Ls1/i1$e;->g:I

    iput v2, p0, Ls1/w0;->K:I

    :cond_1
    if-nez v1, :cond_b

    iget-object v1, p1, Ls1/i1$e;->b:Ls1/m2;

    iget-object v1, v1, Ls1/m2;->a:Ls1/l3;

    iget-object v2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v2, v2, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v2}, Ls1/l3;->u()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ls1/l3;->u()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    iput v2, p0, Ls1/w0;->u0:I

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Ls1/w0;->w0:J

    iput v4, p0, Ls1/w0;->v0:I

    :cond_2
    invoke-virtual {v1}, Ls1/l3;->u()Z

    move-result v2

    if-nez v2, :cond_4

    move-object v2, v1

    check-cast v2, Ls1/u2;

    invoke-virtual {v2}, Ls1/u2;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v5, v6, :cond_3

    move v5, v3

    goto :goto_0

    :cond_3
    move v5, v4

    :goto_0
    invoke-static {v5}, Lp3/a;->f(Z)V

    move v5, v4

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Ls1/w0;->o:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls1/w0$e;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls1/l3;

    invoke-static {v6, v7}, Ls1/w0$e;->c(Ls1/w0$e;Ls1/l3;)Ls1/l3;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    iget-boolean v2, p0, Ls1/w0;->J:Z

    if-eqz v2, :cond_a

    iget-object v2, p1, Ls1/i1$e;->b:Ls1/m2;

    iget-object v2, v2, Ls1/m2;->b:Lu2/u$b;

    iget-object v7, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v7, v7, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v2, v7}, Lu2/s;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Ls1/i1$e;->b:Ls1/m2;

    iget-wide v7, v2, Ls1/m2;->d:J

    iget-object v2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-wide v10, v2, Ls1/m2;->r:J

    cmp-long v2, v7, v10

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :cond_6
    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v1}, Ls1/l3;->u()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Ls1/i1$e;->b:Ls1/m2;

    iget-object v2, v2, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v2}, Lu2/s;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    iget-object v2, p1, Ls1/i1$e;->b:Ls1/m2;

    iget-object v5, v2, Ls1/m2;->b:Lu2/u$b;

    iget-wide v6, v2, Ls1/m2;->d:J

    invoke-direct {p0, v1, v5, v6, v7}, Ls1/w0;->J1(Ls1/l3;Lu2/u$b;J)J

    move-result-wide v1

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v1, p1, Ls1/i1$e;->b:Ls1/m2;

    iget-wide v1, v1, Ls1/m2;->d:J

    :goto_4
    move-wide v7, v1

    goto :goto_5

    :cond_9
    move-wide v7, v5

    :goto_5
    move v5, v3

    goto :goto_6

    :cond_a
    move-wide v7, v5

    move v5, v4

    :goto_6
    iput-boolean v4, p0, Ls1/w0;->J:Z

    iget-object v1, p1, Ls1/i1$e;->b:Ls1/m2;

    const/4 v2, 0x1

    iget v3, p0, Ls1/w0;->K:I

    const/4 v4, 0x0

    iget v6, p0, Ls1/w0;->I:I

    const/4 v9, -0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    :cond_b
    return-void
.end method

.method public static synthetic h0(Ls1/m2;ILs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/w0;->s1(Ls1/m2;ILs1/p2$d;)V

    return-void
.end method

.method private h1(I)I
    .locals 9

    iget-object v0, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    if-nez v0, :cond_1

    const/16 v3, 0xfa0

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x2

    new-instance v0, Landroid/media/AudioTrack;

    const/4 v2, 0x3

    const/4 v7, 0x0

    move-object v1, v0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v0, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    :cond_1
    iget-object p1, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result p1

    return p1
.end method

.method public static synthetic i0(Ls1/p2$d;)V
    .locals 0

    invoke-static {p0}, Ls1/w0;->n1(Ls1/p2$d;)V

    return-void
.end method

.method private static i1(Ls1/m2;)Z
    .locals 2

    iget v0, p0, Ls1/m2;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ls1/m2;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Ls1/m2;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic j0(Ls1/w0;Ls1/i1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0;->l1(Ls1/i1$e;)V

    return-void
.end method

.method private static synthetic j1(IILs1/p2$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Ls1/p2$d;->h0(II)V

    return-void
.end method

.method public static synthetic k0(Ls1/m2;ILs1/p2$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/w0;->C1(Ls1/m2;ILs1/p2$d;)V

    return-void
.end method

.method private synthetic k1(Ls1/p2$d;Lp3/l;)V
    .locals 2

    iget-object v0, p0, Ls1/w0;->f:Ls1/p2;

    new-instance v1, Ls1/p2$c;

    invoke-direct {v1, p2}, Ls1/p2$c;-><init>(Lp3/l;)V

    invoke-interface {p1, v0, v1}, Ls1/p2$d;->j0(Ls1/p2;Ls1/p2$c;)V

    return-void
.end method

.method static synthetic l0(Ls1/w0;Ls1/m1;)Ls1/m1;
    .locals 0

    iput-object p1, p0, Ls1/w0;->S:Ls1/m1;

    return-object p1
.end method

.method private synthetic l1(Ls1/i1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0;->g1(Ls1/i1$e;)V

    return-void
.end method

.method static synthetic m0(Ls1/w0;)Z
    .locals 0

    iget-boolean p0, p0, Ls1/w0;->j0:Z

    return p0
.end method

.method private synthetic m1(Ls1/i1$e;)V
    .locals 2

    iget-object v0, p0, Ls1/w0;->i:Lp3/n;

    new-instance v1, Ls1/y;

    invoke-direct {v1, p0, p1}, Ls1/y;-><init>(Ls1/w0;Ls1/i1$e;)V

    invoke-interface {v0, v1}, Lp3/n;->j(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic n0(Ls1/w0;Z)Z
    .locals 0

    iput-boolean p1, p0, Ls1/w0;->j0:Z

    return p1
.end method

.method private static synthetic n1(Ls1/p2$d;)V
    .locals 2

    new-instance v0, Ls1/k1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ls1/k1;-><init>(I)V

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Ls1/q;->j(Ljava/lang/RuntimeException;I)Ls1/q;

    move-result-object v0

    invoke-interface {p0, v0}, Ls1/p2$d;->F(Ls1/l2;)V

    return-void
.end method

.method static synthetic o0(Ls1/w0;Ld3/e;)Ld3/e;
    .locals 0

    iput-object p1, p0, Ls1/w0;->k0:Ld3/e;

    return-object p1
.end method

.method private static synthetic o1(Lu1/e;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->n0(Lu1/e;)V

    return-void
.end method

.method static synthetic p0(Ls1/w0;)Ls1/z1;
    .locals 0

    iget-object p0, p0, Ls1/w0;->s0:Ls1/z1;

    return-object p0
.end method

.method private static synthetic p1(ILs1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->h(I)V

    return-void
.end method

.method static synthetic q0(Ls1/w0;Ls1/z1;)Ls1/z1;
    .locals 0

    iput-object p1, p0, Ls1/w0;->s0:Ls1/z1;

    return-object p1
.end method

.method private static synthetic q1(FLs1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->S(F)V

    return-void
.end method

.method static synthetic r0(Ls1/w0;)Ls1/z1;
    .locals 0

    invoke-direct {p0}, Ls1/w0;->Q0()Ls1/z1;

    move-result-object p0

    return-object p0
.end method

.method private synthetic r1(Ls1/p2$d;)V
    .locals 1

    iget-object v0, p0, Ls1/w0;->O:Ls1/p2$b;

    invoke-interface {p1, v0}, Ls1/p2$d;->O(Ls1/p2$b;)V

    return-void
.end method

.method static synthetic s0(Ls1/w0;)Ls1/z1;
    .locals 0

    iget-object p0, p0, Ls1/w0;->P:Ls1/z1;

    return-object p0
.end method

.method private static synthetic s1(Ls1/m2;ILs1/p2$d;)V
    .locals 0

    iget-object p0, p0, Ls1/m2;->a:Ls1/l3;

    invoke-interface {p2, p0, p1}, Ls1/p2$d;->g0(Ls1/l3;I)V

    return-void
.end method

.method static synthetic t0(Ls1/w0;Ls1/z1;)Ls1/z1;
    .locals 0

    iput-object p1, p0, Ls1/w0;->P:Ls1/z1;

    return-object p1
.end method

.method private static synthetic t1(ILs1/p2$e;Ls1/p2$e;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p3, p0}, Ls1/p2$d;->E(I)V

    invoke-interface {p3, p1, p2, p0}, Ls1/p2$d;->b0(Ls1/p2$e;Ls1/p2$e;I)V

    return-void
.end method

.method static synthetic u0(Ls1/w0;)Z
    .locals 0

    iget-boolean p0, p0, Ls1/w0;->Y:Z

    return p0
.end method

.method private static synthetic u1(Ls1/u1;ILs1/p2$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Ls1/p2$d;->i0(Ls1/u1;I)V

    return-void
.end method

.method static synthetic v0(Ls1/w0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0;->T1(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic v1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    iget-object p0, p0, Ls1/m2;->f:Ls1/q;

    invoke-interface {p1, p0}, Ls1/p2$d;->d0(Ls1/l2;)V

    return-void
.end method

.method static synthetic w0(Ls1/w0;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/w0;->I1(II)V

    return-void
.end method

.method private static synthetic w1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    iget-object p0, p0, Ls1/m2;->f:Ls1/q;

    invoke-interface {p1, p0}, Ls1/p2$d;->F(Ls1/l2;)V

    return-void
.end method

.method static synthetic x0(Ls1/w0;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/w0;->S1(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method private static synthetic x1(Ls1/m2;Ls1/p2$d;)V
    .locals 0

    iget-object p0, p0, Ls1/m2;->i:Ln3/d0;

    iget-object p0, p0, Ln3/d0;->d:Ls1/q3;

    invoke-interface {p1, p0}, Ls1/p2$d;->N(Ls1/q3;)V

    return-void
.end method

.method static synthetic y0(Ls1/w0;)V
    .locals 0

    invoke-direct {p0}, Ls1/w0;->O1()V

    return-void
.end method

.method private static synthetic y1(Ls1/z1;Ls1/p2$d;)V
    .locals 0

    invoke-interface {p1, p0}, Ls1/p2$d;->R(Ls1/z1;)V

    return-void
.end method

.method static synthetic z0(ZI)I
    .locals 0

    invoke-static {p0, p1}, Ls1/w0;->b1(ZI)I

    move-result p0

    return p0
.end method

.method private static synthetic z1(Ls1/m2;Ls1/p2$d;)V
    .locals 1

    iget-boolean v0, p0, Ls1/m2;->g:Z

    invoke-interface {p1, v0}, Ls1/p2$d;->D(Z)V

    iget-boolean p0, p0, Ls1/m2;->g:Z

    invoke-interface {p1, p0}, Ls1/p2$d;->K(Z)V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-virtual {p0}, Ls1/w0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    iget v0, v0, Lu2/s;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public C()I
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget v0, v0, Ls1/m2;->m:I

    return v0
.end method

.method public D()I
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget v0, p0, Ls1/w0;->F:I

    return v0
.end method

.method public E()J
    .locals 4

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-virtual {p0}, Ls1/w0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->b:Lu2/u$b;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    iget-object v2, v1, Lu2/s;->a:Ljava/lang/Object;

    iget-object v3, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v0, v2, v3}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object v0, p0, Ls1/w0;->n:Ls1/l3$b;

    iget v2, v1, Lu2/s;->b:I

    iget v1, v1, Lu2/s;->c:I

    invoke-virtual {v0, v2, v1}, Ls1/l3$b;->e(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Ls1/e;->K()J

    move-result-wide v0

    return-wide v0
.end method

.method public F()Ls1/l3;
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    return-object v0
.end method

.method public G()Z
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-boolean v0, p0, Ls1/w0;->G:Z

    return v0
.end method

.method public I()J
    .locals 2

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    invoke-direct {p0, v0}, Ls1/w0;->Y0(Ls1/m2;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public N0(Lt1/c;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ls1/w0;->r:Lt1/a;

    invoke-interface {v0, p1}, Lt1/a;->J(Lt1/c;)V

    return-void
.end method

.method public O0(Ls1/r$a;)V
    .locals 1

    iget-object v0, p0, Ls1/w0;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public P1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu2/u;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ls1/w0;->b2()V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ls1/w0;->Q1(Ljava/util/List;Z)V

    return-void
.end method

.method public Q1(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu2/u;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ls1/w0;->b2()V

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Ls1/w0;->R1(Ljava/util/List;IJZ)V

    return-void
.end method

.method public U1(Z)V
    .locals 3

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->A:Ls1/d;

    invoke-virtual {p0}, Ls1/w0;->p()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ls1/d;->p(ZI)I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ls1/w0;->V1(ZLs1/q;)V

    sget-object p1, Ld3/e;->o:Ld3/e;

    iput-object p1, p0, Ls1/w0;->k0:Ld3/e;

    return-void
.end method

.method public V0()Z
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-boolean v0, v0, Ls1/m2;->o:Z

    return v0
.end method

.method public W0()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Ls1/w0;->s:Landroid/os/Looper;

    return-object v0
.end method

.method public X0()J
    .locals 5

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ls1/w0;->w0:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->k:Lu2/u$b;

    iget-wide v1, v1, Lu2/s;->d:J

    iget-object v3, v0, Ls1/m2;->b:Lu2/u$b;

    iget-wide v3, v3, Lu2/s;->d:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3$d;->f()J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, v0, Ls1/m2;->p:J

    iget-object v2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v2, v2, Ls1/m2;->k:Lu2/u$b;

    invoke-virtual {v2}, Lu2/s;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->a:Ls1/l3;

    iget-object v0, v0, Ls1/m2;->k:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v0, v2}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object v0

    iget-object v1, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v1, Ls1/m2;->k:Lu2/u$b;

    iget v1, v1, Lu2/s;->b:I

    invoke-virtual {v0, v1}, Ls1/l3$b;->i(I)J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v3, v1, v3

    if-nez v3, :cond_2

    iget-wide v0, v0, Ls1/l3$b;->q:J

    goto :goto_0

    :cond_2
    move-wide v0, v1

    :cond_3
    :goto_0
    iget-object v2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v3, v2, Ls1/m2;->a:Ls1/l3;

    iget-object v2, v2, Ls1/m2;->k:Lu2/u$b;

    invoke-direct {p0, v3, v2, v0, v1}, Ls1/w0;->J1(Ls1/l3;Lu2/u$b;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ExoPlayerLib/2.18.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lp3/m0;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ls1/j1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    invoke-static {v1, v0}, Lp3/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Ls1/w0;->b2()V

    sget v0, Lp3/m0;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v1, p0, Ls1/w0;->T:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Ls1/w0;->z:Ls1/b;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ls1/b;->b(Z)V

    iget-object v0, p0, Ls1/w0;->B:Ls1/g3;

    invoke-virtual {v0}, Ls1/g3;->g()V

    iget-object v0, p0, Ls1/w0;->C:Ls1/r3;

    invoke-virtual {v0, v2}, Ls1/r3;->b(Z)V

    iget-object v0, p0, Ls1/w0;->D:Ls1/s3;

    invoke-virtual {v0, v2}, Ls1/s3;->b(Z)V

    iget-object v0, p0, Ls1/w0;->A:Ls1/d;

    invoke-virtual {v0}, Ls1/d;->i()V

    iget-object v0, p0, Ls1/w0;->k:Ls1/i1;

    invoke-virtual {v0}, Ls1/i1;->l0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    const/16 v3, 0xa

    sget-object v4, Ls1/k0;->a:Ls1/k0;

    invoke-virtual {v0, v3, v4}, Lp3/q;->k(ILp3/q$a;)V

    :cond_1
    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    invoke-virtual {v0}, Lp3/q;->j()V

    iget-object v0, p0, Ls1/w0;->i:Lp3/n;

    invoke-interface {v0, v1}, Lp3/n;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Ls1/w0;->t:Lo3/f;

    iget-object v3, p0, Ls1/w0;->r:Lt1/a;

    invoke-interface {v0, v3}, Lo3/f;->d(Lo3/f$a;)V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ls1/m2;->g(I)Ls1/m2;

    move-result-object v0

    iput-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v4, v0, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v0, v4}, Ls1/m2;->b(Lu2/u$b;)Ls1/m2;

    move-result-object v0

    iput-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-wide v4, v0, Ls1/m2;->r:J

    iput-wide v4, v0, Ls1/m2;->p:J

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    const-wide/16 v4, 0x0

    iput-wide v4, v0, Ls1/m2;->q:J

    iget-object v0, p0, Ls1/w0;->r:Lt1/a;

    invoke-interface {v0}, Lt1/a;->a()V

    iget-object v0, p0, Ls1/w0;->h:Ln3/c0;

    invoke-virtual {v0}, Ln3/c0;->f()V

    invoke-direct {p0}, Ls1/w0;->M1()V

    iget-object v0, p0, Ls1/w0;->V:Landroid/view/Surface;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v1, p0, Ls1/w0;->V:Landroid/view/Surface;

    :cond_2
    iget-boolean v0, p0, Ls1/w0;->o0:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ls1/w0;->n0:Lp3/c0;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp3/c0;

    invoke-virtual {v0, v2}, Lp3/c0;->b(I)V

    iput-boolean v2, p0, Ls1/w0;->o0:Z

    :cond_3
    sget-object v0, Ld3/e;->o:Ld3/e;

    iput-object v0, p0, Ls1/w0;->k0:Ld3/e;

    iput-boolean v3, p0, Ls1/w0;->p0:Z

    return-void
.end method

.method public b()V
    .locals 14

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-virtual {p0}, Ls1/w0;->p()Z

    move-result v0

    iget-object v1, p0, Ls1/w0;->A:Ls1/d;

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Ls1/d;->p(ZI)I

    move-result v1

    invoke-static {v0, v1}, Ls1/w0;->b1(ZI)I

    move-result v3

    invoke-direct {p0, v0, v1, v3}, Ls1/w0;->X1(ZII)V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget v1, v0, Ls1/m2;->e:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ls1/m2;->e(Ls1/q;)Ls1/m2;

    move-result-object v0

    iget-object v1, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v1}, Ls1/l3;->u()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    :cond_1
    invoke-virtual {v0, v2}, Ls1/m2;->g(I)Ls1/m2;

    move-result-object v5

    iget v0, p0, Ls1/w0;->H:I

    add-int/2addr v0, v3

    iput v0, p0, Ls1/w0;->H:I

    iget-object v0, p0, Ls1/w0;->k:Ls1/i1;

    invoke-virtual {v0}, Ls1/i1;->j0()V

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, -0x1

    move-object v4, p0

    invoke-direct/range {v4 .. v13}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    return-void
.end method

.method public c(Lu1/e;Z)V
    .locals 3

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-boolean v0, p0, Ls1/w0;->p0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ls1/w0;->h0:Lu1/e;

    invoke-static {v0, p1}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Ls1/w0;->h0:Lu1/e;

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1, p1}, Ls1/w0;->N1(IILjava/lang/Object;)V

    iget-object v0, p0, Ls1/w0;->B:Ls1/g3;

    iget v1, p1, Lu1/e;->p:I

    invoke-static {v1}, Lp3/m0;->f0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ls1/g3;->h(I)V

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    const/16 v1, 0x14

    new-instance v2, Ls1/i0;

    invoke-direct {v2, p1}, Ls1/i0;-><init>(Lu1/e;)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->i(ILp3/q$a;)V

    :cond_1
    iget-object v0, p0, Ls1/w0;->A:Ls1/d;

    if-eqz p2, :cond_2

    move-object p2, p1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Ls1/d;->m(Lu1/e;)V

    iget-object p2, p0, Ls1/w0;->h:Ln3/c0;

    invoke-virtual {p2, p1}, Ln3/c0;->h(Lu1/e;)V

    invoke-virtual {p0}, Ls1/w0;->p()Z

    move-result p1

    iget-object p2, p0, Ls1/w0;->A:Ls1/d;

    invoke-virtual {p0}, Ls1/w0;->r()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Ls1/d;->p(ZI)I

    move-result p2

    invoke-static {p1, p2}, Ls1/w0;->b1(ZI)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ls1/w0;->X1(ZII)V

    iget-object p1, p0, Ls1/w0;->l:Lp3/q;

    invoke-virtual {p1}, Lp3/q;->f()V

    return-void
.end method

.method public c1()Ls1/q;
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->f:Ls1/q;

    return-object v0
.end method

.method public d(Ls1/o2;)V
    .locals 11

    invoke-direct {p0}, Ls1/w0;->b2()V

    if-nez p1, :cond_0

    sget-object p1, Ls1/o2;->q:Ls1/o2;

    :cond_0
    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->n:Ls1/o2;

    invoke-virtual {v0, p1}, Ls1/o2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    invoke-virtual {v0, p1}, Ls1/m2;->f(Ls1/o2;)Ls1/m2;

    move-result-object v2

    iget v0, p0, Ls1/w0;->H:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ls1/w0;->H:I

    iget-object v0, p0, Ls1/w0;->k:Ls1/i1;

    invoke-virtual {v0, p1}, Ls1/i1;->S0(Ls1/o2;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, -0x1

    move-object v1, p0

    invoke-direct/range {v1 .. v10}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    return-void
.end method

.method public e()Ls1/m1;
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->R:Ls1/m1;

    return-object v0
.end method

.method public f(F)V
    .locals 3

    invoke-direct {p0}, Ls1/w0;->b2()V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lp3/m0;->p(FFF)F

    move-result p1

    iget v0, p0, Ls1/w0;->i0:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Ls1/w0;->i0:F

    invoke-direct {p0}, Ls1/w0;->O1()V

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    const/16 v1, 0x16

    new-instance v2, Ls1/j0;

    invoke-direct {v2, p1}, Ls1/j0;-><init>(F)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->k(ILp3/q$a;)V

    return-void
.end method

.method public bridge synthetic g()Ls1/l2;
    .locals 1

    invoke-virtual {p0}, Ls1/w0;->c1()Ls1/q;

    move-result-object v0

    return-object v0
.end method

.method public h(Z)V
    .locals 2

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->A:Ls1/d;

    invoke-virtual {p0}, Ls1/w0;->r()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Ls1/d;->p(ZI)I

    move-result v0

    invoke-static {p1, v0}, Ls1/w0;->b1(ZI)I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Ls1/w0;->X1(ZII)V

    return-void
.end method

.method public i(Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-direct {p0}, Ls1/w0;->M1()V

    invoke-direct {p0, p1}, Ls1/w0;->T1(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    invoke-direct {p0, p1, p1}, Ls1/w0;->I1(II)V

    return-void
.end method

.method public j()Z
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v0}, Lu2/s;->b()Z

    move-result v0

    return v0
.end method

.method public k()J
    .locals 5

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-virtual {p0}, Ls1/w0;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->a:Ls1/l3;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    iget-object v2, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v1, v0, v2}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-wide v1, v0, Ls1/m2;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v1

    iget-object v2, p0, Ls1/e;->a:Ls1/l3$d;

    invoke-virtual {v0, v1, v2}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3$d;->d()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls1/w0;->n:Ls1/l3$b;

    invoke-virtual {v0}, Ls1/l3$b;->p()J

    move-result-wide v0

    iget-object v2, p0, Ls1/w0;->t0:Ls1/m2;

    iget-wide v2, v2, Ls1/m2;->c:J

    invoke-static {v2, v3}, Lp3/m0;->X0(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Ls1/w0;->I()J

    move-result-wide v0

    return-wide v0
.end method

.method public l(Ls1/p2$d;)V
    .locals 1

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    invoke-virtual {v0, p1}, Lp3/q;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public m()J
    .locals 2

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-wide v0, v0, Ls1/m2;->q:J

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public n(IJ)V
    .locals 13

    move-object v10, p0

    move v0, p1

    move-wide v1, p2

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v3, v10, Ls1/w0;->r:Lt1/a;

    invoke-interface {v3}, Lt1/a;->e0()V

    iget-object v3, v10, Ls1/w0;->t0:Ls1/m2;

    iget-object v3, v3, Ls1/m2;->a:Ls1/l3;

    if-ltz v0, :cond_3

    invoke-virtual {v3}, Ls1/l3;->u()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Ls1/l3;->t()I

    move-result v4

    if-ge v0, v4, :cond_3

    :cond_0
    iget v4, v10, Ls1/w0;->H:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v10, Ls1/w0;->H:I

    invoke-virtual {p0}, Ls1/w0;->j()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v1, "seekTo ignored because an ad is playing"

    invoke-static {v0, v1}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ls1/i1$e;

    iget-object v1, v10, Ls1/w0;->t0:Ls1/m2;

    invoke-direct {v0, v1}, Ls1/i1$e;-><init>(Ls1/m2;)V

    invoke-virtual {v0, v5}, Ls1/i1$e;->b(I)V

    iget-object v1, v10, Ls1/w0;->j:Ls1/i1$f;

    invoke-interface {v1, v0}, Ls1/i1$f;->a(Ls1/i1$e;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Ls1/w0;->r()I

    move-result v4

    if-ne v4, v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x2

    :goto_0
    invoke-virtual {p0}, Ls1/w0;->w()I

    move-result v9

    iget-object v4, v10, Ls1/w0;->t0:Ls1/m2;

    invoke-virtual {v4, v5}, Ls1/m2;->g(I)Ls1/m2;

    move-result-object v4

    invoke-direct {p0, v3, p1, v1, v2}, Ls1/w0;->H1(Ls1/l3;IJ)Landroid/util/Pair;

    move-result-object v5

    invoke-direct {p0, v4, v3, v5}, Ls1/w0;->G1(Ls1/m2;Ls1/l3;Landroid/util/Pair;)Ls1/m2;

    move-result-object v4

    iget-object v5, v10, Ls1/w0;->k:Ls1/i1;

    invoke-static/range {p2 .. p3}, Lp3/m0;->A0(J)J

    move-result-wide v1

    invoke-virtual {v5, v3, p1, v1, v2}, Ls1/i1;->B0(Ls1/l3;IJ)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    invoke-direct {p0, v4}, Ls1/w0;->Y0(Ls1/m2;)J

    move-result-wide v11

    move-object v0, p0

    move-object v1, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-wide v7, v11

    invoke-direct/range {v0 .. v9}, Ls1/w0;->Y1(Ls1/m2;IIZZIJI)V

    return-void

    :cond_3
    new-instance v4, Ls1/q1;

    invoke-direct {v4, v3, p1, v1, v2}, Ls1/q1;-><init>(Ls1/l3;IJ)V

    throw v4
.end method

.method public o()J
    .locals 2

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-virtual {p0}, Ls1/w0;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->k:Lu2/u$b;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    invoke-virtual {v1, v0}, Lu2/s;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-wide v0, v0, Ls1/m2;->p:J

    invoke-static {v0, v1}, Lp3/m0;->X0(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls1/w0;->E()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Ls1/w0;->X0()J

    move-result-wide v0

    return-wide v0
.end method

.method public p()Z
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-boolean v0, v0, Ls1/m2;->l:Z

    return v0
.end method

.method public r()I
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget v0, v0, Ls1/m2;->e:I

    return v0
.end method

.method public s()Ls1/q3;
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->i:Ln3/d0;

    iget-object v0, v0, Ln3/d0;->d:Ls1/q3;

    return-object v0
.end method

.method public stop()V
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls1/w0;->U1(Z)V

    return-void
.end method

.method public u()I
    .locals 2

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->a:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ls1/w0;->v0:I

    return v0

    :cond_0
    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v1, v0, Ls1/m2;->a:Ls1/l3;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    iget-object v0, v0, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public v()I
    .locals 1

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-virtual {p0}, Ls1/w0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls1/w0;->t0:Ls1/m2;

    iget-object v0, v0, Ls1/m2;->b:Lu2/u$b;

    iget v0, v0, Lu2/s;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public w()I
    .locals 2

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-direct {p0}, Ls1/w0;->Z0()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public x(I)V
    .locals 3

    invoke-direct {p0}, Ls1/w0;->b2()V

    iget v0, p0, Ls1/w0;->F:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Ls1/w0;->F:I

    iget-object v0, p0, Ls1/w0;->k:Ls1/i1;

    invoke-virtual {v0, p1}, Ls1/i1;->U0(I)V

    iget-object v0, p0, Ls1/w0;->l:Lp3/q;

    const/16 v1, 0x8

    new-instance v2, Ls1/o0;

    invoke-direct {v2, p1}, Ls1/o0;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lp3/q;->i(ILp3/q$a;)V

    invoke-direct {p0}, Ls1/w0;->W1()V

    iget-object p1, p0, Ls1/w0;->l:Lp3/q;

    invoke-virtual {p1}, Lp3/q;->f()V

    :cond_0
    return-void
.end method

.method public z(Lu2/u;)V
    .locals 0

    invoke-direct {p0}, Ls1/w0;->b2()V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls1/w0;->P1(Ljava/util/List;)V

    return-void
.end method
