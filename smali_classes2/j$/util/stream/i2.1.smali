.class abstract Lj$/util/stream/i2;
.super Lj$/util/stream/c;

# interfaces
.implements Lj$/util/stream/Stream;


# static fields
.field public static final synthetic t:I


# direct methods
.method constructor <init>(Lj$/util/H;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/c;-><init>(Lj$/util/H;IZ)V

    return-void
.end method

.method constructor <init>(Lj$/util/stream/c;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/c;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method


# virtual methods
.method final C0(JLj$/util/function/n;)Lj$/util/stream/H0;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/D0;->X(JLj$/util/function/n;)Lj$/util/stream/H0;

    move-result-object p1

    return-object p1
.end method

.method final N0(Lj$/util/stream/D0;Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lj$/util/stream/D0;->Z(Lj$/util/stream/D0;Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1
.end method

.method final O0(Lj$/util/H;Lj$/util/stream/q2;)V
    .locals 1

    :cond_0
    invoke-interface {p2}, Lj$/util/stream/q2;->r()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lj$/util/H;->a(Lj$/util/function/Consumer;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method final P0()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method final Y0(Lj$/util/stream/D0;Lj$/util/function/A;Z)Lj$/util/H;
    .locals 1

    new-instance v0, Lj$/util/stream/J3;

    invoke-direct {v0, p1, p2, p3}, Lj$/util/stream/J3;-><init>(Lj$/util/stream/D0;Lj$/util/function/A;Z)V

    return-object v0
.end method

.method public a(Lj$/util/function/Consumer;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/X;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj$/util/stream/X;-><init>(Lj$/util/function/Consumer;Z)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    return-void
.end method

.method public final anyMatch(Lj$/util/function/Predicate;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/A0;->ANY:Lj$/util/stream/A0;

    invoke-static {p1, v0}, Lj$/util/stream/D0;->E0(Lj$/util/function/Predicate;Lj$/util/stream/A0;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final b(Lj$/util/function/Function;)Lj$/util/stream/l0;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/z;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int/2addr v0, v1

    sget v1, Lj$/util/stream/e3;->t:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x7

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/z;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final count()J
    .locals 2

    sget-object v0, Lj$/util/stream/k;->m:Lj$/util/stream/k;

    invoke-virtual {p0, v0}, Lj$/util/stream/i2;->t(Lj$/util/function/D;)Lj$/util/stream/u0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/s0;

    invoke-virtual {v0}, Lj$/util/stream/s0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lj$/util/function/Consumer;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/X;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/X;-><init>(Lj$/util/function/Consumer;Z)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    return-void
.end method

.method public final distinct()Lj$/util/stream/Stream;
    .locals 3

    .line 1
    new-instance v0, Lj$/util/stream/r;

    sget v1, Lj$/util/stream/e3;->m:I

    sget v2, Lj$/util/stream/e3;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2, v1}, Lj$/util/stream/r;-><init>(Lj$/util/stream/c;II)V

    return-object v0
.end method

.method public final e(Lj$/util/function/A;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/D0;->F0(Lj$/util/function/A;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final findAny()Lj$/util/k;
    .locals 7

    .line 1
    new-instance v6, Lj$/util/stream/M;

    invoke-static {}, Lj$/util/k;->a()Lj$/util/k;

    move-result-object v3

    sget-object v4, Lj$/util/stream/a;->i:Lj$/util/stream/a;

    sget-object v5, Lj$/util/stream/L;->a:Lj$/util/stream/L;

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/M;-><init>(ZILjava/lang/Object;Lj$/util/function/Predicate;Lj$/util/function/A;)V

    .line 2
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/k;

    return-object v0
.end method

.method public final findFirst()Lj$/util/k;
    .locals 7

    .line 1
    new-instance v6, Lj$/util/stream/M;

    invoke-static {}, Lj$/util/k;->a()Lj$/util/k;

    move-result-object v3

    sget-object v4, Lj$/util/stream/a;->i:Lj$/util/stream/a;

    sget-object v5, Lj$/util/stream/L;->a:Lj$/util/stream/L;

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/M;-><init>(ZILjava/lang/Object;Lj$/util/function/Predicate;Lj$/util/function/A;)V

    .line 2
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/k;

    return-object v0
.end method

.method public final g(Lj$/util/function/n;)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object v0

    invoke-static {v0, p1}, Lj$/util/stream/D0;->m0(Lj$/util/stream/P0;Lj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/stream/P0;->o(Lj$/util/function/n;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lj$/util/function/Predicate;)Lj$/util/stream/Stream;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/y;

    sget v4, Lj$/util/stream/e3;->t:I

    const/4 v3, 0x1

    const/4 v6, 0x4

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/y;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->spliterator()Lj$/util/H;

    move-result-object v0

    invoke-static {v0}, Lj$/util/W;->i(Lj$/util/H;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lj$/util/function/C;)Lj$/util/stream/l0;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/z;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x6

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/z;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final k(Lj$/util/function/Function;)Lj$/util/stream/Stream;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/e2;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/e2;-><init>(Lj$/util/stream/i2;Lj$/util/stream/c;IILj$/util/function/Function;I)V

    return-object v7
.end method

.method public final l(Lj$/util/stream/j;)Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lj$/util/stream/j;->a()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lj$/util/stream/i;->CONCURRENT:Lj$/util/stream/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lj$/util/stream/c;->Q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj$/util/stream/j;->a()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lj$/util/stream/i;->UNORDERED:Lj$/util/stream/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1
    :cond_0
    iget-object v0, p1, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {v0}, Ljava/util/stream/Collector;->supplier()Ljava/util/function/Supplier;

    move-result-object v0

    invoke-static {v0}, Lj$/util/function/b;->C(Ljava/util/function/Supplier;)Lj$/util/function/A;

    move-result-object v0

    .line 2
    check-cast v0, Lj$/util/function/b;

    invoke-virtual {v0}, Lj$/util/function/b;->get()Ljava/lang/Object;

    move-result-object v0

    .line 3
    iget-object v1, p1, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {v1}, Ljava/util/stream/Collector;->accumulator()Ljava/util/function/BiConsumer;

    move-result-object v1

    invoke-static {v1}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object v1

    .line 4
    new-instance v2, Lj$/util/stream/n;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v0, v3}, Lj$/util/stream/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v2}, Lj$/util/stream/i2;->a(Lj$/util/function/Consumer;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p1, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {v0}, Ljava/util/stream/Collector;->supplier()Ljava/util/function/Supplier;

    move-result-object v0

    invoke-static {v0}, Lj$/util/function/b;->C(Ljava/util/function/Supplier;)Lj$/util/function/A;

    move-result-object v5

    .line 7
    iget-object v0, p1, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {v0}, Ljava/util/stream/Collector;->accumulator()Ljava/util/function/BiConsumer;

    move-result-object v0

    invoke-static {v0}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object v4

    .line 8
    iget-object v0, p1, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {v0}, Ljava/util/stream/Collector;->combiner()Ljava/util/function/BinaryOperator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/function/b;->A(Ljava/util/function/BinaryOperator;)Lj$/util/function/c;

    move-result-object v3

    .line 9
    new-instance v0, Lj$/util/stream/O1;

    const/4 v2, 0x1

    move-object v1, v0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/O1;-><init>(ILj$/util/function/c;Lj$/util/function/BiConsumer;Lj$/util/function/A;Lj$/util/stream/j;)V

    .line 10
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Lj$/util/stream/j;->a()Ljava/util/Set;

    move-result-object v1

    sget-object v2, Lj$/util/stream/i;->IDENTITY_FINISH:Lj$/util/stream/i;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 11
    :cond_2
    iget-object p1, p1, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {p1}, Ljava/util/stream/Collector;->finisher()Ljava/util/function/Function;

    move-result-object p1

    invoke-static {p1}, Lj$/util/function/Function$VivifiedWrapper;->convert(Ljava/util/function/Function;)Lj$/util/function/Function;

    move-result-object p1

    .line 12
    invoke-interface {p1, v0}, Lj$/util/function/Function;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final limit(J)Lj$/util/stream/Stream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    invoke-static {p0, v0, v1, p1, p2}, Lj$/util/stream/D0;->D0(Lj$/util/stream/c;JJ)Lj$/util/stream/Stream;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(Lj$/util/function/Function;)Lj$/util/stream/Stream;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/e2;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int/2addr v0, v1

    sget v1, Lj$/util/stream/e3;->t:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x1

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/e2;-><init>(Lj$/util/stream/i2;Lj$/util/stream/c;IILj$/util/function/Function;I)V

    return-object v7
.end method

.method public final max(Ljava/util/Comparator;)Lj$/util/k;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/function/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj$/util/function/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/i2;->p(Lj$/util/function/c;)Lj$/util/k;

    move-result-object p1

    return-object p1
.end method

.method public final min(Ljava/util/Comparator;)Lj$/util/k;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/function/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/function/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/i2;->p(Lj$/util/function/c;)Lj$/util/k;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lj$/util/function/Consumer;)Lj$/util/stream/Stream;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/y;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x3

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/y;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final o(Lj$/util/function/Predicate;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/A0;->ALL:Lj$/util/stream/A0;

    invoke-static {p1, v0}, Lj$/util/stream/D0;->E0(Lj$/util/function/Predicate;Lj$/util/stream/A0;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final p(Lj$/util/function/c;)Lj$/util/k;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/J1;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, v1}, Lj$/util/stream/J1;-><init>(ILjava/lang/Object;I)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/k;

    return-object p1
.end method

.method public final q(Lj$/util/function/Function;)Lj$/util/stream/u0;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/A;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int/2addr v0, v1

    sget v1, Lj$/util/stream/e3;->t:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x6

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final s(Lj$/util/function/Predicate;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/A0;->NONE:Lj$/util/stream/A0;

    invoke-static {p1, v0}, Lj$/util/stream/D0;->E0(Lj$/util/function/Predicate;Lj$/util/stream/A0;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final skip(J)Lj$/util/stream/Stream;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    invoke-static {p0, p1, p2, v0, v1}, Lj$/util/stream/D0;->D0(Lj$/util/stream/c;JJ)Lj$/util/stream/Stream;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Lj$/util/stream/Stream;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/L2;

    invoke-direct {v0, p0}, Lj$/util/stream/L2;-><init>(Lj$/util/stream/c;)V

    return-object v0
.end method

.method public final sorted(Ljava/util/Comparator;)Lj$/util/stream/Stream;
    .locals 1

    .line 2
    new-instance v0, Lj$/util/stream/L2;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/L2;-><init>(Lj$/util/stream/c;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final t(Lj$/util/function/D;)Lj$/util/stream/u0;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/A;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x7

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    sget-object v0, Lj$/util/stream/I;->c:Lj$/util/stream/I;

    .line 1
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object v1

    invoke-static {v1, v0}, Lj$/util/stream/D0;->m0(Lj$/util/stream/P0;Lj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object v1

    invoke-interface {v1, v0}, Lj$/util/stream/P0;->o(Lj$/util/function/n;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final u(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/D0;->G0(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public unordered()Lj$/util/stream/h;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lj$/util/stream/c;->Q0()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lj$/util/stream/d2;

    const/4 v1, 0x1

    sget v2, Lj$/util/stream/e3;->r:I

    invoke-direct {v0, p0, p0, v1, v2}, Lj$/util/stream/d2;-><init>(Lj$/util/stream/i2;Lj$/util/stream/c;II)V

    :goto_0
    return-object v0
.end method

.method public final v(Lj$/util/function/B;)Lj$/util/stream/H;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/x;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x6

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/x;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final w(Lj$/util/function/Function;)Lj$/util/stream/H;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/x;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int/2addr v0, v1

    sget v1, Lj$/util/stream/e3;->t:I

    or-int v4, v0, v1

    const/4 v3, 0x1

    const/4 v6, 0x7

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/x;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final z(Ljava/lang/Object;Lj$/util/function/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2, p2}, Lj$/util/stream/D0;->G0(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Lj$/util/stream/L3;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
