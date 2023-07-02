.class Lj$/util/stream/f2;
.super Lj$/util/stream/i2;


# direct methods
.method constructor <init>(Lj$/util/H;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/i2;-><init>(Lj$/util/H;IZ)V

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

.method public a(Lj$/util/function/Consumer;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->X0()Lj$/util/H;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/H;->forEachRemaining(Lj$/util/function/Consumer;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj$/util/stream/i2;->a(Lj$/util/function/Consumer;)V

    :goto_0
    return-void
.end method

.method public d(Lj$/util/function/Consumer;)V
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->X0()Lj$/util/H;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/H;->forEachRemaining(Lj$/util/function/Consumer;)V

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v0, Lj$/util/stream/X;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/X;-><init>(Lj$/util/function/Consumer;Z)V

    .line 3
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->L0(Lj$/util/stream/L3;)Ljava/lang/Object;

    :goto_0
    return-void
.end method
