.class Lj$/util/stream/W2;
.super Lj$/util/stream/Y2;

# interfaces
.implements Lj$/util/D;


# instance fields
.field final synthetic g:Lj$/util/stream/X2;


# direct methods
.method constructor <init>(Lj$/util/stream/X2;IIII)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/W2;->g:Lj$/util/stream/X2;

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/Y2;-><init>(Lj$/util/stream/Z2;IIII)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->s(Lj$/util/D;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method b(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 2

    check-cast p1, [J

    check-cast p3, Lj$/util/function/r;

    .line 1
    aget-wide v0, p1, p2

    invoke-interface {p3, v0, v1}, Lj$/util/function/r;->e(J)V

    return-void
.end method

.method c(Ljava/lang/Object;II)Lj$/util/F;
    .locals 1

    check-cast p1, [J

    add-int/2addr p3, p2

    const/16 v0, 0x410

    .line 1
    invoke-static {p1, p2, p3, v0}, Lj$/util/W;->l([JIII)Lj$/util/D;

    move-result-object p1

    return-object p1
.end method

.method d(IIII)Lj$/util/F;
    .locals 7

    .line 1
    new-instance v6, Lj$/util/stream/W2;

    iget-object v1, p0, Lj$/util/stream/W2;->g:Lj$/util/stream/X2;

    move-object v0, v6

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/W2;-><init>(Lj$/util/stream/X2;IIII)V

    return-object v6
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->e(Lj$/util/D;Lj$/util/function/Consumer;)V

    return-void
.end method
