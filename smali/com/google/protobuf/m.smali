.class final Lcom/google/protobuf/m;
.super Lcom/google/protobuf/c;
.source ""

# interfaces
.implements Lcom/google/protobuf/a0$b;
.implements Ljava/util/RandomAccess;
.implements Lcom/google/protobuf/b1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/c<",
        "Ljava/lang/Double;",
        ">;",
        "Lcom/google/protobuf/a0$b;",
        "Ljava/util/RandomAccess;",
        "Lcom/google/protobuf/b1;"
    }
.end annotation


# static fields
.field private static final q:Lcom/google/protobuf/m;


# instance fields
.field private o:[D

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/protobuf/m;

    const/4 v1, 0x0

    new-array v2, v1, [D

    invoke-direct {v0, v2, v1}, Lcom/google/protobuf/m;-><init>([DI)V

    sput-object v0, Lcom/google/protobuf/m;->q:Lcom/google/protobuf/m;

    invoke-virtual {v0}, Lcom/google/protobuf/c;->m()V

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    new-array v0, v0, [D

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/protobuf/m;-><init>([DI)V

    return-void
.end method

.method private constructor <init>([DI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/c;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/m;->o:[D

    iput p2, p0, Lcom/google/protobuf/m;->p:I

    return-void
.end method

.method private C(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Size:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/google/protobuf/m;->p:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l(ID)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/protobuf/c;->d()V

    if-ltz p1, :cond_1

    iget v0, p0, Lcom/google/protobuf/m;->p:I

    if-gt p1, v0, :cond_1

    iget-object v1, p0, Lcom/google/protobuf/m;->o:[D

    array-length v2, v1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [D

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lcom/google/protobuf/m;->o:[D

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lcom/google/protobuf/m;->p:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lcom/google/protobuf/m;->o:[D

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    aput-wide p2, v0, p1

    iget p1, p0, Lcom/google/protobuf/m;->p:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/protobuf/m;->p:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/protobuf/m;->C(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private s(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/protobuf/m;->p:I

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0, p1}, Lcom/google/protobuf/m;->C(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public D(I)Lcom/google/protobuf/a0$b;
    .locals 2

    iget v0, p0, Lcom/google/protobuf/m;->p:I

    if-lt p1, v0, :cond_0

    new-instance v0, Lcom/google/protobuf/m;

    iget-object v1, p0, Lcom/google/protobuf/m;->o:[D

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object p1

    iget v1, p0, Lcom/google/protobuf/m;->p:I

    invoke-direct {v0, p1, v1}, Lcom/google/protobuf/m;-><init>([DI)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public E(I)Ljava/lang/Double;
    .locals 5

    invoke-virtual {p0}, Lcom/google/protobuf/c;->d()V

    invoke-direct {p0, p1}, Lcom/google/protobuf/m;->s(I)V

    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    aget-wide v1, v0, p1

    iget v3, p0, Lcom/google/protobuf/m;->p:I

    add-int/lit8 v4, v3, -0x1

    if-ge p1, v4, :cond_0

    add-int/lit8 v4, p1, 0x1

    sub-int/2addr v3, p1

    add-int/lit8 v3, v3, -0x1

    invoke-static {v0, v4, v0, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget p1, p0, Lcom/google/protobuf/m;->p:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/protobuf/m;->p:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public F(ILjava/lang/Double;)Ljava/lang/Double;
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/protobuf/m;->G(ID)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public G(ID)D
    .locals 3

    invoke-virtual {p0}, Lcom/google/protobuf/c;->d()V

    invoke-direct {p0, p1}, Lcom/google/protobuf/m;->s(I)V

    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    aget-wide v1, v0, p1

    aput-wide p2, v0, p1

    return-wide v1
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/m;->g(ILjava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m;->h(Ljava/lang/Double;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Double;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/c;->d()V

    invoke-static {p1}, Lcom/google/protobuf/a0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Lcom/google/protobuf/m;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/google/protobuf/c;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :cond_0
    check-cast p1, Lcom/google/protobuf/m;

    iget v0, p1, Lcom/google/protobuf/m;->p:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const v2, 0x7fffffff

    iget v3, p0, Lcom/google/protobuf/m;->p:I

    sub-int/2addr v2, v3

    if-lt v2, v0, :cond_3

    add-int/2addr v3, v0

    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    array-length v2, v0

    if-le v3, v2, :cond_2

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/m;->o:[D

    :cond_2
    iget-object v0, p1, Lcom/google/protobuf/m;->o:[D

    iget-object v2, p0, Lcom/google/protobuf/m;->o:[D

    iget v4, p0, Lcom/google/protobuf/m;->p:I

    iget p1, p1, Lcom/google/protobuf/m;->p:I

    invoke-static {v0, v1, v2, v4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v3, p0, Lcom/google/protobuf/m;->p:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    const/4 v0, 0x1

    add-int/2addr p1, v0

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return v0

    :cond_3
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/protobuf/m;

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Lcom/google/protobuf/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    check-cast p1, Lcom/google/protobuf/m;

    iget v1, p0, Lcom/google/protobuf/m;->p:I

    iget v2, p1, Lcom/google/protobuf/m;->p:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    iget-object p1, p1, Lcom/google/protobuf/m;->o:[D

    move v1, v3

    :goto_0
    iget v2, p0, Lcom/google/protobuf/m;->p:I

    if-ge v1, v2, :cond_4

    iget-object v2, p0, Lcom/google/protobuf/m;->o:[D

    aget-wide v4, v2, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    aget-wide v6, p1, v1

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v6

    cmp-long v2, v4, v6

    if-eqz v2, :cond_3

    return v3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public g(ILjava/lang/Double;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/protobuf/m;->l(ID)V

    return-void
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m;->v(I)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/Double;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/m;->k(D)V

    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/google/protobuf/m;->p:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/protobuf/m;->o:[D

    aget-wide v3, v2, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    mul-int/lit8 v0, v0, 0x1f

    invoke-static {v2, v3}, Lcom/google/protobuf/a0;->f(J)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public bridge synthetic i(I)Lcom/google/protobuf/a0$i;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m;->D(I)Lcom/google/protobuf/a0$b;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 7

    instance-of v0, p1, Ljava/lang/Double;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/protobuf/m;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    iget-object v4, p0, Lcom/google/protobuf/m;->o:[D

    aget-wide v5, v4, v0

    cmpl-double v4, v5, v2

    if-nez v4, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public k(D)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/protobuf/c;->d()V

    iget v0, p0, Lcom/google/protobuf/m;->p:I

    iget-object v1, p0, Lcom/google/protobuf/m;->o:[D

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v2, v0, 0x3

    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x1

    new-array v2, v2, [D

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p0, Lcom/google/protobuf/m;->o:[D

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    iget v1, p0, Lcom/google/protobuf/m;->p:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/protobuf/m;->p:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m;->E(I)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method protected removeRange(II)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/protobuf/c;->d()V

    if-lt p2, p1, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    iget v1, p0, Lcom/google/protobuf/m;->p:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lcom/google/protobuf/m;->p:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Lcom/google/protobuf/m;->p:I

    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "toIndex < fromIndex"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/m;->F(ILjava/lang/Double;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/m;->p:I

    return v0
.end method

.method public v(I)Ljava/lang/Double;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m;->x(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public x(I)D
    .locals 3

    invoke-direct {p0, p1}, Lcom/google/protobuf/m;->s(I)V

    iget-object v0, p0, Lcom/google/protobuf/m;->o:[D

    aget-wide v1, v0, p1

    return-wide v1
.end method
