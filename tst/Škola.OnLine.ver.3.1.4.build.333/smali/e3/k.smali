.class public final Le3/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/r;
.implements Lf3/l$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/k$b;
    }
.end annotation


# instance fields
.field private final A:I

.field private final B:Z

.field private final C:Ly1/t1;

.field private final D:Le3/p$b;

.field private E:Lz2/r$a;

.field private F:I

.field private G:Lz2/v0;

.field private H:[Le3/p;

.field private I:[Le3/p;

.field private J:[[I

.field private K:I

.field private L:Lz2/o0;

.field private final n:Le3/h;

.field private final o:Lf3/l;

.field private final p:Le3/g;

.field private final q:Lt3/p0;

.field private final r:Lb2/y;

.field private final s:Lb2/w$a;

.field private final t:Lt3/g0;

.field private final u:Lz2/b0$a;

.field private final v:Lt3/b;

.field private final w:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lz2/n0;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Le3/s;

.field private final y:Lz2/h;

.field private final z:Z


# direct methods
.method public constructor <init>(Le3/h;Lf3/l;Le3/g;Lt3/p0;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;Lt3/b;Lz2/h;ZIZLy1/t1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/k;->n:Le3/h;

    iput-object p2, p0, Le3/k;->o:Lf3/l;

    iput-object p3, p0, Le3/k;->p:Le3/g;

    iput-object p4, p0, Le3/k;->q:Lt3/p0;

    iput-object p5, p0, Le3/k;->r:Lb2/y;

    iput-object p6, p0, Le3/k;->s:Lb2/w$a;

    iput-object p7, p0, Le3/k;->t:Lt3/g0;

    iput-object p8, p0, Le3/k;->u:Lz2/b0$a;

    iput-object p9, p0, Le3/k;->v:Lt3/b;

    iput-object p10, p0, Le3/k;->y:Lz2/h;

    iput-boolean p11, p0, Le3/k;->z:Z

    iput p12, p0, Le3/k;->A:I

    iput-boolean p13, p0, Le3/k;->B:Z

    iput-object p14, p0, Le3/k;->C:Ly1/t1;

    new-instance p1, Le3/k$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Le3/k$b;-><init>(Le3/k;Le3/k$a;)V

    iput-object p1, p0, Le3/k;->D:Le3/p$b;

    const/4 p1, 0x0

    new-array p2, p1, [Lz2/o0;

    invoke-interface {p10, p2}, Lz2/h;->a([Lz2/o0;)Lz2/o0;

    move-result-object p2

    iput-object p2, p0, Le3/k;->L:Lz2/o0;

    new-instance p2, Ljava/util/IdentityHashMap;

    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p2, p0, Le3/k;->w:Ljava/util/IdentityHashMap;

    new-instance p2, Le3/s;

    invoke-direct {p2}, Le3/s;-><init>()V

    iput-object p2, p0, Le3/k;->x:Le3/s;

    new-array p2, p1, [Le3/p;

    iput-object p2, p0, Le3/k;->H:[Le3/p;

    new-array p2, p1, [Le3/p;

    iput-object p2, p0, Le3/k;->I:[Le3/p;

    new-array p1, p1, [[I

    iput-object p1, p0, Le3/k;->J:[[I

    return-void
.end method

.method private static A(Lx1/n1;)Lx1/n1;
    .locals 4

    iget-object v0, p0, Lx1/n1;->v:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lu3/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lu3/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lx1/n1$b;

    invoke-direct {v2}, Lx1/n1$b;-><init>()V

    iget-object v3, p0, Lx1/n1;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v2

    iget-object v3, p0, Lx1/n1;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lx1/n1$b;->W(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v2

    iget-object v3, p0, Lx1/n1;->x:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lx1/n1$b;->M(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lx1/n1$b;->K(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v0

    iget-object v1, p0, Lx1/n1;->w:Lp2/a;

    invoke-virtual {v0, v1}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    move-result-object v0

    iget v1, p0, Lx1/n1;->s:I

    invoke-virtual {v0, v1}, Lx1/n1$b;->I(I)Lx1/n1$b;

    move-result-object v0

    iget v1, p0, Lx1/n1;->t:I

    invoke-virtual {v0, v1}, Lx1/n1$b;->b0(I)Lx1/n1$b;

    move-result-object v0

    iget v1, p0, Lx1/n1;->D:I

    invoke-virtual {v0, v1}, Lx1/n1$b;->n0(I)Lx1/n1$b;

    move-result-object v0

    iget v1, p0, Lx1/n1;->E:I

    invoke-virtual {v0, v1}, Lx1/n1$b;->S(I)Lx1/n1$b;

    move-result-object v0

    iget v1, p0, Lx1/n1;->F:F

    invoke-virtual {v0, v1}, Lx1/n1$b;->R(F)Lx1/n1$b;

    move-result-object v0

    iget v1, p0, Lx1/n1;->q:I

    invoke-virtual {v0, v1}, Lx1/n1$b;->i0(I)Lx1/n1$b;

    move-result-object v0

    iget p0, p0, Lx1/n1;->r:I

    invoke-virtual {v0, p0}, Lx1/n1$b;->e0(I)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Le3/k;)I
    .locals 1

    iget v0, p0, Le3/k;->F:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Le3/k;->F:I

    return v0
.end method

.method static synthetic k(Le3/k;)[Le3/p;
    .locals 0

    iget-object p0, p0, Le3/k;->H:[Le3/p;

    return-object p0
.end method

.method static synthetic m(Le3/k;Lz2/v0;)Lz2/v0;
    .locals 0

    iput-object p1, p0, Le3/k;->G:Lz2/v0;

    return-object p1
.end method

.method static synthetic p(Le3/k;)Lz2/r$a;
    .locals 0

    iget-object p0, p0, Le3/k;->E:Lz2/r$a;

    return-object p0
.end method

.method static synthetic s(Le3/k;)Lf3/l;
    .locals 0

    iget-object p0, p0, Le3/k;->o:Lf3/l;

    return-object p0
.end method

.method private u(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lf3/h$a;",
            ">;",
            "Ljava/util/List<",
            "Le3/p;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p3

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_5

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf3/h$a;

    iget-object v7, v7, Lf3/h$a;->d:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    move-object/from16 v13, p0

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    const/4 v8, 0x1

    move v9, v5

    move v10, v8

    :goto_1
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v11

    if-ge v9, v11, :cond_3

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf3/h$a;

    iget-object v11, v11, Lf3/h$a;->d:Ljava/lang/String;

    invoke-static {v7, v11}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf3/h$a;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v11, Lf3/h$a;->a:Landroid/net/Uri;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v11, Lf3/h$a;->b:Lx1/n1;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v11, v11, Lf3/h$a;->b:Lx1/n1;

    iget-object v11, v11, Lx1/n1;->v:Ljava/lang/String;

    invoke-static {v11, v8}, Lu3/n0;->K(Ljava/lang/String;I)I

    move-result v11

    if-ne v11, v8, :cond_1

    move v11, v8

    goto :goto_2

    :cond_1
    move v11, v5

    :goto_2
    and-int/2addr v10, v11

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "audio:"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v14, 0x1

    new-array v9, v5, [Landroid/net/Uri;

    invoke-static {v9}, Lu3/n0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Landroid/net/Uri;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, [Landroid/net/Uri;

    new-array v9, v5, [Lx1/n1;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v16, v9

    check-cast v16, [Lx1/n1;

    const/16 v17, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v18

    move-object/from16 v12, p0

    move-object v13, v7

    move-object/from16 v19, p6

    move-wide/from16 v20, p1

    invoke-direct/range {v12 .. v21}, Le3/k;->x(Ljava/lang/String;I[Landroid/net/Uri;[Lx1/n1;Lx1/n1;Ljava/util/List;Ljava/util/Map;J)Le3/p;

    move-result-object v9

    invoke-static {v3}, Li5/e;->k(Ljava/util/Collection;)[I

    move-result-object v11

    move-object/from16 v12, p5

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v11, p4

    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v13, p0

    iget-boolean v14, v13, Le3/k;->z:Z

    if-eqz v14, :cond_4

    if-eqz v10, :cond_4

    new-array v10, v5, [Lx1/n1;

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Lx1/n1;

    new-array v8, v8, [Lz2/t0;

    new-instance v14, Lz2/t0;

    invoke-direct {v14, v7, v10}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    aput-object v14, v8, v5

    new-array v7, v5, [I

    invoke-virtual {v9, v8, v5, v7}, Le3/p;->d0([Lz2/t0;I[I)V

    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_5
    move-object/from16 v13, p0

    return-void
.end method

.method private v(Lf3/h;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h;",
            "J",
            "Ljava/util/List<",
            "Le3/p;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    iget-object v1, v0, Lf3/h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_0
    iget-object v7, v0, Lf3/h;->e:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-ge v4, v7, :cond_3

    iget-object v7, v0, Lf3/h;->e:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf3/h$b;

    iget-object v7, v7, Lf3/h$b;->b:Lx1/n1;

    iget v10, v7, Lx1/n1;->E:I

    if-gtz v10, :cond_2

    iget-object v10, v7, Lx1/n1;->v:Ljava/lang/String;

    invoke-static {v10, v8}, Lu3/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    iget-object v7, v7, Lx1/n1;->v:Ljava/lang/String;

    invoke-static {v7, v9}, Lu3/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    aput v9, v2, v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    const/4 v7, -0x1

    aput v7, v2, v4

    goto :goto_2

    :cond_2
    :goto_1
    aput v8, v2, v4

    add-int/lit8 v5, v5, 0x1

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-lez v5, :cond_4

    move v1, v5

    move v4, v9

    move v5, v3

    goto :goto_3

    :cond_4
    if-ge v6, v1, :cond_5

    sub-int/2addr v1, v6

    move v4, v3

    move v5, v9

    goto :goto_3

    :cond_5
    move v4, v3

    move v5, v4

    :goto_3
    new-array v13, v1, [Landroid/net/Uri;

    new-array v6, v1, [Lx1/n1;

    new-array v7, v1, [I

    move v10, v3

    move v11, v10

    :goto_4
    iget-object v12, v0, Lf3/h;->e:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v10, v12, :cond_9

    if-eqz v4, :cond_6

    aget v12, v2, v10

    if-ne v12, v8, :cond_8

    :cond_6
    if-eqz v5, :cond_7

    aget v12, v2, v10

    if-eq v12, v9, :cond_8

    :cond_7
    iget-object v12, v0, Lf3/h;->e:Ljava/util/List;

    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf3/h$b;

    iget-object v14, v12, Lf3/h$b;->a:Landroid/net/Uri;

    aput-object v14, v13, v11

    iget-object v12, v12, Lf3/h$b;->b:Lx1/n1;

    aput-object v12, v6, v11

    add-int/lit8 v12, v11, 0x1

    aput v10, v7, v11

    move v11, v12

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_9
    aget-object v2, v6, v3

    iget-object v2, v2, Lx1/n1;->v:Ljava/lang/String;

    invoke-static {v2, v8}, Lu3/n0;->K(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v2, v9}, Lu3/n0;->K(Ljava/lang/String;I)I

    move-result v2

    if-eq v2, v9, :cond_a

    if-nez v2, :cond_b

    iget-object v8, v0, Lf3/h;->g:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    :cond_a
    if-gt v5, v9, :cond_b

    add-int v8, v2, v5

    if-lez v8, :cond_b

    move v8, v9

    goto :goto_5

    :cond_b
    move v8, v3

    :goto_5
    if-nez v4, :cond_c

    if-lez v2, :cond_c

    move v12, v9

    goto :goto_6

    :cond_c
    move v12, v3

    :goto_6
    const-string v4, "main"

    iget-object v15, v0, Lf3/h;->j:Lx1/n1;

    iget-object v14, v0, Lf3/h;->k:Ljava/util/List;

    move-object/from16 v10, p0

    move-object v11, v4

    move-object/from16 v16, v14

    move-object v14, v6

    move-object/from16 v17, p6

    move-wide/from16 v18, p2

    invoke-direct/range {v10 .. v19}, Le3/k;->x(Ljava/lang/String;I[Landroid/net/Uri;[Lx1/n1;Lx1/n1;Ljava/util/List;Ljava/util/Map;J)Le3/p;

    move-result-object v10

    move-object/from16 v11, p4

    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v11, p5

    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p0

    iget-boolean v11, v7, Le3/k;->z:Z

    if-eqz v11, :cond_13

    if-eqz v8, :cond_13

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-lez v5, :cond_10

    new-array v5, v1, [Lx1/n1;

    move v11, v3

    :goto_7
    if-ge v11, v1, :cond_d

    aget-object v12, v6, v11

    invoke-static {v12}, Le3/k;->A(Lx1/n1;)Lx1/n1;

    move-result-object v12

    aput-object v12, v5, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_d
    new-instance v1, Lz2/t0;

    invoke-direct {v1, v4, v5}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-lez v2, :cond_f

    iget-object v1, v0, Lf3/h;->j:Lx1/n1;

    if-nez v1, :cond_e

    iget-object v1, v0, Lf3/h;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    :cond_e
    new-instance v1, Lz2/t0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":audio"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v9, [Lx1/n1;

    aget-object v6, v6, v3

    iget-object v11, v0, Lf3/h;->j:Lx1/n1;

    invoke-static {v6, v11, v3}, Le3/k;->y(Lx1/n1;Lx1/n1;Z)Lx1/n1;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-direct {v1, v2, v5}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v0, v0, Lf3/h;->k:Ljava/util/List;

    if-eqz v0, :cond_12

    move v1, v3

    :goto_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":cc:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lz2/t0;

    new-array v6, v9, [Lx1/n1;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lx1/n1;

    aput-object v11, v6, v3

    invoke-direct {v5, v2, v6}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_10
    new-array v2, v1, [Lx1/n1;

    move v5, v3

    :goto_9
    if-ge v5, v1, :cond_11

    aget-object v11, v6, v5

    iget-object v12, v0, Lf3/h;->j:Lx1/n1;

    invoke-static {v11, v12, v9}, Le3/k;->y(Lx1/n1;Lx1/n1;Z)Lx1/n1;

    move-result-object v11

    aput-object v11, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_11
    new-instance v0, Lz2/t0;

    invoke-direct {v0, v4, v2}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v0, Lz2/t0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":id3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v9, [Lx1/n1;

    new-instance v4, Lx1/n1$b;

    invoke-direct {v4}, Lx1/n1$b;-><init>()V

    const-string v5, "ID3"

    invoke-virtual {v4, v5}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    const-string v5, "application/id3"

    invoke-virtual {v4, v5}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    invoke-virtual {v4}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {v0, v1, v2}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-array v1, v3, [Lz2/t0;

    invoke-interface {v8, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lz2/t0;

    new-array v2, v9, [I

    invoke-interface {v8, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    aput v0, v2, v3

    invoke-virtual {v10, v1, v3, v2}, Le3/p;->d0([Lz2/t0;I[I)V

    :cond_13
    return-void
.end method

.method private w(J)V
    .locals 20

    move-object/from16 v10, p0

    iget-object v0, v10, Le3/k;->o:Lf3/l;

    invoke-interface {v0}, Lf3/l;->b()Lf3/h;

    move-result-object v0

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lf3/h;

    iget-boolean v0, v10, Le3/k;->B:Z

    if-eqz v0, :cond_0

    iget-object v0, v1, Lf3/h;->m:Ljava/util/List;

    invoke-static {v0}, Le3/k;->z(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    move-object v11, v0

    iget-object v0, v1, Lf3/h;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v12, 0x1

    xor-int/2addr v0, v12

    iget-object v7, v1, Lf3/h;->g:Ljava/util/List;

    iget-object v13, v1, Lf3/h;->h:Ljava/util/List;

    const/4 v14, 0x0

    iput v14, v10, Le3/k;->F:I

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    move-object v4, v15

    move-object v5, v8

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Le3/k;->v(Lf3/h;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V

    :cond_1
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object v3, v7

    move-object v4, v15

    move-object v5, v8

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Le3/k;->u(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v10, Le3/k;->K:I

    move v9, v14

    :goto_1
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lf3/h$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "subtitle:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v7, Lf3/h$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x3

    new-array v3, v12, [Landroid/net/Uri;

    iget-object v0, v7, Lf3/h$a;->a:Landroid/net/Uri;

    aput-object v0, v3, v14

    new-array v4, v12, [Lx1/n1;

    iget-object v0, v7, Lf3/h$a;->b:Lx1/n1;

    aput-object v0, v4, v14

    const/4 v5, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    move-object/from16 v0, p0

    move-object v1, v6

    move-object/from16 v17, v6

    move-object/from16 v6, v16

    move-object/from16 v18, v7

    move-object v7, v11

    move-object/from16 v19, v8

    move/from16 v16, v9

    move-wide/from16 v8, p1

    invoke-direct/range {v0 .. v9}, Le3/k;->x(Ljava/lang/String;I[Landroid/net/Uri;[Lx1/n1;Lx1/n1;Ljava/util/List;Ljava/util/Map;J)Le3/p;

    move-result-object v0

    new-array v1, v12, [I

    aput v16, v1, v14

    move-object/from16 v2, v19

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-array v1, v12, [Lz2/t0;

    new-instance v3, Lz2/t0;

    new-array v4, v12, [Lx1/n1;

    move-object/from16 v5, v18

    iget-object v5, v5, Lf3/h$a;->b:Lx1/n1;

    aput-object v5, v4, v14

    move-object/from16 v5, v17

    invoke-direct {v3, v5, v4}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    aput-object v3, v1, v14

    new-array v3, v14, [I

    invoke-virtual {v0, v1, v14, v3}, Le3/p;->d0([Lz2/t0;I[I)V

    add-int/lit8 v9, v16, 0x1

    move-object v8, v2

    goto :goto_1

    :cond_2
    move-object v2, v8

    new-array v0, v14, [Le3/p;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le3/p;

    iput-object v0, v10, Le3/k;->H:[Le3/p;

    new-array v0, v14, [[I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, v10, Le3/k;->J:[[I

    iget-object v0, v10, Le3/k;->H:[Le3/p;

    array-length v0, v0

    iput v0, v10, Le3/k;->F:I

    move v0, v14

    :goto_2
    iget v1, v10, Le3/k;->K:I

    if-ge v0, v1, :cond_3

    iget-object v1, v10, Le3/k;->H:[Le3/p;

    aget-object v1, v1, v0

    invoke-virtual {v1, v12}, Le3/p;->m0(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, v10, Le3/k;->H:[Le3/p;

    array-length v1, v0

    :goto_3
    if-ge v14, v1, :cond_4

    aget-object v2, v0, v14

    invoke-virtual {v2}, Le3/p;->B()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_4
    iget-object v0, v10, Le3/k;->H:[Le3/p;

    iput-object v0, v10, Le3/k;->I:[Le3/p;

    return-void
.end method

.method private x(Ljava/lang/String;I[Landroid/net/Uri;[Lx1/n1;Lx1/n1;Ljava/util/List;Ljava/util/Map;J)Le3/p;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I[",
            "Landroid/net/Uri;",
            "[",
            "Lx1/n1;",
            "Lx1/n1;",
            "Ljava/util/List<",
            "Lx1/n1;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;J)",
            "Le3/p;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v11, Le3/f;

    iget-object v2, v0, Le3/k;->n:Le3/h;

    iget-object v3, v0, Le3/k;->o:Lf3/l;

    iget-object v6, v0, Le3/k;->p:Le3/g;

    iget-object v7, v0, Le3/k;->q:Lt3/p0;

    iget-object v8, v0, Le3/k;->x:Le3/s;

    iget-object v10, v0, Le3/k;->C:Ly1/t1;

    move-object v1, v11

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v10}, Le3/f;-><init>(Le3/h;Lf3/l;[Landroid/net/Uri;[Lx1/n1;Le3/g;Lt3/p0;Le3/s;Ljava/util/List;Ly1/t1;)V

    new-instance v16, Le3/p;

    iget-object v4, v0, Le3/k;->D:Le3/p$b;

    iget-object v7, v0, Le3/k;->v:Lt3/b;

    iget-object v12, v0, Le3/k;->r:Lb2/y;

    iget-object v13, v0, Le3/k;->s:Lb2/w$a;

    iget-object v14, v0, Le3/k;->t:Lt3/g0;

    iget-object v15, v0, Le3/k;->u:Lz2/b0$a;

    iget v10, v0, Le3/k;->A:I

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object v5, v11

    move-object/from16 v6, p7

    move-wide/from16 v8, p8

    move/from16 v17, v10

    move-object/from16 v10, p5

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move/from16 v15, v17

    invoke-direct/range {v1 .. v15}, Le3/p;-><init>(Ljava/lang/String;ILe3/p$b;Le3/f;Ljava/util/Map;Lt3/b;JLx1/n1;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;I)V

    return-object v16
.end method

.method private static y(Lx1/n1;Lx1/n1;Z)Lx1/n1;
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz p1, :cond_0

    iget-object v0, p1, Lx1/n1;->v:Ljava/lang/String;

    iget-object v1, p1, Lx1/n1;->w:Lp2/a;

    iget v3, p1, Lx1/n1;->L:I

    iget v4, p1, Lx1/n1;->q:I

    iget v5, p1, Lx1/n1;->r:I

    iget-object v6, p1, Lx1/n1;->p:Ljava/lang/String;

    iget-object p1, p1, Lx1/n1;->o:Ljava/lang/String;

    move-object v10, v6

    move v6, v3

    move v3, v5

    move-object v5, v10

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lx1/n1;->v:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-static {p1, v3}, Lu3/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lx1/n1;->w:Lp2/a;

    if-eqz p2, :cond_1

    iget v0, p0, Lx1/n1;->L:I

    iget v1, p0, Lx1/n1;->q:I

    iget v4, p0, Lx1/n1;->r:I

    iget-object v5, p0, Lx1/n1;->p:Ljava/lang/String;

    iget-object v6, p0, Lx1/n1;->o:Ljava/lang/String;

    move v10, v0

    move-object v0, p1

    move-object p1, v6

    move v6, v10

    move v11, v4

    move v4, v1

    move-object v1, v3

    move v3, v11

    goto :goto_0

    :cond_1
    move-object v5, v0

    move v4, v1

    move v6, v2

    move-object v0, p1

    move-object p1, v5

    move-object v1, v3

    move v3, v4

    :goto_0
    invoke-static {v0}, Lu3/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz p2, :cond_2

    iget v8, p0, Lx1/n1;->s:I

    goto :goto_1

    :cond_2
    move v8, v2

    :goto_1
    if-eqz p2, :cond_3

    iget v2, p0, Lx1/n1;->t:I

    :cond_3
    new-instance p2, Lx1/n1$b;

    invoke-direct {p2}, Lx1/n1$b;-><init>()V

    iget-object v9, p0, Lx1/n1;->n:Ljava/lang/String;

    invoke-virtual {p2, v9}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lx1/n1$b;->W(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p1

    iget-object p0, p0, Lx1/n1;->x:Ljava/lang/String;

    invoke-virtual {p1, p0}, Lx1/n1$b;->M(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v7}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Lx1/n1$b;->K(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v1}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v8}, Lx1/n1$b;->I(I)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v2}, Lx1/n1$b;->b0(I)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v6}, Lx1/n1$b;->J(I)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v4}, Lx1/n1$b;->i0(I)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v3}, Lx1/n1$b;->e0(I)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0, v5}, Lx1/n1$b;->X(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p0

    invoke-virtual {p0}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p0

    return-object p0
.end method

.method private static z(Ljava/util/List;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb2/m;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb2/m;

    iget-object v4, v3, Lb2/m;->p:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x1

    move v5, v2

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb2/m;

    iget-object v7, v6, Lb2/m;->p:Ljava/lang/String;

    invoke-static {v7, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v3, v6}, Lb2/m;->f(Lb2/m;)Lb2/m;

    move-result-object v3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public B()V
    .locals 4

    iget-object v0, p0, Le3/k;->o:Lf3/l;

    invoke-interface {v0, p0}, Lf3/l;->j(Lf3/l$b;)V

    iget-object v0, p0, Le3/k;->H:[Le3/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Le3/p;->f0()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Le3/k;->E:Lz2/r$a;

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Le3/k;->L:Lz2/o0;

    invoke-interface {v0}, Lz2/o0;->a()Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Le3/k;->H:[Le3/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Le3/p;->b0()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le3/k;->E:Lz2/r$a;

    invoke-interface {v0, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    return-void
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Le3/k;->L:Lz2/o0;

    invoke-interface {v0}, Lz2/o0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Landroid/net/Uri;Lt3/g0$c;Z)Z
    .locals 5

    iget-object v0, p0, Le3/k;->H:[Le3/p;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2, p3}, Le3/p;->a0(Landroid/net/Uri;Lt3/g0$c;Z)Z

    move-result v4

    and-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le3/k;->E:Lz2/r$a;

    invoke-interface {p1, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    return v2
.end method

.method public e(JLx1/q3;)J
    .locals 5

    iget-object v0, p0, Le3/k;->I:[Le3/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Le3/p;->R()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, p1, p2, p3}, Le3/p;->e(JLx1/q3;)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-wide p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Le3/k;->L:Lz2/o0;

    invoke-interface {v0}, Lz2/o0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)Z
    .locals 3

    iget-object v0, p0, Le3/k;->G:Lz2/v0;

    if-nez v0, :cond_1

    iget-object p1, p0, Le3/k;->H:[Le3/p;

    array-length p2, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Le3/p;->B()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    iget-object v0, p0, Le3/k;->L:Lz2/o0;

    invoke-interface {v0, p1, p2}, Lz2/o0;->g(J)Z

    move-result p1

    return p1
.end method

.method public h(J)V
    .locals 1

    iget-object v0, p0, Le3/k;->L:Lz2/o0;

    invoke-interface {v0, p1, p2}, Lz2/o0;->h(J)V

    return-void
.end method

.method public j([Ls3/t;[Z[Lz2/n0;[ZJ)J
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    array-length v3, v1

    new-array v3, v3, [I

    array-length v4, v1

    new-array v4, v4, [I

    const/4 v6, 0x0

    :goto_0
    array-length v7, v1

    if-ge v6, v7, :cond_3

    aget-object v7, v2, v6

    const/4 v8, -0x1

    if-nez v7, :cond_0

    move v7, v8

    goto :goto_1

    :cond_0
    iget-object v7, v0, Le3/k;->w:Ljava/util/IdentityHashMap;

    aget-object v9, v2, v6

    invoke-virtual {v7, v9}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_1
    aput v7, v3, v6

    aput v8, v4, v6

    aget-object v7, v1, v6

    if-eqz v7, :cond_2

    aget-object v7, v1, v6

    invoke-interface {v7}, Ls3/w;->d()Lz2/t0;

    move-result-object v7

    const/4 v9, 0x0

    :goto_2
    iget-object v10, v0, Le3/k;->H:[Le3/p;

    array-length v11, v10

    if-ge v9, v11, :cond_2

    aget-object v10, v10, v9

    invoke-virtual {v10}, Le3/p;->o()Lz2/v0;

    move-result-object v10

    invoke-virtual {v10, v7}, Lz2/v0;->c(Lz2/t0;)I

    move-result v10

    if-eq v10, v8, :cond_1

    aput v9, v4, v6

    goto :goto_3

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    iget-object v6, v0, Le3/k;->w:Ljava/util/IdentityHashMap;

    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    array-length v6, v1

    new-array v7, v6, [Lz2/n0;

    array-length v8, v1

    new-array v8, v8, [Lz2/n0;

    array-length v9, v1

    new-array v14, v9, [Ls3/t;

    iget-object v9, v0, Le3/k;->H:[Le3/p;

    array-length v9, v9

    new-array v15, v9, [Le3/p;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_4
    iget-object v9, v0, Le3/k;->H:[Le3/p;

    array-length v9, v9

    if-ge v13, v9, :cond_10

    const/4 v9, 0x0

    :goto_5
    array-length v10, v1

    if-ge v9, v10, :cond_6

    aget v10, v3, v9

    const/4 v11, 0x0

    if-ne v10, v13, :cond_4

    aget-object v10, v2, v9

    goto :goto_6

    :cond_4
    move-object v10, v11

    :goto_6
    aput-object v10, v8, v9

    aget v10, v4, v9

    if-ne v10, v13, :cond_5

    aget-object v11, v1, v9

    :cond_5
    aput-object v11, v14, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_6
    iget-object v9, v0, Le3/k;->H:[Le3/p;

    aget-object v11, v9, v13

    move-object v9, v11

    move-object v10, v14

    move-object v5, v11

    move-object/from16 v11, p2

    move v2, v12

    move-object v12, v8

    move/from16 v18, v6

    move v6, v13

    move-object/from16 v13, p4

    move/from16 v20, v2

    move-object/from16 v19, v14

    move-object v2, v15

    move-wide/from16 v14, p5

    move/from16 v16, v17

    invoke-virtual/range {v9 .. v16}, Le3/p;->j0([Ls3/t;[Z[Lz2/n0;[ZJZ)Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_7
    array-length v12, v1

    const/4 v13, 0x1

    if-ge v10, v12, :cond_a

    aget-object v12, v8, v10

    aget v14, v4, v10

    if-ne v14, v6, :cond_7

    invoke-static {v12}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    aput-object v12, v7, v10

    iget-object v11, v0, Le3/k;->w:Ljava/util/IdentityHashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v12, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v11, v13

    goto :goto_9

    :cond_7
    aget v14, v3, v10

    if-ne v14, v6, :cond_9

    if-nez v12, :cond_8

    goto :goto_8

    :cond_8
    const/4 v13, 0x0

    :goto_8
    invoke-static {v13}, Lu3/a;->f(Z)V

    :cond_9
    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_a
    if-eqz v11, :cond_e

    aput-object v5, v2, v20

    add-int/lit8 v12, v20, 0x1

    if-nez v20, :cond_c

    invoke-virtual {v5, v13}, Le3/p;->m0(Z)V

    if-nez v9, :cond_b

    iget-object v9, v0, Le3/k;->I:[Le3/p;

    array-length v10, v9

    if-eqz v10, :cond_b

    const/4 v10, 0x0

    aget-object v9, v9, v10

    if-eq v5, v9, :cond_f

    :cond_b
    iget-object v5, v0, Le3/k;->x:Le3/s;

    invoke-virtual {v5}, Le3/s;->b()V

    move/from16 v17, v13

    goto :goto_b

    :cond_c
    iget v9, v0, Le3/k;->K:I

    if-ge v6, v9, :cond_d

    goto :goto_a

    :cond_d
    const/4 v13, 0x0

    :goto_a
    invoke-virtual {v5, v13}, Le3/p;->m0(Z)V

    goto :goto_b

    :cond_e
    move/from16 v12, v20

    :cond_f
    :goto_b
    add-int/lit8 v13, v6, 0x1

    move-object v15, v2

    move/from16 v6, v18

    move-object/from16 v14, v19

    move-object/from16 v2, p3

    goto/16 :goto_4

    :cond_10
    move-object v5, v2

    move-object v2, v15

    const/4 v9, 0x0

    invoke-static {v7, v9, v5, v9, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2, v12}, Lu3/n0;->G0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Le3/p;

    iput-object v1, v0, Le3/k;->I:[Le3/p;

    iget-object v2, v0, Le3/k;->y:Lz2/h;

    invoke-interface {v2, v1}, Lz2/h;->a([Lz2/o0;)Lz2/o0;

    move-result-object v1

    iput-object v1, v0, Le3/k;->L:Lz2/o0;

    return-wide p5
.end method

.method public l()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public n(Lz2/r$a;J)V
    .locals 0

    iput-object p1, p0, Le3/k;->E:Lz2/r$a;

    iget-object p1, p0, Le3/k;->o:Lf3/l;

    invoke-interface {p1, p0}, Lf3/l;->c(Lf3/l$b;)V

    invoke-direct {p0, p2, p3}, Le3/k;->w(J)V

    return-void
.end method

.method public o()Lz2/v0;
    .locals 1

    iget-object v0, p0, Le3/k;->G:Lz2/v0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/v0;

    return-object v0
.end method

.method public q()V
    .locals 4

    iget-object v0, p0, Le3/k;->H:[Le3/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Le3/p;->q()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(JZ)V
    .locals 4

    iget-object v0, p0, Le3/k;->I:[Le3/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, Le3/p;->r(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(J)J
    .locals 4

    iget-object v0, p0, Le3/k;->I:[Le3/p;

    array-length v1, v0

    if-lez v1, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v1}, Le3/p;->i0(JZ)Z

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Le3/k;->I:[Le3/p;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p2, v0}, Le3/p;->i0(JZ)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Le3/k;->x:Le3/s;

    invoke-virtual {v0}, Le3/s;->b()V

    :cond_1
    return-wide p1
.end method
