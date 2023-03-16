.class final Lj$/util/stream/d1;
.super Lj$/util/stream/T2;

# interfaces
.implements Lj$/util/stream/J0;
.implements Lj$/util/stream/E0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/T2;-><init>()V

    return-void
.end method


# virtual methods
.method public B()Lj$/util/z;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/T2;->B()Lj$/util/z;

    move-result-object v0

    return-object v0
.end method

.method public synthetic C(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->B(Lj$/util/stream/n2;Ljava/lang/Double;)V

    return-void
.end method

.method public synthetic D([Ljava/lang/Double;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/D0;->H(Lj$/util/stream/J0;[Ljava/lang/Double;I)V

    return-void
.end method

.method public synthetic E(JJLj$/util/function/n;)Lj$/util/stream/J0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/D0;->N(Lj$/util/stream/J0;JJ)Lj$/util/stream/J0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lj$/util/stream/d1;->C(Ljava/lang/Double;)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public b()Lj$/util/stream/J0;
    .locals 0

    return-object p0
.end method

.method public b()Lj$/util/stream/P0;
    .locals 0

    return-object p0
.end method

.method public c(D)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj$/util/stream/T2;->c(D)V

    return-void
.end method

.method public synthetic d(I)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->E()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic e(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->F()V

    const/4 p1, 0x0

    throw p1
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
    invoke-virtual {p0, p1}, Lj$/util/stream/d1;->f(I)Lj$/util/stream/O0;

    const/4 p1, 0x0

    throw p1
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i(Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, [D

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

    check-cast v0, [D

    return-object v0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj$/util/function/h;

    .line 1
    invoke-super {p0, p1}, Lj$/util/stream/Z2;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic m([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/d1;->D([Ljava/lang/Double;I)V

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
    invoke-virtual/range {p0 .. p5}, Lj$/util/stream/d1;->E(JJLj$/util/function/n;)Lj$/util/stream/J0;

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
    invoke-super {p0}, Lj$/util/stream/T2;->B()Lj$/util/z;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Lj$/util/H;
    .locals 1

    .line 2
    invoke-super {p0}, Lj$/util/stream/T2;->B()Lj$/util/z;

    move-result-object v0

    return-object v0
.end method
