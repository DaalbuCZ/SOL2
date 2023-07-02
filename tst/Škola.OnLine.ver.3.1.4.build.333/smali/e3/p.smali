.class final Le3/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/h0$b;
.implements Lt3/h0$f;
.implements Lz2/o0;
.implements Lc2/n;
.implements Lz2/m0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/p$c;,
        Le3/p$d;,
        Le3/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt3/h0$b<",
        "Lb3/f;",
        ">;",
        "Lt3/h0$f;",
        "Lz2/o0;",
        "Lc2/n;",
        "Lz2/m0$d;"
    }
.end annotation


# static fields
.field private static final l0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le3/i;",
            ">;"
        }
    .end annotation
.end field

.field private final B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le3/i;",
            ">;"
        }
    .end annotation
.end field

.field private final C:Ljava/lang/Runnable;

.field private final D:Ljava/lang/Runnable;

.field private final E:Landroid/os/Handler;

.field private final F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le3/l;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;"
        }
    .end annotation
.end field

.field private H:Lb3/f;

.field private I:[Le3/p$d;

.field private J:[I

.field private K:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private L:Landroid/util/SparseIntArray;

.field private M:Lc2/e0;

.field private N:I

.field private O:I

.field private P:Z

.field private Q:Z

.field private R:I

.field private S:Lx1/n1;

.field private T:Lx1/n1;

.field private U:Z

.field private V:Lz2/v0;

.field private W:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lz2/t0;",
            ">;"
        }
    .end annotation
.end field

.field private X:[I

.field private Y:I

.field private Z:Z

.field private a0:[Z

.field private b0:[Z

.field private c0:J

.field private d0:J

.field private e0:Z

.field private f0:Z

.field private g0:Z

.field private h0:Z

.field private i0:J

.field private j0:Lb2/m;

.field private k0:Le3/i;

.field private final n:Ljava/lang/String;

.field private final o:I

.field private final p:Le3/p$b;

.field private final q:Le3/f;

.field private final r:Lt3/b;

.field private final s:Lx1/n1;

.field private final t:Lb2/y;

.field private final u:Lb2/w$a;

.field private final v:Lt3/g0;

.field private final w:Lt3/h0;

.field private final x:Lz2/b0$a;

.field private final y:I

.field private final z:Le3/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Le3/p;->l0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILe3/p$b;Le3/f;Ljava/util/Map;Lt3/b;JLx1/n1;Lb2/y;Lb2/w$a;Lt3/g0;Lz2/b0$a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Le3/p$b;",
            "Le3/f;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lb2/m;",
            ">;",
            "Lt3/b;",
            "J",
            "Lx1/n1;",
            "Lb2/y;",
            "Lb2/w$a;",
            "Lt3/g0;",
            "Lz2/b0$a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le3/p;->n:Ljava/lang/String;

    iput p2, p0, Le3/p;->o:I

    iput-object p3, p0, Le3/p;->p:Le3/p$b;

    iput-object p4, p0, Le3/p;->q:Le3/f;

    iput-object p5, p0, Le3/p;->G:Ljava/util/Map;

    iput-object p6, p0, Le3/p;->r:Lt3/b;

    iput-object p9, p0, Le3/p;->s:Lx1/n1;

    iput-object p10, p0, Le3/p;->t:Lb2/y;

    iput-object p11, p0, Le3/p;->u:Lb2/w$a;

    iput-object p12, p0, Le3/p;->v:Lt3/g0;

    iput-object p13, p0, Le3/p;->x:Lz2/b0$a;

    iput p14, p0, Le3/p;->y:I

    new-instance p1, Lt3/h0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Lt3/h0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Le3/p;->w:Lt3/h0;

    new-instance p1, Le3/f$b;

    invoke-direct {p1}, Le3/f$b;-><init>()V

    iput-object p1, p0, Le3/p;->z:Le3/f$b;

    const/4 p1, 0x0

    new-array p2, p1, [I

    iput-object p2, p0, Le3/p;->J:[I

    new-instance p2, Ljava/util/HashSet;

    sget-object p3, Le3/p;->l0:Ljava/util/Set;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(I)V

    iput-object p2, p0, Le3/p;->K:Ljava/util/Set;

    new-instance p2, Landroid/util/SparseIntArray;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result p3

    invoke-direct {p2, p3}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p2, p0, Le3/p;->L:Landroid/util/SparseIntArray;

    new-array p2, p1, [Le3/p$d;

    iput-object p2, p0, Le3/p;->I:[Le3/p$d;

    new-array p2, p1, [Z

    iput-object p2, p0, Le3/p;->b0:[Z

    new-array p1, p1, [Z

    iput-object p1, p0, Le3/p;->a0:[Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Le3/p;->B:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le3/p;->F:Ljava/util/ArrayList;

    new-instance p1, Le3/o;

    invoke-direct {p1, p0}, Le3/o;-><init>(Le3/p;)V

    iput-object p1, p0, Le3/p;->C:Ljava/lang/Runnable;

    new-instance p1, Le3/n;

    invoke-direct {p1, p0}, Le3/n;-><init>(Le3/p;)V

    iput-object p1, p0, Le3/p;->D:Ljava/lang/Runnable;

    invoke-static {}, Lu3/n0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Le3/p;->E:Landroid/os/Handler;

    iput-wide p7, p0, Le3/p;->c0:J

    iput-wide p7, p0, Le3/p;->d0:J

    return-void
.end method

.method private A(I)Z
    .locals 4

    move v0, p1

    :goto_0
    iget-object v1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le3/i;

    iget-boolean v1, v1, Le3/i;->n:Z

    if-eqz v1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le3/i;

    move v0, v2

    :goto_1
    iget-object v1, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p1, v0}, Le3/i;->m(I)I

    move-result v1

    iget-object v3, p0, Le3/p;->I:[Le3/p$d;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Lz2/m0;->C()I

    move-result v3

    if-le v3, v1, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private static C(II)Lc2/k;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HlsSampleStreamWrapper"

    invoke-static {p1, p0}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Lc2/k;

    invoke-direct {p0}, Lc2/k;-><init>()V

    return-object p0
.end method

.method private D(II)Lz2/m0;
    .locals 9

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    new-instance v8, Le3/p$d;

    iget-object v3, p0, Le3/p;->r:Lt3/b;

    iget-object v4, p0, Le3/p;->t:Lb2/y;

    iget-object v5, p0, Le3/p;->u:Lb2/w$a;

    iget-object v6, p0, Le3/p;->G:Ljava/util/Map;

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Le3/p$d;-><init>(Lt3/b;Lb2/y;Lb2/w$a;Ljava/util/Map;Le3/p$a;)V

    iget-wide v2, p0, Le3/p;->c0:J

    invoke-virtual {v8, v2, v3}, Lz2/m0;->b0(J)V

    if-eqz v1, :cond_2

    iget-object v2, p0, Le3/p;->j0:Lb2/m;

    invoke-virtual {v8, v2}, Le3/p$d;->i0(Lb2/m;)V

    :cond_2
    iget-wide v2, p0, Le3/p;->i0:J

    invoke-virtual {v8, v2, v3}, Lz2/m0;->a0(J)V

    iget-object v2, p0, Le3/p;->k0:Le3/i;

    if-eqz v2, :cond_3

    invoke-virtual {v8, v2}, Le3/p$d;->j0(Le3/i;)V

    :cond_3
    invoke-virtual {v8, p0}, Lz2/m0;->d0(Lz2/m0$d;)V

    iget-object v2, p0, Le3/p;->J:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    iput-object v2, p0, Le3/p;->J:[I

    aput p1, v2, v0

    iget-object p1, p0, Le3/p;->I:[Le3/p$d;

    invoke-static {p1, v8}, Lu3/n0;->E0([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Le3/p$d;

    iput-object p1, p0, Le3/p;->I:[Le3/p$d;

    iget-object p1, p0, Le3/p;->b0:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Le3/p;->b0:[Z

    aput-boolean v1, p1, v0

    iget-boolean v1, p0, Le3/p;->Z:Z

    aget-boolean p1, p1, v0

    or-int/2addr p1, v1

    iput-boolean p1, p0, Le3/p;->Z:Z

    iget-object p1, p0, Le3/p;->K:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Le3/p;->L:Landroid/util/SparseIntArray;

    invoke-virtual {p1, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    invoke-static {p2}, Le3/p;->M(I)I

    move-result p1

    iget v1, p0, Le3/p;->N:I

    invoke-static {v1}, Le3/p;->M(I)I

    move-result v1

    if-le p1, v1, :cond_4

    iput v0, p0, Le3/p;->O:I

    iput p2, p0, Le3/p;->N:I

    :cond_4
    iget-object p1, p0, Le3/p;->a0:[Z

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Le3/p;->a0:[Z

    return-object v8
.end method

.method private E([Lz2/t0;)Lz2/v0;
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    iget v3, v2, Lz2/t0;->n:I

    new-array v3, v3, [Lx1/n1;

    move v4, v0

    :goto_1
    iget v5, v2, Lz2/t0;->n:I

    if-ge v4, v5, :cond_0

    invoke-virtual {v2, v4}, Lz2/t0;->b(I)Lx1/n1;

    move-result-object v5

    iget-object v6, p0, Le3/p;->t:Lb2/y;

    invoke-interface {v6, v5}, Lb2/y;->f(Lx1/n1;)I

    move-result v6

    invoke-virtual {v5, v6}, Lx1/n1;->c(I)Lx1/n1;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    new-instance v4, Lz2/t0;

    iget-object v2, v2, Lz2/t0;->o:Ljava/lang/String;

    invoke-direct {v4, v2, v3}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    aput-object v4, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lz2/v0;

    invoke-direct {v0, p1}, Lz2/v0;-><init>([Lz2/t0;)V

    return-object v0
.end method

.method private static F(Lx1/n1;Lx1/n1;Z)Lx1/n1;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p1, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v0}, Lu3/v;->k(Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lx1/n1;->v:Ljava/lang/String;

    invoke-static {v1, v0}, Lu3/n0;->K(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lx1/n1;->v:Ljava/lang/String;

    invoke-static {v1, v0}, Lu3/n0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lu3/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lx1/n1;->v:Ljava/lang/String;

    iget-object v3, p1, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lu3/v;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p1, Lx1/n1;->y:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Lx1/n1;->b()Lx1/n1$b;

    move-result-object v4

    iget-object v5, p0, Lx1/n1;->n:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    iget-object v5, p0, Lx1/n1;->o:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lx1/n1$b;->W(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    iget-object v5, p0, Lx1/n1;->p:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lx1/n1$b;->X(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v4

    iget v5, p0, Lx1/n1;->q:I

    invoke-virtual {v4, v5}, Lx1/n1$b;->i0(I)Lx1/n1$b;

    move-result-object v4

    iget v5, p0, Lx1/n1;->r:I

    invoke-virtual {v4, v5}, Lx1/n1$b;->e0(I)Lx1/n1$b;

    move-result-object v4

    const/4 v5, -0x1

    if-eqz p2, :cond_2

    iget v6, p0, Lx1/n1;->s:I

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    invoke-virtual {v4, v6}, Lx1/n1$b;->I(I)Lx1/n1$b;

    move-result-object v4

    if-eqz p2, :cond_3

    iget p2, p0, Lx1/n1;->t:I

    goto :goto_2

    :cond_3
    move p2, v5

    :goto_2
    invoke-virtual {v4, p2}, Lx1/n1$b;->b0(I)Lx1/n1$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Lx1/n1$b;->K(Ljava/lang/String;)Lx1/n1$b;

    move-result-object p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget v1, p0, Lx1/n1;->D:I

    invoke-virtual {p2, v1}, Lx1/n1$b;->n0(I)Lx1/n1$b;

    move-result-object v1

    iget v4, p0, Lx1/n1;->E:I

    invoke-virtual {v1, v4}, Lx1/n1$b;->S(I)Lx1/n1$b;

    move-result-object v1

    iget v4, p0, Lx1/n1;->F:F

    invoke-virtual {v1, v4}, Lx1/n1$b;->R(F)Lx1/n1$b;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p2, v3}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    :cond_5
    iget v1, p0, Lx1/n1;->L:I

    if-eq v1, v5, :cond_6

    if-ne v0, v2, :cond_6

    invoke-virtual {p2, v1}, Lx1/n1$b;->J(I)Lx1/n1$b;

    :cond_6
    iget-object p0, p0, Lx1/n1;->w:Lp2/a;

    if-eqz p0, :cond_8

    iget-object p1, p1, Lx1/n1;->w:Lp2/a;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p0}, Lp2/a;->b(Lp2/a;)Lp2/a;

    move-result-object p0

    :cond_7
    invoke-virtual {p2, p0}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    :cond_8
    invoke-virtual {p2}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object p0

    return-object p0
.end method

.method private G(I)V
    .locals 7

    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lu3/a;->f(Z)V

    :goto_0
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, -0x1

    if-ge p1, v0, :cond_1

    invoke-direct {p0, p1}, Le3/p;->A(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_1
    if-ne p1, v1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0}, Le3/p;->K()Le3/i;

    move-result-object v0

    iget-wide v5, v0, Lb3/f;->h:J

    invoke-direct {p0, p1}, Le3/p;->H(I)Le3/i;

    move-result-object p1

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-wide v0, p0, Le3/p;->c0:J

    iput-wide v0, p0, Le3/p;->d0:J

    goto :goto_2

    :cond_3
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-static {v0}, Lg5/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    invoke-virtual {v0}, Le3/i;->o()V

    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Le3/p;->g0:Z

    iget-object v1, p0, Le3/p;->x:Lz2/b0$a;

    iget v2, p0, Le3/p;->N:I

    iget-wide v3, p1, Lb3/f;->g:J

    invoke-virtual/range {v1 .. v6}, Lz2/b0$a;->D(IJJ)V

    return-void
.end method

.method private H(I)Le3/i;
    .locals 3

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    iget-object v1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v1, p1, v2}, Lu3/n0;->M0(Ljava/util/List;II)V

    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Le3/i;->m(I)I

    move-result v1

    iget-object v2, p0, Le3/p;->I:[Le3/p$d;

    aget-object v2, v2, p1

    invoke-virtual {v2, v1}, Lz2/m0;->u(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private I(Le3/i;)Z
    .locals 4

    iget p1, p1, Le3/i;->k:I

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Le3/p;->a0:[Z

    aget-boolean v3, v3, v2

    if-eqz v3, :cond_0

    iget-object v3, p0, Le3/p;->I:[Le3/p$d;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lz2/m0;->Q()I

    move-result v3

    if-ne v3, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private static J(Lx1/n1;Lx1/n1;)Z
    .locals 6

    iget-object v0, p0, Lx1/n1;->y:Ljava/lang/String;

    iget-object v1, p1, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v0}, Lu3/v;->k(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eq v2, v5, :cond_1

    invoke-static {v1}, Lu3/v;->k(Ljava/lang/String;)I

    move-result p0

    if-ne v2, p0, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    return v3

    :cond_1
    invoke-static {v0, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v4

    :cond_2
    const-string v1, "application/cea-608"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "application/cea-708"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    return v3

    :cond_4
    :goto_1
    iget p0, p0, Lx1/n1;->Q:I

    iget p1, p1, Lx1/n1;->Q:I

    if-ne p0, p1, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_2
    return v3
.end method

.method private K()Le3/i;
    .locals 2

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    return-object v0
.end method

.method private L(II)Lc2/e0;
    .locals 3

    sget-object v0, Le3/p;->l0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lu3/a;->a(Z)V

    iget-object v0, p0, Le3/p;->L:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Le3/p;->K:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le3/p;->J:[I

    aput p1, v1, v0

    :cond_1
    iget-object v1, p0, Le3/p;->J:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_2

    iget-object p1, p0, Le3/p;->I:[Le3/p$d;

    aget-object p1, p1, v0

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Le3/p;->C(II)Lc2/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private static M(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method private N(Le3/i;)V
    .locals 6

    iput-object p1, p0, Le3/p;->k0:Le3/i;

    iget-object v0, p1, Lb3/f;->d:Lx1/n1;

    iput-object v0, p0, Le3/p;->S:Lx1/n1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Le3/p;->d0:J

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lg5/q;->D()Lg5/q$a;

    move-result-object v0

    iget-object v1, p0, Le3/p;->I:[Le3/p$d;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lz2/m0;->G()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Lg5/q$a;->f(Ljava/lang/Object;)Lg5/q$a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lg5/q$a;->h()Lg5/q;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Le3/i;->n(Le3/p;Lg5/q;)V

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v0

    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v2, v0, v3

    invoke-virtual {v2, p1}, Le3/p$d;->j0(Le3/i;)V

    iget-boolean v4, p1, Le3/i;->n:Z

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lz2/m0;->g0()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private static O(Lb3/f;)Z
    .locals 0

    instance-of p0, p0, Le3/i;

    return p0
.end method

.method private P()Z
    .locals 4

    iget-wide v0, p0, Le3/p;->d0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private S()V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroupToSampleQueueIndex"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackGroups"
        }
    .end annotation

    iget-object v0, p0, Le3/p;->V:Lz2/v0;

    iget v0, v0, Lz2/v0;->n:I

    new-array v1, v0, [I

    iput-object v1, p0, Le3/p;->X:[I

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    move v3, v1

    :goto_1
    iget-object v4, p0, Le3/p;->I:[Le3/p$d;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lz2/m0;->F()Lx1/n1;

    move-result-object v4

    invoke-static {v4}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx1/n1;

    iget-object v5, p0, Le3/p;->V:Lz2/v0;

    invoke-virtual {v5, v2}, Lz2/v0;->b(I)Lz2/t0;

    move-result-object v5

    invoke-virtual {v5, v1}, Lz2/t0;->b(I)Lx1/n1;

    move-result-object v5

    invoke-static {v4, v5}, Le3/p;->J(Lx1/n1;Lx1/n1;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Le3/p;->X:[I

    aput v3, v4, v2

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le3/p;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le3/l;

    invoke-virtual {v1}, Le3/l;->a()V

    goto :goto_3

    :cond_3
    return-void
.end method

.method private T()V
    .locals 4

    iget-boolean v0, p0, Le3/p;->U:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Le3/p;->X:[I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Le3/p;->P:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lz2/m0;->F()Lx1/n1;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le3/p;->V:Lz2/v0;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Le3/p;->S()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Le3/p;->z()V

    invoke-direct {p0}, Le3/p;->l0()V

    iget-object v0, p0, Le3/p;->p:Le3/p$b;

    invoke-interface {v0}, Le3/p$b;->b()V

    :cond_4
    :goto_1
    return-void
.end method

.method private c0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Le3/p;->P:Z

    invoke-direct {p0}, Le3/p;->T()V

    return-void
.end method

.method private g0()V
    .locals 6

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-boolean v5, p0, Le3/p;->e0:Z

    invoke-virtual {v4, v5}, Lz2/m0;->W(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Le3/p;->e0:Z

    return-void
.end method

.method private h0(J)Z
    .locals 4

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Le3/p;->I:[Le3/p$d;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lz2/m0;->Z(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Le3/p;->b0:[Z

    aget-boolean v3, v3, v2

    if-nez v3, :cond_0

    iget-boolean v3, p0, Le3/p;->Z:Z

    if-nez v3, :cond_1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private l0()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Le3/p;->Q:Z

    return-void
.end method

.method private q0([Lz2/n0;)V
    .locals 4

    iget-object v0, p0, Le3/p;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    if-eqz v2, :cond_0

    iget-object v3, p0, Le3/p;->F:Ljava/util/ArrayList;

    check-cast v2, Le3/l;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic v(Le3/p;)V
    .locals 0

    invoke-direct {p0}, Le3/p;->c0()V

    return-void
.end method

.method public static synthetic w(Le3/p;)V
    .locals 0

    invoke-direct {p0}, Le3/p;->T()V

    return-void
.end method

.method private x()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups"
        }
    .end annotation

    iget-boolean v0, p0, Le3/p;->Q:Z

    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-object v0, p0, Le3/p;->V:Lz2/v0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le3/p;->W:Ljava/util/Set;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private z()V
    .locals 15
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackGroups",
            "optionalTrackGroups",
            "trackGroupToSampleQueueIndex"
        }
    .end annotation

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v0, v0

    const/4 v1, -0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v5, v1

    move v6, v2

    move v4, v3

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v4, v0, :cond_5

    iget-object v9, p0, Le3/p;->I:[Le3/p$d;

    aget-object v9, v9, v4

    invoke-virtual {v9}, Lz2/m0;->F()Lx1/n1;

    move-result-object v9

    invoke-static {v9}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lx1/n1;

    iget-object v9, v9, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v9}, Lu3/v;->s(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v9}, Lu3/v;->o(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v8

    goto :goto_1

    :cond_1
    invoke-static {v9}, Lu3/v;->r(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x3

    goto :goto_1

    :cond_2
    move v7, v1

    :goto_1
    invoke-static {v7}, Le3/p;->M(I)I

    move-result v8

    invoke-static {v5}, Le3/p;->M(I)I

    move-result v9

    if-le v8, v9, :cond_3

    move v6, v4

    move v5, v7

    goto :goto_2

    :cond_3
    if-ne v7, v5, :cond_4

    if-eq v6, v2, :cond_4

    move v6, v2

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    iget-object v1, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v1}, Le3/f;->j()Lz2/t0;

    move-result-object v1

    iget v4, v1, Lz2/t0;->n:I

    iput v2, p0, Le3/p;->Y:I

    new-array v2, v0, [I

    iput-object v2, p0, Le3/p;->X:[I

    move v2, v3

    :goto_3
    if-ge v2, v0, :cond_6

    iget-object v9, p0, Le3/p;->X:[I

    aput v2, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    new-array v2, v0, [Lz2/t0;

    move v9, v3

    :goto_4
    if-ge v9, v0, :cond_d

    iget-object v10, p0, Le3/p;->I:[Le3/p$d;

    aget-object v10, v10, v9

    invoke-virtual {v10}, Lz2/m0;->F()Lx1/n1;

    move-result-object v10

    invoke-static {v10}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lx1/n1;

    if-ne v9, v6, :cond_a

    new-array v11, v4, [Lx1/n1;

    move v12, v3

    :goto_5
    if-ge v12, v4, :cond_9

    invoke-virtual {v1, v12}, Lz2/t0;->b(I)Lx1/n1;

    move-result-object v13

    if-ne v5, v8, :cond_7

    iget-object v14, p0, Le3/p;->s:Lx1/n1;

    if-eqz v14, :cond_7

    invoke-virtual {v13, v14}, Lx1/n1;->j(Lx1/n1;)Lx1/n1;

    move-result-object v13

    :cond_7
    if-ne v4, v8, :cond_8

    invoke-virtual {v10, v13}, Lx1/n1;->j(Lx1/n1;)Lx1/n1;

    move-result-object v13

    goto :goto_6

    :cond_8
    invoke-static {v13, v10, v8}, Le3/p;->F(Lx1/n1;Lx1/n1;Z)Lx1/n1;

    move-result-object v13

    :goto_6
    aput-object v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_9
    new-instance v10, Lz2/t0;

    iget-object v12, p0, Le3/p;->n:Ljava/lang/String;

    invoke-direct {v10, v12, v11}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    aput-object v10, v2, v9

    iput v9, p0, Le3/p;->Y:I

    goto :goto_9

    :cond_a
    if-ne v5, v7, :cond_b

    iget-object v11, v10, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {v11}, Lu3/v;->o(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b

    iget-object v11, p0, Le3/p;->s:Lx1/n1;

    goto :goto_7

    :cond_b
    const/4 v11, 0x0

    :goto_7
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, p0, Le3/p;->n:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ":muxed:"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ge v9, v6, :cond_c

    move v13, v9

    goto :goto_8

    :cond_c
    add-int/lit8 v13, v9, -0x1

    :goto_8
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lz2/t0;

    new-array v14, v8, [Lx1/n1;

    invoke-static {v11, v10, v3}, Le3/p;->F(Lx1/n1;Lx1/n1;Z)Lx1/n1;

    move-result-object v10

    aput-object v10, v14, v3

    invoke-direct {v13, v12, v14}, Lz2/t0;-><init>(Ljava/lang/String;[Lx1/n1;)V

    aput-object v13, v2, v9

    :goto_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_d
    invoke-direct {p0, v2}, Le3/p;->E([Lz2/t0;)Lz2/v0;

    move-result-object v0

    iput-object v0, p0, Le3/p;->V:Lz2/v0;

    iget-object v0, p0, Le3/p;->W:Ljava/util/Set;

    if-nez v0, :cond_e

    move v3, v8

    :cond_e
    invoke-static {v3}, Lu3/a;->f(Z)V

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Le3/p;->W:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public B()V
    .locals 2

    iget-boolean v0, p0, Le3/p;->Q:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Le3/p;->c0:J

    invoke-virtual {p0, v0, v1}, Le3/p;->g(J)Z

    :cond_0
    return-void
.end method

.method public Q(I)Z
    .locals 1

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Le3/p;->g0:Z

    invoke-virtual {p1, v0}, Lz2/m0;->K(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public R()Z
    .locals 2

    iget v0, p0, Le3/p;->N:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public U()V
    .locals 1

    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->b()V

    iget-object v0, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v0}, Le3/f;->n()V

    return-void
.end method

.method public V(I)V
    .locals 1

    invoke-virtual {p0}, Le3/p;->U()V

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lz2/m0;->N()V

    return-void
.end method

.method public W(Lb3/f;JJZ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Le3/p;->H:Lb3/f;

    new-instance v2, Lz2/n;

    iget-wide v4, v1, Lb3/f;->a:J

    iget-object v6, v1, Lb3/f;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lb3/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lb3/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lb3/f;->c()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Le3/p;->v:Lt3/g0;

    iget-wide v4, v1, Lb3/f;->a:J

    invoke-interface {v3, v4, v5}, Lt3/g0;->c(J)V

    iget-object v3, v0, Le3/p;->x:Lz2/b0$a;

    iget v5, v1, Lb3/f;->c:I

    iget v6, v0, Le3/p;->o:I

    iget-object v7, v1, Lb3/f;->d:Lx1/n1;

    iget v8, v1, Lb3/f;->e:I

    iget-object v9, v1, Lb3/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lb3/f;->g:J

    iget-wide v12, v1, Lb3/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lz2/b0$a;->r(Lz2/n;IILx1/n1;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_2

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, v0, Le3/p;->R:I

    if-nez v1, :cond_1

    :cond_0
    invoke-direct {p0}, Le3/p;->g0()V

    :cond_1
    iget v1, v0, Le3/p;->R:I

    if-lez v1, :cond_2

    iget-object v1, v0, Le3/p;->p:Le3/p$b;

    invoke-interface {v1, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    :cond_2
    return-void
.end method

.method public X(Lb3/f;JJ)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput-object v2, v0, Le3/p;->H:Lb3/f;

    iget-object v2, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v2, v1}, Le3/f;->p(Lb3/f;)V

    new-instance v2, Lz2/n;

    iget-wide v4, v1, Lb3/f;->a:J

    iget-object v6, v1, Lb3/f;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lb3/f;->f()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lb3/f;->e()Ljava/util/Map;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lb3/f;->c()J

    move-result-wide v13

    move-object v3, v2

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget-object v3, v0, Le3/p;->v:Lt3/g0;

    iget-wide v4, v1, Lb3/f;->a:J

    invoke-interface {v3, v4, v5}, Lt3/g0;->c(J)V

    iget-object v3, v0, Le3/p;->x:Lz2/b0$a;

    iget v5, v1, Lb3/f;->c:I

    iget v6, v0, Le3/p;->o:I

    iget-object v7, v1, Lb3/f;->d:Lx1/n1;

    iget v8, v1, Lb3/f;->e:I

    iget-object v9, v1, Lb3/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lb3/f;->g:J

    iget-wide v12, v1, Lb3/f;->h:J

    move-object v4, v2

    invoke-virtual/range {v3 .. v13}, Lz2/b0$a;->u(Lz2/n;IILx1/n1;ILjava/lang/Object;JJ)V

    iget-boolean v1, v0, Le3/p;->Q:Z

    if-nez v1, :cond_0

    iget-wide v1, v0, Le3/p;->c0:J

    invoke-virtual {p0, v1, v2}, Le3/p;->g(J)Z

    goto :goto_0

    :cond_0
    iget-object v1, v0, Le3/p;->p:Le3/p$b;

    invoke-interface {v1, p0}, Lz2/o0$a;->k(Lz2/o0;)V

    :goto_0
    return-void
.end method

.method public Y(Lb3/f;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p6

    invoke-static/range {p1 .. p1}, Le3/p;->O(Lb3/f;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, Le3/i;

    invoke-virtual {v3}, Le3/i;->q()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v13, Lt3/c0;

    if-eqz v3, :cond_1

    move-object v3, v13

    check-cast v3, Lt3/c0;

    iget v3, v3, Lt3/c0;->q:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    :cond_0
    sget-object v1, Lt3/h0;->d:Lt3/h0$c;

    return-object v1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lb3/f;->c()J

    move-result-wide v3

    new-instance v5, Lz2/n;

    iget-wide v6, v1, Lb3/f;->a:J

    iget-object v8, v1, Lb3/f;->b:Lt3/p;

    invoke-virtual/range {p1 .. p1}, Lb3/f;->f()Landroid/net/Uri;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lb3/f;->e()Ljava/util/Map;

    move-result-object v19

    move-object v14, v5

    move-wide v15, v6

    move-object/from16 v17, v8

    move-wide/from16 v20, p2

    move-wide/from16 v22, p4

    move-wide/from16 v24, v3

    invoke-direct/range {v14 .. v25}, Lz2/n;-><init>(JLt3/p;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v6, Lz2/q;

    iget v7, v1, Lb3/f;->c:I

    iget v8, v0, Le3/p;->o:I

    iget-object v9, v1, Lb3/f;->d:Lx1/n1;

    iget v10, v1, Lb3/f;->e:I

    iget-object v11, v1, Lb3/f;->f:Ljava/lang/Object;

    iget-wide v14, v1, Lb3/f;->g:J

    invoke-static {v14, v15}, Lu3/n0;->Y0(J)J

    move-result-wide v26

    iget-wide v14, v1, Lb3/f;->h:J

    invoke-static {v14, v15}, Lu3/n0;->Y0(J)J

    move-result-wide v28

    move-object/from16 v20, v6

    move/from16 v21, v7

    move/from16 v22, v8

    move-object/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v25, v11

    invoke-direct/range {v20 .. v29}, Lz2/q;-><init>(IILx1/n1;ILjava/lang/Object;JJ)V

    new-instance v7, Lt3/g0$c;

    move/from16 v8, p7

    invoke-direct {v7, v5, v6, v13, v8}, Lt3/g0$c;-><init>(Lz2/n;Lz2/q;Ljava/io/IOException;I)V

    iget-object v6, v0, Le3/p;->v:Lt3/g0;

    iget-object v8, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v8}, Le3/f;->k()Ls3/t;

    move-result-object v8

    invoke-static {v8}, Ls3/b0;->c(Ls3/t;)Lt3/g0$a;

    move-result-object v8

    invoke-interface {v6, v8, v7}, Lt3/g0;->b(Lt3/g0$a;Lt3/g0$c;)Lt3/g0$b;

    move-result-object v6

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    iget v9, v6, Lt3/g0$b;->a:I

    const/4 v10, 0x2

    if-ne v9, v10, :cond_2

    iget-object v9, v0, Le3/p;->q:Le3/f;

    iget-wide v10, v6, Lt3/g0$b;->b:J

    invoke-virtual {v9, v1, v10, v11}, Le3/f;->m(Lb3/f;J)Z

    move-result v6

    move v15, v6

    goto :goto_0

    :cond_2
    move v15, v8

    :goto_0
    const/4 v6, 0x1

    if-eqz v15, :cond_6

    if-eqz v2, :cond_5

    const-wide/16 v9, 0x0

    cmp-long v2, v3, v9

    if-nez v2, :cond_5

    iget-object v2, v0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le3/i;

    if-ne v2, v1, :cond_3

    move v8, v6

    :cond_3
    invoke-static {v8}, Lu3/a;->f(Z)V

    iget-object v2, v0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-wide v2, v0, Le3/p;->c0:J

    iput-wide v2, v0, Le3/p;->d0:J

    goto :goto_1

    :cond_4
    iget-object v2, v0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-static {v2}, Lg5/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le3/i;

    invoke-virtual {v2}, Le3/i;->o()V

    :cond_5
    :goto_1
    sget-object v2, Lt3/h0;->f:Lt3/h0$c;

    :goto_2
    move-object/from16 v16, v2

    goto :goto_3

    :cond_6
    iget-object v2, v0, Le3/p;->v:Lt3/g0;

    invoke-interface {v2, v7}, Lt3/g0;->a(Lt3/g0$c;)J

    move-result-wide v2

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v9

    if-eqz v4, :cond_7

    invoke-static {v8, v2, v3}, Lt3/h0;->h(ZJ)Lt3/h0$c;

    move-result-object v2

    goto :goto_2

    :cond_7
    sget-object v2, Lt3/h0;->g:Lt3/h0$c;

    goto :goto_2

    :goto_3
    invoke-virtual/range {v16 .. v16}, Lt3/h0$c;->c()Z

    move-result v2

    xor-int/lit8 v17, v2, 0x1

    iget-object v2, v0, Le3/p;->x:Lz2/b0$a;

    iget v4, v1, Lb3/f;->c:I

    iget v6, v0, Le3/p;->o:I

    iget-object v7, v1, Lb3/f;->d:Lx1/n1;

    iget v8, v1, Lb3/f;->e:I

    iget-object v9, v1, Lb3/f;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lb3/f;->g:J

    iget-wide v12, v1, Lb3/f;->h:J

    move-object v3, v5

    move v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v9

    move-wide v9, v10

    move-wide v11, v12

    move-object/from16 v13, p6

    move/from16 v14, v17

    invoke-virtual/range {v2 .. v14}, Lz2/b0$a;->w(Lz2/n;IILx1/n1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v17, :cond_8

    const/4 v2, 0x0

    iput-object v2, v0, Le3/p;->H:Lb3/f;

    iget-object v2, v0, Le3/p;->v:Lt3/g0;

    iget-wide v3, v1, Lb3/f;->a:J

    invoke-interface {v2, v3, v4}, Lt3/g0;->c(J)V

    :cond_8
    if-eqz v15, :cond_a

    iget-boolean v1, v0, Le3/p;->Q:Z

    if-nez v1, :cond_9

    iget-wide v1, v0, Le3/p;->c0:J

    invoke-virtual {v0, v1, v2}, Le3/p;->g(J)Z

    goto :goto_4

    :cond_9
    iget-object v1, v0, Le3/p;->p:Le3/p$b;

    invoke-interface {v1, v0}, Lz2/o0$a;->k(Lz2/o0;)V

    :cond_a
    :goto_4
    return-object v16
.end method

.method public Z()V
    .locals 1

    iget-object v0, p0, Le3/p;->K:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    return v0
.end method

.method public a0(Landroid/net/Uri;Lt3/g0$c;Z)Z
    .locals 4

    iget-object v0, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v0, p1}, Le3/f;->o(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez p3, :cond_1

    iget-object p3, p0, Le3/p;->v:Lt3/g0;

    iget-object v0, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v0}, Le3/f;->k()Ls3/t;

    move-result-object v0

    invoke-static {v0}, Ls3/b0;->c(Ls3/t;)Lt3/g0$a;

    move-result-object v0

    invoke-interface {p3, v0, p2}, Lt3/g0;->b(Lt3/g0$a;Lt3/g0$c;)Lt3/g0$b;

    move-result-object p2

    if-eqz p2, :cond_1

    iget p3, p2, Lt3/g0$b;->a:I

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1

    iget-wide p2, p2, Lt3/g0$b;->b:J

    goto :goto_0

    :cond_1
    move-wide p2, v2

    :goto_0
    iget-object v0, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v0, p1, p2, p3}, Le3/f;->q(Landroid/net/Uri;J)Z

    move-result p1

    if-eqz p1, :cond_2

    cmp-long p1, p2, v2

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public b(Lx1/n1;)V
    .locals 1

    iget-object p1, p0, Le3/p;->E:Landroid/os/Handler;

    iget-object v0, p0, Le3/p;->C:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b0()V
    .locals 3

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-static {v0}, Lg5/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    iget-object v1, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v1, v0}, Le3/f;->c(Le3/i;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Le3/i;->v()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne v1, v0, :cond_2

    iget-boolean v0, p0, Le3/p;->g0:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->f()V

    :cond_2
    :goto_0
    return-void
.end method

.method public c()J
    .locals 2

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Le3/p;->d0:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Le3/p;->g0:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Le3/p;->K()Le3/i;

    move-result-object v0

    iget-wide v0, v0, Lb3/f;->h:J

    :goto_0
    return-wide v0
.end method

.method public d(II)Lc2/e0;
    .locals 3

    sget-object v0, Le3/p;->l0:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Le3/p;->L(II)Lc2/e0;

    move-result-object v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Le3/p;->I:[Le3/p$d;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Le3/p;->J:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_1

    aget-object v0, v1, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    iget-boolean v0, p0, Le3/p;->h0:Z

    if-eqz v0, :cond_3

    invoke-static {p1, p2}, Le3/p;->C(II)Lc2/k;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-direct {p0, p1, p2}, Le3/p;->D(II)Lz2/m0;

    move-result-object v0

    :cond_4
    const/4 p1, 0x5

    if-ne p2, p1, :cond_6

    iget-object p1, p0, Le3/p;->M:Lc2/e0;

    if-nez p1, :cond_5

    new-instance p1, Le3/p$c;

    iget p2, p0, Le3/p;->y:I

    invoke-direct {p1, v0, p2}, Le3/p$c;-><init>(Lc2/e0;I)V

    iput-object p1, p0, Le3/p;->M:Lc2/e0;

    :cond_5
    iget-object p1, p0, Le3/p;->M:Lc2/e0;

    return-object p1

    :cond_6
    return-object v0
.end method

.method public varargs d0([Lz2/t0;I[I)V
    .locals 4

    invoke-direct {p0, p1}, Le3/p;->E([Lz2/t0;)Lz2/v0;

    move-result-object p1

    iput-object p1, p0, Le3/p;->V:Lz2/v0;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Le3/p;->W:Ljava/util/Set;

    array-length p1, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget v1, p3, v0

    iget-object v2, p0, Le3/p;->W:Ljava/util/Set;

    iget-object v3, p0, Le3/p;->V:Lz2/v0;

    invoke-virtual {v3, v1}, Lz2/v0;->b(I)Lz2/t0;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, Le3/p;->Y:I

    iget-object p1, p0, Le3/p;->E:Landroid/os/Handler;

    iget-object p2, p0, Le3/p;->p:Le3/p$b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Le3/m;

    invoke-direct {p3, p2}, Le3/m;-><init>(Le3/p$b;)V

    invoke-virtual {p1, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0}, Le3/p;->l0()V

    return-void
.end method

.method public e(JLx1/q3;)J
    .locals 1

    iget-object v0, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v0, p1, p2, p3}, Le3/f;->b(JLx1/q3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public e0(ILx1/o1;La2/g;I)I
    .locals 11

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    move v0, v2

    :goto_0
    iget-object v3, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le3/i;

    invoke-direct {p0, v3}, Le3/p;->I(Le3/i;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-static {v3, v2, v0}, Lu3/n0;->M0(Ljava/util/List;II)V

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    iget-object v10, v0, Lb3/f;->d:Lx1/n1;

    iget-object v3, p0, Le3/p;->T:Lx1/n1;

    invoke-virtual {v10, v3}, Lx1/n1;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, Le3/p;->x:Lz2/b0$a;

    iget v4, p0, Le3/p;->o:I

    iget v6, v0, Lb3/f;->e:I

    iget-object v7, v0, Lb3/f;->f:Ljava/lang/Object;

    iget-wide v8, v0, Lb3/f;->g:J

    move-object v5, v10

    invoke-virtual/range {v3 .. v9}, Lz2/b0$a;->i(ILx1/n1;ILjava/lang/Object;J)V

    :cond_2
    iput-object v10, p0, Le3/p;->T:Lx1/n1;

    :cond_3
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    invoke-virtual {v0}, Le3/i;->q()Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Le3/p;->g0:Z

    invoke-virtual {v0, p2, p3, p4, v1}, Lz2/m0;->S(Lx1/o1;La2/g;IZ)I

    move-result p3

    const/4 p4, -0x5

    if-ne p3, p4, :cond_8

    iget-object p4, p2, Lx1/o1;->b:Lx1/n1;

    invoke-static {p4}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lx1/n1;

    iget v0, p0, Le3/p;->O:I

    if-ne p1, v0, :cond_7

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lz2/m0;->Q()I

    move-result p1

    :goto_1
    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    iget-object v0, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le3/i;

    iget v0, v0, Le3/i;->k:I

    if-eq v0, p1, :cond_5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    iget-object p1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v2, p1, :cond_6

    iget-object p1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le3/i;

    iget-object p1, p1, Lb3/f;->d:Lx1/n1;

    goto :goto_2

    :cond_6
    iget-object p1, p0, Le3/p;->S:Lx1/n1;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/n1;

    :goto_2
    invoke-virtual {p4, p1}, Lx1/n1;->j(Lx1/n1;)Lx1/n1;

    move-result-object p4

    :cond_7
    iput-object p4, p2, Lx1/o1;->b:Lx1/n1;

    :cond_8
    return p3
.end method

.method public f()J
    .locals 7

    iget-boolean v0, p0, Le3/p;->g0:Z

    if-eqz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Le3/p;->d0:J

    return-wide v0

    :cond_1
    iget-wide v0, p0, Le3/p;->c0:J

    invoke-direct {p0}, Le3/p;->K()Le3/i;

    move-result-object v2

    invoke-virtual {v2}, Le3/i;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    iget-object v2, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le3/i;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    iget-wide v2, v2, Lb3/f;->h:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_4
    iget-boolean v2, p0, Le3/p;->P:Z

    if-eqz v2, :cond_5

    iget-object v2, p0, Le3/p;->I:[Le3/p$d;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lz2/m0;->z()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    return-wide v0
.end method

.method public f0()V
    .locals 4

    iget-boolean v0, p0, Le3/p;->Q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lz2/m0;->R()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0, p0}, Lt3/h0;->m(Lt3/h0$f;)V

    iget-object v0, p0, Le3/p;->E:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le3/p;->U:Z

    iget-object v0, p0, Le3/p;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public g(J)Z
    .locals 23

    move-object/from16 v0, p0

    iget-boolean v1, v0, Le3/p;->g0:Z

    const/4 v2, 0x0

    if-nez v1, :cond_a

    iget-object v1, v0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v1}, Lt3/h0;->j()Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v1}, Lt3/h0;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-direct/range {p0 .. p0}, Le3/p;->P()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iget-wide v3, v0, Le3/p;->d0:J

    iget-object v5, v0, Le3/p;->I:[Le3/p$d;

    array-length v6, v5

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    iget-wide v9, v0, Le3/p;->d0:J

    invoke-virtual {v8, v9, v10}, Lz2/m0;->b0(J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Le3/p;->B:Ljava/util/List;

    invoke-direct/range {p0 .. p0}, Le3/p;->K()Le3/i;

    move-result-object v3

    invoke-virtual {v3}, Le3/i;->h()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v3, v3, Lb3/f;->h:J

    goto :goto_1

    :cond_2
    iget-wide v4, v0, Le3/p;->c0:J

    iget-wide v6, v3, Lb3/f;->g:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    :cond_3
    :goto_1
    move-object v10, v1

    move-wide v8, v3

    iget-object v1, v0, Le3/p;->z:Le3/f$b;

    invoke-virtual {v1}, Le3/f$b;->a()V

    iget-object v5, v0, Le3/p;->q:Le3/f;

    iget-boolean v1, v0, Le3/p;->Q:Z

    const/4 v3, 0x1

    if-nez v1, :cond_5

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move v11, v2

    goto :goto_3

    :cond_5
    :goto_2
    move v11, v3

    :goto_3
    iget-object v12, v0, Le3/p;->z:Le3/f$b;

    move-wide/from16 v6, p1

    invoke-virtual/range {v5 .. v12}, Le3/f;->e(JJLjava/util/List;ZLe3/f$b;)V

    iget-object v1, v0, Le3/p;->z:Le3/f$b;

    iget-boolean v4, v1, Le3/f$b;->b:Z

    iget-object v5, v1, Le3/f$b;->a:Lb3/f;

    iget-object v1, v1, Le3/f$b;->c:Landroid/net/Uri;

    if-eqz v4, :cond_6

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Le3/p;->d0:J

    iput-boolean v3, v0, Le3/p;->g0:Z

    return v3

    :cond_6
    if-nez v5, :cond_8

    if-eqz v1, :cond_7

    iget-object v3, v0, Le3/p;->p:Le3/p$b;

    invoke-interface {v3, v1}, Le3/p$b;->m(Landroid/net/Uri;)V

    :cond_7
    return v2

    :cond_8
    invoke-static {v5}, Le3/p;->O(Lb3/f;)Z

    move-result v1

    if-eqz v1, :cond_9

    move-object v1, v5

    check-cast v1, Le3/i;

    invoke-direct {v0, v1}, Le3/p;->N(Le3/i;)V

    :cond_9
    iput-object v5, v0, Le3/p;->H:Lb3/f;

    iget-object v1, v0, Le3/p;->w:Lt3/h0;

    iget-object v2, v0, Le3/p;->v:Lt3/g0;

    iget v4, v5, Lb3/f;->c:I

    invoke-interface {v2, v4}, Lt3/g0;->d(I)I

    move-result v2

    invoke-virtual {v1, v5, v0, v2}, Lt3/h0;->n(Lt3/h0$e;Lt3/h0$b;I)J

    move-result-wide v10

    iget-object v12, v0, Le3/p;->x:Lz2/b0$a;

    new-instance v13, Lz2/n;

    iget-wide v7, v5, Lb3/f;->a:J

    iget-object v9, v5, Lb3/f;->b:Lt3/p;

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, Lz2/n;-><init>(JLt3/p;J)V

    iget v14, v5, Lb3/f;->c:I

    iget v15, v0, Le3/p;->o:I

    iget-object v1, v5, Lb3/f;->d:Lx1/n1;

    iget v2, v5, Lb3/f;->e:I

    iget-object v4, v5, Lb3/f;->f:Ljava/lang/Object;

    iget-wide v6, v5, Lb3/f;->g:J

    iget-wide v8, v5, Lb3/f;->h:J

    move-object/from16 v16, v1

    move/from16 v17, v2

    move-object/from16 v18, v4

    move-wide/from16 v19, v6

    move-wide/from16 v21, v8

    invoke-virtual/range {v12 .. v22}, Lz2/b0$a;->A(Lz2/n;IILx1/n1;ILjava/lang/Object;JJ)V

    return v3

    :cond_a
    :goto_4
    return v2
.end method

.method public h(J)V
    .locals 4

    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->i()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v0}, Lt3/h0;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le3/p;->H:Lb3/f;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le3/p;->q:Le3/f;

    iget-object v1, p0, Le3/p;->H:Lb3/f;

    iget-object v2, p0, Le3/p;->B:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1, v2}, Le3/f;->v(JLb3/f;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->f()V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Le3/p;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    if-lez v0, :cond_3

    iget-object v1, p0, Le3/p;->q:Le3/f;

    iget-object v2, p0, Le3/p;->B:Ljava/util/List;

    add-int/lit8 v3, v0, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le3/i;

    invoke-virtual {v1, v2}, Le3/f;->c(Le3/i;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    iget-object v1, p0, Le3/p;->B:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-direct {p0, v0}, Le3/p;->G(I)V

    :cond_4
    iget-object v0, p0, Le3/p;->q:Le3/f;

    iget-object v1, p0, Le3/p;->B:Ljava/util/List;

    invoke-virtual {v0, p1, p2, v1}, Le3/f;->h(JLjava/util/List;)I

    move-result p1

    iget-object p2, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_5

    invoke-direct {p0, p1}, Le3/p;->G(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Le3/p;->h0:Z

    iget-object v0, p0, Le3/p;->E:Landroid/os/Handler;

    iget-object v1, p0, Le3/p;->D:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public i0(JZ)Z
    .locals 3

    iput-wide p1, p0, Le3/p;->c0:J

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Le3/p;->d0:J

    return v1

    :cond_0
    iget-boolean v0, p0, Le3/p;->P:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p3, :cond_1

    invoke-direct {p0, p1, p2}, Le3/p;->h0(J)Z

    move-result p3

    if-eqz p3, :cond_1

    return v2

    :cond_1
    iput-wide p1, p0, Le3/p;->d0:J

    iput-boolean v2, p0, Le3/p;->g0:Z

    iget-object p1, p0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->j()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Le3/p;->P:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Le3/p;->I:[Le3/p$d;

    array-length p2, p1

    :goto_0
    if-ge v2, p2, :cond_2

    aget-object p3, p1, v2

    invoke-virtual {p3}, Lz2/m0;->r()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->f()V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Le3/p;->w:Lt3/h0;

    invoke-virtual {p1}, Lt3/h0;->g()V

    invoke-direct {p0}, Le3/p;->g0()V

    :goto_1
    return v1
.end method

.method public j0([Ls3/t;[Z[Lz2/n0;[ZJZ)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-wide/from16 v12, p5

    invoke-direct/range {p0 .. p0}, Le3/p;->x()V

    iget v3, v0, Le3/p;->R:I

    const/4 v14, 0x0

    move v4, v14

    :goto_0
    array-length v5, v1

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-ge v4, v5, :cond_2

    aget-object v5, v2, v4

    check-cast v5, Le3/l;

    if-eqz v5, :cond_1

    aget-object v7, v1, v4

    if-eqz v7, :cond_0

    aget-boolean v7, p2, v4

    if-nez v7, :cond_1

    :cond_0
    iget v7, v0, Le3/p;->R:I

    sub-int/2addr v7, v15

    iput v7, v0, Le3/p;->R:I

    invoke-virtual {v5}, Le3/l;->e()V

    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-nez p7, :cond_5

    iget-boolean v4, v0, Le3/p;->f0:Z

    if-eqz v4, :cond_3

    if-nez v3, :cond_4

    goto :goto_1

    :cond_3
    iget-wide v3, v0, Le3/p;->c0:J

    cmp-long v3, v12, v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v14

    goto :goto_2

    :cond_5
    :goto_1
    move v3, v15

    :goto_2
    iget-object v4, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v4}, Le3/f;->k()Ls3/t;

    move-result-object v4

    move/from16 v16, v3

    move-object v11, v4

    move v3, v14

    :goto_3
    array-length v5, v1

    if-ge v3, v5, :cond_a

    aget-object v5, v1, v3

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    iget-object v7, v0, Le3/p;->V:Lz2/v0;

    invoke-interface {v5}, Ls3/w;->d()Lz2/t0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lz2/v0;->c(Lz2/t0;)I

    move-result v7

    iget v8, v0, Le3/p;->Y:I

    if-ne v7, v8, :cond_7

    iget-object v8, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v8, v5}, Le3/f;->u(Ls3/t;)V

    move-object v11, v5

    :cond_7
    aget-object v5, v2, v3

    if-nez v5, :cond_9

    iget v5, v0, Le3/p;->R:I

    add-int/2addr v5, v15

    iput v5, v0, Le3/p;->R:I

    new-instance v5, Le3/l;

    invoke-direct {v5, v0, v7}, Le3/l;-><init>(Le3/p;I)V

    aput-object v5, v2, v3

    aput-boolean v15, p4, v3

    iget-object v5, v0, Le3/p;->X:[I

    if-eqz v5, :cond_9

    aget-object v5, v2, v3

    check-cast v5, Le3/l;

    invoke-virtual {v5}, Le3/l;->a()V

    if-nez v16, :cond_9

    iget-object v5, v0, Le3/p;->I:[Le3/p$d;

    iget-object v8, v0, Le3/p;->X:[I

    aget v7, v8, v7

    aget-object v5, v5, v7

    invoke-virtual {v5, v12, v13, v15}, Lz2/m0;->Z(JZ)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-virtual {v5}, Lz2/m0;->C()I

    move-result v5

    if-eqz v5, :cond_8

    move v5, v15

    goto :goto_4

    :cond_8
    move v5, v14

    :goto_4
    move/from16 v16, v5

    :cond_9
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    iget v1, v0, Le3/p;->R:I

    if-nez v1, :cond_d

    iget-object v1, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v1}, Le3/f;->r()V

    iput-object v6, v0, Le3/p;->T:Lx1/n1;

    iput-boolean v15, v0, Le3/p;->e0:Z

    iget-object v1, v0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v1}, Lt3/h0;->j()Z

    move-result v1

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Le3/p;->P:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, Le3/p;->I:[Le3/p$d;

    array-length v3, v1

    :goto_6
    if-ge v14, v3, :cond_b

    aget-object v4, v1, v14

    invoke-virtual {v4}, Lz2/m0;->r()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    :cond_b
    iget-object v1, v0, Le3/p;->w:Lt3/h0;

    invoke-virtual {v1}, Lt3/h0;->f()V

    goto/16 :goto_b

    :cond_c
    invoke-direct/range {p0 .. p0}, Le3/p;->g0()V

    goto/16 :goto_b

    :cond_d
    iget-object v1, v0, Le3/p;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-static {v11, v4}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    iget-boolean v1, v0, Le3/p;->f0:Z

    if-nez v1, :cond_10

    const-wide/16 v3, 0x0

    cmp-long v1, v12, v3

    if-gez v1, :cond_e

    neg-long v3, v12

    :cond_e
    move-wide v6, v3

    invoke-direct/range {p0 .. p0}, Le3/p;->K()Le3/i;

    move-result-object v1

    iget-object v3, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v3, v1, v12, v13}, Le3/f;->a(Le3/i;J)[Lb3/o;

    move-result-object v17

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v10, v0, Le3/p;->B:Ljava/util/List;

    move-object v3, v11

    move-wide/from16 v4, p5

    move-object/from16 v18, v11

    move-object/from16 v11, v17

    invoke-interface/range {v3 .. v11}, Ls3/t;->m(JJJLjava/util/List;[Lb3/o;)V

    iget-object v3, v0, Le3/p;->q:Le3/f;

    invoke-virtual {v3}, Le3/f;->j()Lz2/t0;

    move-result-object v3

    iget-object v1, v1, Lb3/f;->d:Lx1/n1;

    invoke-virtual {v3, v1}, Lz2/t0;->c(Lx1/n1;)I

    move-result v1

    invoke-interface/range {v18 .. v18}, Ls3/t;->o()I

    move-result v3

    if-eq v3, v1, :cond_f

    goto :goto_7

    :cond_f
    move v1, v14

    goto :goto_8

    :cond_10
    :goto_7
    move v1, v15

    :goto_8
    if-eqz v1, :cond_11

    iput-boolean v15, v0, Le3/p;->e0:Z

    move v1, v15

    move/from16 v16, v1

    goto :goto_9

    :cond_11
    move/from16 v1, p7

    :goto_9
    if-eqz v16, :cond_13

    invoke-virtual {v0, v12, v13, v1}, Le3/p;->i0(JZ)Z

    :goto_a
    array-length v1, v2

    if-ge v14, v1, :cond_13

    aget-object v1, v2, v14

    if-eqz v1, :cond_12

    aput-boolean v15, p4, v14

    :cond_12
    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_13
    :goto_b
    invoke-direct {v0, v2}, Le3/p;->q0([Lz2/n0;)V

    iput-boolean v15, v0, Le3/p;->f0:Z

    return v16
.end method

.method public k()V
    .locals 4

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lz2/m0;->T()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k0(Lb2/m;)V
    .locals 3

    iget-object v0, p0, Le3/p;->j0:Lb2/m;

    invoke-static {v0, p1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Le3/p;->j0:Lb2/m;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Le3/p;->I:[Le3/p$d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Le3/p;->b0:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Le3/p$d;->i0(Lb2/m;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic m(Lt3/h0$e;JJLjava/io/IOException;I)Lt3/h0$c;
    .locals 0

    check-cast p1, Lb3/f;

    invoke-virtual/range {p0 .. p7}, Le3/p;->Y(Lb3/f;JJLjava/io/IOException;I)Lt3/h0$c;

    move-result-object p1

    return-object p1
.end method

.method public m0(Z)V
    .locals 1

    iget-object v0, p0, Le3/p;->q:Le3/f;

    invoke-virtual {v0, p1}, Le3/f;->t(Z)V

    return-void
.end method

.method public n0(J)V
    .locals 4

    iget-wide v0, p0, Le3/p;->i0:J

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Le3/p;->i0:J

    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lz2/m0;->a0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o()Lz2/v0;
    .locals 1

    invoke-direct {p0}, Le3/p;->x()V

    iget-object v0, p0, Le3/p;->V:Lz2/v0;

    return-object v0
.end method

.method public o0(IJ)I
    .locals 2

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    aget-object v0, v0, p1

    iget-boolean v1, p0, Le3/p;->g0:Z

    invoke-virtual {v0, p2, p3, v1}, Lz2/m0;->E(JZ)I

    move-result p2

    iget-object p3, p0, Le3/p;->A:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {p3, v1}, Lg5/t;->d(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Le3/i;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Le3/i;->q()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lz2/m0;->C()I

    move-result v1

    invoke-virtual {p3, p1}, Le3/i;->m(I)I

    move-result p1

    sub-int/2addr p1, v1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_1
    invoke-virtual {v0, p2}, Lz2/m0;->e0(I)V

    return p2
.end method

.method public p(Lc2/b0;)V
    .locals 0

    return-void
.end method

.method public p0(I)V
    .locals 2

    invoke-direct {p0}, Le3/p;->x()V

    iget-object v0, p0, Le3/p;->X:[I

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le3/p;->X:[I

    aget p1, v0, p1

    iget-object v0, p0, Le3/p;->a0:[Z

    aget-boolean v0, v0, p1

    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-object v0, p0, Le3/p;->a0:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p1

    return-void
.end method

.method public q()V
    .locals 2

    invoke-virtual {p0}, Le3/p;->U()V

    iget-boolean v0, p0, Le3/p;->g0:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Le3/p;->Q:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Loading finished before preparation is complete."

    invoke-static {v1, v0}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public r(JZ)V
    .locals 4

    iget-boolean v0, p0, Le3/p;->P:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le3/p;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Le3/p;->I:[Le3/p$d;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Le3/p;->I:[Le3/p$d;

    aget-object v2, v2, v1

    iget-object v3, p0, Le3/p;->a0:[Z

    aget-boolean v3, v3, v1

    invoke-virtual {v2, p1, p2, p3, v3}, Lz2/m0;->q(JZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Lt3/h0$e;JJ)V
    .locals 0

    check-cast p1, Lb3/f;

    invoke-virtual/range {p0 .. p5}, Le3/p;->X(Lb3/f;JJ)V

    return-void
.end method

.method public bridge synthetic u(Lt3/h0$e;JJZ)V
    .locals 0

    check-cast p1, Lb3/f;

    invoke-virtual/range {p0 .. p6}, Le3/p;->W(Lb3/f;JJZ)V

    return-void
.end method

.method public y(I)I
    .locals 3

    invoke-direct {p0}, Le3/p;->x()V

    iget-object v0, p0, Le3/p;->X:[I

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le3/p;->X:[I

    aget v0, v0, p1

    const/4 v1, -0x2

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Le3/p;->W:Ljava/util/Set;

    iget-object v2, p0, Le3/p;->V:Lz2/v0;

    invoke-virtual {v2, p1}, Lz2/v0;->b(I)Lz2/t0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, -0x3

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Le3/p;->a0:[Z

    aget-boolean v2, p1, v0

    if-eqz v2, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x1

    aput-boolean v1, p1, v0

    return v0
.end method
