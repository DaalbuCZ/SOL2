.class final Lj$/util/stream/E3;
.super Lj$/util/stream/F3;

# interfaces
.implements Lj$/util/D;
.implements Lj$/util/function/r;


# instance fields
.field e:J


# direct methods
.method constructor <init>(Lj$/util/D;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/F3;-><init>(Lj$/util/F;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/D;Lj$/util/stream/E3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/F3;-><init>(Lj$/util/F;Lj$/util/stream/F3;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->s(Lj$/util/D;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public e(J)V
    .locals 0

    iput-wide p1, p0, Lj$/util/stream/E3;->e:J

    return-void
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->e(Lj$/util/D;Lj$/util/function/Consumer;)V

    return-void
.end method

.method protected o(Lj$/util/H;)Lj$/util/H;
    .locals 1

    check-cast p1, Lj$/util/D;

    .line 1
    new-instance v0, Lj$/util/stream/E3;

    invoke-direct {v0, p1, p0}, Lj$/util/stream/E3;-><init>(Lj$/util/D;Lj$/util/stream/E3;)V

    return-object v0
.end method

.method protected s(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lj$/util/function/r;

    .line 1
    iget-wide v0, p0, Lj$/util/stream/E3;->e:J

    invoke-interface {p1, v0, v1}, Lj$/util/function/r;->e(J)V

    return-void
.end method

.method protected t(I)Lj$/util/stream/j3;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/i3;

    invoke-direct {v0, p1}, Lj$/util/stream/i3;-><init>(I)V

    return-object v0
.end method
