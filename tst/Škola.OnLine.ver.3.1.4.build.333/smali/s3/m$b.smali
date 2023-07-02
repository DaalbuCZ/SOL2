.class final Ls3/m$b;
.super Ls3/m$h;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls3/m$h<",
        "Ls3/m$b;",
        ">;",
        "Ljava/lang/Comparable<",
        "Ls3/m$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:I

.field private final B:I

.field private final C:Z

.field private final D:I

.field private final E:I

.field private final F:I

.field private final G:I

.field private final H:Z

.field private final I:Z

.field private final r:I

.field private final s:Z

.field private final t:Ljava/lang/String;

.field private final u:Ls3/m$d;

.field private final v:Z

.field private final w:I

.field private final x:I

.field private final y:I

.field private final z:Z


# direct methods
.method public constructor <init>(ILz2/t0;ILs3/m$d;IZLf5/l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lz2/t0;",
            "I",
            "Ls3/m$d;",
            "IZ",
            "Lf5/l<",
            "Lx1/n1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Ls3/m$h;-><init>(ILz2/t0;I)V

    iput-object p4, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-object p1, p0, Ls3/m$h;->q:Lx1/n1;

    iget-object p1, p1, Lx1/n1;->p:Ljava/lang/String;

    invoke-static {p1}, Ls3/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ls3/m$b;->t:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p5, p1}, Ls3/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ls3/m$b;->v:Z

    move p2, p1

    :goto_0
    iget-object p3, p4, Ls3/a0;->A:Lg5/q;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    const v0, 0x7fffffff

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Ls3/m$h;->q:Lx1/n1;

    iget-object v1, p4, Ls3/a0;->A:Lg5/q;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p3, v1, p1}, Ls3/m;->B(Lx1/n1;Ljava/lang/String;Z)I

    move-result p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    move p3, p1

    move p2, v0

    :goto_1
    iput p2, p0, Ls3/m$b;->x:I

    iput p3, p0, Ls3/m$b;->w:I

    iget-object p2, p0, Ls3/m$h;->q:Lx1/n1;

    iget p2, p2, Lx1/n1;->r:I

    iget p3, p4, Ls3/a0;->B:I

    invoke-static {p2, p3}, Ls3/m;->t(II)I

    move-result p2

    iput p2, p0, Ls3/m$b;->y:I

    iget-object p2, p0, Ls3/m$h;->q:Lx1/n1;

    iget p3, p2, Lx1/n1;->r:I

    const/4 v1, 0x1

    if-eqz p3, :cond_3

    and-int/2addr p3, v1

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    move p3, p1

    goto :goto_3

    :cond_3
    :goto_2
    move p3, v1

    :goto_3
    iput-boolean p3, p0, Ls3/m$b;->z:Z

    iget p3, p2, Lx1/n1;->q:I

    and-int/2addr p3, v1

    if-eqz p3, :cond_4

    move p3, v1

    goto :goto_4

    :cond_4
    move p3, p1

    :goto_4
    iput-boolean p3, p0, Ls3/m$b;->C:Z

    iget p3, p2, Lx1/n1;->L:I

    iput p3, p0, Ls3/m$b;->D:I

    iget v2, p2, Lx1/n1;->M:I

    iput v2, p0, Ls3/m$b;->E:I

    iget v2, p2, Lx1/n1;->u:I

    iput v2, p0, Ls3/m$b;->F:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    iget v4, p4, Ls3/a0;->D:I

    if-gt v2, v4, :cond_7

    :cond_5
    if-eq p3, v3, :cond_6

    iget v2, p4, Ls3/a0;->C:I

    if-gt p3, v2, :cond_7

    :cond_6
    invoke-interface {p7, p2}, Lf5/l;->apply(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    move p2, v1

    goto :goto_5

    :cond_7
    move p2, p1

    :goto_5
    iput-boolean p2, p0, Ls3/m$b;->s:Z

    invoke-static {}, Lu3/n0;->g0()[Ljava/lang/String;

    move-result-object p2

    move p3, p1

    :goto_6
    array-length p7, p2

    if-ge p3, p7, :cond_9

    iget-object p7, p0, Ls3/m$h;->q:Lx1/n1;

    aget-object v2, p2, p3

    invoke-static {p7, v2, p1}, Ls3/m;->B(Lx1/n1;Ljava/lang/String;Z)I

    move-result p7

    if-lez p7, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_9
    move p7, p1

    move p3, v0

    :goto_7
    iput p3, p0, Ls3/m$b;->A:I

    iput p7, p0, Ls3/m$b;->B:I

    move p2, p1

    :goto_8
    iget-object p3, p4, Ls3/a0;->E:Lg5/q;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_b

    iget-object p3, p0, Ls3/m$h;->q:Lx1/n1;

    iget-object p3, p3, Lx1/n1;->y:Ljava/lang/String;

    if-eqz p3, :cond_a

    iget-object p7, p4, Ls3/a0;->E:Lg5/q;

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p3, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    move v0, p2

    goto :goto_9

    :cond_a
    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    iput v0, p0, Ls3/m$b;->G:I

    invoke-static {p5}, Lx1/m3;->e(I)I

    move-result p2

    const/16 p3, 0x80

    if-ne p2, p3, :cond_c

    move p2, v1

    goto :goto_a

    :cond_c
    move p2, p1

    :goto_a
    iput-boolean p2, p0, Ls3/m$b;->H:Z

    invoke-static {p5}, Lx1/m3;->g(I)I

    move-result p2

    const/16 p3, 0x40

    if-ne p2, p3, :cond_d

    move p1, v1

    :cond_d
    iput-boolean p1, p0, Ls3/m$b;->I:Z

    invoke-direct {p0, p5, p6}, Ls3/m$b;->n(IZ)I

    move-result p1

    iput p1, p0, Ls3/m$b;->r:I

    return-void
.end method

.method public static h(Ljava/util/List;Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls3/m$b;",
            ">;",
            "Ljava/util/List<",
            "Ls3/m$b;",
            ">;)I"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ls3/m$b;

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls3/m$b;

    invoke-virtual {p0, p1}, Ls3/m$b;->j(Ls3/m$b;)I

    move-result p0

    return p0
.end method

.method public static l(ILz2/t0;Ls3/m$d;[IZLf5/l;)Lg5/q;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lz2/t0;",
            "Ls3/m$d;",
            "[IZ",
            "Lf5/l<",
            "Lx1/n1;",
            ">;)",
            "Lg5/q<",
            "Ls3/m$b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg5/q;->D()Lg5/q$a;

    move-result-object v0

    const/4 v1, 0x0

    move-object v10, p1

    :goto_0
    iget v2, v10, Lz2/t0;->n:I

    if-ge v1, v2, :cond_0

    new-instance v11, Ls3/m$b;

    aget v7, p3, v1

    move-object v2, v11

    move v3, p0

    move-object v4, p1

    move v5, v1

    move-object v6, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v2 .. v9}, Ls3/m$b;-><init>(ILz2/t0;ILs3/m$d;IZLf5/l;)V

    invoke-virtual {v0, v11}, Lg5/q$a;->f(Ljava/lang/Object;)Lg5/q$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lg5/q$a;->h()Lg5/q;

    move-result-object v0

    return-object v0
.end method

.method private n(IZ)I
    .locals 2

    iget-object v0, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-boolean v0, v0, Ls3/m$d;->A0:Z

    invoke-static {p1, v0}, Ls3/m;->I(IZ)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Ls3/m$b;->s:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-boolean v0, v0, Ls3/m$d;->u0:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p1, v1}, Ls3/m;->I(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Ls3/m$b;->s:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Ls3/m$h;->q:Lx1/n1;

    iget p1, p1, Lx1/n1;->u:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-boolean v0, p1, Ls3/a0;->K:Z

    if-nez v0, :cond_3

    iget-boolean v0, p1, Ls3/a0;->J:Z

    if-nez v0, :cond_3

    iget-boolean p1, p1, Ls3/m$d;->C0:Z

    if-nez p1, :cond_2

    if-nez p2, :cond_3

    :cond_2
    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ls3/m$b;

    invoke-virtual {p0, p1}, Ls3/m$b;->j(Ls3/m$b;)I

    move-result p1

    return p1
.end method

.method public e()I
    .locals 1

    iget v0, p0, Ls3/m$b;->r:I

    return v0
.end method

.method public bridge synthetic g(Ls3/m$h;)Z
    .locals 0

    check-cast p1, Ls3/m$b;

    invoke-virtual {p0, p1}, Ls3/m$b;->p(Ls3/m$b;)Z

    move-result p1

    return p1
.end method

.method public j(Ls3/m$b;)I
    .locals 5

    iget-boolean v0, p0, Ls3/m$b;->s:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ls3/m$b;->v:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ls3/m;->v()Lg5/h0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ls3/m;->v()Lg5/h0;

    move-result-object v0

    invoke-virtual {v0}, Lg5/h0;->d()Lg5/h0;

    move-result-object v0

    :goto_0
    invoke-static {}, Lg5/k;->j()Lg5/k;

    move-result-object v1

    iget-boolean v2, p0, Ls3/m$b;->v:Z

    iget-boolean v3, p1, Ls3/m$b;->v:Z

    invoke-virtual {v1, v2, v3}, Lg5/k;->g(ZZ)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lg5/h0;->b()Lg5/h0;

    move-result-object v4

    invoke-virtual {v4}, Lg5/h0;->d()Lg5/h0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->w:I

    iget v3, p1, Ls3/m$b;->w:I

    invoke-virtual {v1, v2, v3}, Lg5/k;->d(II)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->y:I

    iget v3, p1, Ls3/m$b;->y:I

    invoke-virtual {v1, v2, v3}, Lg5/k;->d(II)Lg5/k;

    move-result-object v1

    iget-boolean v2, p0, Ls3/m$b;->C:Z

    iget-boolean v3, p1, Ls3/m$b;->C:Z

    invoke-virtual {v1, v2, v3}, Lg5/k;->g(ZZ)Lg5/k;

    move-result-object v1

    iget-boolean v2, p0, Ls3/m$b;->z:Z

    iget-boolean v3, p1, Ls3/m$b;->z:Z

    invoke-virtual {v1, v2, v3}, Lg5/k;->g(ZZ)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->A:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->A:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lg5/h0;->b()Lg5/h0;

    move-result-object v4

    invoke-virtual {v4}, Lg5/h0;->d()Lg5/h0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->B:I

    iget v3, p1, Ls3/m$b;->B:I

    invoke-virtual {v1, v2, v3}, Lg5/k;->d(II)Lg5/k;

    move-result-object v1

    iget-boolean v2, p0, Ls3/m$b;->s:Z

    iget-boolean v3, p1, Ls3/m$b;->s:Z

    invoke-virtual {v1, v2, v3}, Lg5/k;->g(ZZ)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->G:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lg5/h0;->b()Lg5/h0;

    move-result-object v4

    invoke-virtual {v4}, Lg5/h0;->d()Lg5/h0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->F:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-boolean v4, v4, Ls3/a0;->J:Z

    if-eqz v4, :cond_1

    invoke-static {}, Ls3/m;->v()Lg5/h0;

    move-result-object v4

    invoke-virtual {v4}, Lg5/h0;->d()Lg5/h0;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Ls3/m;->w()Lg5/h0;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object v1

    iget-boolean v2, p0, Ls3/m$b;->H:Z

    iget-boolean v3, p1, Ls3/m$b;->H:Z

    invoke-virtual {v1, v2, v3}, Lg5/k;->g(ZZ)Lg5/k;

    move-result-object v1

    iget-boolean v2, p0, Ls3/m$b;->I:Z

    iget-boolean v3, p1, Ls3/m$b;->I:Z

    invoke-virtual {v1, v2, v3}, Lg5/k;->g(ZZ)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->D:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->D:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->E:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->E:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object v1

    iget v2, p0, Ls3/m$b;->F:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ls3/m$b;->F:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Ls3/m$b;->t:Ljava/lang/String;

    iget-object p1, p1, Ls3/m$b;->t:Ljava/lang/String;

    invoke-static {v4, p1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {}, Ls3/m;->w()Lg5/h0;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v2, v3, v0}, Lg5/k;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lg5/k;

    move-result-object p1

    invoke-virtual {p1}, Lg5/k;->i()I

    move-result p1

    return p1
.end method

.method public p(Ls3/m$b;)Z
    .locals 4

    iget-object v0, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-boolean v1, v0, Ls3/m$d;->x0:Z

    const/4 v2, -0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Ls3/m$h;->q:Lx1/n1;

    iget v1, v1, Lx1/n1;->L:I

    if-eq v1, v2, :cond_3

    iget-object v3, p1, Ls3/m$h;->q:Lx1/n1;

    iget v3, v3, Lx1/n1;->L:I

    if-ne v1, v3, :cond_3

    :cond_0
    iget-boolean v0, v0, Ls3/m$d;->v0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ls3/m$h;->q:Lx1/n1;

    iget-object v0, v0, Lx1/n1;->y:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v1, p1, Ls3/m$h;->q:Lx1/n1;

    iget-object v1, v1, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Ls3/m$b;->u:Ls3/m$d;

    iget-boolean v1, v0, Ls3/m$d;->w0:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ls3/m$h;->q:Lx1/n1;

    iget v1, v1, Lx1/n1;->M:I

    if-eq v1, v2, :cond_3

    iget-object v2, p1, Ls3/m$h;->q:Lx1/n1;

    iget v2, v2, Lx1/n1;->M:I

    if-ne v1, v2, :cond_3

    :cond_2
    iget-boolean v0, v0, Ls3/m$d;->y0:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ls3/m$b;->H:Z

    iget-boolean v1, p1, Ls3/m$b;->H:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ls3/m$b;->I:Z

    iget-boolean p1, p1, Ls3/m$b;->I:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
