.class Lj$/util/stream/g0;
.super Lj$/util/stream/j0;


# direct methods
.method constructor <init>(Lj$/util/H;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/j0;-><init>(Lj$/util/H;IZ)V

    return-void
.end method


# virtual methods
.method final U0()Z
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method final V0(ILj$/util/stream/q2;)Lj$/util/stream/q2;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public i(Lj$/util/function/m;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->X0()Lj$/util/H;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/j0;->Z0(Lj$/util/H;)Lj$/util/B;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/B;->m(Lj$/util/function/m;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj$/util/stream/j0;->i(Lj$/util/function/m;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic parallel()Lj$/util/stream/l0;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    move-object v0, p0

    check-cast v0, Lj$/util/stream/l0;

    return-object v0
.end method

.method public bridge synthetic sequential()Lj$/util/stream/l0;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    move-object v0, p0

    check-cast v0, Lj$/util/stream/l0;

    return-object v0
.end method

.method public x(Lj$/util/function/m;)V
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->X0()Lj$/util/H;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/j0;->Z0(Lj$/util/H;)Lj$/util/B;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/B;->m(Lj$/util/function/m;)V

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/V;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/V;-><init>(Lj$/util/function/m;Z)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    :goto_0
    return-void
.end method
