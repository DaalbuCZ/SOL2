.class final Lj$/util/stream/v1;
.super Lj$/util/stream/X2;

# interfaces
.implements Lj$/util/stream/N0;
.implements Lj$/util/stream/G0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/X2;-><init>()V

    return-void
.end method


# virtual methods
.method public B()Lj$/util/D;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/X2;->B()Lj$/util/D;

    move-result-object v0

    return-object v0
.end method

.method public synthetic C(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->D(Lj$/util/stream/p2;Ljava/lang/Long;)V

    return-void
.end method

.method public synthetic D([Ljava/lang/Long;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/D0;->J(Lj$/util/stream/N0;[Ljava/lang/Long;I)V

    return-void
.end method

.method public synthetic E(JJLj$/util/function/n;)Lj$/util/stream/N0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/D0;->P(Lj$/util/stream/N0;JJ)Lj$/util/stream/N0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lj$/util/stream/v1;->C(Ljava/lang/Long;)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public b()Lj$/util/stream/N0;
    .locals 0

    return-object p0
.end method

.method public b()Lj$/util/stream/P0;
    .locals 0

    return-object p0
.end method

.method public synthetic c(D)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->A()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic d(I)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->E()V

    const/4 p1, 0x0

    throw p1
.end method

.method public e(J)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj$/util/stream/X2;->e(J)V

    return-void
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
    invoke-virtual {p0, p1}, Lj$/util/stream/v1;->f(I)Lj$/util/stream/O0;

    const/4 p1, 0x0

    throw p1
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, [J

    .line 1
    invoke-super {p0, p1, p2}, Lj$/util/stream/Z2;->i(Ljava/lang/Object;I)V

    return-void
.end method

.method public j(J)V
    .locals 0

    invoke-virtual {p0}, Lj$/util/stream/Z2;->clear()V

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/Z2;->x(J)V

    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Lj$/util/stream/Z2;->k()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj$/util/function/r;

    .line 1
    invoke-super {p0, p1}, Lj$/util/stream/Z2;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic m([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/v1;->D([Ljava/lang/Long;I)V

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
    invoke-virtual/range {p0 .. p5}, Lj$/util/stream/v1;->E(JJLj$/util/function/n;)Lj$/util/stream/N0;

    move-result-object p1

    return-object p1
.end method

.method public synthetic r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public spliterator()Lj$/util/F;
    .locals 1

    .line 1
    invoke-super {p0}, Lj$/util/stream/X2;->B()Lj$/util/D;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Lj$/util/H;
    .locals 1

    .line 2
    invoke-super {p0}, Lj$/util/stream/X2;->B()Lj$/util/D;

    move-result-object v0

    return-object v0
.end method
