.class final Lx1/z2;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final s:Lz2/u$b;


# instance fields
.field public final a:Lx1/y3;

.field public final b:Lz2/u$b;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lx1/q;

.field public final g:Z

.field public final h:Lz2/v0;

.field public final i:Ls3/d0;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp2/a;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lz2/u$b;

.field public final l:Z

.field public final m:I

.field public final n:Lx1/b3;

.field public final o:Z

.field public volatile p:J

.field public volatile q:J

.field public volatile r:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz2/u$b;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lz2/u$b;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lx1/z2;->s:Lz2/u$b;

    return-void
.end method

.method public constructor <init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/y3;",
            "Lz2/u$b;",
            "JJI",
            "Lx1/q;",
            "Z",
            "Lz2/v0;",
            "Ls3/d0;",
            "Ljava/util/List<",
            "Lp2/a;",
            ">;",
            "Lz2/u$b;",
            "ZI",
            "Lx1/b3;",
            "JJJZ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lx1/z2;->a:Lx1/y3;

    move-object v1, p2

    iput-object v1, v0, Lx1/z2;->b:Lz2/u$b;

    move-wide v1, p3

    iput-wide v1, v0, Lx1/z2;->c:J

    move-wide v1, p5

    iput-wide v1, v0, Lx1/z2;->d:J

    move v1, p7

    iput v1, v0, Lx1/z2;->e:I

    move-object v1, p8

    iput-object v1, v0, Lx1/z2;->f:Lx1/q;

    move v1, p9

    iput-boolean v1, v0, Lx1/z2;->g:Z

    move-object v1, p10

    iput-object v1, v0, Lx1/z2;->h:Lz2/v0;

    move-object v1, p11

    iput-object v1, v0, Lx1/z2;->i:Ls3/d0;

    move-object v1, p12

    iput-object v1, v0, Lx1/z2;->j:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Lx1/z2;->k:Lz2/u$b;

    move/from16 v1, p14

    iput-boolean v1, v0, Lx1/z2;->l:Z

    move/from16 v1, p15

    iput v1, v0, Lx1/z2;->m:I

    move-object/from16 v1, p16

    iput-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, Lx1/z2;->r:J

    move/from16 v1, p23

    iput-boolean v1, v0, Lx1/z2;->o:Z

    return-void
.end method

.method public static j(Ls3/d0;)Lx1/z2;
    .locals 25

    move-object/from16 v11, p0

    new-instance v24, Lx1/z2;

    move-object/from16 v0, v24

    sget-object v1, Lx1/y3;->n:Lx1/y3;

    sget-object v13, Lx1/z2;->s:Lz2/u$b;

    move-object v2, v13

    sget-object v10, Lz2/v0;->q:Lz2/v0;

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v12

    sget-object v16, Lx1/b3;->q:Lx1/b3;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v23}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v24
.end method

.method public static k()Lz2/u$b;
    .locals 1

    sget-object v0, Lx1/z2;->s:Lz2/u$b;

    return-object v0
.end method


# virtual methods
.method public a(Z)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v10, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public b(Lz2/u$b;)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public c(Lz2/u$b;JJJJLz2/v0;Ls3/d0;Ljava/util/List;)Lx1/z2;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/u$b;",
            "JJJJ",
            "Lz2/v0;",
            "Ls3/d0;",
            "Ljava/util/List<",
            "Lp2/a;",
            ">;)",
            "Lx1/z2;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v22, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v20, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public d(ZI)Lx1/z2;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v15, p1

    move/from16 v16, p2

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    move-object/from16 p1, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public e(Lx1/q;)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public f(Lx1/b3;)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public g(I)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v8, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public h(Z)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v24, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v2, v0, Lx1/z2;->a:Lx1/y3;

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method

.method public i(Lx1/y3;)Lx1/z2;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    new-instance v25, Lx1/z2;

    move-object/from16 v1, v25

    iget-object v3, v0, Lx1/z2;->b:Lz2/u$b;

    iget-wide v4, v0, Lx1/z2;->c:J

    iget-wide v6, v0, Lx1/z2;->d:J

    iget v8, v0, Lx1/z2;->e:I

    iget-object v9, v0, Lx1/z2;->f:Lx1/q;

    iget-boolean v10, v0, Lx1/z2;->g:Z

    iget-object v11, v0, Lx1/z2;->h:Lz2/v0;

    iget-object v12, v0, Lx1/z2;->i:Ls3/d0;

    iget-object v13, v0, Lx1/z2;->j:Ljava/util/List;

    iget-object v14, v0, Lx1/z2;->k:Lz2/u$b;

    iget-boolean v15, v0, Lx1/z2;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lx1/z2;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lx1/z2;->n:Lx1/b3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lx1/z2;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lx1/z2;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lx1/z2;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lx1/z2;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lx1/z2;-><init>(Lx1/y3;Lz2/u$b;JJILx1/q;ZLz2/v0;Ls3/d0;Ljava/util/List;Lz2/u$b;ZILx1/b3;JJJZ)V

    return-object v25
.end method
