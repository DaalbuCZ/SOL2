.class Lj$/util/stream/U2;
.super Lj$/util/stream/Y2;

# interfaces
.implements Lj$/util/B;


# instance fields
.field final synthetic g:Lj$/util/stream/V2;


# direct methods
.method constructor <init>(Lj$/util/stream/V2;IIII)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/U2;->g:Lj$/util/stream/V2;

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/Y2;-><init>(Lj$/util/stream/Z2;IIII)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->r(Lj$/util/B;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method b(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, [I

    check-cast p3, Lj$/util/function/m;

    .line 1
    aget p1, p1, p2

    invoke-interface {p3, p1}, Lj$/util/function/m;->d(I)V

    return-void
.end method

.method c(Ljava/lang/Object;II)Lj$/util/F;
    .locals 1

    check-cast p1, [I

    add-int/2addr p3, p2

    const/16 v0, 0x410

    .line 1
    invoke-static {p1, p2, p3, v0}, Lj$/util/W;->k([IIII)Lj$/util/B;

    move-result-object p1

    return-object p1
.end method

.method d(IIII)Lj$/util/F;
    .locals 7

    .line 1
    new-instance v6, Lj$/util/stream/U2;

    iget-object v1, p0, Lj$/util/stream/U2;->g:Lj$/util/stream/V2;

    move-object v0, v6

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/U2;-><init>(Lj$/util/stream/V2;IIII)V

    return-object v6
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->d(Lj$/util/B;Lj$/util/function/Consumer;)V

    return-void
.end method
