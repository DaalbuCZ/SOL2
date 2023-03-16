.class public final synthetic Lj$/util/stream/t0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/stream/LongStream;


# instance fields
.field final synthetic a:Lj$/util/stream/u0;


# direct methods
.method private synthetic constructor <init>(Lj$/util/stream/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    return-void
.end method

.method public static synthetic A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/stream/t0;

    invoke-direct {v0, p0}, Lj$/util/stream/t0;-><init>(Lj$/util/stream/u0;)V

    return-object v0
.end method


# virtual methods
.method public allMatch(Ljava/util/function/LongPredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/b;->z(Ljava/util/function/LongPredicate;)Lj$/util/function/b;

    move-result-object p1

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    sget-object v1, Lj$/util/stream/A0;->ALL:Lj$/util/stream/A0;

    invoke-static {p1, v1}, Lj$/util/stream/D0;->B0(Lj$/util/function/b;Lj$/util/stream/A0;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public anyMatch(Ljava/util/function/LongPredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/b;->z(Ljava/util/function/LongPredicate;)Lj$/util/function/b;

    move-result-object p1

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    sget-object v1, Lj$/util/stream/A0;->ANY:Lj$/util/stream/A0;

    invoke-static {p1, v1}, Lj$/util/stream/D0;->B0(Lj$/util/function/b;Lj$/util/stream/A0;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public asDoubleStream()Ljava/util/stream/DoubleStream;
    .locals 7

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    move-object v3, v0

    check-cast v3, Lj$/util/stream/s0;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    new-instance v0, Lj$/util/stream/B;

    sget v1, Lj$/util/stream/e3;->p:I

    sget v2, Lj$/util/stream/e3;->n:I

    or-int v5, v1, v2

    const/4 v4, 0x3

    const/4 v6, 0x2

    move-object v1, v0

    move-object v2, v3

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/B;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;III)V

    .line 2
    invoke-static {v0}, Lj$/util/stream/G;->A(Lj$/util/stream/H;)Ljava/util/stream/DoubleStream;

    move-result-object v0

    return-object v0
.end method

.method public average()Ljava/util/OptionalDouble;
    .locals 6

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/m0;->a:Lj$/util/stream/m0;

    sget-object v2, Lj$/util/stream/k;->i:Lj$/util/stream/k;

    sget-object v3, Lj$/util/stream/K;->b:Lj$/util/stream/K;

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/s0;->b1(Lj$/util/function/A;Lj$/util/function/w;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    const/4 v2, 0x1

    aget-wide v2, v0, v2

    long-to-double v2, v2

    aget-wide v4, v0, v1

    long-to-double v0, v4

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Lj$/util/l;->d(D)Lj$/util/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj$/util/l;->a()Lj$/util/l;

    move-result-object v0

    .line 2
    :goto_0
    invoke-static {v0}, Lj$/util/a;->u(Lj$/util/l;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public boxed()Ljava/util/stream/Stream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/a;->q:Lj$/util/stream/a;

    invoke-virtual {v0, v1}, Lj$/util/stream/s0;->d1(Lj$/util/function/s;)Lj$/util/stream/Stream;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lj$/util/stream/b3;->A(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic close()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->close()V

    return-void
.end method

.method public synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/b;->C(Ljava/util/function/Supplier;)Lj$/util/function/A;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p2}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object p2, v1

    .line 2
    :goto_0
    invoke-static {p3}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p3

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0, p1, p2, p3}, Lj$/util/stream/s0;->b1(Lj$/util/function/A;Lj$/util/function/w;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public count()J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/a;->r:Lj$/util/stream/a;

    invoke-virtual {v0, v1}, Lj$/util/stream/s0;->c1(Lj$/util/function/t;)Lj$/util/stream/u0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0}, Lj$/util/stream/s0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public distinct()Ljava/util/stream/LongStream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/a;->q:Lj$/util/stream/a;

    invoke-virtual {v0, v1}, Lj$/util/stream/s0;->d1(Lj$/util/function/s;)Lj$/util/stream/Stream;

    move-result-object v0

    .line 2
    check-cast v0, Lj$/util/stream/i2;

    invoke-virtual {v0}, Lj$/util/stream/i2;->distinct()Lj$/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lj$/util/stream/a;->o:Lj$/util/stream/a;

    check-cast v0, Lj$/util/stream/i2;

    invoke-virtual {v0, v1}, Lj$/util/stream/i2;->t(Lj$/util/function/D;)Lj$/util/stream/u0;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public filter(Ljava/util/function/LongPredicate;)Ljava/util/stream/LongStream;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/b;->z(Ljava/util/function/LongPredicate;)Lj$/util/function/b;

    move-result-object v6

    move-object v3, v0

    check-cast v3, Lj$/util/stream/s0;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance p1, Lj$/util/stream/A;

    sget v5, Lj$/util/stream/e3;->t:I

    const/4 v4, 0x3

    const/4 v7, 0x4

    move-object v1, p1

    move-object v2, v3

    invoke-direct/range {v1 .. v7}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    .line 3
    invoke-static {p1}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public findAny()Ljava/util/OptionalLong;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    new-instance v7, Lj$/util/stream/M;

    invoke-static {}, Lj$/util/n;->a()Lj$/util/n;

    move-result-object v4

    sget-object v5, Lj$/util/stream/o;->c:Lj$/util/stream/o;

    sget-object v6, Lj$/util/stream/K;->a:Lj$/util/stream/K;

    const/4 v2, 0x0

    const/4 v3, 0x3

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/M;-><init>(ZILjava/lang/Object;Lj$/util/function/Predicate;Lj$/util/function/A;)V

    .line 2
    invoke-virtual {v0, v7}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/n;

    .line 3
    invoke-static {v0}, Lj$/util/a;->w(Lj$/util/n;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public findFirst()Ljava/util/OptionalLong;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    new-instance v7, Lj$/util/stream/M;

    invoke-static {}, Lj$/util/n;->a()Lj$/util/n;

    move-result-object v4

    sget-object v5, Lj$/util/stream/o;->c:Lj$/util/stream/o;

    sget-object v6, Lj$/util/stream/K;->a:Lj$/util/stream/K;

    const/4 v2, 0x1

    const/4 v3, 0x3

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/M;-><init>(ZILjava/lang/Object;Lj$/util/function/Predicate;Lj$/util/function/A;)V

    .line 2
    invoke-virtual {v0, v7}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/n;

    .line 3
    invoke-static {v0}, Lj$/util/a;->w(Lj$/util/n;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public flatMap(Ljava/util/function/LongFunction;)Ljava/util/stream/LongStream;
    .locals 9

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    move-object v7, p1

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p1}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object v7, v1

    .line 2
    :goto_0
    move-object v4, v0

    check-cast v4, Lj$/util/stream/s0;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance p1, Lj$/util/stream/A;

    const/4 v5, 0x3

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int/2addr v0, v1

    sget v1, Lj$/util/stream/e3;->t:I

    or-int v6, v0, v1

    const/4 v8, 0x3

    move-object v2, p1

    move-object v3, v4

    invoke-direct/range {v2 .. v8}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    .line 4
    invoke-static {p1}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public synthetic forEach(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/q;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/u0;->c(Lj$/util/function/r;)V

    return-void
.end method

.method public synthetic forEachOrdered(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/q;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/r;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/u0;->r(Lj$/util/function/r;)V

    return-void
.end method

.method public synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    return v0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0}, Lj$/util/stream/s0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Ljava/util/PrimitiveIterator$OfLong;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    invoke-virtual {v0}, Lj$/util/stream/s0;->f1()Lj$/util/D;

    move-result-object v0

    invoke-static {v0}, Lj$/util/W;->h(Lj$/util/D;)Lj$/util/w;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lj$/util/v;->a(Lj$/util/w;)Ljava/util/PrimitiveIterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public limit(J)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    .line 1
    invoke-static {v0, v1, v2, p1, p2}, Lj$/util/stream/D0;->A0(Lj$/util/stream/c;JJ)Lj$/util/stream/u0;

    move-result-object p1

    .line 2
    invoke-static {p1}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public synthetic map(Ljava/util/function/LongUnaryOperator;)Ljava/util/stream/LongStream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p1}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object p1, v1

    .line 2
    :goto_0
    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0, p1}, Lj$/util/stream/s0;->c1(Lj$/util/function/t;)Lj$/util/stream/u0;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public mapToDouble(Ljava/util/function/LongToDoubleFunction;)Ljava/util/stream/DoubleStream;
    .locals 9

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    move-object v7, p1

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p1}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object v7, v1

    .line 2
    :goto_0
    move-object v4, v0

    check-cast v4, Lj$/util/stream/s0;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance p1, Lj$/util/stream/x;

    const/4 v5, 0x3

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v6, v0, v1

    const/4 v8, 0x5

    move-object v2, p1

    move-object v3, v4

    invoke-direct/range {v2 .. v8}, Lj$/util/stream/x;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    .line 5
    invoke-static {p1}, Lj$/util/stream/G;->A(Lj$/util/stream/H;)Ljava/util/stream/DoubleStream;

    move-result-object p1

    return-object p1
.end method

.method public mapToInt(Ljava/util/function/LongToIntFunction;)Ljava/util/stream/IntStream;
    .locals 9

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    move-object v7, p1

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p1}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object v7, v1

    .line 2
    :goto_0
    move-object v4, v0

    check-cast v4, Lj$/util/stream/s0;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance p1, Lj$/util/stream/z;

    const/4 v5, 0x3

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v6, v0, v1

    const/4 v8, 0x5

    move-object v2, p1

    move-object v3, v4

    invoke-direct/range {v2 .. v8}, Lj$/util/stream/z;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    .line 5
    invoke-static {p1}, Lj$/util/stream/k0;->A(Lj$/util/stream/l0;)Ljava/util/stream/IntStream;

    move-result-object p1

    return-object p1
.end method

.method public synthetic mapToObj(Ljava/util/function/LongFunction;)Ljava/util/stream/Stream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p1}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object p1, v1

    .line 2
    :goto_0
    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0, p1}, Lj$/util/stream/s0;->d1(Lj$/util/function/s;)Lj$/util/stream/Stream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/b3;->A(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public max()Ljava/util/OptionalLong;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/k;->j:Lj$/util/stream/k;

    invoke-virtual {v0, v1}, Lj$/util/stream/s0;->e1(Lj$/util/function/p;)Lj$/util/n;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lj$/util/a;->w(Lj$/util/n;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public min()Ljava/util/OptionalLong;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/l;->g:Lj$/util/stream/l;

    invoke-virtual {v0, v1}, Lj$/util/stream/s0;->e1(Lj$/util/function/p;)Lj$/util/n;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lj$/util/a;->w(Lj$/util/n;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public noneMatch(Ljava/util/function/LongPredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/b;->z(Ljava/util/function/LongPredicate;)Lj$/util/function/b;

    move-result-object p1

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    sget-object v1, Lj$/util/stream/A0;->NONE:Lj$/util/stream/A0;

    invoke-static {p1, v1}, Lj$/util/stream/D0;->B0(Lj$/util/function/b;Lj$/util/stream/A0;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public synthetic onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->onClose(Ljava/lang/Runnable;)Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->A(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object p1

    return-object p1
.end method

.method public synthetic parallel()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->A(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallel()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-interface {v0}, Lj$/util/stream/u0;->parallel()Lj$/util/stream/u0;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public peek(Ljava/util/function/LongConsumer;)Ljava/util/stream/LongStream;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-static {p1}, Lj$/util/function/q;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/r;

    move-result-object v6

    move-object v3, v0

    check-cast v3, Lj$/util/stream/s0;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance p1, Lj$/util/stream/A;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v7, 0x5

    move-object v1, p1

    move-object v2, v3

    invoke-direct/range {v1 .. v7}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    .line 3
    invoke-static {p1}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1
.end method

.method public reduce(JLjava/util/function/LongBinaryOperator;)J
    .locals 3

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p3}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object p3, v1

    .line 2
    :goto_0
    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    new-instance v1, Lj$/util/stream/V1;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p3, p1, p2}, Lj$/util/stream/V1;-><init>(ILj$/util/function/p;J)V

    .line 5
    invoke-virtual {v0, v1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic reduce(Ljava/util/function/LongBinaryOperator;)Ljava/util/OptionalLong;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Lj$/util/function/b;

    invoke-direct {v1, p1}, Lj$/util/function/b;-><init>(Ljava/lang/Object;)V

    move-object p1, v1

    .line 7
    :goto_0
    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0, p1}, Lj$/util/stream/s0;->e1(Lj$/util/function/p;)Lj$/util/n;

    move-result-object p1

    invoke-static {p1}, Lj$/util/a;->w(Lj$/util/n;)Ljava/util/OptionalLong;

    move-result-object p1

    return-object p1
.end method

.method public synthetic sequential()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->A(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic sequential()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    invoke-interface {v0}, Lj$/util/stream/u0;->sequential()Lj$/util/stream/u0;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public skip(J)Ljava/util/stream/LongStream;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-ltz v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    .line 1
    invoke-static {v0, p1, p2, v1, v2}, Lj$/util/stream/D0;->A0(Lj$/util/stream/c;JJ)Lj$/util/stream/u0;

    move-result-object v0

    .line 2
    :goto_0
    invoke-static {v0}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object p1

    return-object p1

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public sorted()Ljava/util/stream/LongStream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    new-instance v1, Lj$/util/stream/K2;

    invoke-direct {v1, v0}, Lj$/util/stream/K2;-><init>(Lj$/util/stream/c;)V

    .line 2
    invoke-static {v1}, Lj$/util/stream/t0;->A(Lj$/util/stream/u0;)Ljava/util/stream/LongStream;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator$OfLong;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0}, Lj$/util/stream/s0;->f1()Lj$/util/D;

    move-result-object v0

    invoke-static {v0}, Lj$/util/C;->a(Lj$/util/D;)Ljava/util/Spliterator$OfLong;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    invoke-virtual {v0}, Lj$/util/stream/s0;->f1()Lj$/util/D;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lj$/util/G;->a(Lj$/util/H;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic sum()J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0}, Lj$/util/stream/s0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public summaryStatistics()Ljava/util/LongSummaryStatistics;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/l;->a:Lj$/util/stream/l;

    sget-object v2, Lj$/util/stream/a;->n:Lj$/util/stream/a;

    sget-object v3, Lj$/util/stream/J;->b:Lj$/util/stream/J;

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/s0;->b1(Lj$/util/function/A;Lj$/util/function/w;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/j;

    .line 2
    new-instance v0, Ljava/lang/Error;

    const-string v1, "Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toArray()[J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    .line 1
    sget-object v1, Lj$/util/stream/t;->c:Lj$/util/stream/t;

    invoke-virtual {v0, v1}, Lj$/util/stream/c;->M0(Lj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/N0;

    invoke-static {v0}, Lj$/util/stream/D0;->p0(Lj$/util/stream/N0;)Lj$/util/stream/N0;

    move-result-object v0

    invoke-interface {v0}, Lj$/util/stream/O0;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public synthetic unordered()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/t0;->a:Lj$/util/stream/u0;

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0}, Lj$/util/stream/s0;->unordered()Lj$/util/stream/h;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/g;->A(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method
