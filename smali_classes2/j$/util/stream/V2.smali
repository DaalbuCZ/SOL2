.class Lj$/util/stream/V2;
.super Lj$/util/stream/Z2;

# interfaces
.implements Lj$/util/function/m;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/Z2;-><init>()V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lj$/util/stream/Z2;-><init>(I)V

    return-void
.end method


# virtual methods
.method public B()Lj$/util/B;
    .locals 7

    new-instance v6, Lj$/util/stream/U2;

    iget v3, p0, Lj$/util/stream/e;->c:I

    iget v5, p0, Lj$/util/stream/e;->b:I

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/U2;-><init>(Lj$/util/stream/V2;IIII)V

    return-object v6
.end method

.method public a(Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/m;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/m;

    invoke-virtual {p0, p1}, Lj$/util/stream/Z2;->l(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj$/util/stream/V2;->B()Lj$/util/B;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/B;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "{0} calling SpinedBuffer.OfInt.forEach(Consumer)"

    invoke-static {p1, v0}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public d(I)V
    .locals 3

    invoke-virtual {p0}, Lj$/util/stream/Z2;->A()V

    iget-object v0, p0, Lj$/util/stream/Z2;->e:Ljava/lang/Object;

    check-cast v0, [I

    iget v1, p0, Lj$/util/stream/e;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj$/util/stream/e;->b:I

    aput p1, v0, v1

    return-void
.end method

.method public g(I)Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [I

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj$/util/stream/V2;->B()Lj$/util/B;

    move-result-object v0

    invoke-static {v0}, Lj$/util/W;->g(Lj$/util/B;)Lj$/util/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Lj$/util/H;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/V2;->B()Lj$/util/B;

    move-result-object v0

    return-object v0
.end method

.method protected t(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 1

    check-cast p1, [I

    check-cast p4, Lj$/util/function/m;

    :goto_0
    if-ge p2, p3, :cond_0

    .line 1
    aget v0, p1, p2

    invoke-interface {p4, v0}, Lj$/util/function/m;->d(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    invoke-virtual {p0}, Lj$/util/stream/Z2;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    array-length v1, v0

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/16 v7, 0xc8

    if-ge v1, v7, :cond_0

    new-array v1, v6, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v5

    array-length v5, v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v4

    iget v4, p0, Lj$/util/stream/e;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    const-string v0, "%s[length=%d, chunks=%d]%s"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v5

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v4

    iget v0, p0, Lj$/util/stream/e;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v3

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v2

    const-string v0, "%s[length=%d, chunks=%d]%s..."

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected u(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [I

    .line 1
    array-length p1, p1

    return p1
.end method

.method protected z(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p1, p1, [[I

    return-object p1
.end method
