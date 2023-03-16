.class public abstract Ls1/a;
.super Ls1/l3;
.source ""


# instance fields
.field private final p:I

.field private final q:Lu2/p0;

.field private final r:Z


# direct methods
.method public constructor <init>(ZLu2/p0;)V
    .locals 0

    invoke-direct {p0}, Ls1/l3;-><init>()V

    iput-boolean p1, p0, Ls1/a;->r:Z

    iput-object p2, p0, Ls1/a;->q:Lu2/p0;

    invoke-interface {p2}, Lu2/p0;->a()I

    move-result p1

    iput p1, p0, Ls1/a;->p:I

    return-void
.end method

.method public static A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Landroid/util/Pair;

    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    return-object p0
.end method

.method public static B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Landroid/util/Pair;

    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    return-object p0
.end method

.method public static D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method private G(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Ls1/a;->q:Lu2/p0;

    invoke-interface {p2, p1}, Lu2/p0;->c(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p2, p0, Ls1/a;->p:I

    add-int/lit8 p2, p2, -0x1

    if-ge p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method private H(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Ls1/a;->q:Lu2/p0;

    invoke-interface {p2, p1}, Lu2/p0;->f(I)I

    move-result p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method


# virtual methods
.method protected abstract C(I)Ljava/lang/Object;
.end method

.method protected abstract E(I)I
.end method

.method protected abstract F(I)I
.end method

.method protected abstract I(I)Ls1/l3;
.end method

.method public e(Z)I
    .locals 3

    iget v0, p0, Ls1/a;->p:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Ls1/a;->r:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move p1, v2

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Ls1/a;->q:Lu2/p0;

    invoke-interface {v0}, Lu2/p0;->e()I

    move-result v2

    :cond_2
    invoke-virtual {p0, v2}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, v2, p1}, Ls1/a;->G(IZ)I

    move-result v2

    if-ne v2, v1, :cond_2

    return v1

    :cond_3
    invoke-virtual {p0, v2}, Ls1/a;->F(I)I

    move-result v0

    invoke-virtual {p0, v2}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v1

    invoke-virtual {v1, p1}, Ls1/l3;->e(Z)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public final f(Ljava/lang/Object;)I
    .locals 3

    instance-of v0, p1, Landroid/util/Pair;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Ls1/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ls1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0}, Ls1/a;->x(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v2

    invoke-virtual {v2, p1}, Ls1/l3;->f(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ls1/a;->E(I)I

    move-result v0

    add-int v1, v0, p1

    :goto_0
    return v1
.end method

.method public g(Z)I
    .locals 3

    iget v0, p0, Ls1/a;->p:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Ls1/a;->r:Z

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Ls1/a;->q:Lu2/p0;

    invoke-interface {v0}, Lu2/p0;->g()I

    move-result v0

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, -0x1

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v2

    invoke-virtual {v2}, Ls1/l3;->u()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-direct {p0, v0, p1}, Ls1/a;->H(IZ)I

    move-result v0

    if-ne v0, v1, :cond_3

    return v1

    :cond_4
    invoke-virtual {p0, v0}, Ls1/a;->F(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v0

    invoke-virtual {v0, p1}, Ls1/l3;->g(Z)I

    move-result p1

    add-int/2addr v1, p1

    return v1
.end method

.method public i(IIZ)I
    .locals 5

    iget-boolean v0, p0, Ls1/a;->r:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, v2

    :cond_0
    move p3, v1

    :cond_1
    invoke-virtual {p0, p1}, Ls1/a;->z(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls1/a;->F(I)I

    move-result v3

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v4

    sub-int/2addr p1, v3

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    invoke-virtual {v4, p1, v1, p3}, Ls1/l3;->i(IIZ)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    add-int/2addr v3, p1

    return v3

    :cond_3
    invoke-direct {p0, v0, p3}, Ls1/a;->G(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, p3}, Ls1/a;->G(IZ)I

    move-result p1

    goto :goto_1

    :cond_4
    if-eq p1, v1, :cond_5

    invoke-virtual {p0, p1}, Ls1/a;->F(I)I

    move-result p2

    invoke-virtual {p0, p1}, Ls1/a;->I(I)Ls1/l3;

    move-result-object p1

    invoke-virtual {p1, p3}, Ls1/l3;->e(Z)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_5
    if-ne p2, v2, :cond_6

    invoke-virtual {p0, p3}, Ls1/a;->e(Z)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final k(ILs1/l3$b;Z)Ls1/l3$b;
    .locals 4

    invoke-virtual {p0, p1}, Ls1/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls1/a;->F(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls1/a;->E(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v3

    sub-int/2addr p1, v2

    invoke-virtual {v3, p1, p2, p3}, Ls1/l3;->k(ILs1/l3$b;Z)Ls1/l3$b;

    iget p1, p2, Ls1/l3$b;->p:I

    add-int/2addr p1, v1

    iput p1, p2, Ls1/l3$b;->p:I

    if-eqz p3, :cond_0

    invoke-virtual {p0, v0}, Ls1/a;->C(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p3, p2, Ls1/l3$b;->o:Ljava/lang/Object;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ls1/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p2, Ls1/l3$b;->o:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;
    .locals 3

    invoke-static {p1}, Ls1/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ls1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0}, Ls1/a;->x(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Ls1/a;->F(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget v0, p2, Ls1/l3$b;->p:I

    add-int/2addr v0, v2

    iput v0, p2, Ls1/l3$b;->p:I

    iput-object p1, p2, Ls1/l3$b;->o:Ljava/lang/Object;

    return-object p2
.end method

.method public p(IIZ)I
    .locals 5

    iget-boolean v0, p0, Ls1/a;->r:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, v2

    :cond_0
    move p3, v1

    :cond_1
    invoke-virtual {p0, p1}, Ls1/a;->z(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls1/a;->F(I)I

    move-result v3

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v4

    sub-int/2addr p1, v3

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    invoke-virtual {v4, p1, v1, p3}, Ls1/l3;->p(IIZ)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    add-int/2addr v3, p1

    return v3

    :cond_3
    invoke-direct {p0, v0, p3}, Ls1/a;->H(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v0

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, p3}, Ls1/a;->H(IZ)I

    move-result p1

    goto :goto_1

    :cond_4
    if-eq p1, v1, :cond_5

    invoke-virtual {p0, p1}, Ls1/a;->F(I)I

    move-result p2

    invoke-virtual {p0, p1}, Ls1/a;->I(I)Ls1/l3;

    move-result-object p1

    invoke-virtual {p1, p3}, Ls1/l3;->g(Z)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_5
    if-ne p2, v2, :cond_6

    invoke-virtual {p0, p3}, Ls1/a;->g(Z)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final q(I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, Ls1/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls1/a;->E(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v2

    sub-int/2addr p1, v1

    invoke-virtual {v2, p1}, Ls1/l3;->q(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0}, Ls1/a;->C(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ls1/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final s(ILs1/l3$d;J)Ls1/l3$d;
    .locals 4

    invoke-virtual {p0, p1}, Ls1/a;->z(I)I

    move-result v0

    invoke-virtual {p0, v0}, Ls1/a;->F(I)I

    move-result v1

    invoke-virtual {p0, v0}, Ls1/a;->E(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ls1/a;->I(I)Ls1/l3;

    move-result-object v3

    sub-int/2addr p1, v1

    invoke-virtual {v3, p1, p2, p3, p4}, Ls1/l3;->s(ILs1/l3$d;J)Ls1/l3$d;

    invoke-virtual {p0, v0}, Ls1/a;->C(I)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Ls1/l3$d;->E:Ljava/lang/Object;

    iget-object p4, p2, Ls1/l3$d;->n:Ljava/lang/Object;

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p2, Ls1/l3$d;->n:Ljava/lang/Object;

    invoke-static {p1, p3}, Ls1/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iput-object p1, p2, Ls1/l3$d;->n:Ljava/lang/Object;

    iget p1, p2, Ls1/l3$d;->B:I

    add-int/2addr p1, v2

    iput p1, p2, Ls1/l3$d;->B:I

    iget p1, p2, Ls1/l3$d;->C:I

    add-int/2addr p1, v2

    iput p1, p2, Ls1/l3$d;->C:I

    return-object p2
.end method

.method protected abstract x(Ljava/lang/Object;)I
.end method

.method protected abstract y(I)I
.end method

.method protected abstract z(I)I
.end method
