.class final Lx1/h3;
.super Lx1/a;
.source ""


# instance fields
.field private final A:[Ljava/lang/Object;

.field private final B:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final v:I

.field private final w:I

.field private final x:[I

.field private final y:[I

.field private final z:[Lx1/y3;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lz2/p0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lx1/f2;",
            ">;",
            "Lz2/p0;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lx1/a;-><init>(ZLz2/p0;)V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    new-array v1, p2, [I

    iput-object v1, p0, Lx1/h3;->x:[I

    new-array v1, p2, [I

    iput-object v1, p0, Lx1/h3;->y:[I

    new-array v1, p2, [Lx1/y3;

    iput-object v1, p0, Lx1/h3;->z:[Lx1/y3;

    new-array p2, p2, [Ljava/lang/Object;

    iput-object p2, p0, Lx1/h3;->A:[Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lx1/h3;->B:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move p2, v0

    move v1, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/f2;

    iget-object v3, p0, Lx1/h3;->z:[Lx1/y3;

    invoke-interface {v2}, Lx1/f2;->b()Lx1/y3;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, p0, Lx1/h3;->y:[I

    aput v0, v3, v1

    iget-object v3, p0, Lx1/h3;->x:[I

    aput p2, v3, v1

    iget-object v3, p0, Lx1/h3;->z:[Lx1/y3;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lx1/y3;->t()I

    move-result v3

    add-int/2addr v0, v3

    iget-object v3, p0, Lx1/h3;->z:[Lx1/y3;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lx1/y3;->m()I

    move-result v3

    add-int/2addr p2, v3

    iget-object v3, p0, Lx1/h3;->A:[Ljava/lang/Object;

    invoke-interface {v2}, Lx1/f2;->a()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    iget-object v2, p0, Lx1/h3;->B:Ljava/util/HashMap;

    iget-object v3, p0, Lx1/h3;->A:[Ljava/lang/Object;

    aget-object v3, v3, v1

    add-int/lit8 v4, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    goto :goto_0

    :cond_0
    iput v0, p0, Lx1/h3;->v:I

    iput p2, p0, Lx1/h3;->w:I

    return-void
.end method


# virtual methods
.method protected B(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx1/h3;->A:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method protected D(I)I
    .locals 1

    iget-object v0, p0, Lx1/h3;->x:[I

    aget p1, v0, p1

    return p1
.end method

.method protected E(I)I
    .locals 1

    iget-object v0, p0, Lx1/h3;->y:[I

    aget p1, v0, p1

    return p1
.end method

.method protected H(I)Lx1/y3;
    .locals 1

    iget-object v0, p0, Lx1/h3;->z:[Lx1/y3;

    aget-object p1, v0, p1

    return-object p1
.end method

.method I()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/y3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/h3;->z:[Lx1/y3;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lx1/h3;->w:I

    return v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lx1/h3;->v:I

    return v0
.end method

.method protected w(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lx1/h3;->B:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method protected x(I)I
    .locals 2

    iget-object v0, p0, Lx1/h3;->x:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lu3/n0;->h([IIZZ)I

    move-result p1

    return p1
.end method

.method protected y(I)I
    .locals 2

    iget-object v0, p0, Lx1/h3;->y:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lu3/n0;->h([IIZZ)I

    move-result p1

    return p1
.end method
