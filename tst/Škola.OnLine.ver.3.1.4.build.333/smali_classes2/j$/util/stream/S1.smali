.class Lj$/util/stream/S1;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/Y1;
.implements Lj$/util/stream/o2;


# instance fields
.field private a:I

.field final synthetic b:I

.field final synthetic c:Lj$/util/function/k;


# direct methods
.method constructor <init>(ILj$/util/function/k;)V
    .locals 0

    iput p1, p0, Lj$/util/stream/S1;->b:I

    iput-object p2, p0, Lj$/util/stream/S1;->c:Lj$/util/function/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->C(Lj$/util/stream/o2;Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lj$/util/stream/S1;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(D)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->A()V

    const/4 p1, 0x0

    throw p1
.end method

.method public d(I)V
    .locals 2

    iget-object v0, p0, Lj$/util/stream/S1;->c:Lj$/util/function/k;

    iget v1, p0, Lj$/util/stream/S1;->a:I

    invoke-interface {v0, v1, p1}, Lj$/util/function/k;->i(II)I

    move-result p1

    iput p1, p0, Lj$/util/stream/S1;->a:I

    return-void
.end method

.method public synthetic e(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->F()V

    const/4 p1, 0x0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lj$/util/stream/S1;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic h()V
    .locals 0

    return-void
.end method

.method public j(J)V
    .locals 0

    iget p1, p0, Lj$/util/stream/S1;->b:I

    iput p1, p0, Lj$/util/stream/S1;->a:I

    return-void
.end method

.method public q(Lj$/util/stream/Y1;)V
    .locals 0

    check-cast p1, Lj$/util/stream/S1;

    .line 1
    iget p1, p1, Lj$/util/stream/S1;->a:I

    invoke-virtual {p0, p1}, Lj$/util/stream/S1;->d(I)V

    return-void
.end method

.method public synthetic r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
