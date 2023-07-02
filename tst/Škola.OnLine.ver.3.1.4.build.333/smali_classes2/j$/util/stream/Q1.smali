.class Lj$/util/stream/Q1;
.super Lj$/util/stream/Z1;

# interfaces
.implements Lj$/util/stream/Y1;


# instance fields
.field final synthetic b:Lj$/util/function/A;

.field final synthetic c:Lj$/util/function/BiConsumer;

.field final synthetic d:Lj$/util/function/BiConsumer;


# direct methods
.method constructor <init>(Lj$/util/function/A;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/Q1;->b:Lj$/util/function/A;

    iput-object p2, p0, Lj$/util/stream/Q1;->c:Lj$/util/function/BiConsumer;

    iput-object p3, p0, Lj$/util/stream/Q1;->d:Lj$/util/function/BiConsumer;

    invoke-direct {p0}, Lj$/util/stream/Z1;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lj$/util/stream/Q1;->c:Lj$/util/function/BiConsumer;

    iget-object v1, p0, Lj$/util/stream/Z1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Lj$/util/function/BiConsumer;->n(Ljava/lang/Object;Ljava/lang/Object;)V

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

.method public synthetic h()V
    .locals 0

    return-void
.end method

.method public j(J)V
    .locals 0

    iget-object p1, p0, Lj$/util/stream/Q1;->b:Lj$/util/function/A;

    invoke-interface {p1}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj$/util/stream/Z1;->a:Ljava/lang/Object;

    return-void
.end method

.method public q(Lj$/util/stream/Y1;)V
    .locals 2

    check-cast p1, Lj$/util/stream/Q1;

    .line 1
    iget-object v0, p0, Lj$/util/stream/Q1;->d:Lj$/util/function/BiConsumer;

    iget-object v1, p0, Lj$/util/stream/Z1;->a:Ljava/lang/Object;

    iget-object p1, p1, Lj$/util/stream/Z1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Lj$/util/function/BiConsumer;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
