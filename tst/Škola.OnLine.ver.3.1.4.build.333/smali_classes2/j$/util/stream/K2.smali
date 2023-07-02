.class final Lj$/util/stream/K2;
.super Lj$/util/stream/q0;


# direct methods
.method constructor <init>(Lj$/util/stream/c;)V
    .locals 2

    sget v0, Lj$/util/stream/e3;->q:I

    sget v1, Lj$/util/stream/e3;->o:I

    or-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-direct {p0, p1, v1, v0}, Lj$/util/stream/q0;-><init>(Lj$/util/stream/c;II)V

    return-void
.end method


# virtual methods
.method public S0(Lj$/util/stream/D0;Lj$/util/H;Lj$/util/function/n;)Lj$/util/stream/P0;
    .locals 2

    sget-object v0, Lj$/util/stream/e3;->SORTED:Lj$/util/stream/e3;

    invoke-virtual {p1}, Lj$/util/stream/D0;->r0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, p3}, Lj$/util/stream/D0;->j0(Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0, p3}, Lj$/util/stream/D0;->j0(Lj$/util/H;ZLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    check-cast p1, Lj$/util/stream/N0;

    invoke-interface {p1}, Lj$/util/stream/O0;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    .line 1
    new-instance p2, Lj$/util/stream/t1;

    invoke-direct {p2, p1}, Lj$/util/stream/t1;-><init>([J)V

    return-object p2
.end method

.method public V0(ILj$/util/stream/q2;)Lj$/util/stream/q2;
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    sget-object v0, Lj$/util/stream/e3;->SORTED:Lj$/util/stream/e3;

    invoke-virtual {v0, p1}, Lj$/util/stream/e3;->g(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    sget-object v0, Lj$/util/stream/e3;->SIZED:Lj$/util/stream/e3;

    invoke-virtual {v0, p1}, Lj$/util/stream/e3;->g(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lj$/util/stream/P2;

    invoke-direct {p1, p2}, Lj$/util/stream/P2;-><init>(Lj$/util/stream/q2;)V

    return-object p1

    :cond_1
    new-instance p1, Lj$/util/stream/H2;

    invoke-direct {p1, p2}, Lj$/util/stream/H2;-><init>(Lj$/util/stream/q2;)V

    return-object p1
.end method
