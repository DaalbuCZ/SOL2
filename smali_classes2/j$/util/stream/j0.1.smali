.class abstract Lj$/util/stream/j0;
.super Lj$/util/stream/c;

# interfaces
.implements Lj$/util/stream/l0;


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

.method static synthetic Z0(Lj$/util/H;)Lj$/util/B;
    .locals 0

    invoke-static {p0}, Lj$/util/stream/j0;->a1(Lj$/util/H;)Lj$/util/B;

    move-result-object p0

    return-object p0
.end method

.method private static a1(Lj$/util/H;)Lj$/util/B;
    .locals 1

    instance-of v0, p0, Lj$/util/B;

    if-eqz v0, :cond_0

    check-cast p0, Lj$/util/B;

    return-object p0

    :cond_0
    sget-boolean p0, Lj$/util/stream/O3;->a:Z

    if-eqz p0, :cond_1

    const-class p0, Lj$/util/stream/c;

    const-string v0, "using IntStream.adapt(Spliterator<Integer> s)"

    invoke-static {p0, v0}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "IntStream.adapt(Spliterator<Integer> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method final C0(JLj$/util/function/n;)Lj$/util/stream/H0;
    .locals 0

    invoke-static {p1, p2}, Lj$/util/stream/D0;->s0(J)Lj$/util/stream/F0;

    move-result-object p1

    return-object p1
.end method

.method final N0(Lj$/util/stream/D0;Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/D0;->b0(Lj$/util/stream/D0;Lj$/util/H;Z)Lj$/util/stream/L0;

    move-result-object p1

    return-object p1
.end method

.method final O0(Lj$/util/H;Lj$/util/stream/q2;)V
    .locals 2

    invoke-static {p1}, Lj$/util/stream/j0;->a1(Lj$/util/H;)Lj$/util/B;

    move-result-object p1

    .line 1
    instance-of v0, p2, Lj$/util/function/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj$/util/function/m;

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/O3;->a:Z

    if-nez v0, :cond_3

    new-instance v0, Lj$/util/stream/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lj$/util/stream/c0;-><init>(Ljava/lang/Object;I)V

    .line 2
    :cond_1
    :goto_0
    invoke-interface {p2}, Lj$/util/stream/q2;->r()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Lj$/util/B;->i(Lj$/util/function/m;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_2
    return-void

    .line 3
    :cond_3
    const-class p1, Lj$/util/stream/c;

    const-string p2, "using IntStream.adapt(Sink<Integer> s)"

    invoke-static {p1, p2}, Lj$/util/stream/O3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method final P0()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method final Y0(Lj$/util/stream/D0;Lj$/util/function/A;Z)Lj$/util/H;
    .locals 1

    new-instance v0, Lj$/util/stream/q3;

    invoke-direct {v0, p1, p2, p3}, Lj$/util/stream/q3;-><init>(Lj$/util/stream/D0;Lj$/util/function/A;Z)V

    return-object v0
.end method

.method public final b1(Lj$/util/function/A;Lj$/util/function/v;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 6

    new-instance v2, Lj$/util/stream/u;

    const/4 v0, 0x1

    invoke-direct {v2, p3, v0}, Lj$/util/stream/u;-><init>(Lj$/util/function/BiConsumer;I)V

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance p3, Lj$/util/stream/F1;

    const/4 v1, 0x2

    const/4 v5, 0x4

    move-object v0, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/F1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 3
    invoke-virtual {p0, p3}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c1(Lj$/util/function/o;)Lj$/util/stream/u0;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/A;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v4, v0, v1

    const/4 v3, 0x2

    const/4 v6, 0x1

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final d1(Lj$/util/function/n;)Lj$/util/stream/Stream;
    .locals 8

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v7, Lj$/util/stream/y;

    sget v0, Lj$/util/stream/e3;->p:I

    sget v1, Lj$/util/stream/e3;->n:I

    or-int v4, v0, v1

    const/4 v3, 0x2

    const/4 v6, 0x1

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lj$/util/stream/y;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;IILjava/lang/Object;I)V

    return-object v7
.end method

.method public final e1(Lj$/util/function/k;)Lj$/util/m;
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/J1;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, v1}, Lj$/util/stream/J1;-><init>(ILjava/lang/Object;I)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/m;

    return-object p1
.end method

.method public final f1()Lj$/util/B;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/c;->spliterator()Lj$/util/H;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/j0;->a1(Lj$/util/H;)Lj$/util/B;

    move-result-object v0

    return-object v0
.end method

.method public i(Lj$/util/function/m;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/V;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj$/util/stream/V;-><init>(Lj$/util/function/m;Z)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lj$/util/stream/j0;->f1()Lj$/util/B;

    move-result-object v0

    invoke-static {v0}, Lj$/util/W;->g(Lj$/util/B;)Lj$/util/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic spliterator()Lj$/util/H;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/j0;->f1()Lj$/util/B;

    move-result-object v0

    return-object v0
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
    new-instance v0, Lj$/util/stream/f0;

    const/4 v1, 0x2

    sget v2, Lj$/util/stream/e3;->r:I

    invoke-direct {v0, p0, p0, v1, v2}, Lj$/util/stream/f0;-><init>(Lj$/util/stream/j0;Lj$/util/stream/c;II)V

    :goto_0
    return-object v0
.end method

.method public x(Lj$/util/function/m;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/V;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/V;-><init>(Lj$/util/function/m;Z)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    return-void
.end method
