.class Lj$/util/stream/k1;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/L0;


# instance fields
.field final a:[I

.field b:I


# direct methods
.method constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    long-to-int p1, p1

    new-array p1, p1, [I

    iput-object p1, p0, Lj$/util/stream/k1;->a:[I

    const/4 p1, 0x0

    iput p1, p0, Lj$/util/stream/k1;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>([I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/k1;->a:[I

    array-length p1, p1

    iput p1, p0, Lj$/util/stream/k1;->b:I

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->L(Lj$/util/stream/L0;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public count()J
    .locals 2

    iget v0, p0, Lj$/util/stream/k1;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public f(I)Lj$/util/stream/O0;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public bridge synthetic f(I)Lj$/util/stream/P0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lj$/util/stream/k1;->f(I)Lj$/util/stream/O0;

    const/4 p1, 0x0

    throw p1
.end method

.method public i(Ljava/lang/Object;I)V
    .locals 3

    check-cast p1, [I

    .line 1
    iget-object v0, p0, Lj$/util/stream/k1;->a:[I

    iget v1, p0, Lj$/util/stream/k1;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lj$/util/stream/k1;->a:[I

    array-length v1, v0

    iget v2, p0, Lj$/util/stream/k1;->b:I

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lj$/util/function/m;

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget v1, p0, Lj$/util/stream/k1;->b:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lj$/util/stream/k1;->a:[I

    aget v1, v1, v0

    invoke-interface {p1, v1}, Lj$/util/function/m;->d(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic m([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/k1;->s([Ljava/lang/Integer;I)V

    return-void
.end method

.method public synthetic n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic o(Lj$/util/function/n;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->G(Lj$/util/stream/O0;Lj$/util/function/n;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(JJLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lj$/util/stream/k1;->t(JJLj$/util/function/n;)Lj$/util/stream/L0;

    move-result-object p1

    return-object p1
.end method

.method public synthetic s([Ljava/lang/Integer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/D0;->I(Lj$/util/stream/L0;[Ljava/lang/Integer;I)V

    return-void
.end method

.method public spliterator()Lj$/util/F;
    .locals 4

    .line 1
    iget-object v0, p0, Lj$/util/stream/k1;->a:[I

    iget v1, p0, Lj$/util/stream/k1;->b:I

    const/4 v2, 0x0

    const/16 v3, 0x410

    .line 2
    invoke-static {v0, v2, v1, v3}, Lj$/util/W;->k([IIII)Lj$/util/B;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Lj$/util/H;
    .locals 4

    .line 3
    iget-object v0, p0, Lj$/util/stream/k1;->a:[I

    iget v1, p0, Lj$/util/stream/k1;->b:I

    const/4 v2, 0x0

    const/16 v3, 0x410

    .line 4
    invoke-static {v0, v2, v1, v3}, Lj$/util/W;->k([IIII)Lj$/util/B;

    move-result-object v0

    return-object v0
.end method

.method public synthetic t(JJLj$/util/function/n;)Lj$/util/stream/L0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/D0;->O(Lj$/util/stream/L0;JJ)Lj$/util/stream/L0;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lj$/util/stream/k1;->a:[I

    array-length v1, v1

    iget v2, p0, Lj$/util/stream/k1;->b:I

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lj$/util/stream/k1;->a:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "IntArrayNode[%d][%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
