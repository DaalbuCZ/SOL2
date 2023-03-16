.class final Lj$/util/stream/e1;
.super Lj$/util/stream/i1;

# interfaces
.implements Lj$/util/stream/J0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/i1;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->K(Lj$/util/stream/J0;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic b([Ljava/lang/Double;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/D0;->H(Lj$/util/stream/J0;[Ljava/lang/Double;I)V

    return-void
.end method

.method public synthetic c(JJLj$/util/function/n;)Lj$/util/stream/J0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/D0;->N(Lj$/util/stream/J0;JJ)Lj$/util/stream/J0;

    move-result-object p1

    return-object p1
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
    invoke-virtual {p0, p1}, Lj$/util/stream/e1;->f(I)Lj$/util/stream/O0;

    const/4 p1, 0x0

    throw p1
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lj$/util/stream/D0;->W()[D

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic m([Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/e1;->b([Ljava/lang/Double;I)V

    return-void
.end method

.method public bridge synthetic p(JJLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lj$/util/stream/e1;->c(JJLj$/util/function/n;)Lj$/util/stream/J0;

    move-result-object p1

    return-object p1
.end method

.method public spliterator()Lj$/util/F;
    .locals 1

    .line 1
    invoke-static {}, Lj$/util/W;->b()Lj$/util/z;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Lj$/util/H;
    .locals 1

    .line 2
    invoke-static {}, Lj$/util/W;->b()Lj$/util/z;

    move-result-object v0

    return-object v0
.end method
