.class final Lj$/util/stream/D3;
.super Lj$/util/stream/F3;

# interfaces
.implements Lj$/util/B;
.implements Lj$/util/function/m;


# instance fields
.field e:I


# direct methods
.method constructor <init>(Lj$/util/B;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/F3;-><init>(Lj$/util/F;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/B;Lj$/util/stream/D3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/F3;-><init>(Lj$/util/F;Lj$/util/stream/F3;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->r(Lj$/util/B;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lj$/util/stream/D3;->e:I

    return-void
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->d(Lj$/util/B;Lj$/util/function/Consumer;)V

    return-void
.end method

.method protected o(Lj$/util/H;)Lj$/util/H;
    .locals 1

    check-cast p1, Lj$/util/B;

    .line 1
    new-instance v0, Lj$/util/stream/D3;

    invoke-direct {v0, p1, p0}, Lj$/util/stream/D3;-><init>(Lj$/util/B;Lj$/util/stream/D3;)V

    return-object v0
.end method

.method protected s(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lj$/util/function/m;

    .line 1
    iget v0, p0, Lj$/util/stream/D3;->e:I

    invoke-interface {p1, v0}, Lj$/util/function/m;->d(I)V

    return-void
.end method

.method protected t(I)Lj$/util/stream/j3;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/h3;

    invoke-direct {v0, p1}, Lj$/util/stream/h3;-><init>(I)V

    return-object v0
.end method
