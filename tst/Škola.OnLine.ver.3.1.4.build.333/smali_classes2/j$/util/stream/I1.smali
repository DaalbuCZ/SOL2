.class Lj$/util/stream/I1;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/Y1;
.implements Lj$/util/stream/n2;


# instance fields
.field private a:D

.field final synthetic b:D

.field final synthetic c:Lj$/util/function/f;


# direct methods
.method constructor <init>(DLj$/util/function/f;)V
    .locals 0

    iput-wide p1, p0, Lj$/util/stream/I1;->b:D

    iput-object p3, p0, Lj$/util/stream/I1;->c:Lj$/util/function/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->B(Lj$/util/stream/n2;Ljava/lang/Double;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lj$/util/stream/I1;->a(Ljava/lang/Double;)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public c(D)V
    .locals 3

    iget-object v0, p0, Lj$/util/stream/I1;->c:Lj$/util/function/f;

    iget-wide v1, p0, Lj$/util/stream/I1;->a:D

    invoke-interface {v0, v1, v2, p1, p2}, Lj$/util/function/f;->l(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lj$/util/stream/I1;->a:D

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

.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-wide v0, p0, Lj$/util/stream/I1;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public synthetic h()V
    .locals 0

    return-void
.end method

.method public j(J)V
    .locals 0

    iget-wide p1, p0, Lj$/util/stream/I1;->b:D

    iput-wide p1, p0, Lj$/util/stream/I1;->a:D

    return-void
.end method

.method public q(Lj$/util/stream/Y1;)V
    .locals 2

    check-cast p1, Lj$/util/stream/I1;

    .line 1
    iget-wide v0, p1, Lj$/util/stream/I1;->a:D

    invoke-virtual {p0, v0, v1}, Lj$/util/stream/I1;->c(D)V

    return-void
.end method

.method public synthetic r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
