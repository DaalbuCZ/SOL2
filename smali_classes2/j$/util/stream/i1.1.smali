.class abstract Lj$/util/stream/i1;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/P0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public count()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public f(I)Lj$/util/stream/P0;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public i(Ljava/lang/Object;I)V
    .locals 0

    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public synthetic n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lj$/util/function/n;)[Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lj$/util/function/n;->u(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    return-object p1
.end method

.method public synthetic p(JJLj$/util/function/n;)Lj$/util/stream/P0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lj$/util/stream/D0;->Q(Lj$/util/stream/P0;JJLj$/util/function/n;)Lj$/util/stream/P0;

    move-result-object p1

    return-object p1
.end method
