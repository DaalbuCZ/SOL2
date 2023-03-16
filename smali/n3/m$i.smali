.class final Ln3/m$i;
.super Ln3/m$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln3/m$h<",
        "Ln3/m$i;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:I

.field private final C:Z

.field private final D:Z

.field private final E:I

.field private final r:Z

.field private final s:Ln3/m$d;

.field private final t:Z

.field private final u:Z

.field private final v:I

.field private final w:I

.field private final x:I

.field private final y:I

.field private final z:Z


# direct methods
.method public constructor <init>(ILu2/t0;ILn3/m$d;IIZ)V
    .locals 4

    invoke-direct {p0, p1, p2, p3}, Ln3/m$h;-><init>(ILu2/t0;I)V

    iput-object p4, p0, Ln3/m$i;->s:Ln3/m$d;

    iget-boolean p1, p4, Ln3/m$d;->S:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    iget-boolean p2, p4, Ln3/m$d;->R:Z

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    and-int p2, p6, p1

    if-eqz p2, :cond_1

    move p2, p3

    goto :goto_1

    :cond_1
    move p2, v0

    :goto_1
    iput-boolean p2, p0, Ln3/m$i;->A:Z

    const/high16 p2, -0x40800000    # -1.0f

    const/4 p6, -0x1

    if-eqz p7, :cond_6

    iget-object v1, p0, Ln3/m$h;->q:Ls1/m1;

    iget v2, v1, Ls1/m1;->D:I

    if-eq v2, p6, :cond_2

    iget v3, p4, Ln3/a0;->n:I

    if-gt v2, v3, :cond_6

    :cond_2
    iget v2, v1, Ls1/m1;->E:I

    if-eq v2, p6, :cond_3

    iget v3, p4, Ln3/a0;->o:I

    if-gt v2, v3, :cond_6

    :cond_3
    iget v2, v1, Ls1/m1;->F:F

    cmpl-float v3, v2, p2

    if-eqz v3, :cond_4

    iget v3, p4, Ln3/a0;->p:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_6

    :cond_4
    iget v1, v1, Ls1/m1;->u:I

    if-eq v1, p6, :cond_5

    iget v2, p4, Ln3/a0;->q:I

    if-gt v1, v2, :cond_6

    :cond_5
    move v1, p3

    goto :goto_2

    :cond_6
    move v1, v0

    :goto_2
    iput-boolean v1, p0, Ln3/m$i;->r:Z

    if-eqz p7, :cond_b

    iget-object p7, p0, Ln3/m$h;->q:Ls1/m1;

    iget v1, p7, Ls1/m1;->D:I

    if-eq v1, p6, :cond_7

    iget v2, p4, Ln3/a0;->r:I

    if-lt v1, v2, :cond_b

    :cond_7
    iget v1, p7, Ls1/m1;->E:I

    if-eq v1, p6, :cond_8

    iget v2, p4, Ln3/a0;->s:I

    if-lt v1, v2, :cond_b

    :cond_8
    iget v1, p7, Ls1/m1;->F:F

    cmpl-float p2, v1, p2

    if-eqz p2, :cond_9

    iget p2, p4, Ln3/a0;->t:I

    int-to-float p2, p2

    cmpl-float p2, v1, p2

    if-ltz p2, :cond_b

    :cond_9
    iget p2, p7, Ls1/m1;->u:I

    if-eq p2, p6, :cond_a

    iget p6, p4, Ln3/a0;->u:I

    if-lt p2, p6, :cond_b

    :cond_a
    move p2, p3

    goto :goto_3

    :cond_b
    move p2, v0

    :goto_3
    iput-boolean p2, p0, Ln3/m$i;->t:Z

    invoke-static {p5, v0}, Ln3/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ln3/m$i;->u:Z

    iget-object p2, p0, Ln3/m$h;->q:Ls1/m1;

    iget p6, p2, Ls1/m1;->u:I

    iput p6, p0, Ln3/m$i;->v:I

    invoke-virtual {p2}, Ls1/m1;->f()I

    move-result p2

    iput p2, p0, Ln3/m$i;->w:I

    iget-object p2, p0, Ln3/m$h;->q:Ls1/m1;

    iget p2, p2, Ls1/m1;->r:I

    iget p6, p4, Ln3/a0;->z:I

    invoke-static {p2, p6}, Ln3/m;->t(II)I

    move-result p2

    iput p2, p0, Ln3/m$i;->y:I

    iget-object p2, p0, Ln3/m$h;->q:Ls1/m1;

    iget p2, p2, Ls1/m1;->r:I

    if-eqz p2, :cond_d

    and-int/2addr p2, p3

    if-eqz p2, :cond_c

    goto :goto_4

    :cond_c
    move p2, v0

    goto :goto_5

    :cond_d
    :goto_4
    move p2, p3

    :goto_5
    iput-boolean p2, p0, Ln3/m$i;->z:Z

    const p2, 0x7fffffff

    move p6, v0

    :goto_6
    iget-object p7, p4, Ln3/a0;->y:Lb5/q;

    invoke-virtual {p7}, Ljava/util/AbstractCollection;->size()I

    move-result p7

    if-ge p6, p7, :cond_f

    iget-object p7, p0, Ln3/m$h;->q:Ls1/m1;

    iget-object p7, p7, Ls1/m1;->y:Ljava/lang/String;

    if-eqz p7, :cond_e

    iget-object v1, p4, Ln3/a0;->y:Lb5/q;

    invoke-interface {v1, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p7

    if-eqz p7, :cond_e

    move p2, p6

    goto :goto_7

    :cond_e
    add-int/lit8 p6, p6, 0x1

    goto :goto_6

    :cond_f
    :goto_7
    iput p2, p0, Ln3/m$i;->x:I

    invoke-static {p5}, Ls1/z2;->e(I)I

    move-result p2

    const/16 p4, 0x80

    if-ne p2, p4, :cond_10

    move p2, p3

    goto :goto_8

    :cond_10
    move p2, v0

    :goto_8
    iput-boolean p2, p0, Ln3/m$i;->C:Z

    invoke-static {p5}, Ls1/z2;->g(I)I

    move-result p2

    const/16 p4, 0x40

    if-ne p2, p4, :cond_11

    goto :goto_9

    :cond_11
    move p3, v0

    :goto_9
    iput-boolean p3, p0, Ln3/m$i;->D:Z

    iget-object p2, p0, Ln3/m$h;->q:Ls1/m1;

    iget-object p2, p2, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {p2}, Ln3/m;->u(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ln3/m$i;->E:I

    invoke-direct {p0, p5, p1}, Ln3/m$i;->r(II)I

    move-result p1

    iput p1, p0, Ln3/m$i;->B:I

    return-void
.end method

.method public static synthetic h(Ln3/m$i;Ln3/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Ln3/m$i;->l(Ln3/m$i;Ln3/m$i;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Ln3/m$i;Ln3/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Ln3/m$i;->m(Ln3/m$i;Ln3/m$i;)I

    move-result p0

    return p0
.end method

.method private static l(Ln3/m$i;Ln3/m$i;)I
    .locals 4

    invoke-static {}, Lb5/k;->j()Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->u:Z

    iget-boolean v2, p1, Ln3/m$i;->u:Z

    invoke-virtual {v0, v1, v2}, Lb5/k;->g(ZZ)Lb5/k;

    move-result-object v0

    iget v1, p0, Ln3/m$i;->y:I

    iget v2, p1, Ln3/m$i;->y:I

    invoke-virtual {v0, v1, v2}, Lb5/k;->d(II)Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->z:Z

    iget-boolean v2, p1, Ln3/m$i;->z:Z

    invoke-virtual {v0, v1, v2}, Lb5/k;->g(ZZ)Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->r:Z

    iget-boolean v2, p1, Ln3/m$i;->r:Z

    invoke-virtual {v0, v1, v2}, Lb5/k;->g(ZZ)Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->t:Z

    iget-boolean v2, p1, Ln3/m$i;->t:Z

    invoke-virtual {v0, v1, v2}, Lb5/k;->g(ZZ)Lb5/k;

    move-result-object v0

    iget v1, p0, Ln3/m$i;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ln3/m$i;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lb5/h0;->b()Lb5/h0;

    move-result-object v3

    invoke-virtual {v3}, Lb5/h0;->d()Lb5/h0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lb5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->C:Z

    iget-boolean v2, p1, Ln3/m$i;->C:Z

    invoke-virtual {v0, v1, v2}, Lb5/k;->g(ZZ)Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->D:Z

    iget-boolean v2, p1, Ln3/m$i;->D:Z

    invoke-virtual {v0, v1, v2}, Lb5/k;->g(ZZ)Lb5/k;

    move-result-object v0

    iget-boolean v1, p0, Ln3/m$i;->C:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ln3/m$i;->D:Z

    if-eqz v1, :cond_0

    iget p0, p0, Ln3/m$i;->E:I

    iget p1, p1, Ln3/m$i;->E:I

    invoke-virtual {v0, p0, p1}, Lb5/k;->d(II)Lb5/k;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lb5/k;->i()I

    move-result p0

    return p0
.end method

.method private static m(Ln3/m$i;Ln3/m$i;)I
    .locals 5

    iget-boolean v0, p0, Ln3/m$i;->r:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln3/m$i;->u:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ln3/m;->v()Lb5/h0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ln3/m;->v()Lb5/h0;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h0;->d()Lb5/h0;

    move-result-object v0

    :goto_0
    invoke-static {}, Lb5/k;->j()Lb5/k;

    move-result-object v1

    iget v2, p0, Ln3/m$i;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$i;->v:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ln3/m$i;->s:Ln3/m$d;

    iget-boolean v4, v4, Ln3/a0;->J:Z

    if-eqz v4, :cond_1

    invoke-static {}, Ln3/m;->v()Lb5/h0;

    move-result-object v4

    invoke-virtual {v4}, Lb5/h0;->d()Lb5/h0;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Ln3/m;->w()Lb5/h0;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Lb5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;

    move-result-object v1

    iget v2, p0, Ln3/m$i;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ln3/m$i;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lb5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;

    move-result-object v1

    iget p0, p0, Ln3/m$i;->v:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iget p1, p1, Ln3/m$i;->v:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p0, p1, v0}, Lb5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;

    move-result-object p0

    invoke-virtual {p0}, Lb5/k;->i()I

    move-result p0

    return p0
.end method

.method public static p(Ljava/util/List;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln3/m$i;",
            ">;",
            "Ljava/util/List<",
            "Ln3/m$i;",
            ">;)I"
        }
    .end annotation

    invoke-static {}, Lb5/k;->j()Lb5/k;

    move-result-object v0

    sget-object v1, Ln3/q;->n:Ln3/q;

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln3/m$i;

    sget-object v2, Ln3/q;->n:Ln3/q;

    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln3/m$i;

    sget-object v3, Ln3/q;->n:Ln3/q;

    invoke-virtual {v0, v1, v2, v3}, Lb5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lb5/k;->d(II)Lb5/k;

    move-result-object v0

    sget-object v1, Ln3/r;->n:Ln3/r;

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/m$i;

    sget-object v1, Ln3/r;->n:Ln3/r;

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln3/m$i;

    sget-object v1, Ln3/r;->n:Ln3/r;

    invoke-virtual {v0, p0, p1, v1}, Lb5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lb5/k;

    move-result-object p0

    invoke-virtual {p0}, Lb5/k;->i()I

    move-result p0

    return p0
.end method

.method public static q(ILu2/t0;Ln3/m$d;[II)Lb5/q;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lu2/t0;",
            "Ln3/m$d;",
            "[II)",
            "Lb5/q<",
            "Ln3/m$i;",
            ">;"
        }
    .end annotation

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    iget v0, v9, Ln3/a0;->v:I

    iget v1, v9, Ln3/a0;->w:I

    iget-boolean v2, v9, Ln3/a0;->x:Z

    invoke-static {v8, v0, v1, v2}, Ln3/m;->s(Lu2/t0;IIZ)I

    move-result v10

    invoke-static {}, Lb5/q;->D()Lb5/q$a;

    move-result-object v11

    const/4 v12, 0x0

    move v13, v12

    :goto_0
    iget v0, v8, Lu2/t0;->n:I

    if-ge v13, v0, :cond_2

    invoke-virtual {v8, v13}, Lu2/t0;->b(I)Ls1/m1;

    move-result-object v0

    invoke-virtual {v0}, Ls1/m1;->f()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v10, v1, :cond_1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-gt v0, v10, :cond_0

    goto :goto_1

    :cond_0
    move v7, v12

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v0, 0x1

    move v7, v0

    :goto_2
    new-instance v14, Ln3/m$i;

    aget v5, p3, v13

    move-object v0, v14

    move v1, p0

    move-object/from16 v2, p1

    move v3, v13

    move-object/from16 v4, p2

    move/from16 v6, p4

    invoke-direct/range {v0 .. v7}, Ln3/m$i;-><init>(ILu2/t0;ILn3/m$d;IIZ)V

    invoke-virtual {v11, v14}, Lb5/q$a;->f(Ljava/lang/Object;)Lb5/q$a;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v11}, Lb5/q$a;->h()Lb5/q;

    move-result-object v0

    return-object v0
.end method

.method private r(II)I
    .locals 2

    iget-object v0, p0, Ln3/m$h;->q:Ls1/m1;

    iget v0, v0, Ls1/m1;->r:I

    and-int/lit16 v0, v0, 0x4000

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ln3/m$i;->s:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->a0:Z

    invoke-static {p1, v0}, Ln3/m;->I(IZ)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Ln3/m$i;->r:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ln3/m$i;->s:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->Q:Z

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p1, v1}, Ln3/m;->I(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln3/m$i;->t:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln3/m$i;->r:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln3/m$h;->q:Ls1/m1;

    iget v0, v0, Ls1/m1;->u:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Ln3/m$i;->s:Ln3/m$d;

    iget-boolean v1, v0, Ln3/a0;->K:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Ln3/a0;->J:Z

    if-nez v0, :cond_3

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, Ln3/m$i;->B:I

    return v0
.end method

.method public bridge synthetic g(Ln3/m$h;)Z
    .locals 0

    check-cast p1, Ln3/m$i;

    invoke-virtual {p0, p1}, Ln3/m$i;->s(Ln3/m$i;)Z

    move-result p1

    return p1
.end method

.method public s(Ln3/m$i;)Z
    .locals 2

    iget-boolean v0, p0, Ln3/m$i;->A:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ln3/m$h;->q:Ls1/m1;

    iget-object v0, v0, Ls1/m1;->y:Ljava/lang/String;

    iget-object v1, p1, Ln3/m$h;->q:Ls1/m1;

    iget-object v1, v1, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Ln3/m$i;->s:Ln3/m$d;

    iget-boolean v0, v0, Ln3/m$d;->T:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ln3/m$i;->C:Z

    iget-boolean v1, p1, Ln3/m$i;->C:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Ln3/m$i;->D:Z

    iget-boolean p1, p1, Ln3/m$i;->D:Z

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
