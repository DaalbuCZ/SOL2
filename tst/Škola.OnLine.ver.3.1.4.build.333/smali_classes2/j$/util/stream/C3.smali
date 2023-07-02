.class final Lj$/util/stream/C3;
.super Lj$/util/stream/F3;

# interfaces
.implements Lj$/util/z;
.implements Lj$/util/function/h;


# instance fields
.field e:D


# direct methods
.method constructor <init>(Lj$/util/z;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/F3;-><init>(Lj$/util/F;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/z;Lj$/util/stream/C3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/F3;-><init>(Lj$/util/F;Lj$/util/stream/F3;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->q(Lj$/util/z;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public c(D)V
    .locals 0

    iput-wide p1, p0, Lj$/util/stream/C3;->e:D

    return-void
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->c(Lj$/util/z;Lj$/util/function/Consumer;)V

    return-void
.end method

.method protected o(Lj$/util/H;)Lj$/util/H;
    .locals 1

    check-cast p1, Lj$/util/z;

    .line 1
    new-instance v0, Lj$/util/stream/C3;

    invoke-direct {v0, p1, p0}, Lj$/util/stream/C3;-><init>(Lj$/util/z;Lj$/util/stream/C3;)V

    return-object v0
.end method

.method protected s(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lj$/util/function/h;

    .line 1
    iget-wide v0, p0, Lj$/util/stream/C3;->e:D

    invoke-interface {p1, v0, v1}, Lj$/util/function/h;->c(D)V

    return-void
.end method

.method protected t(I)Lj$/util/stream/j3;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/g3;

    invoke-direct {v0, p1}, Lj$/util/stream/g3;-><init>(I)V

    return-object v0
.end method
